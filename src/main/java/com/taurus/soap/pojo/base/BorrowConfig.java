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
* @ClassName: BorrowConfig 
* @Description: 借款配置 
* @author Terry
* @date 2016年1月11日 下午4:33:27 
*
 */
@MappedSuperclass
public abstract class BorrowConfig {
	/**借款配置ID*/
	private java.lang.Integer id;
	/**费率种类：1借款费率，2投资费率（对应dw_code_details）*/
	private java.lang.String aprFee;
	/**借款类型 dw_dict  BORROW_TYPE 【CJ:车借通;FJ:房借通;DC:地产通】*/
	private java.lang.String borrowType;
	/**产品类型  dw_dict   PRODUCT_TYPE 【C:财神到;Z:招财宝;F:发财树】*/
	private java.lang.String productType;
	/**费率类型：FW服务费率，CW财务费率，ZHGL账户管理费率，ZX咨询费率，YQ逾期费率，N年利率，XS信审费用，LXGL利息管理费（关联dw_dict【APR_ITEM】）*/
	private java.lang.String aprItem;
	/**信审费用计算规：2按金额算:，1按比例算(关联dw_code_details【BORROW_CONFIG_RULE】)*/
	private java.lang.Integer rule;
	/**费率值*/
	private BigDecimal aprItemValue;
	/**备注*/
	private java.lang.String remark;
	/**状态:：Y有效，N无效（关联dw_code_details【SYS_VALID_STATUS】）*/
	private java.lang.String validStatus;
	/**是否按期：Y是，N否（关联dw_code_details【BORROW_CONFIG_IS_PERIOD】）*/
	private java.lang.String isPeriod;
	/**收费方向（Y：线上收费；N：线下收费）Dw_code_details BORROW_CONFIG_ONLINE_FLAG*/
	private java.lang.String onlineFlag;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  借款配置ID
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
	 *@param: java.lang.Integer  借款配置ID
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  费率种类：1借款费率，2投资费率（对应dw_code_details）
	 */
	@Column(name ="APR_FEE",nullable=true,length=1)
	public java.lang.String getAprFee(){
		return this.aprFee;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  费率种类：1借款费率，2投资费率（对应dw_code_details）
	 */
	public void setAprFee(java.lang.String aprFee){
		this.aprFee = aprFee;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借款类型 dw_dict  BORROW_TYPE 【CJ:车借通;FJ:房借通;DC:地产通】
	 */
	@Column(name ="BORROW_TYPE",nullable=true,length=16)
	public java.lang.String getBorrowType(){
		return this.borrowType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借款类型 dw_dict  BORROW_TYPE 【CJ:车借通;FJ:房借通;DC:地产通】
	 */
	public void setBorrowType(java.lang.String borrowType){
		this.borrowType = borrowType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  产品类型  dw_dict   PRODUCT_TYPE 【C:财神到;Z:招财宝;F:发财树】
	 */
	@Column(name ="PRODUCT_TYPE",nullable=true,length=16)
	public java.lang.String getProductType(){
		return this.productType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  产品类型  dw_dict   PRODUCT_TYPE 【C:财神到;Z:招财宝;F:发财树】
	 */
	public void setProductType(java.lang.String productType){
		this.productType = productType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  费率类型：FW服务费率，CW财务费率，ZHGL账户管理费率，ZX咨询费率，YQ逾期费率，N年利率，XS信审费用，LXGL利息管理费（关联dw_dict【APR_ITEM】）
	 */
	@Column(name ="APR_ITEM",nullable=true,length=16)
	public java.lang.String getAprItem(){
		return this.aprItem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  费率类型：FW服务费率，CW财务费率，ZHGL账户管理费率，ZX咨询费率，YQ逾期费率，N年利率，XS信审费用，LXGL利息管理费（关联dw_dict【APR_ITEM】）
	 */
	public void setAprItem(java.lang.String aprItem){
		this.aprItem = aprItem;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  信审费用计算规：2按金额算:，1按比例算(关联dw_code_details【BORROW_CONFIG_RULE】)
	 */
	@Column(name ="RULE",nullable=true,precision=10,scale=0)
	public java.lang.Integer getRule(){
		return this.rule;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  信审费用计算规：2按金额算:，1按比例算(关联dw_code_details【BORROW_CONFIG_RULE】)
	 */
	public void setRule(java.lang.Integer rule){
		this.rule = rule;
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	@Column(name ="REMARK",nullable=true,length=300)
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态:：Y有效，N无效（关联dw_code_details【SYS_VALID_STATUS】）
	 */
	@Column(name ="VALID_STATUS",nullable=true,length=2)
	public java.lang.String getValidStatus(){
		return this.validStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态:：Y有效，N无效（关联dw_code_details【SYS_VALID_STATUS】）
	 */
	public void setValidStatus(java.lang.String validStatus){
		this.validStatus = validStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否按期：Y是，N否（关联dw_code_details【BORROW_CONFIG_IS_PERIOD】）
	 */
	@Column(name ="IS_PERIOD",nullable=true,length=1)
	public java.lang.String getIsPeriod(){
		return this.isPeriod;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否按期：Y是，N否（关联dw_code_details【BORROW_CONFIG_IS_PERIOD】）
	 */
	public void setIsPeriod(java.lang.String isPeriod){
		this.isPeriod = isPeriod;
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
}

