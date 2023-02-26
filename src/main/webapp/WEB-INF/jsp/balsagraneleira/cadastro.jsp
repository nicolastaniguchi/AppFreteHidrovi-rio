<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Cadastro de Balsa Graneleira</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">

		<form action="/balsagraneleira/incluirbg" method="post">

			<h3>Cadastro de Balsa Graneleira</h3>

			<div class="form-group">
				<label>Nome da Embarcação:</label> <input type="text" name="nome"
					value="Titanic" class="form-control">
			</div>

			<div class="form-group">
				<label>Valor:</label> <input type="number" name="valor"
					value="15000" class="form-control">
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

			<div class="form-group">
				<label>Capacidade:</label> <input type="number" name="capacidade"
					value="2500" class="form-control">
			</div>

			<div class="form-group">
				<label>Modelo:</label> <select class="form-select"
					aria-label="Default select example">
					<option selected>Open this select menu</option>
					<option value="1">Racked</option>
					<option value="2">Box</option>
				</select>
			</div>

			<div class="form-group">
				<label>Serviço de Limpeza:</label>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value=""
						id="flexCheckDefault"> <label class="form-check-label"
						for="flexCheckDefault"> Sim </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value=""
						id="flexCheckChecked" checked> <label
						class="form-check-label" for="flexCheckChecked"> Não </label>
				</div>
			</div>


			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>