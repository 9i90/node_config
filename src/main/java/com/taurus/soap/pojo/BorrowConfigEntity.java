package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.BorrowConfig;
@Entity
@Table(name = "borrow_config", schema = "") 
@SuppressWarnings("serial")
public class BorrowConfigEntity extends BorrowConfig implements java.io.Serializable {

}
