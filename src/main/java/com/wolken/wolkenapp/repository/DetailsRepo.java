package com.wolken.wolkenapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolken.wolkenapp.entity.DetailsEntity;

public interface DetailsRepo extends JpaRepository<DetailsEntity, Integer> {

	public DetailsEntity findByOwnerName(String owner);

}
