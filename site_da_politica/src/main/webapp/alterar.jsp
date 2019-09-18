<%-- 
    Document   : alterar
    Created on : 18/09/2019, 12:20:25
    Author     : aluno
--%>

<%@page import="br.edu.iff.site_da_politica.UsuarioComum"%>
<%@page import="pacotin.UsuarioControle"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crud</title>
    </head>
    <body>
        <h1>Leitura e alteração!</h1>
        <%
        //Criar variaveis
        UsuarioComum usuario = new UsuarioComum();
        String nome = "";
        String senha = "";
        //Captura id (se alteração)
        String idUsuario = request.getParameter("pid");
        
        //Localiza usuario (se alteração)
        if(!idUsuario.isEmpty()){
            usuario = UsuarioControle.buscar(Integer.parseInt(idUsuario));
            nome = usuario.getNmUsuarioComum();
            senha = usuario.getNmSenha();            
        }
        else{
            idUsuario = "";
        }
        
        %>
        <form method="POST" action="UsuarioServletSA">
            <div hidden>
                ID<input type="text" name="pid" value="<%=idUsuario%>">
            </div>
            Nome<input type="text" name="nome" value="<%=nome%>">
            Senha<input type="text" name="senha" value="<%=senha%>">
            <input type="submit">
        </form>
    </body>
</html>