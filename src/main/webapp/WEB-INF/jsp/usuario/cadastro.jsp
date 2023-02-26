<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>App Frete Hidroviário - Sing Up</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<form action="/usuario/incluir" method="post">
			<h3>Cadastro de Usuário</h3>

			<div class="form-group">
				<label>Nome:</label> <input type="text" name="nome" value="Nicolas"
					class="form-control">
			</div>

			<div class="form-group">
				<label>Senha:</label> <input type="password" name="senha"
					value="123456" class="form-control">
			</div>

			<div class="form-group">
				<label>E-mail:</label> <input type="email" name="email"
					value="nicolas@email.com" class="form-control">
			</div>

			<button type="submit" class="btn btn-primary">Cadastrar</button>

		</form>
	</div>
</body>
</html>