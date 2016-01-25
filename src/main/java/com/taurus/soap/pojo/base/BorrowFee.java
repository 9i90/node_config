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
* @ClassName: BorrowFee 
* @Description: 借款费用 
* @author Terry
* @date 2016年1月11日 下午4:37:23 
*
 */
@MappedSuperclass
public abstract class BorrowFee {
	/**借款id(外键)*/
	private java.lang.Integer borrowId;
	/**费率类型：FW服务费率，CW财务费率，ZHGL账户管理费率，ZX咨询费率，YQ逾期费率，N年费率，XS信审费用（关联dw_dict【APR_ITEM】）*/
	private java.lang.String aprItem;
	/**费率值*/
	private BigDecimal aprItemValue;
	/**借款费用表ID*/
	private java.lang.Integer id;
	/**收费方向（Y：线上收费；N：线下收费）Dw_code_details BORROW_CONFIG_ONLINE_FLAG*/
	private java.lang.String onlineFlag;
	/**投标表ID【针对每个人每次投标对应的记录】*/
	private java.lang.Integer tenderId;
	/**费用所属种类【1：借款费用；2：投资费用，3：放款费用】Dw_code_details BORROW_CONFIG_APR_TYPE*/
	private java.lang.String aprFee;
	/**期数 还款回款期数*/
	private java.lang.Integer period;
	/**用户ID*/
	private java.lang.Integer userId;
	/**是否按【期】（1：是，0：否）*/
	private java.lang.String isPeriod;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  借款id(外键)
	 */
	@Column(name ="BORROW_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getBorrowId(){
		return this.borrowId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  借款id(外键)
	 */
	public void setBorrowId(java.lang.Integer borrowId){
		this.borrowId = borrowId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  费率类型：FW服务费率，CW财务费率，ZHGL账户管理费率，ZX咨询费率，YQ逾期费率，N年费率，XS信审费用（关联dw_dict【APR_ITEM】）
	 */
	@Column(name ="APR_ITEM",nullable=true,length=16)
	public java.lang.String getAprItem(){
		return this.aprItem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  费率类型：FW服务费率，CW财务费率，ZHGL账户管理费率，ZX咨询费率，YQ逾期费率，N年费率，XS信审费用（关联dw_dict【APR_ITEM】）
	 */
	public void setAprItem(java.lang.String aprItem){
		this.aprItem = aprItem;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  费率值
	 */
	@Column(name ="APR_ITEM_VALUE",nullable=true,precision=20,scale=6)
	public BigDecimal getAprItemValue(){
		return this.aprItemValue;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  费率值
	 */
	public void setAprItemValue(BigDecimal aprItemValue){
		this.aprItemValue = aprItemValue;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  借款费用表ID
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
	 *@param: java.lang.Integer  借款费用表ID
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  收费方向（Y：线上收费；N：线下收费）Dw_code_details BORROW_CONFIG_ONLINE_FLAG
	 */
	@Column(name ="ONLINE_FLAG",nullable=true,length=2)
	public java.lang.String getOnlineFlag(){
		return this.onlineFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  收费方向（Y：线上收费；N：线下收费）Dw_code_details BORROW_CONFIG_ONLINE_FLAG
	 */
	public void setOnlineFlag(java.lang.String onlineFlag){
		this.onlineFlag = onlineFlag;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  投标表ID【针对每个人每次投标对应的记录】
	 */
	@Column(name ="TENDER_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getTenderId(){
		return this.tenderId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  投标表ID【针对每个人每次投标对应的记录】
	 */
	public void setTenderId(java.lang.Integer tenderId){
		this.tenderId = tenderId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  费用所属种类【1：借款费用；2：投资费用，3：放款费用】Dw_code_details BORROW_CONFIG_APR_TYPE
	 */
	@Column(name ="APR_FEE",nullable=true,length=1)
	public java.lang.String getAprFee(){
		return this.aprFee;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  费用所属种类【1：借款费用；2：投资费用，3：放款费用】Dw_code_details BORROW_CONFIG_APR_TYPE
	 */
	public void setAprFee(java.lang.String aprFee){
		this.aprFee = aprFee;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  期数 还款回款期数
	 */
	@Column(name ="PERIOD",nullable=true,precision=10,scale=0)
	public java.lang.Integer getPeriod(){
		return this.period;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  期数 还款回款期数
	 */
	public void setPeriod(java.lang.Integer period){
		this.period = period;
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
	 *@return: java.lang.String  是否按【期】（1：是，0：否）
	 */
	@Column(name ="IS_PERIOD",nullable=true,length=1)
	public java.lang.String getIsPeriod(){
		return this.isPeriod;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否按【期】（1：是，0：否）
	 */
	public void setIsPeriod(java.lang.String isPeriod){
		this.isPeriod = isPeriod;
	}
}

