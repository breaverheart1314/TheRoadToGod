package com.fleamarket.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Goods implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int classify;
	private double price;
	private Boolean isReducePrice;
	private double reducePrice;
	private Date putawayDate;
//	private int sellerID;
	private Boolean isSellOut;
	private PersonInfo personInfo;
	private Set<PeerResponseInfo> peerResponseInfos = new HashSet<PeerResponseInfo>(0);
    private Set<TradeInfo> tradeInfos = new HashSet<TradeInfo>(0);
    private Set<DiscussInfo> discussInfos = new HashSet<DiscussInfo>(0);
    
	public Boolean getIsSellOut() {
		return isSellOut;
	}
	public void setIsSellOut(Boolean isSellOut) {
		this.isSellOut = isSellOut;
	}
	public Boolean getIsReducePrice() {
		return isReducePrice;
	}
	public void setIsReducePrice(Boolean isReducePrice) {
		this.isReducePrice = isReducePrice;
	}
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	public Set<PeerResponseInfo> getPeerResponseInfos() {
		return peerResponseInfos;
	}
	public void setPeerResponseInfos(Set<PeerResponseInfo> peerResponseInfos) {
		this.peerResponseInfos = peerResponseInfos;
	}
	public Set<TradeInfo> getTradeInfos() {
		return tradeInfos;
	}
	public void setTradeInfos(Set<TradeInfo> tradeInfos) {
		this.tradeInfos = tradeInfos;
	}
	public Set<DiscussInfo> getDiscussInfos() {
		return discussInfos;
	}
	public void setDiscussInfos(Set<DiscussInfo> discussInfos) {
		this.discussInfos = discussInfos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClassify() {
		return classify;
	}
	public void setClassify(int classify) {
		this.classify = classify;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isReducePrice() {
		return isReducePrice;
	}
	public void setReducePrice(boolean isReducePrice) {
		this.isReducePrice = isReducePrice;
	}
	public double getReducePrice() {
		return reducePrice;
	}
	public void setReducePrice(double reducePrice) {
		this.reducePrice = reducePrice;
	}
	public Date getPutawayDate() {
		return putawayDate;
	}
	public void setPutawayDate(Date putawayDate) {
		this.putawayDate = putawayDate;
	}
	
	public boolean isSellOut() {
		return isSellOut;
	}
	public void setSellOut(boolean isSellOut) {
		this.isSellOut = isSellOut;
	}
	
}
