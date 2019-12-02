<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmação de Cadastro</title>
</head>
<body>
	<h1>Dados do Familiar Cadastrado:</h1>
	<h5>Nome: ${familiar.nome }</h5>
	<h5>Genero: ${familiar.genero }</h5>
	<h5>Idade: ${familiar.idade }</h5>
	<h5>Serviços Utilizados:</h5>
	<ul>
		<c:forEach var="item" items="${familiar.servicos}">
			<li> <b>${item} </b></li>
		</c:forEach>
	</ul>
</body>
</html>