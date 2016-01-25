package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserIncomePeryear;
/**   
 * @Title: Entity
 * @Description: 用户年收入记录
 * @author Frank
 * @date 2016-01-12 12:02:03
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_income_peryear", schema = "")
@SuppressWarnings("serial")
public class UserIncomePeryearEntity extends UserIncomePeryear implements Serializable {

}
