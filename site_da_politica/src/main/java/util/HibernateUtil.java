/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

<<<<<<< HEAD:site_da_politica/src/main/java/br/edu/iff/site_da_politica/util/HibernateUtil.java
import br.edu.iff.site_da_politica.Publicacao;
import br.edu.iff.site_da_politica.UsuarioAdm;
import br.edu.iff.site_da_politica.UsuarioComum;
import br.edu.iff.site_da_politica.UsuarioPolitico;
=======
import usuarios.UsuarioComum;
import servlet.Login;
>>>>>>> df0acdc73b84147246255e9eaf74895c5e451648:site_da_politica/src/main/java/util/HibernateUtil.java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

//    private static final SessionFactory sessionFactory;
//    static {
//        try {
//            sessionFactory = new AnnotationConfiguration()
//                    .configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            // Log exception!
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//
//    public static Session getSession()
//            throws HibernateException {
//        return sessionFactory.openSession();
//    }
    
    private static SessionFactory factory;

    static {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        cfg.addAnnotatedClass(UsuarioComum.class);
        cfg.addAnnotatedClass(UsuarioAdm.class);
        cfg.addAnnotatedClass(UsuarioPolitico.class);
        cfg.addAnnotatedClass(Publicacao.class);
        factory = cfg.buildSessionFactory();
    }

    public static Session getSession() {
        return factory.openSession();
    }
}