<%-- 
    Document   : GRN
    Created on : Feb 27, 2019, 11:23:04 AM
    Author     : Charitha Prasad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Good Transfer Note</title>
    <link href="<c:url value="/assets/lib/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <!-- Custom Css-->
    <link href="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet">
    <style type="text/css">
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
<div class="main-sidebar-nav default-navigation" style="min-height: 100vh;">
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
        </div>
    </div>
</div>
<!-- ============================================================== -->
<!-- 						Navigation End	    -->
<!-- ============================================================== -->


<!-- ============================================================== -->
<!-- 						Content Start	    -->
<!-- ============================================================== -->

<section class="main-content">
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-header">
                    <header class="h4">Good Receive Note</header>
                </div>
                <div class="card-body col-12">
                    <div class="col-12 row">
                        <div class="form-group col-lg-5 col-md-5">
                            <label class="control-label">Select Supplier :</label>
                            <input class="form-control margin-b-5 m-b" id="supplier"
                                   onchange="selectSupplier(this.value)" type="text" list="supliers" autocomplete="on"
                                   placeholder="Select Supplier"/>
                            <datalist id="supliers"></datalist>
                            <button type="button" class="btn btn-info btn-icon" onclick="createGRN()"><i
                                    class="icon icon-plus"></i> Create GRN
                            </button>
                            <input type="hidden" id="grnHeader"/>
                            <input type="hidden" id="user" value="${sessionScope.get("employeeId")}"/>
                        </div>
                        <div class="col-lg-7 col-md-7">
                            <div class="form-group col-lg-9 col-md-8 float-right">
                                <label class="control-label">Select Draft GRN :</label>
                                <select class="form-control dropdown margin-b-5 m-b"></select>
                                <button type="button" class="btn btn-warning btn-icon" onclick=""><i
                                        class="icon icon-pencil"></i> Clear
                                </button>
                                <button type="button" class="btn btn-danger float-right btn-icon" onclick=""><i
                                        class="icon icon-trash"></i>Delete
                                </button>
                            </div>
                        </div>
                    </div>
                    <div id="grnContent">
                        <div class="col-12 row">
                            <div class="form-group col-lg-6 col-md-6 col-sm-12">
                                <label class="control-label">From Location : </label>
                                <select class="form-control dropdown margin-b-5 m-b" id="floc">
                                    <option value="<%= session.getAttribute("LocationID").toString()%>"><%= session.getAttribute("Location").toString()%>
                                    </option>
                                </select>
                            </div>
                            <div class="form-group col-lg-6 col-md-6 col-sm-12">
                                <label class="control-label">To Location : </label>
                                <select class="form-control dropdown margin-b-5 m-b" id="tloc">
                                    <c:forEach items="${locations}" var="item">
                                        <option value="${item.idlocation}">${item.locationname}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="col-12 row">
                            <div class="form-group col-lg-7 col-md-6 col-sm-10">
                                <label class="control-label">Product Name : </label>
                                <select class="form-control dropdown margin-b-5 m-b"
                                        onchange="selectProduct(this.value)">
                                    <c:forEach items="${products}" var="pr">
                                        <option value="${pr.idproduct}">${pr.description}</option>
                                    </c:forEach>
                                </select><!-- IShan said Product all load to select 2-->
                                <!--                                    <input class="form-control" onchange="selectProduct(this.value)" type="text"  list="products" autocomplete="on" placeholder="Type Product Name " id="products_type" onkeyup="searchProducts()" />
                                                                    <datalist id="products" ></datalist>-->
                            </div>
                        </div>
                        <hr/>
                        <div class="col-12 row">
                            <table class="table  table-bordered col-12">
                                <thead>
                                <tr>
                                    <th>PID</th>
                                    <th>Name</th>
                                    <th>Cost Price</th>
                                    <th>Retail Price</th>
                                    <th>Whole Sale Price</th>
                                    <th>Discount</th>
                                    <th>Total</th>
                                    <th>Actions</th>
                                </tr>
                                </thead>
                                <tbody id="grn_table"></tbody>
                            </table>
                        </div>
                        <div class="col-12  row">
                            <button type="button" class="btn btn-success btn-icon "><i class="icon icon-direction"></i>Generate
                                GRN
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
<!-- 						Content End	    -->
<!-- ============================================================== -->

<div class="modal fade modal-fifo " tabindex="-1" role="dialog" aria-labelledby="myDefaultModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                  class="fa fa-times"></span>
                </button>
                <h5 class="modal-title">Select Item</h5>
            </div>
            <div class="modal-body">
                <div class="row col-12">
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>Description</th>
                            <th>Cost</th>
                            <th>Retail</th>
                            <th>Whole Sale</th>
                            <th>Stock</th>
                            <th>Action</th>
                        </tr>
                        </thead>
                        <tbody id="fifo_table"></tbody>
                    </table>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade modal-qty " tabindex="-1" role="dialog">
    <div class="modal-dialog modal-lg " role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true"
                                                                                                  class="fa fa-times"></span>
                </button>
            </div>
            <div class="modal-body">
                <div class="row col-12">
                    <!---------------------------------------------->
                    <div class="col-lg-6">
                        <div class="form-group">
                            <div class="imagebox">
                                <img alt="Product Preview" src="../resource/images/product/d.png"
                                     class=" img-thumbnail img-circle" id="qty_image"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Quantity :</label>
                            <input type="number" class="form-control font-size-3 text-right" min="1"
                                   onchange="calValue()" onkeyup="calValue()" id="pqty" onfocus="$(this).select()"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Discount :</label>
                            <div class="form-inline">
                                <!--<input type="number" class="form-control text-right font-size-3 col-5 number keyboard " min="0" max="100" id="dis" placeholder="%"  />-->
                                <input type="number" class="form-control text-right font-size-3 col-6 number keyboard "
                                       min="0" onchange="calValue()" onkeyup="calValue()" onfocus="$(this).select()"
                                       value="0" id="dis-amo" placeholder="amount" style="margin-left: 10px;"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Net Value</label>
                            <label class="form-control" id="qty_nvalue">0.00</label>
                        </div>
                    </div>
                    <!---------------------------------------------->
                    <div class="col-lg-6">
                        <div class="form-group">
                            <label class="control-label">Name</label>
                            <label class="form-control" id="qty_pname">Extra Special 180ml</label>
                            <hidden id="pid"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Cost Price</label>
                            <label class="form-control" id="qty_costp"> 0.00 LKR</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Retail Price</label>
                            <label class="form-control" id="qty_retailp">0.00 LKR</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Whole Sale Price</label>
                            <label class="form-control" id="qty_wholesp">0.00 LKR</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Gross Value</label>
                            <label class="form-control" id="qty_gvalue">0.00</label>
                        </div>
                    </div>

                    <!---------------------------------------------->
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal" onclick="addToTable()">Add TO Table
                </button>
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>


<script src="<c:url value="/assets/lib/jquery/dist/jquery.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/popper.min.js"/>"></script>
<script src="<c:url value="/assets/lib/bootstrap/js/bootstrap.min.js"/>"></script>
<!-- Common Plugins -->
<!--<script src="../assets/lib/keybord/jqbtk.min.js" type="text/javascript"></script>-->
<script src="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/assets/lib/pace/pace.min.js"/>"></script>
<script src="<c:url value="/assets/lib/jasny-bootstrap/js/jasny-bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/slimscroll/jquery.slimscroll.min.js"/>"></script>
<script src="<c:url value="/assets/lib/nano-scroll/jquery.nanoscroller.min.js"/>"></script>
<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>
<script src="<c:url value="/assets/js/custom.js"/>"></script>
<script type="text/javascript">
    $(function () {
        loadSupplier();
        $('input[type="number"]').keydown(function (evt) {
            var maxv = $(this).attr('max');
            if (parseFloat($(this).val()) > parseFloat(maxv)) {
                $(this).keypress(function () {
                    preventDefault();
                });
                evt.preventDefault();
            }
        });
    });
    function selectProduct(pname = 0) {
        var id = pname;
//                                            $('#products').find('option').each(function () {
//                                                if (pname === this.value) {
//                                                    id = $(this).attr('id');
//                                                }
//                                            });
        if (id != 0) {
            $.ajaxSetup({cache: false});
            $.getJSON('<%=request.getContextPath()%>/producthistory/location/<%= session.getAttribute("LocationID").toString()%>/product/' + pname, function (data) {
                var rowO = "";
                $.each(data, function (i, val) {
                    rowO += "<tr id='" + pname + "'> <td>" + val.description + "</td> <td>" + val.costprice + "</td> <td>" + val.retailprice + "</td> <td>" + val.wholsaleprice + "</td> <td>20</td>";
                    rowO += "<td> <button class='btn btn-icon btn-info' onclick='showQty(this, " + pname + ")' ><i class='icon icon-cursor'></i>Select</button></td> </tr>";
                });
                $("#fifo_table").html(rowO);
//                                                    if (data.status) {
//
//                                                    } else {
//                                                        showQty();
//                                                    }
                $('.modal-fifo').modal('show');
            }).error(function () {
                swal({
                    title: "Fifo Check NOT Success..",
                    text: "Something Wrong In Server Side !!{code :Fi-CHK}",
                    type: "error",
                    confirmButtonClass: 'btn-danger',
                    confirmButtonText: 'Close'
                });
            });
        }
    }
    function selectSupplier(val) {
        $('#supliers').find('option').each(function (i, ele) {
            if ($(ele).text() === val) {
                $('#suplier').val(this.id);
            }
        });
    }
    function loadSupplier(sname) {
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/suppliers/all', function (data) {
            $('#supliers').html('');
            $.each(data, function (i, val) {
                $('#supliers').append("<option id='" + val.idsupplier + "' >" + val.suppliername + "<option>");
            });
        }).error(function () {
            swal({
                title: "Supplier's Lording Error..",
                text: "Something Wrong In Server Side !!{code :Sup-Lod}",
                type: "error",
                confirmButtonClass: 'btn-danger',
                confirmButtonText: 'Close'
            });
        });
    }
    function showQty(elem, pid) {
        $.getJSON('<%=request.getContextPath()%>/products/find/' + pid, function (data) {
            $("#qty_pname").text(data.description);
            $("#pid").val(pid);
            $("#pqty").attr('max', $($(elem).parents('tr').find('td').toArray()[4]).text());
            $("#qty_image").attr('src', data.icon);
            $("#qty_costp").text($($(elem).parents('tr').find('td').toArray()[1]).text());
            $("#qty_retailp").text($($(elem).parents('tr').find('td').toArray()[2]).text());
            $("#qty_wholesp").text($($(elem).parents('tr').find('td').toArray()[3]).text());
            $("#pqty").val(1);
            calValue();
//                                                $("#qty_value").text(0.00);
            $('.modal-qty').modal('show');
        }).error(function () {
            swal({
                title: "Prosuct info Lording Error..",
                text: "Something Wrong In Server Side !!{code :Sup-Lod}",
                type: "error",
                confirmButtonClass: 'btn-danger',
                confirmButtonText: 'Close'
            });
        });
    }
    function calValue() {
        var fullValue = parseFloat($("#qty_retailp").text()) * parseFloat($("#pqty").val());
        $('#qty_nvalue').text(fullValue - parseFloat($("#dis-amo").val()));
        $('#qty_gvalue').text(fullValue);
    }
    function addToTable() {
        var ob = {};
        ob.productIdproduct = $("#pid").val();
        ob.qty = $("#qty").val();
        ob.freeqty = 0;
        ob.costpriice = $("#qty_costp").text();
        ob.retailprice = $("#qty_retailp").text();
        ob.wholesaleprice = $("#qty_wholesp").text();
        ob.discountval = $("#dis-amo").val();
        ob.costamount = $("#qty_gvalue").text();
        ob.goodrevicehedderIdgoodrevicehedder = $('#grnHeader').val();
        $.ajax("<%=request.getContextPath()%>/locationtranferdataproduct/add", {
            type: 'POST',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: JSON.stringify(),
            success: function (data, textStatus, jqXHR) {
                $('#modal-fifo').modal('hide');
                $('#modal-qty').modal('hide');
                var txt = "";
                txt += "<tr> <td>" + $("#pid").val() + "</td> <td>" + $("#qty_pname").text() + "</td><td>" + $("#qty_costp").text() + "</td> <td>" + $("#qty_retailp").text() + "</td><td>" + $("#qty_wholesp").text() + "</td> <td> " + $("#dis-amo").val() + "</td><td>" + $("#qty_gvalue").text() + "</td></tr>";
                $('#grn_table').append(txt);
            }, error: function (jqXHR, textStatus, errorThrown) {
                swal({
                    title: "GRN Item Save NOT Success..",
                    text: "Something Wrong In Server Side !!{code :OT-sv}",
                    type: "error",
                    confirmButtonClass: 'btn-danger',
                    confirmButtonText: 'Close'
                });
            }
        });
    }
    function createGRN() {
        var ob = {};
        ob.supplierIdsupplier = $("#supplier").val();
        ob.costamount = 0;
        ob.retailamount = 0;
        ob.wholesaleamount = 0;
        ob.fromlocation = <%= session.getAttribute("LocationID").toString()%>;
        ob.tolocation = $("#tloc").val();
        ob.usersIdusers = $("#user").val();
        $.ajax("<%=request.getContextPath()%>/locationtranferhedder/add", {
            type: 'POST',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: JSON.stringify(ob),
            success: function (data, textStatus, jqXHR) {
                $('#grnHeader').val(data);
            }, error: function (jqXHR, textStatus, errorThrown) {
                swal({
                    title: "GRN Header Create NOT Success..",
                    text: "Something Wrong In Server Side !!{code :OT-sv}",
                    type: "error",
                    confirmButtonClass: 'btn-danger',
                    confirmButtonText: 'Close'
                });
            }
        });
    }
</script>
</body>
</html>
