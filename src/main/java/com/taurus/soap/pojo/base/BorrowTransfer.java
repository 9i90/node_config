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
* @ClassName: BorrowTransfer 
* @Description: 借款转让 
* @author Terry
* @date 2016年1月11日 下午4:46:42 
*
 */
@MappedSuperclass
public abstract class BorrowTransfer {
	/**转让项目编号*/
	private java.lang.Integer id;
	/**借款表ID*/
	private java.lang.Integer borrowId;
	/**投标表ID【需要转让的投标表关联ID】*/
	private java.lang.Integer tenderId;
	/**状态【0：转让待审核；1：投标中；2：满标；5：放款处理中；6：流标处理中9：流标； 10：已转让 】*/
	private java.lang.String status;
	/**投标方式【1：手动投标；2：自动投标；3：手自均可】*/
	private java.lang.String tenderWay;
	/**转让方式【1：投资人手动转让；2：后台手动转让；3：自动转让；】*/
	private java.lang.String transferWay;
	/**上一级标的【顶级为null】*/
	private java.lang.Integer pid;
	/**转让标的名称*/
	private java.lang.String name;
	/**用户流水号*/
	private java.lang.Integer userId;
	/**转让份额*/
	private java.lang.Integer lot;
	/**每份单价*/
	private BigDecimal price;
	/**转让金额【未还款的剩余本金和当期利息】*/
	private BigDecimal money;
	/**当期结息【月中转让，需要给转让人的利息】*/
	private BigDecimal curRate;
	/**转让年利率-转让后折算的年利率*/
	private BigDecimal apr;
	/**剩余本金*/
	private BigDecimal capital;
	/**转让手续费*/
	private BigDecimal fee;
	/**转让承接人红包*/
	private BigDecimal bonus;
	/**借款期限*/
	private java.lang.String timeLimit;
	/**还款方式*/
	private java.lang.String style;
	/**转让发布时间*/
	private java.util.Date publishTime;
	/**转让结束时间*/
	private java.util.Date endTime;
	/**创建人*/
	private java.lang.String createUser;
	/**创建时间*/
	private java.util.Date createTime;
	/**最后一次更新时间*/
	private java.util.Date updateTime;
	/**满标时间*/
	private java.util.Date successTime;
	/**满标放款时间*/
	private java.util.Date releaseTime;
	/**满标审核状态：0：未审核，1：审核通过，2：审核未通过*/
	private java.lang.String verifyStatus;
	/**删除状态【N：删除。Y：正常】*/
	private java.lang.String validStatus;
	/**总期数*/
	private java.lang.Integer totalPeriod;
	/**第三方交易编号*/
	private java.lang.String tradeCode;
	/**流标时间*/
	private java.util.Date loseTime;
	/**流标类型  dw_code_details BORROW_LOSE_STATE【1、自动流标；2、手动流标】*/
	private java.lang.String loseState;
	/**借款期限开始时间【满标放款后，易极付接口异步返回放款成功的第一天】放款成功时生成借款合同所需数据*/
	private java.util.Date starttimeLimit;
	/**借款期限结束时间【根据借款期限开始时间和借款期限计算出结束时间】放款成功时生成借款合同所需数据*/
	private java.util.Date endtimeLimit;
	/**流标原因【审核不通过原因】*/
	private java.lang.String loseMemo;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  转让项目编号
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
	 *@param: java.lang.Integer  转让项目编号
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  借款表ID
	 */
	@Column(name ="BORROW_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getBorrowId(){
		return this.borrowId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  借款表ID
	 */
	public void setBorrowId(java.lang.Integer borrowId){
		this.borrowId = borrowId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  投标表ID【需要转让的投标表关联ID】
	 */
	@Column(name ="TENDER_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getTenderId(){
		return this.tenderId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  投标表ID【需要转让的投标表关联ID】
	 */
	public void setTenderId(java.lang.Integer tenderId){
		this.tenderId = tenderId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态【0：转让待审核；1：投标中；2：满标；5：放款处理中；6：流标处理中9：流标； 10：已转让 】
	 */
	@Column(name ="STATUS",nullable=true,length=2)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态【0：转让待审核；1：投标中；2：满标；5：放款处理中；6：流标处理中9：流标； 10：已转让 】
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  投标方式【1：手动投标；2：自动投标；3：手自均可】
	 */
	@Column(name ="TENDER_WAY",nullable=true,length=2)
	public java.lang.String getTenderWay(){
		return this.tenderWay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  投标方式【1：手动投标；2：自动投标；3：手自均可】
	 */
	public void setTenderWay(java.lang.String tenderWay){
		this.tenderWay = tenderWay;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转让方式【1：投资人手动转让；2：后台手动转让；3：自动转让；】
	 */
	@Column(name ="TRANSFER_WAY",nullable=true,length=2)
	public java.lang.String getTransferWay(){
		return this.transferWay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转让方式【1：投资人手动转让；2：后台手动转让；3：自动转让；】
	 */
	public void setTransferWay(java.lang.String transferWay){
		this.transferWay = transferWay;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  上一级标的【顶级为null】
	 */
	@Column(name ="PID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getPid(){
		return this.pid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  上一级标的【顶级为null】
	 */
	public void setPid(java.lang.Integer pid){
		this.pid = pid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转让标的名称
	 */
	@Column(name ="NAME",nullable=true,length=255)
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转让标的名称
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户流水号
	 */
	@Column(name ="USER_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getUserId(){
		return this.userId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  用户流水号
	 */
	public void setUserId(java.lang.Integer userId){
		this.userId = userId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  转让份额
	 */
	@Column(name ="LOT",nullable=true,precision=10,scale=0)
	public java.lang.Integer getLot(){
		return this.lot;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  转让份额
	 */
	public void setLot(java.lang.Integer lot){
		this.lot = lot;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  每份单价
	 */
	@Column(name ="PRICE",nullable=true,precision=20,scale=2)
	public BigDecimal getPrice(){
		return this.price;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  每份单价
	 */
	public void setPrice(BigDecimal price){
		this.price = price;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  转让金额【未还款的剩余本金和当期利息】
	 */
	@Column(name ="MONEY",nullable=true,precision=20,scale=2)
	public BigDecimal getMoney(){
		return this.money;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  转让金额【未还款的剩余本金和当期利息】
	 */
	public void setMoney(BigDecimal money){
		this.money = money;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  当期结息【月中转让，需要给转让人的利息】
	 */
	@Column(name ="CUR_RATE",nullable=true,precision=20,scale=2)
	public BigDecimal getCurRate(){
		return this.curRate;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  当期结息【月中转让，需要给转让人的利息】
	 */
	public void setCurRate(BigDecimal curRate){
		this.curRate = curRate;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  转让年利率-转让后折算的年利率
	 */
	@Column(name ="APR",nullable=true,precision=20,scale=6)
	public BigDecimal getApr(){
		return this.apr;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  转让年利率-转让后折算的年利率
	 */
	public void setApr(BigDecimal apr){
		this.apr = apr;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  剩余本金
	 */
	@Column(name ="CAPITAL",nullable=true,precision=20,scale=2)
	public BigDecimal getCapital(){
		return this.capital;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  剩余本金
	 */
	public void setCapital(BigDecimal capital){
		this.capital = capital;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  转让手续费
	 */
	@Column(name ="FEE",nullable=true,precision=20,scale=2)
	public BigDecimal getFee(){
		return this.fee;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  转让手续费
	 */
	public void setFee(BigDecimal fee){
		this.fee = fee;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  转让承接人红包
	 */
	@Column(name ="BONUS",nullable=false,precision=20,scale=2)
	public BigDecimal getBonus(){
		return this.bonus;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  转让承接人红包
	 */
	public void setBonus(BigDecimal bonus){
		this.bonus = bonus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借款期限
	 */
	@Column(name ="TIME_LIMIT",nullable=true,length=50)
	public java.lang.String getTimeLimit(){
		return this.timeLimit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款期限
	 */
	public void setTimeLimit(java.lang.String timeLimit){
		this.timeLimit = timeLimit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  还款方式
	 */
	@Column(name ="STYLE",nullable=true,length=50)
	public java.lang.String getStyle(){
		return this.style;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  还款方式
	 */
	public void setStyle(java.lang.String style){
		this.style = style;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  转让发布时间
	 */
	@Column(name ="PUBLISH_TIME",nullable=true)
	public java.util.Date getPublishTime(){
		return this.publishTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  转让发布时间
	 */
	public void setPublishTime(java.util.Date publishTime){
		this.publishTime = publishTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  转让结束时间
	 */
	@Column(name ="END_TIME",nullable=true)
	public java.util.Date getEndTime(){
		return this.endTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  转让结束时间
	 */
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人
	 */
	@Column(name ="CREATE_USER",nullable=true,length=20)
	public java.lang.String getCreateUser(){
		return this.createUser;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人
	 */
	public void setCreateUser(java.lang.String createUser){
		this.createUser = createUser;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建时间
	 */
	@Column(name ="CREATE_TIME",nullable=true)
	public java.util.Date getCreateTime(){
		return this.createTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建时间
	 */
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  最后一次更新时间
	 */
	@Column(name ="UPDATE_TIME",nullable=true)
	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  最后一次更新时间
	 */
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  满标时间
	 */
	@Column(name ="SUCCESS_TIME",nullable=true)
	public java.util.Date getSuccessTime(){
		return this.successTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  满标时间
	 */
	public void setSuccessTime(java.util.Date successTime){
		this.successTime = successTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  满标放款时间
	 */
	@Column(name ="RELEASE_TIME",nullable=true)
	public java.util.Date getReleaseTime(){
		return this.releaseTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  满标放款时间
	 */
	public void setReleaseTime(java.util.Date releaseTime){
		this.releaseTime = releaseTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  满标审核状态：0：未审核，1：审核通过，2：审核未通过
	 */
	@Column(name ="VERIFY_STATUS",nullable=true,length=1)
	public java.lang.String getVerifyStatus(){
		return this.verifyStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  满标审核状态：0：未审核，1：审核通过，2：审核未通过
	 */
	public void setVerifyStatus(java.lang.String verifyStatus){
		this.verifyStatus = verifyStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  删除状态【N：删除。Y：正常】
	 */
	@Column(name ="VALID_STATUS",nullable=true,length=2)
	public java.lang.String getValidStatus(){
		return this.validStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  删除状态【N：删除。Y：正常】
	 */
	public void setValidStatus(java.lang.String validStatus){
		this.validStatus = validStatus;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  总期数
	 */
	@Column(name ="TOTAL_PERIOD",nullable=true,precision=10,scale=0)
	public java.lang.Integer getTotalPeriod(){
		return this.totalPeriod;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  总期数
	 */
	public void setTotalPeriod(java.lang.Integer totalPeriod){
		this.totalPeriod = totalPeriod;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  第三方交易编号
	 */
	@Column(name ="TRADE_CODE",nullable=true,length=25)
	public java.lang.String getTradeCode(){
		return this.tradeCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  第三方交易编号
	 */
	public void setTradeCode(java.lang.String tradeCode){
		this.tradeCode = tradeCode;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  流标时间
	 */
	@Column(name ="LOSE_TIME",nullable=true)
	public java.util.Date getLoseTime(){
		return this.loseTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  流标时间
	 */
	public void setLoseTime(java.util.Date loseTime){
		this.loseTime = loseTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流标类型  dw_code_details BORROW_LOSE_STATE【1、自动流标；2、手动流标】
	 */
	@Column(name ="LOSE_STATE",nullable=true,length=1)
	public java.lang.String getLoseState(){
		return this.loseState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流标类型  dw_code_details BORROW_LOSE_STATE【1、自动流标；2、手动流标】
	 */
	public void setLoseState(java.lang.String loseState){
		this.loseState = loseState;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  借款期限开始时间【满标放款后，易极付接口异步返回放款成功的第一天】放款成功时生成借款合同所需数据
	 */
	@Column(name ="STARTTIME_LIMIT",nullable=true)
	public java.util.Date getStarttimeLimit(){
		return this.starttimeLimit;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  借款期限开始时间【满标放款后，易极付接口异步返回放款成功的第一天】放款成功时生成借款合同所需数据
	 */
	public void setStarttimeLimit(java.util.Date starttimeLimit){
		this.starttimeLimit = starttimeLimit;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  借款期限结束时间【根据借款期限开始时间和借款期限计算出结束时间】放款成功时生成借款合同所需数据
	 */
	@Column(name ="ENDTIME_LIMIT",nullable=true)
	public java.util.Date getEndtimeLimit(){
		return this.endtimeLimit;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  借款期限结束时间【根据借款期限开始时间和借款期限计算出结束时间】放款成功时生成借款合同所需数据
	 */
	public void setEndtimeLimit(java.util.Date endtimeLimit){
		this.endtimeLimit = endtimeLimit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流标原因【审核不通过原因】
	 */
	@Column(name ="LOSE_MEMO",nullable=true,length=4000)
	public java.lang.String getLoseMemo(){
		return this.loseMemo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流标原因【审核不通过原因】
	 */
	public void setLoseMemo(java.lang.String loseMemo){
		this.loseMemo = loseMemo;
	}
}
