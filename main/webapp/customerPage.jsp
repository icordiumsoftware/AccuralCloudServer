<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<%
    try {
        if (request.getSession().getAttribute("userid").equals(null)) {
            response.sendRedirect(request.getServletContext().getContextPath() + "/login");
        }
    } catch (NullPointerException e) {
        response.sendRedirect(request.getServletContext().getContextPath() + "/login");
    }
%>
<head>
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
    <!-- Date Picker-->
    <link href="<c:url value="/assets/lib/bootstrap-daterangepicker/daterangepicker.css"/>" type="text/css"
          rel="stylesheet">
    <!-- DataTables -->
    <link href="<c:url value="/assets/lib/datatables/jquery.dataTables.min.css"/>" rel="stylesheet"
          type="text/css">
    <link href="<c:url value="/assets/lib/datatables/responsive.bootstrap.min.css"/>" rel="stylesheet"
          type="text/css">
    <link href="<c:url value="/assets/lib/datatables/buttons.dataTables.css"/>" rel="stylesheet" type="text/css">

    <!-- Custom Css-->
    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet">
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
                                                             src="<c:url value="/assets/img/avtar-2.png"/>"
                                                             width="50">
													</span>
                                            <span class="notification-title">
													John Doe
													<label class="label label-warning float-right">Support</label>
													</span>
                                            <span class="notification-description">Lorem Ipsum is simply dummy text of the printing.</span>
                                            <span class="notification-time">15 minutes ago</span>
                                        </a>

                                        <a class="clearfix" href="javascript:%20void(0);">
													<span class="notification-icon">
													<img alt="" class="rounded-circle"
                                                         src="<c:url value="/assets/img/avtar-3.png"/>"
                                                         width="50">
													</span>
                                            <span class="notification-title">
													Govindo Doe
													<label class="label label-warning float-right">Support</label>
													</span>
                                            <span class="notification-description">Lorem Ipsum is simply dummy text of the printing.</span>
                                            <span class="notification-time">15 minutes ago</span>
                                        </a>

                                        <a class="clearfix" href="javascript:%20void(0);">
													<span class="notification-icon">
													<img alt="" class="rounded-circle"
                                                         src="<c:url value="/assets/img/avtar-4.png"/>"
                                                         width="50">
													</span>
                                            <span class="notification-title">
													Megan Doe
													<label class="label label-warning float-right">Support</label>
													</span>
                                            <span class="notification-description">Lorem Ipsum is simply dummy text of the printing.</span>
                                            <span class="notification-time">15 minutes ago</span>
                                        </a>

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
                                                        <i class="icon-cloud-upload text-primary"></i>
                                                    </span>
                                            <span class="notification-title">Upload Complete</span>
                                            <span class="notification-description">Lorem Ipsum is simply dummy text of the printing.</span>
                                            <span class="notification-time">15 minutes ago</span>
                                        </a>

                                        <a class="clearfix" href="javascript:%20void(0);">
                                                    <span class="notification-icon">
                                                        <i class="icon-info text-warning"></i>
                                                    </span>
                                            <span class="notification-title">Storage Space low</span>
                                            <span class="notification-description">Lorem Ipsum is simply dummy text of the printing.</span>
                                            <span class="notification-time">15 minutes ago</span>
                                        </a>

                                        <a class="clearfix" href="javascript:%20void(0);">
                                                    <span class="notification-icon">
                                                        <i class="icon-check text-success"></i>
                                                    </span>
                                            <span class="notification-title">Project Task Complete</span>
                                            <span class="notification-description">Lorem Ipsum is simply dummy text of the printing.</span>
                                            <span class="notification-time">15 minutes ago</span>
                                        </a>

                                        <a class="clearfix" href="javascript:%20void(0);">
                                                    <span class="notification-icon">
                                                        <i class=" icon-graph text-danger"></i>
                                                    </span>
                                            <span class="notification-title">CPU Usage</span>
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
                                <a class="dropdown-item" href="<%=request.getContextPath()%>/CounterClose"><i
                                        class="icon-calculator"></i> Counter Close</a>
                            </li>
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
                <li class="nav-item">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i
                            class="fa fa-codepen"></i><span class="toggle-none">Product <span
                            class="fa arrow"></span></span></a>
                    <ul class="nav-second-level nav flex-column " aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/product"><i
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
                <li class="nav-item  active">
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
                <li class="nav-heading"><span>Sales</span></li>
                <li class="nav-item active">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i class="fa fa-cogs"></i>
                        <span class="toggle-none">Menu Sales <span class="fa arrow"></span></span></a>
                    <ul class="nav-second-level nav flex-column sub-menu" aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/daysummery">Menu
                            Salse Day Summery</a></li>
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
        <h2>Customer Managment</h2>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="javascript: void(0);">Home</a></li>
            <li class="breadcrumb-item active">Customer</li>
        </ol>
    </div>
</div>

<section class="main-content">

    <div class="row">
        <div class="col-md-12">
            <div class="card">

                <div class="card-header card-default">
                    Customer
                    <p class="text-muted">All Customer List</p>
                    <div class="float-right mt-10">
                        <button type="button" class="btn btn-primary margin-r-5 btn-rounded box-shadow btn-icon"
                                data-toggle="modal" data-target=".myModel"><i class="fa fa-plus"></i>Add New Customer
                        </button>

                    </div>
                </div>
                <div class="card-body">

                    <table id="datatable2" class="table dataTable table-striped dt-responsive nowrap">
                        <thead>
                        <tr>
                            <th style="width:80px">
                                <strong>Customer ID</strong>
                            </th>
                            <th>
                                <strong>Image</strong>
                            </th>
                            <th>
                                <strong>Identy Proof Image</strong>
                            </th>
                            <th>
                                <strong>Suffix</strong>
                            </th>
                            <th>
                                <strong>First Name</strong>
                            </th>
                            <th>
                                <strong>Last Name</strong>
                            </th>
                            <th>
                                <strong>Email</strong>
                            </th>
                            <th>
                                <strong>ID/Passport Number</strong>
                            </th>
                            <th>
                                <strong>Gender</strong>
                            </th>
                            <th>
                                <strong>Contact Person Name</strong>
                            </th>
                            <th>
                                <strong>Mobile</strong>
                            </th>
                            <th>
                                <strong>Phone</strong>
                            </th>
                            <th>
                                <strong>Address</strong>
                            </th>
                            <th class="text-center">
                                <strong>STATUS</strong>
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

    <footer class="footer">
        <span>Copyright &copy; 2018 Icordium Softwares</span>
    </footer>

</section>
<!-- ============================================================== -->
<!-- 						Content End 	 						-->
<!-- ============================================================== -->

<div id="newModelId" class="modal fadeIn myModel" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <form id="newCustomerform" name="newCustomerform" enctype="multipart/form-data">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                      class="fa fa-times"></span>
                    </button>
                    <h5 class="modal-title" id="myModalLabel">Create New Customer</h5>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newFirstName">
                                <h5>
                                    <small>First Name</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="newFirstName" name="newFirstName"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newLastName">
                                <h5>
                                    <small>Last Name</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="newLastName" name="newLastName"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newSuffix">
                                <h5>
                                    <small>Suffix</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                    <select id="newSuffix" name="newSuffix" class="form-control">
                                        <option value="MR">MR</option>
                                        <option value="MRS">MRS</option>
                                        <option value="MISS">MISS</option>
                                        <option value="REV">REV</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label form="newStatus">
                                <h5>
                                    <small>Status</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b col-md-1">
                                    <input type="checkbox" id="newStatus" name="newStatus"
                                           class="checkbox-primary form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <label for="newemail">
                                <h5>
                                    <small>Email</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="email" id="newemail" name="newemail"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newGender">
                                <h5>
                                    <small>Gender</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <select id="newGender" name="newGender" class="form-control">
                                        <option value="1">Male</option>
                                        <option value="0">Female</option>
                                        <option value="2">Other</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newIdNumber">
                                <h5>
                                    <small>ID/Passport Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="newIdNumber" name="newIdNumber"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newPhone">
                                <h5>
                                    <small>Mobile No</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="tel" id="newPhone" name="newPhone"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newContactPerson">
                                <h5>
                                    <small>Contact Person Name</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="newContactPerson" name="newContactPerson"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newMobile">
                                <h5>
                                    <small>Mobile No</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="tel" id="newMobile" name="newMobile"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newDateOfBirth">
                                <h5>
                                    <small>Date Of Birth</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i
                                            class="glyphicon glyphicon-calendar fa fa-calendar"></i></span>
                                    <input type="text" name="newDateOfBirth" id="newDateOfBirth" value="10-24-1984"/>
                                </div>

                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newaddress">
                                <h5>
                                    <small>Address</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="tel" id="newaddress" name="newaddress"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newCustomerImageChoser">
                                <h5>
                                    <small>Select Customer Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" id="newCustomerImageChoser" onchange="encodeImageFileAsURL();"
                                           name="newCustomerImageChoser"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newCustomerImageView">
                                <h5>
                                    <small>Customer Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-file-image-o"></i></span>
                                    <img id="newCustomerImageView" class="checkbox-primary form-control"/>
                                    <input type="hidden" id="newCustomerImageBaseCode"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newIdentyProofImageChoser">
                                <h5>
                                    <small>Select Identy Proof Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" id="newIdentyProofImageChoser" onchange="encodeImageFileAsURL();"
                                           name="newIdentyProofImageChoser"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newIdentyProofImageView">
                                <h5>
                                    <small>Identy Proof</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-file-image-o"></i></span>
                                    <img id="newIdentyProofImageView" class="checkbox-primary form-control"/>
                                    <input type="hidden" id="newIdentyProofImageBaseCode"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <a class="nav-link" href="<%=request.getContextPath()%>/camera" target="_blank"><i
                            class=" fa fa-camera"></i></a>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" id="newBtn" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </form>
    </div>
</div>

<!---Update Model------>

<div id="editModelID" class="modal fadeIn myModel" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <form id="editCustomerform" name="editCustomerform" method="post" enctype="multipart/form-data">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                      class="fa fa-times"></span>
                    </button>
                    <h5 class="modal-title" id="editModalLabel">Update Customer Details</h5>
                    <input type="hidden" id="editId" name="editId" class="form-control"/>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editFirstName">
                                <h5>
                                    <small>First Name</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="editFirstName" name="editFirstName" class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editLastName">
                                <h5>
                                    <small>Last Name</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="editLastName" name="editLastName"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editSuffix">
                                <h5>
                                    <small>Suffix</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                    <select id="editSuffix" name="editSuffix" class="form-control">
                                        <option value="MR">MR</option>
                                        <option value="MRS">MRS</option>
                                        <option value="MISS">MISS</option>
                                        <option value="REV">REV</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label form="editStatus">
                                <h5>
                                    <small>Status</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b col-md-1">
                                    <input type="checkbox" id="editStatus" name="editStatus"
                                           class="checkbox-primary form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <label for="editemail">
                                <h5>
                                    <small>Email</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="email" id="editemail" name="editemail"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editGender">
                                <h5>
                                    <small>Gender</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <select id="editGender" name="editGender" class="form-control">
                                        <option value="1">Male</option>
                                        <option value="0">Female</option>
                                        <option value="2">Other</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editIdNumber">
                                <h5>
                                    <small>ID/Passport Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="editIdNumber" name="editIdNumber"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editPhone">
                                <h5>
                                    <small>Mobile No</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="tel" id="editPhone" name="editPhone"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editContactPerson">
                                <h5>
                                    <small>Contact Person Name</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" id="editContactPerson" name="editContactPerson"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editMobile">
                                <h5>
                                    <small>Mobile No</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="tel" id="editMobile" name="editMobile"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editDateOfBirth">
                                <h5>
                                    <small>Date Of Birth</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i
                                            class="glyphicon glyphicon-calendar fa fa-calendar"></i></span>
                                    <input type="text" name="editDateOfBirth" id="editDateOfBirth" value="10-24-1984"/>
                                </div>

                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editaddress">
                                <h5>
                                    <small>Address</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="tel" id="editaddress" name="editaddress"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editCustomerImageChoser">
                                <h5>
                                    <small>Select Customer Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" id="editCustomerImageChoser" onchange="encodeImageFileAsURL();"
                                           name="editCustomerImageChoser"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editCustomerImageView">
                                <h5>
                                    <small>Customer Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-file-image-o"></i></span>
                                    <img id="editCustomerImageView" class="checkbox-primary form-control"/>
                                    <input type="hidden" id="editCustomerImageBaseCode"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editIdentyProofImageChoser">
                                <h5>
                                    <small>Select Identy Proof Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" id="editIdentyProofImageChoser"
                                           onchange="encodeImageFileAsURL();" name="editIdentyProofImageChoser"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editIdentyProofImageView">
                                <h5>
                                    <small>Identify Proof</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-file-image-o"></i></span>
                                    <img id="editIdentyProofImageView" class="checkbox-primary form-control"/>
                                    <input type="hidden" id="editIdentyProofImageBaseCode"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <a class="nav-link" href="<%=request.getContextPath()%>/camera" target="_blank"><i
                            class=" fa fa-camera"></i></a>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" id="updateBtn" class="btn btn-warning">Save changes</button>
                </div>
            </div>
        </form>
    </div>
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

<script src="<c:url value="/assets/lib/bootstrap-daterangepicker/moment.js"/>" type="text/javascript"></script>
<script src="<c:url value="/assets/lib/bootstrap-daterangepicker/daterangepicker.js"/>"
        type="text/javascript"></script>

<!-- DataTables-->
<script src="<c:url value="/assets/lib/datatables/jquery.dataTables.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/dataTables.responsive.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/dataTables.buttons.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/jszip.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/pdfmake.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/vfs_fonts.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/buttons.html5.min.js"/>"></script>
<!-- Toast -->
<script src="<c:url value="/assets/lib/toast/jquery.toast.min.js"/>"></script>

<script src="<c:url value="/assets/js/jquery.base64.js"/>"></script>

<script>
    $(function () {

        /* BirthDate */
        $('input[name="newDateOfBirth"]').daterangepicker({
                singleDatePicker: true,
                showDropdowns: true
            },
            function (start, end, label) {
                var years = moment().diff(start, 'years');
            });


    });
    $(function () {

        /* BirthDate */
        $('input[name="editDateOfBirth"]').daterangepicker({
                singleDatePicker: true,
                showDropdowns: true
            },
            function (start, end, label) {
                var years = moment().diff(start, 'years');
            });


    });
    $(document).ready(function () {
        $("#datatable2").DataTable({
            dom: 'Bfrtip',
            'autoWidth': true,
            buttons: [
                'copyHtml5',
                'excelHtml5',
                'csvHtml5',
                'pdfHtml5'
            ],
            scrollX: true,
            "processing": true,
            "serverSide": false,
            "info": true,
            "destroy": true,
            "pagination": true,
            "lengthChange": true,
            "pageLength": 10,
            "ajax": {
                'url': 'customers/all',
                'type': 'GET',
                'data': '',
                'dataSrc': ""
            },
            "columns": [
                {"data": 'idcustomers'},
                {
                    "render": function (data, type, JsonResultRow, meta) {
                        return '<img height="50px" width="50px" src="' + JsonResultRow.customerimage + '">';
                    }
                },
                {
                    "render": function (data, type, JsonResultRow, meta) {
                        return '<img height="50px" width="50px" src="' + JsonResultRow.identiftyproofimage + '">';
                    }
                },
                {"data": 'suffix'},
                {"data": 'firstname'},
                {"data": 'lastname'},
                {"data": 'email'},
                {"data": 'idnumber'},
                {
                    sortable: true,
                    "render": function (data, type, full, meta) {
                        if (full.gender == 1) {
                            return '<span class="badge badge-primary">Male</span>';
                        } else if (full.gender == 0) {
                            return '<span class="badge badge-warning">Female</span>';
                        }
                    }
                },
                {"data": 'contactpersonname'},
                {"data": 'mobile'},
                {"data": 'phone'},
                {"data": 'address'},
                {
                    sortable: true,
                    "render": function (data, type, full, meta) {
                        if (full.status == 1) {
                            return '<span class="badge badge-success">Active</span>';
                        } else {
                            return '<span class="badge badge-warning">Deactive</span>';
                        }
                    }
                },
                {
                    sortable: false,
                    "render": function (data, type, full, meta) {
                        //  var myData = full.getStatus;
                        return '<button type="button" class="btn btn-sm btn-default"><em class="fa fa-search"></em></button><button type="button" class="edit btn btn-sm btn-success" data-set=' + JSON.stringify(full) + '><i class="fa fa-edit"></i></button><button type="button" class="delete btn btn-sm btn-danger" data-set=' + JSON.stringify(full) + '><i class="fa fa-trash"></i>Delete</button>';
                    }
                }
            ]

        });

//                $("#newproducttypeid").validate({
//                    rules: {
//                        producttypedescription: {
//                            required: true,
//                            minlength: 2
//                        }
//                    },
//                    messages: {
//                        producttypedescription: {
//                            required: "Please enter a username",
//                            minlength: "Your username must consist of at least 2 characters"
//                        }
//                    },
//                    errorElement: "em",
//                    errorPlacement: function (error, element) {
//                        // Add the `help-block` class to the error element
//                        error.addClass("help-block");
//
//
//                    },
//                    highlight: function (element, errorClass, validClass) {
//                        $(element).parents(".form-group").addClass("has-error").removeClass("has-success");
//                    },
//                    unhighlight: function (element, errorClass, validClass) {
//                        $(element).parents(".form-group").addClass("has-success").removeClass("has-error");
//                    }
//                });
    });
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

    $('#newCustomerImageChoser').change(encodeImageFileAsURL(function (base64Img) {
        $('#newCustomerImageBaseCode').val($.base64.encode(base64Img));
        $('#newCustomerImageView')
            .attr('src', base64Img);
    }));
    $('#newIdentyProofImageChoser').change(encodeImageFileAsURL(function (base64Img) {
        $('#newIdentyProofImageBaseCode').val($.base64.encode(base64Img));
        $('#newIdentyProofImageView')
            .attr('src', base64Img);
    }));
    $('#editCustomerImageChoser').change(encodeImageFileAsURL(function (base64Img) {
        $('#editCustomerImageBaseCode').val($.base64.encode(base64Img));
        $('#editCustomerImageView')
            .attr('src', base64Img);
    }));
    $('#editIdentyProofImageChoser').change(encodeImageFileAsURL(function (base64Img) {
        $('#editIdentyProofImageBaseCode').val($.base64.encode(base64Img));
        $('#editIdentyProofImageView')
            .attr('src', base64Img);
    }));
    $('#newCustomerform').submit(function () {
// show that something is loading
        //  $('#response').html("<b>Loading response...</b>");
        // var formData = $(this).serialize();
        //stop submit the form, we will post it manually.
        event.preventDefault();

        // Get form
        var form = $('#newCustomerform')[0];

        // Create an FormData object
        var data = new FormData(form);
// Call ajax for pass data to other place
        $.ajax({
            type: 'POST',
            enctype: 'multipart/form-data',
            url: 'customers/add',
            data: data,
            processData: false,
            contentType: false,
            cache: false,
            timeout: 600000,// getting filed value in serialize form
        })
            .done(function (data) { // if getting done then call.
                $('#newModelId').modal('toggle');
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
                    }
                );

                $("#datatable2").DataTable().ajax.reload();
            })
            .fail(function () { // if fail then getting message

// just in case posting your form failed
                alert("Posting failed.");

            });

// to prevent refreshing the whole page page
        return false;

    });
    $('#editCustomerform').submit(function () {
// show that something is loading
        //  $('#response').html("<b>Loading response...</b>");
        // var formData = $(this).serialize();
        //stop submit the form, we will post it manually.
        event.preventDefault();

        // Get form
        var form = $('#editCustomerform')[0];

        // Create an FormData object
        var data = new FormData(form);
// Call ajax for pass data to other place
        $.ajax({
            type: 'POST',
            enctype: 'multipart/form-data',
            url: 'customers/update',
            data: data,
            processData: false,
            contentType: false,
            cache: false,
            timeout: 600000,// getting filed value in serialize form
        })
            .done(function (data) { // if getting done then call.
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
                    }
                );
                $("#datatable2").DataTable().ajax.reload();
            })
            .fail(function () { // if fail then getting message

// just in case posting your form failed
                alert("Posting failed.");

            });

// to prevent refreshing the whole page page
        return false;

    });

    $(function () {
        $("#datatable2").on("click", ".delete", function () {
            var data = $("#datatable2").DataTable().row($(this).parents('tr')).data();
            //    var data = $(this).data("set");
            var parent = $(this).parent().parent();

            swal({
                title: data.title + ' Delete',
                text: '"' + data.name + '" BUTTON EKE DATA SET KIYANA ATTRIBUTE1 BALANNA ?',
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
                            url: '/customers/delete/' + data.idcustomers, /* php post url */
                            type: 'POST',
                            data: {
                                id: data.idcustomers
                            },
                            dataType: 'JSON'
                        })

                            .done(function (response) {
                                swal({
                                    title: 'Deleted!',
                                    text: data.title + ' successfully deleted.',
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
            ///var data = $(this).data("set");
            var data = $("#datatable2").DataTable().row($(this).parents('tr')).data();
            var parent = $(this).parent().parent();
            $('#editModelID').modal('toggle');
            $('#editFirstName').val(data.firstname);
            $('#editLastName').val(data.lastname);
            $('#editSuffix').val(data.suffix);
            $('#editemail').val(data.email);
            $('#editGender').val(data.gender);
            $('#editContactPerson').val(data.contactpersonname);
            $('#editMobile').val(data.mobile);
            $('#editPhone').val(data.phone);
            $('#editIdNumber').val(data.idnumber);
            $('#editDateOfBirth').val(data.dob);
            $('#editaddress').val(data.address);
            $('#editCustomerImageView').attr('src', data.customerimage);
            $('#editIdentyProofImageView').attr('src', data.identiftyproofimage);
            $('#editId').val(data.idcustomers);
            if (data.status === 0) {
                $('#editStatus').prop('checked', false);
            } else {
                $('#editStatus').prop('checked', true);
            }
        });

    });
</script>
</body>
</html>