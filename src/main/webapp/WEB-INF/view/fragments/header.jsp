<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<head>
    <jsp:include page="headerLinks.jsp"/>
</head>
<header>
    <fmt:setLocale value="${sessionScope.language}"/>
    <fmt:setBundle basename="localization.language" var="loc"/>
    <fmt:setBundle basename="information" var="info"/>

    <form action=${pageContext.request.contextPath}/ method="get">
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary" style="font-size: 20px">
            <div class="collapse navbar-collapse" id="navbarColor01">
                <ul class="navbar-nav mr-auto">
                    <a class="navbar-brand" style="font-size: 22px">
                        <fmt:message bundle="${info}" key="information.name"/>
                    </a>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/main">
                            <fmt:message bundle="${loc}" key="language.home"/>
                        </a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <fmt:message bundle="${loc}" key="language.catalog"/>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/category?category_name=diapers"><fmt:message key="language.diapers"/></a>
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/category?category_name=boy"><fmt:message key="language.boy"/></a>
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/category?category_name=girl"><fmt:message key="language.girl"/></a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link"
                           href="${pageContext.request.contextPath}/promotions">
                            <fmt:message bundle="${loc}" key="language.promotions"/>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/contacts">
                            <fmt:message bundle="${loc}" key="language.contacts"/>
                        </a>
                    </li>
                </ul>
                <ul class="navbar-nav">
                    <c:choose>
                        <c:when test="${sessionScope.language=='en'}">
                            <li class="nav-item">
                                <a class="nav-link active"
                                   href="${pageContext.request.contextPath}/${pageContext.request.queryString}&language=en">
                                    EN
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="navbar-brand">
                                    <img src="${pageContext.request.contextPath}/static/images/flags/EN.png" width="30" height="20" alt="enFlag"/>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link"
                                   href="${pageContext.request.contextPath}/${pageContext.request.queryString}&language=ru">
                                    RU
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="navbar-brand">
                                    <img src="${pageContext.request.contextPath}/static/images/flags/RU.png" width="30" height="20" alt="ruFlag"/>
                                </a>
                            </li>
                        </c:when>
                        <c:when test="${sessionScope.language=='ru'}">
                            <li class="nav-item">
                                <a class="nav-link"
                                   href="${pageContext.request.contextPath}/${pageContext.request.queryString}&language=en">
                                    EN
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="navbar-brand">
                                    <img src="${pageContext.request.contextPath}/static/images/flags/EN.png" width="30" height="20" alt="enFlag"/>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active"
                                   href="${pageContext.request.contextPath}/${pageContext.request.queryString}&language=ru">
                                    RU
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="navbar-brand">
                                    <img src="${pageContext.request.contextPath}/static/images/flags/RU.png" width="30" height="20" alt="ruFlag"/>
                                </a>
                            </li>
                        </c:when>
                    </c:choose>
                    <c:choose>
                        <c:when test="${sessionScope.user == null}">
                            <li class="nav-item">
                                <button class="btn btn-secondary my-2 my-sm-0" type="submit" name="command"
                                        value="logIn">
                                    <fmt:message bundle="${loc}" key="language.logIn"/>
                                </button>
                            </li>
                        </c:when>
                        <c:when test="${sessionScope.user != null}">
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" id="userDropdown" data-bs-toggle="dropdown" href="#"
                                   role="button"
                                   aria-haspopup="true" aria-expanded="false">
                                        ${sessionScope.user.email}
                                </a>
                                <div class="dropdown-menu" aria-labelledby="userDropdown">
                                    <a class="dropdown-item"
                                       href="${pageContext.request.contextPath}/profile">
                                        <fmt:message bundle="${loc}" key="language.profile"/></a>
                                    <a class="dropdown-item" href="${pageContext.request.contextPath}/myOrders"><fmt:message bundle="${loc}" key="language.myOrders"/></a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item"
                                       href="${pageContext.request.contextPath}/logOut">
                                        <fmt:message bundle="${loc}" key="language.logOut"/></a>
                                </div>
                            </li>
                            <li class=" nav-item">
                                <a class="nav-link"
                                   href="${pageContext.request.contextPath}/basket">
                                    <button type="button" class="btn btn-primary">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="currentColor" class="bi bi-cart3" viewBox="0 0 16 16">
                                            <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .49.598l-1 5a.5.5 0 0 1-.465.401l-9.397.472L4.415 11H13a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l.84 4.479 9.144-.459L13.89 4H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"></path>
                                        </svg>
                                    </button>
                                </a>
                            </li>
                        </c:when>
                    </c:choose>
                </ul>
            </div>
        </nav>
    </form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</header>
