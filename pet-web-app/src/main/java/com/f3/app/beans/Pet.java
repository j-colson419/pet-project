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

	public Pet() {}
	
	public Pet(User owner, String uniquePetTag, String breed, String species, String petFullName,
			Date petBirthdate, String petNickName) {
		super();
		this.owner = owner;
		this.uniquePetTag = uniquePetTag;
		this.breed = breed;
		this.species = species;
		this.petFullName = petFullName;
		this.petBirthdate = petBirthdate;
		this.petNickName = petNickName;
	}
	
	public Pet(int id, User owner, String uniquePetTag, String breed, String species, String petFullName,
			Date petBirthdate, String petNickName) {
		super();
		this.id = id;
		this.owner = owner;
		this.uniquePetTag = uniquePetTag;
		this.breed = breed;
		this.species = species;
		this.petFullName = petFullName;
		this.petBirthdate = petBirthdate;
		this.petNickName = petNickName;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected User getOwner() {
		return owner;
	}

	protected void setOwner(User owner) {
		this.owner = owner;
	}

	protected String getUniquePetTag() {
		return uniquePetTag;
	}

	protected void setUniquePetTag(String uniquePetTag) {
		this.uniquePetTag = uniquePetTag;
	}

	protected String getBreed() {
		return breed;
	}

	protected void setBreed(String breed) {
		this.breed = breed;
	}

	protected String getSpecies() {
		return species;
	}

	protected void setSpecies(String species) {
		this.species = species;
	}

	protected String getPetFullName() {
		return petFullName;
	}

	protected void setPetFullName(String petFullName) {
		this.petFullName = petFullName;
	}

	protected Date getPetBirthdate() {
		return petBirthdate;
	}

	protected void setPetBirthdate(Date petBirthdate) {
		this.petBirthdate = petBirthdate;
	}

	protected String getPetNickName() {
		return petNickName;
	}

	protected void setPetNickName(String petNickName) {
		this.petNickName = petNickName;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", owner=" + owner + ", uniquePetTag=" + uniquePetTag + ", breed=" + breed
				+ ", species=" + species + ", petFullName=" + petFullName + ", petBirthdate=" + petBirthdate
				+ ", petNickName=" + petNickName + "]";
	}
	
}
