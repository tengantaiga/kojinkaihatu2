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
<title>Insert title here</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body class="center">

<c:if test="${not empty errMsg}">
    <p class="error">${fn:escapeXml(errMsg)}</p>
  </c:if>

  <form:form action="makeFriend" method="post" modelAttribute="selectForm">
    <fieldset class="label-130">

     <div>
        <label><fmt:message key="lbl.id" /></label>
        <form:input path="loginId" />
        <form:errors path="loginId" class="error" />
      </div>


    </fieldset>

      <div>
      <form:button name="make">
        <fmt:message key="btn.make" />
      </form:button>
      <form:button name="back">
        <fmt:message key="btn.back" />
      </form:button>
    </div>
  </form:form>


</body>
</html>