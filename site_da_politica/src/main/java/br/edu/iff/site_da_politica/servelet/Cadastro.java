
package br.edu.iff.site_da_politica.servelet;

import br.edu.iff.site_da_politica.SessaoHibernate;
import br.edu.iff.site_da_politica.Usuario_Comum;
import br.edu.iff.site_da_politica.Usuario_Politico;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author luizcanf
 */
public class Cadastro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("RECEBENDO O USUARIO DO FORM HTML");
        Usuario_Politico usuario = new Usuario_Politico();
        usuario.setNomeUsuarioPolitico(request.getParameter("nm_usuario_politico"));
        //usuario.setNumeroCpf(request.getParameter("nr_cpf"));
        usuario.setDescricaoEmail(request.getParameter("ds_email"));
        usuario.setSenha(request.getParameter("nm_senha"));
        usuario.setNickPolitico(request.getParameter("nm_nick_politico"));
        usuario.setDescricaoPosicaoPolitica(request.getParameter("ds_posicao_politica"));
        
        try {
        System.out.println("SALVANDO USUARIO");
        Session sessao = SessaoHibernate.nova();
        Transaction tx = sessao.beginTransaction();
        sessao.save(usuario);
        tx.commit();
        sessao.close();
        System.out.println("USUARIO SALVO");
        } catch (HibernateException ex) {
            response.sendRedirect("error.html");
        }
        // redirecionar p outra página
        response.sendRedirect("Cadastro_Comum.jsp");
    }

    /*
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario_Comum user = new Usuario_Comum();
        user.setNomeUsuarioComum(request.getParameter("nomeUsuarioComum"));
        user.setNomeUsuarioComum(request.getParameter("nomeUsuarioComum"));
        user.setDescricaoEmail(request.getParameter("descricaoEmail"));
        user.setSenha(request.getParameter("senha"));
        user.setNumeroCpf(request.getParameter("numeroCpf"));
        user.setDataNascimento(request.getParameter("dataNascimento"));
        user.setNomeEstado(request.getParameter("nomeEstado"));
        user.setDescricaoPosicao(request.getParameter("descricaoPosicao"));
        //todos os atributos SETados
        Session session = HibernateUsuarioComum.getSession();
        Transaction tr = session.beginTransaction();
        session.save(user);
        tr.commit();
        session.close();
        response.sendRedirect("cadastroOK.html");
        processRequest(request, response);
    }
    */
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
