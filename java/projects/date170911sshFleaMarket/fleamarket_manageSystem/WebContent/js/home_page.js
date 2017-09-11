/**
 * http://usejsdoc.org/
 */
function pageInit(){
	console.log('web page is initializaing...');
	threadImageSlide();
}
function threadImageSlide(){//循环轮播图片-----
	$('#div_recommend').carousel({
		interval: 1000
	});
}