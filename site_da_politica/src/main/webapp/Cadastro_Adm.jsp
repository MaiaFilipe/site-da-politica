<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript" src="js/jquery-1.2.6.pack.js"></script>
	<script type="text/javascript" src="js/jquery.maskedinput-1.1.4.pack.js"/></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#cpf").mask("999.999.999-99");
		});
	</script>
	<meta charset="utf-8">
	<style>
 @import url('https://fonts.googleapis.com/css?family=Black+Ops+One');
</style>
	<link rel="stylesheet" type="text/css" href="Pagina_cadastro.css">
	<title>Cadastro</title>
</head>
<body>
	<body background=""> 
	<div id = block>
		<center><h1>Cadastro usuário político</h1></center>

		<div class="left">
			<form method = "post" action = "HibernateUsuarioPolitico">
				<label for="user_name">Usuário:</label><br>
				<input type="text" name="nm_nick_politico" id="user_name"><br><br>

				<label for="first_name">Nome:</label><br>
				<input type="text" name="nm_usuario_politico" id="first_name"><br><br>

				<!-- <label for="last_name">Sobrenome:</label><br>
				<input type="text" name="last_name" id="last_name"><br><br>
                                -->
                                
				<label for="email">Email:</label><br>
				<input type="text" name="ds_email" id="email"><br><br>

				<label for="password">Senha:</label><br>
				<input type="password" name="nm_senha" id="password"><br><br>

				<label for="cpf">Cpf:</label><br>
				<input type="cpf" name="nr_cpf" id="cpf" placeholder="Ex.: 000.000.000-00" maxlength="14" autocomplete="on"><br><br>

			</div>
			Data de nascimento: <input type="date" name = ""><br><br>
			Estado:<br>
			<select name="estado">
				<option value="AC">Acre (AC)</option>
				<option value="AL">Alagoas (AL)</option>
				<option value="AP">Amapá (AP)</option>
				<option value="AM">Amazonas (AM)</option>
				<option value="BA">Bahia (BA)</option>
				<option value="CE">Ceará (CE)</option>
				<option value="DF">Distrito Federal (DF)</option>
				<option value="ES">Espírito Santo (ES)</option>
				<option value="GO">Goiás (GO)</option>
				<option value="MA">Maranhão (MA)</option>
				<option value="MT">Mato Grosso (MT)</option>
				<option value="MS">Mato Grosso do Sul (MS)</option>
				<option value="MG">Minas Gerais (MG)</option>
				<option value="PA">Pará (PA)</option>
				<option value="PB">Paraíba (PB)</option>
				<option value="PR">Paraná (PR)</option>
				<option value="PE">Pernambuco (PE)</option>
				<option value="PI">Piauí (PI)</option>
				<option value="RJ">Rio de Janeiro (RJ)</option>
				<option value="RN">Rio Grande do Norte (RN)</option>
				<option value="RS">Rio Grande do Sul (RS)</option>
				<option value="RO">Rondônia (RO)</option>
				<option value="RR">Roraima (RR)</option>
				<option value="SC">Santa Catarina (SC)</option>
				<option value="SP">São Paulo (SP)</option>
				<option value="SE">Sergipe (SE)</option>
				<option value="TO">Tocantins (TO)</option>
			</select><br><br>
                        
                        Partido:<br>
                        <select name="partido">
				<option value="AC">Acre (AC)</option>
			</select><br><br>

			Posição política:<br>
			<select name="ds_posicao_politica">
				<option value="direita">Direita</option>
				<option value="esquerda">Esquerda</option>
				<option value="centro">Centro</option>
				<option value="semResposta">Prefiro não responder</option>
			</select><br><br>
			<input type="submit" value="Confirmar">
		</form>
	</div>
</body>
</html>