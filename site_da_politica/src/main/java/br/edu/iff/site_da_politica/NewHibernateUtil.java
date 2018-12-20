package br.edu.iff.site_da_politica;

import org.hibernate.Session;
import org.hibernate.Transaction;


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
        usuario.setNomeUsuarioPolitico("zé");
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
}