package br.edu.iff.site_da_politica.servelet;


import br.edu.iff.site_da_politica.Usuario_Adm;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUsuarioAdm {

    private static final SessionFactory concreteSessionFactory;

    static {
        try {
            concreteSessionFactory = new AnnotationConfiguration()
                    .configure()
                    .addAnnotatedClass(Usuario_Adm.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession()
            throws HibernateException {
        return concreteSessionFactory.openSession();
    }

    public static void main(String... args) {
        Session session = getSession();
        Transaction tr = session.beginTransaction();
        Usuario_Adm user = (Usuario_Adm) session.get(Usuario_Adm.class, new Integer(1));
        if (user == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println("Nome: "+user.getNomeUsuarioAdm());
        }
        
        Usuario_Adm usuario = new Usuario_Adm();
        usuario.setDescricaoEmail("abc@def.com");
        usuario.setDescricaoUsuarioAdm("Se fazer doideria, vai ficar sem acesso");
        usuario.setNumero(999999999);
        usuario.setNumeroCpf(00000000000);
        usuario.setSenha("********");
        usuario.setDescricaoPosicao("Centro");
        usuario.setNomeUsuarioAdm("Rogê");
        usuario.setNickUsuarioAdm("@Mc");
        usuario.setDataNascimento(0000);
        
         session.save(usuario);
        tr.commit();
        
        session.close();
    }
}   