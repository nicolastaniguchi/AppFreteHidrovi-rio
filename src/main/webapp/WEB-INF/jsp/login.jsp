<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>App Frete Hidrovi�rio - Login</title>
</head>
<body>

	<div class="container">

		<h3>Login</h3>
		
		<c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				<strong>Aten��o!</strong> ${mensagem}
			</div>
		</c:if>
		
		<form action="/login" method="post">

			<div class="form-group">
				<label>E-mail:</label> <input type="email" name="email"
					value="nicolas@email.com" placeholder="Digite o seu email"
					class="form-control">
			</div>

			<div class="form-group">
				<label>Senha:</label> <input type="password" name="senha"
					value="nicolas@email.com" placeholder="Digite a sua senha"
					class="form-control">
			</div>

			<button type="submit" class="btn btn-default">Acessar</button>

		</form>
	</div>

</body>
</html>