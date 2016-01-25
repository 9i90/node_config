package com.taurus.soap.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.taurus.soap.pojo.base.UserAuthority;
@Entity
@Table(name = "user_authority", schema = "") 
@SuppressWarnings("serial")
public class UserAuthorityEntity extends UserAuthority implements java.io.Serializable {

}
