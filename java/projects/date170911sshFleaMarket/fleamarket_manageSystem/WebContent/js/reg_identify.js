function isEmail(str){//this is ,,fuhangxi
	var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/; 
	return reg.test(str); 
}
function isEmail2(str){//blog----csdn:http://www.jb51.net/article/31182.htm
	var szReg=/^[A-Za-zd]+([-_.][A-Za-zd]+)*@([A-Za-zd]+[-.])+[A-Za-zd]{2,5}$/; 
	var bChk=szReg.test(str); 
	return bChk; 
}
function isEmail3(str){//bokeyuan::::http://www.cnblogs.com/mazey/p/6523917.html
	var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //正则表达式
	return reg.test(str);
}
function isEmail4(str){
	var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
	return reg.test(str);
	}
function isEmail5(email) {
	 if ( email == "") {
	  return false;
	 } else {
	  if (! /^[\w\-\.]+@[\w\-\.]+(\.\w+)+$/.test(email)) {
	   return false;
	  }
	 }
	 return true;
}
/*------------------------------------------------------------检查手机号------------------------------------*/
function isPhone(phone){ 
    if(!(/^1[34578]\d{9}$/.test(phone))){ 
//        alert("手机号码有误，请重填");  
        return false; 
    } 
    return true;
}
function isPhone2(phone){ 
//    var phone = document.getElementById('phone').value;
    if(!(/^1(3|4|5|7|8)\d{9}$/.test(phone))){ 
        console.log("手机号码有误，请重填");  
        return false; 
    } 
    return true;
}
function isPhone3(str){//验证130-139,150-159,180-189号码段的手机号码
	var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/; 
	if(!myreg.test(str)) {
//		console.log('phone-err');
		return false; 
	}
	return true;
}
function isPhone4(str){
	var reg = new RegExp("/^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/");
	if(reg.test(str))
		return true;
	return false;
}
/*===============================检查固定号==================================================*/
function checkTel(){
	 var tel = document.getElementById('tel').value;
	if(!/^(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}$/.test(tel)){
	console.log('固定电话有误，请重填');
	return false;
	}
	return true;
}