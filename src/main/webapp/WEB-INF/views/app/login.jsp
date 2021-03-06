<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="pl">
<%--head--%>
<jsp:include page="fragments/head.jsp"/>
<%--end of head--%>
<body>
<header>
    <nav class="container container--70">
        <%--login-register-menu--%>
        <jsp:include page="fragments/login-register-menu.jsp"/>
        <%--end of login-register-menu-%>

        <%--upperMenu--%>
        <jsp:include page="fragments/upperMenu.jsp"/>
        <%--end of upperMenu--%>
    </nav>
</header>

<section class="login-page">
    <h2>Zaloguj się</h2>
    <form method="post">
        <div class="form-group">
            <input type="email" name="username" placeholder="Email" />
        </div>
        <div class="form-group">
            <input type="password" name="password" placeholder="Hasło" />
            <a href="#" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>
        </div>

        <div class="form-group form-group--buttons">
            <a href="<c:url value="/register"/>" class="btn btn--without-border">Załóż konto</a>
            <button class="btn" type="submit">Zaloguj się</button>
        </div>
    </form>
</section>
<%--footer--%>
<jsp:include page="fragments/footer.jsp"/>
<%--end of footer--%>

<%--script--%>
<jsp:include page="fragments/script.jsp"/>
<%--end of script--%>
</body>
</html>