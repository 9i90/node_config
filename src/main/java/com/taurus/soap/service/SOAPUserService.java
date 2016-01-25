package com.taurus.soap.service; 

import javax.jws.WebService;

import com.taurus.soap.pojo.UserBankEntity;
import com.taurus.soap.pojo.UserEntity;

import net.sf.json.JSONObject;

@WebService   
public interface SOAPUserService {
 
	/**
 	 * 方法描述:  功能：用户注册
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param UserEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	 
	public  JSONObject userRegister(UserEntity userEntity);


	/**
 	 * 方法描述:  功能：用户登录
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param UserEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public  JSONObject userLogin(UserEntity userEntity);
	

	/**
 	 * 方法描述:  功能：实名认证
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param UserEntity 
 	 * @return 
 	 * 返回类型：JSONObject
 	 * 
 	 *  */
	
	public  JSONObject userRealNameCertification (UserEntity userEntity);
	
	
	/**
 	 * 方法描述:  功能：用户签到
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param user_id 
 	 * @return 
 	 * 返回类型：JSONObject
 	 * 
 	 *  */
	
	public  JSONObject userSignIn (int user_id);
	
	/**
 	 * 方法描述:  功能：：绑卡
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param user_bank
 	 * @return 
 	 * 返回类型：JSONObject
 	 * 
 	 *  */
	
	public  JSONObject userTieCard (UserBankEntity userBank);
	
	
	/**
 	 * 方法描述:  功能：：解绑
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param user_bank userBank
 	 * @return 
 	 * 返回类型：JSONObject
 	 * 
 	 *  */
	
	public  JSONObject userUnTieCard (int user_bank_id);
	
	
	/**
 	 * 方法描述:  功能：：企业用户注册
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param user_bank userBank
 	 * @return 
 	 * 返回类型：JSONObject
 	 * 
 	 *  */
	 
	 
	public  JSONObject userEnterpriseRegister(UserEntity userEntity);
	
	
	
}