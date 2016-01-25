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
 * @Description: 用户提现信息
 * @author Frank
 * @date 2016-01-11 17:59:50
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserAccountCash {

	/**id*/
	private java.lang.Integer id;
	/**userId*/
	private java.lang.Integer userId;
	/**交易号*/
	private java.lang.String tradeNo;
	/**状态*/
	private java.lang.String status;
	/**银行帐号*/
	private java.lang.String account;
	/**所属银行*/
	private java.lang.String bank;
	/**支行*/
	private java.lang.String branch;
	/**提现总额【暂时未用】*/
	private java.lang.String total;
	/**提现金额*/
	private BigDecimal money;
	/**实际到账金额*/
	private BigDecimal amountln;
	/**手续费*/
	private BigDecimal fee;
	/**备注*/
	private java.lang.String memo;
	/**提现时间*/
	private java.lang.String addtime;
	/**提现时客户端ip*/
	private java.lang.String addip;
	/**通知时间*/
	private java.util.Date notifytime;
	/**外部订单号*/
	private java.lang.String outbizno;
	/**流水号*/
	private java.lang.String payno;
	/**支付类型*/
	private java.lang.String paytype;
	/**对应paytype字段的描述*/
	private java.lang.String paytypemessage;
	/**提现结果码*/
	private java.lang.String resultcode;
	/**审核状态：0:不审核，1初审中,2初审通过,3初审不通过，4复审不通过，5复审通过*/
	private java.lang.String auditStatus;
	
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
	 *@return: java.lang.String  交易号
	 */
	@Column(name ="TRADE_NO",nullable=false,length=32)
	public java.lang.String getTradeNo(){
		return this.tradeNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  交易号
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行帐号
	 */
	@Column(name ="ACCOUNT",nullable=true,length=50)
	public java.lang.String getAccount(){
		return this.account;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行帐号
	 */
	public void setAccount(java.lang.String account){
		this.account = account;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属银行
	 */
	@Column(name ="BANK",nullable=true,length=302)
	public java.lang.String getBank(){
		return this.bank;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属银行
	 */
	public void setBank(java.lang.String bank){
		this.bank = bank;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  支行
	 */
	@Column(name ="BRANCH",nullable=true,length=100)
	public java.lang.String getBranch(){
		return this.branch;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  支行
	 */
	public void setBranch(java.lang.String branch){
		this.branch = branch;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  提现总额【暂时未用】
	 */
	@Column(name ="TOTAL",nullable=true,length=20)
	public java.lang.String getTotal(){
		return this.total;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  提现总额【暂时未用】
	 */
	public void setTotal(java.lang.String total){
		this.total = total;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  提现金额
	 */
	@Column(name ="MONEY",nullable=true,precision=20,scale=6)
	public BigDecimal getMoney(){
		return this.money;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  提现金额
	 */
	public void setMoney(BigDecimal money){
		this.money = money;
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
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  手续费
	 */
	@Column(name ="FEE",nullable=true,precision=20,scale=6)
	public BigDecimal getFee(){
		return this.fee;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  手续费
	 */
	public void setFee(BigDecimal fee){
		this.fee = fee;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	@Column(name ="MEMO",nullable=true,length=250)
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  提现时间
	 */
	@Column(name ="ADDTIME",nullable=true,length=20)
	public java.lang.String getAddtime(){
		return this.addtime;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  提现时间
	 */
	public void setAddtime(java.lang.String addtime){
		this.addtime = addtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  提现时客户端ip
	 */
	@Column(name ="ADDIP",nullable=true,length=15)
	public java.lang.String getAddip(){
		return this.addip;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  提现时客户端ip
	 */
	public void setAddip(java.lang.String addip){
		this.addip = addip;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  通知时间
	 */
	@Column(name ="NOTIFYTIME",nullable=true)
	public java.util.Date getNotifytime(){
		return this.notifytime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  通知时间
	 */
	public void setNotifytime(java.util.Date notifytime){
		this.notifytime = notifytime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  外部订单号
	 */
	@Column(name ="OUTBIZNO",nullable=true,length=50)
	public java.lang.String getOutbizno(){
		return this.outbizno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  外部订单号
	 */
	public void setOutbizno(java.lang.String outbizno){
		this.outbizno = outbizno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流水号
	 */
	@Column(name ="PAYNO",nullable=true,length=50)
	public java.lang.String getPayno(){
		return this.payno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流水号
	 */
	public void setPayno(java.lang.String payno){
		this.payno = payno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  支付类型
	 */
	@Column(name ="PAYTYPE",nullable=true,length=50)
	public java.lang.String getPaytype(){
		return this.paytype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  支付类型
	 */
	public void setPaytype(java.lang.String paytype){
		this.paytype = paytype;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  对应paytype字段的描述
	 */
	@Column(name ="PAYTYPEMESSAGE",nullable=true,length=400)
	public java.lang.String getPaytypemessage(){
		return this.paytypemessage;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  对应paytype字段的描述
	 */
	public void setPaytypemessage(java.lang.String paytypemessage){
		this.paytypemessage = paytypemessage;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  提现结果码
	 */
	@Column(name ="RESULTCODE",nullable=true,length=50)
	public java.lang.String getResultcode(){
		return this.resultcode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  提现结果码
	 */
	public void setResultcode(java.lang.String resultcode){
		this.resultcode = resultcode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  审核状态：0:不审核，1初审中,2初审通过,3初审不通过，4复审不通过，5复审通过
	 */
	@Column(name ="AUDIT_STATUS",nullable=true,length=2)
	public java.lang.String getAuditStatus(){
		return this.auditStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  审核状态：0:不审核，1初审中,2初审通过,3初审不通过，4复审不通过，5复审通过
	 */
	public void setAuditStatus(java.lang.String auditStatus){
		this.auditStatus = auditStatus;
	}

}
