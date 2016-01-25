package com.taurus.soap.pojo.base;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**   
 * @Title: Entity
 * @Description: 好友贷
 * @author Frank 
 * @date 2016-01-12 11:29:59
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserFriendsLoan {

	/**用户id*/
	private java.lang.Integer userId;
	/**id*/
	private java.lang.Integer id;
	/**最高额度*/
	private BigDecimal maxLimit;
	/**修改额度备注*/
	private java.lang.String memo;
	/**创建时间*/
	private java.util.Date createTime;
	/**更新时间*/
	private java.util.Date updateTime;
	/**操作员id*/
	private java.lang.String systemId;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户id
	 */
	@Column(name ="USER_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getUserId(){
		return this.userId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户id
	 */
	public void setUserId(java.lang.Integer userId){
		this.userId = userId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
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
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  最高额度
	 */
	@Column(name ="MAX_LIMIT",nullable=true,precision=16,scale=2)
	public BigDecimal getMaxLimit(){
		return this.maxLimit;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  最高额度
	 */
	public void setMaxLimit(BigDecimal maxLimit){
		this.maxLimit = maxLimit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  修改额度备注
	 */
	@Column(name ="MEMO",nullable=true,length=4000)
	public java.lang.String getMemo(){
		return this.memo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  修改额度备注
	 */
	public void setMemo(java.lang.String memo){
		this.memo = memo;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建时间
	 */
	@Column(name ="CREATE_TIME",nullable=true)
	public java.util.Date getCreateTime(){
		return this.createTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建时间
	 */
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新时间
	 */
	@Column(name ="UPDATE_TIME",nullable=false)
	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新时间
	 */
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  操作员id
	 */
	@Column(name ="SYSTEM_ID",nullable=true,length=20)
	public java.lang.String getSystemId(){
		return this.systemId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  操作员id
	 */
	public void setSystemId(java.lang.String systemId){
		this.systemId = systemId;
	}

}
