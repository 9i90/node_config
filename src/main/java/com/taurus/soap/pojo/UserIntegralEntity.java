package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserIntegral;
/**   
 * @Title: Entity
 * @Description: 用户积分
 * @author Frank
 * @date 2016-01-12 12:26:05
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_integral", schema = "")
@SuppressWarnings("serial")
public class UserIntegralEntity extends UserIntegral implements Serializable {

}
