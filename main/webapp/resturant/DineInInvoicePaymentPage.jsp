<%--
  Created by IntelliJ IDEA.
  User: ISH
  Date: 2/19/2019
  Time: 11:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.servletContext}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FixedPlus - Bootstrap Admin Dashboard Template</title>
    <!-- Common Plugins -->
    <link href="assets/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom Css-->
    <link href="<c:url value="/assets/lib/keybord/jqbtk.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet">
    <style>
        div.scrollmenu {
            background-color: #d4d2d2;
            overflow: hidden;
            white-space: nowrap;
        }

        div.scrollmenu a {
            display: inline-block;
            color: #000;
            text-align: center;
            padding: 14px;
            text-decoration: none;
            border: 1px #777 solid;
        }

        div.scrollmenu a:hover {
            background-color: #777;
            color: white;
        }

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
            top: 0%;
            color: white;
            font-size: 1.1em;
            left: 0px;
            padding: 8px 8px;
            position: absolute;
            transition: 0.5s padding;
            text-align: center;
            width: 100%;
        }

        .imagebox:hover img {
            opacity: 0.7;
        }

        .imagebox:hover .imagebox-desc {
            padding-bottom: 10%;
        }

        .captipnan:hover {
            padding-bottom: 10%;
            transition: 0.5s cubic-bezier;
        }

        .hideScrolBar {

        -webkit-scrollbar {
            width: 0 !important
        }

        ;
        overflow: -moz-scrollbars-none

        ;
        -ms-overflow-style: none

        ;
        }
        .shadowBox {
            -webkit-box-shadow: 0px 0px 29px -10px rgba(0, 0, 0, 0.94);
            -moz-box-shadow: 0px 0px 29px -10px rgba(0, 0, 0, 0.94);
            box-shadow: 0px 0px 29px -10px rgba(0, 0, 0, 0.94);
        }

        .imagebox .imagebox-price {
            background-color: rgba(0, 0, 0, 0.7);
            bottom: 0%;
            color: greenyellow;
            font-size: 1.2em;
            left: 0px;
            padding: 0px 5px 0px 5px;;
            position: absolute;
            text-align: center;
            width: 100%;
        }

        .font-size-3 {
            font-size: 1.3em;
        }

        /* width */
        ::-webkit-scrollbar {
            width: 20px;
        }

        /* Track */
        ::-webkit-scrollbar-track {
            box-shadow: inset 0 0 5px grey;
            border-radius: 10px;
        }

        /* Handle */
        ::-webkit-scrollbar-thumb {
            background: gray;
            border-radius: 10px;
        }

        /* Handle on hover */
        ::-webkit-scrollbar-thumb:hover {
            background: #b30000;
        }
    </style>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="nav-collapsed">
<!-- ============================================================== -->
<!-- 						Topbar Start 							-->
<!-- ============================================================== -->
<div class="top-bar primary-top-bar">
    <div class="container-fluid">
        <div class="row">
            <div class="col">
                <a class="admin-logo" href="index.html">
                    <h1>
                        <img alt="" src="assets/img/icon.png" class="logo-icon margin-r-10">
                        <img alt="" src="assets/img/logo-dark.png" class="toggle-none hidden-xs">
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
                    <li class="dropdown d-none-m">
                        <a onclick="headSelected(null, null, null, 1)" href="#">
                            <button class="btn btn-teal btn-icon btn-rounded"><i class="icon icon-bag"></i>Quick Sale
                            </button>
                        </a>
                    </li>
                </ul>
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
                                                        <img alt="" class="rounded-circle" src="assets/img/avtar-2.png"
                                                             width="50">
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
                            <img alt="" class="rounded-circle" src="assets/img/avtar-2.png" width="30">
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
                                                     src="assets/img/avtar-2.png" width="50"></span>
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
                <img alt="profile" class="margin-b-10  " src="assets/img/avtar-2.png" width="80">
                <p class="lead margin-b-0 toggle-none">User</p>
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
    <input type="hidden" id="CurentInvoicedNo"/>
    <div class="row">
        <div class="col-md-4 mailbox-sidenav">
            <div class="card" style="margin-left: -20px;">
                <div class="card-body no-margin" style="height: 88vh;">
                    <div style="height: 65%; overflow: auto; " id="tickets">
                    </div>
                    <hr/>
                    <button class="btn btn-lg btn-danger col-12 ">Total : <span class=" text-right " id="total"></span>
                    </button>
                    <hr/>
                    <div class="col-sm-12 col-lg-12 form-inline " id="btns">
                        <button class="btn btn-lg btn-info col-lg-6" data-target=".bs-example-modal-default"
                                data-toggle="modal" onclick="loadCustomers()">
                            Customer
                        </button>
                        <button class="btn btn-lg btn-info col-lg-6" data-target=".bs-example-modal-emp"
                                data-toggle="modal" onclick="loadEmp()">
                            Employee
                        </button>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-8">
            <div class="card" style="margin-left: -20px;margin-right: -20px;">
                <div class="card-body col-lg-12" style="min-height: 88vh;">
                    <div class="form-inline row" style="margin-top: -15px;">
                        <div class="col-lg-4 col-md-4 col-sm-12 form-inline">
                            <h4 class="h4">Table : </h4><h4 id='tname'></h4>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-12 form-inline">
                            <h4 class="h4">Guest : </h4><h4 id="customerName" title="0"></h4>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-12 form-inline">
                            <h4 class="h4">Employee : </h4><h4 id="employeeName"
                                                               title="${sessionScope.get("employeeID")}"></h4>
                        </div>
                    </div>
                    <div class="table-responsive form-group row" style="height: 88%;">
                        <div class="row col-lg-12">
                            <div class="col-4 card bg-info ">
                                <div class="col-lg-12 card-body"><!--Default Paymeyment Button set-->
                                    <div class="form-group">
                                        <label class="control-label">Amount :</label>
                                        <label class="form-control text-right font-500 font-size-3 "
                                               id="amount">100.00</label>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">balance :</label>
                                        <label class="form-control text-right font-size-3 " id="balance">00.00</label>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">Due :</label>
                                        <label class="form-control text-right text-danger font-size-3 "
                                               id="due">00.00</label>
                                    </div>
                                    <div class="form-group" hidden="">
                                        <label class="control-label">Discount :</label>
                                        <div class="form-inline">
                                            <input type="number"
                                                   class="form-control text-right font-size-3 col-5 number keyboard "
                                                   min="0" id="dis" placeholder="%" style="margin-right: 5px;"/>
                                            <input type="number"
                                                   class="form-control text-right font-size-3 col-6 number keyboard "
                                                   min="0" id="dis-amo" placeholder="amount"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">Tender :</label>
                                        <input type="number" class="form-control text-right font-size-3 number keyboard"
                                               min="0" id="tender" placeholder="Enter Amount"/>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div class="col-lg-12"> <!--Button set-->
                                    <button class="btn btn-lg btn-info  btn-icon col-10 margin-b-5 padding-20"
                                            id="cash_btn" onclick="saveInvoice('cash')">
                                        <i class="icon icon-star padding-15"></i>
                                        Cash
                                    </button>
                                    <button class="btn btn-lg btn-info  btn-icon col-10 margin-b-5 padding-20"
                                            id="card_btn" onclick="saveInvoice('card')">
                                        <i class="icon icon-star padding-15"></i>
                                        Card
                                    </button>
                                    <button class="btn btn-lg btn-info  btn-icon col-10 margin-b-5 padding-20"
                                            id="credit_btn" onclick="saveInvoice('credit')">
                                        <i class="icon icon-star padding-15"></i>
                                        Credit
                                    </button>
                                    <button class="btn btn-lg btn-info  btn-icon col-10 margin-b-5 padding-20 disabled"
                                            disabled="" id="cheque_btn" onclick="saveInvoice('cheque')">
                                        <i class="icon icon-star padding-15"></i>
                                        Cheque
                                    </button>
                                    <button class="btn btn-lg btn-warning  btn-icon col-10 margin-b-5 padding-20 disabled"
                                            disabled="" id="split_btn"
                                            onclick="$('#split_div').toggle(800);$('#tender').val('0').toggle(600)">
                                        <i class="icon icon-star padding-15"></i>
                                        Split
                                    </button>
                                </div>
                            </div>
                            <div class="col-4 card bg-teal" id="split_div"><!--Split payment comporntnt set-->
                                <div class="col-lg-12  card-body">
                                    <div class="form-group">
                                        <label class="control-label">cash :</label>
                                        <input type="number" class="form-control text-right keyboard" id="cash" min="0"
                                               value="0" onfocus="$(this).select()"/>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">card :</label>
                                        <input type="number" class="form-control text-right" id="card" min="0"
                                               value="0"/>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">cheque :</label>
                                        <input type="number" class="form-control text-right" id="cheque" min="0"
                                               value="0"/>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">Credit :</label>
                                        <input type="number" class="form-control text-right" id="credit" min="0"
                                               value="0"/>
                                    </div>
                                    <button class="btn btn-lg btn-primary  btn-icon col-10 margin-b-5 padding-20"
                                            id="done_btn" onclick="saveInvoice('split');">
                                        <i class="icon icon-note padding-15"></i>
                                        Done
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--</div>-->
                    <!--</div>-->
                    <div class="row col-lg-12">

                        <div class="col-sm-12 col-lg-6 padding-0 ">
                            <a href="Print:ORDERSOFTABLEHEAD${head}"
                               class="btn btn-lg btn-info btn-icon col-4 margin-b-5 padding-20">
                                <i class="icon icon-printer padding-15"></i>
                                Print
                            </a>
                            <button class="btn btn-lg btn-danger btn-icon col-3 margin-b-5 padding-20"
                                    onclick="finish(0)">
                                <i class="icon icon-close padding-15"></i>
                                Cancel
                            </button>
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
<!-- 						Content End		 						-->
<!-- ============================================================== -->

<div class="modal modal-lg fade bs-example-modal-emp" tabindex="-1" role="dialog" aria-labelledby="myDefaultModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                  class="fa fa-times"></span>
                </button>
                <h5 class="modal-title" id="myDefaultModalLabel">Select Employee</h5>
            </div>
            <div class="modal-body">
                <div class="row ">
                    <div class=" col-10 offset-1">
                        <div class="form-group">
                            <label class="control-label">Select Employee</label>
                            <select class="form-control dropdown dropdown-divider" id="employess"></select>
                        </div>
                    </div>
                </div>
                <div class="col-lg-12">
                    <table class="table table-responsive">
                        <div class="row"></div>
                    </table>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="setEmp()">Select</button>
            </div>
        </div>
    </div>
</div>
<div class="modal modal-lg fade bs-example-modal-default" tabindex="-1" role="dialog"
     aria-labelledby="myDefaultModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                  class="fa fa-times"></span>
                </button>
                <h5 class="modal-title" id="myDefaultModalLabel">Select Customer</h5>
            </div>
            <div class="modal-body">
                <div class="row ">
                    <div class="col-lg-5">
                        <div class="input-group">
                            <button class="btn btn-icon btn-info disabled">
                                <i class="icon icon-plus"></i>
                                Add Customer
                            </button>
                        </div>
                    </div>
                    <div class=" col-lg-7 ">
                        <div class="input-group">
                            <select class="form-control dropdown dropdown-divider" id="customers"></select>
                        </div>
                    </div>
                </div>
                <div class="col-lg-12">
                    <table class="table table-responsive">
                        <div class="row"></div>
                    </table>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="setCustomer()">Select</button>
            </div>
        </div>
    </div>
</div>

<div class="modal modal-lg fade bs-example-modal-emp" tabindex="-1" role="dialog" aria-labelledby="myEmpModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                  class="fa fa-times"></span>
                </button>
                <h5 class="modal-title" id="myEmpModalLabel">Select Employee</h5>
            </div>
            <div class="modal-body">
                <div class="row ">
                    <div class=" col-10 offset-1">
                        <div class="form-group">
                            <label class="control-label">Select Employee</label>
                            <select class="form-control dropdown dropdown-divider" id="employess"></select>
                        </div>
                    </div>
                </div>
                <div class="col-lg-12">
                    <table class="table table-responsive">
                        <div class="row"></div>
                    </table>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="setEmp()">Select</button>
            </div>
        </div>
    </div>
</div>
<div class="modal modal-lg fade bs-example-modal-balance" id="SalesInoiceResultmodel" tabindex="-1" role="dialog"
     aria-labelledby="myBalanceModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                  class="fa fa-times"></span>
                </button>
                <h5 class="modal-title" id="myBalanceModalLabel">Balance</h5>
            </div>
            <div class="modal-body">
                <div class="container">
                    <div class="col-12">
                        <label>Total : </label>
                        <h3 class="form-control" id="tot_dis"></h3>
                    </div>
                    <div class="col-12">
                        <label>Tender : </label>
                        <h3 class="form-control" id="tend_dis"></h3>
                    </div>
                    <div class="col-12">
                        <label>Balance : </label>
                        <h3 class="form-control" id="bal_dis"></h3>
                    </div>
                </div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal"
                        onclick="window.location = '<%=request.getContextPath()%>/tableslist'">Close
                </button>
                <button type="button" class="btn btn-primary btn-icon" onclick="printInvoice()"><i
                        class="icon icon-printer"></i>Print
                </button>
            </div>
        </div>
    </div>
</div>
<script src="<c:url value="/assets/lib/jquery/dist/jquery.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/popper.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/keybord/jqbtk.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/assets/lib/paginathing/paginathing.min.js"/>" type="text/javascript"></script>

<script type="text/javascript">
    $(function () {

        var oid = findGetParameter('orderid');
        if (oid > 1) {
            var e = document.createElement('a');
            e.id = 'sendToiOS';
            var strParams = "";
            e.href = 'Print:KOT' + oid;
            document.getElementsByTagName('body')[0].appendChild(e);
            e.click();
            e.parentNode.removeChild(e);
        }

        $("#tname").text(findGetParameter("tname"));
        $(".keyboard").keyboard({type: 'numpad', placement: 'right'});
        $('#split_div').hide();
        if ($("#customerName").attr('allow') != 1) {
            $("#credit_btn").attr('disabled', true);
            $("#credit").attr('disabled', true);
        }
        loadOrders();
        if (parseInt(findGetParameter('quick')) === 1) {
            cal();
            saveInvoice('cash');
        }
        $("#cash").keyup(function () {
            cal();
        });
        $("#card").keyup(function () {
            cal();
        });
        $("#credit").keyup(function () {
            cal();
        });
        $("#cheque").keyup(function () {
            cal();
        });
        $("#tender").keyup(function () {
            cal();
        });
        $("#dis").keyup(function () {
            cal();
        });
        $("#dis-amo").keyup(function () {
            cal();
        });
        $("#tender").focusout(function () {
            if (parseFloat($("#amount").text()) > parseFloat($("#tender").val())) {
                $("#tender").val('');
            }
        });
    });
    var printcount = 0;
    function printInvoice() {
        if (printcount != 1) {
            var e = document.createElement('a');
            e.id = 'sendToiOS';
            var strParams = "";
            e.href = 'Print:MENUINVOICE' + $("#CurentInvoicedNo").val();
            document.getElementsByTagName('body')[0].appendChild(e);
            e.click();
            e.parentNode.removeChild(e);
        } else {
            window.location = '<%=request.getContextPath()%>/tableslist'
        }
    }

    function loadOrders() {
        $.ajaxSetup({cache: false});
        var empid = 0, custid = 0;
        var url = "";
        if (parseInt(findGetParameter('quick')) === 1) {
            url = '<%=request.getContextPath()%>/tablesheadsorder/tablehead/' + findGetParameter('oid') + '/status/1';
        } else {
            url = '<%=request.getContextPath()%>/tablesheadsorder/tablehead/' + findGetParameter('head') + '/status/1';
        }
        $.getJSON(url, function (data) {
            $("#tickets").html("");
            $.each(data, function (index, cat) {
                empid = cat.employeeIdemployee;
                custid = cat.customersIdcustomers;
                var txt = "<div class='card shadowBox' id='O" + cat.idtableheadsorder + "'><div class='card-head text-center' >"
                    + "<header class='h6'>" + cat.idtableheadsorder + " - [" + new Date(cat.starttime).toLocaleDateString()
                    + " " + new Date(cat.starttime).getHours() + ":" + new Date(cat.starttime).getMinutes() + "]</header></div><div class='card-body'><ul class='list-group list-unstyled'></ul></div></div>";
                $("#tickets").append(txt);
                var ulist = {};
                $("#tickets").find('.shadowBox').each(function (ind, val) {
                    if ($(val).attr('id').slice(1) == cat.idtableheadsorder) {
                        ulist = $(this).find('ul');
                    }
                });
                var txt = "";
                $.each(cat.ticketssByIdtableheadsorder, function (i, tic) {
                    txt += " <li id='" + tic.idtickets + "' class='margin-b-10' "
                        + ' data-content="<button class=\'btn btn-lg btn-info pover col-4 \' onclick=\'changeQty(0,' + tic.idtickets + ',' + tic.idtickets + ')\'>-</button> <button class=\'btn btn-lg btn-success  col-4 \' onclick=\'changeQty(1,' + tic.idtickets + ',' + tic.idtickets + ')\'>+</button> <button class=\'btn btn-lg btn-danger col-3\' onclick=\'removeThis(' + tic.idtickets + ',' + tic.idtickets + ');\'>x</button>"'
                        + "data-html='true' data-toggle='popover' data-placement='right' title='Options'   >"
                        + "<a class='media-box' href='javascript: void(0);' ><span class='badge badge-success float-right mt-1 text-lg total' style='font-size:15px;' >" + parseFloat(tic.menuitemByMenuitemIdmenuitem.selligprice * tic.qty).toFixed(2) + "</span>"
                        + "<span class='float-left margin-r-10'>"
                        + " <img alt='user' class='media-box-object rounded-circle' src='<%= request.getContextPath()%>/" + tic.menuitemByMenuitemIdmenuitem.icon + "' width='40'></span>"
                        + "<span class='media-box-body'><span class='media-box-heading'><strong>" + tic.menuitemByMenuitemIdmenuitem.menuitem + "</strong><br><small>QTY : </small><small class='qty  text-info'>" + parseFloat(tic.qty).toFixed(2) + " </small><small  class='margin-l-10'> Price: </small><small class='price margin-l-15  text-danger'> " + parseFloat(tic.menuitemByMenuitemIdmenuitem.selligprice).toFixed(2) + "</small></li>";
                });
                $(ulist).html($(ulist).html() + txt);
                calTotal();
                $('[data-toggle="popover"]').on('click', function (e) {
                    $('[data-toggle="popover"]').not(this).popover('hide');
                });
                $('[data-toggle="popover"]').popover();
                $("#tickets").scrollTop($("#tickets")[0].scrollHeight);
            });
        }).error(function () {
            swal({
                title: "Order Data Load Faild..",
                text: "Something Wrong In Server Side !!{code :Ti-Lo}",
                type: "error",
                confirmButtonClass: 'btn-danger',
                confirmButtonText: 'Close'
            });
        }).success(function () {
            $.getJSON('<%=request.getContextPath()%>/employees/find/' + empid, function (data) {
                $("#employeeName").attr('title', empid);
                $("#employeeName").text(data.fistname + " " + data.lastname);
            });
            $.getJSON("<%=request.getContextPath()%>/customers/find/" + custid, function (data) {
                $("#customerName").attr('title', custid);
                $("#customerName").text(data.firstname + " " + data.lastname);
                $("#customerName").attr('allow', data.creditallow);
            });
        });
    }

    function cal() {
        var amount = $("#amount").text();
        var tender = $("#tender").val();
        var balence = (parseFloat(amount) - (parseFloat(tender) + parseFloat($("#cash").val()) + parseFloat($("#card").val()) + parseFloat($("#credit").val()) + parseFloat($("#cheque").val())));
        isNaN(balence) || (parseFloat(tender) < parseFloat(amount)) ? 0 : $("#balance").text(Math.abs(parseFloat(balence)).toFixed(2));
        var dis = $("#dis").val();
        var dis_amo = $("#dis-amo").val();
        if ((parseFloat(tender) < parseFloat(amount))) {
            $("#due").text(parseFloat(amount) - parseFloat(tender))
        } else {
            $("#due").text("00.00");
        }
        $("#bal_dis").text(Math.abs(parseFloat(balence)).toFixed(2));
        $("#tot_dis").text(amount);
        $("#tend_dis").text((parseFloat(tender) + parseFloat($("#cash").val()) + parseFloat($("#card").val()) + parseFloat($("#credit").val()) + parseFloat($("#cheque").val())));
        $("#balance").toggleClass('.text-danger', parseFloat(balence) < 0);
        //                                $("#balance").toggleClass('.text-muted', balence < 0);
    }
    function calTotal() {
        var total = 0.00;
        $(".shadowBox").find('.total').each(function (index, val) {
            total += parseFloat($(val).text());
        });
        $("#total").text(total.toFixed(2));
        $("#amount").text(total.toFixed(2));
        $("#tender").val(total.toFixed(2));
    }
    function loadCustomers() {
        $(this).addClass("active");
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/customers/all', function (data) {
            var catSet = '';
            $.each(data, function (index, cat) {
                catSet += "<option value='" + cat.idcustomers + "' allow='" + cat.creditallow + "'>" + cat.suffix + " " + cat.firstname + "</option>";
            });
            $("#customers").html(catSet);
        });
    }
    function setCustomer() {
        $("#customerName").text($("#customers :selected").text());
        $("#customerName").attr('allow', $("#customers :selected").attr('allow'));
        $("#customerName").attr('title', $("#customers").val());
        $(".bs-example-modal-default").modal('hide');
    }
    function loadEmp() {
        $(this).addClass("active");
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/employees/all', function (data) {
            var catSet = '';
            $.each(data, function (index, cat) {
                catSet += "<option value='" + cat.idemployee + "'>" + cat.fistname + " " + cat.lastname + "</option>";
            });
            $("#employess").html(catSet);
        });
    }
    function setEmp() {
        $("#employeeName").text($("#employess :selected").text());
        $("#employeeName").attr('title', $("#employess").val());
        $(".bs-example-modal-emp").modal('hide');
    }
    function finish(status) {
        if (status === 1) {
            saveOrders();
        } else {
            window.location = "<%=request.getContextPath()%>/tableslist";
        }
    }
    function changeQty(chose, comp, ticketId = 0) {
        if (chose === 1) {
            $('#' + comp).find('.qty').text((parseFloat($('#' + comp).find('.qty').text()) + 1).toFixed(2));
            if (ticketId !== 0)
                $.ajax("<%=request.getContextPath()%>/tickets/update/" + ticketId + "/qty/" + (parseFloat($('#' + comp).find('.qty').text()) + 1).toFixed(2), {
                    type: 'PUT',
                    contentType: 'JSON',
                    dataType: 'JSON'
                });
        } else {
            if (parseFloat($('#' + comp).find('.qty').text()) > 1) {
                $('#' + comp).find('.qty').text((parseFloat($('#' + comp).find('.qty').text()) - 1).toFixed(2));
                if (ticketId !== 0)
                    $.ajax("<%=request.getContextPath()%>/tickets/update/" + ticketId + "/qty/" + (parseFloat($('#' + comp).find('.qty').text()) - 1).toFixed(2), {type: 'PUT'});
            }
        }
        $('#' + comp).find('.total').text((parseFloat($('#' + comp).find('.qty').text()) * parseFloat($('#' + comp).find('.price').text())).toFixed(2));
        calTotal();
    }
    function findGetParameter(parameterName) {
        var result = null,
            tmp = [];
        var items = location.search.substr(1).split("&");
        for (var index = 0; index < items.length; index++) {
            tmp = items[index].split("=");
            if (tmp[0] === parameterName)
                result = decodeURIComponent(tmp[1]);
        }
        return result;
    }

    function saveInvoice(type) {
        cal();

        var invoice = {};
        //            invoice.discount = $("#dis").val();
        invoice.discount = $("#dis-amo").val();
        invoice.credit = $("#cash").val();
        //            invoice.card = $("#card").val();
        //            invoice.card = $("#cheque").val();
        //            invoice.credit = $("#credit").val();
        invoice.tender = parseFloat($("#tender").val()) > 0 ? $("#tender").val() : $("#amount").text();
        invoice.customer = $("#customerName").attr("title");
        invoice.employeeid = $("#employeeName").attr("title");
        invoice.headid = findGetParameter('head');
        //            invoice.paymentType = type;
        $.ajax("<%=request.getContextPath()%>/tablesheadsorder/createMenuSalesInvoice", {
            type: 'POST',
            data: JSON.stringify(invoice),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (data, textStatus, jqXHR) {
                $("#SalesInoiceResultmodel").modal('show');
                $("#CurentInvoicedNo").val(data.id);
                var e = document.createElement('a');
                e.id = 'sendToiOS';
                var strParams = "";
                e.href = 'Print:MENUINVOICE' + data.id;
                document.getElementsByTagName('body')[0].appendChild(e);
                e.click();
                e.parentNode.removeChild(e);
            }, error: function (jqXHR, textStatus, errorThrown) {
                swal({
                    title: "Save NOT Success..",
                    text: "Something Wrong In Server Side !! {code :OH-sv}",
                    type: "error",
                    cancelButtonClass: 'btn-secondary',
                    confirmButtonClass: 'btn-danger',
                    confirmButtonText: 'Close!'
                });
            }
        });
    }
    function headSelected(tableId, headId, name, quick = 0) {
        if (quick === 0) {
            window.location = "dineininvoice?t=" + tableId + "&head=" + headId + "&tname=" + name + "&quick=" + quick;
        } else {
            window.location = "dineininvoice?t=" + 0 + "&head=" + 0 + "&tname=Quick&quick=" + quick;
        }
    }
</script>
<!-- Common Plugins -->
<script src="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/assets/lib/pace/pace.min.js"/>"></script>
<script src="<c:url value="/assets/lib/jasny-bootstrap/js/jasny-bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/slimscroll/jquery.slimscroll.min.js"/>"></script>
<script src="<c:url value="/assets/lib/nano-scroll/jquery.nanoscroller.min.js"/>"></script>
<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>
<script src="<c:url value="/assets/js/custom.js"/>"></script>

</body>
</html>