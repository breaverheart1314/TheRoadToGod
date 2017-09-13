var account_isLegal = false;
var password_isLegal = false;


/**
 * http://usejsdoc.org/
 */
function webInit(){
	old_code();
	accounInputInit();
	dealWithPassword();
	dealWithBtnLogin();
	dealWithRegister();
}
function dealWithRegister(){
	console.log('listen for register btn');
	$('#register').on('click',function(){
		window.location.href="../page/register_user_public.jsp";
	});
}
function dealWithBtnLogin(){
	console.log('do listen btn-login');
	$('#login_immediately').on('click',function(){
		console.log('you click btn - login');
		if(account_isLegal&&password_isLegal){
			$.ajax({
				type: "post",
				url:"../login_loginForEmail",
				data:{email:$('#account').val(),password:$('#password').val()},
				success:function(data){
					console.log('this communicate success:'+data);
					var str = $.trim(data);
					if(str == "password-error"){
						$('#tips_login_btn').html('your password of input is error');
					}else if(str == "login-success"){
						window.location.href="../page/home_page.jsp";
					}else{//non-email
						$('#tips_login_btn').html('the email is non exist,you can reinput,or register one');
					}
				},
				error:function(data){
					console.log('this communication is fail:'+data);
				}
			});
		}else{
			$('#tips_login_btn').html('please input these informations complete');
		}
	});
}
function dealWithPassword(){
	console.log('listen to password--');
	$('#password').bind('input propertychange',function(){
		if(isPassword($('#password').val())){
			console.log('the password is legal');
			password_isLegal = true;
		}else{
			password_isLegal = false;
			console.log('the password is non-legal');
		}
	});
}


function accounInputInit(){//如果在页面中没有显示声明class属性，在js操作时，就需要手动添加
	console.log('listener on the input for email/phone::'+$('#account').val());
	$('#account_tips').addClass('label_right_input');
	firebox_account();
	$('#account').bind('input propertychange',function(){
		console.log('--input-account::');
		firebox_account();
	});
}
function firebox_account(){//火狐浏览器在初始化时不检查原先的缓存，，需要先执行一下
	if(isPhone3($('#account').val())){
		$('#account_tips').attr('class','label_right_input');
		$('#account_tips').html('this is a phone');
		account_isLegal = true;
	}else if(isEmail4($('#account').val())){
		account_isLegal = true;
		$('#account_tips').attr('class','label_right_input');
		$('#account_tips').html('this is a email');
	}else{
		account_isLegal = false;
		$('#account_tips').attr('class','label_error_input');
		$('#account_tips').html('the input is invalid');
	}	
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