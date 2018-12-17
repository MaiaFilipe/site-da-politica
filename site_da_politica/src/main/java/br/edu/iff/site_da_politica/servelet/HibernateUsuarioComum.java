package br.edu.iff.site_da_politica.servelet;

import br.edu.iff.site_da_politica.Usuario_Comum;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUsuarioComum {
    
    public static void main(String... args) {
        Session session = getSession();
        Transaction tr = session.beginTransaction();
        Usuario_Comum user = (Usuario_Comum) session.get(Usuario_Comum.class, new Integer(1));
        if (user == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println("Nome: "+user.getNomeUsuarioComum());
        }
        
        Usuario_Comum usuario = new Usuario_Comum();
        usuario.setDescricaoEmail("abc@def.com");
        usuario.setDescricaoUsuarioComum("Sei mais do que você");
        usuario.setNumero(996162642);
        usuario.setNumeroCpf(00000000000);
        usuario.setSenha("********");
        usuario.setDescricaoPosicao("Centro");
        usuario.setNomeUsuarioComum("João");
        usuario.setNickNameUsuarioComum("@João");
        usuario.setDataNascimento(25032002);
        
         session.save(usuario);
        tr.commit();
        
        session.close();
    }

    private static final SessionFactory concreteSessionFactory;

    static {
        try {
            concreteSessionFactory = new AnnotationConfiguration()
                    .configure()
                    .addAnnotatedClass(Usuario_Comum.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession()
            throws HibernateException {
        return concreteSessionFactory.openSession();
    }

}