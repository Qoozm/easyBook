<%--
  Created by IntelliJ IDEA.
  User: colin
  Date: 2017/7/17
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>EasyBook</title>
    <style type="text/css">
        * {
            padding: 0px;
            margin: 0px;
        }

        body {
            background-color: #FFFFFF;
        }

        nav {
            position: fixed;
            width: 96%;
            margin-left: 2%;
            height: 50px;
            border-bottom: #CCCCCC solid 1px;
            background-color: #FFFFFF;
            z-index: 101;
        }

        #noUser {
            display: block;
        }

        #onUser {
            display: none;
        }

        nav div {
            display: inline-block;
        }

        nav .nav {
            margin-left: 15%;
            height: 50px;
            position: absolute;
            top: 0px;
        }

        .nav .nav-ul {
            height: 50px;
        }

        .nav .nav-ul .nav-li {
            display: inline-block;
            height: 50px;
            text-align: center;
            float: left;
            line-height: 50px;
        }

        .nav .nav-ul .nav-li > a {
            text-decoration: none;
            font-family: "微软雅黑";
            font-size: 20px;
            color: #555555;
        }

        .nav .nav-ul .nav-li .active {
            color: #EE8978;
        }

        .nav .nav-ul .a {
            width: 60px;
        }

        .nav .nav-ul .a:hover {
            background-color: #CCCCCC;
            border-radius: 10px;
        }

        .nav-li #message-list {
            background-color: #FFFFFF;
            border: rgba(0, 0, 0, 0.3) solid 1px;
            width: 100px;
            position: absolute;
            top: 50px;
            display: none;
        }

        .nav .nav-ul .nav-li #message {
            display: inline-block;
        }

        .nav-li > ul > li {
            list-style: none;
            text-align: center;
            line-height: 35px;
        }

        .nav-li > ul > li > a {
            text-decoration: none;
            display: block;
            height: 35px;
            font-family: "微软雅黑";
            font-size: 17px;
            color: #515151;
        }

        .nav-li > ul > li > a:hover {
            background-color: #CCCCCC;
            border-radius: 10px;
        }

        .nav .nav-ul .nav-li input {
            width: 200px;
            height: 30px;
            border: 0px;
            background-color: #EEEEEE;
            outline: none;
            border-radius: 10px;
            padding: 0px 15px;
            padding-right: 35px;
        }

        .nav .nav-ul .nav-li .find img {
            position: absolute;
            height: 20px;
            width: 20px;
            right: 5px;
            top: 18px;
        }

        nav .right {
            position: absolute;
            right: 0px;
            height: 50px;
            line-height: 50px;
        }

        .right .user div #userName {
            width: 70px;
            text-decoration: none;
            font-family: "微软雅黑";
            font-size: 20px;
            color: #555555;
            float: right;
            text-align: center;
        }

        .right .user div #userName:hover {
            background-color: #CCCCCC;
        }

        .right .user .userInfo {
            display: none;
            position: absolute;
            top: 50px;
        }

        .right .user ul {
            background-color: #FFFFFF;
            border: rgba(0, 0, 0, 0.3) solid 1px;
        }

        .right .user ul li {
            list-style: none;
            text-align: center;
            line-height: 35px;
        }

        .userInfo li a {
            text-decoration: none;
            display: block;
            height: 35px;
            width: 100px;
            font-family: "微软雅黑";
            font-size: 17px;
            color: #515151;
        }

        .userInfo li a:hover {
            background-color: #CCCCCC;
        }

        .right button {
            float: right;
            width: 60px;
            height: 40px;
            text-align: center;
            border: 0px;
            outline: none;
            border-radius: 10px;
            font-family: "微软雅黑";
            font-size: 17px;
            margin-top: 5px;
            margin-left: 10px;
        }

        .right .user .sign-in-div {
            margin-top: 5px;
            height: 40px;
            width: 50px;
            text-align: center;
            line-height: 40px;
        }

        .right .user .sign-up-div {
            margin-top: 5px;
            height: 40px;
            width: 50px;
            text-align: center;
            line-height: 40px;
            border: #EC6149 solid 1px;
            border-radius: 10px;
        }

        .right .user .sign-in-div .sign-in {
            font-family: "微软雅黑";
            font-size: 17px;
            color: #555555;
            text-decoration: none;
        }

        .right .user .sign-up-div .sign-up {
            font-family: "微软雅黑";
            font-size: 17px;
            color: #EC6149;
            text-decoration: none;
        }

        .right .write {
            width: 80px;
            background-color: #EC6149;
            color: #FFFFFF;
        }

        .container {
            position: absolute;
            top: 50px;
            width: 940px;
            left: 50%;
            margin-left: -470px;
            background-color: gold;
            height: 1000px;
            z-index: -1;
        }

        .container .lunbo {
            position: relative;
            width: 940px;
            height: 400px;
            overflow: hidden;
        }

        #lunbo ul li {
            list-style: none;
        }

        .lunbo ul li img {
            width: 940px;
            height: 400px;
        }

        .lunbo #button {
            position: absolute;
            bottom: 20px;
            right: 40px;
        }

        .lunbo #button div {
            display: inline-block;
            width: 10px;
            height: 10px;
            border: black solid 1px;
            background-color: #555555;
            border-radius: 5px;
        }

        .lunbo #button .on {
            background-color: #C4E3F3;
        }

        .container .main {
            overflow: hidden;
            margin-top: 20px;
        }

        .main .info {
            float: left;
            width: 70%;
            height: 500px;
            background-color: forestgreen;
        }

        .main .info .type {
            width: 90%;
            height: 100px;
            margin-left: 0%;
            background-color: navajowhite;
        }

        .main .info .essay {
            width: 90%;
            height: 400px;
            margin-left: 0%;
            background-color: darkblue;
        }

        .main .other {
            float: left;
            width: 30%;
            height: 500px;
            background-color: aqua;
        }

        .main .other .example {
            width: 100%;
            height: 200px;
            background-color: wheat;
        }

        .main .other .author {
            width: 100%;
            height: 300px;
            background-color: tan;
        }
    </style>
</head>
<body>
<!--用户登录-->
<nav id="onUser">
    <div><a href=""><img src="static/img/logo.png" alt="LOGO"/></a></div>
    <div class="nav">
        <ul class="nav-ul">
            <li class="a nav-li"><a class="active" href="">发现</a></li>
            <li class="a nav-li"><a href="">关注</a></li>
            <li class="a nav-li">
                <a id="message" href="">消息</a>
                <ul id="message-list">
                    <li><a href="">评论</a></li>
                    <li><a href="">简信</a></li>
                    <li><a href="">喜欢和赞</a></li>
                    <li><a href="">关注</a></li>
                    <li><a href="">赞赏</a></li>
                    <li><a href="">其他消息</a></li>
                </ul>
            </li>
            <li class="nav-li">
                <input/>
                <a class="find" href=""><img src="static/img/find.png"/></a>
            </li>
        </ul>
    </div>
    <div class="right">
        <button class="write">写文章</button>
        <div class="user">
            <div><a id="userName" href="">用户名</a></div>
            <ul class="userInfo">
                <li><a href="">我的主页</a></li>
                <li><a href="">收藏的文章</a></li>
                <li><a href="">喜欢的文章</a></li>
                <li><a href="">设置</a></li>
                <li><a href="">反馈</a></li>
                <li><a href="/loginUI">退出</a></li>
            </ul>
        </div>
    </div>
</nav>
<!--用户未登录-->
<nav id="noUser">
    <div><a href=""><img src="static/img/logo.png" alt="LOGO"/></a></div>
    <div class="nav">
        <ul class="nav-ul">
            <li class="a nav-li"><a class="active" href="">发现</a></li>
            <li class="a nav-li"><a href="">下载</a></li>
            <li class="nav-li">
                <input/>
                <a class="find" href=""><img src="static/img/find.png"/></a>
            </li>
        </ul>
    </div>
    <div class="right">
        <button class="write">写文章</button>
        <div class="user">
            <div class="sign-in-div"><a class="sign-in" href="/loginUI">登录</a></div>
            <div class="sign-up-div"><a class="sign-up" href="/registerUI">注册</a></div>
        </div>
    </div>
</nav>

<div class="container">
    <div class="lunbo">
        <!--轮播图-->
        <ul>
            <li><img class="content2-rimg" src="static/img/哆啦A梦.jpg"></li>
            <li><img class="content2-rimg" src="static/img/荡寇风云.jpg"></li>
            <li><img class="content2-rimg" src="static/img/3只小猪2.jpg"></li>
            <li><img class="content2-rimg" src="static/img/反转人生.jpg"></li>
            <li><img class="content2-rimg" src="static/img/变形金刚5.jpg"></li>
        </ul>
        <div id="button">
            <div class="on" title="1"></div>
            <div title="2"></div>
            <div title="3"></div>
            <div title="4"></div>
            <div title="5"></div>
        </div>
    </div>
    <div class="main">
        <div class="info">
            <div class="type">

            </div>
            <div class="essay">

            </div>
        </div>
        <div class="other">
            <div class="example">

            </div>
            <div class="author">

            </div>
        </div>
    </div>
</div>

<script>
    function init() {
        changeNav();
        slideShow();
    }
    //轮播
    function slideShow() {
        var lunbo = document.getElementsByClassName("lunbo")[0];
        var li = lunbo.getElementsByTagName("ul")[0].getElementsByTagName("li");
        var btn = document.getElementById("button").getElementsByTagName("div");
        var timer = null;
        var x = 0;
        timer = setInterval(autoPlay, 1500);
        lunbo.onmouseover = function () {
            clearInterval(timer);
        }
        lunbo.onmouseout = function () {
            timer = setInterval(autoPlay, 1500);
        }
        for (var i = 0; i < btn.length; i++) {
            btn[i].onmouseover = function () {
                clearInterval(timer);
                x = this.title - 1;
                changePic(x);
            }
        }
        function autoPlay() {
            if (++x >= li.length)
                x = 0;
            changePic(x);
        }

        function changePic(y) {
            for (var i = 0; i < li.length; i++) {
                li[i].style.display = "none";
                btn[i].className = "";
            }
            li[y].style.display = "block";
            btn[y].className = "on";
        }
    }
    //用户登录和未登录切换
    function changeNav() {
        var id = ${user.user_id};	//使用session获取用户名
        var onUser = document.getElementById("onUser"),
            noUser = document.getElementById("noUser");
        if (id) {	//如果用户已经登录
            userEvent();
            onUser.style.display = "block";
            noUser.style.display = "none";
        } else {	//用户未登录
            onUser.style.display = "none";
            noUser.style.display = "block";
        }
    }
    //用户名和消息事件
    function userEvent() {
        var user = document.getElementById("userName");
        user.onmouseover = showUserList;
        userName.onmouseout = hideUserList;
        var message = document.getElementById("message");
        message.onmouseover = showMessageList;
        message.onmouseout = hideMessageList;
    }
    //显示用户功能
    function showUserList() {
        var userList = document.getElementsByClassName("userInfo")[0];
        userList.style.display = "block";
    }
    //隐藏用户功能
    function hideUserList() {
        var userList = document.getElementsByClassName("userInfo")[0];
        userList.style.display = "none";
        userList.onmouseover = function () {
            userList.style.display = "block";
        }
        userList.onmouseout = function () {
            userList.style.display = "none";
        }
    }
    //显示消息功能
    function showMessageList() {
        var messageList = document.getElementById("message-list");
        messageList.style.display = "block";
    }
    //隐藏消息功能
    function hideMessageList() {
        var messageList = document.getElementById("message-list");
        console.log(messageList);
        messageList.style.display = "none";
        messageList.onmouseover = function () {
            messageList.style.display = "block";
        }
        messageList.onmouseout = function () {
            messageList.style.display = "none";
        }
    }
    init();
</script>

</body>
</html>

