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