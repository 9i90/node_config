package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.BorrowFee;
@Entity
@Table(name = "borrow_fee", schema = "") 
@SuppressWarnings("serial")
public class BorrowFeeEntity extends BorrowFee implements java.io.Serializable {

}
