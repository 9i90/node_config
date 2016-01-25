package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserIntegralLog;
/**   
 * @Title: Entity
 * @Description: 用户积分日志
 * @author Frank
 * @date 2016-01-12 13:12:16
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_integral_log", schema = "")
@SuppressWarnings("serial")
public class UserIntegralLogEntity extends UserIntegralLog implements Serializable {

}
