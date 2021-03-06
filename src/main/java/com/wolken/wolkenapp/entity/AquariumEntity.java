package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name="aquariumboot_details")    //child table
public class AquariumEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="aquarium_name")
	private String aquariumName;

	@Column(name="aquarium_contact")
	private long aquariumContact;
	
	@Column(name="aquarium_email")
	private String aquariumEmail;
	
	@OneToOne
	@JsonIgnoreProperties("aquariumEntity")
	private DetailsEntity detailsEntity;
}
