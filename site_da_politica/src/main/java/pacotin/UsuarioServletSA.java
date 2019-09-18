/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotin;

import br.edu.iff.site_da_politica.UsuarioComum;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
public class UsuarioServletSA extends HttpServlet{
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Captura parametros da tela
        String idtext = request.getParameter("pid");
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");

        //Cria instancia do usuario
        UsuarioComum usuario = new UsuarioComum();        
        //Detecta se é usuario novo ou antigo
        if(!idtext.isEmpty()){
            Integer id = Integer.parseInt(idtext);
            usuario.setCdUsuarioComum(id);
        }
        //Insere informações no objeto
        usuario.setNmUsuarioComum(nome);
        usuario.setNmSenha(senha);

        //Chama de funcao para salvar ou atualizar usuario
        UsuarioControle.salvar(usuario);
        
        //Redireciona pagina
        response.sendRedirect("index.html");
    }
    
}
