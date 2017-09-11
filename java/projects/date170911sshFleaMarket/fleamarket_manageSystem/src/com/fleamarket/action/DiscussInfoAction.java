package com.fleamarket.action;
//评论信息的action类

import com.fleamarket.domain.DiscussInfo;
import com.fleamarket.service.DiscussInfoService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DiscussInfoAction extends ActionSupport implements ModelDriven<DiscussInfo>{
	private static final long serialVersionUID = -5743807355689160025L;
	private DiscussInfoService discussInfoService;
	private DiscussInfo discussInfo = new DiscussInfo();
	@Override
	public DiscussInfo getModel() {
		// TODO Auto-generated method stub
		return discussInfo;
	}
	public DiscussInfoService getDiscussInfoService() {
		return discussInfoService;
	}
	public void setDiscussInfoService(DiscussInfoService discussInfoService) {
		this.discussInfoService = discussInfoService;
	}
	public DiscussInfo getDiscussInfo() {
		return discussInfo;
	}
	public void setDiscussInfo(DiscussInfo discussInfo) {
		this.discussInfo = discussInfo;
	}
}
