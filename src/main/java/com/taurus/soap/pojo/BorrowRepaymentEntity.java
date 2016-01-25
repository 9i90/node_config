package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.BorrowRepayment;
@Entity
@Table(name = "borrow_repayment", schema = "") 
@SuppressWarnings("serial")
public class BorrowRepaymentEntity extends BorrowRepayment implements java.io.Serializable {

}
