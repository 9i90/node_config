package com.taurus.frontend.service.impl; 

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.taurus.frontend.service.BaseService;
import com.taurus.soap.service.SOAPBaseService;
import com.thoughtworks.xstream.XStream;

import net.sf.json.JSONObject;

@Service("baseService")
@Transactional
public class BaseServiceImpl implements BaseService {
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "client-beans.xml" });

	SOAPBaseService client = (SOAPBaseService) context.getBean("clientBase");
	XStream xstream = new XStream();
 
	@Override
	public <T> JSONObject saveEntiy(T entity){
		String entiyXml = xstream.toXML(entity);
	    JSONObject object = client.saveEntiy(entiyXml);	    
	    return object;
	}

	@Override
	public <T> JSONObject saveOrUpdateEntiy(T entity) {
		String entiyXml = xstream.toXML(entity);
	    JSONObject object = client.saveOrUpdateEntiy(entiyXml);	    
	    return object;
	}

	@Override
	public <T> JSONObject deleteEntiy(T entity) {
		String entiyXml = xstream.toXML(entity);
	    JSONObject object = client.deleteEntiy(entiyXml);	    
	    return object;
	}
	
}