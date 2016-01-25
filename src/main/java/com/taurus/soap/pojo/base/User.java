package com.taurus.soap.pojo.base;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 用户相关
 * @author Frank
 * @date 2016-01-11 15:20:10
 * @version V1.0   
 *
 */

@MappedSuperclass
public abstract class User{
	/**userId*/
	private java.lang.Integer userId;
	/**用户类型【P：个人；B：企业；C：平台；】*/
	private java.lang.String typeId;
	/**username*/
	private java.lang.String username;
	/**password*/
	private java.lang.String password;
	/**paypassword*/
	private java.lang.String paypassword;
	/**邀请好友*/
	private java.lang.Integer inviteUserid;
	/**邀请注册提成*/
	private BigDecimal inviteMoney;
	/**inviteNo*/
	private java.lang.String inviteNo;
	/**realStatus*/
	private java.lang.String realStatus;
	/**cardType*/
	private java.lang.String cardType;
	/**cardId*/
	private java.lang.String cardId;
	/**realname*/
	private java.lang.String realname;
	/**integral*/
	private java.lang.String integral;
	/**status*/
	private java.lang.String status;
	/**emailStatus*/
	private java.lang.String emailStatus;
	/**phoneStatus*/
	private java.lang.String phoneStatus;
	/**email*/
	private java.lang.String email;
	/**sex*/
	private java.lang.String sex;
	/**phone*/
	private java.lang.String phone;
	/**addtime*/
	private java.util.Date addtime;
	/**addip*/
	private java.lang.String addip;
	/**lasttime*/
	private java.util.Date lasttime;
	/**lastip*/
	private java.lang.String lastip;
	/**yzzid*/
	private java.lang.String yzzid;
	/**memberlevel*/
	private java.lang.Integer memberlevel;
	/**yzzaddtime*/
	private java.util.Date yzzaddtime;
	/**yzzstatus*/
	private java.lang.String yzzstatus;
	/**validityTime*/
	private java.lang.String validityTime;
	/**certifyPassDate*/
	private java.lang.String certifyPassDate;
	/**certFrontPath*/
	private java.lang.String certFrontPath;
	/**certBackPath*/
	private java.lang.String certBackPath;
	/**message*/
	private java.lang.String message;
	/**attribution*/
	private java.lang.String attribution;
	/**comName*/
	private java.lang.String comName;
	/**licenceNo*/
	private java.lang.String licenceNo;
	/**licence*/
	private java.lang.String licence;
	/**legalPersonName*/
	private java.lang.String legalPersonName;
	/**legalPersonCertNo*/
	private java.lang.String legalPersonCertNo;
	/**legalPersonCertFrontPath*/
	private java.lang.String legalPersonCertFrontPath;
	/**legalPersonCertBackPath*/
	private java.lang.String legalPersonCertBackPath;
	/**taxAuthorityNo*/
	private java.lang.String taxAuthorityNo;
	/**organizationCode*/
	private java.lang.String organizationCode;
	/**comCycle*/
	private java.lang.String comCycle;
	/**address*/
	private java.lang.String address;
	/**provName*/
	private java.lang.String provName;
	/**cityName*/
	private java.lang.String cityName;
	/**还款签约状态*/
	private java.lang.String repaymentStatus;
	/**快捷代扣签约*/
	private java.lang.String withholdStatus;
	/**投标签约状态*/
	private java.lang.String tenderStatus;
	/**支付密码有效状态（默认0，有效1）*/
	private java.lang.String payPwdStatus;
	/**用户头像路径*/
	private java.lang.String portraitPath;
	/**企业名称*/
	private java.lang.String companyName;
	/**营业执照认证状态，1：已认证  0：未认证*/
	private java.lang.String businessLicenseStatus;
	/**营业执照号*/
	private java.lang.String businessLicense;
	/**组织机构代码认证状态，1：已认证 0：未认证*/
	private java.lang.String organizationCodeStatus;
	/**用户第一次状态【0：否；1：是；第一位：首次充值；第二位：首次投资普通标的；第三位：首次投资天标；第四位：首次绑卡】【如：是否投资、是否充值、是否实名认证】*/
	private java.lang.String firstState;
	/**投标来源【1：PC端注册；2：后台录入企业用户；3：微信注册；4：喜乐航导入】*/
	private java.lang.String source;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  userId
	 */
//		@Column(name ="USER_ID",nullable=false,precision=10,scale=0)
//		public java.lang.Integer getUserId(){
//			return this.userId;
//		}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@GenericGenerator(name = "paymentableGenerator", strategy = "native") 
	@Column(name ="USER_ID",nullable=false,precision=10,scale=0)
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
	 *@return: java.lang.String  用户类型【P：个人；B：企业；C：平台；】
	 */
	@Column(name ="TYPE_ID",nullable=true,length=2)
	public java.lang.String getTypeId(){
		return this.typeId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户类型【P：个人；B：企业；C：平台；】
	 */
	public void setTypeId(java.lang.String typeId){
		this.typeId = typeId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  username
	 */
	@Column(name ="USERNAME",nullable=true,length=30)
	public java.lang.String getUsername(){
		return this.username;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  username
	 */
	public void setUsername(java.lang.String username){
		this.username = username;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  password
	 */
	@Column(name ="PASSWORD",nullable=true,length=50)
	public java.lang.String getPassword(){
		return this.password;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  password
	 */
	public void setPassword(java.lang.String password){
		this.password = password;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  paypassword
	 */
	@Column(name ="PAYPASSWORD",nullable=true,length=50)
	public java.lang.String getPaypassword(){
		return this.paypassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  paypassword
	 */
	public void setPaypassword(java.lang.String paypassword){
		this.paypassword = paypassword;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  邀请好友
	 */
	@Column(name ="INVITE_USERID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getInviteUserid(){
		return this.inviteUserid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  邀请好友
	 */
	public void setInviteUserid(java.lang.Integer inviteUserid){
		this.inviteUserid = inviteUserid;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  邀请注册提成
	 */
	@Column(name ="INVITE_MONEY",nullable=true,precision=20,scale=6)
	public BigDecimal getInviteMoney(){
		return this.inviteMoney;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  邀请注册提成
	 */
	public void setInviteMoney(BigDecimal inviteMoney){
		this.inviteMoney = inviteMoney;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  inviteNo
	 */
	@Column(name ="INVITE_NO",nullable=true,length=32)
	public java.lang.String getInviteNo(){
		return this.inviteNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  inviteNo
	 */
	public void setInviteNo(java.lang.String inviteNo){
		this.inviteNo = inviteNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  realStatus
	 */
	@Column(name ="REAL_STATUS",nullable=true,length=2)
	public java.lang.String getRealStatus(){
		return this.realStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  realStatus
	 */
	public void setRealStatus(java.lang.String realStatus){
		this.realStatus = realStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  cardType
	 */
	@Column(name ="CARD_TYPE",nullable=true,length=10)
	public java.lang.String getCardType(){
		return this.cardType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  cardType
	 */
	public void setCardType(java.lang.String cardType){
		this.cardType = cardType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  cardId
	 */
	@Column(name ="CARD_ID",nullable=true,length=50)
	public java.lang.String getCardId(){
		return this.cardId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  cardId
	 */
	public void setCardId(java.lang.String cardId){
		this.cardId = cardId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  realname
	 */
	@Column(name ="REALNAME",nullable=true,length=20)
	public java.lang.String getRealname(){
		return this.realname;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  realname
	 */
	public void setRealname(java.lang.String realname){
		this.realname = realname;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  integral
	 */
	@Column(name ="INTEGRAL",nullable=true,length=10)
	public java.lang.String getIntegral(){
		return this.integral;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  integral
	 */
	public void setIntegral(java.lang.String integral){
		this.integral = integral;
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
	 *@return: java.lang.String  emailStatus
	 */
	@Column(name ="EMAIL_STATUS",nullable=true,length=50)
	public java.lang.String getEmailStatus(){
		return this.emailStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  emailStatus
	 */
	public void setEmailStatus(java.lang.String emailStatus){
		this.emailStatus = emailStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  phoneStatus
	 */
	@Column(name ="PHONE_STATUS",nullable=true,length=50)
	public java.lang.String getPhoneStatus(){
		return this.phoneStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  phoneStatus
	 */
	public void setPhoneStatus(java.lang.String phoneStatus){
		this.phoneStatus = phoneStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  email
	 */
	@Column(name ="EMAIL",nullable=true,length=30)
	public java.lang.String getEmail(){
		return this.email;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  email
	 */
	public void setEmail(java.lang.String email){
		this.email = email;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  sex
	 */
	@Column(name ="SEX",nullable=true,length=10)
	public java.lang.String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  sex
	 */
	public void setSex(java.lang.String sex){
		this.sex = sex;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  phone
	 */
	@Column(name ="PHONE",nullable=true,length=50)
	public java.lang.String getPhone(){
		return this.phone;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  phone
	 */
	public void setPhone(java.lang.String phone){
		this.phone = phone;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  addtime
	 */
	@Column(name ="ADDTIME",nullable=true)
	public java.util.Date getAddtime(){
		return this.addtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  addtime
	 */
	public void setAddtime(java.util.Date addtime){
		this.addtime = addtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  addip
	 */
	@Column(name ="ADDIP",nullable=true,length=50)
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  lasttime
	 */
	@Column(name ="LASTTIME",nullable=true)
	public java.util.Date getLasttime(){
		return this.lasttime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  lasttime
	 */
	public void setLasttime(java.util.Date lasttime){
		this.lasttime = lasttime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  lastip
	 */
	@Column(name ="LASTIP",nullable=true,length=20)
	public java.lang.String getLastip(){
		return this.lastip;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  lastip
	 */
	public void setLastip(java.lang.String lastip){
		this.lastip = lastip;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  yzzid
	 */
	@Column(name ="YZZID",nullable=true,length=64)
	public java.lang.String getYzzid(){
		return this.yzzid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  yzzid
	 */
	public void setYzzid(java.lang.String yzzid){
		this.yzzid = yzzid;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  memberlevel
	 */
	@Column(name ="MEMBERLEVEL",nullable=true,precision=10,scale=0)
	public java.lang.Integer getMemberlevel(){
		return this.memberlevel;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  memberlevel
	 */
	public void setMemberlevel(java.lang.Integer memberlevel){
		this.memberlevel = memberlevel;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  yzzaddtime
	 */
	@Column(name ="YZZADDTIME",nullable=true)
	public java.util.Date getYzzaddtime(){
		return this.yzzaddtime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  yzzaddtime
	 */
	public void setYzzaddtime(java.util.Date yzzaddtime){
		this.yzzaddtime = yzzaddtime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  yzzstatus
	 */
	@Column(name ="YZZSTATUS",nullable=true,length=2)
	public java.lang.String getYzzstatus(){
		return this.yzzstatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  yzzstatus
	 */
	public void setYzzstatus(java.lang.String yzzstatus){
		this.yzzstatus = yzzstatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  validityTime
	 */
	@Column(name ="VALIDITY_TIME",nullable=true,length=20)
	public java.lang.String getValidityTime(){
		return this.validityTime;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  validityTime
	 */
	public void setValidityTime(java.lang.String validityTime){
		this.validityTime = validityTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  certifyPassDate
	 */
	@Column(name ="CERTIFY_PASS_DATE",nullable=true,length=20)
	public java.lang.String getCertifyPassDate(){
		return this.certifyPassDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  certifyPassDate
	 */
	public void setCertifyPassDate(java.lang.String certifyPassDate){
		this.certifyPassDate = certifyPassDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  certFrontPath
	 */
	@Column(name ="CERT_FRONT_PATH",nullable=true,length=256)
	public java.lang.String getCertFrontPath(){
		return this.certFrontPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  certFrontPath
	 */
	public void setCertFrontPath(java.lang.String certFrontPath){
		this.certFrontPath = certFrontPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  certBackPath
	 */
	@Column(name ="CERT_BACK_PATH",nullable=true,length=256)
	public java.lang.String getCertBackPath(){
		return this.certBackPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  certBackPath
	 */
	public void setCertBackPath(java.lang.String certBackPath){
		this.certBackPath = certBackPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  message
	 */
	@Column(name ="MESSAGE",nullable=true,length=32)
	public java.lang.String getMessage(){
		return this.message;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  message
	 */
	public void setMessage(java.lang.String message){
		this.message = message;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  attribution
	 */
	@Column(name ="ATTRIBUTION",nullable=true,length=16)
	public java.lang.String getAttribution(){
		return this.attribution;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  attribution
	 */
	public void setAttribution(java.lang.String attribution){
		this.attribution = attribution;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  comName
	 */
	@Column(name ="COM_NAME",nullable=true,length=64)
	public java.lang.String getComName(){
		return this.comName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  comName
	 */
	public void setComName(java.lang.String comName){
		this.comName = comName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  licenceNo
	 */
	@Column(name ="LICENCE_NO",nullable=true,length=32)
	public java.lang.String getLicenceNo(){
		return this.licenceNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  licenceNo
	 */
	public void setLicenceNo(java.lang.String licenceNo){
		this.licenceNo = licenceNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  licence
	 */
	@Column(name ="LICENCE",nullable=true,length=256)
	public java.lang.String getLicence(){
		return this.licence;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  licence
	 */
	public void setLicence(java.lang.String licence){
		this.licence = licence;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  legalPersonName
	 */
	@Column(name ="LEGAL_PERSON_NAME",nullable=true,length=16)
	public java.lang.String getLegalPersonName(){
		return this.legalPersonName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  legalPersonName
	 */
	public void setLegalPersonName(java.lang.String legalPersonName){
		this.legalPersonName = legalPersonName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  legalPersonCertNo
	 */
	@Column(name ="LEGAL_PERSON_CERT_NO",nullable=true,length=32)
	public java.lang.String getLegalPersonCertNo(){
		return this.legalPersonCertNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  legalPersonCertNo
	 */
	public void setLegalPersonCertNo(java.lang.String legalPersonCertNo){
		this.legalPersonCertNo = legalPersonCertNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  legalPersonCertFrontPath
	 */
	@Column(name ="LEGAL_PERSON_CERT_FRONT_PATH",nullable=true,length=256)
	public java.lang.String getLegalPersonCertFrontPath(){
		return this.legalPersonCertFrontPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  legalPersonCertFrontPath
	 */
	public void setLegalPersonCertFrontPath(java.lang.String legalPersonCertFrontPath){
		this.legalPersonCertFrontPath = legalPersonCertFrontPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  legalPersonCertBackPath
	 */
	@Column(name ="LEGAL_PERSON_CERT_BACK_PATH",nullable=true,length=256)
	public java.lang.String getLegalPersonCertBackPath(){
		return this.legalPersonCertBackPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  legalPersonCertBackPath
	 */
	public void setLegalPersonCertBackPath(java.lang.String legalPersonCertBackPath){
		this.legalPersonCertBackPath = legalPersonCertBackPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  taxAuthorityNo
	 */
	@Column(name ="TAX_AUTHORITY_NO",nullable=true,length=32)
	public java.lang.String getTaxAuthorityNo(){
		return this.taxAuthorityNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  taxAuthorityNo
	 */
	public void setTaxAuthorityNo(java.lang.String taxAuthorityNo){
		this.taxAuthorityNo = taxAuthorityNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  organizationCode
	 */
	@Column(name ="ORGANIZATION_CODE",nullable=true,length=32)
	public java.lang.String getOrganizationCode(){
		return this.organizationCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  organizationCode
	 */
	public void setOrganizationCode(java.lang.String organizationCode){
		this.organizationCode = organizationCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  comCycle
	 */
	@Column(name ="COM_CYCLE",nullable=true,length=10)
	public java.lang.String getComCycle(){
		return this.comCycle;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  comCycle
	 */
	public void setComCycle(java.lang.String comCycle){
		this.comCycle = comCycle;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  address
	 */
	@Column(name ="ADDRESS",nullable=true,length=256)
	public java.lang.String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  address
	 */
	public void setAddress(java.lang.String address){
		this.address = address;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  provName
	 */
	@Column(name ="PROV_NAME",nullable=true,length=16)
	public java.lang.String getProvName(){
		return this.provName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  provName
	 */
	public void setProvName(java.lang.String provName){
		this.provName = provName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  cityName
	 */
	@Column(name ="CITY_NAME",nullable=true,length=16)
	public java.lang.String getCityName(){
		return this.cityName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  cityName
	 */
	public void setCityName(java.lang.String cityName){
		this.cityName = cityName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  还款签约状态
	 */
	@Column(name ="REPAYMENT_STATUS",nullable=true,length=2)
	public java.lang.String getRepaymentStatus(){
		return this.repaymentStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  还款签约状态
	 */
	public void setRepaymentStatus(java.lang.String repaymentStatus){
		this.repaymentStatus = repaymentStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  快捷代扣签约
	 */
	@Column(name ="WITHHOLD_STATUS",nullable=true,length=2)
	public java.lang.String getWithholdStatus(){
		return this.withholdStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  快捷代扣签约
	 */
	public void setWithholdStatus(java.lang.String withholdStatus){
		this.withholdStatus = withholdStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  投标签约状态
	 */
	@Column(name ="TENDER_STATUS",nullable=true,length=2)
	public java.lang.String getTenderStatus(){
		return this.tenderStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  投标签约状态
	 */
	public void setTenderStatus(java.lang.String tenderStatus){
		this.tenderStatus = tenderStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  支付密码有效状态（默认0，有效1）
	 */
	@Column(name ="PAY_PWD_STATUS",nullable=true,length=2)
	public java.lang.String getPayPwdStatus(){
		return this.payPwdStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  支付密码有效状态（默认0，有效1）
	 */
	public void setPayPwdStatus(java.lang.String payPwdStatus){
		this.payPwdStatus = payPwdStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用户头像路径
	 */
	@Column(name ="PORTRAIT_PATH",nullable=true,length=255)
	public java.lang.String getPortraitPath(){
		return this.portraitPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户头像路径
	 */
	public void setPortraitPath(java.lang.String portraitPath){
		this.portraitPath = portraitPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  企业名称
	 */
	@Column(name ="COMPANY_NAME",nullable=true,length=255)
	public java.lang.String getCompanyName(){
		return this.companyName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  企业名称
	 */
	public void setCompanyName(java.lang.String companyName){
		this.companyName = companyName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  营业执照认证状态，1：已认证  0：未认证
	 */
	@Column(name ="BUSINESS_LICENSE_STATUS",nullable=true,length=2)
	public java.lang.String getBusinessLicenseStatus(){
		return this.businessLicenseStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  营业执照认证状态，1：已认证  0：未认证
	 */
	public void setBusinessLicenseStatus(java.lang.String businessLicenseStatus){
		this.businessLicenseStatus = businessLicenseStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  营业执照号
	 */
	@Column(name ="BUSINESS_LICENSE",nullable=true,length=255)
	public java.lang.String getBusinessLicense(){
		return this.businessLicense;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  营业执照号
	 */
	public void setBusinessLicense(java.lang.String businessLicense){
		this.businessLicense = businessLicense;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  组织机构代码认证状态，1：已认证 0：未认证
	 */
	@Column(name ="ORGANIZATION_CODE_STATUS",nullable=true,length=2)
	public java.lang.String getOrganizationCodeStatus(){
		return this.organizationCodeStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  组织机构代码认证状态，1：已认证 0：未认证
	 */
	public void setOrganizationCodeStatus(java.lang.String organizationCodeStatus){
		this.organizationCodeStatus = organizationCodeStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用户第一次状态【0：否；1：是；第一位：首次充值；第二位：首次投资普通标的；第三位：首次投资天标；第四位：首次绑卡】【如：是否投资、是否充值、是否实名认证】
	 */
	@Column(name ="FIRST_STATE",nullable=true,length=10)
	public java.lang.String getFirstState(){
		return this.firstState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用户第一次状态【0：否；1：是；第一位：首次充值；第二位：首次投资普通标的；第三位：首次投资天标；第四位：首次绑卡】【如：是否投资、是否充值、是否实名认证】
	 */
	public void setFirstState(java.lang.String firstState){
		this.firstState = firstState;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  投标来源【1：PC端注册；2：后台录入企业用户；3：微信注册；4：喜乐航导入】
	 */
	@Column(name ="SOURCE",nullable=true,length=2)
	public java.lang.String getSource(){
		return this.source;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  投标来源【1：PC端注册；2：后台录入企业用户；3：微信注册；4：喜乐航导入】
	 */
	public void setSource(java.lang.String source){
		this.source = source;
	}
}
