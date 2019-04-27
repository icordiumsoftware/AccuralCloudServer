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
                response.sendRedirect("/login");
            }
        } catch (NullPointerException e) {
            response.sendRedirect("/login");
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

    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-header card-default">
                    Rental Cart
                    <p class="text-muted">Rental Booking Cart</p>
                </div>
                <div class="card-body">
                    <input type="hidden" name="cartId" id="cartId">
                    <div class="row">
                        <div class="col-lg-6">
                            <h5>
                                <small>Cart Action</small>
                            </h5>
                            <div class="form-group">
                                <div class="buttons">
                                    <button id="newCardCreteBtn" class="btn btn-outline-primary btn-border btn-rounded">
                                        Create New Cart
                                    </button>
                                    <button id="deleteCartBtn" class="btn btn-danger btn-border btn-rounded">Delete
                                        Cart
                                    </button>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <fieldset class="jquery-Ui-fieldset">
                                <label for="recentDraftCarList">Recent Cart Draft</label>
                                <select name="recentDraftCarList" id="recentDraftCarList" class="form-control">
                                </select>
                            </fieldset>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-6">
                            <span></span>
                            <h5>
                                <small>Search Customer Here</small>
                            </h5>
                            <div class="form-group">
                                <input type="hidden" name="Customerid" id="Customerid"/>
                                <input type="text" name="Customersearch" id="Customersearch"
                                       placeholder="Search Customer " class="form-control"/>
                                <ul aria-hidden="true" id='Customerresult' class="list-group dropdown-menu col-md-12"
                                    role="menu"></ul>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <h5>
                                <small>DiliveryAddress</small>
                            </h5>
                            <div class="form-group">
                                <div class="input-group m-b">
                                    <span class="input-group-addon"><i class=""></i></span>
                                    <input type="text" id="CustomerAddress" name="CustomerAddress"/>
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
                                        <div class="col-lg-6 align-self-center ">
                                            <h5>
                                                <small>Search Product Here</small>
                                            </h5>
                                            <div class="form-group">
                                                <span></span>
                                                <input type="hidden" name="productid" id="productid"/>
                                                <input type="text" name="search" id="search"
                                                       placeholder="Search Product " autocomplete="off"
                                                       class="form-control"/>
                                                <span></span>
                                                <ul aria-hidden="true" id='result'
                                                    class="list-group dropdown-menu col-md-12" role="menu"></ul>
                                            </div>
                                        </div>
                                        <div class="col-md-6 float-right mt-10">
                                            <h5>
                                                <small>Date and Time</small>
                                            </h5>
                                            <div class="form-group">
                                                <div class="input-group m-b">
                                                        <span class="input-group-addon"><i
                                                                class="glyphicon glyphicon-calendar fa fa-calendar"></i></span>
                                                    <input type="text" id="rentalBookingDateRange"
                                                           name="rentalBookingDateRange"/>
                                                    <input type="hidden" id="ragestartdate"/>
                                                    <input type="hidden" id="rageenddate"/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-6 align-self-center ">
                                            <h5>
                                                <small>Advance Amount</small>
                                            </h5>
                                            <div class="form-group">
                                                <div class="input-group m-b">
                                                    <span class="input-group-addon"><i
                                                            class="glyphicon glyphicon-coin fa fa-coin">                                                         </i></span>
                                                    <input type="number" min="0" id="advanceamount" name="advanceamount"
                                                           class="form-control"/>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-6 float-right mt-10">
                                            <h5>
                                                <small>Select Rent Price Category</small>
                                            </h5>
                                            <div class="form-group">
                                                <div class="input-group m-b">
                                                        <span class="input-group-addon"><i
                                                                class="glyphicon glyphicon-bitcoin fa fa-calendar"></i></span>
                                                    <select id="PriceCategory" class="form-control"></select>
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
                                        <div class="col-lg-6 align-self-center ">
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
                                    </div>
                                    <div id="ServicejsGrid"></div>
                                </div>
                                <div role="tabpanel" class="tab-pane" id="OtherTab">
                                    <div id="OtherRentCart"></div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="buttons">
                                <a href="javascript: void(0);"
                                   class="btn btn-secondary btn-rounded float-right" id="rentalorderdispatchBtn">Rental
                                    Ordering Dispatch To Customer</a>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="buttons">
                                <a href="javascript: void(0);"
                                   class="btn btn-success btn-border btn-rounded float-right" id="rentalBookingBtn">Place
                                    Booking Order</a>
                            </div>
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
    $("#deleteCartBtn").click(function () {
        if ($("#cartId").val() === null | $("#cartId").val() === '') {
            swal({
                title: 'An warring Cart Is Not Selected',
                text: 'Please Select Cart For Delete :)',
                type: 'warning',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else {
            swal({
                title: 'Are Sure Delete Cart',
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
                            url: '/RentCart/delete/' + $("#cartId").val(), /* php post url */
                            type: 'POST',
                            data: {
                                id: $("#cartId").val()
                            },
                            dataType: 'JSON'
                        }).done(function (response) {
                            $("#OtherRentCart").jsGrid("loadData");
                            $("#jsGrid").jsGrid("loadData");
                            $("#ServicejsGrid").jsGrid("loadData");
                            $("#cartId").val('');
                            $("#CustomerAddress").val('');
                            $("#Customerid").val('');
                            $("#Customersearch").val('');
                            LoardrecentDraftCarList();
                            LoardRentalPriceList();
                            swal({
                                title: 'New Cart Done!',
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
    $("#newCardCreteBtn").click(function () {
        if ($("#Customerid").val() === null | $("#Customerid").val() === '') {
            swal({
                title: 'An warring Customer',
                text: 'Please Select Customer :)',
                type: 'warning',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else if ($("#PriceCategory").val() <= 0) {
            swal({
                title: 'An warring Rental Price Category',
                text: 'Please Select Rental Price Category :)',
                type: 'question',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else if ($("#rentalBookingDateRange").data('daterangepicker').endDate == null) {
            swal({
                title: 'An warring Rental Date Range',
                text: 'Please Select Date Rage :)',
                type: 'question',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else {
            swal({
                title: 'Are Sure Create New Cart',
                text: 'Please Click On Create For New Cart',
                type: 'question',
                showCancelButton: true,
                confirmButtonColor: '#3085d6',
                cancelButtonColor: '#d33',
                cancelButtonText: 'Cancel',
                confirmButtonText: 'Create',
                confirmButtonClass: 'btn btn-space btn-lg btn-success hover',
                cancelButtonClass: 'btn btn-space btn-lg btn-primary hover',
                buttonsStyling: false,
                preConfirm: function () {
                    return new Promise(function (resolve) {
                        var data = {
                            "cartstatus": 1,
                            "customersIdcustomers": $("#Customerid").val(),
                            "locationIdlocation":${sessionScope.get("LocationID")},
                            "usersIdusers":${sessionScope.get("userid")},
                            "rentalpricecategoryIdrentalpricecategory": $("#PriceCategory").val(),
                            "advanceamount": ($("advanceamount").val() >= 0 ? $("advanceamount").val() : 0),
                            "diliveryAddress": $("#CustomerAddress").val(),
                            "startDate": $("#rentalBookingDateRange").data('daterangepicker').startDate,
                            "endDate": $("#rentalBookingDateRange").data('daterangepicker').endDate
                        };
                        $.ajax({
                            url: 'RentCart/add', /* php post url */
                            type: 'POST',
                            data: JSON.stringify(data),
                            contentType: "application/json",
                            dataType: 'JSON'
                        })
                            .done(function (response) {
                                LoardrecentDraftCarList();
                                $('#cartId').val(response.id);
                                $("#recentDraftCarList").val(response.id);
                                LoardCartData();
                                swal({
                                    title: 'Cart',
                                    text: ' successfully deleted.',
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


    $("#rentalBookingBtn").click(function () {
        if ($("#Customerid").val() === null | $("#Customerid").val() === '') {
            swal({
                title: 'An warring Customer',
                text: 'Please Select Customer :)',
                type: 'warning',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else if ($("#PriceCategory").val() <= 0) {
            swal({
                title: 'An warring Rental Price Category',
                text: 'Please Select Rental Price Category :)',
                type: 'question',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else if ($('#cartId').val() < 0) {
            swal({
                title: 'An warring Rental Cart',
                text: 'Please Select Rental Cart:)',
                type: 'question',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else {
            swal({
                title: 'Are Sure Create New Cart',
                text: 'Please Click On Create For New Cart',
                type: 'question',
                showCancelButton: true,
                confirmButtonColor: '#3085d6',
                cancelButtonColor: '#d33',
                cancelButtonText: 'Cancel',
                confirmButtonText: 'Create',
                confirmButtonClass: 'btn btn-space btn-lg btn-success hover',
                cancelButtonClass: 'btn btn-space btn-lg btn-primary hover',
                buttonsStyling: false,
                preConfirm: function () {
                    return new Promise(function (resolve) {

                        $.ajax({
                            url: 'RentCart/CreateBookingByCart/' + $('#cartId').val(), /* php post url */
                            type: 'POST',
                            data: '',
                            contentType: "application/json",
                            dataType: 'JSON'
                        })
                            .done(function (response) {
                                swal({
                                    title: 'Booikng Careate Done',
                                    text: ' Successfully Booking Placed.',
                                    type: 'success',
                                    confirmButtonClass: 'btn btn-space btn-lg btn-primary hover',
                                    confirmButtonText: 'Ok',
                                    buttonsStyling: false
                                });
                                setTimeout(
                                    function () {
                                        location.reload();
                                    }, 3000);

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
    $("#rentalorderdispatchBtn").click(function () {
        if ($("#Customerid").val() === null | $("#Customerid").val() === '') {
            swal({
                title: 'An warring Customer',
                text: 'Please Select Customer :)',
                type: 'warning',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else if ($("#PriceCategory").val() <= 0) {
            swal({
                title: 'An warring Rental Price Category',
                text: 'Please Select Rental Price Category :)',
                type: 'question',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else if ($('#cartId').val() < 0) {
            swal({
                title: 'An warring Rental Cart',
                text: 'Please Select Rental Cart:)',
                type: 'question',
                confirmButtonClass: 'btn btn-primary btn-lg',
                buttonsStyling: true
            });
        } else {
            swal({
                title: 'Are Sure Create New Cart',
                text: 'Please Click On Create For New Cart',
                type: 'question',
                showCancelButton: true,
                confirmButtonColor: '#3085d6',
                cancelButtonColor: '#d33',
                cancelButtonText: 'Cancel',
                confirmButtonText: 'Create',
                confirmButtonClass: 'btn btn-space btn-lg btn-success hover',
                cancelButtonClass: 'btn btn-space btn-lg btn-primary hover',
                buttonsStyling: false,
                preConfirm: function () {
                    return new Promise(function (resolve) {

                        $.ajax({
                            url: 'RentCart/CreateBookingRentalInvoiceCartById/' + $('#cartId').val(), /* php post url */
                            type: 'POST',
                            data: '',
                            contentType: "application/json",
                            dataType: 'JSON'
                        })
                            .done(function (response) {
                                swal({
                                    title: 'Booikng Careate Done',
                                    text: ' Successfully Booking Placed.',
                                    type: 'success',
                                    confirmButtonClass: 'btn btn-space btn-lg btn-primary hover',
                                    confirmButtonText: 'Ok',
                                    buttonsStyling: false
                                });
                                var myWindow = window.open("<%=request.getContextPath()%>/RentalDispatchInvoice/" + response.id, "_blank", "toolbar=yes,scrollbars=yes,resizable=yes,top=500,left=500,width=600,height=900");
                                myWindow.print();
                                setTimeout(function () {
                                    location.reload();
                                }, 3000);
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


    $("#PriceCategory").change(function () {
        if ($("#PriceCategory").val() > 0) {
            updateCartDetails();
        }
    });
    $("#recentDraftCarList").change(function () {
        if ($("#recentDraftCarList").val() > 0) {
            $('#cartId').val($("#recentDraftCarList").val());
            LoardCartData();
            setCustomerDetails($('#cartId').val());
            setCartDetails($('#cartId').val());
        }
    });
    function setCartDetails(cartid) {
        $.ajax({
            url: "RentCart/find/" + cartid,
            type: 'GET',
            dataType: "json",
            contentType: "application/json",
            data: ''

        }).done(function (response) {

            $("#CustomerAddress").val(response.diliveryAddress);
            $("#Customerid").val(response.customersIdcustomers);
            $("#ragestartdate").val(response.startDate);
            $("#rageenddate").val(response.endDate);
            $('#rentalBookingDateRange').data('daterangepicker').setEndDate(moment(response.endDate).format("YYYY/MM/DD"));
            $('#rentalBookingDateRange').data('daterangepicker').setStartDate(moment(response.startDate).format("YYYY/MM/DD"));
            $("#jsGrid").jsGrid("loadData");
            $("#ServicejsGrid").jsGrid("loadData");
            $("#OtherRentCart").jsGrid("loadData");
        }).fail(function (msg) {
            console.log("fail" + msg);

        });
    }
    function setCustomerDetails(cartid) {
        $.ajax({
            url: "RentCart/getCustomerbyCart/" + cartid,
            type: 'GET',
            dataType: "json",
            contentType: "application/json",
            data: ''

        }).done(function (response) {
            $('#Customersearch').val(response.firstname + ' ' + response.lastname);
            $('#Customerid').val(response.idcustomers);
            $("#Customerresult").html('');
        }).fail(function (msg) {
            console.log("fail" + msg);

        });
    }
    function LoardCartData() {
        $("#OtherRentCart").jsGrid({
            width: "100%",
            height: "auto",
            sorting: true,
            autoload: true,
            filtering: true,
            inserting: true,
            editing: true,
            Selecting: true,
            paging: true,
            pageSize: 5,
            pageButtonCount: 5,
            pageIndex: 1,
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
                        args.item.deleteConfirmed = true;
                        $("#OtherRentCart").jsGrid('deleteItem', args.item); //call deleting once more in callback
                        swal(
                            'Deleted!',
                            'Your file has been deleted.',
                            'success'
                        );
                    })
                }
            },
            controller: {
                loadData: function (filter) {
                    return $.ajax({
                        url: "rentalCartOther/byCartid/" + $('#cartId').val(),
                        dataType: "json"
                    });
                },
                insertItem: function (insertingClient) {
                    var d = $.Deferred();
                    var data = {
                        "description": insertingClient.description,
                        "price": insertingClient.price,
                        "qty": insertingClient.qty,
                        "freeqty": insertingClient.freeqty,
                        "cartIdcart": $('#cartId').val()
                    };
                    return $.ajax({
                        url: "rentalCartOther/add",
                        type: 'POST',
                        dataType: "json",
                        contentType: "application/json",
                        data: JSON.stringify(data)

                    }).done(function (response) {
                        $("#OtherRentCart").jsGrid("loadData");
                        console.log("done: " + JSON.stringify(response));

                    }).fail(function (msg) {
                        console.log("fail" + msg);

                    });
                },
                updateItem: function (updatingClient) {
                    var data = {
                        "idrentcartother": updatingClient.idrentcartother,
                        "description": updatingClient.description,
                        "price": updatingClient.price,
                        "qty": updatingClient.qty,
                        "freeqty": updatingClient.freeqty,
                        "cartIdcart": $('#cartId').val()
                    };
                    return $.ajax({
                        url: "rentalCartOther/update",
                        type: 'POST',
                        dataType: "json",
                        contentType: "application/json",
                        data: JSON.stringify(data)

                    }).done(function (response) {
                        $("#OtherRentCart").jsGrid("loadData");
                        console.log("done: " + JSON.stringify(response));
                    }).fail(function (msg) {
                        console.log("fail" + msg);

                    });
                },
                deleteItem: function (deletingClient) {
                    var clientIndex = $.inArray(deletingClient, this.clients);
                    return $.ajax({
                        url: "rentalCartOther/delete/" + deletingClient.idrentcartother,
                        dataType: "json",
                        type: "POST"
                    });
                    $("#OtherRentCart").jsGrid("loadData");
                    $.toast({
                        heading: 'Delete Done !',
                        text: 'This is an example top alert. You can edit what u wish..',
                        position: 'top-right',
                        loaderBg: '#fff',
                        icon: 'warning',
                        hideAfter: 3000,
                        stack: 1
                    });
                }
            },
            fields: [
                {name: "idrentcartother", title: "Id", width: 30},
                {
                    name: "description", title: "Service Description", type: "text", width: 50,
                    validate: function (value, item) {
                        return value.length > 0;
                    }
                },
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
                        args.item.deleteConfirmed = true;
                        $("#jsGrid").jsGrid('deleteItem', args.item); //call deleting once more in callback
                    })
                }
            },
            controller: {
                loadData: function (filter) {
                    return $.ajax({
                        url: "rentalCartProduct/byCartid/" + $('#cartId').val(),
                        dataType: "json"
                    });
                },
                insertItem: function (insertingClient) {
                    $("#jsGrid").jsGrid("loadData");
                },

                updateItem: function (updatingClient) {
                    var data = {
                        "idrentcartrentcartproduct": updatingClient.idrentcartrentcartproduct,
                        "productIdproduct": updatingClient.productIdproduct,
                        "qty": updatingClient.qty,
                        "freeqty": updatingClient.freeqty,
                        "cartIdcart": $('#cartId').val(),
                        "discount": updatingClient.discount
                    };
                    return $.ajax({
                        url: "rentalCartProduct/update",
                        type: 'POST',
                        dataType: "json",
                        contentType: "application/json",
                        data: JSON.stringify(data)

                    }).done(function (response) {
                        $("#jsGrid").jsGrid("loadData");
                        console.log("done: " + JSON.stringify(response));

                    }).fail(function (msg) {
                        console.log("fail" + msg);

                    });
                },

                deleteItem: function (deletingClient) {
                    var clientIndex = $.inArray(deletingClient, this.clients);
                    return $.ajax({
                        url: "rentalCartProduct/delete/" + deletingClient.idrentcartrentcartproduct,
                        dataType: "json",
                        type: "POST"
                    });
                    $("#jsGrid").jsGrid("loadData");
                    $.toast({
                        heading: 'Delete Done !',
                        text: 'This is an example top alert. You can edit what u wish..',
                        position: 'top-right',
                        loaderBg: '#fff',
                        icon: 'warning',
                        hideAfter: 3000,
                        stack: 1
                    });
                }
            },
            fields: [
                {name: "idrentcartrentcartproduct", title: "Id", visible: false, width: 0},
                {name: "productIdproduct", title: "Id", type: "rel", width: 30},
                {name: "code", title: "Code", type: "rel", width: 40},
                {name: "productDescription", title: "Description", type: "rel", width: 50},
                {name: "price", title: "Price", type: "rel", width: 50, align: "right"},
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
                    name: "daycount", title: "Days Count", type: "rel", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {name: "actualStock", title: "Stock", type: "rel", width: 50},
                {name: "orderQty", title: "Ordered", type: "rel", width: 50},
                {name: "receiveQty", title: "Receive", type: "rel", width: 50},
                {
                    name: "discount", title: "Discount", type: "number", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {name: "total", title: "Total", type: "rel", width: 50},
                {type: "control"}
            ]
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
                        args.item.deleteConfirmed = true;
                        $("#ServicejsGrid").jsGrid('deleteItem', args.item); //call deleting once more in callback
                    })
                }
            },
            controller: {
                loadData: function (filter) {
                    return $.ajax({
                        url: "rentalCartService/byCartid/" + $('#cartId').val(),
                        dataType: "json"
                    });
                },
                insertItem: function (insertingClient) {
//                    var d = $.Deferred();
//                    $.ajax({
//                        type: "POST",
//                        url: "servicess/all",
//                        data: JSON.stringify(insertingClient),
//                        dataType: "json",
//                    }).done(function (response) {
//                        console.log("done: " + JSON.stringify(response));
//
//                    }).fail(function (msg) {
//                        console.log("fail" + msg);
//
//                    });
                },

                updateItem: function (updatingClient) {
                    var data = {
                        "idrentcartservice": updatingClient.idrentcartservice,
                        "serviceIdservice": updatingClient.serviceIdservice,
                        "freeqty": updatingClient.freeqty,
                        "qty": updatingClient.qty,
                        "cartIdcart": $('#cartId').val(),
                        "discount": updatingClient.discount
                    };
                    return $.ajax({
                        url: "rentalCartService/update",
                        type: 'POST',
                        dataType: "json",
                        contentType: "application/json",
                        data: JSON.stringify(data)

                    }).done(function (response) {
                        $("#ServicejsGrid").jsGrid("loadData");
                        console.log("done: " + JSON.stringify(response));

                    }).fail(function (msg) {
                        console.log("fail" + msg);
                    });
                },

                deleteItem: function (deletingClient) {
                    var clientIndex = $.inArray(deletingClient, this.clients);
                    //  this.clients.splice(clientIndex, 1);
                    return $.ajax({
                        url: "rentalCartService/delete/" + deletingClient.idrentcartservice,
                        dataType: "json",
                        type: "POST"
                    });
                    $("#ServicejsGrid").jsGrid("loadData");
                    $.toast({
                        heading: 'Delete Done !',
                        text: 'This is an example top alert. You can edit what u wish..',
                        position: 'top-right',
                        loaderBg: '#fff',
                        icon: 'warning',
                        hideAfter: 3000,
                        stack: 1
                    });
                }
            },
            fields: [
                {name: "idrentcartservice", title: "id", visible: false, width: 0},
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
                {name: "price", title: "Price", type: "number", width: 50},
                {
                    name: "discount", title: "Discount", type: "number", width: 50,
                    validate: function (value, item) {
                        return value >= 0;
                    }
                },
                {name: "total", title: "Total", type: "rel", width: 50},
                {type: "control"}
            ]
        });
    }


    $(function () {
        /* Datarange2 */
        $('input[name="rentalBookingDateRange"]').daterangepicker({
            timePicker: true,
            timePickerIncrement: 60 * 24,
            locale: {
                format: 'YYYY/MM/DD'
            },
            minDate: moment().startOf('hour'),
            startDate: moment().startOf('hour'),
            endDate: moment().startOf('hour').add(24, 'hour')
        }, function (start, end, label) {
            $("#ragestartdate").val('' + start);
            $("#rageenddate").val('' + end);
            if ($('#cartId').val() > 0) {
                updateCartDetails();
            }
            LoardCartData();
        });

    });
</script>

<script>

    $(document).ready(function () {
        LoardrecentDraftCarList();
        LoardRentalPriceList();
    });
    function LoardrecentDraftCarList() {
        $("#recentDraftCarList").html('');
        jQuery.getJSON('RentCart/bystatus/1', function (data) {
            var i;
            $("#recentDraftCarList").append('<option value="0" selected="selected">Select Recent Cart Draft</option>');
            for (i = 0; i < data.length; i++) {
                console.log(data[i]);
                var dataOB = data[i];
                $("#recentDraftCarList").append('<option  data-set=' + JSON.stringify(dataOB) + ' value="' + dataOB.bookingcart + '">Recent Cart ' + dataOB.bookingcart + '</option>');
            }

        });
    }
    function LoardRentalPriceList() {
        $("#PriceCategory").html('');
        jQuery.getJSON('rentalPriceCategory/active', function (data) {
            var i;
            for (i = 0; i < data.length; i++) {
                var dataOB = data[i];
                $("#PriceCategory").append('<option value="' + dataOB.idrentalpricecategory + '">' + dataOB.rentalpricecategoryname + '</option>');
            }
        });
    }
</script>
<script type="text/javascript">


</script>

<script type="text/javascript">
    $(document).ready(function () {
        $.ajaxSetup({cache: false});
        $('#search').keyup(function () {

            $('#result').html('');
            $('#state').val('');
            var searchField = $('#search').val();
            var expression = new RegExp(searchField, "i");
            $.getJSON('products/all', function (data) {
                $.each(data, function (key, value) {
                    if (value.description.search(expression) != -1 || value.description.search(expression) != -1) {
                        $('#result').append('<li  value="' + value.idproduct + '" class="list-group-item link-class dropdown-item"><img src="' + "<%=request.getContextPath()%>" + value.icon + '" height="40" width="40" class="img-thumbnail" /> ' + value.productcode + ' | <span class="text-muted">' + value.description + '</span></li>');
                    }
                });
            });
        });

        $('#result').css({'max-height': 500, 'overflow-y': 'auto'});


        $('#result').on('click', 'li', function () {

            var imgpath = $(this).find('img').attr('src');
            var click_text = $(this).text().split('|');
            $('#search').val($.trim(click_text[1]));
            $('#productid').val($(this).val());
            $("#result").html('');
            swal({
                title: $.trim(click_text[1]),
                html: '<div class="row"><div class="col-md-6"><label for="swal-inputproductqty">Qty</label><div class="form-group"><div class="input-group m-b">' + '<input id="swal-inputproductqty" type="number" value="1" class="swal2-input" autofocus></div></div></div><div class="col-md-6"><label for="swal-inputproductfree">Free Qty</label><div class="form-group"><div class="input-group m-b">' + '<input id="swal-inputproductfree" type="number" value="0" class="swal2-input"></div></div></div></div>',
                preConfirm: function () {
                    return new Promise(function (resolve) {
                        if (($('#swal-inputproductfree').val() >= 0) & ($('#swal-inputproductqty').val() >= 0) & ($('#swal-inputproductqty').val() + $('#swal-inputproductfree').val() >= 1)) {
                            resolve([
                                $('#swal-inputproductqty').val(),
                                $('#swal-inputproductfree').val()
                            ])
                        } else {
                            reject('write something please');
                        }
                    })
                }
            }).then(function (result) {
                var data = {
                    "productIdproduct": $('#productid').val(),
                    "qty": $('#swal-inputproductqty').val(),
                    "freeqty": $('#swal-inputproductfree').val(),
                    "startdate": 1542297377000,
                    "enddate": 1542306600000,
                    "discount": 0,
                    "cartIdcart": $('#cartId').val()
                };
                return $.ajax({
                    url: "rentalCartProduct/add",
                    type: 'POST',
                    dataType: "json",
                    contentType: "application/json",
                    data: JSON.stringify(data)
                }).done(function (response) {
                    $('#search').val('');
                    $('#productid').val('');
                    $("#jsGrid").jsGrid("loadData");
                    console.log("done: " + JSON.stringify(response));
                }).fail(function (msg) {
                    console.log("fail" + msg);
                });
            }).catch(swal.noop)
        });

        $('#Customersearch').keyup(function () {

            $('#Customerresult').html('');
            $('#Customerstate').val('');
            var searchField = $('#Customersearch').val();
            var expression = new RegExp(searchField, "i");
            $.getJSON('customers/all', function (data) {
                $.each(data, function (key, value) {
                    if (value.firstname.search(expression) != -1 || value.lastname.search(expression) != -1) {
                        $('#Customerresult').append('<li  value="' + value.idcustomers + '" class="list-group-item link-class dropdown-item"><input type="hidden" class="address" value="' + value.address + '"/><img src="' + "<%=request.getContextPath()%>" + value.customerimage + '" height="40" width="40" class="img-thumbnail" /> ' + value.firstname + ' ' + value.lastname + ' | <span class="text-muted">' + value.contactpersonname + '</span></li>');
                    }
                });
            });
        });

        $('#Customerresult').css({'max-height': 500, 'overflow-y': 'auto'});


        $('#Customerresult').on('click', 'li', function () {

            var imgpath = $(this).find('img').attr('src');
            var address = $(this).find("input[class*='address']").val();

            var click_text = $(this).text().split('|');
            $('#Customersearch').val($.trim(click_text[0]));
            $('#CustomerAddress').val(address);
            $('#Customerid').val($(this).val());
            $("#Customerresult").html('');
            if ($("#recentDraftCarList").val() > 0) {
                $('#CustomerAddress').focus();
            }
        });

        $('#servicesearch').keyup(function () {

            $('#serviceresult').html('');

            var searchField = $('#servicesearch').val();
            var expression = new RegExp(searchField, "i");
            $.getJSON('servicess/all', function (data) {
                $.each(data, function (key, value) {
                    if (value.servicename.search(expression) != -1 || value.servicename.search(expression) != -1) {
                        $('#serviceresult').append('<li  value="' + value.idservice + '" class="list-group-item link-class dropdown-item"><img src="' + "<%=request.getContextPath()%>" + value.icon + '" height="40" width="40" class="img-thumbnail" /> ' + value.idservice + ' | <span class="text-muted">' + value.servicename + '</span></li>');
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
                    "freeqty": $('#swal-inputFreeqty').val(),
                    "qty": $('#swal-inputQty').val(),
                    "cartIdcart": $('#cartId').val(),
                    "discount": 0
                };
                return $.ajax({
                    url: "rentalCartService/add",
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


        $("#CustomerAddress").focusout(function () {
            updateCartDetails();
        });
        $("#advanceamount").focusout(function () {
            updateCartDetails();
        });

    });

    function updateCartDetails() {
        if ($('#cartId').val() > 0) {
            var data = {
                'bookingcart': $('#cartId').val(),
                'customersIdcustomers': $("#Customerid").val(),
                'locationIdlocation': ${sessionScope.get("LocationID")},
                'rentalpricecategoryIdrentalpricecategory': $('#PriceCategory').val(),
                'priceCategory': $("#PriceCategory").val(),
                'cartstatus': 1,
                'usersIdusers': ${sessionScope.get("userid")},
                'diliveryAddress': $("#CustomerAddress").val(),
                "startDate": $("#rentalBookingDateRange").data('daterangepicker').startDate,
                "endDate": $("#rentalBookingDateRange").data('daterangepicker').endDate,
                "advanceamount": ($("advanceamount").val() >= 0 ? $("advanceamount").val() : 0)
            };
            $.ajax({
                url: 'RentCart/update', /* php post url */
                type: 'POST',
                data: JSON.stringify(data),
                contentType: "application/json",
                dataType: 'JSON'
            })
                .done(function (response) {
                    $.toast({
                        heading: 'Saved !',
                        text: 'This is an example top alert. You can edit what u wish..',
                        position: 'top-right',
                        loaderBg: '#fff',
                        icon: 'success',
                        hideAfter: 3000,
                        stack: 1
                    });
                })
                .fail(function () {
                    swal({
                        title: 'An error occurred',
                        text: 'Please try again later :)',
                        type: 'error',
                        confirmButtonClass: 'btn btn-primary btn-lg',
                        buttonsStyling: false
                    });
                });
        }
    }
</script>
</body>
</html>