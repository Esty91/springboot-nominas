<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buscar por sexo</title>
</head>
<body>
	<h3>Introduce el sexo del empleado:</h3>

	<form:form method="post" action="empleadoPorSexo.htm">
		<table>
			<tr>
				<td>Sexo empleado:</td>
				<td><input type="text" name="sexo"></td>
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