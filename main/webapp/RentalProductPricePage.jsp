<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FixedPlus - Bootstrap Admin Dashboard Template</title>

    <%

        try {
            if (request.getSession().getAttribute("userid").equals(null)) {
                response.sendRedirect(request.getContextPath() + "/login");
            }
        } catch (NullPointerException e) {
            response.sendRedirect(request.getContextPath() + "/login");
        }
    %>
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

    <!-- Custom Css-->
    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        #result {
            position: absolute;
            width: 100%;
            max-width: 870px;
            cursor: pointer;
            overflow-y: auto;
            max-height: 400px;
            box-sizing: border-box;
            z-index: 1001;
        }

        .link-class:hover {
            background-color: #f1f1f1;
        }
    </style>

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
                <li class="nav-item  active">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i
                            class="fa fa-codepen"></i><span class="toggle-none">Product <span
                            class="fa arrow"></span></span></a>
                    <ul class="nav-second-level nav flex-column " aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/product"><i
                                class="fa fa-cubes"></i><span>&nbsp;</span>Product List</a></li>
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/productCategory"><i
                                class="fa fa-th-large"></i><span>&nbsp;</span>Product Category</a></li>
                        <li class="nav-item active"><a class="nav-link"
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
        <h2>Rent Price Table</h2>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Home</a></li>
            <li class="breadcrumb-item"><a href="#">Rental</a></li>
            <li class="breadcrumb-item active">Rent Price Table</li>
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
                    <div class="col-md-auto">
                        <div class="row col-md-3">
                            <img id="productimage" name="productimage" height="100px" width="100px"/>
                        </div>
                        <div class="row col-md-5">
                            <input type="hidden" name="productid" id="productid"/>
                            <input type="text" name="search" id="search" placeholder="Search Product By Details"
                                   class="form-control"/>
                        </div>
                        <ul class="list-group dropdown-menu" id="result"></ul>
                    </div>
                    <div class="float-right mt-10">
                        <button type="button" class="btn btn-success margin-r-5 btn-rounded box-shadow btn-icon"
                                id="openNewModel"><i class="fa fa-plus"></i>Add New Rental Price
                        </button>
                        <!--<button type="button" class="btn btn-teal margin-r-5" onclick='$(".myModel").modal('show')'>Large modal</button> -->
                    </div>
                    <div class="float-left mt-10">
                        <button type="button" class="btn btn-default margin-r-5 btn-rounded box-shadow btn-icon"
                                id="clearProduct"><i class="fa fa-eraser"></i>Clear
                        </button>

                    </div>
                </div>

                <div class="card-body">
                    <div class="tabs">
                        <!-- Nav tabs -->

                        <ul class="nav nav-tabs">
                            <% String acttivepageStyle = " active";%>
                            <c:forEach items="${dataList}" var="item">
                                <li class="nav-item" role="presentation"><a class="nav-link<%=acttivepageStyle%>"
                                                                            href="#${item.idrentalpricecategory}"
                                                                            aria-controls="${item.rentalpricecategoryname}"
                                                                            role="tab"
                                                                            data-toggle="tab">${item.rentalpricecategoryname}</a>
                                </li>
                                <% acttivepageStyle = "";%>
                            </c:forEach>
                        </ul>
                        <!-- Tab panes -->
                        <% String acttiveStyle = " active";%>
                        <div class="tab-content">
                            <c:forEach items="${dataList}" var="item">
                                <div role="tabpanel" class="tab-pane<%=acttiveStyle%>"
                                     id="${item.idrentalpricecategory}">
                                    <% acttiveStyle = "";%>
                                    <table id="datatable${item.idrentalpricecategory}"
                                           class="table table-striped dt-responsive ">
                                        <thead>
                                        <tr>
                                            <th style="width:80px">
                                                <strong>ID</strong>
                                            </th>
                                            <th>
                                                <strong>Rental Price</strong>
                                            </th>
                                            <th>
                                                <strong>Start Point</strong>
                                            </th>
                                            <th>
                                                <strong>End Point</strong>
                                            </th>
                                            <th class="text-center">
                                                <strong>VIEW</strong>
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        </tbody>
                                    </table>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <footer class="footer">
        <span>Copyright &copy; 2018 Icordium</span>
    </footer>


</section>
<!-- ============================================================== -->
<!-- 						Content End		 						-->
<!-- ============================================================== -->
<div id="newDataAddModel" class="modal fadeIn myModel" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                  class="fa fa-times"></span>
                </button>
                <h5 class="modal-title" id="newmyModalLabel">Create New Product Rental Price</h5>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-6">
                        <label for="newprice">
                            <h5>
                                <small>Price</small>
                            </h5>
                        </label>
                        <div class="form-group">
                            <div class="input-group m-b">
                                <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                <input type="number" id="newprice" name="newprice" class="form-control"/>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="newtypeslist">
                            <h5>
                                <small> Main Category</small>
                            </h5>
                        </label>
                        <div class="input-group m-b">
                            <select id="newtypeslist" name="newtypeslist" class="form-control">
                                <c:forEach items="${dataList}" var="item">
                                    <option value="${item.idrentalpricecategory}">${item.rentalpricecategoryname}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <label for="newstartpoint">
                            <h5>
                                <small>Start Point</small>
                            </h5>
                        </label>
                        <div class="form-group">
                            <div class="input-group m-b">
                                <span class="input-group-addon"><i class="fa wi-direction-right"></i></span>
                                <input type="number" id="newstartpoint" class="form-control"/>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="newendpoint">
                            <h5>
                                <small> End Point</small>
                            </h5>
                        </label>
                        <div class="form-group">
                            <div class="input-group m-b">
                                <span class="input-group-addon"><i class="fa wi-direction-left"></i></span>
                                <input type="number" id="newendpoint" class="form-control"/>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" id="newbtn" name="newbtn" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>
<!---Update Model------>

<div id="editmodelID" class="modal fadeIn myModel" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                  class="fa fa-times"></span>
                </button>
                <h5 class="modal-title" id="myModalLabel">Update Rental Price </h5>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-6">
                        <label for="editprice">
                            <h5>
                                <small>Price</small>
                            </h5>
                        </label>
                        <div class="form-group">
                            <div class="input-group m-b">
                                <span class="input-group-addon"><i class="glyphicon icon-tag"></i></span>
                                <input type="hidden" id="editid" name="editid"/>
                                <input type="number" id="editprice" name="editprice" class="form-control"/>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="newtypeslist">
                            <h5>
                                <small> Main Category</small>
                            </h5>
                        </label>
                        <div class="input-group m-b">
                            <select id="edittypeslist" name="edittypeslist" class="form-control">
                                <c:forEach items="${dataList}" var="item">
                                    <option value="${item.idrentalpricecategory}">${item.rentalpricecategoryname}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <label for="editstartpoint">
                            <h5>
                                <small>Start Point</small>
                            </h5>
                        </label>
                        <div class="form-group">
                            <div class="input-group m-b">
                                <span class="input-group-addon"><i class="fa wi-direction-right"></i></span>
                                <input type="number" id="editstartpoint" class="form-control"/>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <label for="editendpoint">
                            <h5>
                                <small> End Point</small>
                            </h5>
                        </label>
                        <div class="form-group">
                            <div class="input-group m-b">
                                <span class="input-group-addon"><i class="fa wi-direction-left"></i></span>
                                <input type="number" id="editendpoint" class="form-control"/>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" id="updateBtn" name="updateBtn" class="btn btn-warning">Save changes</button>
            </div>
        </div>
    </div>
</div>


<!-- Common Plugins -->
<script src="<c:url value="/assets/lib/jquery/dist/jquery.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/bootstrap-select.min.js"/>"></script>
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

<!-- Toast -->
<script src="<c:url value="/assets/lib/toast/jquery.toast.min.js"/>"></script>
<!-- Js Grid -->
<script src="<c:url value="/assets/lib/jsgrid/jsgrid.min.js"/>"></script>
<c:forEach items="${dataList}" var="item"> loardData${item.idrentalpricecategory}
    <script>
        function loardDatatable ${item.idrentalpricecategory}(productid) {
            $("#datatable${item.idrentalpricecategory}").DataTable({
                dom: 'Bfrtip',
                'autoWidth': true,
                buttons: [
                    'copyHtml5',
                    'excelHtml5',
                    'csvHtml5',
                    'pdfHtml5'
                ],
                "processing": true,
                "serverSide": false,
                "info": true,
                "destroy": true,
                "pagination": true,
                "lengthChange": true,
                "pageLength": 10,
                "ajax": {
                    'url': 'rentalpricelist/findbyproductandcategory/' + productid + '/category/${item.idrentalpricecategory}',
                    'type': 'GET',
                    'data': '',
                    'dataSrc': ""
                },
                "columns": [
                    {"data": 'idrentalpricelist'},
                    {"data": 'rentalprice'},
                    {"data": 'startpoint'},
                    {"data": 'endpoint'},
                    {
                        sortable: false,
                        "render": function (data, type, full, meta) {
                            var myData = full.getStatus;

                            var td = '<button type="button" class="btn btn-sm btn-default"><em class="fa fa-search"></em></button>'
                                + '<button type="button" class="edit btn btn-sm btn-success" data-set=' + JSON.stringify(full) + '><i class="fa fa-edit"></i></button>' +
                                '<button type="button" class="delete btn btn-sm btn-danger" data-set=' + JSON.stringify(full) + '><i class="fa fa-trash"></i>Delete</button>';
                            return td;
                        }
                    }
                ]

            });
        }
        $("#datatable${item.idrentalpricecategory}").on("click", ".edit", function () {
            var data = $(this).data("set");
            var parent = $(this).parent().parent();
            $('#editmodelID').modal('toggle');
            $('#editendpoint').val(data.endpoint);
            $('#editstartpoint').val(data.startpoint);
            $('#edittypeslist').val(data.rentalpricecategoryIdrentalpricecategory);
            $('#editprice').val(data.rentalprice);
            $('#editid').val(data.idrentalpricelist);
            if (data.status === "0") {
                $('#statuscheck').prop('checked', false);
            } else {
                $('#statuscheck').prop('checked', true);
            }
        });

        $("#datatable${item.idrentalpricecategory}").on("click", ".delete", function () {
            var data = $(this).data("set");
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
                            url: 'rentalpricelist/delete/' + data.id, /* php post url */
                            type: 'POST',
                            data: {
                                id: data.id
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
</c:forEach>

<script type="text/javascript">


    $(function () {
        $("#openNewModel").click(function () {
            if ($.trim($('#productid').val()) == '') {
                swal({
                    title: 'Not Selected Product In List',
                    text: 'Please Select Product  :)',
                    type: 'info',
                    confirmButtonClass: 'btn btn-primary btn-lg',
                    buttonsStyling: false
                });
            } else {
                $('#newDataAddModel').modal('toggle');
            }
        });
        $("#clearProduct").click(function () {
            $('#search').val('');
            $('#productid').val('0');
            $('#productimage').attr('src', '');
            <c:forEach items="${dataList}" var="item">
            $('#datatable${item.idrentalpricecategory}').DataTable().clear().draw();
            </c:forEach>
        });

        <!-- Datatables-->


    });
    $("#updateBtn").click(function () {
        var data = {
            "idrentalpricelist": $("#editid").val(),
            "startpoint": $("#editstartpoint").val(),
            "endpoint": $("#editendpoint").val(),
            "rentalprice": $("#editprice").val(),
            "rentalpricecategoryIdrentalpricecategory": $("#edittypeslist").val(),
            "productIdproduct": $("#productid").val()
        };
        $.ajax({
            url: 'rentalpricelist/update', /* php post url */
            type: 'PUT',
            contentType: "application/json",
            data: JSON.stringify(data),
            dataType: 'json'
        })

            .done(function (response) {
                $('#editmodelID').modal('toggle');
                $("#editstartpoint").val("");
                $("#editendpoint").val("");
                $("#editprice").val("");
                <c:forEach items="${dataList}" var="item">
                $("#datatable${item.idrentalpricecategory}").DataTable().ajax.reload();
                </c:forEach>
                $.toast({
                    heading: 'Success !',
                    text: 'This is an example top alert. You can edit what u wish..',
                    position: 'top-right',
                    loaderBg: '#fff',
                    icon: 'success',
                    hideAfter: 3000,
                    stack: 1
                });
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
    });

    $("#newbtn").click(function () {
        var data = {
            "productIdproduct": $("#productid").val(),
            "startpoint": $("#newstartpoint").val(),
            "endpoint": $("#newendpoint").val(),
            "rentalprice": $("#newprice").val(),
            "rentalpricecategoryIdrentalpricecategory": $("#newtypeslist").val()
        };
        $.ajax({
            url: 'rentalpricelist/add', /* php post url */
            type: 'POST',
            contentType: "application/json",
            data: JSON.stringify(data),
            dataType: 'json'
        })

            .done(function (response) {
                $('#newDataAddModel').modal('toggle');
                $("#newstartpoint").val("");
                $("#newendpoint").val("");
                $("#newprice").val("");
                $("#newtypeslist").val("");
                <c:forEach items="${dataList}" var="item">
                $("#datatable${item.idrentalpricecategory}").DataTable().ajax.reload();
                </c:forEach>
                $.toast({
                    heading: 'Success !',
                    text: 'This is an example top alert. You can edit what u wish..',
                    position: 'top-right',
                    loaderBg: '#fff',
                    icon: 'success',
                    hideAfter: 3000,
                    stack: 1
                });
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
    });
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

        $('#result').on('click', 'li', function () {

            var imgpath = $(this).find('img').attr('src');
            var click_text = $(this).text().split('|');
            $('#search').val($.trim(click_text[1]));
            $('#productid').val($(this).val());
            $('#productimage').attr('src', imgpath);
            <c:forEach items="${dataList}" var="item">
            loardDatatable${item.idrentalpricecategory}($(this).val());
            </c:forEach>
            $("#result").html('');
        });
    });
</script>
</body>
</html>