package com.taurus.soap.pojo.base;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**
 * 
* @ClassName: BorrowTender 
* @Description: 借款投资 
* @author Terry
* @date 2016年1月11日 下午4:42:51 
*
 */
@MappedSuperclass
public abstract class BorrowTender {
	/**投资ID*/
	private java.lang.Integer tenderId;
	/**用户ID*/
	private java.lang.Integer userId;
	/**借款ID*/
	private java.lang.Integer borrowId;
	/**转让表*/
	private java.lang.Integer transferId;
	/**typeId*/
	private java.lang.Integer typeId;
	/**状态*/
	private java.lang.String status;
	/**投资金额【所有金额，包括券、红包、积分等】*/
	private BigDecimal money;
	/**account*/
	private BigDecimal account;
	/**投资份数*/
	private java.lang.Integer lot;
	/**总额*/
	private BigDecimal repaymentAccount;
	/**利息*/
	private BigDecimal interest;
	/**已还总额*/
	private BigDecimal repaymentYesaccount;
	/**待还总额*/
	private BigDecimal waitAccount;
	/**待还利息*/
	private BigDecimal waitInterest;
	/**已还利息*/
	private BigDecimal repaymentYesinterest;
	/**提交时间*/
	private java.util.Date addtime;
	/**提交IP*/
	private java.lang.String addip;
	/**投资人此次投资生成的唯一编号*/
	private java.lang.String subTradeNo;
	/**使用的代金券总金额*/
	private BigDecimal bonusAmount;
	/**使用的体验金总额*/
	private BigDecimal experienceAmount;
	/**投标来源【1：PC端、2：微信】*/
	private java.lang.String source;
	/**投标类型【1：普通标的；2：转让标的】*/
	private java.lang.String tenderType;
	/**加息券总利率*/
	private BigDecimal bonusApr;
	/**投资备注*/
	private java.lang.String memo;
	/**可转让份额【本投资转让标后，不能再转让，转让份额0】*/
	private java.lang.Integer transferLot;
	/**转让状态（0：未转让，1：已转让，5：转让申请中）*/
	private java.lang.String transferStatus;
	/**转让次数*/
	private java.lang.Integer transferTimes;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  投资ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
	@Column(name ="TENDER_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getTenderId(){
		return this.tenderId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  投资ID
	 */
	public void setTenderId(java.lang.Integer tenderId){
		this.tenderId = tenderId;
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  借款ID
	 */
	@Column(name ="BORROW_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getBorrowId(){
		return this.borrowId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  借款ID
	 */
	public void setBorrowId(java.lang.Integer borrowId){
		this.borrowId = borrowId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  转让表
	 */
	@Column(name ="TRANSFER_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getTransferId(){
		return this.transferId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  转让表
	 */
	public void setTransferId(java.lang.Integer transferId){
		this.transferId = transferId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  typeId
	 */
	@Column(name ="TYPE_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getTypeId(){
		return this.typeId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  typeId
	 */
	public void setTypeId(java.lang.Integer typeId){
		this.typeId = typeId;
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
	 *@return: BigDecimal  投资金额【所有金额，包括券、红包、积分等】
	 */
	@Column(name ="MONEY",nullable=true,precision=20,scale=6)
	public BigDecimal getMoney(){
		return this.money;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  投资金额【所有金额，包括券、红包、积分等】
	 */
	public void setMoney(BigDecimal money){
		this.money = money;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  account
	 */
	@Column(name ="ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getAccount(){
		return this.account;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  account
	 */
	public void setAccount(BigDecimal account){
		this.account = account;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  投资份数
	 */
	@Column(name ="LOT",nullable=true,precision=10,scale=0)
	public java.lang.Integer getLot(){
		return this.lot;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  投资份数
	 */
	public void setLot(java.lang.Integer lot){
		this.lot = lot;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  总额
	 */
	@Column(name ="REPAYMENT_ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getRepaymentAccount(){
		return this.repaymentAccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  总额
	 */
	public void setRepaymentAccount(BigDecimal repaymentAccount){
		this.repaymentAccount = repaymentAccount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  利息
	 */
	@Column(name ="INTEREST",nullable=false,precision=20,scale=6)
	public BigDecimal getInterest(){
		return this.interest;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  利息
	 */
	public void setInterest(BigDecimal interest){
		this.interest = interest;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  已还总额
	 */
	@Column(name ="REPAYMENT_YESACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getRepaymentYesaccount(){
		return this.repaymentYesaccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  已还总额
	 */
	public void setRepaymentYesaccount(BigDecimal repaymentYesaccount){
		this.repaymentYesaccount = repaymentYesaccount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  待还总额
	 */
	@Column(name ="WAIT_ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getWaitAccount(){
		return this.waitAccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  待还总额
	 */
	public void setWaitAccount(BigDecimal waitAccount){
		this.waitAccount = waitAccount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  待还利息
	 */
	@Column(name ="WAIT_INTEREST",nullable=true,precision=20,scale=6)
	public BigDecimal getWaitInterest(){
		return this.waitInterest;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  待还利息
	 */
	public void setWaitInterest(BigDecimal waitInterest){
		this.waitInterest = waitInterest;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  已还利息
	 */
	@Column(name ="REPAYMENT_YESINTEREST",nullable=true,precision=20,scale=6)
	public BigDecimal getRepaymentYesinterest(){
		return this.repaymentYesinterest;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  已还利息
	 */
	public void setRepaymentYesinterest(BigDecimal repaymentYesinterest){
		this.repaymentYesinterest = repaymentYesinterest;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  提交时间
	 */
	@Column(name ="ADDTIME",nullable=true)
	public java.util.Date getAddtime(){
		return this.addtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  提交时间
	 */
	public void setAddtime(java.util.Date addtime){
		this.addtime = addtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  提交IP
	 */
	@Column(name ="ADDIP",nullable=true,length=50)
	public java.lang.String getAddip(){
		return this.addip;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  提交IP
	 */
	public void setAddip(java.lang.String addip){
		this.addip = addip;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  投资人此次投资生成的唯一编号
	 */
	@Column(name ="SUB_TRADE_NO",nullable=false,length=32)
	public java.lang.String getSubTradeNo(){
		return this.subTradeNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  投资人此次投资生成的唯一编号
	 */
	public void setSubTradeNo(java.lang.String subTradeNo){
		this.subTradeNo = subTradeNo;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  使用的代金券总金额
	 */
	@Column(name ="BONUS_AMOUNT",nullable=true,precision=20,scale=2)
	public BigDecimal getBonusAmount(){
		return this.bonusAmount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  使用的代金券总金额
	 */
	public void setBonusAmount(BigDecimal bonusAmount){
		this.bonusAmount = bonusAmount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  使用的体验金总额
	 */
	@Column(name ="EXPERIENCE_AMOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getExperienceAmount(){
		return this.experienceAmount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  使用的体验金总额
	 */
	public void setExperienceAmount(BigDecimal experienceAmount){
		this.experienceAmount = experienceAmount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  投标来源【1：PC端、2：微信】
	 */
	@Column(name ="SOURCE",nullable=true,length=1)
	public java.lang.String getSource(){
		return this.source;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  投标来源【1：PC端、2：微信】
	 */
	public void setSource(java.lang.String source){
		this.source = source;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  投标类型【1：普通标的；2：转让标的】
	 */
	@Column(name ="TENDER_TYPE",nullable=true,length=1)
	public java.lang.String getTenderType(){
		return this.tenderType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  投标类型【1：普通标的；2：转让标的】
	 */
	public void setTenderType(java.lang.String tenderType){
		this.tenderType = tenderType;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  加息券总利率
	 */
	@Column(name ="BONUS_APR",nullable=false,precision=10,scale=6)
	public BigDecimal getBonusApr(){
		return this.bonusApr;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  加息券总利率
	 */
	public void setBonusApr(BigDecimal bonusApr){
		this.bonusApr = bonusApr;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  投资备注
	 */
	@Column(name ="MEMO",nullable=true,length=200)
	public java.lang.String getMemo(){
		return this.memo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  投资备注
	 */
	public void setMemo(java.lang.String memo){
		this.memo = memo;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  可转让份额【本投资转让标后，不能再转让，转让份额0】
	 */
	@Column(name ="TRANSFER_LOT",nullable=true,precision=10,scale=0)
	public java.lang.Integer getTransferLot(){
		return this.transferLot;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  可转让份额【本投资转让标后，不能再转让，转让份额0】
	 */
	public void setTransferLot(java.lang.Integer transferLot){
		this.transferLot = transferLot;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转让状态（0：未转让，1：已转让，5：转让申请中）
	 */
	@Column(name ="TRANSFER_STATUS",nullable=false,length=2)
	public java.lang.String getTransferStatus(){
		return this.transferStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转让状态（0：未转让，1：已转让，5：转让申请中）
	 */
	public void setTransferStatus(java.lang.String transferStatus){
		this.transferStatus = transferStatus;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  转让次数
	 */
	@Column(name ="TRANSFER_TIMES",nullable=true,precision=10,scale=0)
	public java.lang.Integer getTransferTimes(){
		return this.transferTimes;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  转让次数
	 */
	public void setTransferTimes(java.lang.Integer transferTimes){
		this.transferTimes = transferTimes;
	}
}
