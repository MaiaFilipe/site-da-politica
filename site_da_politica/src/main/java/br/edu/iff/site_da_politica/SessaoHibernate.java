/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.site_da_politica;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author aluno
 */
public class SessaoHibernate {

    private static final SessionFactory SF;
    static {
        Configuration cfg = new AnnotationConfiguration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Usuario_Politico.class);
        
        SF = cfg.buildSessionFactory();
    }
    public static Session nova() {
        Session session = SF.openSession();
        return session;

    }
}
