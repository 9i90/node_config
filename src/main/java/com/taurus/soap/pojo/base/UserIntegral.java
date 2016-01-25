package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**   
 * @Title: Entity
 * @Description: 用户积分
 * @author Frank
 * @date 2016-01-12 12:26:05
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserIntegral {

	/**userId*/
	private java.lang.Integer userId;
	/**id*/
	private java.lang.Integer id;
	/**总积分*/
	private java.lang.Integer total;
	/**冻结积分*/
	private java.lang.Integer noUse;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  userId
	 */
	@Column(name ="USER_ID",nullable=false,precision=10,scale=0)
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
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=true,precision=10,scale=0)
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  总积分
	 */
	@Column(name ="TOTAL",nullable=false,precision=10,scale=0)
	public java.lang.Integer getTotal(){
		return this.total;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  总积分
	 */
	public void setTotal(java.lang.Integer total){
		this.total = total;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  冻结积分
	 */
	@Column(name ="NO_USE",nullable=false,precision=10,scale=0)
	public java.lang.Integer getNoUse(){
		return this.noUse;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  冻结积分
	 */
	public void setNoUse(java.lang.Integer noUse){
		this.noUse = noUse;
	}

}
