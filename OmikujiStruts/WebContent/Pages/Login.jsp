<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>おみくじ占い</title>
</head>
<body style="background-color:pink" >
<h3 style="color:purple">運勢を占ってみましょう！</h3>
<form action="/OmikujiStruts/result.do" method="post">
誕生日を入力してください：
 <%String errorMsg = (String) request.getAttribute("errorMsg");
        if (errorMsg != null) {
            out.println("<p>" + errorMsg + "</p>");
        }%>
<input type="text" name="birthday"/>
<br>
<br>
<input type="submit" value="送信"/>
</form>
</body>
</html>