<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<jsp:useBean id="now" class="java.util.Date"/>
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
                                                     src="<c:url value="/assets/img/avtar-1.png"/>" width="50"></span>
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
                <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/index.html"><i
                        class="fa fa-home"></i> <span class="toggle-none">Dashboard</span></a></li>
                <li class="nav-item ">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i
                            class="fa fa-codepen"></i><span class="toggle-none">Product <span
                            class="fa arrow"></span></span></a>
                    <ul class="nav-second-level nav flex-column " aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>/product"><i
                                class="fa fa-cubes"></i><span>&nbsp;</span>Product List</a></li>
                        <li class="nav-item"><a class="nav-link"
                                                href="<%=request.getContextPath()%>/productCategory"><i
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
    <div class="col-lg-6 align-self-center ">
        <h2>Pending Rental Invoice Managment</h2>
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="javascript: void(0);">Home</a></li>
            <li class="breadcrumb-item active">Pending Rental Invoice List</li>
        </ol>
    </div>
</div>

<section class="main-content">

    <div class="row">
        <div class="col-md-12">
            <div class="card">

                <div class="card-header card-default">
                    Rental Invoice
                    <p class="text-muted">All Pending Invoice List</p>

                </div>
                <div class="card-body">
                    <table id="datatable2" class="table dataTable table-striped dt-responsive nowrap">
                        <thead>
                        <tr>
                            <th style="width:80px">
                                <strong>Invoice ID</strong>
                            </th>
                            <th>
                                <strong>Note</strong>
                            </th>
                            <th class="text-center">
                                <strong>Delivered Date</strong>
                            </th>
                            <th class="text-center">
                                <strong>Return Date</strong>
                            </th>
                            <th class="text-center">
                                <strong>Delivered Address</strong>
                            </th>
                            <th class="text-center">
                                <strong>Customer ID</strong>
                            </th>
                            <th class="text-center">
                                <strong>Customer</strong>
                            </th>
                            <th class="text-center">
                                <strong>Action</strong>
                            </th>
                        </tr>
                        </thead>
                        <tbody id="productTypeDataBody">
                        <c:forEach items="${dataList}" var="item">
                            <tr>
                                <td>${item.idrentoutedhedder}</td>
                                <td> ${item.note}</td>
                                <td class="text-center"> ${item.diliverydatetime}</td>
                                <td class="text-center returndate"> ${item.returndatetime}</td>
                                <td class="text-center"> ${item.diliveryaddress}</td>
                                <td class="text-center"> ${item.customersIdcustomers}</td>
                                <td class="text-center"> ${item.customersByCustomersIdcustomers.suffix} ${item.customersByCustomersIdcustomers.firstname} ${item.customersByCustomersIdcustomers.lastname}</td>
                                <td class="text-center">
                                    <button type="button" class="btn btn-sm Invoiceview btn-default"
                                            data-set='{"title": "${item.note}", "option": "deletepages", "status":${item.status}, "id":${item.idrentoutedhedder}}'>
                                        <i class="fa fa-search"></i>
                                    </button>
                                    <button type="button" class="btn btn-sm btn-success reciveInvoice"
                                            data-set='{"title": "${item.note}", "option": "deletepages", "status":${item.status}, "id":${item.idrentoutedhedder}}'>
                                        <i class="fa fa-download"></i></button>

                                </td>
                            </tr>
                        </c:forEach>
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
<!-- 						Content End 	 						-->
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

<script src="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.js"/>" type="text/javascript"></script>

<!-- DataTimePicker -->
<script type="text/javascript" src="<c:url value="/assets/lib/bootstrap-daterangepicker/moment.js"/>"></script>
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
<script>
    $(document).ready(function () {

        $('#datatable2').DataTable({
            dom: 'Bfrtip',
            buttons: [
                'copyHtml5',
                'excelHtml5',
                'csvHtml5',
                'pdfHtml5'
            ], "order": [[3, "asc"]],
            scrollX: true,
            "autoWidth": false,
            "rowCallback": function (nRow, aData, iDisplayIndex, iDisplayIndexFull) {
                var today = moment(new Date()).format("YYYY/MM/DD");
                var returndate = moment(aData[3]).format("YYYY/MM/DD");
                $node = this.api().row(nRow).nodes().to$();
                if (returndate > today) {
                    $node.addClass('bg-success text-white');
                } else if (returndate == today) {
                    $node.addClass('bg-warning text-dark');
                } else if (returndate < today) {
                    $node.addClass('bg-danger text-white');
                }
            }
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
    $(function () {
        $("#datatable2").on("click", ".reciveInvoice", function () {
            var data = $(this).data("set");
            var parent = $(this).parent().parent();
            swal({
                title: data.title + ' Invoicing',
                text: '"' + data.id + '" Receive Rental Invoice ?',
                type: 'warning',
                showCancelButton: true,
                confirmButtonColor: '#67a765',
                cancelButtonColor: '#dc5e5d',
                cancelButtonText: 'Cancel',
                confirmButtonText: 'Load Receive',
                confirmButtonClass: 'btn btn-space btn-lg btn-success hover',
                cancelButtonClass: 'btn btn-space btn-lg btn-danger hover',
                buttonsStyling: false,
                preConfirm: function () {
                    return new Promise(function (resolve) {
                        window.location = '<%=request.getContextPath()%>/RentalReceiveInvoice?id=' + data.id;
                    });
                },
                allowOutsideClick: true
            });

        });
        $("#datatable2").on("click", ".Invoiceview", function () {
            var data = $(this).data("set");
            var parent = $(this).parent().parent();
            swal({
                title: data.title + ' Invoice view',
                text: '"' + data.id + '" view Rental dispatch Invoice ?',
                type: 'info',
                showCancelButton: true,
                confirmButtonColor: '#67a765',
                cancelButtonColor: '#70c3dc',
                cancelButtonText: 'No',
                confirmButtonText: 'View Invoice',
                confirmButtonClass: 'btn btn-space btn-lg btn-success hover',
                cancelButtonClass: 'btn btn-space btn-lg btn-danger hover',
                buttonsStyling: false,
                preConfirm: function () {
                    return new Promise(function (resolve) {
                        var myWindow = window.open("<%=request.getContextPath()%>/RentalDispatchInvoice/" + data.id, "_blank", "toolbar=yes,scrollbars=yes,resizable=yes,top=500,left=500,width=600,height=900");
                        myWindow.print();
                    });
                },
                allowOutsideClick: true
            });

        });
    });
</script>
</body>
</html>