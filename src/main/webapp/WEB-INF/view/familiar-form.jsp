<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<style>
	.error {color: red}
</style>
<meta charset="UTF-8">
<title>Formulário de Cadastro</title>
</head>
<body>
<h1>Cadastro de Familar</h1>

	<form:form action="processForm" modelAttribute="familiar">
	
		Nome Completo: <form:input path="nome"/>
		<form:errors path="nome" cssClass="error"/>
		<br>
		Idade: 
		<form:input path="idade" type="number"/>
		<form:errors path="idade" cssClass="error"/>
		<br><br>
		Genero:
		<form:radiobuttons path="genero" items="${familiar.opcoesGenero }"/>
		<form:errors path="genero" cssClass="error" />
		
		<br><br>
		Serviços Utilizados:
		<form:checkboxes items="${familiar.opcoesServicos}" path="servicos" />
		<form:errors path="servicos" cssClass="error" />
		
		<br><br>
		
		
		<input type="submit" value="Cadastrar"/>
		
	</form:form>

</body>
</html>