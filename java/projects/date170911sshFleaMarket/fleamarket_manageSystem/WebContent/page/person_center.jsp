<!-- 使用web socket进行数据推送，实时更新 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>person-center</title>
<!-- 引入 Bootstrap -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
<!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
<!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
<link rel="stylesheet" type="text/css" href="../css/person_center.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
<script	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/navigator_controller.js"></script>
<script type="text/javascript" src="../js/person_center.js"></script>
</head>
<body>
<div id="div_top">
11
</div>
<!-- 这里只引用了样式，自己写个js代码实现动态 -->
	<div id="navigator_div" role="navigation">
		<ul class="nav nav-tabs" id="nav_ul">
			<li role="presentation" class="active" id="nav_zzf_personal_info"><a href="#">个人信息</a></li>
			<li role="presentation" id="nav_zzf_goods_manage"><a href="#">物品管理</a></li>
			<li role="presentation" id="nav_zzf_account_bind"><a href="#">帐号绑定</a></li>
			<li role="presentation" id="nav_zzf_password_protect"><a href="#">密码保护</a></li>
		</ul><!-- li的内部a标签的id的命名格式与需要展示的div的ID相关,方便js代码定位和操作 -->
		<div id="personal_info" class="content_nav">
			<!-- 个人信息： 1.基本信息填写，上传头像 -->
			<div id="person_info_left">
				<div class="panel-group" id="accordion">
					<div class="panel panel-default" id="function_div_p1">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion"
									href="#collapseOne">信息管理</a>
							</h4>
						</div>
						<div id="collapseOne" class="panel-collapse collapse in">
							<!-- <div class="panel-body">内容1 -->
							<ul id="child_ul_1st">
								<li><a>查看信息</a></li>
								<li><a>完善信息</a></li>
								<li><a>上传头像</a></li>
							</ul>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion"
									href="#collapseTwo">与我相关：备</a>
							</h4>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse">
							<div class="panel-body">内容2</div>
						</div>
					</div>
				</div>
			</div>
			<div id="person_info_right">
				<div id="watch_person_info">
					<s:form>
						<s:label name="name" label="姓名"></s:label>
						<s:label name="account" label="帐号"></s:label>
						<s:label name="age" label="年龄"></s:label>
						<s:label name="registe_date" label="加入时间"></s:label>
						<s:label name="take_money" label="花费"></s:label>
					</s:form>
				</div>
			</div>
		</div>
		<div id="goods_manage" class="content_nav">2</div>
		<div id="account_bind" class="content_nav">3</div>
		<div id="password_protect" class="content_nav">4</div>
	</div>
<script type="text/javascript">
	if(window.addEventListener){window.addEventListener('load', webInit, false)}else{
		console.log('the browser is binding listener');
	}
</script>
</body>
</html>