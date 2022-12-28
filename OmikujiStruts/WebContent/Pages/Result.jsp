<%@ page import= "form.ResultForm" %>
<jsp:useBean id="resultForm" class="form.ResultForm" scope="session" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>今日の運勢</title>
<link href="Common.css" rel="stylesheet" type="text/css">
</head>
<body style="background-color:pink">
<p>
今日の運勢は<%= resultForm.getUnsei() %>です！<br>
願い事：<%=resultForm.getNegaigoto()%><br>
商い：<%=resultForm.getAkinai()%><br>
学問：<%=resultForm.getGakumon()%><br>
</p>
<div class="buttonwrap">
<form action="/OmikujiStruts/list.do" method="post">
<input type="submit" value="占い結果の一覧"/>
</form>
<form action="/OmikujiStruts/rate.do" method="post">
<input type="submit" value="占い結果の割合"/>
</form>
<form action="/OmikujiStruts/Pages/Login.jsp" method="post">
<input type="submit" value="戻る"/>
</form>
</div>
</body>
</html>