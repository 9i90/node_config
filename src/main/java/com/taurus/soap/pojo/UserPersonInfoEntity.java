package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserPersonInfo;
/**   
 * @Title: Entity
 * @Description: 用户身份信息
 * @author Frank
 * @date 2016-01-12 13:40:51
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_person_info", schema = "")
@SuppressWarnings("serial")
public class UserPersonInfoEntity extends UserPersonInfo implements Serializable {

}
