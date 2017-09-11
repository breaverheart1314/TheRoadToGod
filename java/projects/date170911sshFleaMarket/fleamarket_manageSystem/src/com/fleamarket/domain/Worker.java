package com.fleamarket.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

//import java.util.Set;

public class Worker implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int identifyLevel;
	private String professionTitle;
	private PersonInfo personInfo;
	private Worker worker;
	private Set<Worker> workers = new HashSet<Worker>(0);
	
	public PersonInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	public Worker getWorker() {
		return worker;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	public Set<Worker> getWorkers() {
		return workers;
	}
	public void setWorkers(Set<Worker> workers) {
		this.workers = workers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdentifyLevel() {
		return identifyLevel;
	}
	public void setIdentifyLevel(int identifyLevel) {
		this.identifyLevel = identifyLevel;
	}
	public String getProfessionTitle() {
		return professionTitle;
	}
	public void setProfessionTitle(String professionTitle) {
		this.professionTitle = professionTitle;
	}
	
	
}
