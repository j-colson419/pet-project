package com.f3.app.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "APP_POST_COMMENT")
public class PostComment extends Auditable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "idGen")
	private int id;
	
	@Column
	private ProfilePost post;
	
	@Column
	private String commentContent;
	
	
	
}
