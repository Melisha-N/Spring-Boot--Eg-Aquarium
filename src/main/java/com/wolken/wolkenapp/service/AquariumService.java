package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.entity.AquariumEntity;

public interface AquariumService {

	public List<AquariumEntity> validateAndGetAll();

	public AquariumEntity validateAndGetByName();

	public AquariumEntity validateAndSave(AquariumEntity aquariumEntity);

	public String validateAndDeleteByName(String aquariumName);

	public AquariumEntity validateAndUpdateEmailByName(String aquariumEmail, String aquariumName);

}
