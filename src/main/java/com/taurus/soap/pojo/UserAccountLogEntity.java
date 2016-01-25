package com.taurus.soap.pojo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import com.taurus.soap.pojo.base.UserAccountLog;

import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 用户账户日志表
 * @author zhangdaihao
 * @date 2016-01-11 18:29:59
 * @version V1.0   
 *
 */
@Entity
@Table(name = "user_account_log", schema = "")
@SuppressWarnings("serial")
public class UserAccountLogEntity extends UserAccountLog implements java.io.Serializable {
	
}
