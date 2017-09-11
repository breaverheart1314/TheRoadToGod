package com.fleamarket.action;
//模型驱动在使用jsp，，s:form输入数据时，可以只输入一部分属性
import com.fleamarket.domain.PersonInfo;
import com.fleamarket.service.PersonInfoService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PersonInfoAction extends ActionSupport implements ModelDriven<PersonInfo>{
	private static final long serialVersionUID = 1L;
	private PersonInfo personInfo = new PersonInfo();
	private PersonInfoService personInfoService ;
	public String addOnePerson() {
		System.out.println("add-one-peron:action___password:"+personInfo.getPassword()+"\tage:"+personInfo.getAge()
		+"\tdate:"+personInfo.getRegisterDate());
		personInfoService.addOnePerson(personInfo);
		return "success";
	}
	@Override
	public PersonInfo getModel() {
		// TODO Auto-generated method stub
		return personInfo;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	public PersonInfoService getPersonInfoService() {
		return personInfoService;
	}
	public void setPersonInfoService(PersonInfoService personInfoService) {
		this.personInfoService = personInfoService;
	}
	
}
