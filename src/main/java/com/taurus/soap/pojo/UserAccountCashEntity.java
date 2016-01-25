package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.taurus.soap.pojo.base.UserAccountCash;
@Entity
@Table(name = "user_account_cash", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class UserAccountCashEntity extends UserAccountCash implements java.io.Serializable{

}
