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
    <link rel="icon" type="image/png" sizes="16x16" href="<c:url value="/assets/img/icon.png"/>">

    <!-- Common Plugins -->
    <link href="<c:url value="/assets/lib/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- Vector Map Css-->
    <link href="<c:url value="/assets/lib/vectormap/jquery-jvectormap-2.0.2.css"/>" rel="stylesheet"/>

    <!-- Chart C3 -->
    <link href="<c:url value="/assets/lib/chart-c3/c3.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/assets/lib/chartjs/chartjs-sass-default.css"/>" rel="stylesheet">

    <!-- DataTables -->
    <link href="<c:url value="/assets/lib/datatables/jquery.dataTables.min.css"/>" rel="stylesheet"
          type="text/css">
    <link href="<c:url value="/assets/lib/datatables/responsive.bootstrap.min.css"/>" rel="stylesheet"
          type="text/css">
    <link href="<c:url value="/assets/lib/toast/jquery.toast.min.css"/>" rel="stylesheet">

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
                <a class="admin-logo" href="dashboard">
                    <h1>
                        <img alt="" src="<c:url value="/assets/img/icon.png"/>" class="logo-icon margin-r-10">
                        <img alt="" src="<c:url value="/assets/img/logo-dark.png"/>" class=" toggle-none hidden-xs">
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
                <ul class="list-inline top-right-nav">
                    <li class="dropdown icons-dropdown d-none-m">
                        <a class="dropdown-toggle " data-toggle="dropdown" href="#"><i class="fa fa-envelope"></i>
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
                    <li class="dropdown">
                        <a class="right-sidebar-toggle d-none-m" href="javascript:%20void(0);"><i
                                class="fa fa-align-right"></i></a>
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
                <li class="nav-item active"><a class="nav-link" href="<%=request.getContextPath()%>/index.html"><i
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
        <h2>Dashboard</h2>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Home</a></li>
            <li class="breadcrumb-item active">Dashboard</li>
        </ol>
    </div>
    <div class="col-lg-6 align-self-center text-right">
        <a href="#" class="btn btn-success box-shadow btn-icon btn-rounded"><i class="fa fa-plus"></i> Create New</a>
    </div>
</div>

<section class="main-content">
    <div class="row w-no-padding margin-b-30">
        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Product</h2>
                        <p class="text-muted">Total Product</p>
                        <span class="float-right text-primary widget-r-m">${productCount}</span>
                    </div>
                    <div class="progress margin-b-10  progress-mini">
                        <div style="width:50%;" class="progress-bar bg-primary"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">50%</p>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Sales</h2>
                        <p class="text-muted">Total Sales</p>
                        <span class="float-right text-indigo widget-r-m">${SalesInvoiceCount}</span>
                    </div>
                    <div class="progress margin-b-10 progress-mini">
                        <div style="width:45%;" class="progress-bar bg-indigo"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">450%</p>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Orders</h2>
                        <p class="text-muted">Total Orders</p>
                        <span class="float-right text-success widget-r-m">${RentBookingcount}</span>
                    </div>
                    <div class="progress margin-b-10 progress-mini">
                        <div style="width:85%;" class="progress-bar bg-success"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">85%</p>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Employee</h2>
                        <p class="text-muted">Total Employee</p>
                        <span class="float-right text-warning widget-r-m">${employeeCount}</span>
                    </div>
                    <div class="progress margin-b-10 progress-mini">
                        <div style="width:38%;" class="progress-bar bg-warning"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">38%</p>
                </div>
            </div>
        </div>
    </div>
    <!---------Secound dash Item---------->
    <div class="row w-no-padding margin-b-30">
        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Rent Product</h2>
                        <p class="text-muted">Rent Product</p>
                        <span class="float-right text-info widget-r-m">${rentProductCount}</span>
                    </div>
                    <div class="progress margin-b-10  progress-mini">
                        <div style="width:50%;" class="progress-bar bg-Info"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">10%</p>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Rent Sales</h2>
                        <p class="text-muted">Total Rent Sales</p>
                        <span class="float-right text-muted widget-r-m">${RentalInvoiceCount}</span>
                    </div>
                    <div class="progress margin-b-10 progress-mini">
                        <div style="width:45%;" class="progress-bar bg-muted"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">450%</p>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Rent Orders</h2>
                        <p class="text-muted">Total Rent Orders</p>
                        <span class="float-right text-success widget-r-m">${RentBookingcount}</span>
                    </div>
                    <div class="progress margin-b-10 progress-mini">
                        <div style="width:85%;" class="progress-bar bg-success"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">85%</p>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Pending Rent Invoice</h2>
                        <p class="text-muted">Total Pending Rent Invoice</p>
                        <span class="float-right text-danger widget-r-m">${PendingRentInvoiceCount}</span>
                    </div>
                    <div class="progress margin-b-10 progress-mini">
                        <div style="width:38%;" class="progress-bar bg-danger"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">38%</p>
                </div>
            </div>
        </div>
    </div>
    <div class="row w-no-padding margin-b-30">
        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Service</h2>
                        <p class="text-muted">Total Types Of Services</p>
                        <span class="float-right text-info widget-r-m">${ServiceCount}</span>
                    </div>
                    <div class="progress margin-b-10  progress-mini">
                        <div style="width:50%;" class="progress-bar bg-Info"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">20%</p>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Out Stock Item Qty</h2>
                        <p class="text-muted">Total Out Stock Qty</p>
                        <span class="float-right text-default widget-r-m">${StockZeroCount}</span>
                    </div>
                    <div class="progress margin-b-10 progress-mini">
                        <div style="width:45%;" class="progress-bar bg-default"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">450%</p>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">In Stock Item Qty</h2>
                        <p class="text-muted">Total Stock Qty</p>
                        <span class="float-right text-success widget-r-m">${StockListCount}</span>
                    </div>
                    <div class="progress margin-b-10 progress-mini">
                        <div style="width:85%;" class="progress-bar bg-success"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">85%</p>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="widget  bg-light">
                <div class="row row-table ">
                    <div class="margin-b-30">
                        <h2 class="margin-b-5">Customers</h2>
                        <p class="text-muted">Total Customers</p>
                        <span class="float-right text-info widget-r-m">${CustomerCount}</span>
                    </div>
                    <div class="progress margin-b-10 progress-mini">
                        <div style="width:38%;" class="progress-bar bg-info"></div>
                    </div>
                    <p class="text-muted float-left margin-b-0">Change</p>
                    <p class="text-muted float-right margin-b-0">38%</p>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="card bg-chart ">
                <div class="card-header text-white anime">
                    Sales Overview
                    <p class="text-white">Lorem Ipsum is simply dummy text of the printing</p>
                </div>
                <div class="card-body">
                    <div>
                        <canvas id="myChart" height="100"></canvas>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-8">
            <div class="card">
                <div class="card-header">
                    Current Visitors
                    <p class="text-muted">Different Devices Used to Visit</p>
                </div>
                <div class="card-body">

                    <div id="world-map-markers" style="height: 472px"></div>

                </div>
            </div>
        </div>

        <div class="col-md-4">
            <div class="card">
                <div class="card-header">
                    Our Visitors
                    <p class="text-muted">Different Devices Used to Visit</p>
                </div>
                <div class="card-body">
                    <div id="donut"></div>
                    <ul class="list-1 list-group">
                        <li class="list-group-item">Desktop <span class="float-right text-indigo"><i
                                class="fa fa-arrow-up"></i> 45.0%</span></li>
                        <li class="list-group-item">Mobile <span class="float-right text-primary"><i
                                class="fa fa-minus"></i> 25.0%</span></li>
                        <li class="list-group-item">Tablet <span class="float-right text-teal"><i
                                class="fa fa-arrow-down"></i> 15.0%</span></li>
                        <li class="list-group-item">Other <span class="float-right text-muted"><i
                                class="fa fa-arrow-up"></i> 15.0%</span></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header">
                    Recent Comments
                    <p class="text-muted">Latest Comments on users</p>
                </div>
                <div class="comment-widgets">
                    <div class="d-flex flex-row comment-row">
                        <div class="mr-2"><img alt="user" class="rounded-circle" src="assets/img/avtar-1.png"
                                               width="50"></div>
                        <div class="comment-text w-100">
                            <h5>John Doe</h5>
                            <p class="m-b-5">Lorem Ipsum is simply dummy text of the printing and type setting
                                industry.</p>
                            <div class="comment-footer">
                                <span class="text-muted pull-right">April 8, 2018</span>
                                <span class="label label-info">Pending</span>
                                <span class="action-icons">
									<a href="javascript:void(0)"><i class="ti-pencil-alt"></i></a>
									<a href="javascript:void(0)"><i class="ti-check"></i></a>
									<a href="javascript:void(0)"><i class="ti-heart"></i></a>
								</span>
                            </div>
                        </div>
                    </div>
                    <div class="d-flex flex-row comment-row active">
                        <div class="mr-2">
                            <span class="round"><img alt="user" src="<c:url value="/assets/img/avtar-2.png"/>"
                                                     width="50"></span>
                        </div>
                        <div class="comment-text active w-100">
                            <h5>John Doe</h5>
                            <p class="m-b-5">Lorem Ipsum is simply dummy text of the printing and type setting
                                industry.</p>
                            <div class="comment-footer">
                                <span class="text-muted pull-right">April 7, 2018</span>
                                <span class="label label-success">Approved</span>
                                <span class="action-icons">
									<a href="javascript:void(0)"><i class="ti-pencil-alt"></i></a>
									<a href="javascript:void(0)"><i class="ti-check"></i></a>
									<a href="javascript:void(0)"><i class="ti-heart"></i></a>
								</span>
                            </div>
                        </div>
                    </div><!-- Comment Row -->
                    <div class="d-flex flex-row comment-row">
                        <div class="mr-2">
                            <span class="round"><img alt="user" src="assets/img/avtar-3.png" width="50"></span>
                        </div>
                        <div class="comment-text w-100">
                            <h5>John Doe</h5>
                            <p class="m-b-5">Lorem Ipsum has beenorem Ipsum is simply dummy text of the printing and
                                type setting industry.</p>
                            <div class="comment-footer">
                                <span class="text-muted pull-right">April 6, 2018</span> <span
                                    class="label label-danger">Rejected</span> <span class="action-icons"><a
                                    href="javascript:void(0)"><i class="ti-pencil-alt"></i></a> <a
                                    href="javascript:void(0)"><i class="ti-check"></i></a> <a href="javascript:void(0)"><i
                                    class="ti-heart"></i></a></span>
                            </div>
                        </div>
                    </div><!-- Comment Row -->
                    <div class="d-flex flex-row comment-row">
                        <div class="mr-2">
                            <span class="round"><img alt="user" src="assets/img/avtar-4.png" width="50"></span>
                        </div>
                        <div class="comment-text w-100">
                            <h5>John Doe</h5>
                            <p class="m-b-5">Lorem Ipsum is simply dummy text of the printing and type setting
                                industry.</p>
                            <div class="comment-footer">
                                <span class="text-muted pull-right">April 5, 2018</span> <span class="label label-info">Pending</span>
                                <span class="action-icons"><a href="javascript:void(0)"><i
                                        class="ti-pencil-alt"></i></a> <a href="javascript:void(0)"><i
                                        class="ti-check"></i></a> <a href="javascript:void(0)"><i class="ti-heart"></i></a></span>
                            </div>
                        </div>
                    </div>
                    <div class="d-flex flex-row comment-row">
                        <div class="mr-2">
                            <span class="round"><img alt="user" src="<c:url value="/assets/img/avtar-2.png"/>"
                                                     width="50"></span>
                        </div>
                        <div class="comment-text active w-100">
                            <h5>John Doe</h5>
                            <p class="m-b-5">Lorem Ipsum is simply dummy text of the printing and type setting
                                industry.</p>
                            <div class="comment-footer">
                                <span class="text-muted pull-right">April 7, 2018</span>
                                <span class="label label-success">Approved</span>
                                <span class="action-icons">
									<a href="javascript:void(0)"><i class="ti-pencil-alt"></i></a>
									<a href="javascript:void(0)"><i class="ti-check"></i></a>
									<a href="javascript:void(0)"><i class="ti-heart"></i></a>
								</span>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>

        <div class="col-md-6">
            <div class="card">
                <div class="card-header">
                    <div class="row">
                        <div class="col-md-6">
                            Todo List
                            <p class="text-muted">Lorem ipsum dolor sit amet</p>
                        </div>
                        <div class="col-md-6">
                            <a href="javascript: void(0);"
                               class="btn btn-success btn-border box-shadow btn-circle pull-right"><i
                                    class="fa fa-plus"></i></a>
                        </div>
                    </div>
                </div>
                <div class="card-body">
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

                </div>
                <div class="card-footer">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Add Todo...">
                        <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        Add</button>
                                </span>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="card-header card-default">
                    Chat
                    <p class="text-muted">Lorem ipsum dolor sit amet</p>
                </div>

                <div class="card-body">
                    <div class="scrollDiv">
                        <ul class="chat-list list-unstyled">
                            <li class="clearfix chat-element media">
                                <a href='javascript: void(0);' class="float-left">
                                    <img src="<c:url value="/assets/img/avtar-2.png"/>" alt="" class="rounded-circle">
                                </a>
                                <div class="media-body ">
                                    <div class="speech-box">
                                        <small class="float-right text-primary">1m ago</small>
                                        <strong>John Doe</strong>
                                        <p class="margin-b-0">
                                            Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                                            Lorem Ipsum has been
                                        </p>
                                        <small class="text-info">Today 12:31 pm - 10.08.2018</small>
                                    </div>
                                </div>
                            </li>

                            <li class="clearfix chat-element right media">
                                <div class="media-body text-right float-left">
                                    <div class="speech-box">
                                        <strong class="float-left">John Doe</strong>
                                        <small class="text-right text-primary">1m ago</small>
                                        <p class="margin-b-0 text-left">
                                            Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                                            Lorem Ipsum has been
                                        </p>
                                        <small class="text-info">Today 12:31 pm - 10.08.2018</small>
                                    </div>
                                </div>
                                <a href='javascript: void(0);' class="float-right">
                                    <img src="<c:url value="/assets/img/avtar-2.png"/>" alt="" class="rounded-circle">
                                </a>
                            </li>
                            <li class="clearfix chat-element media">
                                <a href='javascript: void(0);' class="float-left">
                                    <img src="<c:url value="/assets/img/avtar-2.png"/>" alt="" class="rounded-circle">
                                </a>
                                <div class="media-body ">
                                    <div class="speech-box">
                                        <small class="float-right text-primary">1m ago</small>
                                        <strong>John Doe</strong>
                                        <p class="margin-b-0">
                                            Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                                            Lorem Ipsum has been
                                        </p>
                                        <small class="text-info">Today 12:31 pm - 10.08.2018</small>
                                    </div>
                                </div>
                            </li>
                            <li class="clearfix chat-element media">
                                <a href='javascript: void(0);' class="float-left">
                                    <img src="<c:url value="/assets/img/avtar-2.png"/>" alt="" class="rounded-circle">
                                </a>
                                <div class="media-body ">
                                    <div class="speech-box">
                                        <small class="float-right text-primary">1m ago</small>
                                        <strong>John Doe</strong>
                                        <p class="margin-b-0">
                                            Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                                            Lorem Ipsum has been
                                        </p>
                                        <small class="text-info">Today 12:31 pm - 10.08.2018</small>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="card-footer">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Type your message here...">
                        <span class="input-group-btn">
                                    <button class="btn btn-primary"><i class="fa fa-send"></i></button>
                                </span>
                    </div>
                </div>
            </div>
        </div>

    </div>


    <div class="row">
        <div class="col-lg-8 col-xlg-9">
            <div class="card">
                <div class="card-header card-default">
                    Activity Timeline
                    <p class="text-muted">Lorem ipsum dolor sit amet</p>
                </div>
                <div class="card-body">

                    <div class="profiletimeline">
                        <div class="sl-item">
                            <div class="sl-left"><img src="assets/img/avtar-1.png" alt="user" class="rounded-circle">
                            </div>
                            <div class="sl-right">
                                <div><a href="#" class="link">John Doe</a> <span class="sl-date">12 minutes ago</span>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></p>
                                    <div class="row">
                                        <div class="col-lg-3 col-md-6 mb-2"><img src="assets/img/gallery/1s.jpg"
                                                                                 alt="user" class="img-fluid rounded">
                                        </div>
                                        <div class="col-lg-3 col-md-6 mb-2"><img src="assets/img/gallery/2s.jpg"
                                                                                 alt="user" class="img-fluid rounded">
                                        </div>
                                        <div class="col-lg-3 col-md-6 mb-2"><img src="assets/img/gallery/3s.jpg"
                                                                                 alt="user" class="img-fluid rounded">
                                        </div>
                                        <div class="col-lg-3 col-md-6 mb-2"><img src="assets/img/gallery/4s.jpg"
                                                                                 alt="user" class="img-fluid rounded">
                                        </div>
                                    </div>
                                    <div class="like-comm">
                                        <a href="javascript:void(0)" class="link mr-2">385 comment</a>
                                        <a href="javascript:void(0)" class="link mr-2"><i
                                                class="fa fa-heart text-danger"></i> 174 Love</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="sl-item">
                            <div class="sl-left"><img src="<c:url value="/assets/img/avtar-2.png"/>" alt="user"
                                                      class="rounded-circle">
                            </div>
                            <div class="sl-right">
                                <div><a href="#" class="link">John Doe</a> <span class="sl-date">8 minutes ago</span>
                                    <div class="mt-2 row">
                                        <div class="col-md-3 col-xs-12"><img src="assets/img/gallery/1s.jpg" alt="user"
                                                                             class="img-fluid rounded"></div>
                                        <div class="col-md-9 col-xs-12">
                                            <p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec
                                                odio. Praesent libero. Sed cursus ante dapibus diam. </p></div>
                                    </div>
                                    <div class="like-comm mt-2">
                                        <a href="javascript:void(0)" class="link mr-2">248 comment</a>
                                        <a href="javascript:void(0)" class="link mr-2"><i
                                                class="fa fa-heart text-danger"></i> 84 Love</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="sl-item">
                            <div class="sl-left"><img src="assets/img/avtar-3.png" alt="user"></div>
                            <div class="sl-right">
                                <div><a href="#" class="link">John Doe</a> <span class="sl-date">6 minutes ago</span>
                                    <p class="mt-1"> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer
                                        nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi. Nulla quis
                                        sem at nibh elementum imperdiet. Duis sagittis ipsum. Praesent mauris. Fusce nec
                                        tellus sed augue semper </p>
                                </div>
                                <div class="like-comm mt-2">
                                    <a href="javascript:void(0)" class="link mr-2">68 comment</a>
                                    <a href="javascript:void(0)" class="link mr-2"><i
                                            class="fa fa-heart text-danger"></i> 36 Love</a>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="sl-item">
                            <div class="sl-left"><img src="assets/img/avtar-4.png" alt="user" class="rounded-circle">
                            </div>
                            <div class="sl-right">
                                <div><a href="#" class="link">John Doe</a> <span class="sl-date">4 minutes ago</span>
                                    <blockquote class="mt-1">
                                        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                        incididunt
                                    </blockquote>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-md-4">
            <div class="card weather">
                <div class="city-selected">
                    <div class="weather-box">
                        <div class="info">
                            <div class="city">Ankara</div>
                            <div class="night">Night - 22:07 PM</div>
                            <div class="temp text-primary">3°</div>
                            <div class="wind">
                                <i class="wi wi-windy"></i>
                                <span>25 km/h</span>
                            </div>
                        </div>
                        <div class="icon text-primary">
                            <i class="wi wi-night-alt-hail"></i>
                        </div>
                    </div>
                </div>

                <div class="days">
                    <div class="row row-no-gutter">
                        <div class="col-md-4">
                            <div class="day">
                                <h1>Monday</h1>
                                <i class="wi wi-day-rain"></i>
                            </div>
                        </div>

                        <div class="col-md-4">
                            <div class="day">
                                <h1>Tuesday</h1>
                                <i class="wi wi-day-storm-showers"></i>
                            </div>
                        </div>

                        <div class="col-md-4">
                            <div class="day">
                                <h1>Wednesday</h1>
                                <i class="wi wi-solar-eclipse"></i>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            <div class="card">
                <div class="card-header card-default">
                    Browser Stats
                    <p class="text-muted">Lorem ipsum dolor sit amet</p>
                </div>
                <div class="card-body">
                    <table class="table browser no-border">
                        <tbody>
                        <tr>
                            <td><img src="assets/img/browser/chrome-logo.png" alt="logo"></td>
                            <td>Google Chrome</td>
                            <td class="text-right"><span class="label label-primary">33%</span></td>
                        </tr>
                        <tr>
                            <td><img src="assets/img/browser/firefox-logo.png" alt="logo"></td>
                            <td>Mozila Firefox</td>
                            <td class="text-right"><span class="label label-success">27%</span></td>
                        </tr>
                        <tr>
                            <td><img src="assets/img/browser/safari-logo.png" alt="logo"></td>
                            <td>Apple Safari</td>
                            <td class="text-right"><span class="label label-info">17%</span></td>
                        </tr>
                        <tr>
                            <td><img src="assets/img/browser/internet-logo.png" alt="logo"></td>
                            <td>Internet Explorer</td>
                            <td class="text-right"><span class="label label-warning">11%</span></td>
                        </tr>
                        <tr>
                            <td><img src="assets/img/browser/opera-logo.png" alt="logo"></td>
                            <td>Opera mini</td>
                            <td class="text-right"><span class="label label-danger">8%</span></td>
                        </tr>
                        <tr>
                            <td><img src="assets/img/browser/internet-logo.png" alt="logo"></td>
                            <td>Microsoft edge</td>
                            <td class="text-right"><span class="label label-indigo">4%</span></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>


        </div>

    </div>


    <footer class="footer">
        <span>Copyright &copy; 2018 FixedPlus</span>
    </footer>

</section>
<!-- ============================================================== -->
<!-- 						Content End		 						-->
<!-- ============================================================== -->


<!-- Common Plugins -->
<script src="<c:url value="/assets/lib/jquery/dist/jquery.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/popper.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/pace/pace.min.js"/>"></script>
<script src="<c:url value="/assets/lib/jasny-bootstrap/js/jasny-bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/slimscroll/jquery.slimscroll.min.js"/>"></script>
<script src="<c:url value="/assets/lib/nano-scroll/jquery.nanoscroller.min.js"/>"></script>
<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>
<script src="<c:url value="/assets/js/custom.js"/>"></script>

<!--Chart Script-->
<script src="<c:url value="/assets/lib/chartjs/chart.min.js"/>"></script>
<script src="<c:url value="/assets/lib/chartjs/chartjs-sass.js"/>"></script>

<!--Vetor Map Script-->
<script src="<c:url value="/assets/lib/vectormap/jquery-jvectormap-2.0.2.min.js"/>"></script>
<script src="<c:url value="/assets/lib/vectormap/jquery-jvectormap-us-aea-en.js"/>"></script>

<!-- Chart C3 -->
<script src="<c:url value="/assets/lib/chart-c3/d3.min.js"/>"></script>
<script src="<c:url value="/assets/lib/chart-c3/c3.min.js"/>"></script>

<!-- Datatables-->
<script src="<c:url value="/assets/lib/datatables/jquery.dataTables.min.js"/>"></script>
<script src="<c:url value="/assets/lib/datatables/dataTables.responsive.min.js"/>"></script>
<script src="<c:url value="/assets/lib/toast/jquery.toast.min.js"/>"></script>
<script src="<c:url value="/assets/js/dashboard.js"/>"></script>

</body>
</html>