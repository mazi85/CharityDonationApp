<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="pl">
<%--head--%>
<jsp:include page="../fragments/head.jsp"/>
<%--end of head--%>
<body>
<header>
    <nav class="container container--70">
        <%--login-register-menu--%>
        <jsp:include page="../fragments/logged-menu.jsp"/>
        <%--end of login-register-menu-%>

        <%--upperMenu--%>
        <jsp:include page="../fragments/upperMenu.jsp"/>
        <%--end of upperMenu--%>
    </nav>
</header>

<section class="login-page">
    <h2>Profil użytkownika</h2>
    <form:form modelAttribute="user">
        <div class="form-group">
            <form:input path = "name" placeholder="Imie" />
        </div>
        <div class="form-group">
            <form:input path = "lastName" placeholder="Nazwisko" />
        </div>
        <div class="form-group">
            <form:input path = "username" type="email" placeholder="Email" />
        </div>

        <form:hidden path = "id"/>

        <div class="form-group form-group--buttons">

            <button class="btn" type="submit">Edytuj</button>
        </div>
    </form:form>
</section>

<%--footer--%>
<jsp:include page="../fragments/footer.jsp"/>
<%--end of footer--%>

<%--script--%>
<jsp:include page="../fragments/script.jsp"/>
<%--end of script--%>
</body>
</html>

