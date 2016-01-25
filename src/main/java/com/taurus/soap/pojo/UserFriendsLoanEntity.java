package com.taurus.soap.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


import com.taurus.soap.pojo.base.UserFriendsLoan;
/**   
 * @Title: Entity
 * @Description: 好友贷
 * @author Frank 
 * @date 2016-01-12 11:29:59
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_friends_loan", schema = "")
@SuppressWarnings("serial")
public class UserFriendsLoanEntity extends UserFriendsLoan implements Serializable {

}
