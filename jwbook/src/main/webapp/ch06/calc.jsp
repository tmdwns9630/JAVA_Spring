<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>계산기 JSP</h3>
	<%
	int n1 = Integer.parseInt(request.getParameter("n1"));
	int n2 = Integer.parseInt(request.getParameter("n2"));
	@SuppressWarnings("unused")
	String op = request.getParameter("op");
	
	long result = 0;
	
	switch(request.getParameter("op")) {
		case "+" : result = n1+n2; break;
		case "-" : result = n1-n2; break;
		case "/" : result = n1/n2; break;
		case "*" : result = n1*n2; break;
	}	
	%>
	<hr>
		<h2>계산 결과(JSP) : <%=result%> </h2>

</body>
</html>