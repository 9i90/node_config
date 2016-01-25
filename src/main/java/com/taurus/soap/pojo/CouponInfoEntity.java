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

import com.taurus.soap.pojo.base.Contract;
import com.taurus.soap.pojo.base.CouponInfo;

import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 券
 * @author zhangdaihao
 * @date 2016-01-12 15:10:19
 * @version V1.0   
 *
 */
@Entity
@Table(name = "coupon_info", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class CouponInfoEntity extends CouponInfo implements java.io.Serializable {

	
}
