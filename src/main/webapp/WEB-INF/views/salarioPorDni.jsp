<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrando el salario del empleado buscado:</title>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<th>Dni</th>
				<th>Salario</th>
			</tr>
			<tr>
				<td>
					<c:out value="${model.dni}"></c:out>
				</td>
				<td>
					<c:out value="${model.salario}"></c:out>
				</td>
			</tr>

		</tbody>
	</table>
			<a href="mostrarSalario.htm"><input type="submit" name="Opcion" class="btn btn-info"
		value="volver"></a>
	
</body>
</html>