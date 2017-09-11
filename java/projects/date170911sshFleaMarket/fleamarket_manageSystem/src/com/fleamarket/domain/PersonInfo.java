package com.fleamarket.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PersonInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String password;
	private String account;
	private String email;
	private String phone;
	//============================上半部分作为登录，注册使用=======================
	private String name;
	private char sex;
	private int age;
	private Date registerDate;
	private double takeMoney;
	private String headImgAddress;
	//-------------------------逆向生成------------------
	 private Set<Goods> goodses = new HashSet<Goods>(0);
     private Worker worker;
     private Set<TradeInfo> tradeInfos = new HashSet<TradeInfo>(0);
	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
		registerDate = new Date();
	}
	
	public Set<Goods> getGoodses() {
		return goodses;
	}

	public void setGoodses(Set<Goods> goodses) {
		this.goodses = goodses;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Set<TradeInfo> getTradeInfos() {
		return tradeInfos;
	}

	public void setTradeInfos(Set<TradeInfo> tradeInfos) {
		this.tradeInfos = tradeInfos;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public double getTakeMoney() {
		return takeMoney;
	}
	public void setTakeMoney(double takeMoney) {
		this.takeMoney = takeMoney;
	}
	public String getHeadImgAddress() {
		return headImgAddress;
	}
	public void setHeadImgAddress(String headImgAddress) {
		this.headImgAddress = headImgAddress;
	}
	
}
