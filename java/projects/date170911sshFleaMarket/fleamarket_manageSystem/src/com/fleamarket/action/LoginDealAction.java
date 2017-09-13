package com.fleamarket.action;
//action进行ajax交互，需要函数返回null才不会自己返回一个页面
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.fleamarket.domain.PersonInfo;
import com.fleamarket.util.FromDB_getBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginDealAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpServletRequest httpServletRequest;
	private HttpServletResponse httpServletResponse;
	private ServletContext servletContext;
	
	public ServletContext getServletContext() {
		return servletContext;
	}
	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.servletContext = context;
	}
	public String isEmailExist() {
		System.out.println("doing email verification.");
		return null;
	}
	public String loginForEmail() {
		//得到邮箱，密码，通过邮箱查询数据，对比查看，并返回结果
		System.out.println("I am doing email-login checking."+httpServletRequest.getParameter("email"));
		String email = httpServletRequest.getParameter("email");
		String password = httpServletRequest.getParameter("password");
		PersonInfo info =  FromDB_getBean.getPersonInfoForEmail(email);
		String back_info = null;
		if(info == null) {
			back_info = "non-email";
		}else if(info.getPassword().equals(password)) {
			System.out.println("your id :"+info.getId());
			ActionContext.getContext().getSession().put("id", info.getId());
			back_info = "login-success";
		}else {
			back_info = "password-error";
		}
		try {
			httpServletResponse.getWriter().print(back_info);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.httpServletResponse = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.httpServletRequest = request;
	}

	public HttpServletRequest getHttpServletRequest() {
		return httpServletRequest;
	}
	public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}
	public HttpServletResponse getHttpServletResponse() {
		return httpServletResponse;
	}
	public void setHttpServletResponse(HttpServletResponse httpServletResponse) {
		this.httpServletResponse = httpServletResponse;
	}
	
}
