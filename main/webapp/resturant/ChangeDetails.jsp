<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<head>
    <%
        //            try {
//                if (request.getSession().getAttribute("userid").equals(null)) {
//                    response.sendRedirect(request.getContextPath() + "/login");
//                }
//            } catch (NullPointerException e) {
//                response.sendRedirect(request.getContextPath() + "/login");
//            }
    %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FixedPlus - Bootstrap Admin Dashboard Template</title>

    <!-- Common Plugins -->
    <link href="<c:url value="/assets/lib/bootstrap/css/bootstrap.min.css"/>" type="text/css" rel="stylesheet">
    <!-- Toast -->
    <link href="<c:url value="/assets/lib/toast/jquery.toast.min.css"/>" type="text/css" rel="stylesheet">

    <!-- Sweet Alerts-->
    <link href="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.css"/>" type="text/css" rel="stylesheet">
    <!-- DataTables -->
    <link href="<c:url value="/assets/lib/datatables/jquery.dataTables.min.css"/>" rel="stylesheet"
          type="text/css">
    <link href="<c:url value="/assets/lib/datatables/responsive.bootstrap.min.css"/>" rel="stylesheet"
          type="text/css">
    <link href="<c:url value="/assets/lib/datatables/buttons.dataTables.css"/>" rel="stylesheet" type="text/css">

    <!-- Jquery UI -->
    <link href="<c:url value="/assets/lib/jquery-ui/jquery-ui.css"/>" rel="stylesheet">
    <!-- Custom Css-->
    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet">
    <style>
        #sample {
            overflow: visible;
        }
    </style>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<!-- ============================================================== -->
<!-- 						Topbar Start 							-->
<!-- ============================================================== -->
<div class="top-bar primary-top-bar">
    <div class="container-fluid">
        <div class="row">
            <div class="col">
                <a class="admin-logo" href="index.html">
                    <h1>
                        <img alt="" src="<c:url value="/assets/img/icon.png"/>" class="logo-icon margin-r-10">
                        <img alt="" src="<c:url value="/assets/img/logo-dark.png"/>" class="toggle-none hidden-xs">
                    </h1>
                </a>
                <div class="left-nav-toggle">
                    <a href="#" class="nav-collapse"><i class="fa fa-bars"></i></a>
                </div>
                <div class="left-nav-collapsed">
                    <a href="#" class="nav-collapsed"><i class="fa fa-bars"></i></a>
                </div>
                <div class="search-form hidden-xs">
                    <form>
                        <input class="form-control" placeholder="Search for..." type="text">
                        <button class="btn-search" type="button"><i class="fa fa-search"></i></button>
                    </form>
                </div>
            </div>
            <div class="col">
                <ul class="list-inline top-right-nav">
                    <li class="dropdown icons-dropdown d-none-m">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="fa fa-envelope"></i>
                            <div class="notify setpos"><span class="heartbit"></span> <span class="point"></span></div>
                        </a>
                        <ul class="dropdown-menu top-dropdown lg-dropdown notification-dropdown">
                            <li>
                                <div class="dropdown-header">
                                    <a class="float-right" href="#">
                                        <small>View All</small>
                                    </a> Messages
                                </div>

                                <div class="scrollDiv">
                                    <div class="notification-list">

                                        <a class="clearfix" href="javascript:%20void(0);">
                                                    <span class="notification-icon">
                                                        <img alt="" class="rounded-circle"
                                                             src="<c:url value="/assets/img/avtar-5.png"/>"
                                                             width="50">
                                                    </span>
                                            <span class="notification-title">
                                                        Hritik Doe
                                                        <label class="label label-warning float-right">Support</label>
                                                    </span>
                                            <span class="notification-description">Lorem Ipsum is simply dummy text of the printing.</span>
                                            <span class="notification-time">15 minutes ago</span>
                                        </a>

                                    </div>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown icons-dropdown d-none-m">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="fa fa-bell"></i>
                            <div class="notify setpos"><span class="heartbit"></span> <span class="point"></span></div>
                        </a>
                        <ul class="dropdown-menu top-dropdown lg-dropdown notification-dropdown">
                            <li>
                                <div class="dropdown-header">
                                    <a class="float-right" href="#">
                                        <small>View All</small>
                                    </a> Notifications
                                </div>
                                <div class="scrollDiv">
                                    <div class="notification-list">

                                        <a class="clearfix" href="javascript:%20void(0);">
                                                    <span class="notification-icon">
                                                        <img alt="" class="rounded-circle"
                                                             src="<c:url value="/assets/img/avtar-5.png"/>"
                                                             width="50">
                                                    </span>
                                            <span class="notification-title">
                                                        Hritik Doe
                                                        <label class="label label-warning float-right">Support</label>
                                                    </span>
                                            <span class="notification-description">Lorem Ipsum is simply dummy text of the printing.</span>
                                            <span class="notification-time">15 minutes ago</span>
                                        </a>

                                    </div>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown d-none-m">
                        <a class="right-sidebar-toggle" href="javascript:%20void(0);"><i class="fa fa-align-right"></i></a>
                    </li>
                    <li class="dropdown avtar-dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <img alt="" class="rounded-circle" src="<c:url value="/assets/img/avtar-2.png"/>"
                                 width="30">
                            ${sessionScope.get("employeeName")}
                        </a>
                        <ul class="dropdown-menu top-dropdown">
                            <li>
                                <a class="dropdown-item" href="javascript:%20void(0);"><i class="icon-bell"></i>
                                    Activities</a>
                            </li>
                            <li>
                                <a class="dropdown-item" href="javascript:%20void(0);"><i class="icon-user"></i> Profile</a>
                            </li>
                            <li>
                                <a class="dropdown-item" href="javascript:%20void(0);"><i class="icon-settings"></i>
                                    Settings</a>
                            </li>
                            <li class="dropdown-divider"></li>
                            <li>
                                <a class="dropdown-item" href="<%=request.getContextPath()%>/loginout"><i
                                        class="icon-logout"></i> Logout</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- ============================================================== -->
<!--                        Topbar End                              -->
<!-- ============================================================== -->


<!-- ============================================================== -->
<!--                        Right Side Start                        -->
<!-- ============================================================== -->
<nav class="toggle-sidebar" id="right-sidebar-toggle">
    <div class="nano">
        <div class="nano-content">
            <div>
                <ul class="list-inline nav-tab-card clearfix" role="tablist">

                    <li class="active" role="presentation">
                        <a aria-controls="friends" data-toggle="tab" href="#friends" role="tab">Friends</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="friends" role="tabcard">
                        <ul class="list-unstyled sidebar-contact-list">
                            <li class="clearfix">
                                <a class="media-box" href="#"><span class="float-right"><span
                                        class="circle circle-success circle-lg"></span></span> <span class="float-left">
                                                <img alt="user" class="media-box-object rounded-circle"
                                                     src="<c:url value="/assets/img/avtar-2.png"/>" width="50"></span>
                                    <span class="media-box-body"><span
                                            class="media-box-heading"><strong>${sessionScope.get("employeeName")}</strong><br>
                                                    <small class="text-muted">Designer</small></span></span></a>
                            </li>
                            <li class="clearfix">
                                <a class="media-box" href="#"><span class="float-right"><span
                                        class="circle circle-success circle-lg"></span></span> <span class="float-left">
                                                <img alt="user" class="media-box-object rounded-circle"
                                                     src="assets/img/avtar-1.png" width="50"></span>
                                    <span class="media-box-body"><span
                                            class="media-box-heading"><strong>Govinda Doe</strong><br>
                                                    <small class="text-muted">Designer</small></span></span></a>
                            </li>
                            <li class="clearfix">
                                <a class="media-box" href="#"><span class="float-right"><span
                                        class="circle circle-danger circle-lg"></span></span> <span class="float-left">
                                                <img alt="user" class="media-box-object rounded-circle"
                                                     src="assets/img/avtar-3.png" width="50"></span>
                                    <span class="media-box-body"><span
                                            class="media-box-heading"><strong>Megan Doe</strong><br>
                                                    <small class="text-muted">Designer</small></span></span></a>
                            </li>
                            <li class="clearfix">
                                <a class="media-box" href="#"><span class="float-right"><span
                                        class="circle circle-success circle-lg"></span></span> <span class="float-left">
                                                <img alt="user" class="media-box-object rounded-circle"
                                                     src="assets/img/avtar-4.png" width="50"></span>
                                    <span class="media-box-body"><span
                                            class="media-box-heading"><strong>Hritik Doe</strong><br>
                                                    <small class="text-muted">Designer</small></span></span></a>
                            </li>
                            <li class="clearfix">
                                <a class="media-box" href="#"><span class="float-right"><span
                                        class="circle circle-success circle-lg"></span></span> <span class="float-left">
                                                <img alt="user" class="media-box-object rounded-circle"
                                                     src="<c:url value="/assets/img/avtar-5.png"/>" width="50"></span>
                                    <span class="media-box-body"><span
                                            class="media-box-heading"><strong>Bianca Doe</strong><br>
                                                    <small class="text-muted">Designer</small></span></span></a>
                            </li>
                            <li class="clearfix">
                                <a class="media-box" href="#"><span class="float-right"><span
                                        class="circle circle-success circle-lg"></span></span> <span class="float-left">
                                                <img alt="user" class="media-box-object rounded-circle"
                                                     src="<c:url value="/assets/img/avtar-6.png"/>" width="50"></span>
                                    <span class="media-box-body"><span
                                            class="media-box-heading"><strong>John Doe</strong><br>
                                                    <small class="text-muted">Designer</small></span></span></a>
                            </li>
                            <li class="clearfix">
                                <a class="media-box" href="#"><span class="float-right"><span
                                        class="circle circle-success circle-lg"></span></span> <span class="float-left">
                                                <img alt="user" class="media-box-object rounded-circle"
                                                     src="assets/img/avtar-1.png" width="50"></span>
                                    <span class="media-box-body"><span
                                            class="media-box-heading"><strong>Govinda Doe</strong><br>
                                                    <small class="text-muted">Designer</small></span></span></a>
                            </li>
                            <li class="clearfix">
                                <a class="media-box" href="#"><span class="float-right"><span
                                        class="circle circle-danger circle-lg"></span></span> <span class="float-left">
                                                <img alt="user" class="media-box-object rounded-circle"
                                                     src="<c:url value="/assets/img/avtar-2.png"/>" width="50"></span>
                                    <span class="media-box-body"><span
                                            class="media-box-heading"><strong>Megan Doe</strong><br>
                                                    <small class="text-muted">Designer</small></span></span></a>
                            </li>
                            <li>
                                <div class=" text-center">
                                    <a class="btn btn-teal" href="javascript:void(0);" title="See more contacts">Load
                                        more..</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</nav>
<!-- ============================================================== -->
<!--                        Right Side End                          -->
<!-- ============================================================== -->


<!-- ============================================================== -->
<!-- 						Navigation Start 						-->
<!-- ============================================================== -->
<div class="main-sidebar-nav default-navigation">
    <div class="nano">
        <div class="nano-content sidebar-nav">

            <div class="card-body border-bottom text-center nav-profile">
                <div class="notify setpos"><span class="heartbit"></span> <span class="point"></span></div>
                <img alt="profile" class="margin-b-10  " src="<c:url value="/assets/img/avtar-2.png"/>" width="80">
                <p class="lead margin-b-0 toggle-none">${sessionScope.get("employeeName")}</p>
                <p class="text-muted mv-0 toggle-none">${sessionScope.get("Location")}</p>
                <input type="hidden" id="LocationId" value="${sessionScope.get("LocationID")}">
            </div>

            <ul class="metisMenu nav flex-column" id="menu">
                <li class="nav-heading"><span>MAIN</span></li>
                <li class="nav-item "><a class="nav-link" href="<%=request.getContextPath()%>/index.html"><i
                        class="fa fa-home"></i> <span class="toggle-none">Dashboard</span></a></li>
                <li class="nav-item  active">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i
                            class="fa fa-codepen"></i><span class="toggle-none">Product <span
                            class="fa arrow"></span></span></a>
                    <ul class="nav-second-level nav flex-column " aria-expanded="false">
                        <li class="nav-item active"><a class="nav-link" href="<%=request.getContextPath()%>/product"><i
                                class="fa fa-cubes"></i><span>&nbsp;</span>Product List</a></li>
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/productCategory"><i
                                class="fa fa-th-large"></i><span>&nbsp;</span>Product Category</a></li>
                        <li class="nav-item"><a class="nav-link"
                                                href="<%=request.getContextPath()%>/productrentalprice"><i
                                class="fa fa-exchange"></i><span>&nbsp;</span>Product Rental Price</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i class="fa icon-map"></i>
                        <span class="toggle-none">Locations <span class="fa arrow"></span></span></a>
                    <ul class="nav-second-level nav flex-column sub-menu" aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/location"><i
                                class="fa fa-map-marker"></i><span>&nbsp;</span>Location List</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i class="fa fa-users"></i>
                        <span class="toggle-none">Customers<span class="fa arrow"></span></span></a>
                    <ul class="nav-second-level nav flex-column sub-menu" aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/customer"><i
                                class="fa fa-user"></i><span>&nbsp;</span>Customers List</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i
                            class="fa icon-basket-loaded"></i> <span class="toggle-none">Services<span
                            class="fa arrow"></span></span></a>
                    <ul class="nav-second-level nav flex-column sub-menu" aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/service"><i
                                class="fa fa-fa-wrench"></i><span>&nbsp;</span>Service List</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i
                            class="fa fa-id-card-o"></i> <span class="toggle-none">Employee<span
                            class="fa arrow"></span></span></a>
                    <ul class="nav-second-level nav flex-column sub-menu" aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/employee"><i
                                class="fa fa-fa-wrench"></i><span>&nbsp;</span>Employee List</a></li>
                    </ul>
                </li>
                <li class="nav-heading"><span>Rental Booking & Invoice</span></li>

                <li class="nav-item ">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i class="fa fa-cogs"></i>
                        <span class="toggle-none">Rental Booking <span class="fa arrow"></span></span></a>
                    <ul class="nav-second-level nav flex-column sub-menu" aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/rentbooking">Rent
                            Booking Cart</a></li>
                    </ul>
                    <ul class="nav-second-level nav flex-column sub-menu" aria-expanded="false">
                        <li class="nav-item active"><a class="nav-link"
                                                       href="<%=request.getContextPath()%>/pendingrentbookingorders">Pending
                            Rent Booking Orders List</a></li>
                    </ul>
                    <ul class="nav-second-level nav flex-column sub-menu" aria-expanded="false">
                        <li class="nav-item active"><a class="nav-link"
                                                       href="<%=request.getContextPath()%>/DailyProductBookingSummery">Rent
                            Booking Summery</a></li>
                    </ul>
                    <ul class="nav-second-level nav flex-column sub-menu" aria-expanded="false">
                        <li class="nav-item"><a class="nav-link"
                                                href="<%=request.getContextPath()%>/PendingRentalInvoice">Pending Rental
                            Invoice List</a></li>
                    </ul>

                </li>


            </ul>
        </div>
    </div>
</div>
<!-- ============================================================== -->
<!-- 						Navigation End	 						-->
<!-- ============================================================== -->


<!-- ============================================================== -->
<!-- 						Content Start	 						-->
<!-- ============================================================== -->

<div class="row page-header">
    <div class="col-lg-6 align-self-center ">
        <h2>Product Managment</h2>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="javascript: void(0);">Home</a></li>
            <li class="breadcrumb-item active">Details Change</li>
        </ol>
    </div>
</div>

<section class="main-content">
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-header card-default">
                    Product
                    <p class="text-muted">All Product List</p>
                    <div class="float-right mt-10">
                        <button type="button" class="btn btn-primary margin-r-5 btn-rounded box-shadow btn-icon"
                                data-toggle="modal" onclick="loadModal()"><i class="fa fa-plus"></i>Add New
                        </button>
                    </div>
                </div>
                <div class="card-body">
                    <div class="tabs">
                        <!-- categoriys -->
                        <ul class="nav nav-tabs" id="tabs">
                            <li class='nav-item' role='presentation'><a class='nav-link active' modelID="newModelId"
                                                                        href='#A' aria-controls='A' role='tab'
                                                                        data-toggle='tab' aria-selected='true'>Menu
                                Category</a></li>
                            <li class='nav-item' onclick="loadMenuTypes()" role='presentation'><a class='nav-link'
                                                                                                  modelID="typeModel"
                                                                                                  href='#B'
                                                                                                  aria-controls='B'
                                                                                                  role='tab'
                                                                                                  data-toggle='tab'
                                                                                                  aria-selected='false'>Menu
                                Type</a></li>
                            <li class='nav-item' onclick="loadMenuItems()" role='presentation'><a class='nav-link'
                                                                                                  modelID="itemModel"
                                                                                                  href='#C'
                                                                                                  aria-controls='C'
                                                                                                  role='tab'
                                                                                                  data-toggle='tab'
                                                                                                  aria-selected='false'>Menu
                                Item's</a></li>
                        </ul>
                        <!-- types -->
                        <div class="tab-content" id="tabContent">
                            <div role='tabpanel' class='tab-pane active' id="A">
                                <div class='card-body'>
                                    <table id="datatable2" class="table dataTable table-striped dt-responsive nowrap">
                                        <thead>
                                        <tr>
                                            <th>
                                                <strong>ID</strong>
                                            </th>
                                            <th style="width:80px">
                                                <strong>Category</strong>
                                            </th>
                                            <th>
                                                <strong>Icon</strong>
                                            </th>
                                            <th>
                                                <strong>Status</strong>
                                            </th>
                                            <th class="text-center">
                                                <strong>Action</strong>
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody id="productTypeDataBody">
                                        </tbody>
                                    </table>
                                </div>
                            </div>

                            <div role='tabpanel' class='tab-pane' id="B">
                                <div class='card-body'>
                                    <table id="datatable3" class="table dataTable table-striped nowrap">
                                        <thead>
                                        <tr>
                                            <th>
                                                <strong>ID</strong>
                                            </th>
                                            <th style="width:80px">
                                                <strong>Type</strong>
                                            </th>
                                            <th>
                                                <strong>Icon</strong>
                                            </th>
                                            <th>
                                                <strong>status</strong>
                                            </th>
                                            <th class="text-center">
                                                <strong>Category</strong>
                                            </th>
                                            <th class="text-center">
                                                <strong>Action</strong>
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody id="productTypeDataBody">
                                        </tbody>
                                    </table>
                                </div>
                            </div>

                            <div role='tabpanel' class='tab-pane' id="C">
                                <div class='card-body '>
                                    <table id="datatable4" class="table dataTable table-striped dt-responsive nowrap">
                                        <thead>
                                        <tr>
                                            <th>
                                                <strong>ID</strong>
                                            </th>
                                            <th style="width:80px">
                                                <strong>Menu Item</strong>
                                            </th>
                                            <th>
                                                <strong>Type</strong>
                                            </th>
                                            <th>
                                                <strong>Cost Price</strong>
                                            </th>
                                            <th>
                                                <strong>Selling Price</strong>
                                            </th>
                                            <th>
                                                <strong>Icon</strong>
                                            </th>
                                            <th>
                                                <strong>status</strong>
                                            </th>
                                            <th class="text-center">
                                                <strong>Action</strong>
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody id="productTypeDataBody">
                                        </tbody>
                                    </table>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>

            <footer class="footer">
                <span>Copyright &copy; 2018 FixedPlus</span>
            </footer>

</section>
<!-- ============================================================== -->
<!--                    	  Content End           		-->
<!-- ============================================================== -->

<div id="newModelId" class="modal fadeIn myModel" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <form id="newProductForm" method="POST" name="newProductForm" enctype="multipart/form-data">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                      class="fa fa-times"></span>
                    </button>
                    <h5 class="modal-title" id="myModalLabel">Create New Category</h5>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newCatogory">
                                <h5>
                                    <small>Category</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="newCatogory" name="newCatogory"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="newstatus">
                                <h5>
                                    <small>Status</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="checkbox" id="newstatus" name="newstatus"
                                           class="checkbox-primary form-control " checked=""/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">

                        <div class="col-md-6">
                            <label for="newproductImageChoser">
                                <h5>
                                    <small>Select Category Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" accept=".jgp,.png" id="newproductImageChoser"
                                           onchange="encodeImageFileAsURL();"
                                           name="newproductImageChoser"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" id="newBtn" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </form>
    </div>
</div>

<!--             new type model started   -->
<div id="typeModel" class="modal fadeIn myModel" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <form id="newTypeForm" method="POST" name="newProductForm" enctype="multipart/form-data">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                      class="fa fa-times"></span>
                    </button>
                    <h5 class="modal-title" id="myModalLabel">Create New Menu Type</h5>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newType">
                                <h5>
                                    <small>Type</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="newMenuType" name="newMenuType"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="typeCategory">
                                <h5>
                                    <small>Select Category</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <select class="form-control dropdown " name="typeCategory" id="typeCategory"
                                            onchange="window.alert(this.value);"></select>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="newTypestatus">
                                <h5>
                                    <small>Status</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="checkbox" id="newstatus" name="newstatus"
                                           class="checkbox-primary form-control " checked/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">

                        <div class="col-md-6">
                            <label for="newTypeImageChoser">
                                <h5>
                                    <small>Select Type Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" accept=".jgp,.png" id="newTypeImageChoser"
                                           onchange="encodeImageFileAsURL();"
                                           name="newTypeImageChoser"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" id="newBtn" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </form>
    </div>
</div>

<!--            Item add model          -->
<div id="itemModel" class="modal fadeIn myModel" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <form id="newItemModel" method="POST" name="newProductForm" enctype="multipart/form-data">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                      class="fa fa-times"></span>
                    </button>
                    <h5 class="modal-title" id="myModalLabel">Create New Item</h5>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newItem">
                                <h5>
                                    <small>Item</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="newItem" name="newItem"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="typeCategory">
                                <h5>
                                    <small>Select Type</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <select class="form-control dropdown" id="itemType" name="itemType"></select>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="newItemstatus">
                                <h5>
                                    <small>Status</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="checkbox" id="newItemstatus" name="newItemstatus"
                                           class="checkbox-primary form-control " checked=""/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="costPrice">
                                <h5>
                                    <small>Cost Price</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="number" id="costPrice" name="ecostPrice"
                                           class="form-control number " min="0"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="sellPrice">
                                <h5>
                                    <small>Selling Price</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="number" id="sellPrice" name="esellPrice"
                                           class="form-control number" min="0"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">

                        <div class="col-md-6">
                            <label for="newItemImageChoser">
                                <h5>
                                    <small>Select Product Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" accept=".jgp,.png" id="newItemImageChoser"
                                           onchange="encodeImageFileAsURL();"
                                           name="newItemImageChoser"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" id="newBtn" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </form>
    </div>
</div>
<!---Update Model------>

<div id="editModelID" class="modal fadeIn myModel" role="dialog">
    <form id="categoryupdateForm" name="categoryupdateForm" enctype="multipart/form-data">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                      class="fa fa-times"></span>
                    </button>
                    <h5 class="modal-title" id="editModalLabel">Edit Category</h5>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <input type="hidden" id="editId" name="editId"/>
                            <label for="editCatogory">
                                <h5>
                                    <small>Category</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="editCatogory" name="editCatogory"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="editStatusCheck">
                                <h5>
                                    <small>Status</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="checkbox" id="editStatusCheck" name="editStatusCheck"
                                           class="checkbox-primary form-control" checked=""/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">

                        <div class="col-md-6">
                            <label for="ediproductImageChoser">
                                <h5>
                                    <small>Select Product Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" accept=".jgp,.png" id="ediproductImageChoser"
                                           onchange="encodeImageFileAsURL();"
                                           name="ediproductImageChoser"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" id="updateBtn" class="btn btn-warning">Save changes</button>
                </div>
            </div>
        </div>
    </form>
</div>
<!---Update Model------>

<div id="editType" class="modal fadeIn myModel" role="dialog">
    <form id="typeupdateForm" name="typeupdateForm" enctype="multipart/form-data">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                      class="fa fa-times"></span>
                    </button>
                    <h5 class="modal-title" id="edittypeLabel">Edit Type</h5>
                </div>
                <div class="modal-body">

                    <input type="hidden" id="typeId" name="typeId"/>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editType">
                                <h5>
                                    <small>Type</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="editTypeN" name="editTypeN"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="edittypeCategory">
                                <h5>
                                    <small>Select Category</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <select class="form-control dropdown" id="edittypeCategory"
                                            name="edittypeCategory"></select>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="editTypeStatusCheck">
                                <h5>
                                    <small>Status</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="checkbox" id="editTypeStatusCheck" name="editTypeStatusCheck"
                                           class="checkbox-primary form-control" checked=""/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">

                        <div class="col-md-6">
                            <label for="editTypeImageChoser">
                                <h5>
                                    <small>Select Type Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" accept=".jgp,.png" id="editTypeImageChoser"
                                           onchange="encodeImageFileAsURL();"
                                           name="editTypeImageChoser"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" id="updateBtn" class="btn btn-warning">Save changes</button>
                </div>
            </div>
        </div>
    </form>
</div>
<!---Update Model------>

<div id="editItem" class="modal fadeIn " role="dialog">
    <form id="itemUpdateForm" name="productupdateForm" enctype="multipart/form-data">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                      class="fa fa-times"></span>
                    </button>
                    <h5 class="modal-title" id="edititemLabel">Item Details</h5>
                </div>
                <div class="modal-body">
                    <ul class="nav nav-tabs">
                        <li class='nav-item' role='presentation'><a class='nav-link active' modelID="newModelId"
                                                                    href='#aa' aria-controls='aa' role='tab'
                                                                    data-toggle='tab' aria-selected='true'>Edit
                            Details</a></li>
                        <li class='nav-item' role='presentation'><a class='nav-link ' modelID="newModelId" href='#dd'
                                                                    aria-controls='dd' role='tab' data-toggle='tab'
                                                                    aria-selected='true'>Item Recipe</a></li>
                    </ul>
                    <div class="tab-content">
                        <div role='tabpanel' class='tab-pane active' id="aa">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-6">
                                        <input type="hidden" id="itemId" name="itemId"/>
                                        <label for="editItem">
                                            <h5>
                                                <small>Item</small>
                                            </h5>
                                        </label>
                                        <div class="form-group">
                                            <div class="input-group m-b">
                                                <input type="text" id="editItemN" name="editItemN"
                                                       class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <label for="editItemType">
                                            <h5>
                                                <small>Select Type</small>
                                            </h5>
                                        </label>
                                        <div class="form-group">
                                            <div class="input-group m-b">
                                                <select class="form-control dropdown" id="editItemType"
                                                        name="editItemType"></select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <label for="newstatus">
                                            <h5>
                                                <small>Status</small>
                                            </h5>
                                        </label>
                                        <div class="form-group">
                                            <div class="input-group m-b">
                                                <span><i></i></span>
                                                <input type="checkbox" id="editItemStatusCheck"
                                                       name="editItemStatusCheck"
                                                       class="checkbox-primary form-control" checked=""/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label for="costPrice">
                                            <h5>
                                                <small>Cost Price</small>
                                            </h5>
                                        </label>
                                        <div class="form-group">
                                            <div class="input-group m-b">
                                                <input type="number" id="ecostPrice" name="ecostPrice"
                                                       class="form-control number " min="0"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <label for="sellPrice">
                                            <h5>
                                                <small>Selling Price</small>
                                            </h5>
                                        </label>
                                        <div class="form-group">
                                            <div class="input-group m-b">
                                                <input type="number" id="esellPrice" name="esellPrice"
                                                       class="form-control number" min="0"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6">
                                        <label for="editItemImageChoser">
                                            <h5>
                                                <small>Select Product Image</small>
                                            </h5>
                                        </label>
                                        <div class="form-group">
                                            <div class="input-group m-b">
                                                <input type="file" accept=".jgp,.png" id="editItemImageChoser"
                                                       onchange="encodeImageFileAsURL();"
                                                       name="editItemImageChoser"
                                                       class="form-control"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div role='tabpanel' class='tab-pane' id="dd">
                            <div class="card-body">
                                <div class="col-lg-12 col-md-12">
                                    <div class="col-lg-12 row">
                                        <div class="form-group col-lg-7 col-md-7">
                                            <label class="control-label">Select Product:</label>
                                            <select class="form-control dropdown" id="pros"></select>
                                        </div>
                                        <div class="form-group col-lg-3 col-md-3">
                                            <label class="control-label">Enter Quantity :</label>
                                            <input type="number" class="form-control" min="1" id="pqty"/>
                                        </div>
                                        <button type="button" class="btn btn-info btn-icon" onclick="addProductI()"><i
                                                class="icon icon-plus"></i>Add
                                        </button>
                                    </div>
                                    <table class="table table-striped col-12" id="recipeTable">
                                        <thead>
                                        <tr>
                                            <th>Product Name</th>
                                            <th>Qty</th>
                                            <th>Actions</th>
                                        </tr>
                                        </thead>
                                        <tbody id="recipeTableBody"></tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" id="updateBtn" class="btn btn-warning">Save changes</button>
                </div>
            </div>
        </div>
    </form>
</div>
<!-- Model End--->
<!-- Common Plugins -->
<script src="<c:url value="/assets/lib/jquery/dist/jquery.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/popper.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/pace/pace.min.js"/>"></script>
<script src="<c:url value="/assets/lib/jasny-bootstrap/js/jasny-bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/slimscroll/jquery.slimscroll.min.js"/>"></script>
<script src="<c:url value="/assets/lib/nano-scroll/jquery.nanoscroller.min.js"/>"></script>
<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>
<script src="<c:url value="/assets/js/custom.js"/>"></script>

<script src="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.js"/>" type="text/javascript"></script>

<!-- DataTables-->
<script src="<c:url value="/assets/lib/datatables/jquery.dataTables.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/dataTables.responsive.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/dataTables.buttons.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/jszip.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/pdfmake.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/vfs_fonts.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/buttons.html5.min.js"/>"></script>

<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>
<!-- Toast -->
<script src="<c:url value="/assets/lib/toast/jquery.toast.min.js"/>"></script>

<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>

<script src="<c:url value="/assets/lib/pace/pace.min.js"/>"></script>
<!-- Jquery UI -->
<script src="<c:url value="/assets/lib/jquery-ui/jquery-ui.min.js"/>"></script>
<script src="<c:url value="/assets/js/jquery.ui.custom.js"/>"></script>
<script src="<c:url value="/assets/js/jquery.base64.js"/>"></script>
<script type="text/javascript">
    $(document).ready(function () {

        $("#recipeTable").dataTable();
        $("#datatable2").DataTable({
            dom: 'Bfrtip',
            buttons: [
                'copyHtml5',
                'excelHtml5',
                'csvHtml5',
                'pdfHtml5'
            ],
            scrollX: true, "autoWidth": false, "width": '100%',
            "processing": true,
            "serverSide": false,
            "info": true,
            "destroy": true,
            "pagination": true,
            "lengthChange": true,
            "pageLength": 10,
            "ajax": {
                'url': 'menucategory/all',
                'type': 'GET',
                'data': '',
                'dataSrc': ""
            },
            "columns": [
                {"data": 'idmenucategoy'},
                {"data": 'menucategoy'},
                {
                    "render": function (data, type, JsonResultRow, meta) {
                        return '<img height="60px" width="60px" src="' + JsonResultRow.icon + '">' + '<input type="hidden" class="cid" value="' + JsonResultRow.idmenucategoy + '" />';
                    }
                },
                {
                    "render": function (data, type, JsonResultRow, meta) {
                        if (JsonResultRow.status === 1) {
                            return '<label class="btn btn-success">Active</label>';
                        } else {
                            return '<label class="btn btn-danger">Deactive</label>';
                        }
                    }
                },
                {
                    sortable: false,
                    "render": function (data, type, full, meta) {
                        //  var myData = full.getStatus;
                        return '<button type="button" class="edit btn btn-sm btn-success" data-set=' + JSON.stringify(full) + '><i class="fa fa-edit"></i></button><button type="button" class="delete btn btn-sm btn-danger" data-set=' + JSON.stringify(full) + '><i class="fa fa-trash"></i>Delete</button>';
                    }
                }
            ]

        });
        //-----------------------------------------------------------------------------------------------------------------------------
        //                 - DATA SAVE AND UPDATE STARTED -
        //-----------------------------------------------------------------------------------------------------------------------------

        $('#categoryupdateForm').submit(function () {
            // show that something is loading
            //  $('#response').html("<b>Loading response...</b>");
            // var formData = $(this).serialize();
            //stop submit the form, we will post it manually.
            event.preventDefault();
            // Get form
            var form = $('#categoryupdateForm')[0];
            // Create an FormData object
            var data = new FormData(form);
            // Call ajax for pass data to other place
            $.ajax({
                type: 'POST',
                enctype: 'multipart/form-data',
                url: 'menucategory/update',
                data: data,
                processData: false,
                contentType: false,
                cache: false,
                timeout: 600000, // getting filed value in serialize form
            }).done(function (data) { // if getting done then call.
                $("#datatable2").DataTable().ajax.reload();
                $('#editModelID').modal('toggle');
                // show the response
                //    $('#response').html(data);
                $.toast({
                    heading: 'Success !',
                    text: 'Updated Successfully !',
                    position: 'top-right',
                    loaderBg: '#fff',
                    icon: 'success',
                    hideAfter: 3000,
                    stack: 1
                });
            }).fail(function () { // if fail then getting message
                $.toast({
                    heading: 'Fails !',
                    text: 'Category Add Failed... !',
                    position: 'top-right',
                    loaderBg: '#fff',
                    icon: 'error',
                    hideAfter: 3000,
                    stack: 1
                });

            });
            // to prevent refreshing the whole page page
            return false;
        });

        $('#newProductForm').submit(function () {
            // show that something is loading
            //  $('#response').html("<b>Loading response...</b>");
            //                                                                     var formData = $(this).serialize();
            //stop submit the form, we will post it manually.
            event.preventDefault();
            // Get form
            var form = $('#newProductForm')[0];
            // Create an FormData object
            //                                                                    var data = new FormData(form);
            //                                                                    var data = FormData;
            var data = new FormData(form);
            // Call ajax for pass data to other place
            $.ajax({
                type: 'POST',
                enctype: 'multipart/form-data',
                url: 'menucategory/add',
                data: data,
                processData: false,
                contentType: false,
                cache: false,
                timeout: 600000 // getting filed value in serialize form
            }).done(function (data) { // if getting done then call.
                // show the response
                //    $('#response').html(data);
                $.toast({
                        heading: 'Success !',
                        text: 'Save Successfully !',
                        position: 'top-right',
                        loaderBg: '#fff',
                        icon: 'success',
                        hideAfter: 3000,
                        stack: 1
                    }
                );
                $('#newModelId').modal('toggle');
                $("#newServicesForm")[0].reset();
                $('#newServicesForm').find('input[type="text"]').val('');
                $('#newServicesForm').find('img').removeAttr('src');
                $("#datatable2").DataTable().ajax.reload();
            }).fail(function () { // if fail then getting message
                $.toast({
                    heading: 'Fails !',
                    text: 'Updated Failed... !',
                    position: 'top-right',
                    loaderBg: '#fff',
                    icon: 'error',
                    hideAfter: 3000,
                    stack: 1
                });
            });
            // to prevent refreshing the whole page page
            return false;

        });

        $('#typeupdateForm').submit(function () {
            event.preventDefault();
            // Get form
            var form = $('#typeupdateForm')[0];
            var data = new FormData(form);
            $.ajax({
                type: 'POST',
                enctype: 'multipart/form-data',
                url: 'menutypes/update',
                data: data,
                processData: false,
                contentType: false,
                cache: false,
                timeout: 600000 // getting filed value in serialize form
            }).done(function (data) { // if getting done then call.
                // show the response
                $.toast({
                        heading: 'Success !',
                        text: 'Save Successfully !',
                        position: 'top-right',
                        loaderBg: '#fff',
                        icon: 'success',
                        hideAfter: 3000,
                        stack: 1
                    }
                );
                $('#editType').modal('toggle');
                $("#newTypeForm")[0].reset();
                $('#editType').find('input[type="text"]').val('');
                $('#editType').find('img').removeAttr('src');
                $("#datatable3").DataTable().ajax.reload();
            }).fail(function () { // if fail then getting message
                $.toast({
                    heading: 'Fails !',
                    text: 'New Type Add Failed... !',
                    position: 'top-right',
                    loaderBg: '#fff',
                    icon: 'error',
                    hideAfter: 3000,
                    stack: 1
                });
            });
            // to prevent refreshing the whole page page
            return false;

        });

        $('#typeModel').submit(function () {
            // show that something is loading
            //  $('#response').html("<b>Loading response...</b>");
            //                                                                     var formData = $(this).serialize();
            //stop submit the form, we will post it manually.
            event.preventDefault();
            // Get form
            var form = $('#newTypeForm')[0];
            // Create an FormData object
            //                                                                    var data = new FormData(form);
            //                                                                    var data = FormData;
            var data = new FormData(form);
            // Call ajax for pass data to other place
            $.ajax({
                type: 'POST',
                enctype: 'multipart/form-data',
                url: 'menutypes/add',
                data: data,
                processData: false,
                contentType: false,
                cache: false,
                timeout: 600000 // getting filed value in serialize form
            }).done(function (data) { // if getting done then call.
                // show the response
                $.toast({
                        heading: 'Success !',
                        text: 'Save Successfully !',
                        position: 'top-right',
                        loaderBg: '#fff',
                        icon: 'success',
                        hideAfter: 3000,
                        stack: 1
                    }
                );
                $('#typeModel').modal('toggle');
                $("#newTypeForm")[0].reset();
                $('#typeModel').find('input[type="text"]').val('');
                $('#typeModel').find('img').removeAttr('src');
                $("#datatable3").DataTable().ajax.reload();
            }).fail(function () { // if fail then getting message
                $.toast({
                    heading: 'Fails !',
                    text: ' Type Update Failed... !',
                    position: 'top-right',
                    loaderBg: '#fff',
                    icon: 'error',
                    hideAfter: 3000,
                    stack: 1
                });
            });
            // to prevent refreshing the whole page page
            return false;

        });

        $('#newItemModel').submit(function () {
            // show that something is loading
            //  $('#response').html("<b>Loading response...</b>");
            //                                                                     var formData = $(this).serialize();
            //stop submit the form, we will post it manually.
            event.preventDefault();
            // Get form
            var form = $('#newItemModel')[0];
            // Create an FormData object
            //                                                                    var data = new FormData(form);
            //                                                                    var data = FormData;
            var data = new FormData(form);
            // Call ajax for pass data to other place
            $.ajax({
                type: 'POST',
                enctype: 'multipart/form-data',
                url: 'menuitems/add',
                data: data,
                processData: false,
                contentType: false,
                cache: false,
                timeout: 600000 // getting filed value in serialize form
            }).done(function (data) { // if getting done then call.
                // show the response
                $.toast({
                        heading: 'Success !',
                        text: 'Save Successfully !',
                        position: 'top-right',
                        loaderBg: '#fff',
                        icon: 'success',
                        hideAfter: 3000,
                        stack: 1
                    }
                );
                $('#itemModel').modal('toggle');
                $("#newItemModel")[0].reset();
                $('#itemModel').find('input[type="text"]').val('');
                $('#itemModel').find('img').removeAttr('src');
                $("#datatable4").DataTable().ajax.reload();
            }).fail(function () { // if fail then getting message
                $.toast({
                    heading: 'Fails !',
                    text: ' Item Add Failed... !',
                    position: 'top-right',
                    loaderBg: '#fff',
                    icon: 'error',
                    hideAfter: 3000,
                    stack: 1
                });
            });
            // to prevent refreshing the whole page page
            return false;

        });

        $('#itemUpdateForm').submit(function () {
            event.preventDefault();
            // Get form
            var form = $('#itemUpdateForm')[0];
            var data = FormData;
            var data = new FormData(form);
            $.ajax({
                type: 'POST',
                enctype: 'multipart/form-data',
                url: 'menuitems/update',
                data: data,
                processData: false,
                contentType: false,
                cache: false,
                timeout: 600000 // getting filed value in serialize form
            }).done(function (data) { // if getting done then call.
                // show the response
                $.toast({
                        heading: 'Success !',
                        text: 'Save Successfully !',
                        position: 'top-right',
                        loaderBg: '#fff',
                        icon: 'success',
                        hideAfter: 3000,
                        stack: 1
                    }
                );
                $('#editItem').modal('toggle');
                $("#itemUpdateForm")[0].reset();
                $('#editItem').find('input[type="text"]').val('');
                $('#editItem').find('img').removeAttr('src');
                $("#datatable4").DataTable().ajax.reload();
            }).fail(function () { // if fail then getting message
                $.toast({
                    heading: 'Fails !',
                    text: ' Item Update Failed... !',
                    position: 'top-right',
                    loaderBg: '#fff',
                    icon: 'error',
                    hideAfter: 3000,
                    stack: 1
                });
            });
            // to prevent refreshing the whole page page
            return false;

        });

    });//redy scope end................................................


    function loadMenuTypes() {
        $("#datatable3").DataTable({
            dom: 'Bfrtip',
            buttons: [
                'copyHtml5',
                'excelHtml5',
                'csvHtml5',
                'pdfHtml5'
            ],
            scrollX: true, "autoWidth": false, "width": '100%',
            "processing": true,
            "serverSide": false,
            "info": true,
            "destroy": true,
            "pagination": true,
            "lengthChange": true,
            "pageLength": 10,
            "ajax": {
                'url': 'menutypes/all',
                'type': 'GET',
                'data': '',
                'dataSrc': ""
            },
            "columns": [
                {"data": 'idmenutype'},
                {"data": 'menutype'},
                {
                    "render": function (data, type, JsonResultRow, meta) {
                        return '<img height="60px" width="60px" src="' + JsonResultRow.icon + '">' + '<input type="hidden" class="cid" value="' + JsonResultRow.idmenucategoy + '" />';
                    }
                },
                {
                    "render": function (data, type, JsonResultRow, meta) {
                        if (JsonResultRow.status === 1) {
                            return '<label class="btn btn-success">Active</label>';
                        } else {
                            return '<label class="btn btn-danger">Deactive</label>';
                        }
                    }
                },
                {
                    "render": function (data, type, full, meta) {
                        //  var myData = full.getStatus;
                        return '<lable class="form-control category " >' + full.menucategoyByMenucategoyIdmenucategoy.menucategoy + '</lable> ';

                    }
                },
                {
                    sortable: false,
                    "render": function (data, type, full, meta) {
                        //  var myData = full.getStatus;
                        return '<button type="button" class="edit btn btn-sm btn-success" data-set=' + JSON.stringify(full) + '><i class="fa fa-edit"></i></button><button type="button" class="delete btn btn-sm btn-danger" data-set=' + JSON.stringify(full) + '><i class="fa fa-trash"></i>Delete</button>';
                    }
                }
            ]

        });
    }
    function loadMenuItems() {
        $("#datatable4").DataTable({
            dom: 'Bfrtip',
            buttons: [
                'copyHtml5',
                'excelHtml5',
                'csvHtml5',
                'pdfHtml5'
            ],
            scrollX: true, "autoWidth": false, "width": '100%',
            "processing": true,
            "serverSide": false,
            "info": true,
            "destroy": true,
            "pagination": true,
            "lengthChange": true,
            "pageLength": 10,
            "ajax": {
                'url': 'menuitems/all',
                'type': 'GET',
                'data': '',
                'dataSrc': ""
            },
            "columns": [
                {"data": 'idmenuitem'},
                {"data": 'menuitem'},
                {
                    "render": function (data, type, full, meta) {
                        //  var myData = full.getStatus;
                        return '<lable class="form-control category " >' + full.menutypeByMenutypeIdmenutype.menutype + '</lable> ';

                    }
                },
                {"data": 'costprice'},
                {"data": 'selligprice'},
                {
                    "render": function (data, type, JsonResultRow, meta) {
                        return '<img height="60px" width="60px" src="' + JsonResultRow.icon + '">';
                    }
                },
                {
                    "render": function (data, type, JsonResultRow, meta) {
                        if (JsonResultRow.status === 1) {
                            return '<label class="btn btn-success">Active</label>';
                        } else {
                            return '<label class="btn btn-danger">Deactive</label>';
                        }
                    }
                },
                {
                    sortable: false,
                    "render": function (data, type, full, meta) {
                        //  var myData = full.getStatus;
                        return '<button type="button" class="btn btn-sm btn-default"><em class="fa fa-search"></em></button><button type="button" class="edit btn btn-sm btn-success" data-set=\'' + JSON.stringify(full) + '\'><i class="fa fa-edit"></i></button><button type="button" class="delete btn btn-sm btn-danger" data-set=' + JSON.stringify(full) + '><i class="fa fa-trash"></i>Delete</button>';
                    }
                }
            ]
        });
    }
</script>
<script type="text/javascript">
    function encodeImageFileAsURL(cb) {
        return function () {
            var file = this.files[0];
            var reader = new FileReader();
            reader.onloadend = function () {
                cb(reader.result);
            };
            reader.readAsDataURL(file);
        }
    }

    $('#newproductImageChoser').change(encodeImageFileAsURL(function (base64Img) {
        $('#newProductImageBaseCode').val($.base64.encode(base64Img));
        $('#newProductImageView').attr('src', base64Img);
    }));
    $('#editproductImageChoser').change(encodeImageFileAsURL(function (base64Img) {
        $('#editProductImageBaseCode').val($.base64.encode(base64Img));
        $('#editProductImageView').attr('src', base64Img);
    }));
</script>
<script type="text/javascript">
    $(function () {
        loadCategory();
        loadType();
        loadProducts();
        $("#datatable2").on("click", ".delete", function () {
            var data = $("#datatable2").DataTable().row($(this).parents('tr')).data();
            // var data = $(this).data("set");
            var parent = $(this).parent().parent();

            swal({
                title: data.menucategoy + ' Delete ?',
                text: 'Are you sure about this action ?',
                type: 'warning',
                showCancelButton: true,
                confirmButtonColor: '#3085d6',
                cancelButtonColor: '#d33',
                cancelButtonText: 'Cancel',
                confirmButtonText: 'Delete',
                confirmButtonClass: 'btn btn-space btn-lg btn-success hover',
                cancelButtonClass: 'btn btn-space btn-lg btn-danger hover',
                buttonsStyling: false,
                preConfirm: function () {
                    return new Promise(function (resolve) {
                        $.ajax({
                            url: 'menucategory/delete/' + data.idmenucategoy,
                            type: 'POST',
                            data: {
                                id: data.idmenucategoy
                            },
                            dataType: 'JSON'
                        }).done(function (response) {
                            swal({
                                title: 'Deleted!',
                                text: data.menucategoy + ' successfully deleted.',
                                type: 'success',
                                confirmButtonClass: 'btn btn-space btn-lg btn-primary hover',
                                confirmButtonText: 'Ok',
                                buttonsStyling: false
                            });
                            parent.fadeOut(400, function () {
                                parent.remove();
                            });
                            $('html, body').animate({
                                scrollTop: 0
                            }, 600);

                        }).fail(function () {
                            swal({
                                title: 'An error occurred',
                                text: 'Please try again later :)',
                                type: 'error',
                                confirmButtonClass: 'btn btn-primary btn-lg',
                                buttonsStyling: false
                            });
                        });
                    });
                },
                allowOutsideClick: false
            });
        });
        $("#datatable2").on("click", ".edit", function () {
            //   var data = $(this).data("set");
            var data = $("#datatable2").DataTable().row($(this).parents('tr')).data();
            $('#editModelID').modal('toggle');
            $('#editCatogory').val(data.menucategoy.toString());
            $('#editModalLabel').text(data.menucategoy.toString());
            //                                $('#ediproductImageChoser').val(data.icon.toString());
            //                                $('#ediproductImageChoser').attr('src', data.icon.toString());
            $('#editId').val(data.idmenucategoy.toString());
            $('#editStatusCheck').removeAttr('checked');
            if (data.status === 0) {
                $('#editStatusCheck').prop('checked', false);
            } else if (data.status === 1) {
                $('#editStatusCheck').prop('checked', true);
            }
        });
        $("#datatable3").on("click", ".edit", function () {
            //   var data = $(this).data("set");
            var data = $("#datatable3").DataTable().row($(this).parents('tr')).data();
            $('#editType').modal('toggle');
            $('#editTypeN').val(data.menutype);
            $('#edittypeLabel').text(data.menutype);
            $('#edittypeCategory').val(data.menucategoyIdmenucategoy).trigger('change');
            //                                $('#editTypeImageChoser').val(data.icon.toString());
            //                                $('#editTypeImageChoser').attr('src', data.icon.toString());
            $('#typeId').val(data.idmenutype.toString());
            $('#editTypeStatusCheck').removeAttr('checked');
            if (data.status === 0) {
                $('#editTypeStatusCheck').prop('checked', false);
            } else if (data.status === 1) {
                $('#editTypeStatusCheck').prop('checked', true);
            }
        });
        $("#datatable4").on("click", ".edit", function () {
            //   var data = $(this).data("set");
            var data = $("#datatable4").DataTable().row($(this).parents('tr')).data();
            $('#editItem').modal('toggle');
            $('#ecostPrice').val(data.costprice);
            $('#esellPrice').val(data.selligprice);
            $('#editItemN').val(data.menuitem);
            $('#edititemLabel').text(data.menuitem);
            $('#editItemType').val(data.menutypeIdmenutype);
            $('#editItemImageChoser').attr('src', data.icon.toString());
            $('#editItemImageChoser').attr('src', data.icon.toString());
            $('#itemId').val(data.idmenuitem.toString());
            $('#editItemStatusCheck').removeAttr('checked');
            if (data.status === 0) {
                $('#editItemStatusCheck').prop('checked', false);
            } else if (data.status === 1) {
                $('#editItemStatusCheck').prop('checked', true);
            }
            //                                Load Recipe   -----------------
            $.ajaxSetup({cache: false});
            $.getJSON('<%=request.getContextPath()%>/menuhasproduct/findByMenu/' + parseInt(data.idmenuitem), function (data) {
                $('#recipeTableBody').html('');
                $.each(data, function (i, val) {
                    $('#recipeTableBody').append("<tr > <td>" + val.productByProductIdproduct.description + "</td> <td>" + val.qty + "</td> <td><button type='button' class='btn btn-danger btn-icon' onclick='removeProduct(" + val.idproductHasMenuitem + "),$(this).parents(\"tr\").remove()'><i class='icon icon-trash'></i>Remove</button></td> </tr>");
                });
            }).error(function () {
                swal({
                    title: "GRN'S Lording Error..",
                    text: "Something Wrong In Server Side !!{code :Sup-Lod}",
                    type: "error",
                    confirmButtonClass: 'btn-danger',
                    confirmButtonText: 'Close'
                });
            });
            //                                Load Recipe   -----------------
        });
        $('#datatable2').dataTable();
        $('#datatable3').dataTable();
        $('#datatable4').dataTable();

    });
    function removeProduct(val) {
        if (parseInt(val) > 0 && val !== undefined) {
            $.ajax("<%=request.getContextPath()%>/menuhasproduct/delete/" + parseInt(val), {
                type: 'GET',
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data, textStatus, jqXHR) {
                    $('#grn_table').find("tr[id='" + val + "']").remove();
                    swal({
                        title: "Product Removed..",
                        text: "Draft Has Been Removed Successfully..",
                        type: "success",
                        confirmButtonClass: 'btn-success',
                        confirmButtonText: 'Ok'
                    });
                }, error: function (jqXHR, textStatus, errorThrown) {
                    swal({
                        title: "GRN Item Delete NOT Success..",
                        text: "Something Wrong In Server Side !!{code :OT-sv}",
                        type: "error",
                        confirmButtonClass: 'btn-danger',
                        confirmButtonText: 'Close'
                    });
                }
            });
        }
    }
    function loadModal() {
        $("#" + $("#tabs").find('a.active').attr('modelID')).modal('show');
    }
    function loadCategory() {
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/menucategory/all', function (data) {
            $('#typeCategory').html('');
            $('#edittypeCategory').html('');
            $.each(data, function (i, val) {
                $('#typeCategory').append("<option value='" + val.idmenucategoy + "' >" + val.menucategoy + "</option>");
                $('#edittypeCategory').append("<option value='" + val.idmenucategoy + "' >" + val.menucategoy + "</option>");
            });
        }).error(function () {
            swal({
                title: "menu category's Lording Error..",
                text: "Something Wrong In Server Side !!{code :Sup-Lod}",
                type: "error",
                confirmButtonClass: 'btn-danger',
                confirmButtonText: 'Close'
            });
        });
    }
    function loadType() {
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/menutypes/all', function (data) {
            $('#itemType').html('');
            $('#editItemType').html('');
            $.each(data, function (i, val) {
                $('#itemType').append("<option value='" + val.idmenutype + "' >" + val.menutype + "</option>");
                $('#editItemType').append("<option value='" + val.idmenutype + "' >" + val.menutype + "</option>");
            });
        }).error(function () {
            swal({
                title: "menu type's Lording Error..",
                text: "Something Wrong In Server Side !!{code :Sup-Lod}",
                type: "error",
                confirmButtonClass: 'btn-danger',
                confirmButtonText: 'Close'
            });
        });
    }

    // Recipi actions started...

    function loadProducts() {
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/products/all', function (data) {
            $('#pros').html('');
            $.each(data, function (i, val) {
                $('#pros').append("<option id='" + val.idproduct + "' >" + val.description + "</option>");
            });
        }).error(function () {
            swal({
                title: "products's Lording Error..",
                text: "Something Wrong In Server Side !!{code :Sup-Lod}",
                type: "error",
                confirmButtonClass: 'btn-danger',
                confirmButtonText: 'Close'
            });
        });
    }
    function addProductI() {
        var id = 0;
        $("#pros").find('option').each(function (i, val) {
            if ($(val).text() === $("#pros").val()) {
                id = this.id;
            }
        });
        if ($("#pros").val() !== undefined) {
            var ob = {};
            ob.productIdproduct = id;
            ob.menuitemIdmenuitem = $("#itemId").val();
            ob.qty = $("#pqty").val();
            $.ajax("<%=request.getContextPath()%>/menuhasproduct/add", {
                type: 'POST',
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                data: JSON.stringify(ob),
                success: function (data, textStatus, jqXHR) {
                    $.ajaxSetup({cache: false});
                    $.getJSON('<%=request.getContextPath()%>/menuhasproduct/findByMenu/' + parseInt($("#itemId").val()), function (data) {
                        $('#recipeTableBody').html('');
                        $.each(data, function (i, val) {
                            $('#recipeTableBody').append("<tr > <td>" + val.productByProductIdproduct.description + "</td> <td>" + val.qty + "</td> <td><button class='btn btn-danger btn-icon' onclick='removeProduct(" + val.idproductHasMenuitem + "),$(this).parents(\'tr\').remove()'><i class='icon icon-trash'></i>Remove</button></td> </tr>");
                        });
                    }).error(function () {
                        swal({
                            title: "GRN'S Lording Error..",
                            text: "Something Wrong In Server Side !!{code :Sup-Lod}",
                            type: "error",
                            confirmButtonClass: 'btn-danger',
                            confirmButtonText: 'Close'
                        });
                    });
                }, error: function (jqXHR, textStatus, errorThrown) {
                    swal({
                        title: "GRN Header Create NOT Success..",
                        text: "Something Wrong In Server Side !! code :OT-sv",
                        type: "error",
                        confirmButtonClass: 'btn-danger',
                        confirmButtonText: 'Close'
                    });
                }
            });
        } else {
            swal({
                title: "Select Suplier First..",
                text: "Some Steps Missed..!!!{PID:check}",
                type: "warning",
                confirmButtonClass: 'btn-warning',
                confirmButtonText: 'Close'
            });
        }
    }
</script>
</body>
</html>