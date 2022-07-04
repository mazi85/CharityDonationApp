<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Users</title>

    <!-- Custom fonts for this template-->
    <jsp:include page="fragments/css-font.jsp"/>
    <!-- End of Custom fonts for this template-->
</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <jsp:include page="fragments/sideBar.jsp"/>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <jsp:include page="fragments/topbar.jsp"/>
            <!-- End of Topbar -->

            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="d-sm-flex align-items-center justify-content-between mb-4">
                    <h1 class="h3 mb-0 text-gray-800">Users</h1>
                    <a href="${pageContext.request.contextPath}admin/users/add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                            class="fas fa-download fa-sm text-white-50"></i> Dodaj użytkownika</a>
                </div>
                <!-- Table -->
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">Lista użytkowników</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Nazwa użytkownika</th>
                                    <th>Imie</th>
                                    <th>Nazwisko</th>
                                    <th>Zablokowany</th>
                                    <th>Akcja</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${allUsers}" var="user">
                                    <tr>
                                        <td>${user.id}</td>
                                        <td>${user.username}</td>
                                        <td>${user.name}</td>
                                        <td>${user.lastName}</td>
                                        <td>${user.disable}</td>
                                        <td>
                                            <a class="btn btn-primary lift" href="${pageContext.request.contextPath}delete/${user.id}">Usuń</a>
                                            <a class="btn btn-primary lift" href="${pageContext.request.contextPath}edit/${user.id}">Edycja</a>
                                            <a class="btn btn-primary lift" href="${pageContext.request.contextPath}block/${user.id}">Zablokuj</a>
                                            <a class="btn btn-primary lift" href="${pageContext.request.contextPath}unblock/${user.id}">Odblokuj</a>
                                            <a class="btn btn-primary lift" href="${pageContext.request.contextPath}admin/users/editPass/${user.id}">Hasło</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <!-- Content Row -->


                <!-- Content Row -->


                <!-- Content Row -->


            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- End of Main Content -->

        <!-- Footer -->
        <jsp:include page="fragments/footer.jsp"/>
        <!-- End of Footer -->
    </div>
    <!-- End of Content Wrapper -->
</div>
<!-- End of Page Wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Bootstrap core JavaScript-->
<jsp:include page="fragments/script.jsp"/>
<!-- End of Bootstrap core JavaScript -->

</body>

</html>

