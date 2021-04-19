package com.wolken.wolkenapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenapp.dto.SaveAquariumEntityDTO;
import com.wolken.wolkenapp.entity.AquariumEntity;
import com.wolken.wolkenapp.entity.DetailsEntity;
import com.wolken.wolkenapp.service.AquariumService;

@RestController
@RequestMapping("/")
public class AquariumResources {
	
	@Autowired
	AquariumService aquariumService;
	
	@GetMapping("/getAll")
	public List<AquariumEntity> getAll() {
		
		System.out.println("Inside getName() of AquariumResources");
		
		System.out.println("End of getName() of AquariumResources");
		
		return aquariumService.validateAndGetAll() ;
	}
	
	@GetMapping("/getByName")
	public AquariumEntity getByName() {
		
		System.out.println("Inside getByName() of AquariumResources");	
		
		System.out.println("End of getByName() of AquariumResources");
		
		return aquariumService.validateAndGetByName();
	}
	
	@PostMapping("/save")
	public String save(@RequestBody SaveAquariumEntityDTO saveAquariumEntityDTO) {
		
		System.out.println("Inside save() of AquariumResources");
		
		System.out.println("Calling validateAndSave() of AquariumResources");
		aquariumService.validateAndSave(saveAquariumEntityDTO);
		
		System.out.println("End of save() of AquariumResources");
		
		return "Data Saved Successfully";
		
	}
	
	@DeleteMapping("/delete")
	public String deleteByName(@RequestBody AquariumEntity aquariumEntity) {
		
		System.out.println("Inside deleteByName() of AquariumResources");	
		
		System.out.println("End of deleteByName() of AquariumResources");
		
		return aquariumService.validateAndDeleteByName(aquariumEntity.getAquariumName());
	}
	
	@PutMapping("/update")
	public AquariumEntity updateEmailByName(@RequestBody AquariumEntity aquariumEntity) {
		
		System.out.println("Inside updateEmailByName() of AquariumResources");	
		
		System.out.println("End of updateEmailByName() of AquariumResources");
		
		return aquariumService.validateAndUpdateEmailByName(aquariumEntity.getAquariumEmail(), aquariumEntity.getAquariumName());
	}
	
}
