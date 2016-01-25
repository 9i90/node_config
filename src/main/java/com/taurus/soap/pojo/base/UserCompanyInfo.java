package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**   
 * @Title: Entity
 * @Description: 企业用户公司信息
 * @author Frank
 * @date 2016-01-12 11:01:48
 * @version V1.0   
 *
 */
@MappedSuperclass
public abstract class UserCompanyInfo {

	/**id*/
	private java.lang.Integer id;
	/**企业名称*/
	private java.lang.String enterpriseName;
	/**营业执照号*/
	private java.lang.String businessLicense;
	/**营业执照图片*/
	private java.lang.String licenceImage;
	/**法人姓名*/
	private java.lang.String legalPersonName;
	/**法人身份证号*/
	private java.lang.String legalPersonCertNo;
	/**法人身份证正面图片*/
	private java.lang.String legalPersonCertFrontPath;
	/**法人身份证背面图片*/
	private java.lang.String legalPersonCertBackPath;
	/**税务登记号*/
	private java.lang.String taxAuthorityNo;
	/**组织机构代码*/
	private java.lang.String organizationCode;
	/**营业年限*/
	private java.lang.String comCycle;
	/**常用地址*/
	private java.lang.String address;
	/**营业执照所在地省*/
	private java.lang.String provName;
	/**营业执照所在地市*/
	private java.lang.String cityName;
	/**组织机构代码认证状态，1：已认证 0：未认证*/
	private java.lang.String organizationCodeStatus;
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
	 *@return: java.lang.String  企业名称
	 */
	@Column(name ="ENTERPRISE_NAME",nullable=true,length=256)
	public java.lang.String getEnterpriseName(){
		return this.enterpriseName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  企业名称
	 */
	public void setEnterpriseName(java.lang.String enterpriseName){
		this.enterpriseName = enterpriseName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  营业执照号
	 */
	@Column(name ="BUSINESS_LICENSE",nullable=true,length=32)
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
	 *@return: java.lang.String  营业执照图片
	 */
	@Column(name ="LICENCE_IMAGE",nullable=true,length=256)
	public java.lang.String getLicenceImage(){
		return this.licenceImage;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  营业执照图片
	 */
	public void setLicenceImage(java.lang.String licenceImage){
		this.licenceImage = licenceImage;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  法人姓名
	 */
	@Column(name ="LEGAL_PERSON_NAME",nullable=true,length=16)
	public java.lang.String getLegalPersonName(){
		return this.legalPersonName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  法人姓名
	 */
	public void setLegalPersonName(java.lang.String legalPersonName){
		this.legalPersonName = legalPersonName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  法人身份证号
	 */
	@Column(name ="LEGAL_PERSON_CERT_NO",nullable=true,length=32)
	public java.lang.String getLegalPersonCertNo(){
		return this.legalPersonCertNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  法人身份证号
	 */
	public void setLegalPersonCertNo(java.lang.String legalPersonCertNo){
		this.legalPersonCertNo = legalPersonCertNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  法人身份证正面图片
	 */
	@Column(name ="LEGAL_PERSON_CERT_FRONT_PATH",nullable=true,length=256)
	public java.lang.String getLegalPersonCertFrontPath(){
		return this.legalPersonCertFrontPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  法人身份证正面图片
	 */
	public void setLegalPersonCertFrontPath(java.lang.String legalPersonCertFrontPath){
		this.legalPersonCertFrontPath = legalPersonCertFrontPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  法人身份证背面图片
	 */
	@Column(name ="LEGAL_PERSON_CERT_BACK_PATH",nullable=true,length=256)
	public java.lang.String getLegalPersonCertBackPath(){
		return this.legalPersonCertBackPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  法人身份证背面图片
	 */
	public void setLegalPersonCertBackPath(java.lang.String legalPersonCertBackPath){
		this.legalPersonCertBackPath = legalPersonCertBackPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  税务登记号
	 */
	@Column(name ="TAX_AUTHORITY_NO",nullable=true,length=32)
	public java.lang.String getTaxAuthorityNo(){
		return this.taxAuthorityNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  税务登记号
	 */
	public void setTaxAuthorityNo(java.lang.String taxAuthorityNo){
		this.taxAuthorityNo = taxAuthorityNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  组织机构代码
	 */
	@Column(name ="ORGANIZATION_CODE",nullable=true,length=32)
	public java.lang.String getOrganizationCode(){
		return this.organizationCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  组织机构代码
	 */
	public void setOrganizationCode(java.lang.String organizationCode){
		this.organizationCode = organizationCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  营业年限
	 */
	@Column(name ="COM_CYCLE",nullable=true,length=10)
	public java.lang.String getComCycle(){
		return this.comCycle;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  营业年限
	 */
	public void setComCycle(java.lang.String comCycle){
		this.comCycle = comCycle;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  常用地址
	 */
	@Column(name ="ADDRESS",nullable=true,length=256)
	public java.lang.String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  常用地址
	 */
	public void setAddress(java.lang.String address){
		this.address = address;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  营业执照所在地省
	 */
	@Column(name ="PROV_NAME",nullable=true,length=16)
	public java.lang.String getProvName(){
		return this.provName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  营业执照所在地省
	 */
	public void setProvName(java.lang.String provName){
		this.provName = provName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  营业执照所在地市
	 */
	@Column(name ="CITY_NAME",nullable=true,length=16)
	public java.lang.String getCityName(){
		return this.cityName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  营业执照所在地市
	 */
	public void setCityName(java.lang.String cityName){
		this.cityName = cityName;
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
