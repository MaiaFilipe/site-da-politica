/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import funcoes.Publicacao;
import usuarios.UsuarioPolitico;
import usuarios.UsuarioComum;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import usuarios.UsuarioAdm;

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
        //cfg.addAnnotatedClass(UsuarioAdm.class);
        //cfg.addAnnotatedClass(UsuarioPolitico.class);
        cfg.addAnnotatedClass(Publicacao.class);
        factory = cfg.buildSessionFactory();
    }

    public static Session getSession() {
        return factory.openSession();
    }
}