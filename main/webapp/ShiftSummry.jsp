<%--
  Created by IntelliJ IDEA.
  User: ISH
  Date: 3/25/2019
  Time: 7:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: ISH
  Date: 2/19/2019
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FixedPlus - Bootstrap Admin Dashboard Template</title>

    <!-- Common Plugins -->
    <link href="<c:url value="/assets/lib/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/assets/lib/keybord/jqbtk.min.css"/>" rel="stylesheet" type="text/css"/>
    <%--<link href="<c:url value="../assets/lib/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">--%>
    <link href="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.css"/>" rel="stylesheet" type="text/css"/>

    <!-- Custom Css-->
    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        .imagebox {
            background: gray;
            padding: 0px;
            position: relative;
            text-align: center;
            margin: 10px;
        }

        .imagebox img {
            opacity: 1;
            transition: 0.5s opacity;
        }

        .imagebox .imagebox-desc {
            background-color: rgba(0, 0, 0, 0.6);
            bottom: 25%;
            color: white;
            font-size: 1.7em;
            left: 0px;
            padding: 20px 15px;
            position: absolute;
            transition: 0.5s padding;
            text-align: center;
            width: 100%;
        }

        .imagebox:hover img {
            opacity: 0.7;
        }

        .imagebox:hover .imagebox-desc {
            padding-bottom: 15%;
        }

        .captipnan:hover {
            padding-bottom: 20%;
            transition: 0.5s cubic-bezier;
        }
    </style>
</head>
<body class="nav-collapsed">

<!-- ============================================================== -->
<!-- 						Topbar Start 					-->
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
            <!--                    <div class="col">
                                    <ul class="list-inline top-right-nav">
                                        <li class="dropdown d-none-m">
                                            <a onclick="headSelected(null, null, null, 1)" href="#"><button class="btn btn-teal btn-icon"><i class="icon icon-bag"></i>Quick Sale</button></a>
                                        </li>
                                    </ul>
                                </div>-->
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
                                                             src="<c:url value="/assets/img/avtar-2.png"/>" width="50">
                                                    </span>
                                            <span class="notification-title">
                                                        John Doe
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
                            John Doe
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
                                    Counter Close</a>
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
                <img alt="profile" class="margin-b-10" src="<c:url value="/assets/img/avtar-2.png"/>" width="80">
                <p class="lead margin-b-0 toggle-none">John Doe</p>
                <p class="text-muted mv-0 toggle-none">Welcome</p>
            </div>

            <ul class="metisMenu nav flex-column" id="menu">
                <li class="nav-heading"><span>MAIN</span></li>
                <li class="nav-item"><a class="nav-link" href="index.html"><i class="fa fa-home"></i> <span
                        class="toggle-none">Dashboard <span
                        class="badge badge-pill badge-danger float-right mr-2">1.0</span></span></a></li>

                <li class="nav-item">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i
                            class="fa fa-folder-open"></i> <span class="toggle-none">Multi Level<span
                            class="fa arrow "></span></span></a>
                    <ul class="nav-second-level nav flex-column" aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="javascript: void(0);">Level 1</a></li>
                        <li class="nav-item"><a class="nav-link" href="javascript: void(0);" aria-expanded="false">Level
                            2 <span class="fa arrow"></span></a>
                            <ul class="nav-third-level nav flex-column sub-menu" aria-expanded="false">
                                <li class="nav-item"><a class="nav-link" href="javascript: void(0);">Level 2</a></li>
                                <li class="nav-item"><a class="nav-link" href="javascript: void(0);">Level 2</a></li>
                            </ul>
                        </li>
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

<section class="main-content">
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-body col-lg-12">

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

<script src="<c:url value="/assets/lib/jquery/dist/jquery.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/popper.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/keybord/jqbtk.min.js"/>" type="text/javascript"></script>
<!-- Common Plugins -->
<script src="<c:url value="/assets/lib/pace/pace.min.js"/>"></script>
<script src="<c:url value="/assets/lib/jasny-bootstrap/js/jasny-bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/slimscroll/jquery.slimscroll.min.js"/>"></script>
<script src="<c:url value="/assets/lib/nano-scroll/jquery.nanoscroller.min.js"/>"></script>
<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>
<script src="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/assets/js/custom.js"/>"></script>
</body>
</html>