package com.lti.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class User1 implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="user_seq")
	@SequenceGenerator(name="user_seq",sequenceName="OrclUserSeq")
	public  int userId;
	private String fname;
	private String lname;
	
	public User1() {
		super();
	}
	
	public User1(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + "]";
	}
	
	

}
