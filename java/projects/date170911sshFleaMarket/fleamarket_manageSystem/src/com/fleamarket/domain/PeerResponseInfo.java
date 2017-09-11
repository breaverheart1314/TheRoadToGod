package com.fleamarket.domain;

import java.io.Serializable;

public class PeerResponseInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int tradeID;
	private Goods goods;
	private int sellerPrintScore;
	private String sellerRemark;
	private String purchaserRemark;
	private int purchaserPrintScore;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getTradeID() {
		return tradeID;
	}
	public void setTradeID(int tradeID) {
		this.tradeID = tradeID;
	}
	public int getSellerPrintScore() {
		return sellerPrintScore;
	}
	public void setSellerPrintScore(int sellerPrintScore) {
		this.sellerPrintScore = sellerPrintScore;
	}
	public String getSellerRemark() {
		return sellerRemark;
	}
	public void setSellerRemark(String sellerRemark) {
		this.sellerRemark = sellerRemark;
	}
	public String getPurchaserRemark() {
		return purchaserRemark;
	}
	public void setPurchaserRemark(String purchaserRemark) {
		this.purchaserRemark = purchaserRemark;
	}
	public int getPurchaserPrintScore() {
		return purchaserPrintScore;
	}
	public void setPurchaserPrintScore(int purchaserPrintScore) {
		this.purchaserPrintScore = purchaserPrintScore;
	}
	
}
