<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>flea-market-nuc-login</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<!-- 引入 jQuery Mobile 样式 -->
<link rel="stylesheet"	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<!-- 引入 jQuery 库 -->
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<!-- 引入 jQuery Mobile 库 -->
<script	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<!-- 引入 Bootstrap -->
<link	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"	rel="stylesheet">
<!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
<!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
<!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.js"></script>
<!-- 引入本地库 -->
<!-- 自定义文件导入 -->
<link rel="stylesheet" type="text/css"	href="../css/login_user_public.css">
<script type="text/javascript" src="../js/login_user_public.js"></script>
</head>
<body>
	<div id="top"><span><a href="#">back to home-page</a></span></div>
	<div id="div1">	<img src="../res/image/login/register_background.png" alt="中北大学跳蚤市场管理系统" ></div>
	<div id="div2">
		<div id="div3">
			<div id="div4">
				<span id="span1"><a href="#" title="密码登录"		id="login_for_password">密码登录</a> <a href="#" title="验证码登录"	id="login_for_identifycode">验证码登录</a> </span>
				<div id="div_login_password">
					<div id="div_line_left"></div><br> 
					<input type="text" name="account"	placeholder="请输入常用手机号/邮箱" maxlength="50" id="account"> <label id="account_tips">&nbsp;</label>
					<input type="password" name="password" placeholder="请输入密码" id="password">
					<label id="password_tips">&nbsp;</label> <a href="#">忘记密码？</a>
				</div>
				<div id="div_login_idcode" hidden="hidden">
					<div id="div_line_right"></div>	<br>
					<div class="input-group">
						<span class="dropdown" id="span1"> <a	class="dropdown-toggle" data-toggle="dropdown" href="#">00886<b class="caret"></b></a>
							<ul class="dropdown-menu"><li><a href="#">...</a></li><!-- <li class="divider"></li>这个是条分割线 --></ul>
						</span> <input type="text" name="phone" id="phone" data-role="none"		placeholder="请输入常用手机号">
					</div><br>
					<div id="div8">
						<input type="text" name="" placeholder="请证明你不是机器人"		data-role="none"> <span>图形码</span>
					</div><br>
					<div class="input-group">
						<input type="text" class="form-control" placeholder="请输入验证码" 	id="input2"> <span class="input-group-btn" id="span3">
							<button class="btn btn-default" type="button">获取验证码</button>
						</span>
					</div>
				</div>
				<div id="div9">	<button>立即登录</button>	</div>
			</div>
			<div id="div5">	<table id="table1">	<tr><td></td></tr></table></div>
			<div id="div6">
				<span>还没有账号：</span><br> <span> <a href="#"	data-role="button" data-icon="arrow-r" data-iconpos="right">立即注册</a>
				</span> <span>使用以下账号直接登录:</span> <br> <span> 
				<a href="#" id="qq_a" title="qq">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>&nbsp; 
				<a href="#" id="weixin_a" title="微信">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>&nbsp; 
				<a href="#" id="xinlang_a" title="新浪">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>&nbsp; 
				<a href="#" id="baidu_a" title="百度">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
				</span>
			</div>
		</div>
	</div>
<!-- 加载完页面布局需要执行的js -->
<script type="text/javascript">
	$(document).ready(function() {webInit();});/* confirm("1");-确认-取消框 */	
</script>
</body>
</html>