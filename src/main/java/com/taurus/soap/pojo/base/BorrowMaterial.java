package com.taurus.soap.pojo.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
/**
 * 
* @ClassName: BorrowMaterial 
* @Description: 借款相关影像资料 
* @author Terry
* @date 2016年1月11日 下午6:21:38 
*
 */
@MappedSuperclass
public abstract class BorrowMaterial {
	/**id*/
	private java.lang.Integer id;
	/**借款ID*/
	private java.lang.Integer borrowId;
	/**标的资料图片类型如（1:证件2:资产证明3:征信证明）*/
	private java.lang.String type;
	/**标的资料图片路径*/
	private java.lang.String materialPicPath;
	/**缩略图路径*/
	private java.lang.String thumbnailPath;
	/**addtime*/
	private java.util.Date addtime;
	/**原图图片宽*/
	private java.lang.Integer ytWidth;
	/**原图图片高*/
	private java.lang.Integer ytHeight;
	/**状态*/
	private java.lang.String validStatus;
	/**排序*/
	private java.lang.Integer sort;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
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
	 *@param: java.lang.Integer  id
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  借款ID
	 */
	@Column(name ="BORROW_ID",nullable=false,precision=10,scale=0)
	public java.lang.Integer getBorrowId(){
		return this.borrowId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  借款ID
	 */
	public void setBorrowId(java.lang.Integer borrowId){
		this.borrowId = borrowId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标的资料图片类型如（1:证件2:资产证明3:征信证明）
	 */
	@Column(name ="TYPE",nullable=false,length=2)
	public java.lang.String getType(){
		return this.type;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标的资料图片类型如（1:证件2:资产证明3:征信证明）
	 */
	public void setType(java.lang.String type){
		this.type = type;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标的资料图片路径
	 */
	@Column(name ="MATERIAL_PIC_PATH",nullable=false,length=255)
	public java.lang.String getMaterialPicPath(){
		return this.materialPicPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标的资料图片路径
	 */
	public void setMaterialPicPath(java.lang.String materialPicPath){
		this.materialPicPath = materialPicPath;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缩略图路径
	 */
	@Column(name ="THUMBNAIL_PATH",nullable=false,length=255)
	public java.lang.String getThumbnailPath(){
		return this.thumbnailPath;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缩略图路径
	 */
	public void setThumbnailPath(java.lang.String thumbnailPath){
		this.thumbnailPath = thumbnailPath;
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  原图图片宽
	 */
	@Column(name ="YT_WIDTH",nullable=true,precision=10,scale=0)
	public java.lang.Integer getYtWidth(){
		return this.ytWidth;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  原图图片宽
	 */
	public void setYtWidth(java.lang.Integer ytWidth){
		this.ytWidth = ytWidth;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  原图图片高
	 */
	@Column(name ="YT_HEIGHT",nullable=true,precision=10,scale=0)
	public java.lang.Integer getYtHeight(){
		return this.ytHeight;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  原图图片高
	 */
	public void setYtHeight(java.lang.Integer ytHeight){
		this.ytHeight = ytHeight;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态
	 */
	@Column(name ="VALID_STATUS",nullable=true,length=2)
	public java.lang.String getValidStatus(){
		return this.validStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态
	 */
	public void setValidStatus(java.lang.String validStatus){
		this.validStatus = validStatus;
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
}
