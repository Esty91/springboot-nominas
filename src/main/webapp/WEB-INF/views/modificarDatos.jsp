<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Buscar empleado por:</h2>
<a href="<c:url value="mostrarPorNombre.htm"/>"><input type="submit" name="Opcion" class="btn btn-secondary" value="Nombre"></a>
	<br><br>
	<a href="<c:url value="mostrarPorDni.htm"/>"><input type="submit" name="Opcion" class="btn btn-secondary" value="Dni"></a>
	<br><br>
	<a href="<c:url value="mostrarPorSexo.htm"/>"><input type="submit" name="Opcion" class="btn btn-secondary" value="Sexo"></a>
	<br><br>
	<a href="<c:url value="mostrarPorAnios.htm"/>"><input type="submit" name="Opcion" class="btn btn-secondary" value="Anios trabajados"></a>
	<br><br>
	<a href="<c:url value="mostrarPorCategoria.htm"/>"><input type="submit" name="Opcion" class="btn btn-secondary" value="Categoria"></a>
	<br><br>
	<a href="hello.htm"><input type="submit" name="Opcion" class="btn btn-info"
		value="volver"></a>
</body>
</html>