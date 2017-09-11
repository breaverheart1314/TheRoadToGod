var submit_show = -2;//每完成一项输入时，+1，当为0时，提交按钮出现
//上面会造成下限计数无限
var submit_ic = false,submit_email=false;
var local_random_num = produceOneRandom(1000, 9874);//这个当来的方法有缺陷，会抛跑出上界限
var email_ic = 666;//
//---------------------------email-----exist----------------is or not-------------------
var email_is_exist = false;
function webPageInit(){
	console.log('do initialize web event-listener');
	dealWithEmailInput();
	dealWithVerifactionCodeLocal();
	dealWithBtnRefresh();
	dealWidthSubmit();
	dealWithEmailICInput();
	dealWithPasswordInput();
}
function dealWithBtnRefresh(){
	$('#btn_refresh').click(function(){
		local_random_num = produceOneRandom(1000, 9999);
		$('#verify_code').html(local_random_num);
		if($('#verific_code').val() !== local_random_num)
			$('#submit').hide();
	});
}
function dealWithVerifactionCodeLocal(){
//	console.log('---do--verify--'+local_random_num);
	$('#verify_code').html(local_random_num);
	$('#verific_code').bind('input propertychange',function(){
//		console.log($('#verific_code').val());
		if($('#verific_code').val() == local_random_num)
			submit_ic = true;
		else
			submit_ic = false;
		showSubmit();
	});
}
function dealWithEmailInput(){
	$('#email').bind('input propertychange',function(){
//		console.log('produce a input:'+isEmail4($('#email').val())+"content::"+$('#email').val());
		if(email_is_exist){
			$('#email_tips').html('...');
			email_is_exist  = false;
		}
		if(isEmail4($('#email').val())){
//			console.log('right-email');
			submit_email = true;
		}else{
//			console.log('error-email');
			submit_email = false;
		}
		showSubmit();
	});
}
function showSubmit(){
//	console.log('submit::'+submit_show);
	if(submit_ic && submit_email){
		$('#submit').show();
	}else{
		$('#submit').hide();
	}
}
function dealWithEmailICInput(){
	$('#ic').bind('input propertychange',function(){
		if($('#ic').val() == email_ic){
			$('#ic').attr('cssClass','green_ic');
			$('#ic').attr('disabled','');
			$('#password').removeAttr('disabled');
		}else
			$('#register_email').hide();
	});
}
function dealWithPasswordInput(){
	$('#password').bind('input propertychange',function(){
//		console.log('current-pw-input:'+isPassword($('#password').val()));
		if(isPassword($('#password').val())){
			$('#register_email').show();
		}else{
			$('#register_email').hide();
		}
	});
}
//=========================================下面进行与服务器数据交互===================================
function dealWidthSubmit(){
	$('#submit').click(function(){
		console.log('ajax to  server');
		$.ajax({
			type:"post",
			url:"../sendicfromEmail",
			data:{
				email:$('#email').val()
			},
			success:function(data_r){
//				console.log(data_r+"zm:"+$.trim(data_r));
				if(data_r == 'is-exist'){
					console.log('the email is exist');
					email_is_exist = true;
					$('#email_tips').html('the email is exist,you can find password back or change a email');
				}else{
					email_ic = parseInt(data_r);
					$('#field_email').hide();
					$('#div_email_register_second').show();
					$('#password').attr('disabled','');
					console.log('++:'+$('#email').val());
					$('#email_hide').val($('#email').val());
				}
			},
			error:function(e){console.log('error:'+e);}
		});
	});
}