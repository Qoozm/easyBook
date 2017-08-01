<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>登录-EasyBook</title>
    <link rel="stylesheet" href="../../static/css/public.css" />
    <link rel="stylesheet" href="../../static/css/sign.css" />
</head>
<body>
<div class="L-container">
    <!--图标-->
    <div class="logo">
        <a href="<c:url value="/"/>">
            <img src="../../static/img/logo.png" />
        </a>
    </div>
    <!--登录模块-->
    <div class="main">
		<h4>
            <div class="sign">
                <a class="sign-in on" href="<c:url value="/loginUI"/>">登录</a>
                <b>·</b>
                <a class="sign-up " href="<c:url value="/registerUI"/>">注册</a>
            </div>
        </h4>
        <!--表单，发送请求-->
        <form class="form1" action="<c:url value="/login"/>" method="post" onsubmit="return checkSuccess()">
            <div>
                <input id="user_account" name="user_account" class="div-input" placeholder="手机号/邮箱"/>
            </div>
            <div>
                <input id="user_password" name="user_password" class="div-input" type="password" placeholder="密码"/>
            </div>
            <div>
            	<input class="code" type="button" />
            	<input class="div-input code-input" placeholder="请输入验证码" />
            	<span class="true">√</span>
            	<span class="false">×</span>
            </div>
            <div>
                <input id="rememberMe" name="rememberMe" type="checkbox" value="0"/><span>&nbsp;&nbsp;&nbsp;记住密码</span>
            </div>
            <div>
                <input class="btn-submit" type="submit" value="登录"/>
            </div>
            <div>
            	<!--添加登录失败的返回信息-->
            	<span class="prompt">${result}</span>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript" src="../../static/js/jquery-3.1.0.min.js" ></script>
<script type="text/javascript" src="../../static/js/code.js" ></script>
<script>
	var rememberMe = document.getElementById("rememberMe");
    function init() {
        Code.createCode();	//开始生产验证码
        Code.codeInit();	//初始化验证码空能
        rememberMe.onclick = changeRemeberMeValue;	//记住密码按钮
        isPrompt();
    }
    //修改密码按钮的值
    function changeRemeberMeValue() {
        if (rememberMe.checked) {
            rememberMe.value = "1";
        } else {
            rememberMe.value = "0";
        }
    }
    //验证是否可以提交
    function checkSuccess(){
    	var account = document.getElementById("user_account");
    	var psword  = document.getElementById("user_password");
    	if(Code.flag){
    		if (account.value == "" || psword.value == "") {
	            alert("请输入正确的账号密码！！！");
	            return false;
	        }
    		return true;
    	}else{
    		console.log("aaa");
    		return false;
    	}
    }
    //处理提示信息
    function isPrompt(){
    	var prompt = document.getElementsByClassName("prompt")[0];
    	if(prompt.innerHTML == ""){
    		prompt.style.visibility = "hidden";
    	}else{
    		prompt.style.visibility = "visible";
    	}
    }
    init();
</script>

</body>
</html>