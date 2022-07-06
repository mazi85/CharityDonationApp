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
    <h2>Szczegóły Twojej darowizny</h2>
</section>
    <section class="form--steps">
        <div class="form--steps-container">
            <div class="form--steps-counter"><span hidden>1</span></div>

            <form method="post">
                <div data-step="1">
                    <div class="summary">
                        <div class="form-section">
                            <h4>Oddałeś:</h4>
                            <ul>
                                <li>
                                    <span class="icon icon-bag"></span>
                                    <span class="summary--text summary-donation">${donation.quantity} worki:</span><br/>
                                </li>
                                <c:forEach items="${donation.categories}" var="category">
                                    <li>${category.name}</li>
                                </c:forEach>

                                <li>
                                    <span class="icon icon-hand"></span>
                                    <span class="summary--text summary-institution">
                                    Dla fundacji: ${donation.institution.name}  </span>
                                </li>
                            </ul>
                        </div>

                        <div class="form-section form-section--columns">
                            <div class="form-section--column">
                                <h4>Data rejestracji daru:</h4>
                                <ul class="summary-adres">
                                    <li>${donation.createdOn.toLocalDate()} </li>
                                </ul>
                            </div>

                            <div class="form-section--column">
                                <h4>Planowany termin odbioru:</h4>
                                <ul class="summary-pickup">
                                    <li>${donation.pickUpDate}</li>
                                </ul>
                            </div>
                        </div>
                    </div>

                    <div class="form-group form-group--buttons">
                        <button type="button" onclick="history.back()" class="btn">Wstecz</button>
                        <button type="submit" class="btn">Potwierdzam odbiór</button>
                    </div>
                </div>
            </form>
        </div>
    </section>

<%--footer--%>
<jsp:include page="../fragments/footer.jsp"/>
<%--end of footer--%>

<%--script--%>
<jsp:include page="../fragments/script.jsp"/>
<%--end of script--%>
</body>
</html>

