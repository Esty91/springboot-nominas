<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>Buscar empleado por anios</title>
</head>
<body>
	<h3>Introduce el numero de anios trabajados del empleado:</h3>

	<form:form method="post" action="empleadoPorAnios.htm">
		<table>
			<tr>
				<td>Anios trabajados:</td>
				<td><input type="text" name="anio"></td>
			</tr>
			<tr>
				<td><input type="submit" class="btn btn-secondary" value="Aceptar"></td>
			</tr>
		</table>
		<a href="modificarDatos.htm"><input type="submit" name="Opcion" class="btn btn-info"
		value="volver"></a>
	</form:form>
</body>
</html>