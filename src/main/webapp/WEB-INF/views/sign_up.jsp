<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>注册-EasyBook</title>
    <link rel="stylesheet" href="../../static/css/public.css" />
    <link rel="stylesheet" href="../../static/css/sign.css" />
</head>
<body>
<div class="L-container">
    <!--LOGO-->
    <div class="logo">
        <a href="<c:url value="/"/>">
            <img src="../../static/img/logo.png" />
        </a>
    </div>
    <!--注册模块-->
    <div class="main">
        <h4>
            <div class="sign">
                <a class="sign-in " href="<c:url value="/loginUI"/>">登录</a>
                <b>·</b>
                <a class="sign-up on" href="<c:url value="/registerUI"/>">注册</a>
            </div>
        </h4>
        <!--表单提交，需要提交的位置-->
        <form class="form1" action="<c:url value="/register"/>" method="post" onsubmit="return checkNone()">
            <div>
                <input id="user_name" name="user_name" class="div-input" placeholder="昵称"/>
            </div>
            <div>
                <input id="user_phone" name="user_phone" class="div-input" placeholder="手机号"/>
            </div>
            <div>
                <input id="user_email" name="user_email" class="div-input" type="email" placeholder="邮箱"/>
            </div>
            <div>
                <input id="user_password" name="user_password" class="div-input" class="text-left" type="password" placeholder="密码"/>
            </div>
            <div>
            	<input class="code" type="button" />
            	<input class="div-input code-input" placeholder="请输入验证码"/>
            	<span class="true">√</span>
            	<span class="false">×</span>
            </div>
            <div>
                <input class="btn-submit" type="submit" value="注册"/>
            </div>
        </form>
    </div>
</div>

<script type="text/javascript" src="../../static/js/jquery-3.1.0.min.js" ></script>
<script type="text/javascript" src="../../static/js/code.js" ></script>
<script>
    var userName = document.getElementById("user_name");
    var phone = document.getElementById("user_phone");
    var email = document.getElementById("user_email");
    var psword = document.getElementById("user_password");

    function init() {
    	Code.createCode();	//开始生产验证码
        Code.codeInit();	//初始化验证码空能
        check();
    }
    //验证昵称手机号邮箱的正确性
    function check() {
        userName.onblur = checkName;
        phone.onblur = checkPhone;
        email.onblur = checkEmail;
    }
    //验证提交时数据是否可以提交
    function checkNone() {
        //判断是否输入了验证码
        if (userName.value == "" || phone.value == "" || email.value == "" || psword.value == "") {
            alert("请输入完整信息！！！");
            return false;
        }else if(Code.flag){
            return true;
        }else{
            alert("请输入完整信息！！！");
            return false;
        }
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
                url: '/register/checkName',	//servlet路径
                async: true,
                dataType: 'json',
                contentType: 'application/json',
                data: JSON.stringify({user_name: userName.value}),
                success: function (data) {
                    if (data.result) {	//返回true表示昵称不重复

                    } else {
                        userName.style.borderColor = "red";
                        userName.value = "";
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
                url: '/register/checkPhone',	//servlet路径
                async: true,
                dataType: 'json',
                contentType: 'application/json',
                data: JSON.stringify({user_phone: phone.value}),
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
        var pattern = /^[a-zA-Z1-9]+\w*@[a-zA-Z]{1,5}.[a-zA-Z]{2,5}$/;
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
                url: '/register/checkEmail',	//servlet路径
                async: true,
                dataType: 'json',
                contentType: 'application/json',
                data: JSON.stringify({user_email: email.value}),
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
