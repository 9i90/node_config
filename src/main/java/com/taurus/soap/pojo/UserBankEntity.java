package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserBank;
/**   
 * @Title: Entity
 * @Description: 用户绑卡信息
 * @author zhangdaihao
 * @date 2016-01-12 10:49:32
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_bank", schema = "")
@SuppressWarnings("serial")
public class UserBankEntity extends UserBank implements Serializable {

}
