package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**
 * 
* @ClassName: UserAuthority 
* @Description: 用户认证信息
* @author Terry
* @date 2016年1月11日 下午6:25:39 
*
 */
@MappedSuperclass
public abstract class UserAuthority {
	/**用户认证表ID*/
	private java.lang.Integer id;
	/**用户ID*/
	private java.lang.Integer userId;
	/**认证类型 与dw_code_details表的AUTHORITY_TYPE认证类型对应*/
	private java.lang.String authorityType;
	/**认证状态 0 未认证 1 已认证*/
	private java.lang.String authorityStatus;
	/**认证时间*/
	private java.util.Date authorityTime;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
	@Column(name ="ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户认证表ID
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户ID
	 */
	@Column(name ="USER_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getUserId(){
		return this.userId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户ID
	 */
	public void setUserId(java.lang.Integer userId){
		this.userId = userId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  认证类型 与dw_code_details表的AUTHORITY_TYPE认证类型对应
	 */
	@Column(name ="AUTHORITY_TYPE",nullable=false,length=10)
	public java.lang.String getAuthorityType(){
		return this.authorityType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  认证类型 与dw_code_details表的AUTHORITY_TYPE认证类型对应
	 */
	public void setAuthorityType(java.lang.String authorityType){
		this.authorityType = authorityType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  认证状态 0 未认证 1 已认证
	 */
	@Column(name ="AUTHORITY_STATUS",nullable=true,length=2)
	public java.lang.String getAuthorityStatus(){
		return this.authorityStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  认证状态 0 未认证 1 已认证
	 */
	public void setAuthorityStatus(java.lang.String authorityStatus){
		this.authorityStatus = authorityStatus;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  认证时间
	 */
	@Column(name ="AUTHORITY_TIME",nullable=true)
	public java.util.Date getAuthorityTime(){
		return this.authorityTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  认证时间
	 */
	public void setAuthorityTime(java.util.Date authorityTime){
		this.authorityTime = authorityTime;
	}
}

