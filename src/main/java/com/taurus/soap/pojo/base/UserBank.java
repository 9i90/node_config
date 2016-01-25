package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: Entity
 * @Description: 用户绑卡信息
 * @author zhangdaihao
 * @date 2016-01-12 10:49:32
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserBank {

	/**id*/
	private java.lang.Integer id;
	/**账号*/
	private java.lang.String account;
	/**银行缩写（大写字母）*/
	private java.lang.String bankcode;
	/**支行*/
	private java.lang.String branch;
	/**省份*/
	private java.lang.Integer province;
	/**城市*/
	private java.lang.Integer city;
	/**区*/
	private java.lang.Integer area;
	/**addtime*/
	private java.lang.String addtime;
	/**addip*/
	private java.lang.String addip;
	/**status*/
	private java.lang.String status;
	/**validStatus*/
	private java.lang.String validStatus;
	/**是否为默认银行卡：1，是；0否*/
	private java.lang.String defaultStatus;
	/**托管平台的绑卡id*/
	private java.lang.String ideskyBankId;
	/**银行卡账户类型（1:个人银行卡账户；2：公司对公银行卡账户:）*/
	private java.lang.String accountType;
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
	 *@return: java.lang.String  账号
	 */
	@Column(name ="ACCOUNT",nullable=true,length=100)
	public java.lang.String getAccount(){
		return this.account;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  账号
	 */
	public void setAccount(java.lang.String account){
		this.account = account;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行缩写（大写字母）
	 */
	@Column(name ="BANKCODE",nullable=true,length=50)
	public java.lang.String getBankcode(){
		return this.bankcode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行缩写（大写字母）
	 */
	public void setBankcode(java.lang.String bankcode){
		this.bankcode = bankcode;
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  省份
	 */
	@Column(name ="PROVINCE",nullable=true,precision=10,scale=0)
	public java.lang.Integer getProvince(){
		return this.province;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  省份
	 */
	public void setProvince(java.lang.Integer province){
		this.province = province;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  城市
	 */
	@Column(name ="CITY",nullable=true,precision=10,scale=0)
	public java.lang.Integer getCity(){
		return this.city;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  城市
	 */
	public void setCity(java.lang.Integer city){
		this.city = city;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  区
	 */
	@Column(name ="AREA",nullable=true,precision=10,scale=0)
	public java.lang.Integer getArea(){
		return this.area;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  区
	 */
	public void setArea(java.lang.Integer area){
		this.area = area;
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  status
	 */
	@Column(name ="STATUS",nullable=true,length=2)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  status
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  validStatus
	 */
	@Column(name ="VALID_STATUS",nullable=true,length=2)
	public java.lang.String getValidStatus(){
		return this.validStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  validStatus
	 */
	public void setValidStatus(java.lang.String validStatus){
		this.validStatus = validStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否为默认银行卡：1，是；0否
	 */
	@Column(name ="DEFAULT_STATUS",nullable=true,length=1)
	public java.lang.String getDefaultStatus(){
		return this.defaultStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否为默认银行卡：1，是；0否
	 */
	public void setDefaultStatus(java.lang.String defaultStatus){
		this.defaultStatus = defaultStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  托管平台的绑卡id
	 */
	@Column(name ="IDESKY_BANK_ID",nullable=true,length=20)
	public java.lang.String getIdeskyBankId(){
		return this.ideskyBankId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  托管平台的绑卡id
	 */
	public void setIdeskyBankId(java.lang.String ideskyBankId){
		this.ideskyBankId = ideskyBankId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行卡账户类型（1:个人银行卡账户；2：公司对公银行卡账户:）
	 */
	@Column(name ="ACCOUNT_TYPE",nullable=true,length=2)
	public java.lang.String getAccountType(){
		return this.accountType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行卡账户类型（1:个人银行卡账户；2：公司对公银行卡账户:）
	 */
	public void setAccountType(java.lang.String accountType){
		this.accountType = accountType;
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
