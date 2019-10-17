<%-- 
    Document   : publicacao
    Created on : 17/10/2019, 18:13:41
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
    <head>
        <title>Publicação</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body class="is-preload">

        <!-- Wrapper -->
        <div id="wrapper">

            <!-- Main -->
            <div id="main">
                <div class="inner">

                    <!-- Header -->
                    <header id="header">
                        <a href="index.html" class="logo"><strong>Publicação completa</strong></a>
                        <ul class="icons">

                            <li><a href="Página Usuário.html" class="icon fa fa-user-circle-o"><span class="label">Perfil</span></a></li>
                            <li><a href="#" class="icon fa fa-bell-o"><span class="label">Notificações</span></a></li>
                            <li><a href="#" class="icon fa fa-ellipsis-v"><span class="label">Mais</span></a></li>
                        </ul>
                    </header>

                    <!-- Content -->
                    <section>
                        <section>
                            <header class="main">
                                <div class="left">
                                    <form method = "POST" action = "PublicacaoServlet" id = "form_publicacao" target="_self">
                                        <label for="titulo"> <h2> Título: <h2> </label><br>
                                                    <input type="text" name="titulo" id="titulo"><br><br>


                                                    </header>


                                                    <label for="avatar">Escolher imagem:</label>

                                                    <input type="file" id="" name="avatar" accept="image/png, image/jpeg" >





                                                    <p></p>
                                                    <p></p>


                                                    <label for="texto"> <h2> Texto: <h2> </label><br>
                                                                <input type="text" name="texto" id="texto"><br><br>
                                                                </div>
                                                                <input type="submit" value="Publicar">
                                                                </form>


                                                                </body>
                                                                </html>