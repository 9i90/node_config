package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserCompanyInfo;
/**   
 * @Title: Entity
 * @Description: 企业用户公司信息
 * @author Frank
 * @date 2016-01-12 11:01:48
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_company_info", schema = "")
@SuppressWarnings("serial")
public class UserCompanyInfoEntity extends UserCompanyInfo implements Serializable {

}
