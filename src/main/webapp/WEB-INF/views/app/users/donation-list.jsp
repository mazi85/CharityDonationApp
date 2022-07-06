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
    <h2>Twoje dary</h2>
    <table class="tg">
        <thead>
        <tr>
            <th class="tg-x1hj">Lp.</th>
            <th class="tg-x1hj">Fundacja</th>
            <th class="tg-x1hj">Kategoria darów</th>
            <th class="tg-x1hj">Ilość worków</th>
            <th class="tg-x1hj">Odebrane</th>
            <th class="tg-x1hj">Data odbioru</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${donations}" var="donation" varStatus="loop">
            <tr>
                <td class="tg-x1hj">${loop.count}</td>
                <td class="tg-x1hj">${donation.institution.name}</td>
                <td class="tg-x1hj"><c:forEach items="${donation.categories}" var="category">${category.name}
                    <br/></c:forEach></td>
                <td class="tg-x1hj">${donation.quantity}</td>
                <td class="tg-x1hj">
                    <input type="checkbox" name="received" <c:if test="${donation.received}">checked</c:if> disabled />
                        </td>
                <td class="tg-x1hj">
                <c:if test="${donation.received}">
                    ${donation.updatedOn.toLocalDate()}
                </c:if>
                </td>

                <td class="tg-x1hj">
                    <a href="/user/donation/details/${donation.id}" class="btn btn--small btn--without-border reset-password">Szczegóły</a>
                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>

</section>

<%--footer--%>
<jsp:include page="../fragments/footer.jsp"/>
<%--end of footer--%>

<%--script--%>
<jsp:include page="../fragments/script.jsp"/>
<%--end of script--%>
</body>
</html>

