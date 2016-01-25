package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**   
 * @Title: Entity
 * @Description: 用户券信息
 * @author Frank
 * @date 2016-01-12 11:18:01
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserCoupons {

	/**primary key*/
	private java.lang.Integer id;
	/**券类型（2：代金券；3：加息券；4：体验金）*/
	private java.lang.String couponType;
	/**券ID*/
	private java.lang.Integer couponId;
	/**获取时间*/
	private java.util.Date addTime;
	/**开始时间*/
	private java.util.Date startTime;
	/**过期时间*/
	private java.util.Date endTime;
	/**使用时间*/
	private java.util.Date useTime;
	/**使用标志【1：已使用；0：未使用】*/
	private java.lang.String useFlag;
	/**备注*/
	private java.lang.String memo;
	/**userId*/
	private java.lang.Integer userId;
	
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
	 *@return: java.lang.String  券类型（2：代金券；3：加息券；4：体验金）
	 */
	@Column(name ="COUPON_TYPE",nullable=false,length=2)
	public java.lang.String getCouponType(){
		return this.couponType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  券类型（2：代金券；3：加息券；4：体验金）
	 */
	public void setCouponType(java.lang.String couponType){
		this.couponType = couponType;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  券ID
	 */
	@Column(name ="COUPON_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getCouponId(){
		return this.couponId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  券ID
	 */
	public void setCouponId(java.lang.Integer couponId){
		this.couponId = couponId;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  获取时间
	 */
	@Column(name ="ADD_TIME",nullable=false)
	public java.util.Date getAddTime(){
		return this.addTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  获取时间
	 */
	public void setAddTime(java.util.Date addTime){
		this.addTime = addTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  开始时间
	 */
	@Column(name ="START_TIME",nullable=true)
	public java.util.Date getStartTime(){
		return this.startTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  开始时间
	 */
	public void setStartTime(java.util.Date startTime){
		this.startTime = startTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  过期时间
	 */
	@Column(name ="END_TIME",nullable=true)
	public java.util.Date getEndTime(){
		return this.endTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  过期时间
	 */
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  使用时间
	 */
	@Column(name ="USE_TIME",nullable=true)
	public java.util.Date getUseTime(){
		return this.useTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  使用时间
	 */
	public void setUseTime(java.util.Date useTime){
		this.useTime = useTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用标志【1：已使用；0：未使用】
	 */
	@Column(name ="USE_FLAG",nullable=false,length=2)
	public java.lang.String getUseFlag(){
		return this.useFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用标志【1：已使用；0：未使用】
	 */
	public void setUseFlag(java.lang.String useFlag){
		this.useFlag = useFlag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	@Column(name ="MEMO",nullable=true,length=200)
	public java.lang.String getMemo(){
		return this.memo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setMemo(java.lang.String memo){
		this.memo = memo;
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
