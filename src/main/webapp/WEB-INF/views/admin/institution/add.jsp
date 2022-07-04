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

    <title>InstitutionCRUD</title>

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
                    <h1 class="h3 mb-0 text-gray-800">InstitutionCRUD</h1>
                    <a href="/admin/institution/add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                            class="fas fa-download fa-sm text-white-50"></i>+ Dodaj instytucję</a>
                </div>

                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">Dodaj instytucję</h6>
                    </div>
                    <div class="card-body">
                        <form:form method="post" modelAttribute="institution" >

                            <div class="form-group">
                                <label for="name">Nazwa</label>
                                < <form:input type="text" path="name" class="form-control" placeholder="nazwa"/>
                            </div>

                            <div class="form-group">
                                <label for="name">Opis</label>
                                <form:input type="text" path="description" class="form-control" placeholder="opis"/>
                            </div>

                            <button type="submit" class="btn btn-primary">Zapisz</button>
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
<!-- Logout Modal-->

<!-- Bootstrap core JavaScript-->
<jsp:include page="../fragments/script.jsp"/>
<!-- End of Bootstrap core JavaScript -->

</body>

</html>

