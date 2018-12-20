package br.edu.iff.site_da_politica;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 *
 * @author aluno
 */
public class NewHibernateUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INICIANDO O HIBERNATE");
        Session sessao = SessaoHibernate.nova();
        
        System.out.println("CRIANDO O USUARIO");
        Usuario_Politico usuario = new Usuario_Politico();
        usuario.setNomeUsuarioPolitico("zéeee");
        usuario.setNumeroCpf(123);
        usuario.setDescricaoEmail("abc@def.com");
        usuario.setDescricaoUsuarioPolitico("sou corrupto");
        usuario.setSenha("********");
        usuario.setNickPolitico("@bla");
        usuario.setDescricaoPosicaoPolitica("Direita");
        
        System.out.println("SALVANDO USUARIO");
        Transaction tx = sessao.beginTransaction();
        sessao.save(usuario);
        tx.commit();
        System.out.println("USUARIO SALVO");
        sessao.close();
        System.out.println("SESSAO FECHADA");
    }
    
    private static final SessionFactory concreteSessionFactory;

    static {
        try {
            concreteSessionFactory = new AnnotationConfiguration()
                    .configure()
                    .addAnnotatedClass(Usuario_Politico.class)
                    .buildSessionFactory();
        } catch (HibernateException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession()
            throws HibernateException {
        return concreteSessionFactory.openSession();
    }
}