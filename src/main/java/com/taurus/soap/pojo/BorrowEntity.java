package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.Borrow;
@Entity
@Table(name = "borrow", schema = "") 
@SuppressWarnings("serial")
public class BorrowEntity extends Borrow implements java.io.Serializable {

}
