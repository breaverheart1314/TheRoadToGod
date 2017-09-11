	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>flea-market-of-nuc</title>
<link rel="stylesheet" type="text/css" href="../css/register_user_public.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="../js/reg_identify.js"></script>
<script type="text/javascript" src="../js/reg_password.js"></script>
<script type="text/javascript" src="../js/random.js"></script>
<script type="text/javascript" src="../js/register_user_public.js"></script>
</head>
<body>
<hr>
	<div id="div_chooseWay">
		<span><a href="#">register from email</a></span>
		<span><a href="#">register from phone</a></span>
	</div>
	<div id="div_emailWay"><!-- 这个div用来实现邮箱注册 -->
		<fieldset id="field_email">
			<legend>use email to register</legend>
			<s:form action="#" method="post">
			<s:label value="..." id="email_tips"></s:label>
			<s:textfield name="email_t" label="email" id="email" maxLength="50" placeholder="please keydown your email"></s:textfield>
			<label>verification-code:<span id="verify_code">****</span></label>
			<input type="text" value="" name="verific_code" id="verific_code" placeholder="please input verification code">
			<input type="button" value="refresh" id="btn_refresh">
			</s:form>
			<div id="div_submit">
				<input type="button" id="submit" value="--send a verificatonCode to your email--" hidden="" />
			</div>
		</fieldset>
		<div id="div_email_register_second" hidden="" >
			<fieldset>
				<legend>please input the ic  that you get from email</legend>
				<s:textfield name="ic" id="ic" placeholder="please input verification code" label="IdentifyCode" ></s:textfield>
				<s:form action="../registerFromEmail" method="post">
					<s:textfield name="email" id="email_hide"  value="email-previous" hidden=""></s:textfield>
					<s:password name="password" placeholder="please input password" id="password" label="password" disabled=""></s:password>
					<s:submit label="11" value="register at once" id="register_email" hidden=""></s:submit>
				</s:form>
			</fieldset>
		</div>
	</div>
<hr>
</body>
<script type="text/javascript">
if(window.addEventListener){//这个所有js加载完成需要在window的load事件后，而不是document.ready
	window.addEventListener("load", webPageInit, false);
}else{
	console.log('cannot bind listener');
}
</script>
</html>