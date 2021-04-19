package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Component
public class SaveAquariumEntityDTO {
	
	
	private String aquariumName;

	private long aquariumContact;
	
	private String aquariumEmail;
	
	private String owner;

}
