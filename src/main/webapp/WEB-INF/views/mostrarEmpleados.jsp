<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head><title><fmt:message key="title"/></title></head>
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
			<c:forEach items="${model.empleados}" var="emp">
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
	<a href="index.jsp"><input type="submit" name="Opcion"
		value="volver"></a>


</body>
</html>