package com.fleamarket.util;
//为了使用spring的jdbc,好像过时了-----好像是直接在action里使用
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
//import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.fleamarket.domain.PersonInfo;

//这个类用来从数据库内获取bean
public class FromDB_getBean  {
	private static SimpleJdbcTemplate jdbcTemplate;
	//-----------------------------------获取一个person_info,通过email--------------------
	public static PersonInfo getOnePersonInfoThroughEmail() {
		
		return null;
	}
	
	public static SimpleJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public static void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		FromDB_getBean.jdbcTemplate = jdbcTemplate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello hibernate");
	}
	
}
