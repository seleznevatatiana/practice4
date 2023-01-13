<%@ page import= "form.ResultForm" %>
<jsp:useBean id="resultForm" class="form.ResultForm" scope="session" />
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
      <th>誕生日</th>
      <th>占い日</th>
      <th>結果</th>
    </tr>
    <tr>
      <td><%= resultForm.getBirthday() %></td>
      <td><%= resultForm.getCreatedDate() %></td>
      <td>運勢：<%= resultForm.getUnsei() %><br>
              願い事：<%=resultForm.getNegaigoto()%><br>
              商い：<%=resultForm.getAkinai()%><br>
              学問：<%=resultForm.getGakumon()%><br>
     </td>
    </tr>
  </table>
<form action="/OmikujiStruts/result.do" method="post">
<input type="submit" value="戻る"/>
</form>
</body>
</html>