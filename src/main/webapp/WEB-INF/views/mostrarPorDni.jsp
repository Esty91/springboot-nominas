<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buscar empleado por dni</title>
</head>
<body>
	<h3>Introduce el DNI del empleado:</h3>
	<form:form method="post" action="empleadoPorDni.htm">
		<table>
			<tr>
				<td>DNI del empleado:</td>
				<td><input type="text" name="dni"></td>
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