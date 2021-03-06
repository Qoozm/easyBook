<%--
  Created by IntelliJ IDEA.
  User: colin
  Date: 2017/7/17
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>EasyBook</title>
    <link rel="stylesheet" href="../../static/css/nav.css"/>
    <link rel="stylesheet" href="../../static/css/essaySketch.css"/>
    <style type="text/css">
        .container {
            position: absolute;
            top: 60px;
            width: 900px;
            left: 50%;
            margin-left: -450px;
            z-index: -1;
        }

        .container > .divbg {
            width: 900px;
            height: 424px;
            margin: auto;
            position: relative;
        }

        .divbg > .span_list {
            width: 50px;
            height: 60px;
            font-size: 50px;
            color: white;
            position: absolute;
            z-index: 999;
            text-align: center;
            cursor: pointer;
        }

        .divbg > .span_list:hover {
            background: #ccc;
        }

        .divbg > .span_left {
            left: 0;
            top: 45%;
        }

        .divbg > .span_right {
            right: 0;
            top: 45%;
        }

        .divbg > .banner {
            position: absolute;
            bottom: 0;
            left: 42%;
            margin-bottom: 10px;
            height: 20px;
            z-index: 999;
        }

        .divbg > .banner > .point {
            width: 20px;
            height: 20px;
            border-radius: 50%;
            background: white;
            float: left;
            margin-right: 10px;
        }

        .divbg > .bg {
            width: 100%;
            height: 100%;
            position: absolute;
        }

        .container > .main {
            margin-top: 20px;
        }

        .main > .essayInfo {
            float: left;
            width: 77%;
        }

        .main > .essayInfo > .essayType {
            width: 90%;
            height: 100px;
            margin-left: 0;
        }

        .essayInfo > .essayType > .type-div {
            margin: 10px;
            display: inline-block;
            height: 30px;
            border-radius: 7px;
            overflow: hidden;
            background-color: #DDDDDD;
            line-height: 30px;
        }

        .essayInfo > .essayType > .type-div > img {
            height: 30px;
            width: 30px;
            vertical-align: middle;
            margin-top: -5px;
        }

        .essayInfo > .essayType > .type-div > span {
            display: inline-block;
            padding-right: 7px;
        }

        .main > .essayInfo > .essay {
            width: 90%;
            margin-left: 0;
        }

        .main > .other {
            float: right;
            width: 23%;
        }

        .main > .other > .example {
            width: 100%;
        }

        .main > .other > .example > .example-list > li {
            list-style: none;
            margin-top: 10px;
        }

        .main > .other > .example > .example-list > li img {
            width: 100%;
        }

        .main > .other > .author {
            margin-top: 20px;
            width: 100%;
        }

        .main > .other > .author > div > span {
            font-size: 15px;
            color: #AAAAAA;
        }

        .main > .other > .author > .author-list {
            margin-top: 10px;
        }

        .main > .other > .author > .author-list > li {
            height: 48px;
            list-style: none;
            margin-top: 10px;
        }

        .main > .other > .author > .author-list > li > .author-div > a {
            float: left;
        }

        .main > .other > .author > .author-list > li > .author-div > div {
            width: 150px;
            float: right;
        }

        .main > .other > .author > .author-list > li > .author-div > div > a {
            font-size: 14px;
            color: #000000;
        }

        .main > .other > .author > .author-list > li > .author-div > div > a > span {
            color: #42C02E;
            font-size: 13px;
            float: right;
        }

        .main > .other > .author > .author-list > li > .author-div > div > p {
            margin-top: 16px;
            font-size: 12px;
            color: #BBBBBB;
        }

        .main > .other > .author > .author-list > li img {
            display: inline-block;
            width: 48px;
            height: 48px;
            border-radius: 50%;
        }

        .more {
            margin: 10px;
            display: inline-block;
            height: 30px;
            overflow: hidden;
            background-color: #FFFFFF;
            line-height: 30px;
            font-size: 14px;
            color: #BBBBBB;
        }

        .trade {
            position: absolute;
            display: inline-block;
            cursor: pointer;
            right: 0;
            font-size: 15px;
            color: #AAAAAA;
        }

        .trade:hover {
            color: #CCCCCC;
        }

        .divbg > .bg > img {
            width: 100%;
            height: 100%;
        }

        .divbg > .bg > span {
            position: absolute;
            display: inline-block;
            z-index: 10;
            font-size: 30px;
            padding: 10px;
            bottom: 50px;
            left: 50px;
            color: #FFF;
            text-align: center;
        }
    </style>

</head>
<body>
<!--用户已经登录-->
<nav id="onUser">
    <!--左侧LOGO-->
    <div class="left">
        <a href="<c:url value="/"/>">
            <img src="../../static/img/logo.png"/>
        </a>
    </div>
    <!--中部功能-->
    <div class="center">
        <ul>
            <li><a class="a-font active" href="#">发现</a></li>
            <li><a class="a-font" href="#">关注</a></li>
            <li>
                <a id="message" class="a-font" href="#">消息</a>
                <ul id="message-list">
                    <li><a class="a-font" href="">评论</a></li>
                    <li><a class="a-font" href="">简信</a></li>
                    <li><a class="a-font" href="">喜欢和赞</a></li>
                    <li><a class="a-font" href="">关注</a></li>
                    <li><a class="a-font" href="">赞赏</a></li>
                    <li><a class="a-font" href="">其他消息</a></li>
                </ul>
            </li>
            <li>
                <div class="find">
                    <input/>
                    <a href=""><img src="../../static/img/find.png"/></a>
                </div>
            </li>
        </ul>
    </div>
    <!--右侧用户-->
    <div class="right">
        <ul>
            <li>
                <a id="userName" class="user-icon a-font" href="<c:url value="/"/>">
                    <span id="user_id" style="display: none;">${user.user_id}</span>
                    <img src="../../static/img/user.png"/>
                </a>
                <ul id="userInfo">
                    <li><a class="a-font" href="<c:url value="/userHomePage"/>">我的主页</a></li>
                    <li><a class="a-font" href="">收藏的文章</a></li>
                    <li><a class="a-font" href="">喜欢的文章</a></li>
                    <li><a class="a-font" href="">设置</a></li>
                    <li><a class="a-font" href="">反馈</a></li>
                    <li><a class="a-font" href="<c:url value="/loginOut"/>">退出</a></li>
                </ul>
            </li>
            <li>
                <a class="write" href="<c:url value="/writeEssay"/>" target="_blank">写文章</a>
            </li>
        </ul>
    </div>
</nav>
<!--用户没有登录-->
<nav id="noUser" style="display: none;">
    <!--左侧LOGO-->
    <div class="left">
        <a href="<c:url value="/"/>">
            <img src="../../static/img/logo.png"/>
        </a>
    </div>
    <!--中部功能-->
    <div class="center">
        <ul>
            <li><a class="a-font" href="#">发现</a></li>
            <li>
                <div class="find">
                    <input/>
                    <a href=""><img src="../../static/img/find.png"/></a>
                </div>
            </li>
        </ul>
    </div>
    <!--右侧用户-->
    <div class="right">
        <ul>
            <li>
                <a class="sign-in" href="<c:url value="/loginUI" />">登录</a>
            </li>
            <li>
                <a class="sign-up" href="<c:url value="/registerUI"/>">注册</a>
            </li>
            <li>
                <a class="write" href="<c:url value="/writeEssay"/>">写文章</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container">
    <div class="divbg">
        <span class="span_list span_left"><</span>
        <span class="span_list span_right">></span>
        <div class="banner">
            <!--
            <div class="point"></div>
            <div class="point"></div>
            <div class="point"></div>
            <div class="point"></div>
            <div class="point"></div>
            <div class="point"></div>
            -->
        </div>
        <!--
            <div class="bg">
                <img src="static/img/lunbo/visual_slide01.jpg">
                <span>第一篇</span>
            </div>
            <div class="bg">
                <img src="static/img/lunbo/visual_slide02.jpg">
                <span>第二篇</span>
            </div>
            <div class="bg">
                <img src="static/img/lunbo/visual_slide03.jpg">
                <span>第三篇</span>
            </div>
            <div class="bg">
                <img src="static/img/lunbo/visual_slide04.jpg">
                <span>第四篇</span>
            </div>
            <div class="bg">
                <img src="static/img/lunbo/visual_slide05.jpg">
                <span>第五篇</span>
            </div>
            <div class="bg">
                <img src="static/img/lunbo/visual_slide06.jpg">
                <span>第六篇</span>
            </div>
            -->
    </div>
    <div class="main">
        <div class="essayInfo">
            <div class="essayType">

                <%--<a class="type-div" href="">--%>
                <%--<img src="../../static/img/essayType/book.png"/>--%>
                <%--<span>书单</span>--%>
                <%--</a>--%>

            </div>
            <div class="essay">
                <ul class="essay-list">

                    <li class="essay-li">
                        <a href=""><img src="../../static/img/essayPhoto/essay01.png"/></a>
                        <div class="essay-div">
                            <div class="author">
                                <a href=""><img src="../../static/img/user.png"/></a>
                                <div>
                                    <a class="authorName" href="">那是</a>
                                    <span class="time">07.09 19:04</span>
                                </div>
                            </div>
                            <a href="">海</a>
                            <p>海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿</p>
                            <div class="meta">
                                <a class="essay-type" href="">阅览室</a>
                                <a href="">
                                    <i><img src="../../static/img/icon/preview.png"/></i>
                                    757
                                </a>
                                <a href="">
                                    <i><img src="../../static/img/icon/comment.png"/></i>
                                    20
                                </a>
                                <a>
                                    <span>❤</span>
                                    120
                                </a>
                            </div>
                        </div>
                    </li>

                </ul>

            </div>
        </div>
        <div class="other">
            <div class="example">
                <ul class="example-list">
                    <li><a href=""><img src="../../static/img/icon/newExample.png"/></a></li>
                    <li><a href=""><img src="../../static/img/icon/sevenHot.png"/></a></li>
                    <li><a href=""><img src="../../static/img/icon/thirtyHot.png"/></a></li>
                </ul>
            </div>
            <div class="author">
                <div>
                    <span>推荐作者</span>
                    <a class="trade">换一换</a>
                </div>
                <ul class="author-list">
                    <!--
                    <li>
                        <div class="author-div">
                            <a href=""><img src="static/img/user.jpg" /></a>
                            <div>
                                <a href="">张三</a>
                                <a href="">
                                    <span>＋关注</span>
                                </a>
                                <p>获得1.2k个赞·0.5k个喜欢</p>
                            </div>
                        </div>
                    </li>
                    -->
                </ul>
            </div>
        </div>
    </div>
</div>


<script type="text/javascript" src="../../static/js/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="../../static/js/nav.js"></script>
<script type="text/javascript" src="../../static/js/essay.js"></script>
<script type="text/javascript" src="../../static/ajax/essayAjax.js"></script>
<script type="text/javascript" src="../../static/object/EssayObj.js"></script>
<script>
    window.onload = function () {
        nav.changeNav();//导航栏
        getEssayType();	//获取专题
        getEssayPhoto();//获取点赞数前6
        getEssay();		//获取所有文章
        getAuthor(1);    //推荐作者
        setUserPhoto();
        tradeEvent();

        Essay.changeEssayDiv();
    };

    function setUserPhoto() {
        var img = document.getElementById("userName").getElementsByTagName("img")[0];
        if ("${user.user_head_icon_path}") {
            img.src = "${user.user_head_icon_path}";
        } else {
            img.src = "/static/img/user.png";
        }
    }

    //轮播图
    function slideShow() {
        var timer;
        var num = 0;
        var indexnum = 0;
        var box = document.getElementsByClassName("divbg")[0];
        var leftMouse = document.getElementsByClassName("span_left")[0];
        var rightMouse = document.getElementsByClassName("span_right")[0];
        var pointMouse = document.getElementsByClassName("point");
        pointMouse[num].style.backgroundColor = "red";
        leftMouse.onclick = function () {
            imgturn(-1);
        };
        rightMouse.onclick = function () {
            imgturn(1);
        };
        box.onmouseenter = function () {
            clearInterval(timer);
        };
        box.onmouseleave = function () {
            timer = setInterval(function () {
                imgturn(1)
            }, 2000);
        };
        var imgList = document.getElementsByClassName("bg");
        for (var i = 0; i < imgList.length; i++) {
            if (i != 0) {
                imgList[i].style.opacity = 0;
                imgList[i].style.zIndex = 0;
            }
            imgList[i].style.zIndex = imgList.length - 1 - i;
        }
        for (var i = 0; i < pointMouse.length; i++) {
            pointMouse[i].index = i;
            pointMouse[i].onclick = function () {
                for (var k = 0; k < pointMouse.length; k++) {
                    pointMouse[k].style.background = "white";
                }
                this.style.background = "red";
                var count = this.index - indexnum;
                imgturn(count);

            }
        }
        timer = setInterval(function () {
            imgturn(1);
        }, 2000);

        function imgturn(n) {
            num += n;
            if (num == -1) {
                num = 5;
            } else {
                num = num % 6;
            }

            imgList[indexnum].style.zIndex = 0;
            imgList[indexnum].style.opacity = 0;
            pointMouse[indexnum].style.background = "white";
            indexnum = num;
            imgList[indexnum].style.zIndex = 5;
            imgList[indexnum].style.opacity = 1;
            pointMouse[indexnum].style.background = "red";
        }
    }

    //显示轮播图图片
    function showEssayPhoto(data) {
        var divbg = document.getElementsByClassName("divbg")[0];
        var banner = divbg.getElementsByClassName("banner")[0];
        for (var i = 0; i < data.length; i++) {
            var point = document.createElement("div"),
                bg = document.createElement("div"),
                span = document.createElement("span")
            var essayContent = data[i].essay_content;
            var div2 = document.createElement("div");
            div2.innerHTML = essayContent;
            var img = div2.getElementsByTagName("img")[0];
            var title = data[i].essay_title;
            span.innerHTML = title;
            point.className = "point";
            bg.className = "bg";
            bg.appendChild(img);
            bg.appendChild(span);

            banner.appendChild(point);
            divbg.appendChild(bg);
        }
        slideShow();	//轮播图
    }

    function getEssayPhoto() {
        var url, type;
        url = "/homepage/loadWheelPhoto";
        type = "GET";
        var essayAjax = new EssayAjax(type, url);
        essayAjax.getEssay(showEssayPhoto);

    }

    //显示文章
    var showEssay = function (data) {
        var ul = document.getElementsByClassName("essay-list")[0];

        console.log(data);
        for (var i = 0; i < data.length; i++) {
            console.log(data[i]);
            //时间
            var s = data[i].essay_pubDate;
            var date = new Date(s);

            var essayContent = "海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿";
            var div = document.createElement("div");
            div.innerHTML = essayContent;

            var userPhoto = data[i].user_head_icon_path,
                userName = data[i].user_name,
                time = date.toLocaleString(),
                photo = div.getElementsByTagName("img")[0],
                title = data[i].essay_title,
                content = div.innerText,
                subject = data[i].essay_subject_type,
                visitNum = data[i].essay_visits,
                commentNum = data[i].essay_comment_number,
                thumbNum = data[i].essay_thumb;
            var essayObj = new EssayObj(userPhoto, userName, time, photo, title, content, subject, visitNum, commentNum, thumbNum);
            essayObj.createDom(ul);
        }
    };

    function getEssay() {
        var url, type;
        url = "/homepage/loadEssay";
        type = "GET";
        console.log("getEssay");
        var essayAjax = new EssayAjax(type, url);
        essayAjax.getEssay(showEssay);
    }

    //获取专题
    function getEssayType() {
        $.ajax({
            type: "get",
            url: "/homepage/loadSubject",		//获取所有专题的路径
            async: true,
            success: function (data) {
                var div = document.getElementsByClassName("essayType")[0];
                div.innerHTML = "";
                for (var i = 0; i < 10 && i < data.length; i++) {
                    var a = document.createElement("a"),
                        img = document.createElement("img"),
                        span = document.createElement("span");
                    a.className = "type-div";
                    a.href = "";
                    a.target = "_blank";
                    img.src = data[i].essay_subject_picture;
                    span.innerHTML = data[i].essay_subject_type;
                    a.appendChild(img);
                    a.appendChild(span);
                    div.appendChild(a);
                }
                var a2 = document.createElement("a");
                a2.className = "more";
                a2.innerHTML = "更多热门专题 > ";
                div.appendChild(a2);
            },
            error: function (err) {
                console.log(err.message);
            }
        });
    }

    //换一换
    function tradeEvent() {
        var n = 1;
        document.getElementsByClassName("trade")[0].onclick = function () {
            getAuthor(n);
            n++;
        }
    }

    var maxPage = 1;

    //推荐作者
    function getAuthor(n) {

        n = n % maxPage;
        if (n == 0) {
            n = maxPage;
        }

        $.ajax({
            type: "get",
            url: "/homepage/loadAuthor?currentPage=" + n,		//推荐作者路径
            async: true,
            success: function (data) {
                var list = data.authors;
                maxPage = data.pageCounts;
                if (list) {
                    var ul = document.getElementsByClassName("author-list")[0];
                    ul.innerHTML = "";
                    for (var i = 0; i < list.length; i++) {
                        var li = document.createElement("li"),
                            div1 = document.createElement("div"),
                            a1 = document.createElement("a"),
                            img = document.createElement("img"),
                            div2 = document.createElement("div"),
                            a2 = document.createElement("a"),
                            a3 = document.createElement("a"),
                            span = document.createElement("span"),
                            p = document.createElement("p");
                        div1.className = "author-div";
                        a1.href = "";
                        if (list[i].user_head_icon_path) {
                            img.src = list[i].user_head_icon_path;
                        } else {
                            img.src = "/static/img/user.png";
                        }
                        a1.appendChild(img);
                        div1.appendChild(a1);
                        a2.innerHTML = list[i].user_name;
                        a2.href = "";
                        div2.appendChild(a2);
                        a3.href = "";
                        var user_id = document.getElementById("user_id");
                        if (list[i].user_name != "${user.user_name}") {
                            span.innerHTML = "＋关注";
                        }
                        a3.appendChild(span);
                        div2.appendChild(a3);
                        p.innerHTML = "获得" + list[i].user_essay_thumb + "个赞,发表了" + list[i].user_essay_number + "篇文章";
                        div2.appendChild(p);
                        div1.appendChild(div2);
                        li.appendChild(div1);
                        ul.appendChild(li);
                    }
                }
            },
            error: function (err) {
                console.log(err.message);
            }
        });
    }
</script>
</body>
</html>