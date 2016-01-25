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
 * @Description: 借款录入
 * @author dennis
 * @date 2016-1-08 15:58:49
 * @version V1.0   
 *
 */ 
@MappedSuperclass
public abstract class Borrow {
	/**项目编号*/
	private java.lang.Integer borrowId;
	/**用户ID*/
	private java.lang.Integer userId;
	/**标题*/
	private java.lang.String name;
	/**状态*/
	private java.lang.String status;
	/**排序*/
	private java.lang.Integer sort;
	/**点击次数*/
	private java.lang.Integer hits;
	/**产品类型*/
	private java.lang.String productType;
	/**发布时间*/
	private java.util.Date publish;
	/**计息方式【1：放款计息；2：投标计息】*/
	private java.lang.String interestType;
	/**自动截标额度【仅限于好友贷使用，截至标的有效时间(valid_time)还未满标，达到此额度自动截标并放款】*/
	private BigDecimal autoCutTap;
	/**标的份额*/
	private java.lang.Integer lot;
	/**每份单价*/
	private BigDecimal price;
	/**还款总额*/
	private BigDecimal repaymentAccount;
	/**满标时间*/
	private java.util.Date successTime;
	/**截至时间*/
	private java.util.Date endTime;
	/**用途*/
	private java.lang.String purpose;
	/**借款期限*/
	private java.lang.String timeLimit;
	/**还款方式*/
	private java.lang.String style;
	/**借贷总金额*/
	private BigDecimal account;
	/**预期募集资金*/
	private BigDecimal accountWant;
	/**当前募集金额*/
	private BigDecimal accountNow;
	/**投资次数*/
	private java.lang.Integer tenderTime;
	/**年利率*/
	private BigDecimal apr;
	/**最低投标金额*/
	private BigDecimal lowestAccount;
	/**最多投标总额*/
	private BigDecimal mostAccount;
	/**投资金额倍数【用于投资人投标时的投资金额】*/
	private BigDecimal multipleAccount;
	/**有效时间*/
	private java.util.Date validTime;
	/**投标奖励*/
	private BigDecimal award;
	/**分摊奖励金额*/
	private BigDecimal partAccount;
	/**比例奖励的比例*/
	private BigDecimal funds;
	/**详细说明*/
	private java.lang.String content;
	/**提交时间*/
	private java.util.Date addtime;
	/**提交IP*/
	private java.lang.String addip;
	/**密码*/
	private java.lang.String pwd;
	/**0:天 1:月*/
	private java.lang.Integer isday;
	/**交易手续费*/
	private BigDecimal transactionfee;
	/**还款保证金*/
	private BigDecimal guaranteefee;
	/**交易管理费*/
	private BigDecimal managefee;
	/**抵押物类型：1=一般物品，2=汽车，3=房产*/
	private java.lang.String borrowType;
	/**项目编号*/
	private java.lang.String borrowCode;
	/**N：删除。Y：正常*/
	private java.lang.String validStatus;
	/**总期数*/
	private java.lang.Integer totalPeriod;
	/**易极付交易编号*/
	private java.lang.String yzzBorrowCode;
	/**是否定向：Y是；N否*/
	private java.lang.String isDirected;
	/**满标审核状态：0：未审核，1：审核通过，2：审核未通过*/
	private java.lang.String verifyStatus;
	/**借款企业名称 放款时生成借款合同所需数据 wy add at 20150115*/
	private java.lang.String borrowBusinessName;
	/**借款企业地址 放款时生成借款合同所需数据 wy add at 20150115*/
	private java.lang.String borrowBusinessAddr;
	/**借款期限开始时间【满标放款后，易极付接口异步返回放款成功的第二天】放款成功时生成借款合同所需数据wy add at 20150115*/
	private java.util.Date starttimeLimit;
	/**借款期限结束时间【根据借款期限开始时间和借款期限计算出结束时间】放款成功时生成借款合同所需数据wy add at 20150115*/
	private java.util.Date endtimeLimit;
	/**流标时间*/
	private java.util.Date loseTime;
	/**流标状态【1、自动流标；2、手动流标】*/
	private java.lang.String loseState;
	/**标的图片地址*/
	private java.lang.String picPath;
	/**模糊处理后的标的图片地址*/
	private java.lang.String mhpicPath;
	/**标的类型【1：标准化；2：T加零；3：好友贷】对应de_code_details标中的【SUBJECT_TYPE】*/
	private java.lang.String subjectType;
	/**标的热度 0：无热度显示；1：热 ；2：荐；*/
	private java.lang.String heat;
	/**所属借款对应的合同类型 目前是两种 01：普通借款三方合同；05：应收账款收益权转让协议*/
	private java.lang.String contractSort;
	/**原始借款企业名称*/
	private java.lang.String originalLoanBusiness;
	/**应收账款金额*/
	private BigDecimal receivableAccount;
	/**购销合同编号*/
	private java.lang.String purchasesSalesContractNo;
	/**销售合同编号*/
	private java.lang.String salesContractNo;
	/**国内保理合同编号1*/
	private java.lang.String factoringContractNo1;
	/**国内保理合同编号2*/
	private java.lang.String factoringContractNo2;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  项目编号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "paymentableGenerator", strategy = "native")
	@Column(name ="BORROW_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getBorrowId(){
		return this.borrowId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  项目编号
	 */
	public void setBorrowId(java.lang.Integer borrowId){
		this.borrowId = borrowId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  用户ID
	 */
	@Column(name ="USER_ID",nullable=true,precision=10,scale=0)
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标题
	 */
	@Column(name ="NAME",nullable=true,length=255)
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标题
	 */
	public void setName(java.lang.String name){
		this.name = name;
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  排序
	 */
	@Column(name ="SORT",nullable=true,precision=10,scale=0)
	public java.lang.Integer getSort(){
		return this.sort;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  排序
	 */
	public void setSort(java.lang.Integer sort){
		this.sort = sort;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  点击次数
	 */
	@Column(name ="HITS",nullable=true,precision=10,scale=0)
	public java.lang.Integer getHits(){
		return this.hits;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  点击次数
	 */
	public void setHits(java.lang.Integer hits){
		this.hits = hits;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  产品类型
	 */
	@Column(name ="PRODUCT_TYPE",nullable=true,length=50)
	public java.lang.String getProductType(){
		return this.productType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  产品类型
	 */
	public void setProductType(java.lang.String productType){
		this.productType = productType;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  发布时间
	 */
	@Column(name ="PUBLISH",nullable=true)
	public java.util.Date getPublish(){
		return this.publish;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  发布时间
	 */
	public void setPublish(java.util.Date publish){
		this.publish = publish;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  计息方式【1：放款计息；2：投标计息】
	 */
	@Column(name ="INTEREST_TYPE",nullable=true,length=2)
	public java.lang.String getInterestType(){
		return this.interestType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  计息方式【1：放款计息；2：投标计息】
	 */
	public void setInterestType(java.lang.String interestType){
		this.interestType = interestType;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  自动截标额度【仅限于好友贷使用，截至标的有效时间(valid_time)还未满标，达到此额度自动截标并放款】
	 */
	@Column(name ="AUTO_CUT_TAP",nullable=true,precision=20,scale=6)
	public BigDecimal getAutoCutTap(){
		return this.autoCutTap;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  自动截标额度【仅限于好友贷使用，截至标的有效时间(valid_time)还未满标，达到此额度自动截标并放款】
	 */
	public void setAutoCutTap(BigDecimal autoCutTap){
		this.autoCutTap = autoCutTap;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  标的份额
	 */
	@Column(name ="LOT",nullable=true,precision=10,scale=0)
	public java.lang.Integer getLot(){
		return this.lot;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  标的份额
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
	 *@return: BigDecimal  还款总额
	 */
	@Column(name ="REPAYMENT_ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getRepaymentAccount(){
		return this.repaymentAccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  还款总额
	 */
	public void setRepaymentAccount(BigDecimal repaymentAccount){
		this.repaymentAccount = repaymentAccount;
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
	 *@return: java.util.Date  截至时间
	 */
	@Column(name ="END_TIME",nullable=true)
	public java.util.Date getEndTime(){
		return this.endTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  截至时间
	 */
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用途
	 */
	@Column(name ="PURPOSE",nullable=true,length=50)
	public java.lang.String getPurpose(){
		return this.purpose;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用途
	 */
	public void setPurpose(java.lang.String purpose){
		this.purpose = purpose;
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
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  借贷总金额
	 */
	@Column(name ="ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getAccount(){
		return this.account;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  借贷总金额
	 */
	public void setAccount(BigDecimal account){
		this.account = account;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  预期募集资金
	 */
	@Column(name ="ACCOUNT_WANT",nullable=true,precision=20,scale=6)
	public BigDecimal getAccountWant(){
		return this.accountWant;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  预期募集资金
	 */
	public void setAccountWant(BigDecimal accountWant){
		this.accountWant = accountWant;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  当前募集金额
	 */
	@Column(name ="ACCOUNT_NOW",nullable=true,precision=20,scale=0)
	public BigDecimal getAccountNow(){
		return this.accountNow;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  当前募集金额
	 */
	public void setAccountNow(BigDecimal accountNow){
		this.accountNow = accountNow;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  投资次数
	 */
	@Column(name ="TENDER_TIME",nullable=true,precision=10,scale=0)
	public java.lang.Integer getTenderTime(){
		return this.tenderTime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  投资次数
	 */
	public void setTenderTime(java.lang.Integer tenderTime){
		this.tenderTime = tenderTime;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  年利率
	 */
	@Column(name ="APR",nullable=true,precision=18,scale=6)
	public BigDecimal getApr(){
		return this.apr;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  年利率
	 */
	public void setApr(BigDecimal apr){
		this.apr = apr;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  最低投标金额
	 */
	@Column(name ="LOWEST_ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getLowestAccount(){
		return this.lowestAccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  最低投标金额
	 */
	public void setLowestAccount(BigDecimal lowestAccount){
		this.lowestAccount = lowestAccount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  最多投标总额
	 */
	@Column(name ="MOST_ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getMostAccount(){
		return this.mostAccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  最多投标总额
	 */
	public void setMostAccount(BigDecimal mostAccount){
		this.mostAccount = mostAccount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  投资金额倍数【用于投资人投标时的投资金额】
	 */
	@Column(name ="MULTIPLE_ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getMultipleAccount(){
		return this.multipleAccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  投资金额倍数【用于投资人投标时的投资金额】
	 */
	public void setMultipleAccount(BigDecimal multipleAccount){
		this.multipleAccount = multipleAccount;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  有效时间
	 */
	@Column(name ="VALID_TIME",nullable=true)
	public java.util.Date getValidTime(){
		return this.validTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  有效时间
	 */
	public void setValidTime(java.util.Date validTime){
		this.validTime = validTime;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  投标奖励
	 */
	@Column(name ="AWARD",nullable=true,precision=20,scale=6)
	public BigDecimal getAward(){
		return this.award;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  投标奖励
	 */
	public void setAward(BigDecimal award){
		this.award = award;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  分摊奖励金额
	 */
	@Column(name ="PART_ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getPartAccount(){
		return this.partAccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  分摊奖励金额
	 */
	public void setPartAccount(BigDecimal partAccount){
		this.partAccount = partAccount;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  比例奖励的比例
	 */
	@Column(name ="FUNDS",nullable=true,precision=20,scale=6)
	public BigDecimal getFunds(){
		return this.funds;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  比例奖励的比例
	 */
	public void setFunds(BigDecimal funds){
		this.funds = funds;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  详细说明
	 */
	@Column(name ="CONTENT",nullable=true,length=65535)
	public java.lang.String getContent(){
		return this.content;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  详细说明
	 */
	public void setContent(java.lang.String content){
		this.content = content;
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
	 *@return: java.lang.String  密码
	 */
	@Column(name ="PWD",nullable=true,length=50)
	public java.lang.String getPwd(){
		return this.pwd;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  密码
	 */
	public void setPwd(java.lang.String pwd){
		this.pwd = pwd;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  0:天 1:月
	 */
	@Column(name ="ISDAY",nullable=true,precision=10,scale=0)
	public java.lang.Integer getIsday(){
		return this.isday;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  0:天 1:月
	 */
	public void setIsday(java.lang.Integer isday){
		this.isday = isday;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  交易手续费
	 */
	@Column(name ="TRANSACTIONFEE",nullable=true,precision=20,scale=6)
	public BigDecimal getTransactionfee(){
		return this.transactionfee;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  交易手续费
	 */
	public void setTransactionfee(BigDecimal transactionfee){
		this.transactionfee = transactionfee;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  还款保证金
	 */
	@Column(name ="GUARANTEEFEE",nullable=true,precision=20,scale=6)
	public BigDecimal getGuaranteefee(){
		return this.guaranteefee;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  还款保证金
	 */
	public void setGuaranteefee(BigDecimal guaranteefee){
		this.guaranteefee = guaranteefee;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  交易管理费
	 */
	@Column(name ="MANAGEFEE",nullable=true,precision=20,scale=6)
	public BigDecimal getManagefee(){
		return this.managefee;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  交易管理费
	 */
	public void setManagefee(BigDecimal managefee){
		this.managefee = managefee;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  抵押物类型：1=一般物品，2=汽车，3=房产
	 */
	@Column(name ="BORROW_TYPE",nullable=true,length=32)
	public java.lang.String getBorrowType(){
		return this.borrowType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  抵押物类型：1=一般物品，2=汽车，3=房产
	 */
	public void setBorrowType(java.lang.String borrowType){
		this.borrowType = borrowType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  项目编号
	 */
	@Column(name ="BORROW_CODE",nullable=true,length=255)
	public java.lang.String getBorrowCode(){
		return this.borrowCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  项目编号
	 */
	public void setBorrowCode(java.lang.String borrowCode){
		this.borrowCode = borrowCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  N：删除。Y：正常
	 */
	@Column(name ="VALID_STATUS",nullable=true,length=2)
	public java.lang.String getValidStatus(){
		return this.validStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  N：删除。Y：正常
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
	 *@return: java.lang.String  易极付交易编号
	 */
	@Column(name ="YZZ_BORROW_CODE",nullable=true,length=25)
	public java.lang.String getYzzBorrowCode(){
		return this.yzzBorrowCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  易极付交易编号
	 */
	public void setYzzBorrowCode(java.lang.String yzzBorrowCode){
		this.yzzBorrowCode = yzzBorrowCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否定向：Y是；N否
	 */
	@Column(name ="IS_DIRECTED",nullable=true,length=2)
	public java.lang.String getIsDirected(){
		return this.isDirected;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否定向：Y是；N否
	 */
	public void setIsDirected(java.lang.String isDirected){
		this.isDirected = isDirected;
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
	 *@return: java.lang.String  借款企业名称 放款时生成借款合同所需数据 wy add at 20150115
	 */
	@Column(name ="BORROW_BUSINESS_NAME",nullable=true,length=255)
	public java.lang.String getBorrowBusinessName(){
		return this.borrowBusinessName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款企业名称 放款时生成借款合同所需数据 wy add at 20150115
	 */
	public void setBorrowBusinessName(java.lang.String borrowBusinessName){
		this.borrowBusinessName = borrowBusinessName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借款企业地址 放款时生成借款合同所需数据 wy add at 20150115
	 */
	@Column(name ="BORROW_BUSINESS_ADDR",nullable=true,length=500)
	public java.lang.String getBorrowBusinessAddr(){
		return this.borrowBusinessAddr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款企业地址 放款时生成借款合同所需数据 wy add at 20150115
	 */
	public void setBorrowBusinessAddr(java.lang.String borrowBusinessAddr){
		this.borrowBusinessAddr = borrowBusinessAddr;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  借款期限开始时间【满标放款后，易极付接口异步返回放款成功的第二天】放款成功时生成借款合同所需数据wy add at 20150115
	 */
	@Column(name ="STARTTIME_LIMIT",nullable=true)
	public java.util.Date getStarttimeLimit(){
		return this.starttimeLimit;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  借款期限开始时间【满标放款后，易极付接口异步返回放款成功的第二天】放款成功时生成借款合同所需数据wy add at 20150115
	 */
	public void setStarttimeLimit(java.util.Date starttimeLimit){
		this.starttimeLimit = starttimeLimit;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  借款期限结束时间【根据借款期限开始时间和借款期限计算出结束时间】放款成功时生成借款合同所需数据wy add at 20150115
	 */
	@Column(name ="ENDTIME_LIMIT",nullable=true)
	public java.util.Date getEndtimeLimit(){
		return this.endtimeLimit;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  借款期限结束时间【根据借款期限开始时间和借款期限计算出结束时间】放款成功时生成借款合同所需数据wy add at 20150115
	 */
	public void setEndtimeLimit(java.util.Date endtimeLimit){
		this.endtimeLimit = endtimeLimit;
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
	 *@return: java.lang.String  流标状态【1、自动流标；2、手动流标】
	 */
	@Column(name ="LOSE_STATE",nullable=true,length=1)
	public java.lang.String getLoseState(){
		return this.loseState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流标状态【1、自动流标；2、手动流标】
	 */
	public void setLoseState(java.lang.String loseState){
		this.loseState = loseState;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标的图片地址
	 */
	@Column(name ="PIC_PATH",nullable=true,length=256)
	public java.lang.String getPicPath(){
		return this.picPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标的图片地址
	 */
	public void setPicPath(java.lang.String picPath){
		this.picPath = picPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  模糊处理后的标的图片地址
	 */
	@Column(name ="MHPIC_PATH",nullable=true,length=256)
	public java.lang.String getMhpicPath(){
		return this.mhpicPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  模糊处理后的标的图片地址
	 */
	public void setMhpicPath(java.lang.String mhpicPath){
		this.mhpicPath = mhpicPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标的类型【1：标准化；2：T加零；3：好友贷】对应de_code_details标中的【SUBJECT_TYPE】
	 */
	@Column(name ="SUBJECT_TYPE",nullable=true,length=2)
	public java.lang.String getSubjectType(){
		return this.subjectType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标的类型【1：标准化；2：T加零；3：好友贷】对应de_code_details标中的【SUBJECT_TYPE】
	 */
	public void setSubjectType(java.lang.String subjectType){
		this.subjectType = subjectType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标的热度 0：无热度显示；1：热 ；2：荐；
	 */
	@Column(name ="HEAT",nullable=true,length=2)
	public java.lang.String getHeat(){
		return this.heat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标的热度 0：无热度显示；1：热 ；2：荐；
	 */
	public void setHeat(java.lang.String heat){
		this.heat = heat;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属借款对应的合同类型 目前是两种 01：普通借款三方合同；05：应收账款收益权转让协议
	 */
	@Column(name ="CONTRACT_SORT",nullable=false,length=10)
	public java.lang.String getContractSort(){
		return this.contractSort;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属借款对应的合同类型 目前是两种 01：普通借款三方合同；05：应收账款收益权转让协议
	 */
	public void setContractSort(java.lang.String contractSort){
		this.contractSort = contractSort;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  原始借款企业名称
	 */
	@Column(name ="ORIGINAL_LOAN_BUSINESS",nullable=true,length=255)
	public java.lang.String getOriginalLoanBusiness(){
		return this.originalLoanBusiness;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  原始借款企业名称
	 */
	public void setOriginalLoanBusiness(java.lang.String originalLoanBusiness){
		this.originalLoanBusiness = originalLoanBusiness;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  应收账款金额
	 */
	@Column(name ="RECEIVABLE_ACCOUNT",nullable=true,precision=20,scale=6)
	public BigDecimal getReceivableAccount(){
		return this.receivableAccount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  应收账款金额
	 */
	public void setReceivableAccount(BigDecimal receivableAccount){
		this.receivableAccount = receivableAccount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  购销合同编号
	 */
	@Column(name ="PURCHASES_SALES_CONTRACT_NO",nullable=true,length=255)
	public java.lang.String getPurchasesSalesContractNo(){
		return this.purchasesSalesContractNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  购销合同编号
	 */
	public void setPurchasesSalesContractNo(java.lang.String purchasesSalesContractNo){
		this.purchasesSalesContractNo = purchasesSalesContractNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  销售合同编号
	 */
	@Column(name ="SALES_CONTRACT_NO",nullable=true,length=255)
	public java.lang.String getSalesContractNo(){
		return this.salesContractNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  销售合同编号
	 */
	public void setSalesContractNo(java.lang.String salesContractNo){
		this.salesContractNo = salesContractNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  国内保理合同编号1
	 */
	@Column(name ="FACTORING_CONTRACT_NO1",nullable=true,length=255)
	public java.lang.String getFactoringContractNo1(){
		return this.factoringContractNo1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  国内保理合同编号1
	 */
	public void setFactoringContractNo1(java.lang.String factoringContractNo1){
		this.factoringContractNo1 = factoringContractNo1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  国内保理合同编号2
	 */
	@Column(name ="FACTORING_CONTRACT_NO2",nullable=true,length=255)
	public java.lang.String getFactoringContractNo2(){
		return this.factoringContractNo2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  国内保理合同编号2
	 */
	public void setFactoringContractNo2(java.lang.String factoringContractNo2){
		this.factoringContractNo2 = factoringContractNo2;
	}
}
