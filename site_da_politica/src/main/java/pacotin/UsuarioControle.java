package pacotin;

import br.edu.iff.site_da_politica.UsuarioComum;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.edu.iff.site_da_politica.util.HibernateUtil;

public class UsuarioControle {

    //Função de salvar/atualizar um usuario
    public static boolean salvar(UsuarioComum usuario){
        try{
            Session sessionRecheio;
            sessionRecheio = HibernateUtil.getSession();
            Transaction tr = sessionRecheio.beginTransaction();
            sessionRecheio.saveOrUpdate(usuario);
            tr.commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    //Localiza um usuario pelo id
    public static UsuarioComum buscar(Integer id)
    {
        String idUsuario = id.toString();
        Session sessionRecheio;
        sessionRecheio = HibernateUtil.getSession();
        Transaction tr = sessionRecheio.beginTransaction();
        String hql = "from UsuarioComum u where u.id='"+idUsuario+"'";
        UsuarioComum usuario = (UsuarioComum)sessionRecheio.createQuery(hql).uniqueResult();
        tr.commit();
        return usuario;
    }
    
    //Retorna todos os usuario do sistema
    public static List<UsuarioComum> listar()
    {
        Session sessionRecheio;
        sessionRecheio = HibernateUtil.getSession();
        Transaction tr = sessionRecheio.beginTransaction();
        String hql = "from UsuarioComum u";
        List<UsuarioComum> lista = (List)sessionRecheio.createQuery(hql).list();
        tr.commit();
        return lista;
    }
    
    //Função de apagar um usuario
    public static boolean deletar(UsuarioComum usuario){
        try{
            Session sessionRecheio;
            sessionRecheio = HibernateUtil.getSession();
            Transaction tr = sessionRecheio.beginTransaction();
            sessionRecheio.delete(usuario);
            tr.commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }    
}