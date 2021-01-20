<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>Buscar empleado por categoria</title>
</head>
<body>
	<h3>Introduce la categoria del empleado:</h3>

	<form:form method="post" action="empleadoPorCategoria.htm">
		<table>
			<tr>
				<td>Categoria empleado:</td>
				<td><input type="text" name="categoria"></td>
			</tr>
			<tr>
				<td><input type="submit" class="btn btn-secondary" value="Aceptar"></td>
			</tr>
		</table>
			<a href="empleadoPorAnios.htm"><input type="submit" name="Opcion" class="btn btn-info"
		value="volver"></a>
	</form:form>
</body>
</html>