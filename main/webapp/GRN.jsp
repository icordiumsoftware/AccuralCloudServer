<%-- 
    Document   : GRN
    Created on : Feb 27, 2019, 11:23:04 AM
    Author     : Charitha Prasad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Good Receive Note</title>
    <link href="<c:url value="/assets/lib/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <!-- Custom Css-->

    <link href="<c:url value="assets/lib/sweet-alerts2/sweetalert2.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="assets/css/style.css"/>" rel="stylesheet">
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
                                        <a class="clearfix" href="javascript:void(0);">
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

                                        <a class="clearfix" href="javascript:void(0);">
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
                        <a class="right-sidebar-toggle" href="javascript:void(0);"><i class="fa fa-align-right"></i></a>
                    </li>
                    <li class="dropdown avtar-dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <img alt="" class="rounded-circle" src="<c:url value="/assets/img/avtar-2.png"/>"
                                 width="30">
                            John Doe
                        </a>
                        <ul class="dropdown-menu top-dropdown">
                            <li>
                                <a class="dropdown-item" href="javascript:void(0);"><i class="icon-bell"></i>
                                    Activities</a>
                            </li>
                            <li>
                                <a class="dropdown-item" href="javascript:void(0);"><i class="icon-user"></i> Profile</a>
                            </li>
                            <li>
                                <a class="dropdown-item" href="javascript:void(0);"><i class="icon-settings"></i>
                                    Settings</a>
                            </li>
                            <li class="dropdown-divider"></li>
                            <li>
                                <a class="dropdown-item" href="javascript:void(0);"><i class="icon-logout"></i>
                                    Logout</a>
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
                        <ul class="list-unstyled sidebar-contact-list" style="overflow-y: auto; ">
                            <li class="clearfix" onclick="$(this).toggleClass('bg-dark')"
                                style="border: dashed gainsboro 2px;margin: 1px;">
                                <a class="media-box" href="#">
                                    <span class="media-box-body"><span class="media-box-heading">
                                        <strong>John Doe</strong><br><small class="text-muted">Designer</small>
                                    </span></span>
                                </a>
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
                            <input class="form-control dropdown margin-b-5" id="supplier" onchange="selectSupplier(this.value)" type="text"
                                   list="supliers" autocomplete="on" placeholder="Select Supplier"/>
                            <datalist id="supliers" ></datalist>
                            <button type="button" class="btn btn-info btn-icon" onclick="createGRN()"><i
                                    class="icon icon-plus"></i> Create GRN
                            </button>
                            <input type="hidden" id="grnHeader"/>
                            <input type="hidden" id="user" value="${sessionScope.get("userid")}"/>
                        </div>
                        <div class="col-lg-7 col-md-7">
                            <div class="form-group col-lg-9 col-md-8 float-right">
                                <label class="control-label">Select Draft GRN :</label>
                                <select class="form-control dropdown margin-b-5 m-b" id="drafts"
                                        onchange="loadGRNdraft()"></select>
                                <button type="button" class="btn btn-warning btn-icon" onclick=""><i
                                        class="icon icon-pencil" onclick="$('#grn_table').html('')"></i> Clear
                                </button>
                                <button type="button" class="btn btn-danger float-right btn-icon"
                                        onclick="deleteGRNdraft()"><i class="icon icon-trash"></i>Delete
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 row">
                        <div class="form-group col-lg-7 col-md-6 col-sm-10">
                            <label class="control-label">Product Name : </label>
                            <select class="form-control dropdown margin-b-5 m-b" onchange="selectProduct(this.value)">
                                <c:forEach items="${products}" var="pr">
                                    <option value="${pr.idproduct}">${pr.description}</option>
                                </c:forEach>
                            </select><!-- IShan said Product all load to select 2-->
                            <!--                                    <label class="control-label">Product Name : </label>
                                                                <input class="form-control" onchange="selectProduct(this.value)" type="text"  list="products" autocomplete="on" placeholder="Type Product Name " id="products_type" onkeyup="searchProducts()" />
                                                                <datalist id="products" ></datalist>-->
                        </div>
                        <div class="form-group col-lg-5 col-md-5 col-sm-10">
                            <label class="control-label">Location : </label>
                            <select class="form-control dropdown margin-b-5 m-b" id="loc">
                                <c:forEach items="${locations}" var="item">
                                    <option value="${item.idlocation}">${item.locationname}</option>
                                </c:forEach>
                            </select>
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
                                <th>Quantity</th>
                                <th>Total</th>
                                <th>Action</th>
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
                    <input type="hidden" id="pid"/>
                    <div class="col-lg-6">
                        <div class="form-group">
                            <div class="imagebox">
                                <img alt="Product Preview" src="/resource/images/product/d.png"
                                     class=" img-thumbnail img-circle" id="qty_image"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Quantity :</label>
                            <input type="number" class="form-control font-size-3 text-right" onchange="calValue()"
                                   onkeyup="calValue()" onfocus="$(this).select()" min="1" id="pqty"/>
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
                            <label class="form-control" id="qty_pname">(Empty)</label>
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
<!--------------------------------------->

<div class="modal fade modal-qty-update " tabindex="-1" role="dialog">
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
                    <input type="hidden" id="upid"/>
                    <input type="hidden" id="ugrpid"/>
                    <div class="col-lg-6">
                        <div class="form-group">
                            <div class="imagebox">
                                <img alt="Product Preview" src="/resource/images/product/d.png"
                                     class=" img-thumbnail img-circle" id="uqty_image"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Quantity :</label>
                            <input type="number" class="form-control font-size-3 text-right" min="1"
                                   onchange="ucalValue()" onkeyup="ucalValue()" onfocus="$(this).select()" id="upqty"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Discount :</label>
                            <div class="form-inline">
                                <!--<input type="number" class="form-control text-right font-size-3 col-5 number keyboard " min="0" max="100" id="dis" placeholder="%"  />-->
                                <input type="number" class="form-control text-right font-size-3 col-6 number keyboard "
                                       min="0" onchange="ucalValue()" onkeyup="ucalValue()" onfocus="$(this).select()"
                                       value="0" id="udis-amo" placeholder="amount" style="margin-left: 10px;"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Net Value</label>
                            <label class="form-control" id="uqty_nvalue">0.00</label>
                        </div>
                    </div>
                    <!---------------------------------------------->
                    <div class="col-lg-6">
                        <div class="form-group">
                            <label class="control-label">Name</label>
                            <label class="form-control" id="uqty_pname">(Empty)</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Cost Price</label>
                            <label class="form-control" id="uqty_costp"> 0.00 LKR</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Retail Price</label>
                            <label class="form-control" id="uqty_retailp">0.00 LKR</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Whole Sale Price</label>
                            <label class="form-control" id="uqty_wholesp">0.00 LKR</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Gross Value</label>
                            <label class="form-control" id="uqty_gvalue">0.00</label>
                        </div>
                    </div>

                    <!---------------------------------------------->
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal"
                        onclick="addToTable($('#ugrpid').val())">Add TO Table
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
<script src="<c:url value="/assets/lib/pace/pace.min.js"/>"></script>
<script src="<c:url value="/assets/lib/jasny-bootstrap/js/jasny-bootstrap.min.js"/>"></script>
<script src="<c:url value="/assets/lib/slimscroll/jquery.slimscroll.min.js"/>"></script>
<script src="<c:url value="/assets/lib/nano-scroll/jquery.nanoscroller.min.js"/>"></script>
<script src="<c:url value="/assets/lib/metisMenu/metisMenu.min.js"/>"></script>
<script src="<c:url value="/assets/lib/sweet-alerts2/sweetalert2.min.js"/>"></script>
<script src="<c:url value="/assets/js/custom.js"/>"></script>
<script type="text/javascript">
    $(function () {
        loadSupplier();
        loadGRNS();
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
    //@para pname;
    //default 0;
    function selectProduct(pname = 0 ) {
        var id = pname;
        if (id != 0) {
            $.ajaxSetup({cache: false});
            $.getJSON('<%=request.getContextPath()%>/producthistory/location/<%= session.getAttribute("LocationID").toString()%>/product/' + pname, function (data) {
                var rowO = "";
                if (data.length === 0) {
                    rowO += "<tr id='" + pname + "'> <td></td> <td>0</td> <td>0</td> <td>0</td>";
                    rowO += "<td> <button data-dismiss='modal' class='btn btn-icon btn-info' onclick='showQty(this, " + pname + ")' ><i class='icon icon-cursor'></i>Select</button></td> </tr>";
                    $("#fifo_table").html(rowO);
                    $("#fifo_table").find('button').click();
                } else {
                    $.each(data, function (i, val) {
                        rowO += "<tr id='" + pname + "'> <td>" + val.description + "</td> <td>" + val.costprice + "</td> <td>" + val.retailprice + "</td> <td>" + val.wholsaleprice + "</td>";
                        rowO += "<td> <button data-dismiss='modal' class='btn btn-icon btn-info' onclick='showQty(this, " + pname + ")' ><i class='icon icon-cursor'></i>Select</button></td> </tr>";
                    });
                    $("#fifo_table").html(rowO);
                    $('.modal-fifo').modal('show');
                }
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
    function selectSupplier(sname) {
        $('#supliers').find('option').each(function (i, ele) {
            if ($(ele).text() === sname) {
                $('#supplier').attr('sid', this.id);
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
            $("#pid").val(pid);
            $("#qty_pname").text(data.description);
            $("#qty_image").attr('src', data.icon);
            $("#qty_costp").text($($(elem).parents('tr').find('td').toArray()[1]).text());
            $("#qty_retailp").text($($(elem).parents('tr').find('td').toArray()[2]).text());
            $("#qty_wholesp").text($($(elem).parents('tr').find('td').toArray()[3]).text());
            $("#pqty").val(1);
            calValue();
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
    function ushowQty(elem, pid) {
        $.getJSON('<%=request.getContextPath()%>/products/find/' + pid, function (data) {
            $("#upid").val(pid);
            $("#uqty_pname").text(data.description);
            $("#uqty_image").attr('src', data.icon);
            $("#uqty_costp").text($($(elem).find('td').toArray()[2]).text());
            $("#uqty_retailp").text($($(elem).find('td').toArray()[3]).text());
            $("#uqty_wholesp").text($($(elem).find('td').toArray()[4]).text());
            $("#udis-amo").val(parseFloat($($(elem).find('td').toArray()[5]).text()));
            $("#upqty").val(parseFloat($($(elem).find('td').toArray()[6]).text()));
            $("#ugrpid").val($(elem).attr('id'));
            ucalValue();
            $('.modal-qty-update').modal('show');
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
    function searchProducts() {
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/product/all', function (data) {
            $('#products').html('');
            $.each(data, function (i, val) {
                $('#products').append("<option id='" + val.idproduct + "' >" + val.Description + "</option>");
            });
        }).error(function () {
            swal({
                title: "Product's Lording Error..",
                text: "Something Wrong In Server Side !!{code :Sup-Lod}",
                type: "error",
                confirmButtonClass: 'btn-danger',
                confirmButtonText: 'Close'
            });
        });
    }
    function loadGRNS() {
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/grnhedders/active/0', function (data) {
            $('#drafts').html('');
            $.each(data, function (i, val) {
                $('#drafts').append("<option id='" + val.idgoodrevicehedder + "' >" + val.idgoodrevicehedder + "</option>");
            });
        }).error(function () {
            swal({
                title: "GRN'S Lording Error..",
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
    function ucalValue() {
        var fullValue = parseFloat($("#uqty_retailp").text()) * parseFloat($("#upqty").val());
        $('#uqty_nvalue').text(fullValue - parseFloat($("#udis-amo").val()));
        $('#uqty_gvalue').text(fullValue);
    }
    function addToTable(update = 0) {
        if (parseInt($('#grnHeader').val()) > 0 && parseInt($('#grnHeader').val()) !== undefined && parseInt($("#pid").val()) !== undefined) {
            var ob = {};
            ob.productIdproduct = parseInt($("#pid").val());
            ob.qty = $("#qty").val();
            ob.freeqty = 0;
            ob.costpriice = $("#qty_costp").text();
            ob.retailprice = $("#qty_retailp").text();
            ob.wholesaleprice = $("#qty_wholesp").text();
            ob.discountval = $("#dis-amo").val();
            ob.costamount = $("#qty_gvalue").text();
            ob.goodrevicehedderIdgoodrevicehedder = parseInt($('#grnHeader').val());
            var path = "";
            var meth = "";
            if (update === 0) {
                path = "/grnproducts/add";
                meth = "POST";
            } else {
                path = "/grnproducts/update";
                ob.idgoodrecivedataproduct = update;
                meth = "PUT";
            }
            $.ajax("<%=request.getContextPath()%>" + path, {
                type: meth,
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                data: JSON.stringify(ob),
                success: function (data, textStatus, jqXHR) {
                    $('#modal-fifo').modal('hide');
                    $('#modal-qty').modal('hide');
                    if (update !== 0) {
                        $('#grn_table').find("tr[id='" + update + "']").remove();
                    }
                    var txt = "";
                    txt += "<tr id='" + data.id + "' > <td>" + $("#pid").val() + "</td> <td>" + $("#qty_pname").text() + "</td><td>" + $("#qty_costp").text() + "</td> <td>" + $("#qty_retailp").text() + "</td><td>" + $("#qty_wholesp").text() + "</td> <td> " + $("#dis-amo").val() + "</td> <td> " + $("#pqty").val() + "</td><td>" + $("#qty_gvalue").text() + "</td>";
                    txt += "<td><button type='button' class='btn btn-info float-right btn-icon' onclick='ushowQty($(this).parents(\"tr\"), " + $("#pid").val() + ")' ><i class='icon icon-pencil'></i>Edit</button>";
                    txt += " <button type='button' class='btn btn-danger float-right btn-icon' onclick='deleteGRNItem(" + data.id + ")' ><i class='icon icon-trash' ></i>Delete</button></td></tr>";
                    $('#grn_table').append(txt);
                }, error: function (jqXHR, textStatus, errorThrown) {
                    $('#modal-fifo').modal('hide');
                    swal({
                        title: "GRN Item Save NOT Success..",
                        text: "Something Wrong In Server Side !!{code :OT-sv}",
                        type: "error",
                        confirmButtonClass: 'btn-danger',
                        confirmButtonText: 'Close'
                    });
                }
            });
        } else {
            $('#modal-fifo').hide();
            swal({
                title: "'Click' Create GRN First..",
                text: "Some Steps Missed..!!!{PID:check}",
                type: "warning",
                confirmButtonClass: 'btn-warning',
                confirmButtonText: 'Close'
            });
        }

    }
    function createGRN() {
        if (parseInt($("#supplier").attr('sid')) > 0 && $("#supplier").attr('sid') !== undefined) {
            var ob = {};
            ob.supplierIdsupplier = $("#supplier").attr('sid');
            ob.locationIdlocation = $("#loc").val();
            ob.costamount = 0;
            ob.retailamount = 0;
            ob.wholesaleamount = 0;
            ob.status = 0;
            ob.usersIdusers = $("#user").val();
            $.ajax("<%=request.getContextPath()%>/grnhedders/add", {
                type: 'POST',
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                data: JSON.stringify(ob),
                success: function (data, textStatus, jqXHR) {
                    $('#grnHeader').val(data.id);
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
        } else {
            swal({
                title: "Select Suplier First..",
                text: "Some Steps Missed..!!!{PID:check}",
                type: "warning",
                confirmButtonClass: 'btn-warning',
                confirmButtonText: 'Close'
            });
        }
    }
    function deleteGRNdraft() {
        if (parseInt($("#drafts").val()) > 0 && $("#drafts").val() !== undefined) {
            $.ajax("<%=request.getContextPath()%>/grnhedders/delete/" + parseInt($("#drafts").val()), {
                type: 'POST',
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data, textStatus, jqXHR) {
                    swal({
                        title: "GRN Draft Delete  Success..",
                        text: "Draft Has Been Removed Successfully..",
                        type: "success",
                        confirmButtonClass: 'btn-success',
                        confirmButtonText: 'Ok'
                    });
                }, error: function (jqXHR, textStatus, errorThrown) {
                    swal({
                        title: "GRN Draft Delete NOT Success..",
                        text: "Something Wrong In Server Side !!{code :OT-sv}",
                        type: "error",
                        confirmButtonClass: 'btn-danger',
                        confirmButtonText: 'Close'
                    });
                }
            });
        } else {
            swal({
                title: "Select Draft First..",
                text: "Some Steps Missed..!!!{PID:check}",
                type: "warning",
                confirmButtonClass: 'btn-warning',
                confirmButtonText: 'Close'
            });
        }
    }
    function loadGRNdraft() {
        if (parseInt($("#drafts").val()) > 0 && $("#drafts").val() !== undefined) {
            $.ajax("<%=request.getContextPath()%>/grnproducts/bygrnid/" + parseInt($("#drafts").val()), {
                type: 'GET',
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data, textStatus, jqXHR) {
                    $('#grn_table').html("");
                    $('#grnHeader').val(data.goodrevicehedderIdgoodrevicehedder);
                    $.each(data, function (index, val) {
                        var txt = "";
                        txt += "<tr id='" + val.idgoodrecivedataproduct + "' > <td>" + val.productIdproduct + "</td> <td>NO-DATA</td><td>" + val.costpriice + "</td> <td>" + val.retailprice + "</td><td>" + val.wholesaleprice + "</td> <td> " + val.costamount + "</td> <td> " + val.qty + "</td><td>" + (val.discountval - val.costpriice) + "</td>";
                        txt += "<td><button type='button' class='btn btn-info float-right btn-icon' onclick='ushowQty($(this).parents(\"tr\"), " + val.productIdproduct + ")' ><i class='icon icon-pencil'></i>Edit</button>";
                        txt += " <button type='button' class='btn btn-danger float-right btn-icon' onclick='deleteGRNItem(" + val.idgoodrecivedataproduct + ")' ><i class='icon icon-trash' ></i>Delete</button></td></tr>";
                        $('#grn_table').append(txt);
                    });
                }, error: function (jqXHR, textStatus, errorThrown) {
                    swal({
                        title: "GRN Draft Load NOT Success..",
                        text: "Something Wrong In Server Side !!{code :OT-sv}",
                        type: "error",
                        confirmButtonClass: 'btn-danger',
                        confirmButtonText: 'Close'
                    });
                }
            });
        } else {
            swal({
                title: "Select Draft First..",
                text: "Some Steps Missed..!!!{PID:check}",
                type: "warning",
                confirmButtonClass: 'btn-warning',
                confirmButtonText: 'Close'
            });
        }
    }
    function deleteGRNItem(val) {
        if (parseInt(val) > 0 && val !== undefined) {
            $.ajax("<%=request.getContextPath()%>/grnhedders/delete/" + parseInt(val), {
                type: 'POST',
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data, textStatus, jqXHR) {
                    $('#grn_table').find("tr[id='" + val + "']").remove();
                    swal({
                        title: "GRN Item Delete  Success..",
                        text: "Draft Has Been Removed Successfully..",
                        type: "success",
                        confirmButtonClass: 'btn-success',
                        confirmButtonText: 'Ok'
                    });
                }, error: function (jqXHR, textStatus, errorThrown) {
                    swal({
                        title: "GRN Item Delete NOT Success..",
                        text: "Something Wrong In Server Side !!{code :OT-sv}",
                        type: "error",
                        confirmButtonClass: 'btn-danger',
                        confirmButtonText: 'Close'
                    });
                }
            });
        }
    }
    function loadPendingOrders(parent) {
        $.ajaxSetup({cache: false});
        $.getJSON('<%=request.getContextPath()%>/grnhedders/active/0', function (data) {
            $('#drafts').html('');
            $.each(data, function (i, val) {
                $('#drafts').append("<option id='" + val.idgoodrevicehedder + "' >" + val.idgoodrevicehedder + "</option>");
            });
        }).error(function () {
            swal({
                title: "GRN'S Lording Error..",
                text: "Something Wrong In Server Side !!{code :Sup-Lod}",
                type: "error",
                confirmButtonClass: 'btn-danger',
                confirmButtonText: 'Close'
            });
        });
    }
</script>
</body>
</html>
