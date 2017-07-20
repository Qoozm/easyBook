<%--
  Created by IntelliJ IDEA.
  User: colin
  Date: 2017/7/15
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>登录-EasyBook</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css"/>
    <link rel="stylesheet" href="/static/css/public.css"/>
    <link rel="stylesheet" href="/static/css/sign.css"/>
</head>
<body>
<div class="L-container">
    <!--图标-->
    <div class="logo">
        <a href="#">
            <img src="#"/>
        </a>
    </div>
    <!--登录模块-->
    <div class="main">
        <h4>
            <div class="sign">
                <a class="sign-in on" href="/loginUI">登录</a>
                <b>·</b>
                <a class="sign-up " href="/registerUI">注册</a>
            </div>
        </h4>
        <!--表单，发送请求-->
        <form class="form1" action="/login" method="post" onsubmit="return checkNone()">
            <div>
                <input id="account" name="account" class="text-left" type="text" placeholder="手机号/邮箱"/>
            </div>
            <div>
                <input id="psword" name="password" class="text-left" type="password" placeholder="密码"/>
            </div>
            <div>
                <input style="margin-top: -2px;" id="remeberme" name="remeberme" type="checkbox" value="0"/><span>&nbsp;&nbsp;&nbsp;记住密码</span>
                <br/>
                <br/>
            </div>
            <div>
                <input class="btn btn-success btn-submit" type="submit" value="登录"/>
            </div>
            <br/>
            <br/>
        </form>
    </div>
</div>
<script type="text/javascript" src="/static/js/jquery-3.1.0.min.js"></script>
<script>
    var account = document.getElementById("account");
    var psword = document.getElementById("psword");
    var btn = document.getElementById("btn");
    var remeberMe = document.getElementById("remeberme");
    function init() {
        remeberMe.onclick = changeValue;
    }
    //验证是否为空
    function checkNone() {
        if (account.value == "" || psword.value == "") {
            alert("请输入正确的账号密码！！！");
            return false;
        }
        return true;
    }
    function changeValue() {
        if (remeberMe.checked) {
            remeberMe.value = "1";
        } else {
            remeberMe.value = "0";
        }
    }
    init();
</script>

</body>
</html>
