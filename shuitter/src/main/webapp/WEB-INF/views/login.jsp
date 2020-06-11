<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><fmt:message key="title.login" /></title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body class="center">
  <c:if test="${not empty errMsg}">
    <p class="error">${fn:escapeXml(errMsg)}</p>
  </c:if>

  <form:form action="login" method="post" modelAttribute="loginForm">
    <fieldset>
      <div>
        <label><fmt:message key="lbl.id" /></label>
        <form:input path="loginId" />
        <form:errors path="loginId" class="error" />
      </div>
      <div>
        <label><fmt:message key="lbl.pass" /></label>
        <form:password path="password" />
        <form:errors path="password" class="error" />
      </div>
    </fieldset>
    <form:button>
      <fmt:message key="btn.login" />
    </form:button>
  </form:form>

    <button onclick="location.href='insert'"><fmt:message key="btn.insert" /></button>

  <div>
    <a href="index">TOP画面に戻る</a>
  </div>
</body>
</html>
