<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<table>
		<tbody>
			<tr>
				<th>Nombre</th>
				<th>DNI</th>
				<th>Sexo</th>
				<th>Anios trabajados</th>
				<th>Categoria</th>
			</tr>
			<c:forEach items="${model.categoria}" var="emp">
				<tr>
					<td><c:out value="${emp.nombre}" /></td>
					<td><c:out value="${emp.dni}"></c:out></td>
					<td><c:out value="${emp.sexo}"></c:out></td>
					<td><c:out value="${emp.anio}"></c:out></td>
					<td><c:out value="${emp.categoria}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="mostrarPorCategoria.htm"><input type="submit" name="Opcion" class="btn btn-info"
		value="volver"></a>
</body>
</html>