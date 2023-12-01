package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cust_tab")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cust_id")
	private Long id;
	@Column(name="cust_name")
	private String name;
	@Column(name="cust_email")
	private String email;
	@Column(name="cust_mobile")
	private String mobile;
	@Column(name="cust_address")
	private String address;
	@Column(name="cust_pancard")
	private String panCard;
	@Column(name="cust_aadhar_id")
	private String aadharId;
	@Column(name="cust_gender")
	private String gender;
	@Column(name="cust_imagepath")
	private String imagePath;

}
