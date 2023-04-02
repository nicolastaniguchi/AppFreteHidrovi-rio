<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Cliente</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">
		<form action="/cliente/incluir" method="post">
			<h3>Cadastro de Cliente</h3>

			<div class="form-group">
				<label>Nome:</label> <input type="text" name="nome"
					value="Nicolas Taniguchi" class="form-control">
			</div>

			<div class="form-group">
				<label>CPF:</label> <input type="number" name="cpf"
					value="12345688855" class="form-control">
			</div>

			<div class="form-group">
				<label>E-mail:</label> <input type="email" name="email"
					value="nicolas@hotmail.com" class="form-control">
			</div>
			
			<c:import url="/WEB-INF/jsp/endereco/cadastro.jsp" />

			<button type="submit">Cadastrar</button>

		</form>
	</div>

</body>
</html>