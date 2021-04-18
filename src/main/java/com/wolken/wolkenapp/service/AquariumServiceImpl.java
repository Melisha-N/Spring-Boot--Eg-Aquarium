package com.wolken.wolkenapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.entity.AquariumEntity;
import com.wolken.wolkenapp.repository.AquariumRepo;

@Service
public class AquariumServiceImpl implements AquariumService {
	
	@Autowired
	AquariumRepo aquariumRepo;

	@Override
	public List<AquariumEntity> validateAndGetAll() {
		
		System.out.println("Inside validateAndGetAll() of AquariumServiceImpl");
		
		System.out.println("End of  validateAndGetAll() of AquariumServiceImpl");
		
		return aquariumRepo.findAll() ;
	}

	@Override
	public AquariumEntity validateAndGetByName() {
		
		System.out.println("Inside validateAndGetByName() of AquariumServiceImpl");
		
		System.out.println("End of  validateAndGetByName() of AquariumServiceImpl");
		
		return aquariumRepo.findByAquariumName("Marinetime");
	}

	@Override
	public AquariumEntity validateAndSave(AquariumEntity aquariumEntity) {
		
		System.out.println("Inside validateAndSave() of AquariumServiceImpl");
		
		System.out.println("End of  validateAndSave() of AquariumServiceImpl");
		
		return aquariumRepo.save(aquariumEntity);
	}

	@Override
	public String validateAndDeleteByName(String aquariumName) {
		
		System.out.println("Inside validateAndDeleteByName() of AquariumServiceImpl");
		
		aquariumRepo.delete(aquariumRepo.findByAquariumName(aquariumName));
		
		System.out.println("End of  validateAndDeleteByName() of AquariumServiceImpl");
		
		return aquariumName+" Deleted Sucessfully";
	}

	@Override
	public AquariumEntity validateAndUpdateEmailByName(String aquariumEmail, String aquariumName) {
		
		System.out.println("Inside validateAndUpdateEmailByName() of AquariumServiceImpl");
		
		
		AquariumEntity aquariumEntity =	aquariumRepo.findByAquariumName(aquariumName);
		
		aquariumEntity.setAquariumEmail(aquariumEmail);
		
		System.out.println("End of  validateAndUpdateEmailByName() of AquariumServiceImpl");
		
		return aquariumRepo.save(aquariumEntity) ;
	}


}
