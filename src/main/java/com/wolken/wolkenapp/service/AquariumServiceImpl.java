package com.wolken.wolkenapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dto.SaveAquariumEntityDTO;
import com.wolken.wolkenapp.entity.AquariumEntity;
import com.wolken.wolkenapp.entity.DetailsEntity;
import com.wolken.wolkenapp.repository.AquariumRepo;
import com.wolken.wolkenapp.repository.DetailsRepo;

@Service
public class AquariumServiceImpl implements AquariumService {
	
	@Autowired
	AquariumRepo aquariumRepo;
	
	@Autowired
	DetailsRepo detailsRepo; 

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
	public String validateAndSave(SaveAquariumEntityDTO dto ) {
		
		System.out.println("Inside validateAndSave() of AquariumServiceImpl");
		
		DetailsEntity detailsEntity = detailsRepo.findByOwnerName(dto.getOwner()) ;
		if(detailsEntity != null) {
			
			AquariumEntity aquariumEntity = new AquariumEntity();
			
			aquariumEntity.setAquariumName(dto.getAquariumName());
			aquariumEntity.setAquariumContact(dto.getAquariumContact());
			aquariumEntity.setAquariumEmail(dto.getAquariumEmail());
			aquariumEntity.setDetailsEntity(detailsEntity);
			
			aquariumRepo.save(aquariumEntity);
			
			System.out.println("End of  validateAndSave() of AquariumServiceImpl");
			
			return "Data Saved!!";
			
		}else {
			return "Owner Name not found";
		}
		
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
