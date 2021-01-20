<%@ include file="/WEB-INF/views/include.jsp"%>
<html>
<head>
<title>Gestion de nominas</title>
</head>
<body>
	<h1>App Gestion de Nominas</h1>
	<br>
	<h2>Opciones disponibles:</h2>
	<a href="<c:url value="mostrarEmpleados.htm"/>"><input type="submit" name="Opcion" value="Mostrar los datos de todos los empleados"></a>
	<br><br>
	<a href="<c:url value="mostrarSalario.htm"/>"><input type="submit" name="Opcion" value="Mostrar el salario de un empleado"></a>
	<br><br>
	<a href="<c:url value="modificarDatos.htm"/>"><input type="submit" name="Opcion" value="Modificar los datos de un empleado"></a>
	<br>
</body>
</html>