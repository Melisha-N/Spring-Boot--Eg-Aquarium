package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.SaveAquariumEntityDTO;
import com.wolken.wolkenapp.entity.AquariumEntity;

public interface AquariumService {

	public List<AquariumEntity> validateAndGetAll();

	public AquariumEntity validateAndGetByName();

	public String validateAndSave(SaveAquariumEntityDTO saveAquariumEntityDTO );

	public String validateAndDeleteByName(String aquariumName);

	public AquariumEntity validateAndUpdateEmailByName(String aquariumEmail, String aquariumName);

	public AquariumEntity validateAndUpdateNameByEmail(String aquariumName, String aquariumEmail);

	public List<AquariumEntity> validateAndGetByContact(long aquariumContact);

	public int validateAndSaveAll(List<AquariumEntity> aquariumEntity);

//	public AquariumEntity validateAndUpdateContactByOwner(long aquariumContact, String owner);

}
