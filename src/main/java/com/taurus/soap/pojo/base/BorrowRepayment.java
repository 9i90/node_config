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
* @ClassName: BorrowRepayment 
* @Description: 借款还款计划 
* @author Terry
* @date 2016年1月11日 下午4:39:54 
*
 */
@MappedSuperclass
public abstract class BorrowRepayment {
	/**还款计划表ID*/
	private java.lang.Integer id;
	/**借款id*/
	private java.lang.Integer borrowId;
	/**1待还、2已还、3逾期、4逾期已还、5网站代还*/
	private java.lang.String status;
	/**orderby*/
	private java.lang.Integer orderby;
	/**应还款时间*/
	private java.util.Date repaymentTime;
	/**实际还款时间*/
	private java.util.Date repaymentYestime;
	/**应还金额*/
	private BigDecimal repaymentAccount;
	/**实还金额*/
	private BigDecimal repaymentYesaccount;
	/**逾期天数*/
	private java.lang.Integer lateDays;
	/**逾期利息*/
	private BigDecimal lateInterest;
	/**利息*/
	private BigDecimal interest;
	/**本金*/
	private BigDecimal capital;
	/**罚息*/
	private BigDecimal forfeit;
	/**创建时间*/
	private java.util.Date addtime;
	/**addip*/
	private java.lang.String addip;
	/**奖励*/
	private BigDecimal bonus;
	/**平台服务费【wy add at 20150113 记录（放款费用表）每期还款的服务费总额】*/
	private BigDecimal platformServiceFee;
	/**还款交易唯一编号【wy add at 20150116】*/
	private java.lang.String tradeNo;
	/**是否平台已经垫付 【Y：是；N：否】,对应dw_code_details【ADVANCE_FLAG】*/
	private java.lang.String advanceFlag;
	/**还款方式【1、线上还款；2、线下还款】*/
	private java.lang.String repaymentStyle;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  还款计划表ID
	 */
	
//	@Id
//	@GeneratedValue(generator = "paymentableGenerator")
//	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
	@Column(name ="ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  还款计划表ID
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  借款id
	 */
	@Column(name ="BORROW_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getBorrowId(){
		return this.borrowId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  借款id
	 */
	public void setBorrowId(java.lang.Integer borrowId){
		this.borrowId = borrowId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  1待还、2已还、3逾期、4逾期已还、5网站代还
	 */
	@Column(name ="STATUS",nullable=true,length=2)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  1待还、2已还、3逾期、4逾期已还、5网站代还
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  orderby
	 */
	@Column(name ="ORDERBY",nullable=true,precision=10,scale=0)
	public java.lang.Integer getOrderby(){
		return this.orderby;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  orderby
	 */
	public void setOrderby(java.lang.Integer orderby){
		this.orderby = orderby;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  应还款时间
	 */
	@Column(name ="REPAYMENT_TIME",nullable=true)
	public java.util.Date getRepaymentTime(){
		return this.repaymentTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  应还款时间
	 */
	public void setRepaymentTime(java.util.Date repaymentTime){
		this.repaymentTime = repaymentTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  实际还款时间
	 */
	@Column(name ="REPAYMENT_YESTIME",nullable=true)
	public java.util.Date getRepaymentYestime(){
		return this.repaymentYestime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  实际还款时间
	 */
	public void setRepaymentYestime(java.util.Date repaymentYestime){
		this.repaymentYestime = repaymentYestime;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  应还金额
	 */
	@Column(name ="REPAYMENT_ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getRepaymentAccount(){
		return this.repaymentAccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  应还金额
	 */
	public void setRepaymentAccount(BigDecimal repaymentAccount){
		this.repaymentAccount = repaymentAccount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  实还金额
	 */
	@Column(name ="REPAYMENT_YESACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getRepaymentYesaccount(){
		return this.repaymentYesaccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  实还金额
	 */
	public void setRepaymentYesaccount(BigDecimal repaymentYesaccount){
		this.repaymentYesaccount = repaymentYesaccount;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  逾期天数
	 */
	@Column(name ="LATE_DAYS",nullable=true,precision=10,scale=0)
	public java.lang.Integer getLateDays(){
		return this.lateDays;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  逾期天数
	 */
	public void setLateDays(java.lang.Integer lateDays){
		this.lateDays = lateDays;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  逾期利息
	 */
	@Column(name ="LATE_INTEREST",nullable=true,precision=20,scale=6)
	public BigDecimal getLateInterest(){
		return this.lateInterest;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  逾期利息
	 */
	public void setLateInterest(BigDecimal lateInterest){
		this.lateInterest = lateInterest;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  利息
	 */
	@Column(name ="INTEREST",nullable=true,precision=20,scale=6)
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
	 *@return: BigDecimal  本金
	 */
	@Column(name ="CAPITAL",nullable=true,precision=20,scale=6)
	public BigDecimal getCapital(){
		return this.capital;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  本金
	 */
	public void setCapital(BigDecimal capital){
		this.capital = capital;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  罚息
	 */
	@Column(name ="FORFEIT",nullable=true,precision=20,scale=6)
	public BigDecimal getForfeit(){
		return this.forfeit;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  罚息
	 */
	public void setForfeit(BigDecimal forfeit){
		this.forfeit = forfeit;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建时间
	 */
	@Column(name ="ADDTIME",nullable=true)
	public java.util.Date getAddtime(){
		return this.addtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建时间
	 */
	public void setAddtime(java.util.Date addtime){
		this.addtime = addtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  addip
	 */
	@Column(name ="ADDIP",nullable=true,length=32)
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
	 *@return: BigDecimal  奖励
	 */
	@Column(name ="BONUS",nullable=true,precision=20,scale=6)
	public BigDecimal getBonus(){
		return this.bonus;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  奖励
	 */
	public void setBonus(BigDecimal bonus){
		this.bonus = bonus;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  平台服务费【wy add at 20150113 记录（放款费用表）每期还款的服务费总额】
	 */
	@Column(name ="PLATFORM_SERVICE_FEE",nullable=true,precision=20,scale=6)
	public BigDecimal getPlatformServiceFee(){
		return this.platformServiceFee;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  平台服务费【wy add at 20150113 记录（放款费用表）每期还款的服务费总额】
	 */
	public void setPlatformServiceFee(BigDecimal platformServiceFee){
		this.platformServiceFee = platformServiceFee;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  还款交易唯一编号【wy add at 20150116】
	 */
	@Column(name ="TRADE_NO",nullable=true,length=30)
	public java.lang.String getTradeNo(){
		return this.tradeNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  还款交易唯一编号【wy add at 20150116】
	 */
	public void setTradeNo(java.lang.String tradeNo){
		this.tradeNo = tradeNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否平台已经垫付 【Y：是；N：否】,对应dw_code_details【ADVANCE_FLAG】
	 */
	@Column(name ="ADVANCE_FLAG",nullable=true,length=1)
	public java.lang.String getAdvanceFlag(){
		return this.advanceFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否平台已经垫付 【Y：是；N：否】,对应dw_code_details【ADVANCE_FLAG】
	 */
	public void setAdvanceFlag(java.lang.String advanceFlag){
		this.advanceFlag = advanceFlag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  还款方式【1、线上还款；2、线下还款】
	 */
	@Column(name ="REPAYMENT_STYLE",nullable=true,length=1)
	public java.lang.String getRepaymentStyle(){
		return this.repaymentStyle;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  还款方式【1、线上还款；2、线下还款】
	 */
	public void setRepaymentStyle(java.lang.String repaymentStyle){
		this.repaymentStyle = repaymentStyle;
	}
}

