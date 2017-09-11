package com.fleamarket.service;

import com.fleamarket.dao.PersonInfoDao;
import com.fleamarket.domain.PersonInfo;

public class PersonInfoService {
	private PersonInfoDao personInfoDao;
	
	public void addOnePerson(PersonInfo personInfo) {
		System.out.println("add-one-person:service");
		personInfoDao.addOnePerson(personInfo);
	}
	public PersonInfoDao getPersonInfoDao() {
		return personInfoDao;
	}

	public void setPersonInfoDao(PersonInfoDao personInfoDao) {
		this.personInfoDao = personInfoDao;
	}
	
}
