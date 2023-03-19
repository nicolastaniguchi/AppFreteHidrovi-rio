<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Cadastro - Empurrador</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />


	<div class="container">

		<form action="/empurrador/incluire" method="post">

			<h3>Cadastro de Empurrador</h3>

			<div class="form-group">
				<label>Nome da Embarcação:</label> <input type="text" name="nome"
					value="Yamato" class="form-control">
			</div>

			<div class="form-group">
				<label>Valor:</label> <input type="number" name="valor"
					value="1223445" class="form-control">
			</div>

			<div class="form-group">
				<label>Comprimento(m):</label> <input type="number"
					name="comprimento" value="80" class="form-control">
			</div>

			<div class="form-group">
				<label>Largura(m):</label> <input type="number" name="largura"
					value="20" class="form-control">
			</div>

			<div class="form-group">
				<label>Altura(m):</label> <input type="number" name="altura"
					value="2" class="form-control">
			</div>

			<label>Tripulação: </label>
			<div class="form-check">
				<input type="radio" class="form-check-input" id="radio1"
					name="tripulacao" value=true checked>Sim <label
					class="form-check-label" for="radio1"></label>
			</div>

			<div class="form-check">
				<input type="radio" class="form-check-input" id="radio2"
					name="tripulacao" value=false>Não <label
					class="form-check-label" for="radio2"></label>
			</div>

			<label>Rancho: </label>
			<div class="form-check">
				<input type="radio" class="form-check-input" id="radio1"
					name="rancho" value=true checked>Sim <label
					class="form-check-label" for="radio1"></label>
			</div>

			<div class="form-check">
				<input type="radio" class="form-check-input" id="radio2"
					name="rancho" value=false>Não <label
					class="form-check-label" for="radio2"></label>
			</div>

			<div class="form-group">
				<label>Quantidade de Motores:</label> <input type="number"
					name="motor" value="25" class="form-control">
			</div> 

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>