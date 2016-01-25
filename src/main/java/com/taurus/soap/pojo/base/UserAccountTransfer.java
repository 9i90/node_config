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
 * @Description: 用户转账信息
 * @author Frank
 * @date 2016-01-12 10:07:08
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserAccountTransfer {

	/**id*/
	private java.lang.Integer id;
	/**转账名称描述*/
	private java.lang.String tradename;
	/**付款账户ID*/
	private java.lang.Integer ctpayeruserid;
	/**托管付款账户ID*/
	private java.lang.String yjfpayeruserid;
	/**收款账户ID*/
	private java.lang.Integer ctselleruserid;
	/**托管收款账户ID；*/
	private java.lang.String yjfselleruserid;
	/**转账金额*/
	private BigDecimal tradeamount;
	/**转账备注*/
	private java.lang.String tradememo;
	/**成功标识；T：成功, F：失败*/
	private java.lang.String success;
	/**EXECUTE_SUCCESS: 执行转账成功 (注:转账已经成功，不会有异步通知) TRADE_IN_PROCESSING: 交易处理中 (注:转账提交成功，有异步通知，由异步通知中的resultCode来确定转账是否成功) 其他代码: 提交转账失败，失败原因见resultMessage*/
	private java.lang.String resultcode;
	/**处理成功*/
	private java.lang.String resultmessage;
	/**交易号*/
	private java.lang.String tradeno;
	/**创建时间【通知时间】*/
	private java.util.Date addtime;
	/**转账类型 1：平台转向用户；2：用户逾期还款平台；3：平台内部转账【平台转平台】*/
	private java.lang.String transferType;
	/**关联ID（当用户逾期还款平台时，关联borrow_repayment的id*/
	private java.lang.Integer relationId;
	/**唯一编号*/
	private java.lang.String orderno;
	/**创建人编码【仅后台转账使用，暂不适用前台】*/
	private java.lang.String createUser;
	/**状态：0草稿，1审核中，2审核通过，3审核不通过。4转账处理中。对应dw_code_details中【ACCOUNT_TRANSFER_STATUS】*/
	private java.lang.String status;
	/**批量标志：0不是批量，1批量*/
	private java.lang.String batchSign;
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
	 *@return: java.lang.String  转账名称描述
	 */
	@Column(name ="TRADENAME",nullable=true,length=32)
	public java.lang.String getTradename(){
		return this.tradename;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转账名称描述
	 */
	public void setTradename(java.lang.String tradename){
		this.tradename = tradename;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  付款账户ID
	 */
	@Column(name ="CTPAYERUSERID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getCtpayeruserid(){
		return this.ctpayeruserid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  付款账户ID
	 */
	public void setCtpayeruserid(java.lang.Integer ctpayeruserid){
		this.ctpayeruserid = ctpayeruserid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  托管付款账户ID
	 */
	@Column(name ="YJFPAYERUSERID",nullable=true,length=32)
	public java.lang.String getYjfpayeruserid(){
		return this.yjfpayeruserid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  托管付款账户ID
	 */
	public void setYjfpayeruserid(java.lang.String yjfpayeruserid){
		this.yjfpayeruserid = yjfpayeruserid;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  收款账户ID
	 */
	@Column(name ="CTSELLERUSERID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getCtselleruserid(){
		return this.ctselleruserid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  收款账户ID
	 */
	public void setCtselleruserid(java.lang.Integer ctselleruserid){
		this.ctselleruserid = ctselleruserid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  托管收款账户ID；
	 */
	@Column(name ="YJFSELLERUSERID",nullable=true,length=32)
	public java.lang.String getYjfselleruserid(){
		return this.yjfselleruserid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  托管收款账户ID；
	 */
	public void setYjfselleruserid(java.lang.String yjfselleruserid){
		this.yjfselleruserid = yjfselleruserid;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  转账金额
	 */
	@Column(name ="TRADEAMOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getTradeamount(){
		return this.tradeamount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  转账金额
	 */
	public void setTradeamount(BigDecimal tradeamount){
		this.tradeamount = tradeamount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转账备注
	 */
	@Column(name ="TRADEMEMO",nullable=true,length=200)
	public java.lang.String getTradememo(){
		return this.tradememo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转账备注
	 */
	public void setTradememo(java.lang.String tradememo){
		this.tradememo = tradememo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  成功标识；T：成功, F：失败
	 */
	@Column(name ="SUCCESS",nullable=true,length=1)
	public java.lang.String getSuccess(){
		return this.success;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  成功标识；T：成功, F：失败
	 */
	public void setSuccess(java.lang.String success){
		this.success = success;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  EXECUTE_SUCCESS: 执行转账成功 (注:转账已经成功，不会有异步通知) TRADE_IN_PROCESSING: 交易处理中 (注:转账提交成功，有异步通知，由异步通知中的resultCode来确定转账是否成功) 其他代码: 提交转账失败，失败原因见resultMessage
	 */
	@Column(name ="RESULTCODE",nullable=true,length=32)
	public java.lang.String getResultcode(){
		return this.resultcode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  EXECUTE_SUCCESS: 执行转账成功 (注:转账已经成功，不会有异步通知) TRADE_IN_PROCESSING: 交易处理中 (注:转账提交成功，有异步通知，由异步通知中的resultCode来确定转账是否成功) 其他代码: 提交转账失败，失败原因见resultMessage
	 */
	public void setResultcode(java.lang.String resultcode){
		this.resultcode = resultcode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  处理成功
	 */
	@Column(name ="RESULTMESSAGE",nullable=true,length=400)
	public java.lang.String getResultmessage(){
		return this.resultmessage;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  处理成功
	 */
	public void setResultmessage(java.lang.String resultmessage){
		this.resultmessage = resultmessage;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  交易号
	 */
	@Column(name ="TRADENO",nullable=true,length=32)
	public java.lang.String getTradeno(){
		return this.tradeno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  交易号
	 */
	public void setTradeno(java.lang.String tradeno){
		this.tradeno = tradeno;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建时间【通知时间】
	 */
	@Column(name ="ADDTIME",nullable=true)
	public java.util.Date getAddtime(){
		return this.addtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建时间【通知时间】
	 */
	public void setAddtime(java.util.Date addtime){
		this.addtime = addtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转账类型 1：平台转向用户；2：用户逾期还款平台；3：平台内部转账【平台转平台】
	 */
	@Column(name ="TRANSFER_TYPE",nullable=true,length=1)
	public java.lang.String getTransferType(){
		return this.transferType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转账类型 1：平台转向用户；2：用户逾期还款平台；3：平台内部转账【平台转平台】
	 */
	public void setTransferType(java.lang.String transferType){
		this.transferType = transferType;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  关联ID（当用户逾期还款平台时，关联borrow_repayment的id
	 */
	@Column(name ="RELATION_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getRelationId(){
		return this.relationId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  关联ID（当用户逾期还款平台时，关联borrow_repayment的id
	 */
	public void setRelationId(java.lang.Integer relationId){
		this.relationId = relationId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  唯一编号
	 */
	@Column(name ="ORDERNO",nullable=true,length=32)
	public java.lang.String getOrderno(){
		return this.orderno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  唯一编号
	 */
	public void setOrderno(java.lang.String orderno){
		this.orderno = orderno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人编码【仅后台转账使用，暂不适用前台】
	 */
	@Column(name ="CREATE_USER",nullable=true,length=32)
	public java.lang.String getCreateUser(){
		return this.createUser;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人编码【仅后台转账使用，暂不适用前台】
	 */
	public void setCreateUser(java.lang.String createUser){
		this.createUser = createUser;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态：0草稿，1审核中，2审核通过，3审核不通过。4转账处理中。对应dw_code_details中【ACCOUNT_TRANSFER_STATUS】
	 */
	@Column(name ="STATUS",nullable=true,length=2)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态：0草稿，1审核中，2审核通过，3审核不通过。4转账处理中。对应dw_code_details中【ACCOUNT_TRANSFER_STATUS】
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  批量标志：0不是批量，1批量
	 */
	@Column(name ="BATCH_SIGN",nullable=false,length=2)
	public java.lang.String getBatchSign(){
		return this.batchSign;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  批量标志：0不是批量，1批量
	 */
	public void setBatchSign(java.lang.String batchSign){
		this.batchSign = batchSign;
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
