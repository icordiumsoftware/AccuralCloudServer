<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<c:set var="baseURL" value="${pageContext.request.localName}"/>


<%
    try {
        if (!request.getSession().getAttribute("userid").equals(null)) {
            response.sendRedirect("/index.html");
        }
    } catch (NullPointerException e) {
    }
%>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FixedPlus - Bootstrap Admin Dashboard Template</title>

    <!-- Common Plugins -->
    <link href="<c:url value="/assets/lib/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<c:url value="/assets/lib/keybord/jqbtk.min.css"/>" rel="stylesheet" type="text/css"/>
    <!-- Custom Css-->
    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
        html, body {
            height: 100%;
        }
    </style>
</head>
<body class="bg-light  pace-done">
<div class="pace  pace-inactive">
    <div class="pace-progress" data-progress-text="100%" data-progress="99"
         style="transform: translate3d(100%, 0px, 0px);">
        <div class="pace-progress-inner"></div>
    </div>
    <div class="pace-activity"></div>
</div>

<div class="misc-wrapper">
    <div class="misc-content">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-4">
                    <div class="misc-header text-center">
                        <img alt="" src="<c:url value="/assets/img/icon.png"/>" class="logo-icon margin-r-10">
                        <img alt="" src="<c:url value="/assets/img/logo-dark.png"/>"
                             class="toggle-none hidden-xs">
                    </div>
                    <div class="misc-box">
                        <form role="form" action="users/userlogin" method="post">
                            <div class="form-group">
                                <label for="locations">Location</label>
                                <div class="group-icon">
                                    <select id="locations" name="LocationID" class="form-control" required="">
                                        <c:forEach items="${locations}" var="item">
                                            <option value="${item.idlocation}">${item.locationname}</option>
                                        </c:forEach>
                                    </select>
                                    <span class="text-muted icon-input"><i class="fa fa-map-marker"></i></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="Username">Username</label>
                                <div class="group-icon">
                                    <input id="Username" name="Username" type="text" placeholder="Username"
                                           class="keyboard form-control" required="">
                                    <span class="icon-user text-muted icon-input"></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="Password">Password</label>
                                <div class="group-icon">
                                    <input id="Password" type="password" name="Password"
                                           placeholder="Password" class="keyboard form-control">
                                    <span class="icon-lock text-muted icon-input"></span>
                                </div>
                            </div>
                            <div class="clearfix">
                                <div class="float-left">
                                    <div class="checkbox checkbox-primary margin-r-5">
                                        <input id="checkbox2" type="checkbox" checked="">
                                        <label for="checkbox2"> Remember Me </label>
                                    </div>
                                </div>
                                <div class="float-right">
                                    <button type="submit" class="btn btn-block btn-primary btn-rounded box-shadow">
                                        Login
                                    </button>
                                </div>
                            </div>
                            <hr>
                        </form>
                    </div>
                    <div class="text-center misc-footer">
                        <p>Copyright © Icordium Holdings</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        $('.keyboard').keyboard({type: 'numpad'});
    });


    //    $(document).ready(function () {
    //        $(function () {
    //            $('.keyboard').keyboard({
    //                layout:false,
    //                type:false,
    //                btnTpl:'<button type="button">',
    //                btnClasses:'btn btn-default',
    //                btnActiveClasses:'active btn-primary',
    //                initCaps:false,
    //                placement:'bottom'
    //            });
    //        });
    //    });
</script>
<!-- Common Plugins -->
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