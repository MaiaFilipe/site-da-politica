<%-- 
    Document   : listar
    Created on : 18/09/2019, 12:08:27
    Author     : aluno
--%>

<%@page import="pacotin.UsuarioControle"%>
<%@page import="java.util.List"%>
<%@page import="br.edu.iff.site_da_politica.UsuarioComum"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <h1>Lista dos usuários</h1>
        <%
            List<UsuarioComum> lista = UsuarioControle.listar();
            request.setAttribute( "usuarios", lista );
        %>
        <display:table name="usuarios">
            <display:column property="id" title="ID" paramProperty="checkbox"/>
            <display:column property="nome" title="Nome Completo"/>
            <display:column property="senha" title="Senha"/>
            <display:column value="alterar" title="Alterar" href="alterar.jsp" paramId="pid" paramProperty="id" />             
            <display:column value="deletar" title="Deletar" autolink="true"  paramId="pid" paramProperty="id" href="${pageContext.request.contextPath}/UsuarioServletD"/>
            <display:setProperty name="basic.msg.empty_list" value="Sem usuarios" />
        </display:table>
        <br><br>
        <a href="alterar.jsp?pid=" >Criar novo usuario</a>
    </body>
</html>