<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>flea-market-nuc</title>
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
<link rel="stylesheet" type="text/css" href="../css/home_page.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/home_page.js"></script>
<link rel="stylesheet" type="text/css" href="../css/tree3_csdn.css">
</head>
<body>
	<div id="div_top">
		<span id="span_login"><a href="#">login</a></span>
		<div class="input-group" id="div_search">
			<input type="text" class="form-control input-lg" id="input_search"><span
				class="input-group-addon btn btn-primary">搜索</span>
		</div>
	</div>
	<div id="div_recommend" class="carousel slide">
		<!-- 轮播（Carousel）指标 -->
		<ol class="carousel-indicators" id="choose_radius">
			<li data-target="#div_recommend" data-slide-to="0" class="active"></li>
			<li data-target="#div_recommend" data-slide-to="1"></li>
			<li data-target="#div_recommend" data-slide-to="2"></li>
		</ol>
		<!-- 轮播（Carousel）项目 -->
		<div class="carousel-inner" id="div_imgs">
			<div class="item active">
				<a href="#"><img src="../res/image/recommend_images/tt1.jpg"
					alt="First slide"></a>
				<div class="carousel-caption">
					<span>&copy;&copy;&copy;</span>
				</div>
			</div>
			<div class="item">
				<a href="#"><img src="../res/image/recommend_images/tt2.jpg"
					alt="Second slide"></a>
				<div class="carousel-caption">
					<span>&copy;&copy;&copy;</span>
				</div>
			</div>
			<div class="item">
				<a href="#"><img src="../res/image/recommend_images/tt3.jpg"
					alt="Third slide"></a>
				<div class="carousel-caption">
					<span>&copy;&copy;&copy;</span>
				</div>
			</div>
		</div>
		<!-- 轮播（Carousel）导航 -->
		<a class="carousel-control left" href="#div_recommend"
			data-slide="prev">&lsaquo;</a> <a class="carousel-control right"
			href="#div_recommend" data-slide="next">&rsaquo;</a>
	</div>
	<div id="div_center">
		<div id="div_classify">
			<ol><!-- 这里的命名有规则，，，，css需要靠它来完成布局 -->
				<li class="li_1st"><label for="subfolder1_sub1">生活用品</label> <input
					id="subfolder1_sub1" name="1" type="radio" />
					<ol>
						<li class="file"><label for="subfolder1_sub11">出行</label> <input
							id="subfolder1_sub11" name="11" type="radio" />
							<ol>
								<li class="file"><a>自行车</a></li>
								<li class="file"><a>公交卡</a></li>
							</ol>
						</li>
						<li class="file"><label for="subfolder1_sub12">服装</label> <input
							id="subfolder1_sub12" name="11" type="radio" />
							<ol>
								<li class="file"><a>儿童</a></li>
								<li class="file"><a>成人</a></li>
							</ol>
						</li>
					</ol></li>
				<li class="li_1st"><label for="subfolder1_sub2">学习用品</label> <input
					id="subfolder1_sub2" name="1" type="radio" />
					<ol>
						<li class="file"><a>书籍</a></li>
					</ol></li>
			</ol>
		</div>
		<div id="div_goodsShow">
			<!-- 物品展示列表，小方格 -->
			<%
				for (int i = 1; i <= 12; i++) {
			%>
			<div id="div_goods_<%=i%>" class="goods_peer"></div>
			<%
				}
			%>
			<div id="div_paging">
				<nav aria-label="Page navigation">
					<ul class="pagination" id="ul_pagination">
						<li><a href="#" aria-label="Previous" id="page_previous">
								<span aria-hidden="true">&laquo;</span>
						</a></li>
						<li><a href="#" id="page_1">1</a></li>
						<li><a href="#" id="page_2">2</a></li>
						<li><a href="#" id="page_3">3</a></li>
						<li><a href="#" id="page_4">4</a></li>
						<li><a href="#" id="page_5">5</a></li>
						<li><a href="#" aria-label="Next" id="page_next"> <span
								aria-hidden="true">&raquo;</span></a></li>
					</ul>
				</nav>
			</div>
		</div>
		<div id="div_webSiteAbout">网站相关功能：公告，新闻，快捷功能</div>
	</div>
	<script type="text/javascript">
		if (window.addEventListener) {
			console.log('the browser can bind listener');
			window.addEventListener('load', pageInit, false);
		} else {
			console.log('this browser cannot bind listener');
		}
	</script>
</body>
</html>