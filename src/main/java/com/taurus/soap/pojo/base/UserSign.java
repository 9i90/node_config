package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**   
 * @Title: Entity
 * @Description: 用户签到信息
 * @author Frank
 * @date 2016-01-12 13:46:36
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserSign {

	/**id*/
	private java.lang.Integer id;
	/**签到时间*/
	private java.lang.String signTime;
	/**userId*/
	private java.lang.Integer userId;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
	@Column(name ="ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  id
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  签到时间
	 */
	@Column(name ="SIGN_TIME",nullable=false,length=20)
	public java.lang.String getSignTime(){
		return this.signTime;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  签到时间
	 */
	public void setSignTime(java.lang.String signTime){
		this.signTime = signTime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  userId
	 */
	@Column(name ="USER_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getUserId(){
		return this.userId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  userId
	 */
	public void setUserId(java.lang.Integer userId){
		this.userId = userId;
	}

}
