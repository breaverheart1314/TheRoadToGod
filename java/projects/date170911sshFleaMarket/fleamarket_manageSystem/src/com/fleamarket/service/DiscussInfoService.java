package com.fleamarket.service;

import com.fleamarket.dao.DiscussInfoDao;
import com.fleamarket.domain.PersonInfo;

public class DiscussInfoService {
	private DiscussInfoDao discussInfoDao;
	public void addOnePerson(PersonInfo personInfo) {
		System.out.println("add-one-person:dao");
	}
	public DiscussInfoDao getDiscussInfoDao() {
		return discussInfoDao;
	}
	//通过spring来进行注入，使用setter
	public void setDiscussInfoDao(DiscussInfoDao discussInfoDao) {
		this.discussInfoDao = discussInfoDao;
	}
	
}
