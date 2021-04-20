package com.wolken.wolkenapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wolken.wolkenapp.entity.AquariumEntity;

public interface AquariumRepo extends JpaRepository<AquariumEntity, Integer>{
	
//	@Query(nativeQuery = true, value = "select ae.* from aquariumboot_details as ae inner join details_aq as de on ae.id = de.id")
	public AquariumEntity findByAquariumName(String aquariumName);

	public AquariumEntity findByAquariumEmail(String aquariumEmail);

	public List<AquariumEntity> findByAquariumContact(long aquariumContact);

//	public AquariumEntity findByOwner(String owner);

}
