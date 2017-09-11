package com.fleamarket.action;

import java.io.IOException;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;


import com.fleamarket.dao.PersonInfoDao;
//import com.fleamarket.domain.PersonInfo;
import com.fleamarket.util.FourFigures;
import com.fleamarket.util.SendEmail;

//import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

//import net.sf.json.JSONObject;

public class SendIC_forEmail extends ActionSupport implements ServletRequestAware {
	/**
	 * 这个action就用struts来管理了，而非spring
	 * 对于Struts2中Action中返回字符串的处理，比如做级联时，就可能用到返回json(字符串)的数据，
	 * 些时Action该返回字符串,其实：让Action中的返回字符串的方法，
	 * 直接return null;并在return之前用输出流输出字符串就可以了，跟servlet输入HTMl方法一样。
	 */
	private static final long serialVersionUID = 8727297357142230072L;
	private HttpServletRequest httpServletRequest;//这里使用并不是自己的setter，而是使用接口传来的
	private String result = "are you kidding";
	private PersonInfoDao personInfoDao;
	
	public PersonInfoDao getPersonInfoDao() {
		return personInfoDao;
	}
	public void setPersonInfoDao(PersonInfoDao personInfoDao) {
		this.personInfoDao = personInfoDao;
	}
	public String executeAjax() {
		// TODO Auto-generated method stub
		if(personInfoDao.getPersonInfoThroughEmail(httpServletRequest.getParameter("email")) == null)
			System.out.println("this is no exist.");
		else {
			System.out.println("the email is exist,please get password back.");
			try {
				ServletActionContext.getResponse().getWriter().print("is-exist");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		Map<String, String> map = new HashMap<>();
		map.put("ok", "okay");
		int ic = FourFigures.getOneRandomNum();
		try {
			ServletActionContext.getResponse().getWriter().print(ic);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SendEmail.sendMail(httpServletRequest.getParameter("email"), "welcome to fleamarket of nuc", "your verification code is"+ic);
		return null;
	}
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public void setServletRequest(HttpServletRequest arg0) {//这个需要
		// TODO Auto-generated method stub
		this.httpServletRequest = arg0;
	}
	
}
