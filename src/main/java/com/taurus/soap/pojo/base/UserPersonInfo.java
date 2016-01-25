package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**   
 * @Title: Entity
 * @Description: 用户身份信息
 * @author Frank
 * @date 2016-01-12 13:40:51
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserPersonInfo {

	/**id*/
	private java.lang.Integer id;
	/**userId*/
	private java.lang.Integer userId;
	/**证件类型*/
	private java.lang.String cardType;
	/**证件号码*/
	private java.lang.String cardId;
	/**真实姓名*/
	private java.lang.String realname;
	/**性别*/
	private java.lang.String sex;
	/**注册时的ip*/
	private java.lang.String addip;
	/**通过认证的时间*/
	private java.lang.String certifyPassDate;
	/**身份证正面图片*/
	private java.lang.String certFrontPath;
	/**身份证背面图片*/
	private java.lang.String certBackPath;
	/**email*/
	private java.lang.String email;
	
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  证件类型
	 */
	@Column(name ="CARD_TYPE",nullable=true,length=10)
	public java.lang.String getCardType(){
		return this.cardType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  证件类型
	 */
	public void setCardType(java.lang.String cardType){
		this.cardType = cardType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  证件号码
	 */
	@Column(name ="CARD_ID",nullable=true,length=50)
	public java.lang.String getCardId(){
		return this.cardId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  证件号码
	 */
	public void setCardId(java.lang.String cardId){
		this.cardId = cardId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  真实姓名
	 */
	@Column(name ="REALNAME",nullable=true,length=20)
	public java.lang.String getRealname(){
		return this.realname;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  真实姓名
	 */
	public void setRealname(java.lang.String realname){
		this.realname = realname;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  性别
	 */
	@Column(name ="SEX",nullable=true,length=10)
	public java.lang.String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  性别
	 */
	public void setSex(java.lang.String sex){
		this.sex = sex;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  注册时的ip
	 */
	@Column(name ="ADDIP",nullable=true,length=50)
	public java.lang.String getAddip(){
		return this.addip;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  注册时的ip
	 */
	public void setAddip(java.lang.String addip){
		this.addip = addip;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  通过认证的时间
	 */
	@Column(name ="CERTIFY_PASS_DATE",nullable=true,length=20)
	public java.lang.String getCertifyPassDate(){
		return this.certifyPassDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  通过认证的时间
	 */
	public void setCertifyPassDate(java.lang.String certifyPassDate){
		this.certifyPassDate = certifyPassDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  身份证正面图片
	 */
	@Column(name ="CERT_FRONT_PATH",nullable=true,length=256)
	public java.lang.String getCertFrontPath(){
		return this.certFrontPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证正面图片
	 */
	public void setCertFrontPath(java.lang.String certFrontPath){
		this.certFrontPath = certFrontPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  身份证背面图片
	 */
	@Column(name ="CERT_BACK_PATH",nullable=true,length=256)
	public java.lang.String getCertBackPath(){
		return this.certBackPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证背面图片
	 */
	public void setCertBackPath(java.lang.String certBackPath){
		this.certBackPath = certBackPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  email
	 */
	@Column(name ="EMAIL",nullable=true,length=256)
	public java.lang.String getEmail(){
		return this.email;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  email
	 */
	public void setEmail(java.lang.String email){
		this.email = email;
	}

}
