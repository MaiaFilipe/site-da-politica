
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.site_da_politica;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
public class UsuarioAdmServlet extends HttpServlet {

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
            out.println("<title>Servlet UsuarioAdmServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioAdmServlet at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
        UsuarioAdm usuarioa = new UsuarioAdm();
        usuarioa.setCodigoUsuarioAdm(Integer.getInteger(request.getParameter("cd_usuario_adm")));
        usuarioa.setDescricaoEmail(request.getParameter("ds_email"));
        usuarioa.setDescricaoUsuarioAdm(request.getParameter("ds_usuario_adm"));
        usuarioa.setNumeroCpf(Integer.getInteger(request.getParameter("nr_cpf")));
        usuarioa.setNumero(Integer.getInteger(request.getParameter("nr_numero")));
        usuarioa.setSenha(request.getParameter("nm_senha"));
        usuarioa.setDescricaoPosicao(request.getParameter("ds_posicao_politica"));
        usuarioa.setNomeUsuarioAdm(request.getParameter("nm_usuario_adm"));
        usuarioa.setNickUsuarioAdm(request.getParameter("nm_nick_name_adm"));

        String dataForm = request.getParameter("dt_nascimento");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNasc = null;
        try {
            dataNasc = sdf.parse(dataForm);
        } catch (ParseException ex) {
            //ex.printStackTrace();
            Logger.getLogger(UsuarioAdmServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        usuarioa.setDataNascimento(dataNasc);

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
