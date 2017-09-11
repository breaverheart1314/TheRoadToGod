/**
 * http://usejsdoc.org/
 */
function webInit(){
	old_code();
}
function old_code(){
	console.log('。。。');
	/*bootstrap下拉控件的控制代码*/
	$('.dropdown-toggle').dropdown();
	/*密码登录和验证码登录方式的切换*/
	$('#login_for_password').click(function() {
		$('#div_login_idcode').hide();
		$('#div_login_password').show();
	});
	$('#login_for_identifycode').click(function() {
		$('#div_login_password').hide();
		$('#div_login_idcode').show();
	});
	// 对鼠标经过第三方合作标图时修改
	/*var list_icon = [ 'qq', 'weixin', 'xinlang', 'baidu' ];
	$('#qq').mouseover(function() {
		$('#qq').attr('src', 'qq.jpg');
	});
	$('#weixin').mouseover(function() {
		$('#weixin').attr('src', 'weixin.jpg');
	});
	$('#xinlang').mouseover(function() {
		$('#xinlang').attr('src', 'xinlang.jpg');
	});
	$('#baidu').mouseover(function() {
		$('#baidu').attr('src', 'baidu.jpg');
	});
	$('#qq').mouseout(function() {
		$('#qq').attr('src', 'qq_normal.jpg');
	});
	$('#weixin').mouseout(function() {
		$('#weixin').attr('src', 'weixin_normal.jpg');
	});
	$('#xinlang').mouseout(function() {
		$('#xinlang').attr('src', 'xinlang_normal.jpg');
	});
	$('#baidu').mouseout(function() {
		$('#baidu').attr('src', 'baidu_normal.jpg');
	});*/
}