<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>${user.user_name}的主页</title>
    <link rel="stylesheet" href="../../static/css/nav.css"/>
    <link rel="stylesheet" href="../../static/css/essaySketch.css"/>
    <link rel="stylesheet" href="../../static/css/fans.css"/>
    <link rel="stylesheet" href="../../static/css/attention.css"/>
    <link rel="stylesheet" href="../../static/css/user_subject.css"/>
    <style type="text/css">
        ul li {
            list-style: none;
        }

        a {
            cursor: pointer;
        }

        .container {
            position: absolute;
            top: 60px;
            width: 900px;
            left: 50%;
            margin-left: -450px;
            z-index: -1;
            height: 800px;
        }

        .container > .left {
            float: left;
            width: 70%;
            height: 100%;
        }

        .container > .left > .userInfo {
            width: 100%;
            height: 80px;
            margin: 20px 0px;
        }

        .container > .left > .userInfo > a > img {
            height: 80px;
            width: 80px;
            border-radius: 50%;
        }

        .container > .left > .userInfo > a {
            margin-right: 20px;
            float: left;
        }

        .container > .left > .userInfo > div {
            width: 530px;
            height: 100px;
            float: left;
        }

        .container > .left > .userInfo > div > .other {
            font-family: "黑体";
            font-size: 13px;
            color: #AAAAAA;
            display: inline-block;
            text-align: center;
            padding-right: 10px;
        }

        .container > .left > .userInfo > div > .r-xian {
            border-right: #AAAAAA solid 1px;
        }

        .container > .left > .userInfo > div > #name {
            padding: 10px 0px;
            display: inline-block;
            font-family: "黑体";
            font-size: 22px;
            font-weight: 900;
        }

        .container > .left > .ul-1 {
            width: 630px;
            height: 50px;
        }

        .container > .left > .ul-1 > li {
            display: inline-block;
            float: left;
            margin-right: 5px;
        }

        .container > .left > .ul-1 > li > a {
            display: inline-block;
            height: 20px;
            margin: 10px 10px 10px 0px;
            font-size: 17px;
            color: #AAAAAA;
            font-weight: 800;
        }

        .active {
            color: #777777;
            border-bottom: #777777 solid 2px;
        }

        .h:hover {
            color: #777777;
            border-bottom: #777777 solid 2px;
        }

        .container > .right {
            float: right;
            width: 25%;
        }

        .container > .right > ul {
            margin-top: 50px;
            width: 100%;
            border-top: #CCCCCC solid 1px;
            border-bottom: #CCCCCC solid 1px;
        }

        .container > .right > ul > li {
            margin: 20px 0px;
        }

        .container > .right > ul > li > a {
            font-size: 15px;
        }

        .container > .right > div {
            margin-top: 20px;
            font-size: 13px;
            color: #AAAAAA;
        }

        .container > .right > a {
            display: inline-block;
            padding: 10px 0px;
            font-size: 14px;
            color: #3DB922;
        }

        .on {
            display: block;
        }

        .off {
            display: none;
        }
    </style>

</head>
<body>
<nav id="onUser">
    <!--左侧LOGO-->
    <div class="left">
        <a href="<c:url value="/" />">
            <img src="../../static/img/logo.png"/>
        </a>
    </div>
    <!--中部功能-->
    <div class="center">
        <ul>
            <li><a class="a-font" href="#">发现</a></li>
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
                    <input type="text"/>
                    <a href=""><img src="../../static/img/find.png"/></a>
                </div>
            </li>
        </ul>
    </div>
    <!--右侧用户-->
    <div class="right">
        <ul>
            <li>
                <a id="userName" class="user-icon a-font" href="">
                    <span id="user_name" style="display: none;">xxx</span>
                    <img src="../../static/img/user.jpg"/>
                </a>
                <ul id="userInfo">
                    <li><a class="a-font" href="">我的主页</a></li>
                    <li><a class="a-font" href="">收藏的文章</a></li>
                    <li><a class="a-font" href="">喜欢的文章</a></li>
                    <li><a class="a-font" href="">设置</a></li>
                    <li><a class="a-font" href="">反馈</a></li>
                    <li><a class="a-font" href="">退出</a></li>
                </ul>
            </li>
            <li>
                <a class="write" href="">写文章</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container">
    <div class="left">
        <div class="userInfo">
            <a href=""><img src="../../static/img/user.jpg"/></a>
            <div>
                <a id="name" href="">名字123</a>
                <br/>
                <a class="other r-xian"> 4<br/>关注</a>
                <a class="other r-xian"> 4<br/>粉丝</a>
                <a class="other r-xian"> 4<br/>文章</a>
                <a style="cursor: auto;" class="other"> 4<br/>收获喜欢</a>
            </div>
        </div>

        <ul class="ul-1 off">
            <li><a class="h">关注用户 240</a></li>
            <li><a class="h">粉丝 200</a></li>
        </ul>
        <ul class="ul-1 off">
            <li><a class="h">关注的专题 240</a></li>
            <li><a class="h">喜欢的文章 200</a></li>
            <li><a class="h">收藏的文章 200</a></li>
        </ul>
        <ul class="ul-1">
            <li><a class="h">文章</a></li>
            <li><a class="h active">动态</a></li>
            <li><a class="h">最新评论</a></li>
            <li><a class="h">热门</a></li>
        </ul>

        <!--关注用户-->
        <div class="ul-2 ul-attention off">
            <ul id="attention-ul">
                <li class="attention-li">
                    <a href=""><img src="../../static/img/user.png"/></a>
                    <div class="attention-info">
                        <a href="">名字</a>
                        <br/>
                        <div>关注 35 | 粉丝 22 | 文章 7</div>
                        <div>写了 6031 字，获得了 16 个喜欢</div>
                    </div>
                    <div class="attention-btn">
                        √已关注
                    </div>
                </li>
                <li class="attention-li">
                    <a href=""><img src="../../static/img/user.png"/></a>
                    <div class="attention-info">
                        <a href="">名字</a>
                        <br/>
                        <div>关注 35 | 粉丝 22 | 文章 7</div>
                        <div>写了 6031 字，获得了 16 个喜欢</div>
                    </div>
                    <div class="attention-btn">
                        √已关注
                    </div>
                </li>
                <li class="attention-li">
                    <a href=""><img src="../../static/img/user.png"/></a>
                    <div class="attention-info">
                        <a href="">名字</a>
                        <br/>
                        <div>关注 35 | 粉丝 22 | 文章 7</div>
                        <div>写了 6031 字，获得了 16 个喜欢</div>
                    </div>
                    <div class="attention-btn">
                        √已关注
                    </div>
                </li>

            </ul>
        </div>
        <!--粉丝-->
        <div class="ul-2 ul-fans off">
            <ul id="fans-ul">
                <li class="fans-li">
                    <a href=""><img src="../../static/img/user.png"/></a>
                    <div class="fans-info">
                        <a href="">粉丝名字</a>
                        <br/>
                        <div>关注 35 | 粉丝 22 | 文章 7</div>
                        <div>写了 6031 字，获得了 16 个喜欢</div>
                    </div>
                    <div class="fans-btn">
                        +关注
                    </div>
                </li>
                <li class="fans-li">
                    <a href=""><img src="../../static/img/user.png"/></a>
                    <div class="fans-info">
                        <a href="">粉丝名字</a>
                        <br/>
                        <div>关注 35 | 粉丝 22 | 文章 7</div>
                        <div>写了 6031 字，获得了 16 个喜欢</div>
                    </div>
                    <div class="fans-btn">
                        +关注
                    </div>
                </li>
                <li class="fans-li">
                    <a href=""><img src="../../static/img/user.png"/></a>
                    <div class="fans-info">
                        <a href="">粉丝名字</a>
                        <br/>
                        <div>关注 35 | 粉丝 22 | 文章 7</div>
                        <div>写了 6031 字，获得了 16 个喜欢</div>
                    </div>
                    <div class="fans-btn">
                        +关注
                    </div>
                </li>
                <li class="fans-li">
                    <a href=""><img src="../../static/img/user.png"/></a>
                    <div class="fans-info">
                        <a href="">粉丝名字</a>
                        <br/>
                        <div>关注 35 | 粉丝 22 | 文章 7</div>
                        <div>写了 6031 字，获得了 16 个喜欢</div>
                    </div>
                    <div class="fans-btn">
                        +关注
                    </div>
                </li>
                <li class="fans-li">
                    <a href=""><img src="../../static/img/user.png"/></a>
                    <div class="fans-info">
                        <a href="">粉丝名字</a>
                        <br/>
                        <div>关注 35 | 粉丝 22 | 文章 7</div>
                        <div>写了 6031 字，获得了 16 个喜欢</div>
                    </div>
                    <div class="fans-btn">
                        +关注
                    </div>
                </li>
            </ul>
        </div>
        <!--关注的专题-->
        <div class="ul-2 ul-subject off">
            <ul id="subject-ul">
                <li class="subject-li">
                    <a href=""><img src="/static/img/essayType/book.png"/></a>
                    <div class="subject-info">
                        <a href="">书单</a>
                        <br/>
                        <div>收录了77771篇文章，591372人关注</div>
                    </div>
                    <div class="subject-btn">
                        √已关注
                    </div>
                </li>
            </ul>
        </div>
        <!--喜欢的文章-->
        <div class="ul-2 ul-like-essay off">
            <ul class="essay-list">
                <li class="essay-li">
                    <a href=""><img src="/static/img/essayPhoto/essay01.png"/></a>
                    <div class="essay-div">
                        <div class="author">
                            <a href=""><img src="/static/img/user.jpg"/></a>
                            <div>
                                <a class="authorName" href="">作者名字</a>
                                <span class="time">07.09 19:04</span>
                            </div>
                        </div>
                        <a href="">海</a>
                        <p>海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿</p>
                        <div class="meta">
                            <a class="essay-type" href="">阅览室</a>
                            <a href="">
                                <i><img src="/static/img/icon/preview.png"/></i>
                                757
                            </a>
                            <a href="">
                                <i><img src="/static/img/icon/comment.png"/></i>
                                20
                            </a>
                            <a>
                                <span>❤</span>
                                120
                            </a>
                        </div>
                    </div>
                </li>
                <li class="essay-li">
                    <a href=""><img src="/static/img/essayPhoto/essay01.png"/></a>
                    <div class="essay-div">
                        <div class="author">
                            <a href=""><img src="/static/img/user.jpg"/></a>
                            <div>
                                <a class="authorName" href="">作者名字</a>
                                <span class="time">07.09 19:04</span>
                            </div>
                        </div>
                        <a href="">海</a>
                        <p>海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿</p>
                        <div class="meta">
                            <a class="essay-type" href="">阅览室</a>
                            <a href="">
                                <i><img src="/static/img/icon/preview.png"/></i>
                                757
                            </a>
                            <a href="">
                                <i><img src="/static/img/icon/comment.png"/></i>
                                20
                            </a>
                            <a>
                                <span>❤</span>
                                120
                            </a>
                        </div>
                    </div>
                </li>
                <li class="essay-li">
                    <a href=""><img src="/static/img/essayPhoto/essay01.png"/></a>
                    <div class="essay-div">
                        <div class="author">
                            <a href=""><img src="/static/img/user.jpg"/></a>
                            <div>
                                <a class="authorName" href="">作者名字</a>
                                <span class="time">07.09 19:04</span>
                            </div>
                        </div>
                        <a href="">海</a>
                        <p>海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿</p>
                        <div class="meta">
                            <a class="essay-type" href="">阅览室</a>
                            <a href="">
                                <i><img src="/static/img/icon/preview.png"/></i>
                                757
                            </a>
                            <a href="">
                                <i><img src="/static/img/icon/comment.png"/></i>
                                20
                            </a>
                            <a>
                                <span>❤</span>
                                120
                            </a>
                        </div>
                    </div>
                </li>
                <li class="essay-li">
                    <a href=""><img src="/static/img/essayPhoto/essay01.png"/></a>
                    <div class="essay-div">
                        <div class="author">
                            <a href=""><img src="/static/img/user.jpg"/></a>
                            <div>
                                <a class="authorName" href="">作者名字</a>
                                <span class="time">07.09 19:04</span>
                            </div>
                        </div>
                        <a href="">海</a>
                        <p>海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿</p>
                        <div class="meta">
                            <a class="essay-type" href="">阅览室</a>
                            <a href="">
                                <i><img src="/static/img/icon/preview.png"/></i>
                                757
                            </a>
                            <a href="">
                                <i><img src="/static/img/icon/comment.png"/></i>
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
        <!--收藏的文章-->
        <div class="ul-2 ul-collect-essay off">
            <ul class="essay-list">
                <li class="essay-li">
                    <a href=""><img src="/static/img/essayPhoto/essay01.png"/></a>
                    <div class="essay-div">
                        <div class="author">
                            <a href=""><img src="/static/img/user.jpg"/></a>
                            <div>
                                <a class="authorName" href="">作者名字</a>
                                <span class="time">07.09 19:04</span>
                            </div>
                        </div>
                        <a href="">海</a>
                        <p>海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿</p>
                        <div class="meta">
                            <a class="essay-type" href="">阅览室</a>
                            <a href="">
                                <i><img src="/static/img/icon/preview.png"/></i>
                                757
                            </a>
                            <a href="">
                                <i><img src="/static/img/icon/comment.png"/></i>
                                20
                            </a>
                            <a>
                                <span>❤</span>
                                120
                            </a>
                        </div>
                    </div>
                </li>
                <li class="essay-li">
                    <a href=""><img src="/static/img/essayPhoto/essay01.png"/></a>
                    <div class="essay-div">
                        <div class="author">
                            <a href=""><img src="/static/img/user.jpg"/></a>
                            <div>
                                <a class="authorName" href="">作者名字</a>
                                <span class="time">07.09 19:04</span>
                            </div>
                        </div>
                        <a href="">海</a>
                        <p>海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿</p>
                        <div class="meta">
                            <a class="essay-type" href="">阅览室</a>
                            <a href="">
                                <i><img src="/static/img/icon/preview.png"/></i>
                                757
                            </a>
                            <a href="">
                                <i><img src="/static/img/icon/comment.png"/></i>
                                20
                            </a>
                            <a>
                                <span>❤</span>
                                120
                            </a>
                        </div>
                    </div>
                </li>
                <li class="essay-li">
                    <a href=""><img src="/static/img/essayPhoto/essay01.png"/></a>
                    <div class="essay-div">
                        <div class="author">
                            <a href=""><img src="/static/img/user.jpg"/></a>
                            <div>
                                <a class="authorName" href="">作者名字</a>
                                <span class="time">07.09 19:04</span>
                            </div>
                        </div>
                        <a href="">海</a>
                        <p>海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿</p>
                        <div class="meta">
                            <a class="essay-type" href="">阅览室</a>
                            <a href="">
                                <i><img src="/static/img/icon/preview.png"/></i>
                                757
                            </a>
                            <a href="">
                                <i><img src="/static/img/icon/comment.png"/></i>
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
        <!--文章-->
        <div class="ul-2 ul-essay off">
            <ul class="essay-list">
                <li class="essay-li">
                    <a href=""><img src="/static/img/essayPhoto/essay01.png"/></a>
                    <div class="essay-div">
                        <div class="author">
                            <a href=""><img src="/static/img/user.jpg"/></a>
                            <div>
                                <a class="authorName" href="">作者名字</a>
                                <span class="time">07.09 19:04</span>
                            </div>
                        </div>
                        <a href="">海</a>
                        <p>海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿</p>
                        <div class="meta">
                            <a class="essay-type" href="">阅览室</a>
                            <a href="">
                                <i><img src="/static/img/icon/preview.png"/></i>
                                757
                            </a>
                            <a href="">
                                <i><img src="/static/img/icon/comment.png"/></i>
                                20
                            </a>
                            <a>
                                <span>❤</span>
                                120
                            </a>
                        </div>
                    </div>
                </li>
                <li class="essay-li">
                    <a href=""><img src="/static/img/essayPhoto/essay01.png"/></a>
                    <div class="essay-div">
                        <div class="author">
                            <a href=""><img src="/static/img/user.jpg"/></a>
                            <div>
                                <a class="authorName" href="">作者名字</a>
                                <span class="time">07.09 19:04</span>
                            </div>
                        </div>
                        <a href="">海</a>
                        <p>海﻿ ——瘦桶 你的辽阔﻿ 足以吞没尘世的卑微﻿ 你对我﻿ 正如我对于你﻿ 一无所知﻿﻿ 当我满目创伤﻿ 站在你面前的时候﻿ 你不能说我一无所有﻿ 你不能说我一无所有﻿﻿</p>
                        <div class="meta">
                            <a class="essay-type" href="">阅览室</a>
                            <a href="">
                                <i><img src="/static/img/icon/preview.png"/></i>
                                757
                            </a>
                            <a href="">
                                <i><img src="/static/img/icon/comment.png"/></i>
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
        <!--动态-->
        <div class="ul-2 ul-dy on">
            动态
        </div>
        <!--最新评论-->
        <div class="ul-2 ul-comment off">
            最新评论
        </div>
        <!--热门-->
        <div class="ul-2 ul-hot off">
            热门
        </div>


    </div>
    <div class="right">
        <ul class="ul-3">
            <li><a>关注的专题</a></li>
            <li><a>喜欢的文章</a></li>
            <li><a>收藏的文章</a></li>
        </ul>
        <div>我创建的专题</div>
        <a>+创建一个新的专题</a>
    </div>
</div>

<script type="text/javascript" src="/static/js/nav.js"></script>
<script type="text/javascript" src="/static/js/essay.js"></script>
<script type="text/javascript" src="/static/js/attention.js"></script>
<script type="text/javascript" src="/static/js/fans.js"></script>
<script type="text/javascript" src="/static/js/user_subject.js"></script>
<script type="text/javascript" src="/static/js/jquery-3.1.0.min.js"></script>
<script>
    function init() {
        nav.changeNav();//导航栏
        Essay.changeEssayDiv();
        attention.changeVal();
        fans.attFun();
        user_subject.changeVal();
        eventFun_user();
        eventNav_2();
        eventUl_3();
    }

    //用户名字下面的事件
    function eventFun_user() {
        var a = document.getElementsByClassName("other");
        for (var i = 0; i < 3; i++) {
            (function (i) {
                a[i].onclick = function () {
                    var ul = document.getElementsByClassName("ul-1");
                    for (var j = 0; j < ul.length; j++) {
                        ul[j].style.display = "none";
                    }
                    if (i == 2) {
                        ul[i].style.display = "block";
                        changeNavFun(5);
                        changeContainFun(5);
                    } else {
                        ul[0].style.display = "block";
                        changeNavFun(i);
                        changeContainFun(i);
                    }

                }
            })(i);
        }
    }

    //二级导航栏事件
    function eventNav_2() {
        var liList = document.getElementsByClassName("h");
        for (var i = 0; i < liList.length; i++) {
            (function (n) {
                liList[n].onclick = function () {
                    changeContainFun(n);
                    changeNavFun(n);
                }
            })(i);
        }
    }

    //ul-3事件
    function eventUl_3() {
        var ul_3 = document.getElementsByClassName("ul-3")[0];
        var a = ul_3.getElementsByTagName("a");
        for (var i = 0; i < a.length; i++) {
            (function (n) {
                a[n].onclick = function () {
                    var ul = document.getElementsByClassName("ul-1");
                    for (var j = 0; j < ul.length; j++) {
                        ul[j].style.display = "none";
                    }
                    ul[1].style.display = "block";
                    changeContainFun(n + 2);
                    changeNavFun(n + 2);
                }
            })(i);
        }
    }

    //对二级导航显示进行切换
    function changeNavFun(n) {
        var liList = document.getElementsByClassName("h");
        var a_off = document.getElementsByClassName("active");
        for (var j = 0; j < a_off.length; j) {
            a_off[j].classList.remove("active");
        }
        liList[n].className = "h active";
    }

    //对内容进行切换函数
    function changeContainFun(n) {
        var ul_on_to_off = document.getElementsByClassName("ul-2 on")[0];
        ul_on_to_off.classList.remove("on");
        ul_on_to_off.classList.add("off");
        var ul = document.getElementsByClassName("ul-2 off")[n];
        ul.classList.remove("off");
        ul.classList.add("on");
    }

    init();
</script>

</body>
</html>
