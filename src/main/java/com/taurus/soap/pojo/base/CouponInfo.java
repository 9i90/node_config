package com.taurus.soap.pojo.base;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 券
 * @author zhangdaihao
 * @date 2016-01-12 15:10:19
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class CouponInfo { 
	/**primary key*/
	private java.lang.Integer id;
	/**券类型（1：账户余额，2：代金券；3：加息券；4：体验金）*/
	private java.lang.String couponType;
	/**名称*/
	private java.lang.String name;
	/**描述*/
	private java.lang.String description;
	/**图标地址*/
	private java.lang.String iconPath;
	/**有效期限（天，月，指定日期）D:9/M:3/P:20151031*/
	private java.lang.String timeLimit;
	/**使用范围（投资，提现）T/W*/
	private java.lang.String scope;
	/**投资范围（天标，月标）D:0-100;M:1-36*/
	private java.lang.String tenderScope;
	/**面值（元）*/
	private BigDecimal value;
	/**有效标志（Y：有效，N：无效）*/
	private java.lang.String aviFlag;
	/**创建人*/
	private java.lang.String createUser;
	/**创建时间*/
	private java.util.Date createTime;
	/**修改人*/
	private java.lang.String updateUser;
	/**修改时间*/
	private java.util.Date updateTime;
	/**属性*/
	private java.lang.String property;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  primary key
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
	 *@param: java.lang.Integer  primary key
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  券类型（1：账户余额，2：代金券；3：加息券；4：体验金）
	 */
	@Column(name ="COUPON_TYPE",nullable=false,length=2)
	public java.lang.String getCouponType(){
		return this.couponType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  券类型（1：账户余额，2：代金券；3：加息券；4：体验金）
	 */
	public void setCouponType(java.lang.String couponType){
		this.couponType = couponType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  名称
	 */
	@Column(name ="NAME",nullable=false,length=50)
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  名称
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  描述
	 */
	@Column(name ="DESCRIPTION",nullable=true,length=2000)
	public java.lang.String getDescription(){
		return this.description;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  描述
	 */
	public void setDescription(java.lang.String description){
		this.description = description;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  图标地址
	 */
	@Column(name ="ICON_PATH",nullable=true,length=500)
	public java.lang.String getIconPath(){
		return this.iconPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  图标地址
	 */
	public void setIconPath(java.lang.String iconPath){
		this.iconPath = iconPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  有效期限（天，月，指定日期）D:9/M:3/P:20151031
	 */
	@Column(name ="TIME_LIMIT",nullable=false,length=50)
	public java.lang.String getTimeLimit(){
		return this.timeLimit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  有效期限（天，月，指定日期）D:9/M:3/P:20151031
	 */
	public void setTimeLimit(java.lang.String timeLimit){
		this.timeLimit = timeLimit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用范围（投资，提现）T/W
	 */
	@Column(name ="SCOPE",nullable=false,length=2)
	public java.lang.String getScope(){
		return this.scope;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用范围（投资，提现）T/W
	 */
	public void setScope(java.lang.String scope){
		this.scope = scope;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  投资范围（天标，月标）D:0-100;M:1-36
	 */
	@Column(name ="TENDER_SCOPE",nullable=false,length=50)
	public java.lang.String getTenderScope(){
		return this.tenderScope;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  投资范围（天标，月标）D:0-100;M:1-36
	 */
	public void setTenderScope(java.lang.String tenderScope){
		this.tenderScope = tenderScope;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  面值（元）
	 */
	@Column(name ="VALUE",nullable=false,precision=20,scale=6)
	public BigDecimal getValue(){
		return this.value;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  面值（元）
	 */
	public void setValue(BigDecimal value){
		this.value = value;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  有效标志（Y：有效，N：无效）
	 */
	@Column(name ="AVI_FLAG",nullable=false,length=2)
	public java.lang.String getAviFlag(){
		return this.aviFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  有效标志（Y：有效，N：无效）
	 */
	public void setAviFlag(java.lang.String aviFlag){
		this.aviFlag = aviFlag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人
	 */
	@Column(name ="CREATE_USER",nullable=true,length=20)
	public java.lang.String getCreateUser(){
		return this.createUser;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人
	 */
	public void setCreateUser(java.lang.String createUser){
		this.createUser = createUser;
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  修改人
	 */
	@Column(name ="UPDATE_USER",nullable=true,length=20)
	public java.lang.String getUpdateUser(){
		return this.updateUser;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  修改人
	 */
	public void setUpdateUser(java.lang.String updateUser){
		this.updateUser = updateUser;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  修改时间
	 */
	@Column(name ="UPDATE_TIME",nullable=true)
	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  修改时间
	 */
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  属性
	 */
	@Column(name ="PROPERTY",nullable=true,length=1000)
	public java.lang.String getProperty(){
		return this.property;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  属性
	 */
	public void setProperty(java.lang.String property){
		this.property = property;
	}
}
