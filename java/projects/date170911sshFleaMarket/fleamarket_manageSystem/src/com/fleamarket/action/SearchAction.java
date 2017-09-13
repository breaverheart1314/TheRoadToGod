package com.fleamarket.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "error";
	}
	public String checkActionContext() {
		System.out.println("value1:id:"+ActionContext.getContext().get("id"));//
		return null;
	}
}
