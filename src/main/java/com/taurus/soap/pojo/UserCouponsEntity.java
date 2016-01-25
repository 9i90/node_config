package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserCoupons;
/**   
 * @Title: Entity
 * @Description: 用户券信息
 * @author Frank
 * @date 2016-01-12 11:18:01
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_coupons", schema = "")
@SuppressWarnings("serial")
public class UserCouponsEntity extends UserCoupons implements Serializable {

}
