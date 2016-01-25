package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.UserAccount;
@Entity
@Table(name = "user_account", schema = "") 
@SuppressWarnings("serial")
public class UserAccountEntity extends UserAccount implements java.io.Serializable{
	
}
