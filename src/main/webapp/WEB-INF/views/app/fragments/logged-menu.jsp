<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<ul class="nav--actions">
    <li class="logged-user">
        Witaj <sec:authentication property="principal.username"/>
        <ul class="dropdown">
            <li><a href="<c:url value="/user/form"/> ">Dodaj zbiórkę</a></li>
            <li><a href="<c:url value="/user/my-donation"/>">Moje zbiórki</a></li>
            <li><a href="<c:url value="/user/profile"/> ">Profil</a></li>
            <li><a href="<c:url value="/user/edit-password"/> ">Edytuj hasło</a></li>
            <li><a href="<c:url value="/logout"/> ">Wyloguj</a></li>
        </ul>
    </li>
</ul>