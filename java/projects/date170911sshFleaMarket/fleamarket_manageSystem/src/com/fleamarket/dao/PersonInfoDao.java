package com.fleamarket.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.fleamarket.domain.PersonInfo;

public class PersonInfoDao extends HibernateDaoSupport{
	public void addOnePerson(PersonInfo personInfo) {
		System.out.println("add-one-person:dao");
		this.getHibernateTemplate().save(personInfo);
	}
	@SuppressWarnings("unchecked")
	public PersonInfo getPersonInfoThroughEmail(String email) {
		List<PersonInfo> list=this.getHibernateTemplate().find("from PersonInfo as p where p.email=?", email);
		System.out.println("get-length-for-email:"+list.size());
		return list.size()>0?list.get(0):null;
	}
}
