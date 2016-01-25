package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.BorrowTransfer;
@Entity
@Table(name = "borrow_transfer", schema = "") 
@SuppressWarnings("serial")
public class BorrowTransferEntity extends BorrowTransfer implements java.io.Serializable {

}
