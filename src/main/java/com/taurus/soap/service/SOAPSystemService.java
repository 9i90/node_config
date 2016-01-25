package com.taurus.soap.service; 

import javax.jws.WebService;
import net.sf.json.JSONObject;

@WebService   
public interface SOAPSystemService {
 
	/**
 	 * 方法描述:  发送短线
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param entityClass 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	 
	public  JSONObject sendSMS(String sms,int smsType);

	/**
 	 * 方法描述:  发送邮件
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param entityClass 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public  JSONObject sendEmail(String email);
	
	
}