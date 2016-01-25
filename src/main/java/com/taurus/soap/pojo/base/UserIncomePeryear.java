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
 * @Description: 用户年收入记录
 * @author Frank
 * @date 2016-01-12 12:02:03
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserIncomePeryear {
	/**id*/
	private java.lang.Integer id;
	/**year*/
	private java.lang.Integer year;
	/**income*/
	private BigDecimal income;
	/**status*/
	private java.lang.Integer status;
	/**updatetime*/
	private java.util.Date updatetime;
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
	 *@return: java.lang.Integer  year
	 */
	@Column(name ="YEAR",nullable=true,precision=10,scale=0)
	public java.lang.Integer getYear(){
		return this.year;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  year
	 */
	public void setYear(java.lang.Integer year){
		this.year = year;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  income
	 */
	@Column(name ="INCOME",nullable=true,precision=20,scale=6)
	public BigDecimal getIncome(){
		return this.income;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  income
	 */
	public void setIncome(BigDecimal income){
		this.income = income;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  status
	 */
	@Column(name ="STATUS",nullable=true,precision=10,scale=0)
	public java.lang.Integer getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  status
	 */
	public void setStatus(java.lang.Integer status){
		this.status = status;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  updatetime
	 */
	@Column(name ="UPDATETIME",nullable=false)
	public java.util.Date getUpdatetime(){
		return this.updatetime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  updatetime
	 */
	public void setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
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
