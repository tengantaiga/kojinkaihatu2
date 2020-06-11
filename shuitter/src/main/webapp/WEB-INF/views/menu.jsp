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
<title><fmt:message key="title.menu" /></title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body class="center">
  <p>${fn:escapeXml(sessionInfo.loginUser.userName)}さん、こんにちは</p>

  <p>
    <a href="select" class="btn"><fmt:message key="btn.search" /></a>
  </p>


  	<p>
    <a href="make" class="btn"><fmt:message key="btn.makefriend" /></a>
 　 </p>

    <p>
      <a href="createParty" class="btn"><fmt:message key="btn.partyinsert" /></a>
    </p>

    <p>
      <a href="partyUpdate" class="btn"><fmt:message key="btn.partyupdate" /></a>
    </p>

    <p>
      <a href="deleteParty" class="btn"><fmt:message key="btn.partydelete" /></a>
    </p>

  <form action="logout" method="post">
    <button type="submit">
      <fmt:message key="btn.logout" />
    </button>
  </form>
</body>
</html>
