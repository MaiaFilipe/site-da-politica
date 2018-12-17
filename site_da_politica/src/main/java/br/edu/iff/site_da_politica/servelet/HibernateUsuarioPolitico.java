package br.edu.iff.site_da_politica.servelet;

import br.edu.iff.site_da_politica.Usuario_Politico;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUsuarioPolitico {
    
    public static void main(String... args) {
        Session session = getSession();
        Transaction tr = session.beginTransaction();
        Usuario_Politico user = (Usuario_Politico) session.get(Usuario_Politico.class, new Integer(1));
        if (user == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println("Nome: "+user.getNomeUsuarioPolitico());
        }
        
        Usuario_Politico usuario = new Usuario_Politico();
        usuario.setNomeUsuarioPolitico("zé");
        usuario.setNumeroCpf(123);
        usuario.setDescricaoEmail("abc@def.com");
        usuario.setDescricaoUsuarioPolitico("sou corrupto");
        usuario.setSenha("********");
        usuario.setNickPolitico("@bla");
        usuario.setDescricaoPosicaoPolitica("Direita");
        
         session.save(usuario);
        tr.commit();
        
        session.close();
    }

    private static final SessionFactory concreteSessionFactory;

    static {
        try {
            concreteSessionFactory = new AnnotationConfiguration()
                    .configure()
                    .addAnnotatedClass(Usuario_Politico.class)
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