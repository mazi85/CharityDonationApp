<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
    <jsp:include page="../fragments/css-font.jsp"/>
    <!-- End of Custom fonts for this template-->
</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">
    <!-- Sidebar -->
    <jsp:include page="../fragments/sideBar.jsp"/>
    <!-- End of Sidebar -->
    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <jsp:include page="../fragments/topbar.jsp"/>
            <!-- End of Topbar -->

            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="d-sm-flex align-items-center justify-content-between mb-4">
                    <h1 class="h3 mb-0 text-gray-800">Admins</h1>
                    <a href="/admin/users/add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                            class="fas fa-download fa-sm text-white-50"></i>+ Dodaj administratora</a>
                </div>

                <!-- Form -->
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">Edytuj administratora</h6>
                    </div>
                    <div class="card-body">
                        <form:form action="/admin/admins/edit" method="post" modelAttribute="admin">

                            <div class="form-group">
                                <label for="username">Nazwa administratora</label>
                                <form:input type="email" class="form-control" path="username"/>
                            </div>
                            <div class="form-group">
                                <label for="name">Imie</label>
                                <form:input type="text" class="form-control" path="name"/>
                            </div>
                            <div class="form-group">
                                <label for="lastName">Nazwisko</label>
                                <form:input type="text" class="form-control" path="lastName"/>
                            </div>
                            <div class="form-group">
                                <label for="password">Has??o</label>
                                <form:input type="password" class="form-control" path="password"/>
                            </div>
                            <div class="form-group">
                                <label for="password2">Powt??rz has??o</label>
                                <input type="password" class="form-control" id="password2"
                                       name="password2" value="${admin.password}"/>
                            </div>

                            <form:input type="hidden" class="form-control" path="id"/>
                            <form:input type="hidden" class="form-control" path="role"/>
                            <form:input type="hidden" class="form-control" path="disable"/>

                            <button type="submit" class="btn btn-primary">Edytuj</button>
                        </form:form>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- End of Main Content -->

        <!-- Footer -->
        <jsp:include page="../fragments/footer.jsp"/>
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
<jsp:include page="../fragments/script.jsp"/>
<!-- End of Bootstrap core JavaScript -->

</body>

</html>

