package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.User;
@Entity
@Table(name = "user", schema = "") 
@SuppressWarnings("serial")
public class UserEntity extends User implements java.io.Serializable {

}
