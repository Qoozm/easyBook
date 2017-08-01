<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>某个专题页</title>
	<link rel="stylesheet" href="../static/css/nav.css" />
	
	<style type="text/css">
		
		.container {
            position: absolute;
            top: 60px;
            width: 900px;
            left: 50%;
            margin-left: -450px;
            z-index: -1;
            
            height: 800px;
            /*background-color: firebrick;*/
        }
		
	</style>
	
</head>
<body>

	<!--用户已经登录-->
	<nav id="onUser">
		<!--左侧LOGO-->
		<div class="left">
			<a href="index.html">
				<img src="../static/img/logo.png" alt="LOGO" />
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
						<input type="text" />
						<a href=""><img src="../static/img/find.png" /></a>
					</div>
				</li>
			</ul>
		</div>
		<!--右侧用户-->
		<div class="right">
			<ul>
				<li>
					<a id="userName" class="user-icon a-font" href="">
						<span id="user_name" style="display: none;"></span>
						<img src="../static/img/user.jpg" />
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
	<!--用户没有登录-->
	<nav id="noUser" style="display: none;">
		<!--左侧LOGO-->
		<div class="left">
			<a href="index.html">
				<img src="../static/img/logo.png" alt="LOGO" />
			</a>
		</div>
		<!--中部功能-->
		<div class="center">
			<ul>
				<li><a class="a-font" href="#">发现</a></li>
				<li>
					<div class="find">
						<input type="text" />
						<a href=""><img src="../static/img/find.png" /></a>
					</div>
				</li>
			</ul>
		</div>
		<!--右侧用户-->
		<div class="right">
			<ul>
				<li>
					<a class="sign-in" href="">登录</a>
				</li>
				<li>
					<a class="sign-up" href="">注册</a>
				</li>
				<li>
					<a class="write" href="">写文章</a>
				</li>
			</ul>
		</div>
	</nav>
	
	<div class="container">
		
	</div>
	
	<script type="text/javascript" src="../static/js/nav.js" ></script>
	<script type="text/javascript" src="../static/js/jquery-3.1.0.min.js" ></script>
	<script>
		function init(){
			nav.changeNav();
		}
		
		init();
	</script>
	

</body>
</html>
