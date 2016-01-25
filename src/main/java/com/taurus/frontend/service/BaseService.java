package com.taurus.frontend.service; 

 

import net.sf.json.JSONObject;
 
public interface BaseService  {

	/**
 	 * 方法描述:  保存
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
	 * @param <T>
 	 * @param entityClass 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	 
	public  <T> JSONObject saveEntiy(T entity);

	/**
 	 * 方法描述:  保存或更新
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param entityClass 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
	
	public  <T> JSONObject saveOrUpdateEntiy(T entity);
	
	/**
 	 * 方法描述:  删除
 	 * 作    者： dinnis 
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param entityClass 
 	 * @return
 	 * 返回类型：JSONObject
 	 */
	
	public  <T> JSONObject deleteEntiy(T entity);
	
	/**
 	 * 方法描述:  
 	 * 作    者： dinnis
 	 * 日    期： 2016年1月7日-下午9:22:42
 	 * @param entityClass 
 	 * @return 
 	 * 返回类型：JSONObject
 	 */
//	public JSONObject executeServiceSql(String sql,Object[] param);
	
}