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
 * @Description: 合同
 * @author zhangdaihao
 * @date 2016-01-12 15:00:26
 * @version V1.0   
 *
 */

@MappedSuperclass
public abstract class Contract {
	/**id*/
	private java.lang.Integer id;
	/**合同类型【01：借款三方合同；02：借款四方合同；03：众心捧月合同；04：债权转让合同】*/
	private java.lang.String contractSort;
	/**合同类型【0101：借款三方借款人合同；0102：借款三方投资人合同；0201：借款四方借款人合同；0202：借款四方投资人合同；0301：众心捧月借款人合同；0302：众心捧月投资人合同；0401：债权转让借款人合同；0402：债权转让投资人合同】*/
	private java.lang.String contractItem;
	/**借款表ID*/
	private java.lang.Integer borrowId;
	/**投标表ID*/
	private java.lang.Integer tenderId;
	/**借款人*/
	private java.lang.Integer borrowUserid;
	/**投资人*/
	private java.lang.Integer tenderUserid;
	/**合同编号*/
	private java.lang.String contractCode;
	/**合同唯一号*/
	private java.lang.String contractWyh;
	/**文件名称*/
	private java.lang.String fileName;
	/**文件显示名称*/
	private java.lang.String fileDisplayName;
	/**文件路径*/
	private java.lang.String filePath;
	/**文件类型*/
	private java.lang.String fileType;
	/**文件大小*/
	private java.lang.String fileSize;
	/**创建时间*/
	private java.util.Date createTime;
	/**untreatedContract*/
	private java.lang.String untreatedContract;
	
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
	 *@return: java.lang.String  合同类型【01：借款三方合同；02：借款四方合同；03：众心捧月合同；04：债权转让合同】
	 */
	@Column(name ="CONTRACT_SORT",nullable=false,length=2)
	public java.lang.String getContractSort(){
		return this.contractSort;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同类型【01：借款三方合同；02：借款四方合同；03：众心捧月合同；04：债权转让合同】
	 */
	public void setContractSort(java.lang.String contractSort){
		this.contractSort = contractSort;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同类型【0101：借款三方借款人合同；0102：借款三方投资人合同；0201：借款四方借款人合同；0202：借款四方投资人合同；0301：众心捧月借款人合同；0302：众心捧月投资人合同；0401：债权转让借款人合同；0402：债权转让投资人合同】
	 */
	@Column(name ="CONTRACT_ITEM",nullable=false,length=4)
	public java.lang.String getContractItem(){
		return this.contractItem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同类型【0101：借款三方借款人合同；0102：借款三方投资人合同；0201：借款四方借款人合同；0202：借款四方投资人合同；0301：众心捧月借款人合同；0302：众心捧月投资人合同；0401：债权转让借款人合同；0402：债权转让投资人合同】
	 */
	public void setContractItem(java.lang.String contractItem){
		this.contractItem = contractItem;
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
	 *@return: java.lang.Integer  投标表ID
	 */
	@Column(name ="TENDER_ID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getTenderId(){
		return this.tenderId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  投标表ID
	 */
	public void setTenderId(java.lang.Integer tenderId){
		this.tenderId = tenderId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  借款人
	 */
	@Column(name ="BORROW_USERID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getBorrowUserid(){
		return this.borrowUserid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  借款人
	 */
	public void setBorrowUserid(java.lang.Integer borrowUserid){
		this.borrowUserid = borrowUserid;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  投资人
	 */
	@Column(name ="TENDER_USERID",nullable=true,precision=10,scale=0)
	public java.lang.Integer getTenderUserid(){
		return this.tenderUserid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  投资人
	 */
	public void setTenderUserid(java.lang.Integer tenderUserid){
		this.tenderUserid = tenderUserid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同编号
	 */
	@Column(name ="CONTRACT_CODE",nullable=true,length=50)
	public java.lang.String getContractCode(){
		return this.contractCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同编号
	 */
	public void setContractCode(java.lang.String contractCode){
		this.contractCode = contractCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同唯一号
	 */
	@Column(name ="CONTRACT_WYH",nullable=true,length=50)
	public java.lang.String getContractWyh(){
		return this.contractWyh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同唯一号
	 */
	public void setContractWyh(java.lang.String contractWyh){
		this.contractWyh = contractWyh;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件名称
	 */
	@Column(name ="FILE_NAME",nullable=true,length=128)
	public java.lang.String getFileName(){
		return this.fileName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件名称
	 */
	public void setFileName(java.lang.String fileName){
		this.fileName = fileName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件显示名称
	 */
	@Column(name ="FILE_DISPLAY_NAME",nullable=true,length=128)
	public java.lang.String getFileDisplayName(){
		return this.fileDisplayName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件显示名称
	 */
	public void setFileDisplayName(java.lang.String fileDisplayName){
		this.fileDisplayName = fileDisplayName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件路径
	 */
	@Column(name ="FILE_PATH",nullable=true,length=255)
	public java.lang.String getFilePath(){
		return this.filePath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件路径
	 */
	public void setFilePath(java.lang.String filePath){
		this.filePath = filePath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件类型
	 */
	@Column(name ="FILE_TYPE",nullable=true,length=128)
	public java.lang.String getFileType(){
		return this.fileType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件类型
	 */
	public void setFileType(java.lang.String fileType){
		this.fileType = fileType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件大小
	 */
	@Column(name ="FILE_SIZE",nullable=true,length=128)
	public java.lang.String getFileSize(){
		return this.fileSize;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件大小
	 */
	public void setFileSize(java.lang.String fileSize){
		this.fileSize = fileSize;
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  untreatedContract
	 */
	@Column(name ="UNTREATED_CONTRACT",nullable=true,length=255)
	public java.lang.String getUntreatedContract(){
		return this.untreatedContract;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  untreatedContract
	 */
	public void setUntreatedContract(java.lang.String untreatedContract){
		this.untreatedContract = untreatedContract;
	}
}
