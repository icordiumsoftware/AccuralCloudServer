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
    <title>FixedPlus - Bootstrap Admin Dashboard Template</title>

    <!-- Common Plugins -->
    <link href="<c:url value="/assets/lib/bootstrap/css/bootstrap.min.css"/>" type="text/css" rel="stylesheet">
    <!-- Toast -->
    <link href="<c:url value="/assets/lib/toast/jquery.toast.min.css"/>" type="text/css" rel="stylesheet">
    <!-- Js Grid plugins -->
    <link rel="stylesheet" type="text/css" href="<c:url value="/assets/lib/jsgrid/css/jsgrid.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="/assets/lib/jsgrid/css/theme.css"/>"/>
    <!-- Sweet Alerts-->
    <link href="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.css"/>" type="text/css" rel="stylesheet">

    <!-- DataTimePicker -->
    <link href="<c:url value="/assets/lib/bootstrap-daterangepicker/daterangepicker.css"/>" rel="stylesheet">

    <!-- Clock Picker -->
    <link href="<c:url value="/assets/lib/clockpicker/bootstrap-clockpicker.min.css"/>" rel="stylesheet">

    <!-- Jquery UI -->
    <link href="<c:url value="/assets/lib/jquery-ui/jquery-ui.css"/>" rel="stylesheet">
    <!-- Custom Css-->
    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet">
    <style>
        #sample {
            overflow: visible;
        }

        .hide {
            display: none;
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
                        <img alt="" src="<c:url value="/assets/img/logo-dark.png"/>"
                             class="toggle-none hidden-xs">
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
                <li class="nav-item ">
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

                <li class="nav-item active">
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
</div>

<section class="main-content">

    <div class="col-md-12">
        <div class="card">
            <div class="card-header card-default">
                Rental Recive Invoice
                <p class="text-muted">Rental Invoice & Product Recive</p>
            </div>
            <div class="card-body">
                <input type="hidden" value="${id}" name="InvoiceId" id="InvoiceId">
                <div class="row">
                    <div class="col-lg-6">
                        <h5>
                            <small>Rental Invoice Action</small>
                        </h5>
                        <div class="form-group">
                            <div class="buttons">
                                <button id="CancelRentalInvoiceBtn" class="btn btn-danger btn-border btn-rounded">Cancel
                                    Rental Invoice
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">

                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-6">
                        <span></span>
                        <h5>
                            <small>Customer</small>
                        </h5>
                        <div class="form-group">
                            <input type="hidden" name="Customerid" id="Customerid"/>
                            <input type="text" readonly="readonly" name="Customersearch" id="Customersearch"
                                   placeholder="Search Customer " class="form-control"/>
                            <ul aria-hidden="true" id='Customerresult' class="list-group dropdown-menu col-md-12"
                                role="menu"></ul>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <h5>
                            <small>Delivery Address</small>
                        </h5>
                        <div class="form-group">
                            <div class="input-group m-b">
                                <span class="input-group-addon"><i class=""></i></span>
                                <input type="text" readonly="readonly" id="CustomerAddress" name="CustomerAddress"/>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="tabs col-md-12">
                        <!-- Nav tabs -->
                        <ul class="nav nav-tabs">
                            <li class="nav-item" role="presentation"><a class="nav-link active"
                                                                        href="#productTab"
                                                                        aria-controls="products" role="tab"
                                                                        data-toggle="tab">Products</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="#serviceTab"
                                                                        aria-controls="Services" role="tab"
                                                                        data-toggle="tab">Services</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="#OtherTab"
                                                                        aria-controls="Other" role="tab"
                                                                        data-toggle="tab">Other</a></li>
                        </ul>
                        <!-- Tab panes -->
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane active" id="productTab">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <h5>
                                            <small>Date and Time</small>
                                        </h5>
                                        <div class="form-group">
                                            <div class="input-group m-b">
                                                    <span class="input-group-addon"><i
                                                            class="fa fa-calendar"></i></span>
                                                <input type="text" id="rentalBookingDateRange"
                                                       name="rentalBookingDateRange"/>
                                                <input type="hidden" id="ragestartdate"/>
                                                <input type="hidden" id="rageenddate"/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <h5>
                                            <small>Rent Price Category</small>
                                        </h5>
                                        <div class="form-group">
                                            <div class="input-group m-b">
                                                        <span class="input-group-addon"><i
                                                                class="glyphicon glyphicon-bitcoin"></i></span>
                                                <textarea id="PriceCategory" class="form-control"
                                                          readonly="true"></textarea>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div id="jsGrid"></div>
                                </div>
                            </div>
                            <div role="tabpanel" class="tab-pane" id="serviceTab">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <h5>
                                            <small>Search Service Here</small>
                                        </h5>
                                        <div class="form-group">
                                            <span></span>
                                            <input type="hidden" name="serviceid" id="serviceid"/>
                                            <input type="text" name="servicesearch" id="servicesearch"
                                                   placeholder="Search Service " class="form-control"/>
                                            <span></span>
                                            <ul aria-hidden="true" id='serviceresult'
                                                class="list-group dropdown-menu col-md-12" role="menu"></ul>
                                        </div>
                                    </div>
                                    <div class="col-md-6">

                                    </div>
                                </div>
                                <div class="row">
                                    <div id="ServicejsGrid"></div>
                                </div>
                            </div>
                            <div role="tabpanel" class="tab-pane" id="OtherTab">
                                <div id="OtherRentOuted"></div>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="row">
                    <div class="col-lg-6">
                        <h5>
                            <small>Diposit Amount</small>
                        </h5>
                        <div class="form-group">
                            <div class="input-group m-b">
                                <span class="input-group-addon"> </span>
                                <input type="text" readonly="readonly" id="Advancepayment" name="Advancepayment"/>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <%--<h5>--%>
                        <%--<small>Net Total</small>--%>
                        <%--</h5>--%>
                        <%--<div class="form-group">--%>
                        <%--<div class="input-group m-b">--%>
                        <%--<span class="input-group-addon"> </span>--%>
                        <%--<input type="hidden" readonly="readonly" id="NetTotal" name="NetTotal"/>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6">
                        <div class="buttons">
                            <a href="javascript: void(0);"
                               class="btn btn-secondary btn-rounded float-right" onclick="location.reload();
">Reloard Invoice</a>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="buttons">
                            <a href="javascript: void(0);"
                               class="btn btn-success btn-border btn-rounded float-right" id="rentalOutReciveBtn">Check
                                In Rental Recive Invoice</a>
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


<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
    Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered col-md-auto" role="document">
        <form id="modelpayment">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLongTitle">Modal title</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <h3>
                                <small>Total</small>
                            </h3>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                    <input type="number" readonly="readonly" id="SubTotal" class="form-control"/>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <h3>
                                <small>Discount</small>
                            </h3>

                        </div>
                        <div class="col-md-6">

                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                    <input type="number" min="0" oninput="calculateData(0)" id="Discount"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <h3>
                                <small>Deposit</small>
                            </h3>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                    <input type="number" readonly="readonly" id="dipositedvalue" class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <h3>
                                <small>Due Balance</small>
                            </h3>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                    <input type="number" readonly="readonly" id="duebalace" class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-horizontal">
                            <h3 class="text-divider"><span>Payment Area</span></h3>
                            <!-- Form Name -->
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <h3>
                                <small>Cash</small>
                            </h3>

                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                    <input type="number" min="0" oninput="calculateData(0)" readonly="readonly"
                                           id="CashPayments" class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <h3>
                                <small>Card</small>
                            </h3>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                    <input type="number" oninput="calculateData(0)" min="0" readonly="readonly"
                                           id="CardPayments" class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <h3>
                                <small>Credit</small>
                            </h3>

                        </div>
                        <div class="col-md-6">

                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                    <input type="number" oninput="calculateData(0)" min="0" id="CreditAmount"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <h3>
                                <small>Card No</small>
                            </h3>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                    <input type="number" id="CardNo" readonly="readonly" class="form-control"/>
                                </div>
                            </div>

                        </div>
                        <div class="col-md-6">
                            <h3>
                                <small>Card Type</small>
                            </h3>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <select id="Cardtype" class="form-control">
                                        <option>Visa</option>
                                        <option>Master</option>
                                        <option>American Express</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <h3>
                                <small>Check</small>
                            </h3>

                        </div>
                        <div class="col-md-6">

                            <div class="form-group">
                                <div class="input-group m-b">

                                    <input type="number" oninput="calculateData(0)" min="0" id="CheckPayments"
                                           class="form-control"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <h3>
                                <small>Check No</small>
                            </h3>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <input type="number" readonly="readonly" id="CheckNO" class="form-control"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <h3>
                                <small>Check Date</small>
                            </h3>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i
                                            class="glyphicon glyphicon-calendar fa fa-calendar"></i></span>
                                    <input type="text" name="checkBankDate"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <h3>
                                <small>Bank</small>
                            </h3>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <select id="CheckBank" class="form-control">
                                        <option value="1">Amana Bank</option>
                                        <option value="2">People's Bank</option>
                                        <option value="3">Sampath Bank</option>
                                        <option value="4">Commercial Bank</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" onclick="calculateData(1)" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </form>
    </div>
</div>

<!-- ============================================================== -->
<!-- 						Content End 	 						-->
<!-- ============================================================== -->


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


<!-- Js Grid -->
<script src="<c:url value="/assets/lib/jsgrid/jsgrid.min.js"/>"></script>
<script src="<c:url value="/assets/lib/jsgrid/db.js"/>"></script>


<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>
<!-- Toast -->
<script src="<c:url value="/assets/lib/toast/jquery.toast.min.js"/>"></script>


<!-- DataTimePicker -->
<script type="text/javascript" src="<c:url value="/assets/lib/bootstrap-daterangepicker/moment.js"/>"></script>
<script type="text/javascript"
        src="<c:url value="/assets/lib/bootstrap-daterangepicker/daterangepicker.js"/>"></script>

<!-- Clock Picker -->
<script type="text/javascript"
        src="<c:url value="/assets/lib/clockpicker/bootstrap-clockpicker.min.js"/>"></script>


<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>

<script src="<c:url value="/assets/lib/pace/pace.min.js"/>"></script>
<!-- Jquery UI -->
<script src="<c:url value="/assets/lib/jquery-ui/jquery-ui.min.js"/>"></script>
<script src="<c:url value="/assets/lib/jquery-validate/jquery.validate.js"/>"></script>
<script src="<c:url value="/assets/js/jquery.ui.custom.js"/>"></script>
<script src="<c:url value="/assets/js/jquery.base64.js"/>"></script>


<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfobject/2.1.1/pdfobject.min.js"></script>
 

<script>


    var total = 0;
    $('#CardPayments').keyup(function () {
        if ($('#CardPayments').val().trim().length > 0) {
            $("#Cardtype").removeAttr('readonly');
            $("#CardNo").removeAttr('readonly');
        } else {
            $("#CardNo").attr('readonly', 'readonly');
            $("#Cardtype").attr('readonly', 'readonly');
        }
        calculateData(0);
    });


    $("#CheckPayments").keyup(function () {
        if ($('#CheckPayments').val().trim().length > 0) {
            $("#CheckNO").removeAttr('readonly');
            $("#checkBankDate").removeAttr('readonly');
            $("#CheckBank").removeAttr('readonly');

        } else {
            $("#CheckNO").attr('readonly', 'readonly');
            $("#checkBankDate").attr('readonly', 'readonly');
            $("#CheckBank").attr('readonly', 'readonly');
        }
        calculateData(0);
    });


    $('#servicesearch').keyup(function () {
        $('#serviceresult').html('');

        var searchField = $('#servicesearch').val();
        var expression = new RegExp(searchField, "i");
        $.getJSON('servicess/all', function (data) {
            $.each(data, function (key, value) {
                if (value.servicename.search(expression) != -1 || value.servicename.search(expression) != -1) {
                    $('#serviceresult').append('<li  value="' + value.idservice + '" class="list-group-item link-class dropdown-item"><img src="' + "<%=request.getContextPath()%>" + value.icon + '" height="40" width="40" class="img-thumbnail" /> ' + value.idservice + ' | <span class="text-muted">' + value.servicename + '</span><input type="hidden" class="costprice" value="' + value.costprice + '"/><input type="hidden" class="retailprice" value="' + value.retailprice + '"/></li>');
                }
            });
        });
    });

    $('#serviceresult').css({'max-height': 500, 'overflow-y': 'auto'});


    $('#serviceresult').on('click', 'li', function () {

        var imgpath = $(this).find('img').attr('src');
        var click_text = $(this).text().split('|');
        $('#servicesearch').val($.trim(click_text[1]));
        $('#serviceid').val($(this).val());
        $("#serviceresult").html('');
        var retailprice = $(this).find('.retailprice').val();
        var costprice = $(this).find('.costprice').val();

        swal({
            title: $.trim(click_text[1]),
            html: '<input id="swal-inputQty" type="number" value="1" class="swal2-input" autofocus>' +
            '<input id="swal-inputFreeqty" type="number" value="0" class="swal2-input">',
            preConfirm: function () {
                return new Promise(function (resolve) {
                    if (($('#swal-inputQty').val() >= 0) & ($('#swal-inputFreeqty').val() >= 0) & ($('#swal-inputQty').val() + $('#swal-inputFreeqty').val() >= 1)) {
                        resolve([
                            $('#swal-inputQty').val(),
                            $('#swal-inputFreeqty').val()
                        ])
                    } else {
                        reject('write something please');
                    }
                })
            }
        }).then(function (result) {
            var data = {
                "serviceIdservice": $('#serviceid').val(),
                "isinvoiced": 0,
                "freeqty": $('#swal-inputFreeqty').val(),
                "rentoutedhedderIdrentoutedhedder":${id},
                "discount": 0,
                "qty": $('#swal-inputQty').val(),
                "price": retailprice,
                "costprice": costprice
            };
            return $.ajax({
                url: "renntoutedinvoice/Serviceadd",
                type: 'POST',
                dataType: "json",
                contentType: "application/json",
                data: JSON.stringify(data)
            }).done(function (response) {
                $('#servicesearch').val('');
                $('#serviceid').val('');
                $("#ServicejsGrid").jsGrid("loadData");
                console.log("done: " + JSON.stringify(response));
            }).fail(function (msg) {
                console.log("fail" + msg);
            });
        }).catch(swal.noop)
    });


    $("#CancelRentalInvoiceBtn").click(function () {
        if ($("#InvoiceId").val() === null | $("#InvoiceId").val() === '') {
            swal({
                title: 'An warring Cart Is Not Selected',
                text: 'Please Select Cart For Delete :)',
                type: 'warning',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else {
            swal({
                title: 'Are Sure Cancel Invoice',
                text: 'Please Click On Create For New Cart',
                type: 'warning',
                showCancelButton: true,
                confirmButtonColor: '#3085d6',
                cancelButtonColor: '#d33',
                cancelButtonText: 'Cancel',
                confirmButtonText: 'Delete',
                confirmButtonClass: 'btn btn-space btn-lg btn-danger hover',
                cancelButtonClass: 'btn btn-space btn-lg btn-primary hover',
                buttonsStyling: false,
                preConfirm: function () {
                    return new Promise(function (resolve) {
                        $.ajax({
                            url: 'invoicecancel/CancelrentoutedInvoice/${id}',
                            type: 'POST',
                            data: {
                                id: $("#InvoiceId").val()
                            },
                            dataType: 'JSON'
                        }).done(function (response) {
                            $("#OtherRentOuted").jsGrid("loadData");
                            $("#jsGrid").jsGrid("loadData");
                            $("#ServicejsGrid").jsGrid("loadData");
                            $("#InvoiceId").val('');
                            $("#CustomerAddress").val('');
                            $("#Customerid").val('');
                            $("#Customersearch").val('');

                            LoardRentalPriceList();
                            swal({
                                title: 'Invoice Cancelation Is Completed !',
                                text: 'successfully deleted.',
                                type: 'success',
                                confirmButtonClass: 'btn btn-space btn-lg btn-primary hover',
                                confirmButtonText: 'Ok',
                                buttonsStyling: false
                            });
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
        }
    });

    var RentproductList = [];
    var RentOtherList = [];
    var RentServiceList = [];
    $("#rentalOutReciveBtn").click(function () {

        calculateData(0);

        $("#exampleModalCenter").modal('toggle');

        var modal = $("#exampleModalCenter");
        modal.find('.modal-title').text('Payment ' + total);
        //            modal.find('.modal-body input').val(total);

    });
    function calculateData(invoicing) {
        RentproductList = [];
        RentOtherList = [];
        RentServiceList = [];

        var totp = 0;
        var toto = 0;
        var tots = 0;
        var i;
        for (i = 0; i < $("#jsGrid").jsGrid("_itemsCount"); ++i) {
            var data = JSON.stringify($('#jsGrid').data('JSGrid').data[i]);
            totp = totp + parseFloat($('#jsGrid').data('JSGrid').data[i].total);
            RentproductList.push(data)
        }

        var s;
        for (s = 0; s < $("#ServicejsGrid").jsGrid("_itemsCount"); ++s) {
            var data = JSON.stringify($('#ServicejsGrid').data('JSGrid').data[s]);
            tots = tots + parseFloat($('#ServicejsGrid').data('JSGrid').data[s].total);
            RentServiceList.push(data);
        }

        var h;
        for (h = 0; h < $("#OtherRentOuted").jsGrid("_itemsCount"); ++h) {
            var data = JSON.stringify($('#OtherRentOuted').data('JSGrid').data[h]);
            toto = toto + parseFloat($('#OtherRentOuted').data('JSGrid').data[h].total);
            RentOtherList.push(data);
        }
        total = (totp + tots + toto);
        $("#NetTotal").val(total);
        $("#SubTotal").val(total);
        var nettoatal = total - $("#Discount").val();
        var deposit = $("#dipositedvalue").val();

        var cashamount = parseFloat(($("#CashPayments").val().trim().length > 0 ? $("#CashPayments").val() : 0));
        var checkamount = parseFloat(($("#CheckPayments").val().trim().length > 0 ? $("#CheckPayments").val() : 0));
        var cardamount = parseFloat(($("#CardPayments").val().trim().length > 0 ? $("#CardPayments").val() : 0));
        var creditamount = parseFloat(($("#CreditAmount").val().trim().length > 0 ? $("#CreditAmount").val() : 0));

        var balance = deposit - nettoatal;
        var duebalance = (balance < 0 ? -1 * balance : balance) - (cashamount + creditamount + checkamount + cardamount);
        $("#duebalace").val(duebalance);

        $(".error").remove();


        if (balance < 0) {
            $("#CashPayments").removeAttr('readonly');
            $("#CardPayments").removeAttr('readonly');
            $("#CreditAmount").removeAttr('readonly');
            $("#CheckPayments").removeAttr('readonly');
        } else {
            $("#CashPayments").attr('readonly', 'readonly');
            $("#CardPayments").attr('readonly', 'readonly');
            $("#CreditAmount").attr('readonly', 'readonly');
            $("#CardNo").attr('readonly', 'readonly');
            $("#Cardtype").attr('readonly', 'readonly');
            $("#CheckPayments").attr('readonly', 'readonly');
            $("#CheckNO").attr('readonly', 'readonly');
            $("#checkBankDate").attr('readonly', 'readonly');
            $("#CheckBank").attr('readonly', 'readonly');
        }
        if (duebalance < 0) {
            $('#duebalace').after('<span class="error">Due Balance Should Be Zero!</span>');
            return false;
        } else {
            if ((invoicing === 1) & (duebalance == 0)) {
                var startDate = $('#rentalBookingDateRange').data('daterangepicker').startDate;
                var endDate = $('#rentalBookingDateRange').data('daterangepicker').endDate;
//               var checkdate=$('#checkBankDate').data('daterangepicker').startDate;
                var checkdate = 1545732376099;


                var DataOb = "{\"rentalrentoutedInvoice\":\"${id}\",\"startDate\":" + startDate + ",\"endDate\":" + endDate + ",\"discount\": " + ($("#Discount").val() > 0 ? $("#Discount").val() : 0) + ",\"cashAmount\":" + cashamount + ",\"checkAmount\":" + checkamount + ",\"cardAmount\":" + cardamount + ",\"creditAmount\":" + creditamount + ",\"cardno\":\"" + $("#CardNo").val() + "\",\"checkNo\":\"" + $("#CheckNO").val() + "\",\"checkBankDate\": " + checkdate + ",\"bankId\":" + $("#CheckBank").val() + ",\"rentOutedProductItems\":[";
                var index = 0;
                var comma = "";
                for (index = 0; index < $("#jsGrid").jsGrid("_itemsCount"); ++index) {
                    parseFloat($('#jsGrid').data('JSGrid').data[index].total);
                    DataOb = DataOb + comma + "{" +
                        "\"id\":" + parseFloat($('#jsGrid').data('JSGrid').data[index].idrentoutedproductdata) + "," +
                        "\"Productid\":" + parseFloat($('#jsGrid').data('JSGrid').data[index].productidproduct) + "," +
                        "\"discount\":" + parseFloat($('#jsGrid').data('JSGrid').data[index].discount) + "," +
                        "\"qty\":" + parseFloat($('#jsGrid').data('JSGrid').data[index].balanceqty) + "," +
                        "\"freeqty\":" + parseFloat($('#jsGrid').data('JSGrid').data[index].balancefreeqty) +
                        "}";
                    comma = ",";
                }
                DataOb = DataOb + "]}";
                console.log(DataOb);
                $.ajax({
                    url: 'renntoutedinvoice/RentoutalInvoicing', /* php post url */
                    type: 'POST',
                    contentType: "application/json",
                    data: DataOb,
                    dataType: 'json'
                })

                    .done(function (response) {
                        swal({
                            title: 'Rental Invoice Done !',
                            text: ' Successfully Invoiced Rental.',
                            type: 'success',
                            confirmButtonClass: 'btn btn-space btn-lg btn-primary hover',
                            confirmButtonText: 'Ok',
                            buttonsStyling: false
                        });
                        var myWindow = window.open("<%=request.getContextPath()%>/RentalInvoice/" + response.id, "_blank", "toolbar=yes,scrollbars=yes,resizable=yes,top=500,left=500,width=600,height=900");
                        myWindow.print();
                        setTimeout(function () {
                            parent.history.back();
                        }, 3000);
//Pending Rental Invoice
                    }).fail(function () {
                    $.toast({
                        heading: 'Error !',
                        text: 'This is an example top alert. You can edit what u wish..',
                        position: 'top-right',
                        loaderBg: '#fff',
                        icon: 'error',
                        hideAfter: 3000,
                        stack: 1

                    });
                });
            }
        }


    }


    function settotal() {
        var totp = 0;
        var toto = 0;
        var tots = 0;
        var i;
        for (i = 0; i < $("#jsGrid").jsGrid("_itemsCount"); ++i) {
            totp = totp + parseFloat($('#jsGrid').data('JSGrid').data[i].total);
        }

        var s;
        for (s = 0; s < $("#ServicejsGrid").jsGrid("_itemsCount"); ++s) {

            tots = tots + parseFloat($('#ServicejsGrid').data('JSGrid').data[s].total);
        }

        var h;
        for (h = 0; h < $("#OtherRentOuted").jsGrid("_itemsCount"); ++h) {
            toto = toto + parseFloat($('#OtherRentOuted').data('JSGrid').data[h].total);
        }
        total = (totp + tots + toto);
        $("#NetTotal").val(total);
    }

    function setRentoutedInvoiceDetails() {
        $.ajax({
            url: "renntoutedinvoice/byId/${id}",
            type: 'GET',
            dataType: "json",
            contentType: "application/json",
            data: ''
        }).done(function (response) {
            $("#CustomerAddress").val(response.diliveryaddress);
            $("#Customerid").val(response.customersIdcustomers);
            $("#Customersearch").val(response.customersName);
            $("#ragestartdate").val(response.diliverydatetime);
            $("#rageenddate").val(response.today);
            $("#PriceCategory").val(response.rentalpricecategoryName);
            $("#Advancepayment").val(response.Advancepayment);
            $("#dipositedvalue").val(response.Advancepayment);
            $('#rentalBookingDateRange').data('daterangepicker').setEndDate(moment(response.today).format("YYYY/MM/DD"));
            $('#rentalBookingDateRange').data('daterangepicker').setStartDate(moment(response.diliverydatetime).format("YYYY/MM/DD"));

            $("#jsGrid").jsGrid("loadData");
            $("#ServicejsGrid").jsGrid("loadData");
            $("#OtherRentOuted").jsGrid("loadData");
            settotal();
        }).fail(function (msg) {
            console.log("fail" + msg);
        });
    }

    function LoardCartData() {
        $("#OtherRentOuted").jsGrid({
            width: "100%",
            height: "auto",
            sorting: true,
            autoload: true,
            inserting: true,
            filtering: true,
            editing: true,
            Selecting: true,
            paging: true,
            pageSize: 5,
            pageButtonCount: 5,
            pageIndex: 1,
            confirmDeleting: false,
            finishInsert: function (insertedItem) {
                settotal();
                alert();
            },
            finishLoad: function (loadedData) {
                settotal();
                alert();
            },
            finishDelete: function (deletedItem, deletedItemIndex) {
                settotal();
            },
            onItemDeleting: function (args) {
                console.log("onItemDeleting");
                if (!args.item.deleteConfirmed) { // custom property for confirmation
                    args.cancel = true; // cancel deleting
                    swal({
                        title: 'Are you sure?',
                        text: "It will permanently deleted !",
                        type: 'warning',
                        showCancelButton: true,
                        confirmButtonColor: '#3085d6',
                        cancelButtonColor: '#d33',
                        confirmButtonText: 'Yes, delete it!'
                    }).then(function () {

                        $.ajax({
                            url: "renntoutedinvoice/OtherDelete/" + args.item.idrentoutedother,
                            type: 'POST',
                            dataType: "json",
                            contentType: "application/json",
                            data: ''
                        }).done(function (response) {
                            args.item.deleteConfirmed = true;
                            $("#OtherRentOuted").jsGrid('deleteItem', args.item); //call deleting once more in callback
                            swal(
                                'Deleted!',
                                'Your file has been deleted.',
                                'success'
                            );
                        }).fail(function (msg) {
                            console.log("fail" + msg);
                        });


                    })
                }
            },
            controller: {
                loadData: function (filter) {
                    return $.ajax({
                        url: "renntoutedinvoice/OtherbyId/${id}",
                        dataType: "json"
                    });

                },
                insertItem: function (insertingClient) {
                    var d = $.Deferred();
                    var data = {
                        "description": insertingClient.description,
                        "isinvoiced": 0,
                        "freeqty": insertingClient.freeqty,
                        "rentoutedhedderIdrentoutedhedder":${id},
                        "qty": insertingClient.qty,
                        "rate": insertingClient.rate,
                    };
                    $.ajax({
                        url: "renntoutedinvoice/Otheradd",
                        type: 'POST',
                        dataType: "json",
                        contentType: "application/json",
                        data: JSON.stringify(data)
                    }).done(function (response) {
                        $("#OtherRentOuted").jsGrid("loadData");

                    }).fail(function (msg) {
                        console.log("fail" + msg);
                    });

                },
                updateItem: function (updatingClient) {
                    var d = $.Deferred();
                    var data = {
                        "idrentoutedother": updatingClient.idrentoutedother,
                        "description": updatingClient.description,
                        "isinvoiced": 0,
                        "freeqty": updatingClient.freeqty,
                        "rentoutedhedderIdrentoutedhedder":${id},
                        "qty": updatingClient.qty,
                        "rate": updatingClient.rate,
                    };
                    $.ajax({
                        url: "renntoutedinvoice/Otherupdate",
                        type: 'POST',
                        dataType: "json",
                        contentType: "application/json",
                        data: JSON.stringify(data)
                    }).done(function (response) {
                        $("#OtherRentOuted").jsGrid("loadData");

                    }).fail(function (msg) {
                        console.log("fail" + msg);
                    });
                    updatingClient.total = updatingClient.qty * updatingClient.rate;
                    d.resolve(updatingClient);
                    return d.promise();
                }
            },
            fields: [
                {name: "idrentoutedother", title: "Id", width: 30},
                {name: "description", title: "Service Description", type: "text", width: 50},
                {
                    name: "qty", title: "Qty", type: "number", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {
                    name: "freeqty", title: "Free Qty", type: "number", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {
                    name: "rate", title: "Price", type: "number", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {name: "total", title: "Total", type: "rel", width: 50},
                {
                    type: "control",
                    editButton: false,
                    headerTemplate: function () {
                        var grid = this._grid;
                        var isInserting = grid.inserting;

                        var $button = $("<input>").attr("type", "button")
                            .addClass([this.buttonClass, this.modeButtonClass, this.insertModeButtonClass].join(" "))
                            .on("click", function () {
                                isInserting = !isInserting;
                                grid.option("inserting", isInserting);
                            });
                        return $button;
                    }
                }
            ]
        });

        $("#jsGrid").jsGrid({
            width: "100%",
            height: "auto",
            sorting: true,
            autoload: true,
            filtering: true,
            editing: true,
            Selecting: true,
            paging: true,
            pageSize: 5,
            pagerFormat: "Pages: {first} {prev} {pages} {next} {last} &nbsp;&nbsp; {pageIndex} of {pageCount} Total rows: {itemCount}",
            pageButtonCount: 5,
            pageIndex: 1,

            controller: {
                loadData: function (filter) {
                    var date1 = $('#rentalBookingDateRange').data('daterangepicker').startDate;
                    var date2 = $('#rentalBookingDateRange').data('daterangepicker').endDate;
                    var timeDiff = Math.abs(date2 - date1);
                    var diffDays = Math.ceil(timeDiff / (1000 * 3600 * 24));
                    return $.ajax({
                        url: "renntoutedinvoice/ProductbyId/${id}/" + diffDays,
                        dataType: "json"
                    });
                },

                updateItem: function (updatingClient) {
                    var d = $.Deferred();
                    updatingClient.total = updatingClient.balanceqty * updatingClient.rate;
                    if (updatingClient.qty - updatingClient.setoffqty < updatingClient.balanceqty) {
                        var qty = updatingClient.qty - updatingClient.setoffqty;
                        updatingClient.balanceqty = qty;
                        updatingClient.total = qty * updatingClient.rate - updatingClient.discount;
                        $.toast({
                            heading: 'Error !',
                            text: 'Invalid Qty',
                            position: 'top-right',
                            loaderBg: '#fff',
                            icon: 'error',
                            hideAfter: 3000,
                            stack: 1

                        });
                    }
                    if (updatingClient.freeqty - updatingClient.setofffreeqty < updatingClient.balancefreeqty) {
                        var freeqty = updatingClient.freeqty - updatingClient.settofffreeqty;
                        updatingClient.balancefreeqty = freeqty;
                        $.toast({
                            heading: 'Error !',
                            text: 'Invalid Qty ! Qty Cannot Be Zero! ',
                            position: 'top-right',
                            loaderBg: '#fff',
                            icon: 'error',
                            hideAfter: 3000,
                            stack: 1

                        });
                    }
                    if (updatingClient.balanceqty + updatingClient.balancefreeqty <= 0) {
                        var freeqty = updatingClient.freeqty - updatingClient.setofffreeqty;
                        updatingClient.balancefreeqty = freeqty;

                        var qty = updatingClient.qty - updatingClient.setoffqty;
                        updatingClient.balanceqty = qty;
                        updatingClient.total = qty * updatingClient.rate - updatingClient.discount;

                        $.toast({
                            heading: 'Error !',
                            text: 'Invalid Freee Qty',
                            position: 'top-right',
                            loaderBg: '#fff',
                            icon: 'error',
                            hideAfter: 3000,
                            stack: 1

                        });
                    } else {
                        var qty = updatingClient.qty - updatingClient.setoffqty;
                        updatingClient.balanceqty = qty;
                        updatingClient.total = qty * updatingClient.rate - updatingClient.discount;


                    }
                    d.resolve(updatingClient);
                    return d.promise();
                }
            },
            fields: [
                {name: "idrentoutedproductdata", title: "Id", visible: false, width: 0},
                {name: "productidproduct", title: "Id", type: "rel", width: 30},
                {name: "productCode", title: "Code", type: "rel", width: 40},
                {name: "productDescription", title: "Description", type: "rel", width: 50},
                {name: "price", title: "Price", type: "rel", width: 50, align: "right"},
                {
                    name: "balanceqty", title: "Qty", type: "number", width: 50,
                    validate: function (value, item) {
                        return value <= (item.qty - item.setoffqty) & value >= 0;
                    }
                },
                {
                    name: "balancefreeqty", title: "Free Qty", type: "number", width: 50,
                    validate: function (value, item) {
                        return value <= (item.freeqty - item.setofffreeqty) & value >= 0;
                    }
                },
                {
                    name: "daycount", title: "Days Count", type: "rel", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {
                    name: "discount", title: "Discount", type: "number", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {name: "total", title: "Total", type: "rel", width: 50},
                {name: "qty", type: "hidden", css: "hide", width: 0},
                {name: "setoffqty", type: "hidden", css: "hide", width: 0},
                {name: "freeqty", type: "hidden", css: "hide", width: 0},
                {name: "setofffreeqty", type: "hidden", css: "hide", width: 0},
                {type: "control"}
            ],
            finishLoad: function (loadedData) {
                settotal();
                alert();
            },
            confirmDeleting: false,
            onItemDeleting: function (args) {
                console.log("onItemDeleting");
                settotal();
            },
            finishDelete: function (deletedItem, deletedItemIndex) {
                settotal();
            },
        });
        $("#ServicejsGrid").jsGrid({
            width: "100%",
            height: "auto",
            sorting: true,
            autoload: true,
            filtering: true,
            editing: true,
            Selecting: true,
            paging: true,
            pageSize: 5,
            pageButtonCount: 5,
            pageIndex: 1,
            finishInsert: function (insertedItem) {
                settotal();
            },
            finishLoad: function (loadedData) {
                settotal();
            },
            finishDelete: function (deletedItem, deletedItemIndex) {
                settotal();
            },
            confirmDeleting: false,
            onItemDeleting: function (args) {
                console.log("onItemDeleting");
                if (!args.item.deleteConfirmed) { // custom property for confirmation
                    args.cancel = true; // cancel deleting
                    swal({
                        title: 'Are you sure?',
                        text: "It will permanently deleted !",
                        type: 'warning',
                        showCancelButton: true,
                        confirmButtonColor: '#3085d6',
                        cancelButtonColor: '#d33',
                        confirmButtonText: 'Yes, delete it!'
                    }).then(function () {
                        //call deleting once more in callback
                        $.ajax({
                            url: "renntoutedinvoice/ServiceDelete/" + args.item.idrentoutservicedata,
                            type: 'POST',
                            dataType: "json",
                            contentType: "application/json",
                            data: ''
                        }).done(function (response) {
                            args.item.deleteConfirmed = true;
                            $("#ServicejsGrid").jsGrid('deleteItem', args.item);

                            swal(
                                'Deleted!',
                                'Your file has been deleted.',
                                'success'
                            );

                        }).fail(function (msg) {
                            console.log("fail" + msg);
                        });

                    })
                }
            },
            controller: {
                loadData: function (filter) {
                    var data = $.ajax({
                        url: "renntoutedinvoice/ServicebyId/${id}",
                        dataType: "json"
                    });

                    return data;
                },

                updateItem: function (updatingClient) {
                    var data = {
                        "serviceIdservice": updatingClient.idrentoutservicedata,
                        "idrentoutservicedata": updatingClient.idrentoutservicedata,
                        "isinvoiced": 0,
                        "freeqty": updatingClient.freeqty,
                        "rentoutedhedderIdrentoutedhedder":${id},
                        "discount": updatingClient.discount,
                        "qty": updatingClient.qty,
                        "price": updatingClient.price,
                        "costprice": updatingClient.costprice
                    };
                    $.ajax({
                        url: "renntoutedinvoice/Serviceupdate",
                        type: 'POST',
                        dataType: "json",
                        contentType: "application/json",
                        data: JSON.stringify(data)
                    }).done(function (response) {
                        $("#ServicejsGrid").jsGrid("loadData");
                    }).fail(function (msg) {
                        console.log("fail" + msg);
                    });
                    var d = $.Deferred();
                    updatingClient.total = updatingClient.qty * updatingClient.price;
                    d.resolve(updatingClient);
                    return d.promise();
                }


            },
            fields: [
                {name: "idrentoutservicedata", title: "id", visible: false, width: 0},
                {name: "serviceIdservice", title: "Code", type: "rel", width: 30},
                {name: "serviceDescription", title: "Service Description", type: "rel", width: 50},
                {
                    name: "qty", title: "Qty", type: "number", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {
                    name: "freeqty", title: "Free Qty", type: "number", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {
                    name: "price", title: "Price", type: "number", width: 50,
                    validate: function (value, item) {
                        return value >= 0 & value >= item.costprice;
                    }
                },
                {
                    name: "discount", title: "Discount", type: "number", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {name: "total", title: "Total", type: "rel", width: 50},
                {name: "costprice", type: "hidden", css: "hide", width: 0},
                {type: "control"}
            ]
        });

    }


    $(function () {/* BirthDate */
        $('input[name="checkBankDate"]').daterangepicker({
                singleDatePicker: true,
                opens: 'up',
                showDropdowns: true,
                drops: 'up',
                locale: {
                    format: 'YYYY/MM/DD'
                }, minDate: moment(new Date()).format("YYYY/MM/DD"),
                startDate: moment(new Date()).format("YYYY/MM/DD")
            },
            function (start, end, label) {
                var years = moment().diff(start, 'years');
                alert(moment(start).format("YYYY/MM/DD"))
            });
        /* Datarange2 */
        $('input[name="rentalBookingDateRange"]').daterangepicker({
            timePicker: false,
            timePickerIncrement: 60 * 24,
            locale: {
                format: 'YYYY/MM/DD'
            },
            minDate: moment('2018-01-05').format("YYYY/MM/DD"),
            startDate: moment('2018-01-05').format("YYYY/MM/DD"),
            endDate: moment().startOf('hour').add(24, 'hour')
        }, function (start, end, label) {
            $('#rentalBookingDateRange').data('daterangepicker').setEndDate(moment(end).format("YYYY/MM/DD"));
            $('#rentalBookingDateRange').data('daterangepicker').setStartDate(moment(start).format("YYYY/MM/DD"));
        });
    });

    $('input[name="rentalBookingDateRange"]').on('apply.daterangepicker', function (ev, picker) {
        $("#jsGrid").jsGrid("loadData");

    });
</script>

<%--<script>--%>
<%--//    function LoardRentalPriceList() {--%>
<%--//        $("#PriceCategory").html('');--%>
<%--//        jQuery.getJSON('rentalPriceCategory/active', function (data) {--%>
<%--//            var i;--%>
<%--//            for (i = 0; i < data.length; i++) {--%>
<%--//                var dataOB = data[i];--%>
<%--//                $("#PriceCategory").append('<option value="' + dataOB.idrentalpricecategory + '">' + dataOB.rentalpricecategoryname + '</option>');--%>
<%--//            }--%>
<%--//        });--%>
<%--//    }--%>
<%--</script>--%>

<script type="text/javascript">
    $(document).ready(function () {
        setRentoutedInvoiceDetails();
        LoardCartData();
        settotal();
    });

</script>
</body>
</html>