package com.f3.app.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "APP_PROFILE_POST")
public class ProfilePost extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "idGen")
	private int id;
	
	@Column
	private Pet poster;
	//private Pet postedTo; //the pet whose profile the post was posted to
	
	@Column
	private String postContent;
	
	@Column
	private String privacy;//who can see the post; public, followers, group
	
	
}
