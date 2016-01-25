package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**   
 * @Title: Entity
 * @Description: 用户登录日志
 * @author Frank
 * @date 2016-01-12 13:34:38
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserLoginLog {

	/**id*/
	private java.lang.Integer id;
	/**类型1，登录，2退出*/
	private java.lang.Integer typeId;
	/**通道1，wap,2,微信，3 mobile_ios 4, mobile_android,5pc*/
	private java.lang.Integer channel;
	/**addtime*/
	private java.util.Date addtime;
	/**ip*/
	private java.lang.String ip;
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  类型1，登录，2退出
	 */
	@Column(name ="TYPE_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getTypeId(){
		return this.typeId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  类型1，登录，2退出
	 */
	public void setTypeId(java.lang.Integer typeId){
		this.typeId = typeId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  通道1，wap,2,微信，3 mobile_ios 4, mobile_android,5pc
	 */
	@Column(name ="CHANNEL",nullable=true,precision=10,scale=0)
	public java.lang.Integer getChannel(){
		return this.channel;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  通道1，wap,2,微信，3 mobile_ios 4, mobile_android,5pc
	 */
	public void setChannel(java.lang.Integer channel){
		this.channel = channel;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  addtime
	 */
	@Column(name ="ADDTIME",nullable=true)
	public java.util.Date getAddtime(){
		return this.addtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  addtime
	 */
	public void setAddtime(java.util.Date addtime){
		this.addtime = addtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  ip
	 */
	@Column(name ="IP",nullable=true,length=20)
	public java.lang.String getIp(){
		return this.ip;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  ip
	 */
	public void setIp(java.lang.String ip){
		this.ip = ip;
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
