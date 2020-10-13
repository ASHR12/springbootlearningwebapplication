package com.ashutosh.asgashutosh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Accounts
{

@Column
private String accountId;
@Column
private String userid;
@Column
private String pwd;
@Column
private String firstname;
@Column
private String lastname;
@Column
private int age;
@Column
private long mobilenumber;
@Id
@Column
private String pannumber;
@Column
private String dob;
@Column
private String emailid;
@Column
private String enrollforIB;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getPannumber() {
	return pannumber;
}
public void setPannumber(String pannumber) {
	this.pannumber = pannumber;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getAccountId() {
	return accountId;
}
public void setAccountId(String accountId) {
	this.accountId = accountId;
}
public String getEnrollforIB() {
	return enrollforIB;
}
public void setEnrollforIB(String enrollforIB) {
	this.enrollforIB = enrollforIB;
}
}