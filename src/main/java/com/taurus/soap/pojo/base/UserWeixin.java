package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**   
 * @Title: Entity
 * @Description: 微信用户信息
 * @author Frank
 * @date 2016-01-12 14:00:01
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserWeixin {

	/**id*/
	private java.lang.Integer id;
	/**微信用户对应公众号唯一号*/
	private java.lang.String openid;
	/**性别 1：男2：女；0：未知*/
	private java.lang.String sex;
	/**省份*/
	private java.lang.String province;
	/**城市*/
	private java.lang.String city;
	/**国家*/
	private java.lang.String country;
	/**头像链接地址*/
	private java.lang.String headimgurl;
	/**多公众号号用户unionid*/
	private java.lang.String unionid;
	/**状态1:关注状态 0：取消关注状态*/
	private java.lang.String status;
	/**pushSwitch*/
	private java.lang.String pushSwitch;
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
	 *@return: java.lang.String  微信用户对应公众号唯一号
	 */
	@Column(name ="OPENID",nullable=true,length=64)
	public java.lang.String getOpenid(){
		return this.openid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  微信用户对应公众号唯一号
	 */
	public void setOpenid(java.lang.String openid){
		this.openid = openid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  性别 1：男2：女；0：未知
	 */
	@Column(name ="SEX",nullable=true,length=2)
	public java.lang.String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  性别 1：男2：女；0：未知
	 */
	public void setSex(java.lang.String sex){
		this.sex = sex;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  省份
	 */
	@Column(name ="PROVINCE",nullable=true,length=32)
	public java.lang.String getProvince(){
		return this.province;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  省份
	 */
	public void setProvince(java.lang.String province){
		this.province = province;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  城市
	 */
	@Column(name ="CITY",nullable=true,length=32)
	public java.lang.String getCity(){
		return this.city;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  城市
	 */
	public void setCity(java.lang.String city){
		this.city = city;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  国家
	 */
	@Column(name ="COUNTRY",nullable=true,length=32)
	public java.lang.String getCountry(){
		return this.country;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  国家
	 */
	public void setCountry(java.lang.String country){
		this.country = country;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  头像链接地址
	 */
	@Column(name ="HEADIMGURL",nullable=true,length=512)
	public java.lang.String getHeadimgurl(){
		return this.headimgurl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  头像链接地址
	 */
	public void setHeadimgurl(java.lang.String headimgurl){
		this.headimgurl = headimgurl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  多公众号号用户unionid
	 */
	@Column(name ="UNIONID",nullable=true,length=128)
	public java.lang.String getUnionid(){
		return this.unionid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  多公众号号用户unionid
	 */
	public void setUnionid(java.lang.String unionid){
		this.unionid = unionid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态1:关注状态 0：取消关注状态
	 */
	@Column(name ="STATUS",nullable=true,length=2)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态1:关注状态 0：取消关注状态
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  pushSwitch
	 */
	@Column(name ="PUSH_SWITCH",nullable=true,length=50)
	public java.lang.String getPushSwitch(){
		return this.pushSwitch;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  pushSwitch
	 */
	public void setPushSwitch(java.lang.String pushSwitch){
		this.pushSwitch = pushSwitch;
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
