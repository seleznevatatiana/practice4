<%@ page import= "form.ListForm" %>
<jsp:useBean id="listForm" class="form.ListForm" scope="session" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>占い結果の一覧</title>
</head>
<body style="background-color:pink">
<table border="1">
    <tr>
      <th>占い日</th>
      <th>運勢</th>
      <th>願い事</th>
      <th>商い</th>
      <th>学問</th>
    </tr>
    <tr>
      <td><%= listForm.getUranaiDate() %></td>
      <td><%= listForm.getUnsei() %></td>
      <td><%= listForm.getNegaigoto() %></td>
      <td><%= listForm.getAkinai() %></td>
      <td><%= listForm.getGakumon() %></td>
    </tr>
  </table>
<form action="/OmikujiStruts/result.do" method="post">
<input type="submit" value="戻る"/>
</form>
</body>
</html>