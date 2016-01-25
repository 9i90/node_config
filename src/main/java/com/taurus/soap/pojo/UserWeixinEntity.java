package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserWeixin;
/**   
 * @Title: Entity
 * @Description: 微信用户信息
 * @author Frank
 * @date 2016-01-12 14:00:01
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_weixin", schema = "")
@SuppressWarnings("serial")
public class UserWeixinEntity extends UserWeixin implements Serializable {

}
