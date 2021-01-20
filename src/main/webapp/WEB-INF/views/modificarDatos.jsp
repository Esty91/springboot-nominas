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
<a href="<c:url value="mostrarPorNombre.htm"/>"><input type="submit" name="Opcion" value="Nombre"></a>
	<br><br>
	<a href="<c:url value="buscarPorDni.htm"/>"><input type="submit" name="Opcion" value="Dni"></a>
	<br><br>
	<a href="<c:url value="buscarPorSexo.htm"/>"><input type="submit" name="Opcion" value="Sexo"></a>
	<br><br>
	<a href="<c:url value="buscarPorAnios.htm"/>"><input type="submit" name="Opcion" value="Anios trabajados"></a>
	<br><br>
	<a href="<c:url value="buscarPorCategoria.htm"/>"><input type="submit" name="Opcion" value="Categoria"></a>
	<br><br>
	<a href="<c:url value="hello.htm"/>">Volver</a>
</body>
</html>