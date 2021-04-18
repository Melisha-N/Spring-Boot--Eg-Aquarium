package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name="aquariumboot_details")
public class AquariumEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native" , strategy="native")
	@Column(name="aquarium_id")
	private int aquariumId;
	
	@Column(name="aquarium_name")
	private String aquariumName;

	@Column(name="aquarium_contact")
	private long aquariumContact;
	
	@Column(name="aquarium_email")
	private String aquariumEmail;
}
