package com.fleamarket.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class DiscussInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
//	private int goodsID;
	private String text;
	private String imageAddress;
	private Date discussDate;
	private int discussedId;//这个表内应该有个原始id=0的，表示直接评论物品
	private Goods goods;
	private DiscussInfo discussInfo;
	private Set<DiscussInfo> discussInfos = new HashSet<DiscussInfo>(0);
	
	
	public int getDiscussedId() {
		return discussedId;
	}
	public void setDiscussedId(int discussedId) {
		this.discussedId = discussedId;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public DiscussInfo getDiscussInfo() {
		return discussInfo;
	}
	public void setDiscussInfo(DiscussInfo discussInfo) {
		this.discussInfo = discussInfo;
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
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getimageAddress() {
		return imageAddress;
	}
	public void setimageAddress(String imageAddress) {
		this.imageAddress = imageAddress;
	}
	public Date getDiscussDate() {
		return discussDate;
	}
	public void setDiscussDate(Date discussDate) {
		this.discussDate = discussDate;
	}
	
	
}
