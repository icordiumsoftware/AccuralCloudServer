<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<head>
    <%

        try {
            if (request.getSession().getAttribute("userid").equals(null)) {
                response.sendRedirect(request.getContextPath() + "/login");
            }
        } catch (NullPointerException e) {
            response.sendRedirect(request.getContextPath() + "/login");
        }
    %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Accural Erp - Bootstrap Admin Dashboard Template</title>

    <!-- Common Plugins -->
    <link href="<c:url value="/assets/lib/bootstrap/css/bootstrap.min.css"/>" type="text/css" rel="stylesheet">
    <!-- Toast -->
    <link href="<c:url value="/assets/lib/toast/jquery.toast.min.css"/>" type="text/css" rel="stylesheet">
    <!-- Date Picker-->
    <link href="<c:url value="/assets/lib/bootstrap-daterangepicker/daterangepicker.css"/>" type="text/css"
          rel="stylesheet">

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
                                                        <img alt="" class="rounded-circle" src="assets/img/avtar-3.png"
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
                                                        <img alt="" class="rounded-circle" src="assets/img/avtar-4.png"
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
                <li class="nav-item">
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
                <li class="nav-item  active">
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
        <h2>Employee Managment</h2>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="javascript: void(0);">Home</a></li>
            <li class="breadcrumb-item active">Products</li>
        </ol>
    </div>
</div>

<section class="main-content">

    <div class="row">
        <div class="col-md-12">
            <div class="card">

                <div class="card-header card-default">
                    Employee
                    <p class="text-muted">All Employee List</p>
                    <div class="float-right mt-10">
                        <button type="button" class="btn btn-primary margin-r-5 btn-rounded box-shadow btn-icon"
                                data-toggle="modal" data-target=".myModel"><i class="fa fa-plus"></i>Add New Employee
                        </button>

                    </div>
                </div>
                <div class="card-body">

                    <table id="datatable2" class="table dataTable table-striped table-responsive nowrap">
                        <thead>
                        <tr>
                            <th style="width:80px">
                                <strong>ID</strong>
                            </th>
                            <th>
                                <strong>Icon</strong>
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
                                <strong>Date Of Birth</strong>
                            </th>
                            <th>
                                <strong>Id Number</strong>
                            </th>
                            <th>
                                <strong>Passport Number</strong>
                            </th>
                            <th>
                                <strong>Marrige Status</strong>
                            </th>
                            <th>
                                <strong>Gender</strong>
                            </th>
                            <th>
                                <strong>Address</strong>
                            </th>
                            <th>
                                <strong>Telephone Number</strong>
                            </th>
                            <th>
                                <strong>ETF Number</strong>
                            </th>
                            <th>
                                <strong>EPF Number</strong>
                            </th>
                            <th>
                                <strong>Office Number</strong>
                            </th>
                            <th>
                                <strong>Email</strong>
                            </th>
                            <th class="text-center">
                                <strong>Status</strong>
                            </th>
                            <th class="text-center">
                                <strong>Action</strong>
                            </th>
                        </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>

                </div>
            </div>
        </div>
    </div>

    <footer class="footer">
        <span>Copyright &copy; 2018 Icordium</span>
    </footer>

</section>
<!-- ============================================================== -->
<!-- 						Content End 	 						-->
<!-- ============================================================== -->

<div id="newModelId" class="modal fadeIn myModel" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <form id="newForm" name="newForm" enctype="multipart/form-data">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                      class="fa fa-times"></span>
                    </button>
                    <h5 class="modal-title">Create New Employee</h5>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newFistName">
                                <h5>
                                    <small>First Name</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" required id="newFistName" name="newFistName"
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

                                    <span class="input-group-addon"><i class="fa fa-tags"></i></span>
                                    <input type="text" id="newLastName" name="newLastName"
                                           class="checkbox-primary form-control"/>
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

                            <label for="newIdNumber">
                                <h5>
                                    <small> ID Number</small>
                                </h5>
                            </label>
                            <div class="input-group m-b">
                                <span class="input-group-addon"><i class="fa fa-id"></i></span>
                                <input type="number" id="newIdNumber" name="newIdNumber" step=".01"
                                       class="form-control"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newPassportNumber">
                                <h5>
                                    <small>Passport Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-barcode"></i></span>
                                    <input type="text" id="newPassportNumber" name="newPassportNumber"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newstatus">
                                <h5>
                                    <small>Active</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="checkbox" id="newstatus" name="newstatus"
                                           class="checkbox-primary form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newEpfNumber">
                                <h5>
                                    <small>EPF Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-barcode"></i></span>
                                    <input type="tel" id="newEpfNumber" name="newEpfNumber" class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newEtfNumber">
                                <h5>
                                    <small>ETF Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="text" id="newEtfNumber" name="newEtfNumber"
                                           class="checkbox-primary form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newEmployeeImageChoser">
                                <h5>
                                    <small>Select Employee Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" id="newEmployeeImageChoser" onchange="encodeImageFileAsURL();"
                                           name="newEmployeeImageChoser" class="form-control"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="newEmployeeImageView">
                                <h5>
                                    <small>Employee Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-file-image-o"></i></span>
                                    <img id="newEmployeeImageView" class="checkbox-primary form-control"/>
                                    <input type="hidden" id="newEmployeeImageBaseCode"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newGender">
                                <h5>
                                    <small>Address</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-barcode"></i></span>
                                    <input type="text" id="newAddress" name="newAddress" class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newmarrigestatus">
                                <h5>
                                    <small>Gender</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
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
                            <label for="newGender">
                                <h5>
                                    <small>Email</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-barcode"></i></span>
                                    <input type="text" id="newEmail" name="newEmail" class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newmarrigestatus">
                                <h5>
                                    <small>Marrige Status</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="checkbox" id="newmarrigestatus" name="newmarrigestatus"
                                           class="checkbox-primary form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="newGender">
                                <h5>
                                    <small>Office Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-barcode"></i></span>
                                    <input type="tel" id="newOfficeNumber" name="newOfficeNumber" class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="newmarrigestatus">
                                <h5>
                                    <small>Mobile Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="tel" id="newMobileNumber" name="newMobileNumber"
                                           class="checkbox-primary form-control"/>
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
</div>
<!---Update Model------>
<div id="editModelID" class="modal fadeIn myModel" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <form id="updateForm" name="updateForm" enctype="multipart/form-data">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                      class="fa fa-times"></span>
                    </button>
                    <h5 class="modal-title">Update Employee</h5>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editFistName">
                                <h5>
                                    <small>First Name</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="text" required id="editFistName" name="editFistName"
                                           class="form-control"/>
                                    <input type="hidden" required id="editId" name="editId"/>
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

                                    <span class="input-group-addon"><i class="fa fa-tags"></i></span>
                                    <input type="text" id="editLastName" name="editLastName"
                                           class="checkbox-primary form-control"/>
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

                            <label for="editIdNumber">
                                <h5>
                                    <small> ID Number</small>
                                </h5>
                            </label>
                            <div class="input-group m-b">
                                <span class="input-group-addon"><i class="fa fa-id"></i></span>
                                <input type="number" id="editIdNumber" name="editIdNumber" step=".01"
                                       class="form-control"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editPassportNumber">
                                <h5>
                                    <small>Passport Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-barcode"></i></span>
                                    <input type="text" id="editPassportNumber" name="editPassportNumber"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editstatus">
                                <h5>
                                    <small>Active</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="checkbox" id="editstatus" name="editstatus"
                                           class="checkbox-primary form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editEpfNumber">
                                <h5>
                                    <small>EPF Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-barcode"></i></span>
                                    <input type="tel" id="editEpfNumber" name="editEpfNumber" class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editEtfNumber">
                                <h5>
                                    <small>ETF Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="text" id="editEtfNumber" name="editEtfNumber"
                                           class="checkbox-primary form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editEmployeeImageChoser">
                                <h5>
                                    <small>Select Employee Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="file" id="editEmployeeImageChoser" onchange="encodeImageFileAsURL();"
                                           name="editEmployeeImageChoser" class="form-control"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <label for="editEmployeeImageView">
                                <h5>
                                    <small>Employee Image</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-file-image-o"></i></span>
                                    <img id="editEmployeeImageView" class="checkbox-primary form-control"/>
                                    <input type="hidden" id="editEmployeeImageBaseCode"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editGender">
                                <h5>
                                    <small>Address</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-barcode"></i></span>
                                    <input type="text" id="editAddress" name="editAddress" class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editmarrigestatus">
                                <h5>
                                    <small>Gender</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
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
                            <label for="editGender">
                                <h5>
                                    <small>Email</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-barcode"></i></span>
                                    <input type="text" id="editEmail" name="editEmail" class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editmarrigestatus">
                                <h5>
                                    <small>Marrige Status</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="checkbox" id="editmarrigestatus" name="editmarrigestatus"
                                           class="checkbox-primary form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="editGender">
                                <h5>
                                    <small>Office Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="fa fa-barcode"></i></span>
                                    <input type="tel" id="editOfficeNumber" name="editOfficeNumber"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <label for="editmarrigestatus">
                                <h5>
                                    <small>Mobile Number</small>
                                </h5>
                            </label>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span><i></i></span>
                                    <input type="tel" id="editMobileNumber" name="editMobileNumber"
                                           class="checkbox-primary form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <a class="nav-link" href="<%=request.getContextPath()%>/camera" target="_blank"><i
                            class=" fa fa-camera"></i></a>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" id="updateBtn" class="btn btn-warning">Update changes</button>
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


<script src="<c:url value="/assets/lib/bootstrap-daterangepicker/moment.js"/>" type="text/javascript"></script>
<script src="<c:url value="/assets/lib/bootstrap-daterangepicker/daterangepicker.js"/>"
        type="text/javascript"></script>


<script src="<c:url value="/assets/lib/pace/pace.min.js"/>"></script>
<!-- Jquery UI -->
<script src="<c:url value="/assets/lib/jquery-ui/jquery-ui.min.js"/>"></script>
<script src="<c:url value="/assets/lib/jquery-validate/jquery.validate.js"/>"></script>
<script src="<c:url value="/assets/js/jquery.ui.custom.js"/>"></script>
<script src="<c:url value="/assets/js/jquery.base64.js"/>"></script>


<script type="text/javascript">
    $.validator.setDefaults({
        submitHandler: function () {
        }
    });
    var formisvalid = false;
    $(document).ready(function () {
        formisvalid = $("#updateForm").validate({
            rules: {
                editDescription: "required",
                editCostPrice: "required",
                editWholeSalePrice: "required",
                editRetailPrice: "required"
            },
            messages: {
                editDescription: "Please enter your Description",
                editCostPrice: "Please enter your Cost Price",
                editWholeSalePrice: "Please enter your Whole Sale Price",
                editRetailPrice: "Please enter your Retail Price",

            },
            errorElement: "em",
            errorPlacement: function (error, element) {
                // Add the `help-block` class to the error element
                error.addClass("help-block");

                // Add `has-feedback` class to the parent div.form-group
                // in order to add icons to inputs
                element.parents(".form-group").addClass("has-feedback");

                if (element.prop("type") === "checkbox") {
                    error.insertAfter(element.parent("label"));
                } else {
                    error.insertAfter(element);
                }

                // Add the span element, if doesn't exists, and apply the icon classes to it.
                if (!element.next("input")[0]) {
                    $('input').addClass("form-control-danger").removeClass("form-control-success");
                }
            },
            success: function (label, element) {
                // Add the span element, if doesn't exists, and apply the icon classes to it.
                if (!$(element).next("input")[0]) {
                    $('input').addClass("form-control-success").removeClass("form-control-danger");
                }
                return true;
            },
            highlight: function (element, errorClass, validClass) {
                $(element).parents(".form-group").addClass("has-danger").removeClass("has-success");
                $('input').addClass("form-control-danger").removeClass("form-control-success");
                return false;
            },
            unhighlight: function (element, errorClass, validClass) {
                $(element).parents(".form-group ").addClass("has-success").removeClass("has-danger");
                $('input').addClass("form-control-success").removeClass("form-control-danger");
                return true
            }
        });
    });
    $('#updateForm').submit(function () {
// show that something is loading

        //stop submit the form, we will post it manually.
        event.preventDefault();
        if (formisvalid) {
            // Get form
            var form = $('#updateForm')[0];

            // Create an FormData object
            var data = new FormData(form);
// Call ajax for pass data to other place
            $.ajax({
                type: 'POST',
                enctype: 'multipart/form-data',
                url: 'employees/update',
                data: data,
                processData: false,
                contentType: false,
                cache: false,
                timeout: 600000,// getting filed value in serialize form
            })
                .done(function (data) { // if getting done then call.

// show the response
                    $('#editModelID').modal('toggle');
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
        }
    });
</script>


<script>
    $(function () {

        /* BirthDate */
        $('input[name="editDateOfBirth"]').daterangepicker({
                singleDatePicker: true,
                showDropdowns: true
            },
            function (start, end, label) {
                var years = moment().diff(start, 'years');
            });

        $('input[name="newDateOfBirth"]').daterangepicker({
                singleDatePicker: true,
                showDropdowns: true
            },
            function (start, end, label) {
                var years = moment().diff(start, 'years');
            });
    });
    /* BirthDate */


    $(document).ready(function () {
        $("#datatable2").DataTable({
            dom: 'Bfrtip',
            'autoWidth': true,
            buttons: [
                'copyHtml5',
                'excelHtml5',
                'csvHtml5',
                {
                    extend: 'pdfHtml5',
                    orientation: 'landscape',
                    pageSize: 'A4'
                }
            ],
            "scrollX": true,
            "processing": true,
            "serverSide": false,
            "info": true,
            "destroy": true,
            "pagination": true,
            "lengthChange": true,
            "pageLength": 10,
            "ajax": {
                'url': 'employees/all',
                'type': 'GET',
                'data': '',
                'dataSrc': ""
            },
            "columns": [
                {"data": 'idemployee'},
                {
                    "render": function (data, type, JsonResultRow, meta) {
                        return '<img height="100px" width="100px" src="' + JsonResultRow.icon + '">';
                    }
                },
                {"data": 'suffix'},
                {"data": 'fistname'},
                {"data": 'lastname'},
                {"data": 'dateofbirth'},
                {"data": 'idnumber'},
                {"data": 'passportnumber'},
                {
                    sortable: true,
                    "render": function (data, type, full, meta) {
                        if (full.maritalstatus == 1) {
                            return '<span class="badge badge-success">Married</span>';
                        } else if (full.maritalstatus == 0) {
                            return '<span class="badge badge-warning">Single</span>';
                        } else {
                            return '<span class="badge badge-danger">Divorced</span>';
                        }
                    }
                },
                {
                    sortable: true,
                    "render": function (data, type, full, meta) {
                        if (full.gender == 1) {
                            return '<span class="badge badge-primary">Male</span>';
                        } else if (full.gender == 0) {
                            return '<span class="badge badge-warning">Female</span>';
                        } else {
                            return '<span class="badge badge-danger">Other</span>';
                        }
                    }
                },
                {"data": 'address'},
                {"data": 'telephonenumber'},
                {"data": 'etfnumber'},
                {"data": 'epfnumber'},
                {"data": 'officenumber'},
                {"data": 'email'},
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


        $('#newForm').submit(function () {
// show that something is loading
            //  $('#response').html("<b>Loading response...</b>");
            // var formData = $(this).serialize();
            //stop submit the form, we will post it manually.
            event.preventDefault();

            // Get form
            var form = $('#newForm')[0];

            // Create an FormData object
            var data = new FormData(form);
// Call ajax for pass data to other place
            $.ajax({
                type: 'POST',
                enctype: 'multipart/form-data',
                url: 'employees/add',
                data: data,
                processData: false,
                contentType: false,
                cache: false,
                timeout: 600000,// getting filed value in serialize form
            })
                .done(function (data) { // if getting done then call.
// show the response
                    $("#newForm")[0].reset();
                    $('#newForm').find('input').val('');
                    $('input:checkbox').removeAttr('checked');
                    $('#newModelId').modal('toggle');
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

                    $("#datatable2").DataTable().ajax.reload();
                })
                .fail(function () { // if fail then getting message

// just in case posting your form failed
                    alert("Posting failed.");

                });

// to prevent refreshing the whole page page
            return false;

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

    $('#newEmployeeImageChoser').change(encodeImageFileAsURL(function (base64Img) {
        $('#newEmployeeImageBaseCode').val($.base64.encode(base64Img));
        $('#newEmployeeImageView')
            .attr('src', base64Img);
    }));
    $('#editEmployeeImageChoser').change(encodeImageFileAsURL(function (base64Img) {
        $('#editEmployeeImageBaseCode').val($.base64.encode(base64Img));
        $('#editEmployeeImageView')
            .attr('src', base64Img);
    }));
</script>
<script type="text/javascript">
    $(function () {
        <!-- Datatables-->
        $('#datatable2').dataTable();

    });


    $("#datatable2").on("click", ".edit", function () {
        var data = $("#datatable2").DataTable().row($(this).parents('tr')).data();
        $('#editModelID').modal('toggle');
        $('#editId').val(data.idemployee.toString());
        $('#editFistName').val(data.fistname);
        $('#editLastName').val(data.lastname);
        $('#editDateOfBirth').val(data.dateofbirth);
        $('#editIdNumber').val(data.idnumber);
        $('#editPassportNumber').val(data.passportnumber);
        if (data.status === 0) {
            $('#editstatus').prop('checked', false);
        } else {
            $('#editstatus').prop('checked', true);
        }
        $('#editEmployeeImageView')
            .attr('src', data.icon);
    });
    $("#datatable2").on("click", ".delete", function () {
        var data = $("#datatable2").DataTable().row($(this).parents('tr')).data();
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
                        url: '/employees/delete/' + data.idemployee, /* php post url */
                        type: 'POST',
                        data: {
                            id: data.idemployee
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

</script>
</body>
</html>