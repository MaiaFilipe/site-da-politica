/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import funcoes.Publicacao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
/**
 *
 * @author aluno
 */
public class PublicacaoControl {
     //Função de apagar um usuario
    public static boolean deletar(Publicacao publicacao){
        try{
            Session sessionRecheio;
            sessionRecheio = HibernateUtil.getSession();
            Transaction tr = sessionRecheio.beginTransaction();
            sessionRecheio.delete(publicacao);
            tr.commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
}
