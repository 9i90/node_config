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
 * @Description: 用户账户信息
 * @author Frank
 * @date 2016-01-11 16:39:04
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserAccount {

	/**id*/
	private java.lang.Integer id;
	/**用户Id*/
	private java.lang.Integer userId;
	/**账户总资产*/
	private BigDecimal total;
	/**可用金额*/
	private BigDecimal useMoney;
	/**冻结金额*/
	private BigDecimal noUseMoney;
	/**待收金额*/
	private BigDecimal collection;
	/**待还金额【包含平台服务费和逾期罚息金额】*/
	private BigDecimal waitrepay;
	/**累计收益*/
	private BigDecimal accumulatedIncome;
	/**更新时间*/
	private java.util.Date updatetime;
	
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
	 *@return: java.lang.Integer  用户Id
	 */
	@Column(name ="USER_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getUserId(){
		return this.userId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户Id
	 */
	public void setUserId(java.lang.Integer userId){
		this.userId = userId;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  账户总资产
	 */
	@Column(name ="TOTAL",nullable=false,precision=20,scale=6)
	public BigDecimal getTotal(){
		return this.total;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  账户总资产
	 */
	public void setTotal(BigDecimal total){
		this.total = total;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  可用金额
	 */
	@Column(name ="USE_MONEY",nullable=false,precision=20,scale=6)
	public BigDecimal getUseMoney(){
		return this.useMoney;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  可用金额
	 */
	public void setUseMoney(BigDecimal useMoney){
		this.useMoney = useMoney;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  冻结金额
	 */
	@Column(name ="NO_USE_MONEY",nullable=false,precision=20,scale=6)
	public BigDecimal getNoUseMoney(){
		return this.noUseMoney;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  冻结金额
	 */
	public void setNoUseMoney(BigDecimal noUseMoney){
		this.noUseMoney = noUseMoney;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  待收金额
	 */
	@Column(name ="COLLECTION",nullable=false,precision=20,scale=6)
	public BigDecimal getCollection(){
		return this.collection;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  待收金额
	 */
	public void setCollection(BigDecimal collection){
		this.collection = collection;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  待还金额【包含平台服务费和逾期罚息金额】
	 */
	@Column(name ="WAITREPAY",nullable=false,precision=20,scale=6)
	public BigDecimal getWaitrepay(){
		return this.waitrepay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  待还金额【包含平台服务费和逾期罚息金额】
	 */
	public void setWaitrepay(BigDecimal waitrepay){
		this.waitrepay = waitrepay;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  累计收益
	 */
	@Column(name ="ACCUMULATED_INCOME",nullable=false,precision=20,scale=6)
	public BigDecimal getAccumulatedIncome(){
		return this.accumulatedIncome;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  累计收益
	 */
	public void setAccumulatedIncome(BigDecimal accumulatedIncome){
		this.accumulatedIncome = accumulatedIncome;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新时间
	 */
	@Column(name ="UPDATETIME",nullable=false)
	public java.util.Date getUpdatetime(){
		return this.updatetime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新时间
	 */
	public void setUpdatetime(java.util.Date updatetime){
		this.updatetime = updatetime;
	}

}
