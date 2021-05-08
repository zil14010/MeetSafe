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
                <li class="tm-nav-item active"><a href="${pageContext.request.contextPath}/system/activitySquare" class="tm-nav-link">
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
                <li class="tm-nav-item"><a href="${pageContext.request.contextPath}/system/myprofile" class="tm-nav-link">
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
        <div class="row tm-row">
                <input id = "Myinput" class="form-control tm-search-input" name="query" type="text" placeholder="Search..." aria-label="Search">
                <button class="tm-search-button" onclick="myFunction($(Myinput).val())"><i class="fas fa-search tm-search-icon" aria-hidden="true"></i></button>
        </div>
        <div class="row tm-row"  id="showDiv">
            <article class="col-12 col-md-6 tm-post">
                <hr class="tm-hr-primary">
                <a href="post.html" class="effect-lily tm-post-link tm-pt-60">
                    <div class="tm-post-link-inner">
                        <img src="img/img-01.jpg" alt="Image" class="img-fluid">
                    </div>
                    <span class="position-absolute tm-new-badge">New</span>
                    <h2 class="tm-pt-30 tm-color-primary tm-post-title">Simple and useful HTML layout</h2>
                </a>
                <p class="tm-pt-30">
                    There is a clickable image with beautiful hover effect and active title link for each post item.
                    Left side is a sticky menu bar. Right side is a blog content that will scroll up and down.
                </p>
                <div class="d-flex justify-content-between tm-pt-45">
                    <span class="tm-color-primary">Travel . Events</span>
                    <span class="tm-color-primary">June 24, 2020</span>
                </div>
                <hr>
                <div class="d-flex justify-content-between">
                    <span>36 comments</span>
                    <span>by Admin Nat</span>
                </div>
            </article>

        </div>
        <div class="row tm-row tm-mt-100 tm-mb-75">
            <div class="tm-prev-next-wrapper">
                <a href="#" class="mb-2 tm-btn tm-btn-primary tm-prev-next disabled tm-mr-20">Prev</a>
                <a href="#" class="mb-2 tm-btn tm-btn-primary tm-prev-next">Next</a>
            </div>
            <div class="tm-paging-wrapper">
                <span class="d-inline-block mr-3">Page</span>
                <nav class="tm-paging-nav d-inline-block">
                    <ul>
                        <li class="tm-paging-item active">
                            <a href="#" class="mb-2 tm-btn tm-paging-link">1</a>
                        </li>
                        <li class="tm-paging-item">
                            <a href="#" class="mb-2 tm-btn tm-paging-link">2</a>
                        </li>
                        <li class="tm-paging-item">
                            <a href="#" class="mb-2 tm-btn tm-paging-link">3</a>
                        </li>
                        <li class="tm-paging-item">
                            <a href="#" class="mb-2 tm-btn tm-paging-link">4</a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
        <footer class="row tm-row">
            <hr class="col-12">
            <div class="col-md-6 col-12 tm-color-gray">
                Design: <a rel="nofollow" target="_parent" href="https://github.com/zil14010/MeetSafe" class="tm-external-link">MeetSafe Group</a>
            </div>
            <div class="col-md-6 col-12 tm-color-gray tm-copyright">
                Copyright 2021 CSE687
            </div>
        </footer>
    </main>
</div>
<div id="model"  style="display: none">
<article class="col-6 col-md-6 tm-post">
    <hr class="tm-hr-primary">
    <a  class="effect-lily tm-post-link tm-pt-60">
        <div class="tm-post-link-inner">
            <img src="${pageContext.request.contextPath}/static/images/img-01.jpg" alt="Image" class="img-fluid">
        </div>
        <span class="position-absolute tm-new-badge">Activity Type</span>
        <h2 class="tm-pt-30 tm-color-primary tm-post-title">Activity Title</h2>
    </a>
    <p class="tm-pt-30">
        Activity Content
    </p>
    <div class="d-flex justify-content-between tm-pt-45">
        <span class="tm-color-primary">Activity Time</span>
        <span class="tm-color-primary">June 24, 2020</span>
    </div>
    <hr>
    <div class="d-flex justify-content-between">
        <span>Activity Location</span>
        <span>Organizer</span>
    </div>
</article>
</div>
<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/templatemo-script.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.10.2.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/jquery-2.14.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/photoswipe.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/photoswipe-ui-default.min.js"></script>
<script type="text/javascript">
    // //搜索按钮执行
    function myFunction(input) {
        //alert(input)
        $("Myinput").val("")
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/activity/getActivityBytype",//查询数据
            dataType:"json",
            data: input,//当前登陆者的用户ID
            success: function(ajaxResponse){//该对象为查询后返回的数据
                var data = ajaxResponse.data//一个集合
                //获取隐藏模板
                var div
                $("#showDiv").html("")  //清空展示模板
                var showDiv = $("#showDiv").html()
                for(var i in data){
                    div = $("#model").html()
                    //将数据替换掉模板内的占位符
                    div = $("#model").html()
                    //将数据替换掉模板内的占位符
                    //div = div.replace(/Activity Type/,data[i].type) //发布者头像URL
                    div = div.replace(/Activity Title/g,data[i].title) //发布者用户名
                    //div = div.replace(/Activity Content/g, data[i].content)		//内容
                    //div = div.replace(/June 24, 2020/g,data[i].time) //发布时间
                    //div = div.replace(/Activity Location/g,data[i].location)

                    showDiv+=div
                }
                $("#showDiv").html(showDiv)//填充至展示模板
            }

         })
    }

    //加载页面执行
    $(function(){
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/activity/getActivity",//查询数据
            dataType:"json",
            //data: "userInfo",//当前登陆者的用户ID
            success: function(ajaxResponse){//该对象为查询后返回的数据
                var data = ajaxResponse.data//一个集合
                //获取隐藏模板
                var div
                $("#showDiv").html("")  //清空展示模板
                var showDiv = $("#showDiv").html()
                for(var i in data){
                    div = $("#model").html()
                    //将数据替换掉模板内的占位符
                    //div = div.replace(/Activity Type/,data[i].type) //发布者头像URL
                    div = div.replace(/Activity Title/g,data[i].title) //发布者用户名
                    //div = div.replace(/Activity Content/g, data[i].content)		//内容
                    //div = div.replace(/June 24, 2020/g,data[i].time) //发布时间
                    //div = div.replace(/Activity Location/g,data[i].location)

                    showDiv+=div

                }
                $("#showDiv").html(showDiv)//填充至展示模板
            }
        });



    })

</script>

</body>
</html>