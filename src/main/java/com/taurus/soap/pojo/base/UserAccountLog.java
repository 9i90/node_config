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
 * @Description: 用户账户日志表
 * @author zhangdaihao
 * @date 2016-01-11 18:29:59
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserAccountLog {

	/**id*/
	private java.lang.Integer id;
	/**总资产*/
	private BigDecimal total;
	/**可用金额*/
	private BigDecimal useMoney;
	/**冻结金额*/
	private BigDecimal noUseMoney;
	/**待收金额*/
	private BigDecimal collection;
	/**待还金额*/
	private BigDecimal waitrepay;
	/**累计收益*/
	private BigDecimal accumulatedIncome;
	/**dataId*/
	private java.lang.Integer dataId;
	/**金额*/
	private BigDecimal money;
	/**备注*/
	private java.lang.String remark;
	/**addtime*/
	private java.util.Date addtime;
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
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  总资产
	 */
	@Column(name ="TOTAL",nullable=false,precision=20,scale=6)
	public BigDecimal getTotal(){
		return this.total;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  总资产
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
	 *@return: BigDecimal  待还金额
	 */
	@Column(name ="WAITREPAY",nullable=false,precision=20,scale=6)
	public BigDecimal getWaitrepay(){
		return this.waitrepay;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  待还金额
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  dataId
	 */
	@Column(name ="DATA_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getDataId(){
		return this.dataId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  dataId
	 */
	public void setDataId(java.lang.Integer dataId){
		this.dataId = dataId;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  金额
	 */
	@Column(name ="MONEY",nullable=true,precision=20,scale=6)
	public BigDecimal getMoney(){
		return this.money;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  金额
	 */
	public void setMoney(BigDecimal money){
		this.money = money;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	@Column(name ="REMARK",nullable=true,length=250)
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
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
