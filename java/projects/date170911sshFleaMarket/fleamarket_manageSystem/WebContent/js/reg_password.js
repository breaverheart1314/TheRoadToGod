/**
 * http://usejsdoc.org/
 */
function isPassword(s)  
{  
	var patrn=/^(\w){6,20}$/;  
	return patrn.test(s);
}  