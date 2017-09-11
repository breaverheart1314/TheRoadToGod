package com.fleamarket.action;

//import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
//import org.apache.struts2.util.ServletContextAware;

//import com.fleamarket.dao.PersonInfoDao;
import com.fleamarket.domain.PersonInfo;
import com.fleamarket.service.PersonInfoService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddOnePersonEmailRegister extends ActionSupport implements ServletRequestAware,ModelDriven<PersonInfo> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonInfo personInfo = new PersonInfo();
	private PersonInfoService personInfoService;
	private HttpServletRequest httpServletRequest;//这个通过模型驱动得到数据就不用了
	public String executeAddOne() {
		personInfoService.addOnePerson(personInfo);
		return "success";
	}
	@Override
	public PersonInfo getModel() {
		// TODO Auto-generated method stub
		return personInfo;
	}
	public PersonInfoService getPersonInfoService() {
		return personInfoService;
	}
	public void setPersonInfoService(PersonInfoService personInfoService) {
		this.personInfoService = personInfoService;
	}

	public HttpServletRequest getHttpServletRequest() {
		return httpServletRequest;
	}
	public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.httpServletRequest = arg0;
	}
}
