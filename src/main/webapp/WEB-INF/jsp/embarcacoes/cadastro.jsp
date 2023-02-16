<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Embarcações</title>
</head>
<body>
		<div class="container">
		<form action="usuario" method="post">
		<h3>Cadastro de Embarcações</h3>
		
		<div class="form-group">
		<label>Nome:</label>
		<input type="text" name="nome" value="Nicolas Taniguchi" class="form-control">
		</div>
		
		<div class="form-group">
		<label>Senha:</label>
		<input type="password" name="senha" value="123456" class="form-control">
		</div>
		
		<div class="form-group">
		<label>E-mail:</label>
		<input type="email" name="email" value="nicolas@hotmail.com" class="form-control">
		</div>
		
		<button type="submit">Cadastrar</button>
		
		</form>
	</div>
	

</body>
</html>