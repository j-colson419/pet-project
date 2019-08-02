package com.f3.app.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "APP_PET")
public class Pet extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "idGen")
	private int id;
	
	@Column
	private User owner;
	
	@Column
	private String uniquePetTag; //like a username for each pet
	
	@Column
	private String breed;
	
	@Column
	private String species;
	
	@Column
	private String petFullName;
	
	@Column
	private Date petBirthdate;
	
	@Column
	private String petNickName;
	
}
