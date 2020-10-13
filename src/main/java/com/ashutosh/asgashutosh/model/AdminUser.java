package com.ashutosh.asgashutosh.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class AdminUser
{
//Defining userid as primary key
@Id
@Column
private String adminuserid;
@Column
private String adminpwd;
public String getAdminuserid() {
	return adminuserid;
}
public void setAdminuserid(String adminuserid) {
	this.adminuserid = adminuserid;
}
public String getAdminpwd() {
	return adminpwd;
}
public void setAdminpwd(String adminpwd) {
	this.adminpwd = adminpwd;
}

}