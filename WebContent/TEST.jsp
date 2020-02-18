<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "java.sql.Connection" %>
<%@ page import = "javax.sql.DataSource,
					javax.naming.InitialContext,
					javax.naming.Context" %>
					
<%
	Context initContext = new InitialContext();
	Context envContext  = (Context) initContext.lookup("java:/comp/env");
	DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
	Connection conn = ds.getConnection();
	
	out.println("SUCCESS_DB_CONNECTION"+conn);
%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CONNECTION</title>
</head>
<body>

<h1>JSP - Oracle SQL Connection</h1>

</body>
</html>