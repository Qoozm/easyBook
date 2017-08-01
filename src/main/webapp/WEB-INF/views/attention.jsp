<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>关注-EasyBook</title>
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
        .container>.left{
        	position: fixed;
        	float: left;
        	width: 20%;
        	border-right: #CCCCCC solid 1px;
        	height: 100%;
        }
        .container>.right{
        	float: right;
        	width: 70%;
        }
	</style>
	
</head>
<body>
	<nav id="onUser">
		<!--左侧LOGO-->
		<div class="left">
			<a href="index.html">
				<img src="../static/img/logo.png" />
			</a>
		</div>
		<!--中部功能-->
		<div class="center">
			<ul>
				<li><a class="a-font " href="#">发现</a></li>
				<li><a class="a-font active" href="#">关注</a></li>
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
						<span id="user_name" style="display: none;">xxx</span>
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
	
	<div class="container">
		<div class="left">
			
		</div>
		<div class="right">
			
		</div>
	</div>
	
	<script type="text/javascript" src="../static/js/nav.js" ></script>
	<script>
		function init(){
			nav.changeNav();//导航栏
		}
		
		init();
	</script>
</body>
</html>
