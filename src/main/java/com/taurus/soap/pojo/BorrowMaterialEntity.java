package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.BorrowMaterial;
@Entity
@Table(name = "borrow_material", schema = "") 
@SuppressWarnings("serial")
public class BorrowMaterialEntity extends BorrowMaterial implements java.io.Serializable {

}
