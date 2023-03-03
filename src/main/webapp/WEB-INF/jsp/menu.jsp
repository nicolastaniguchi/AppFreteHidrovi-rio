<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<nav class="navbar navbar-inverse">
	 <div class="container-fluid">
	   <div class="navbar-header">
	     <a class="navbar-brand" href="#">App Frete Hidroviário</a>
	   </div>
	   <ul class="nav navbar-nav">
	     <li class="active"><a href="#">Home</a></li>
	     
	     <c:if test="${not empty usuario}">
		     <li><a href="/usuario/lista">Usuários</a></li>
		     <li><a href="#">Clientes</a></li>
		     <li><a href="#">Embarcações</a></li>
		     <li><a href="/empurrador/lista">Empurrador</a></li>	
		     <li><a href="/balsacarreteira/lista">Balsa Carreteira</a></li>
		     <li><a href="/balsagraneleira/lista">Balsa Graneleira</a></li>	
		     <li><a href="/frete/lista">Frete</a></li>
	     </c:if>      	      
	   </ul>
		<ul class="nav navbar-nav navbar-right">
			<c:if test="${empty usuario}">
				<li><a href="/usuario"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="/login"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</c:if>
			<c:if test="${not empty usuario}">
				<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span>
						Logout, ${usuario.nome}</a></li>
			</c:if>
		</ul>
	</div>
</nav>