package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.BorrowCollection;
@Entity
@Table(name = "borrow_collection", schema = "") 
@SuppressWarnings("serial")
public class BorrowCollectionEntity extends BorrowCollection implements java.io.Serializable {

}
