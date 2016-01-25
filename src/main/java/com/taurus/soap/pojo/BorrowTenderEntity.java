package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.BorrowTender;
@Entity
@Table(name = "borrow_tender", schema = "") 
@SuppressWarnings("serial")
public class BorrowTenderEntity extends BorrowTender implements java.io.Serializable {

}
