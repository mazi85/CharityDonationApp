<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<!DOCTYPE html>
<html lang="pl">
<%--head--%>
<jsp:include page="fragments/head.jsp"/>
<%--end of head--%>
<body>
<header class="header--form-page">
    <nav class="container container--70">
        <%--login-register-menu--%>
        <jsp:include page="fragments/login-register-menu.jsp"/>
        <%--end of login-register-menu-%>

        <%--upperMenu--%>
        <jsp:include page="fragments/upperMenu.jsp"/>
        <%--end of upperMenu--%>
    </nav>

    <div class="slogan container container--90">
        <h2>
            Dziękujemy za rejestrację. Na maila przesłaliśmy link aktywacyjny
        </h2>
    </div>
</header>

<%--footer--%>
<jsp:include page="fragments/footer.jsp"/>
<%--end of footer--%>

<%--script--%>
<jsp:include page="fragments/script.jsp"/>
<%--end of script--%>
</body>
</html>