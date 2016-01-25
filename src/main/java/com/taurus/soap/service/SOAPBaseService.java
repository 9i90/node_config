package com.taurus.soap.service; 

import javax.jws.WebService;
import net.sf.json.JSONObject;

@WebService   
public interface SOAPBaseService {
 
	/**
 	 * 方法描述:  保存
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param entityClass 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	 
	public  JSONObject saveEntiy(String entiyXml);

	/**
 	 * 方法描述:  保存或更新
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param entityClass 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public  JSONObject saveOrUpdateEntiy(String entiyXml);
	
	/**
 	 * 方法描述:  删除
 	 * 作    者： dinnis 
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param entityClass 
 	 * @return
 	 * 返回类型：JSONObject
 	 */
	
	public  JSONObject deleteEntiy(String entiyXml);
	
	/**
 	 * 方法描述:  
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param entityClass 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	public JSONObject executeServiceSql(String sql,Object[] param);
	
	
}