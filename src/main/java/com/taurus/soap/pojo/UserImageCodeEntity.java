package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserImageCode;
/**   
 * @Title: Entity
 * @Description: 用户图片验证码
 * @author Frank
 * @date 2016-01-12 11:46:09
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_image_code", schema = "")
@SuppressWarnings("serial")
public class UserImageCodeEntity extends UserImageCode implements Serializable {

}
