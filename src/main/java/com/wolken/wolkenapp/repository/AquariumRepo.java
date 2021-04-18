package com.wolken.wolkenapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolken.wolkenapp.entity.AquariumEntity;

public interface AquariumRepo extends JpaRepository<AquariumEntity, Integer>{
	
	public AquariumEntity findByAquariumName(String aquariumName);

}
