<!DOCTYPE html>
<html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Demo: Take a Selfie With JavaScript</title>

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="<c:url value="/assets/css/stylesCamera.css"/>">

</head>
<body onload="openCamera();">
<h3>Take a Picture And Upload To Your Needed</h3>

<div class="container">
    <div class="row">
        <button href="#" id="start-camera" class="visible">Touch here to start the app.</button>
    </div>
    <div class="app">


        <video id="camera-stream"></video>
        <img id="snap">

        <p id="error-message"></p>

        <div class="controls">
            <a href="#" id="delete-photo" title="Delete Photo" class="disabled"><i class="material-icons">delete</i></a>
            <a href="#" id="take-photo" title="Take Photo"><i class="material-icons">camera_alt</i></a>
            <a href="#" id="download-photo" download="selfie.png" title="Save Photo" class="disabled"><i
                    class="material-icons">file_download</i></a>
        </div>

        <!-- Hidden canvas element. Used for taking snapshot of video. -->
        <canvas></canvas>

    </div>

</div>


<script src="<c:url value="/assets/js/scriptCamera.js"/>"></script>

</body>

</html>