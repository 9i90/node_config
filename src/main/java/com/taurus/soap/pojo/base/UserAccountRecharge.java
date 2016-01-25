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
 * @Description: 用户充值记录表
 * @author Frank
 * @date 2016-01-11 18:46:35
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserAccountRecharge {

	/**id*/
	private java.lang.Integer id;
	/**userId*/
	private java.lang.Integer userId;
	/**订单号*/
	private java.lang.String tradeNo;
	/**状态*/
	private java.lang.String status;
	/**金额*/
	private BigDecimal money;
	/**类型*/
	private java.lang.String type;
	/**备注*/
	private java.lang.String remark;
	/**fee*/
	private BigDecimal fee;
	/**notifytype*/
	private java.lang.String notifytype;
	/**notifytime*/
	private java.util.Date notifytime;
	/**充值流水号*/
	private java.lang.String depositid;
	/**addtime*/
	private java.lang.String addtime;
	/**addip*/
	private java.lang.String addip;
	/**实际到账金额*/
	private BigDecimal amountln;
	
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
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单号
	 */
	@Column(name ="TRADE_NO",nullable=true,length=32)
	public java.lang.String getTradeNo(){
		return this.tradeNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单号
	 */
	public void setTradeNo(java.lang.String tradeNo){
		this.tradeNo = tradeNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态
	 */
	@Column(name ="STATUS",nullable=true,length=2)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
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
	 *@return: java.lang.String  类型
	 */
	@Column(name ="TYPE",nullable=true,length=10)
	public java.lang.String getType(){
		return this.type;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  类型
	 */
	public void setType(java.lang.String type){
		this.type = type;
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
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  fee
	 */
	@Column(name ="FEE",nullable=true,precision=20,scale=6)
	public BigDecimal getFee(){
		return this.fee;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  fee
	 */
	public void setFee(BigDecimal fee){
		this.fee = fee;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  notifytype
	 */
	@Column(name ="NOTIFYTYPE",nullable=true,length=64)
	public java.lang.String getNotifytype(){
		return this.notifytype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  notifytype
	 */
	public void setNotifytype(java.lang.String notifytype){
		this.notifytype = notifytype;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  notifytime
	 */
	@Column(name ="NOTIFYTIME",nullable=true)
	public java.util.Date getNotifytime(){
		return this.notifytime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  notifytime
	 */
	public void setNotifytime(java.util.Date notifytime){
		this.notifytime = notifytime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  充值流水号
	 */
	@Column(name ="DEPOSITID",nullable=true,length=64)
	public java.lang.String getDepositid(){
		return this.depositid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  充值流水号
	 */
	public void setDepositid(java.lang.String depositid){
		this.depositid = depositid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  addtime
	 */
	@Column(name ="ADDTIME",nullable=true,length=20)
	public java.lang.String getAddtime(){
		return this.addtime;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  addtime
	 */
	public void setAddtime(java.lang.String addtime){
		this.addtime = addtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  addip
	 */
	@Column(name ="ADDIP",nullable=true,length=15)
	public java.lang.String getAddip(){
		return this.addip;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  addip
	 */
	public void setAddip(java.lang.String addip){
		this.addip = addip;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  实际到账金额
	 */
	@Column(name ="AMOUNTLN",nullable=true,precision=20,scale=6)
	public BigDecimal getAmountln(){
		return this.amountln;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  实际到账金额
	 */
	public void setAmountln(BigDecimal amountln){
		this.amountln = amountln;
	}

}
