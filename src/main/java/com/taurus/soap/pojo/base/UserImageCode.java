package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**   
 * @Title: Entity
 * @Description: 用户图片验证码
 * @author Frank
 * @date 2016-01-12 11:46:09
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserImageCode {

	/**唯一表示*/
	private java.lang.String id;
	/**图片校验码*/
	private java.lang.String randcode;
	/**添加时间*/
	private java.util.Date addtime;
	/**userId*/
	private java.lang.Integer userId;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  唯一表示
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  唯一表示
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  图片校验码
	 */
	@Column(name ="RANDCODE",nullable=true,length=10)
	public java.lang.String getRandcode(){
		return this.randcode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  图片校验码
	 */
	public void setRandcode(java.lang.String randcode){
		this.randcode = randcode;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  添加时间
	 */
	@Column(name ="ADDTIME",nullable=true)
	public java.util.Date getAddtime(){
		return this.addtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  添加时间
	 */
	public void setAddtime(java.util.Date addtime){
		this.addtime = addtime;
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
