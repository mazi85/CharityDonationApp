<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<ul class="nav--actions">
    <li class="logged-user">
        Witaj ${username}
        <ul class="dropdown">
            <li><a href="<c:url value="/user/profile"/> ">Profil</a></li>
            <li><a href=<c:url value="/user/my-donation"/>>Moje zbiórki</a></li>
            <li><a href="<c:url value="/logout"/> ">Wyloguj</a></li>
        </ul>
    </li>
</ul>