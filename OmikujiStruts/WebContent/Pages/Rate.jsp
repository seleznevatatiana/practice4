<%@ page import= "form.RateForm" %>
<jsp:useBean id="rateForm" class="form.RateForm" scope="request" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>占いの割合</title>
</head>
<body style="background-color:pink">
<table border="1">
    <tr>
      <th>大吉</th>
      <th>中吉</th>
      <th>小吉</th>
      <th>末吉</th>
      <th>吉</th>
      <th>凶</th>
    </tr>
 <%--    <tr>
      <td><%= %></td>
      <td><%=  %></td>
      <td><%=  %></td>
      <td><%= %></td>
      <td><%=  %></td>
      <td><%=  %></td>
    </tr> --%>
  </table>
<form action="/OmikujiStruts/result.do" method="post">
<input type="submit" value="戻る"/>
</form>
</body>
</html>