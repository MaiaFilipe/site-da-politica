
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import servlet.PublicacaoServlet;
import usuarios.UsuarioComum;
import util.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import usuarios.UsuarioComum;

/**
 *
 * @author aluno
 */
public class UsuarioComumServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioComumServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioComumServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UsuarioComum usuarioc = new UsuarioComum();
        usuarioc.setDsEmail(request.getParameter("ds_email"));
        usuarioc.setDsUsuarioComum(request.getParameter("ds_usuario_comum"));
        usuarioc.setNmEstado(request.getParameter("nm_estado"));

        String num = request.getParameter("nr_numero");
        Long numero = Long.getLong(num);
        usuarioc.setNrNumero(numero);

        String cpfXaBlau = request.getParameter("nr_cpf");
        cpfXaBlau = cpfXaBlau.replaceAll("-", "");
        cpfXaBlau = cpfXaBlau.replaceAll("\\.", "");
        usuarioc.setNrCpf(Long.parseLong(cpfXaBlau));

        usuarioc.setNmSenha(request.getParameter("nm_senha"));
        usuarioc.setDsPosicao(request.getParameter("ds_posicao"));
        usuarioc.setNmUsuarioComum(request.getParameter("nm_usuario_comum"));
        usuarioc.setNmNickNameComum(request.getParameter("nm_nick_name_comum"));

        String datinha = request.getParameter("dt_nascimento");
        usuarioc.setDtNascimento(datinha);
        System.out.println("Data:" + datinha);

        // TODO corrigir a data
        /* String datazinha = request.getParameter("dt_data");
        SimpleDateFormat formatDt = new SimpleDateFormat("dd/MM/yyyy");
        Date data;
        try {
            data = formatDt.parse(datazinha);
        } catch (ParseException ex) {
            Logger.getLogger(PublicacaoServlet.class.getName()).log(Level.SEVERE, null, ex);
            data = new Date();
        }
        post.setDtData(data);*/
        Session sessionRecheio;
        sessionRecheio = HibernateUtil.getSession();
        Transaction tr = sessionRecheio.beginTransaction();
        sessionRecheio.saveOrUpdate(usuarioc);
        tr.commit();

        response.sendRedirect("index.html");
        processRequest(request, response);
    }

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
