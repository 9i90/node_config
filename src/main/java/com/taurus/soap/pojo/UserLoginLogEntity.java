package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserLoginLog;
/**   
 * @Title: Entity
 * @Description: 用户登录日志
 * @author Frank
 * @date 2016-01-12 13:34:38
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_login_log", schema = "")
@SuppressWarnings("serial")
public class UserLoginLogEntity extends UserLoginLog implements Serializable {

}
