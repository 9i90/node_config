package com.taurus.soap.service; 

import javax.jws.WebService;

import com.taurus.soap.pojo.UserAccountCashEntity;
import com.taurus.soap.pojo.UserAccountRechargeEntity;
import com.taurus.soap.pojo.*;

import net.sf.json.JSONObject;

@WebService   
public interface SOAPTransactionService {
 
	/**
 	 * 方法描述:   充值
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param UserAccountRechargeEntity  
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	 
	public  JSONObject userRecharge(UserAccountRechargeEntity userAccountRechargeEntity);

 
	/**
 	 * 方法描述:  提现
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param UserAccountCashEntity  
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	 
	public  JSONObject userAccountCash(UserAccountCashEntity userAccountCashEntity);

	

	/**
 	 * 方法描述:  代金券变现
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param UserCouponsEntity   
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	 
	public  JSONObject userCouponsToMoney(UserCouponsEntity userCouponsEntity);


	/**
 	 * 方法描述:  赠送服务 代金券
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param UserEntity   
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	 
	public  JSONObject giveUserCoupons(UserEntity userEntity,CouponInfoEntity couponInfoEntity);

	/**
 	 * 方法描述:  活动领取接口
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param UserEntity   
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	 
	public  JSONObject  campaignGran(UserEntity userEntity,CouponInfoEntity couponInfoEntity);
	
	
}