/**
 * http://usejsdoc.org/xt
 */
var div_change = new Array();
var li_change = new Array();
var my_flag = 'nav_zzf_';//
/*获取div内的一级内容div,并把他们都隐藏，对所有div内导航a标签添加事件响应，使a标签的innerHTML的文本与对应的div的id相同，方便及时展现和隐藏*/
function listenToNavigatorDIV(DivID){//事件响应做在li上，而非内部a
	var div_top = document.getElementById(DivID);

//	console.log(DivID+'::doing init navigator:'+div_top);
	//使用原生js响应------
//	//console.log(div_top.firstElementChild.firstElementChild.firstElementChild.id);
	var child_1st_pile_head = div_top.firstElementChild;
//	//console.log(child_1st_pile_head.nextElementSibling.id);
	var li_head = child_1st_pile_head.firstElementChild;
	////console.log(li_head.id);
	//得到所有参与变动的div并隐藏，
	
	var temp_div = child_1st_pile_head.nextElementSibling;
	var i=0;
	while(true){
		if(temp_div == null)
			break;
		div_change[i] = temp_div;
		temp_div.setAttribute("hidden", '');
		//console.log(temp_div+":"+temp_div.getAttribute("id"));
		temp_div = temp_div.nextElementSibling;
		
		i++;
	}
	//console.log(div_change.length);
	//得到所有li响应对象，
	
	for(i=0;i<div_change.length;i++){
		li_change[i] = document.getElementById(my_flag+div_change[i].getAttribute("id"));
	}
	//console.log(li_change.length);
	div_change[0].removeAttribute('hidden');
	for(i=0;i<li_change.length;i++){
		li_change[i].addEventListener("click", function(e) {
			hiddenAllDivAndQuitClass();
			this.setAttribute('class', 'active');
			document.getElementById(this.getAttribute("id").replace(my_flag,'')).removeAttribute('hidden');
		}, false);
	}
}
function hiddenAllDivAndQuitClass(){
	for(var i=0;i<div_change.length;i++){
//		//console.log(div_change[i].hasAttribute("hidden")+':'+div_change[i].getAttribute('hidden'));
		if(!div_change[i].hasAttribute('hidden'))
			div_change[i].setAttribute("hidden", '');
		if(li_change[i].hasAttribute('class'))
			li_change[i].removeAttribute('class');
	}
}