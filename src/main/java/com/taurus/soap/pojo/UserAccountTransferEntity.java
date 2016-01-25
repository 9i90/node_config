package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserAccountTransfer;
/**   
 * @Title: Entity
 * @Description: 用户转账信息
 * @author Frank
 * @date 2016-01-12 10:07:08
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_account_transfer", schema = "")
@SuppressWarnings("serial")
public class UserAccountTransferEntity extends UserAccountTransfer implements Serializable {

}
