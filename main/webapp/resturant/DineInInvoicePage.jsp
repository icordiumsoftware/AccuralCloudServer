<%--
  Created by IntelliJ IDEA.
  User: ISH
  Date: 2/19/2019
  Time: 9:26 PM
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
    <!-- Custom Css-->
    <link href="<c:url value="/assets/lib/keybord/jqbtk.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/assets/lib/keybord2/keyboard.min.css"/>" rel="stylesheet" type="text/css"/>
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
            top : 0%;
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
        .captipnan:hover{
            padding-bottom: 10%;
            transition: 0.5s cubic-bezier;
        }
        .hideScrolBar{
        -webkit-scrollbar { width: 0 !important };
        overflow: -moz-scrollbars-none;
        -ms-overflow-style: none;
        }
        .shadowBox{
            -webkit-box-shadow: 0px 0px 29px -10px rgba(0,0,0,0.94);
            -moz-box-shadow: 0px 0px 29px -10px rgba(0,0,0,0.94);
            box-shadow: 0px 0px 29px -10px rgba(0,0,0,0.94);
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
                <a class="admin-logo" href="<%=request.getContextPath()%>/index.html">
                    <h1>
                        <img alt="" src="<c:url value="/assets/img/icon.png"/>" class="logo-icon margin-r-10">
                        <img alt="" src="<c:url value="/assets/img/logo-dark.png"/>" class="toggle-none hidden-xs">
                    </h1>
                </a>
                <div class="left-nav-toggle" >
                    <a  href="#" class="nav-collapse"><i class="fa fa-bars"></i></a>
                </div>
                <div class="left-nav-collapsed" >
                    <a  href="#" class="nav-collapsed"><i class="fa fa-bars"></i></a>
                </div>
                <div class="search-form hidden-xs">
                    <form>
                        <input class="form-control" placeholder="Search for..." type="text"> <button class="btn-search" type="button"><i class="fa fa-search"></i></button>
                    </form>
                </div>
            </div>
            <div class="col">
                <ul class="list-inline top-right-nav">
                    <li class="dropdown d-none-m">
                        <a onclick="headSelected(null, null, null, 1)" href="#"><button class="btn btn-teal btn-icon btn-rounded"><i class="icon icon-bag"></i>Quick Sale</button></a>
                    </li>
                </ul>
            </div>
            <div class="col">
                <ul class="list-inline top-right-nav">
                    <li class="dropdown icons-dropdown d-none-m">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="fa fa-envelope"></i> <div class="notify setpos"> <span class="heartbit"></span> <span class="point"></span> </div></a>
                        <ul class="dropdown-menu top-dropdown lg-dropdown notification-dropdown">
                            <li>
                                <div class="dropdown-header">
                                    <a class="float-right" href="#"><small>View All</small></a> Messages
                                </div>

                                <div class="scrollDiv">
                                    <div class="notification-list">
                                        <a class="clearfix" href="javascript:%20void(0);">
                                                    <span class="notification-icon">
                                                        <img alt="" class="rounded-circle" src="<c:url value="/assets/img/avtar-2.png"/>" width="50">
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
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="fa fa-bell"></i> <div class="notify setpos"> <span class="heartbit"></span> <span class="point"></span> </div></a>
                        <ul class="dropdown-menu top-dropdown lg-dropdown notification-dropdown">
                            <li>
                                <div class="dropdown-header">
                                    <a class="float-right" href="#"><small>View All</small></a> Notifications
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
                            <img alt="" class="rounded-circle" src="<c:url value="/assets/img/avtar-2.png"/>" width="30">
                            ${sessionScope.get("employeeName")}
                        </a>
                        <ul class="dropdown-menu top-dropdown">
                            <li>
                                <a class="dropdown-item" href="javascript:%20void(0);"><i class="icon-bell"></i> Activities</a>
                            </li>
                            <li>
                                <a class="dropdown-item" href="javascript:%20void(0);"><i class="icon-user"></i> Profile</a>
                            </li>
                            <li>
                                <a class="dropdown-item" href="javascript:%20void(0);"><i class="icon-settings"></i> Settings</a>
                            </li>
                            <li class="dropdown-divider"></li>
                            <li>
                                <a class="dropdown-item" href="<%=request.getContextPath()%>/CounterClose"><i
                                        class="icon-calculator"></i>  Counter Close</a>
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
                    <div class="tab-pane active" id="friends" role="tabcard" >
                        <ul class="list-unstyled sidebar-contact-list">
                            <li class="clearfix">
                                <a class="media-box" href="#"><span class="float-right"><span class="circle circle-success circle-lg"></span></span> <span class="float-left">
                                                <img alt="user" class="media-box-object rounded-circle" src="<c:url value="/assets/img/avtar-2.png"/>" width="50"></span>
                                    <span class="media-box-body"><span class="media-box-heading"><strong>John Doe</strong><br>
                                                    <small class="text-muted">Designer</small></span></span></a>
                            </li>
                            <li>
                                <div class=" text-center">
                                    <a class="btn btn-teal" href="javascript:void(0);" title="See more contacts">Load more..</a>
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
                <div class="notify setpos"> <span class="heartbit"></span> <span class="point"></span> </div>
                <img alt="profile" class="margin-b-10  " src="<c:url value="/assets/img/avtar-2.png"/>" width="80">
                <p class="lead margin-b-0 toggle-none">User</p>
                <p class="text-muted mv-0 toggle-none">Welcome</p>
            </div>

            <ul class="metisMenu nav flex-column" id="menu">
                <li class="nav-heading"><span>MAIN</span></li>
                <li class="nav-item"><a class="nav-link" href="#"><i class="fa fa-home"></i> <span class="toggle-none">Dashboard <span class="badge badge-pill badge-danger float-right mr-2">1.0</span></span></a></li>

                <li class="nav-item">
                    <a class="nav-link" href="javascript: void(0);" aria-expanded="false"><i class="fa fa-folder-open"></i> <span class="toggle-none">Multi Level<span class="fa arrow "></span></span></a>
                    <ul class="nav-third-level nav flex-column sub-menu" aria-expanded="false">
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>\index.html">Home</a></li>
                        <li class="nav-item"><a class="nav-link" href="javascript: void(0);">Counter</a></li>
                        <li class="nav-item"><a class="nav-link" href="<%=request.getContextPath()%>\CounterClose">Counter Close</a></li>
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
        <div class="col-md-4 mailbox-sidenav"  >
            <div class="card" style="margin-left: -20px;" >
                <div class="card-body no-margin" style="height: 88vh;">
                    <div style="height: 65%; overflow: auto; " id="tickets" >
                    </div>
                    <hr />
                    <button class="btn btn-lg btn-danger col-12 " onclick="loadSettle()">Total : <span class=" text-right " id="total"></span></button>
                    <hr />
                    <div class="col-12 col-sm-12 col-lg-12  form-group" id="btns">
                        <button class="btn btn-lg btn-info  col-6 " data-target=".bs-example-modal-default" data-toggle="modal" onclick="loadCustomers()">
                            Customer
                        </button>
                        <button class="btn btn-lg btn-info  col-5 " data-target=".bs-example-modal-emp" data-toggle="modal" onclick="loadEmp()">
                            Employee
                        </button>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-8" >
            <div class="card" style="margin-left: -20px;margin-right: -20px;" >
                <div class="card-body col-lg-12" style="height: 88vh;">
                    <div class="form-inline row" style="margin-bottom: -20px;margin-top: -10px;">
                        <div class="col-lg-4 col-md-4 col-sm-12 form-inline">
                            <h4 class="h4">Table : </h4><h4 id='tname'></h4>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-12 form-inline">
                            <h4 class="h4">Guest Name: </h4><h4 id="customerName" title="0" ></h4>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-12 form-inline">
                            <h4 class="h4">Employee : </h4><h4 id="employeeName" title="${sessionScope.get("employeeID")}"></h4>
                        </div>
                    </div>
                    <div class="table-responsive" style="height: 88%;">
                        <div class="card-body"  id="content_area"  >
                            <div class="container-fluid">
                                <header>Categorys</header>
                                <div class="row margin-b-5 hideScrolBar" >
                                    <div class="col col-1 bg-blue" style="padding: 0px;" >
                                        <button class="btn btn-default" style="width: 100%;height: 100% " id="c-left"> < </button>
                                    </div>
                                    <div class="col col-10 hideScrolBar">
                                        <div class="scrollmenu hideScrolBar " id="categorys" >
                                        </div>
                                    </div>
                                    <div class="col col-1 bg-blue" style="padding: 0px;" >
                                        <button class="btn btn-default"  style="width: 100%;height: 100% " id="c-right"> > </button>
                                    </div>
                                </div>
                            </div>
                            <div class="container-fluid">
                                <header>Types</header>
                                <div class="row margin-b-5 hideScrolBar" >
                                    <div class="col col-1 bg-blue" style="padding: 0px;" >
                                        <button class="btn btn-default" style="width: 100%;height: 100%;" id="t-left"> < </button>
                                    </div>
                                    <div class="col col-10 hideScrolBar">
                                        <div class="scrollmenu hideScrolBar " id="types" >
                                        </div>
                                    </div>
                                    <div class="col col-1 bg-blue" style="padding: 0px;" >
                                        <button class="btn btn-default"  style="width: 100%;height: 100% " id="t-right"> > </button>
                                    </div>
                                </div>
                            </div>
                            <div class=""  >
                                <div class="lightboxGallery row " id="items" >
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--</div>-->
                    <!--</div>-->
                    <div class="row col-lg-12">
                        <div class="col-sm-12 col-lg-6 padding-0">
                            <button class="btn btn-lg btn-info btn-icon col-4 margin-b-5 padding-20">
                                <i class="icon icon-plus padding-15"></i>
                                Extra change
                            </button>
                            <button class="btn btn-lg btn-info  btn-icon col-4 margin-b-5 padding-20">
                                <i class="icon icon-star padding-15"></i>
                                Discount
                            </button>
                            <button class="btn btn-lg btn-info btn-icon col-3 margin-b-5 padding-20" onclick="loadSettle()">
                                <i class="icon icon-wallet padding-15"></i>
                                Settle
                            </button>
                        </div>
                        <div class="col-sm-12 col-lg-6 padding-0 ">
                            <a class="btn btn-lg btn-info btn-icon col-4 margin-b-5 padding-20" href="Print:ORDERSOFTABLEHEAD${head}">
                                <i class="icon icon-printer padding-15"></i>
                                Print
                            </a>
                            <button class="btn btn-lg btn-success btn-icon col-4 margin-b-5 padding-20 " id="btn_finish" onclick="finish(1)">
                                <i class="icon icon-check padding-15"></i>
                                Finish
                            </button>
                            <button class="btn btn-lg btn-danger btn-icon col-3 margin-b-5 padding-20" onclick="finish(0)">
                                <i class="icon icon-close padding-15" ></i>
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
<input type="hidden" id="LastOrderID">

</section>
<!-- ============================================================== -->
<!-- 						Content End		 						-->
<!-- ============================================================== -->

<div class="modal fade bs-example-modal-default" tabindex="-1" role="dialog" aria-labelledby="myDefaultModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true" class="fa fa-times"></span></button>
                <h5 class="modal-title" id="myDefaultModalLabel">Select Customer</h5>
            </div>
            <div class="modal-body">
                <div class="row " >
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

<div class="modal fade bs-example-modal-emp" tabindex="-1" role="dialog" aria-labelledby="myDefaultModalLabel">
    <div class="modal-dialog " role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true" class="fa fa-times"></span></button>
                <h5 class="modal-title" id="myDefaultModalLabel">Select Employee</h5>
            </div>
            <div class="modal-body">
                <div class="row " >
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

<div class="modal fade bs-example-modal-arrack " tabindex="-1" role="dialog" aria-labelledby="myDefaultModalLabel">
    <div class="modal-dialog " role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true" class="fa fa-times"></span></button>
                <h5 class="modal-title" id="miName" miid=""></h5>
            </div>
            <div class="modal-body">
                <div class="row" >
                    <div class="col-12">
                        <div class="form-group" >
                            <label class="control-label ">Enter Qty:</label>
                            <input type="number" min="1" class="form-control keyboard " contentEditable="true" role="textbox" id="qty" />
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="addToTable()">Add</button>
            </div>
        </div>
    </div>
</div>
<script src="<c:url value="/assets/lib/jquery/dist/jquery.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/popper.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/keybord/jqbtk.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/assets/lib/paginathing/paginathing.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.js"/>" type="text/javascript"></script>
<script type="text/javascript" >

    $(function () {
        <%--$("#tname").text('${tname}');--%>
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/menucategory/all', function (data) {
            var catSet = "";
            $.each(data, function (index, cat) {
                if (index === 0) {
                    loadTypes(cat.idmenucategoy);
                }
                catSet += "<a href='#C" + cat.menucategoy + "' onclick='loadTypes(" + cat.idmenucategoy + ")'><span class='icon icon-rocket'></span>" + cat.menucategoy + "</a>";
            });
            $("#categorys").html(catSet);
        });
        $("#c-left").click(function () {
            $("#categorys").animate({scrollLeft: '-=' + $("#categorys").width() + ''}, 500);
        });
        $("#c-right").click(function () {
            $("#categorys").animate({scrollLeft: '+=' + $("#categorys").width() + ''}, 500);
        });
        $("#t-left").click(function () {
            $("#types").animate({scrollLeft: '-=' + $("#types").width() + ''}, 500);
        });
        $("#t-right").click(function () {
            $("#types").animate({scrollLeft: '+=' + $("#types").width() + ''}, 500);
        });
        $(".keyboard").keyboard({type: 'numpad'});
        if (parseInt(findGetParameter('quick')) == 0) {
            loadOrders();
            $("#btn_finish").attr('disabled',false);
        }else{
            $("#btn_finish").attr('disabled',true);
            $("#btn_finish").addClass('.disabled');
        }
    }); //redy function is over....................

    function loadTypes(categoryId) {
        $(this).addClass("active");
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/menutypes/getbycategory/' + categoryId, function (data) {
            var catSet = '';
            $.each(data, function (index, cat) {
                if (index === 0) {
                    loadItems(cat.idmenutype);
                }
                catSet += "<a href='#T" + cat.menutype + "' onclick='loadItems(" + cat.idmenutype + ")'><span class='icon icon-rocket'></span>" + cat.menutype + "</a>";
                //                                        $("#types").append(catSet);
            });
            $("#types").html(catSet);
        });
    }
    function loadItems(typeId) {
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/menuitems/bytypeid/' + typeId, function (data) {
            var catSet = "";
            $("#items").html('');
            $.each(data, function (index, cat) {
                catSet += "<div class='imagebox  img-thumbnail img-responsive col-lg-2 col-md-3 col-sm-5'>";
                catSet += "<a class=''  href='#' onclick='showModel(" + cat.idmenuitem + ",\"" + cat.menuitem + "\",\"" + cat.selligprice + "\")' ><img  src='<%=request.getContextPath()%>/"+ cat.icon + "' class='img-fluid thumbnail' alt=''><span  class='captipnan img-fluid imagebox-desc'>" + cat.menuitem + "</span><span class='text-right imagebox-price' style='position: absolute; '>" + cat.selligprice + "/=</span></a>";
                catSet += "</div>";
            });
            $("#items").html(catSet);
        });
    }

    function showModel(itemId, itemName, sellprice) {
        $(".bs-example-modal-arrack").modal('show');
        $('#miName').text(itemName);
        $('#miName').attr('miid', itemId);
        $('#miName').attr('sprice', sellprice);
        $(".bs-example-modal-arrack").on('shown.bs.modal', function () {
            $("#qty").val(1);
            $("#qty").focusin();
            $("#qty").select();
        });
    }
    function addToTable() {
        if (parseFloat($("#qty").val()) > 0) {
            $(".bs-example-modal-arrack").modal('hide');
            var notFound = 0;
            var lid = ($('#0').find('ul').find('li').size() + 1);
            $("#tickets").find('.shadowBox').each(function (ind, val) {
                if ($(val).attr('id') === '0') {
                    var ulist = $(this).find('ul');
                    notFound = 1;
                    var txt = " <li id='N" + lid + "' item='" + $('#miName').attr('miid') + "' class='margin-b-10' "
                        + ' data-content="<button class=\'btn btn-lg btn-info pover col-4\' onclick=\'changeQty(0, ' + lid + ')\'>-</button> <button class=\'btn btn-lg btn-success  col-4 \' onclick=\'changeQty(1,' + lid + ')\'>+</button> <button class=\'btn btn-lg btn-danger col-3\' onclick=\'removeThis(' + lid + ',0);\'>x</button>"'
                        + "data-html='true' data-toggle='popover' data-placement='right' title='Options' >"
                        + "<a class='media-box' href='javascript: void(0);' ><span class='badge badge-success float-right mt-1 text-lg total' style='font-size:15px;' >" + (parseFloat($('#miName').attr('sprice')) * parseFloat($("#qty").val())).toFixed(2) + "</span>"
                        + "<span class='float-left margin-r-10'>"
                        + " <img alt='user' class='media-box-object rounded-circle' src='<c:url value="/assets/img/avtar-3.png"/>' width='40'/></span>"
                        + "<span class='media-box-body'><span class='media-box-heading'><strong>" + $("#miName").text() + "</strong><br><small>QTY : </small><small class='qty text-info'>" + $("#qty").val() + " </small><small  class='margin-l-10'> Price: </small><small class='price margin-l-15  text-danger'> " + $('#miName').attr('sprice') + "</small></li>";
                    $(ulist).html($(ulist).html() + txt);
                }
            });
            if (notFound === 0) {
                var txt = "<div class='card shadowBox' id='0'>"
                    + "<div class='card-head text-center' >"
                    + "<header class='h6'>VIP Area > Vip Table 01</header>"
                    + "</div><div class='card-body'>"
                    + "<ul class='list-group list-unstyled'>"
                    + "<li id='N" + lid + "' item='" + $('#miName').attr('miid') + "' class='margin-b-10'  "
                    + ' data-content="<button class=\'btn btn-lg btn-info pover col-4\' onclick=\'changeQty(0, ' + lid + ' )\'>-</button> <button class=\'btn btn-lg btn-success col-4 \' onclick=\'changeQty(1,' + lid + ' )\'>+</button> <button class=\'btn btn-lg btn-danger col-3\' onclick=\'removeThis(' + lid + ',0)\'>x</button>"'
                    + " data-html='true' data-toggle='popover' data-placement='right' title='Options' >"
                    + " <a class='media-box' href=\"javascript:void(0);\" ><span class='badge badge-success float-right mt-1 total' style='font-size:15px;' >" + (parseFloat($('#miName').attr('sprice')) * parseFloat($("#qty").val())).toFixed(2) + "</span>"
                    + " <span class='float-left margin-r-10'>\<img alt='user' class='media-box-object rounded-circle' src='<c:url value="/assets/img/avtar-3.png"/>' width='40'></span>"
                    + " <span class='media-box-body'><span class='media-box-heading'><strong>" + $("#miName").text() + "</strong><br><small>QTY : </small><small class='qty text-info margin-r-10'>" + $("#qty").val() + " </small><small class='margin-l-10'> Price : </small><small class='sprice text-danger price'> " + $('#miName').attr('sprice') + " </small></li></ul></div></div>";
                $("#tickets").append(txt);
            }
            $("#tickets").scrollTop($("#tickets")[0].scrollHeight);
        } else {
            swal("Quantity must be greter than '>0'");
        }
        $('[data-toggle="popover"]').popover();
        calTotal();
        $("#qty").val('');
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
    //                            function removeThis(componentID, itemid) {
    //                                $('[data-toggle="popover"]').popover('hide');
    //                                if (itemid !== 0) {
    //                                    $.ajax("<%//request.getContextPath()%>/tickets/delete/" + itemid, {
    //                                        type: 'POST',
    //                                        success: function (data, textStatus, jqXHR) {
    //                                            loadOrders();
    //                                        }, error: function (jqXHR, textStatus, errorThrown) {
    //                                            status = status & false;
    //                                            swal({
    //                                                title: "Delete NOT Success..",
    //                                                text: "Something Wrong In Server Side !!{code :Ti-DE}",
    //                                                type: "error",
    //                                                confirmButtonClass: 'btn-danger',
    //                                                confirmButtonText: 'Close'
    //                                            });
    //                                        }
    //                                    });
    //                                    $('#N' + componentID).remove();
    //                                } else {
    //                                    if ($("#N" + componentID).parents('ul').find('li').size() === 1) {
    //                                        $("#N" + componentID).parents('div.shadowBox').remove();
    //                                    } else {
    //                                        $("#N" + componentID).remove();
    //                                    }
    //                                }
    //
    //                            }
    function removeThis(componentID, itemid) {
        $('[data-toggle="popover"]').popover('hide');
        if (itemid !== 0) {
            $.ajax("<%=request.getContextPath()%>/tickets/delete/" + itemid, {
                type: 'POST',
                success: function (data, textStatus, jqXHR) {
                    loadOrders();
                }, error: function (jqXHR, textStatus, errorThrown) {
                    status = status & false;
                    swal({
                        title: "Delete NOT Success..",
                        text: "Something Wrong In Server Side !!{code :Ti-DE}",
                        type: "error",
                        confirmButtonClass: 'btn-danger',
                        confirmButtonText: 'Close'
                    });
                }
            });
            $('#N' + componentID).remove();
        } else {
            if ($("#N" + componentID).parents('ul').find('li').size() === 1) {
                $("#N" + componentID).parents('div.shadowBox').remove();
            } else {
                $("#N" + componentID).remove();
            }
        }

    }
    function changeQty(chose, comp, ticketId = 0) {
        if (chose === 1) {
            if (ticketId === 0) {
                $('#N' + comp).find('.qty').text((parseFloat($('#N' + comp).find('.qty').text()) + 1).toFixed(2));
            } else {
                $('#' + comp).find('.qty').text((parseFloat($('#' + comp).find('.qty').text()) + 1).toFixed(2));
            }
            if (ticketId !== 0) {
                $.ajax("<%=request.getContextPath()%>/tickets/update/" + ticketId + "/qty/" + (parseFloat($('#' + comp).find('.qty').text())).toFixed(2), {type: 'PUT', contentType: 'JSON', dataType: 'JSON'});
            }
        } else {
            if (parseFloat($('#' + comp).find('.qty').text()) > 1) {
                if (ticketId === 0) {
                    $('#N' + comp).find('.qty').text((parseFloat($('#N' + comp).find('.qty').text()) - 1).toFixed(2));
                } else {
                    $('#' + comp).find('.qty').text((parseFloat($('#' + comp).find('.qty').text()) - 1).toFixed(2));
                }
                if (ticketId !== 0) {
                    $.ajax("<%=request.getContextPath()%>/tickets/update/" + ticketId + "/qty/" + (parseFloat($('#' + comp).find('.qty').text())).toFixed(2), {type: 'PUT', contentType: 'JSON', dataType: 'JSON'});
                }
            }
        }
        if (ticketId === 0) {
            $('#N' + comp).find('.total').text((parseFloat($('#N' + comp).find('.qty').text()) * parseFloat($('#N' + comp).find('.price').text())).toFixed(2));
        } else {
            $('#' + comp).find('.total').text((parseFloat($('#' + comp).find('.qty').text()) * parseFloat($('#' + comp).find('.price').text())).toFixed(2));
        }
        calTotal();
    }
    function calTotal() {
        var total = 0.00;
        $(".shadowBox").find('.total').each(function (index, val) {
            total += parseFloat($(val).text());
        });
        $("#total").text(total.toFixed(2));
    }
    function finish(status) {
        if (status === 1) {
            saveOrdersFinish(0);


        } else {
            window.location = "<%=request.getContextPath()%>/tableslist";
        }
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
    function loadOrders() {
        $.ajaxSetup({cache: false});
        var empid = 0, custid = 0;
        $.getJSON('<%=request.getContextPath()%>/tablesheadsorder/tablehead/' + ${head} + '/status/1', function (data) {
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
                        + " <img alt='user' class='media-box-object rounded-circle' src='/" + tic.menuitemByMenuitemIdmenuitem.icon + "' width='40'></span>"
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
                title: "Save NOT Success..",
                text: "Something Wrong In Server Side !!{code :Ti-Lo}",
                type: "error",
                confirmButtonClass: 'btn-danger',
                confirmButtonText: 'Close'
            });
        }).success(function () {
            $.getJSON("<%=request.getContextPath()%>/employees/find/" + empid, function (data) {
                $("#employeeName").attr('title', empid);
                $("#employeeName").text(data.fistname + " " + data.lastname);
            });
            if (custid !== undefined) {
                $.getJSON("<%=request.getContextPath()%>/customers/find/" + custid, function (data) {
                    $("#customerName").attr('title', custid);
                    $("#customerName").text(data.firstname + " " + data.lastname);
                    $("#customerName").attr('allow', data.creditallow);
                });
            }
        });
    }
    var oid = 0;
    function saveOrdersAndLoadSettle(print = 1) {
        var order = {};
        oid = 0;
        var status = true;
        if ($("#employeeName").attr('title') != '0') {
            order.employeeIdemployee = $("#employeeName").attr('title');
        }
        order.starttime = 0;
        if(${head}!==0){
            order.tableheadsIdtableheads = ${head};
        }
        order.locationIdlocation = ${sessionScope.get("LocationID")};
        order.usersIdusers = ${sessionScope.get("userid")};
        order.orderstatus = 1;
        if ($("#customerName").attr('title') !== '0') {
            order.customersIdcustomers = $("#customerName").attr('title');
        }
        if ($("#0").find('li').size() > 0) {
            $.ajax("<%=request.getContextPath()%>/tablesheadsorder/add", {
                type: 'POST',
                data: JSON.stringify(order),
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data, textStatus, jqXHR) {
                    oid = data.id;
                    $("#LastOrderID").val(oid);
                    status = status & true;
                    $("#0").find('li').each(function (ind, val) {
                        var ticket = {};
                        ticket.ticketype = 0;
                        ticket.tableheadsorderIdtableheadsorder = oid; //order head
                        ticket.menuitemIdmenuitem = parseInt($(val).attr('item'));
                        ticket.qty = parseFloat(parseFloat($(val).find('.qty').text()).toFixed(2));
                        ticket.freeqty = 0;
                        ticket.status = 1;
                        ticket.regdatetime = new Date().getTime();
                        $.ajax("<%=request.getContextPath()%>/tickets/add", {
                            type: 'POST',
                            data: JSON.stringify(ticket),
                            contentType: "application/json; charset=utf-8",
                            dataType: "json",
                            success: function (data, textStatus, jqXHR) {
                                status = status & true;
                            }, error: function (jqXHR, textStatus, errorThrown) {
                                status = status & false;
                                swal({
                                    title: "Save NOT Success..",
                                    text: "Something Wrong In Server Side !!{code :OT-sv}",
                                    type: "error",
                                    confirmButtonClass: 'btn-danger',
                                    confirmButtonText: 'Close'
                                });
                            }
                        });
                    });
                    window.location = '<%=request.getContextPath()%>/dineininvoicepayment?t=${t}&head=${head}&tname=${tname}&quick=' + findGetParameter('quick')+'&orderid='+oid;
                }, error: function (jqXHR, textStatus, errorThrown) {
                    status = status & false;
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
        } else {
            window.location = '<%=request.getContextPath()%>/dineininvoicepayment?t=${t}&head=${head}&tname=${tname}&quick=' + findGetParameter('quick')+'&orderid='+oid;
        }
    };
    function saveOrdersFinish(print = 1) {
        var order = {};
        oid = 0;
        var status = true;
        if ($("#employeeName").attr('title') != '0') {
            order.employeeIdemployee = $("#employeeName").attr('title');
        }
        order.starttime = 0;
        if(${head}!==0){
            order.tableheadsIdtableheads = ${head};
        }
        order.locationIdlocation = ${sessionScope.get("LocationID")};
        order.usersIdusers = ${sessionScope.get("userid")};
        order.orderstatus = 1;
        if ($("#customerName").attr('title') !== '0') {
            order.customersIdcustomers = $("#customerName").attr('title');
        }
        if ($("#0").find('li').size() > 0) {
            $.ajax("<%=request.getContextPath()%>/tablesheadsorder/add", {
                type: 'POST',
                data: JSON.stringify(order),
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data, textStatus, jqXHR) {
                    oid = data.id;
                    $("#LastOrderID").val(oid);
                    status = status & true;
                    $("#0").find('li').each(function (ind, val) {
                        var ticket = {};
                        ticket.ticketype = 0;
                        ticket.tableheadsorderIdtableheadsorder = oid; //order head
                        ticket.menuitemIdmenuitem = parseInt($(val).attr('item'));
                        ticket.qty = parseFloat(parseFloat($(val).find('.qty').text()).toFixed(2));
                        ticket.freeqty = 0;
                        ticket.status = 1;
                        ticket.regdatetime = new Date().getTime();
                        $.ajax("<%=request.getContextPath()%>/tickets/add", {
                            type: 'POST',
                            data: JSON.stringify(ticket),
                            contentType: "application/json; charset=utf-8",
                            dataType: "json",
                            success: function (data, textStatus, jqXHR) {
                                status = status & true;
                            }, error: function (jqXHR, textStatus, errorThrown) {
                                status = status & false;
                                swal({
                                    title: "Save NOT Success..",
                                    text: "Something Wrong In Server Side !!{code :OT-sv}",
                                    type: "error",
                                    confirmButtonClass: 'btn-danger',
                                    confirmButtonText: 'Close'
                                });
                            }
                        });
                    });
                    if (print === 1) {
                        var e = document.createElement('a');
                        e.id = 'sendToiOS';
                        var strParams = "";
                        e.href = 'Print:KOT' + oid;
                        document.getElementsByTagName('body')[0].appendChild(e);
                        e.click();
                        e.parentNode.removeChild(e);
                    }
                    window.location = "<%=request.getContextPath()%>/tableslist?orderid="+oid;
                }, error: function (jqXHR, textStatus, errorThrown) {
                    status = status & false;
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
        } else {
            window.location = "<%=request.getContextPath()%>/tableslist?orderid=";
        }
    };
    function saveOrders(print = 1) {
        var order = {};
        oid = 0;
        var status = true;
        if ($("#employeeName").attr('title') != '0') {
            order.employeeIdemployee = $("#employeeName").attr('title');
        }
        order.starttime = 0;
        if(${head>0}){
        order.tableheadsIdtableheads = ${head};
         }
        order.locationIdlocation = ${sessionScope.get("LocationID")};
        order.usersIdusers = ${sessionScope.get("userid")};
        order.orderstatus = 1;
        if ($("#customerName").attr('title') !== '0') {
            order.customersIdcustomers = $("#customerName").attr('title');
        }
        if ($("#0").find('li').size() > 0) {
            $.ajax("<%=request.getContextPath()%>/tablesheadsorder/add", {
                type: 'POST',
                data: JSON.stringify(order),
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data, textStatus, jqXHR) {
                    oid = data.id;
                    $("#LastOrderID").val(oid);
                    status = status & true;
                    $("#0").find('li').each(function (ind, val) {
                        var ticket = {};
                        ticket.ticketype = 0;
                        ticket.tableheadsorderIdtableheadsorder = oid; //order head
                        ticket.menuitemIdmenuitem = parseInt($(val).attr('item'));
                        ticket.qty = parseFloat(parseFloat($(val).find('.qty').text()).toFixed(2));
                        ticket.freeqty = 0;
                        ticket.status = 1;
                        ticket.regdatetime = new Date().getTime();
                        $.ajax("<%=request.getContextPath()%>/tickets/add", {
                            type: 'POST',
                            data: JSON.stringify(ticket),
                            contentType: "application/json; charset=utf-8",
                            dataType: "json",
                            success: function (data, textStatus, jqXHR) {
                                status = status & true;
                            }, error: function (jqXHR, textStatus, errorThrown) {
                                status = status & false;
                                swal({
                                    title: "Save NOT Success..",
                                    text: "Something Wrong In Server Side !!{code :OT-sv}",
                                    type: "error",
                                    confirmButtonClass: 'btn-danger',
                                    confirmButtonText: 'Close'
                                });
                            }
                        });
                    });
                    if (print === 1) {
                        var e = document.createElement('a');
                        e.id = 'sendToiOS';
                        var strParams = "";
                        e.href = 'Print:KOT' + oid;
                        document.getElementsByTagName('body')[0].appendChild(e);
                        e.click();
                        e.parentNode.removeChild(e);
                    }
                    return true;
                }, error: function (jqXHR, textStatus, errorThrown) {
                    status = status & false;
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
        } else {
            return true;
        }
    }
    function loadSettle() {
        if (parseInt(findGetParameter('quick')) === 1) {
            if (saveOrders(0)) {
                var invoice = {};
                invoice.discount = $("#dis-amo").val();
                invoice.credit = $("#total").text();
                invoice.tender = $("#total").text();
                invoice.customer = $("#customerName").attr("title");
                invoice.employeeid = $("#employeeName").attr("title");
                $.ajax("<%=request.getContextPath()%>/tablesheadsorder/createMenuSalesInvoice", {
                    type: 'POST',
                    data: JSON.stringify(invoice),
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    success: function (data, textStatus, jqXHR) {
                        saveOrders(0);
//                        var e = document.createElement('a');
//                        e.id = 'sendToiOS';
//                        var strParams = "";
//                        e.href = 'Print:MENUINVOICE' + data.id;
//                        document.getElementsByTagName('body')[0].appendChild(e);
//                        e.click();
//                        e.parentNode.removeChild(e);
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
        } else {
            saveOrdersAndLoadSettle(0);
        }
    }

    function headSelected(tableId, headId, name, quick = 0) {
        if (quick === 0) {
            window.location = "<%=request.getContextPath()%>/dineininvoice?t=" + tableId + "&head=" + headId + "&tname=" + name + "&quick=" + quick;
        } else {
            window.location = "<%=request.getContextPath()%>/dineininvoice?t=" + 0 + "&head=" + 0 + "&tname=Quick&quick=" + quick;
        }
    }
</script>

<!-- Common Plugins -->
<script src="<c:url value="/assets/lib/pace/pace.min.js"/>"></script>
<script src="<c:url value="/assets/lib/jasny-bootstrap/js/jasny-bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/slimscroll/jquery.slimscroll.min.js"/>"></script>
<script src="<c:url value="/assets/lib/nano-scroll/jquery.nanoscroller.min.js"/>"></script>
<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>
<script src="<c:url value="/assets/js/custom.js"/>"></script>

</body>
</html>