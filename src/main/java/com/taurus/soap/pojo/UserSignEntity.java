package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserSign;

/**   
 * @Title: Entity
 * @Description: 用户签到信息
 * @author Frank
 * @date 2016-01-12 13:46:36
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_sign", schema = "")
@SuppressWarnings("serial")
public class UserSignEntity extends UserSign implements Serializable {

}
