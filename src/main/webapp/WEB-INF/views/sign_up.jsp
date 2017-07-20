<%--
  Created by IntelliJ IDEA.
  User: colin
  Date: 2017/7/15
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>注册-EasyBook</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/static/css/public.css"/>
    <link rel="stylesheet" href="/static/css/sign.css"/>
</head>
<body>
<div class="L-container">
    <!--LOGO-->
    <div class="logo">
        <a href="#">
            <img src="#"/>
        </a>
    </div>
    <!--注册模块-->
    <div class="main">
        <h4>
            <div class="sign">
                <a class="sign-in " href="/loginUI">登录</a>
                <b>·</b>
                <a class="sign-up on" href="/registerUI">注册</a>
            </div>
        </h4>
        <!--表单提交，需要提交的位置-->
        <form class="form1" action="/register" method="post" onsubmit="return checkNone()">
            <div>
                <input id="userName" name="user_name" class="text-left" type="text" placeholder="昵称"/>
            </div>
            <div>
                <input id="phone" name="user_phone" class="text-left" type="text" placeholder="手机号"/>
            </div>
            <div>
                <input id="email" name="user_email" class="text-left" type="email" placeholder="邮箱"/>
            </div>
            <div>
                <input id="psword" name="user_password" class="text-left" type="password" placeholder="密码"/>
            </div>
            <div>
                <input class="btn btn-success btn-submit" type="submit" value="注册"/>
            </div>
        </form>
    </div>
</div>

<script type="text/javascript" src="/static/js/jquery-3.1.0.min.js"></script>
<script>
    var userName = document.getElementById("userName");
    var phone = document.getElementById("phone");
    var email = document.getElementById("email");
    var psword = document.getElementById("psword");

    function init() {
        check();
    }
    //验证昵称手机号邮箱的正确性
    function check() {
        console.log(userName);
        console.log(phone);
        console.log(email);
        userName.onblur = checkName;
        phone.onblur = checkPhone;
        email.onblur = checkEmail;
    }
    //验证提交时数据是否为空
    function checkNone() {
        //只要有一项为空返回false
        if (userName.value == "" || phone.value == "" || email.value == "" || psword.value == "") {
            alert("请输入完整信息！！！");
            return false;
        }
        return true;
    }
    //验证昵称
    function checkName() {
        if (userName.value == "") {
            userName.style.borderColor = "red";
            userName.placeholder = "请输入昵称";
        } else {
            userName.placeholder = "昵称";
            userName.style.borderColor = "#CCCCCC";
            //后台数据交互验证昵称码是否重复
            $.ajax({
                type: "post",
                url: '/register/checkname',	//servlet路径
                async: true,
                dataType: 'json',
                contentType: 'application/json',
                data: JSON.stringify({userName: userName.value}),
                success: function (data) {
                    if (data.result) {	//返回true表示昵称不重复

                    } else {
                        userName.style.borderColor = "red";
                        userName.value = ""
                        userName.placeholder = "昵称已注册";
                    }
                },
                error: function (err) {
                    console.log(err.message);
                }
            });
        }

    }
    //验证手机号码
    function checkPhone() {
        //验证手机号正则表达式
        var pattern = /^1[3|4|5|8][0-9]\d{8}$/;
        if (!pattern.test(phone.value)) {
            phone.style.borderColor = "red";
            phone.value = "";
            phone.placeholder = "非法手机号";
        } else {
            phone.placeholder = "手机号";
            phone.style.borderColor = "#CCCCCC";
            //后台数据交互验证手机号码是否重复
            $.ajax({
                type: "post",
                url: '/register/checkphone',	//servlet路径
                async: true,
                dataType: 'json',
                contentType: 'application/json',
                data: JSON.stringify({phone: phone.value}),
                success: function (data) {
                    if (data.result) {	//返回true表示电话号码不重复

                    } else {
                        phone.style.borderColor = "red";
                        phone.value = ""
                        phone.placeholder = "手机号已注册";
                    }
                },
                error: function (err) {
                    console.log(err.message);
                }
            });
        }
    }
    //验证邮箱
    function checkEmail() {
        //验证邮箱正则表达式
        var pattern = /^[a-zA-Z1-9]+\w*@[a-zA-Z]{1,5}.[a-zA-Z]{2,5}$/
        if (!pattern.test(email.value)) {
            email.style.borderColor = "red";
            email.value = "";
            email.placeholder = "非法邮箱";
        } else {
            email.placeholder = "邮箱";
            email.style.borderColor = "#CCCCCC";
            //后台数据交互，验证邮箱是否重复
            $.ajax({
                type: "post",
                url: '/register/checkemail',	//servlet路径
                async: true,
                dataType: 'json',
                contentType: 'application/json',
                data: JSON.stringify({email: email.value}),
                success: function (data) {
                    if (data.result) {	//返回true表示邮箱不重复

                    } else {
                        email.style.borderColor = "red";
                        email.value = ""
                        email.placeholder = "邮箱已注册";
                    }
                },
                error: function (err) {
                    console.log(err.message);
                }
            });
        }
    }
    init();
</script>

</body>
</html>
