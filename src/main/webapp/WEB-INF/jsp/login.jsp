<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
	<title>App Frete Hidroviário - Login</title>
</head>
<body>

	<div class="container">
	
		<h3>Login</h3>
		
		<form action="/login" method="post">

		<div class="form-group">
		<label>E-mail:</label>
		<input type="email" name="email" value="nicolas@email.com" placeholder="Digite o seu email" class="form-control">
		</div>
		
		<div class="form-group">
		<label>Senha:</label>
		<input type="password" name="senha" value="123456" placeholder="Digite a sua senha" class="form-control">
		</div>

		<button type="submit" class="btn btn-default">Acessar</button>
		
		</form>
	</div>

</body>
</html>