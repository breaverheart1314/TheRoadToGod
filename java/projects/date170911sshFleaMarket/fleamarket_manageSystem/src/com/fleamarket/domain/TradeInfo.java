package com.fleamarket.domain;

import java.io.Serializable;
import java.util.Date;

public class TradeInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
//	private int goodsID;
	private Date tradeDate;
	private String tradeAddress;
//	private int purchaserID;
	private Boolean isPeerResponse;//是否互评
	 private Goods goods;
     private PersonInfo personInfo;
     
	public Boolean getIsPeerResponse() {
		return isPeerResponse;
	}
	public void setIsPeerResponse(Boolean isPeerResponse) {
		this.isPeerResponse = isPeerResponse;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getTradeAddress() {
		return tradeAddress;
	}
	public void setTradeAddress(String tradeAddress) {
		this.tradeAddress = tradeAddress;
	}

	public boolean isPeerResponse() {
		return isPeerResponse;
	}
	public void setPeerResponse(boolean isPeerResponse) {
		this.isPeerResponse = isPeerResponse;
	}
	
}
