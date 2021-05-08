<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MeetSafe</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/fontawesome/css/all.min.css"> <!-- https://fontawesome.com/ -->
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap" rel="stylesheet"> <!-- https://fonts.google.com/ -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/templatemo-xtra-blog.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all">
    <!--

    TemplateMo 553 Xtra Blog

    https://templatemo.com/tm-553-xtra-blog

    -->
</head>
<body>
<header class="tm-header" id="tm-header">
    <div class="tm-header-wrapper">
        <button class="navbar-toggler" type="button" aria-label="Toggle navigation">
            <i class="fas fa-bars"></i>
        </button>
        <div class="tm-site-header">
            <div class="mb-3 mx-auto tm-site-logo"><i class="fas fa-times fa-2x"></i></div>
            <h1 class="text-center">MeetSafe</h1>
        </div>
        <nav class="tm-nav" id="tm-nav">
            <ul>
                <li class="tm-nav-item"><a href="${pageContext.request.contextPath}/system/goMain" class="tm-nav-link">
                    <i class="fas fa-home"></i>
                    Activity Square
                </a></li>
                <li class="tm-nav-item"><a href="${pageContext.request.contextPath}/system/location" class="tm-nav-link">
                    <i class="fas fa-pen"></i>
                    Location
                </a></li>
                <li class="tm-nav-item"><a href="${pageContext.request.contextPath}/system/myactivity" class="tm-nav-link">
                    <i class="fas fa-users"></i>
                    My Activity
                </a></li>
                <li class="tm-nav-item active"><a href="${pageContext.request.contextPath}/system/myprofile" class="tm-nav-link">
                    <i class="far fa-comments"></i>
                    My Profile
                </a></li>
            </ul>
        </nav>
        <div class="tm-mb-65">
            <a rel="nofollow" href="https://fb.com/templatemo" class="tm-social-link">
                <i class="fab fa-facebook tm-social-icon"></i>
            </a>
            <a href="https://twitter.com" class="tm-social-link">
                <i class="fab fa-twitter tm-social-icon"></i>
            </a>
            <a href="https://instagram.com" class="tm-social-link">
                <i class="fab fa-instagram tm-social-icon"></i>
            </a>
            <a href="https://linkedin.com" class="tm-social-link">
                <i class="fab fa-linkedin tm-social-icon"></i>
            </a>
        </div>
        <p class="tm-mb-80 pr-5 text-white">
            MeetSafe is website to helo students organize and join activities.
        </p>
    </div>
</header>
<div class="container-fluid">
    <main class="tm-main">
        <!-- Search form -->
        <div class="row tm-row tm-mb-45">
            <div class="col-12">
                <hr class="tm-hr-primary tm-mb-55">
            </div>
        </div>
        <div class="row tm-row tm-mb-120">
            <div class="col-12">
                <h2 class="tm-color-primary tm-post-title tm-mb-60">My Profile</h2>
            </div>
            <figure class="col-8 tm-comment-figure">
                <img id="add-portrait" src="${pageContext.request.contextPath}/static/images/comment-2.jpg" alt="Image" class="mb-2 rounded-circle img-thumbnail">
            </figure>

            <!-- 头像信息表单 -->

        </div>
        <button type="button" class="layui-btn" id="uploadPhoto">
            <i class="layui-icon">&#xe67c;</i>Upload Photo
        </button>
            <div class="col-lg-6 tm-contact-right">
                <form method="POST" action="" class="mb-5 ml-auto mr-0 tm-contact-form">
                    <div class="form-group row mb-4">
                        <label for="name" class="col-sm-3 col-form-label text-right tm-color-primary">Name</label>
                        <div class="col-sm-9">
                            <input class="form-control mr-0 ml-auto" name="name" id="name" type="text" required value=${userInfo.name}>
                        </div>
                    </div>
                    <div class="form-group row mb-4">
                        <label for="password" class="col-sm-3 col-form-label text-right tm-color-primary" >Password</label>
                        <div class="col-sm-9">
                            <input class="form-control mr-0 ml-auto" name="password" id="password" type="password" required value=${userInfo.password}>
                        </div>
                    </div>
                    <div class="form-group row mb-4">
                        <label for="email" class="col-sm-3 col-form-label text-right tm-color-primary">Email</label>
                        <div class="col-sm-9">
                            <input class="form-control mr-0 ml-auto" name="email" id="email" type="email" required value=${userInfo.email}>
                        </div>
                    </div>
<%--                    <div class="form-group row mb-4">--%>
<%--                        <label for="subject" class="col-sm-3 col-form-label text-right tm-color-primary">Gender</label>--%>
<%--                        <div class="layui-input-inline" style="width: 350px;">--%>
<%--                            <input type="radio" id="male" name="userType" title="Male"  checked="" >--%>
<%--                            <label for="male">Male</label>--%>
<%--                            <input type="radio" id="female" name="userType" title="Female"  >--%>
<%--                            <label for="female">FeMale</label><br>--%>
<%--                        </div>--%>
<%--                    </div>--%>
                    <div class="form-group row text-right">
                        <div class="col-12">
                            <button class="tm-btn tm-btn-primary tm-btn-small" onclick="UpdateProfile()">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        <button type="button" class="layui-btn" id="UploadHealthInfo">
            <i class="layui-icon">&#xe67c;</i>Upload Health
        </button>
            <div class="col-lg-6 tm-contact-right">
                <address class="mb-4 tm-color-gray">
                    120 Lorem ipsum dolor sit amet,
                    consectetur adipiscing 10550
                </address>
                <span class="d-block">
                        Tel:
                        <a href="tel:060-070-0980" class="tm-color-gray">060-070-0980</a>
                    </span>
                <span class="mb-4 d-block">
                        Email:
                        <a href="mailto:info@company.com" class="tm-color-gray">info@company.com</a>
                    </span>
                <p class="mb-5 tm-line-height-short">
                    Maecenas eu mi eu dui cursus
                    consequat non eu metus. Morbi ac
                    turpis eleifend, commodo purus
                    eget, commodo mauris.
                </p>
                <ul class="tm-social-links">
                    <li class="mb-2">
                        <a href="https://facebook.com" class="d-flex align-items-center justify-content-center">
                            <i class="fab fa-facebook"></i>
                        </a>
                    </li>
                    <li class="mb-2">
                        <a href="https://twitter.com" class="d-flex align-items-center justify-content-center">
                            <i class="fab fa-twitter"></i>
                        </a>
                    </li>
                    <li class="mb-2">
                        <a href="https://youtube.com" class="d-flex align-items-center justify-content-center">
                            <i class="fab fa-youtube"></i>
                        </a>
                    </li>
                    <li class="mb-2">
                        <a href="https://instagram.com" class="d-flex align-items-center justify-content-center mr-0">
                            <i class="fab fa-instagram"></i>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <footer class="row tm-row">
            <div class="col-md-6 col-12 tm-color-gray">
                Design: <a rel="nofollow" target="_parent" href="https://templatemo.com" class="tm-external-link">TemplateMo</a>
            </div>
            <div class="col-md-6 col-12 tm-color-gray tm-copyright">
                Copyright 2020 Xtra Blog Company Co. Ltd.
            </div>
        </footer>
    </main>
</div>
<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/templatemo-script.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.10.2.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery-2.14.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/photoswipe.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/photoswipe-ui-default.min.js"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
<script>
    function UpdateProfile(){
        var formData = {
            name: $("name").val(),
            password: $("password").val(),
            email: $("eamil").val(),
        };

        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/student/editStudent",//查询数据
            dataType:"json",
            data: formData,//
            success: function(ajaxResponse){
               //alert(ajaxResponse.data);
                if (ajaxResponse.success) {
                    layer.msg("Update Success")
                } else {
                    /* 切换验证码，并清空输入框 */
                    layer.msg("Update Failed")
                }
        },
            error: function () {
                alert("Failed");
            }
        })
    }
    layui.use('upload', function(){
        var upload = layui.upload;
        var health = layui.upload;
        //执行实例
        var uploadInst = upload.render({
            elem: '#uploadPhoto' //绑定元素
            ,url: '${pageContext.request.contextPath}/student/uploadPhoto' //上传接口
            ,done: function(res){
                //上传完毕回调
                alert(res.dirPath)
                $("#add-portrait").src(res.dirPath)
            }
            ,error: function(){
                //请求异常回调
                layer.msg("upload failed")
            }

        })
        var uploadHealth = upload.render({
            elem: '#UploadHealthInfo' //绑定元素
            ,url: '${pageContext.request.contextPath}/student/uploadHealth' //上传接口
            ,done: function(res){
                //上传完毕回调
                alert(res.dirPath)
                //$("#add-portrait").src(res.dirPath)
            }
            ,error: function(){
                //请求异常回调
                layer.msg("upload failed")
            }
    })
    })


</script>
</body>
</html>