<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
	<h2>urkee saradhaki</h2>
	<%@ page import="java.util.ArrayList" %>
	<%	
		int arr[] = new int[6];
		for(int i=0;i<arr.length;i++){
			arr[i]= i;
			out.print(arr[i]+ " ");
		}
		
	%>
</body>
</html>