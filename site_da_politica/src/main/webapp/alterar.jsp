<%@page import="br.edu.iff.site_da_politica.pacotin.UsuarioControle"%>
<%@page import="br.edu.iff.site_da_politica.UsuarioComum"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.Transaction"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:directive.page import="entidades.*" />
<jsp:directive.page import="java.util.*" />
<jsp:directive.page import="utilidades.HibernateUtil" />

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
        String idUsuarioComum = request.getParameter("pid");
        
        //Localiza usuario (se alteração)
        if(!idUsuarioComum.isEmpty()){
            usuario = UsuarioControle.buscar(Integer.parseInt(idUsuarioComum));
            nome = usuario.getNmUsuarioComum();
            senha = usuario.getNmSenha();            
        }
        else{
            idUsuarioComum = "";
        }
        
        %>
        <form method="POST" action="UsuarioServletSA">
            <div hidden>
                ID<input type="text" name="pid" value="<%=idUsuarioComum%>">
            </div>
            Nome<input type="text" name="nome" value="<%=nome%>">
            Senha<input type="text" name="senha" value="<%=senha%>">
            <input type="submit">
        </form>
    </body>
</html>