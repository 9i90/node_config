package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.Contract;
@Entity
@Table(name = "contract", schema = "") 
@SuppressWarnings("serial")
public class ContractEntity extends Contract implements java.io.Serializable {

}
