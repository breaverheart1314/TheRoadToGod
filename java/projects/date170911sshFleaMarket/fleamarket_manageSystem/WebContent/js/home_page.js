/**
 * http://usejsdoc.org/
 */
function pageInit(){
	console.log('web page is initializaing...');
	threadImageSlide();
	search();
	loginOrPersonCenter();
}
function loginOrPersonCenter(){
	console.log('start listen login or person center:'+$('#login_or_pc').innerText+":"+$('#span_login').innerHTML+":"+$('#login_or_pc').value);
//	setInterval(function(){console.log('::'+document.getElementById('login_or_pc').innerText);},2000);
	$('#login_or_pc').on('click',function(){
		/*console.log($('#login_or_pc').innerText);
		return ;*/
		if(document.getElementById('login_or_pc').innerText === 'login'){
			console.log('is not logined');
			window.location.href='../page/login_user_public.jsp';
		}else{
			console.log('user was logined');
			window.location.href="../page/person_center.jsp";
		}
	});
}
function threadImageSlide(){//循环轮播图片-----
	$('#div_recommend').carousel({
		interval: 1000
	});
}
function search(){
	console.log('sou suo .........');
	$('#search').on('click',function(){
		console.log('doing search.');
		$.ajax({
			type:'post',
			url:'../homePage_checkActionContext',
			data:{},
			success:function(data){
				console.log('s:'+data);
			},
			error:function(data){
				console.log('e:'+data);
			}
		});
	});
}