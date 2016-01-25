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
* @ClassName: BorrowCollection 
* @Description: 回款 
* @author Terry
* @date 2016年1月11日 下午4:23:51 
*
 */
@MappedSuperclass
public abstract class BorrowCollection {
	/**回款记录ID*/
	private java.lang.Integer id;
	/**状态（1：已还，2：未还，3：逾期已还，4：逾期未还）*/
	private java.lang.String status;
	/**orderby*/
	private java.lang.Integer orderby;
	/**投资id*/
	private java.lang.Integer tenderId;
	/**应还款时间*/
	private java.util.Date repayTime;
	/**实际还款时间*/
	private java.util.Date repayYestime;
	/**应还金额*/
	private BigDecimal repayAccount;
	/**实还金额*/
	private BigDecimal repayYesaccount;
	/**利息*/
	private BigDecimal interest;
	/**本金*/
	private BigDecimal capital;
	/**逾期天数*/
	private java.lang.Integer lateDays;
	/**逾期利息*/
	private BigDecimal lateInterest;
	/**提交时间*/
	private java.util.Date addtime;
	/**提交IP*/
	private java.lang.String addip;
	/**奖励*/
	private BigDecimal bonus;
	/**所属的借款标【原始标的ID】*/
	private java.lang.Integer borrowId;
	/**平台服务费【wy add at 20150113 记录每期回款服务费的金额】*/
	private BigDecimal platformServiceFee;
	/**20150811 增加最终转让借款ID【转让表ID】*/
	private java.lang.Integer borrowIdLast;
	/**有效标志【Y：有效；N：无效】*/
	private java.lang.String aviFlag;
	/**投资到放款之间的利息*/
	private BigDecimal loanInterest;
	/**加息券加息*/
	private BigDecimal bonusInterest;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  回款记录ID
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
	 *@param: java.lang.Integer  回款记录ID
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态（1：已还，2：未还，3：逾期已还，4：逾期未还）
	 */
	@Column(name ="STATUS",nullable=false,length=2)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态（1：已还，2：未还，3：逾期已还，4：逾期未还）
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  orderby
	 */
	@Column(name ="ORDERBY",nullable=false,precision=10,scale=0)
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  投资id
	 */
	@Column(name ="TENDER_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getTenderId(){
		return this.tenderId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  投资id
	 */
	public void setTenderId(java.lang.Integer tenderId){
		this.tenderId = tenderId;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  应还款时间
	 */
	@Column(name ="REPAY_TIME",nullable=true)
	public java.util.Date getRepayTime(){
		return this.repayTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  应还款时间
	 */
	public void setRepayTime(java.util.Date repayTime){
		this.repayTime = repayTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  实际还款时间
	 */
	@Column(name ="REPAY_YESTIME",nullable=true)
	public java.util.Date getRepayYestime(){
		return this.repayYestime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  实际还款时间
	 */
	public void setRepayYestime(java.util.Date repayYestime){
		this.repayYestime = repayYestime;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  应还金额
	 */
	@Column(name ="REPAY_ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getRepayAccount(){
		return this.repayAccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  应还金额
	 */
	public void setRepayAccount(BigDecimal repayAccount){
		this.repayAccount = repayAccount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  实还金额
	 */
	@Column(name ="REPAY_YESACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getRepayYesaccount(){
		return this.repayYesaccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  实还金额
	 */
	public void setRepayYesaccount(BigDecimal repayYesaccount){
		this.repayYesaccount = repayYesaccount;
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
	 *@return: BigDecimal  本金
	 */
	@Column(name ="CAPITAL",nullable=false,precision=20,scale=6)
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  提交时间
	 */
	@Column(name ="ADDTIME",nullable=false)
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
	@Column(name ="ADDIP",nullable=true,length=32)
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  所属的借款标【原始标的ID】
	 */
	@Column(name ="BORROW_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getBorrowId(){
		return this.borrowId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  所属的借款标【原始标的ID】
	 */
	public void setBorrowId(java.lang.Integer borrowId){
		this.borrowId = borrowId;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  平台服务费【wy add at 20150113 记录每期回款服务费的金额】
	 */
	@Column(name ="PLATFORM_SERVICE_FEE",nullable=true,precision=20,scale=6)
	public BigDecimal getPlatformServiceFee(){
		return this.platformServiceFee;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  平台服务费【wy add at 20150113 记录每期回款服务费的金额】
	 */
	public void setPlatformServiceFee(BigDecimal platformServiceFee){
		this.platformServiceFee = platformServiceFee;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  20150811 增加最终转让借款ID【转让表ID】
	 */
	@Column(name ="BORROW_ID_LAST",nullable=true,precision=10,scale=0)
	public java.lang.Integer getBorrowIdLast(){
		return this.borrowIdLast;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  20150811 增加最终转让借款ID【转让表ID】
	 */
	public void setBorrowIdLast(java.lang.Integer borrowIdLast){
		this.borrowIdLast = borrowIdLast;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  有效标志【Y：有效；N：无效】
	 */
	@Column(name ="AVI_FLAG",nullable=false,length=2)
	public java.lang.String getAviFlag(){
		return this.aviFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  有效标志【Y：有效；N：无效】
	 */
	public void setAviFlag(java.lang.String aviFlag){
		this.aviFlag = aviFlag;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  投资到放款之间的利息
	 */
	@Column(name ="LOAN_INTEREST",nullable=false,precision=20,scale=6)
	public BigDecimal getLoanInterest(){
		return this.loanInterest;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  投资到放款之间的利息
	 */
	public void setLoanInterest(BigDecimal loanInterest){
		this.loanInterest = loanInterest;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  加息券加息
	 */
	@Column(name ="BONUS_INTEREST",nullable=false,precision=20,scale=6)
	public BigDecimal getBonusInterest(){
		return this.bonusInterest;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  加息券加息
	 */
	public void setBonusInterest(BigDecimal bonusInterest){
		this.bonusInterest = bonusInterest;
	}
}
