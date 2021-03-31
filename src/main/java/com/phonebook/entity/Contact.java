package com.phonebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Contact_Details")
public class Contact {
	@Id
	@GeneratedValue
	@Column(name="Contact_Id")
	private Integer contactId;
	@Column(name="Contact_Name")
	private String contactName;
	@Column(name="Contact_Email")
	private String contactEmail;
	@Column(name="Contact_Number")
	private Long contactNumber;
	
}
