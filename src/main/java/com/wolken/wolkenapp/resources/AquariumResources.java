package com.wolken.wolkenapp.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<List<AquariumEntity>> getAll() {
		
		System.out.println("Inside getName() of AquariumResources");
		
		System.out.println("End of getName() of AquariumResources");
		
//		return aquariumService.validateAndGetAll();
		 
		 
		
		List<AquariumEntity> entity = aquariumService.validateAndGetAll();
		return  new ResponseEntity<List<AquariumEntity>>(entity, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getByName")
	public AquariumEntity getByName() {
		
		System.out.println("Inside getByName() of AquariumResources");	
		
		System.out.println("End of getByName() of AquariumResources");

		return aquariumService.validateAndGetByName();
		
		
//		ResponseEntity<AquariumEntity>
//		AquariumEntity entity = aquariumService.validateAndGetByName();
//		return ResponseEntity<AquariumEntity>(entity, HttpStatus.ACCEPTED);

	}
	
	@GetMapping("/getByContact") //Getting BadRequest - Error
	public List<AquariumEntity> getByContact(@RequestBody AquariumEntity aquariumEntity){
		System.out.println("Inside getByContact() of AquariumResources");	
		
		System.out.println(aquariumEntity.getAquariumContact());
		
		System.out.println("End of getByContact() of AquariumResources");
		
		return aquariumService.validateAndGetByContact(aquariumEntity.getAquariumContact());

		
	}
	
	@PostMapping("/save")
	public String save(@RequestBody SaveAquariumEntityDTO saveAquariumEntityDTO) {
		
		System.out.println("Inside save() of AquariumResources");
		
		System.out.println("Calling validateAndSave() of AquariumResources");
		aquariumService.validateAndSave(saveAquariumEntityDTO);
		
		System.out.println("End of save() of AquariumResources");
		
		return "Data Saved Successfully";
		
	}
	
	@PostMapping("/saveAll") //Getting BadRequest - Error 
	public int saveAll(@RequestBody List<AquariumEntity> aquariumEntity) {
		
		System.out.println("Inside saveAll() of AquariumResources");
		
		System.out.println("Calling validateAndSaveAll() of AquariumResources");
		int saveAll = aquariumService.validateAndSaveAll(aquariumEntity);
		
		System.out.println("End of saveAll() of AquariumResources");
		
		return saveAll;
		
	}
	
	@DeleteMapping("/delete")
	public String deleteByName(@RequestBody AquariumEntity aquariumEntity) {
		
		System.out.println("Inside deleteByName() of AquariumResources");	
		
		System.out.println("End of deleteByName() of AquariumResources");
		
		return aquariumService.validateAndDeleteByName(aquariumEntity.getAquariumName());
	}
	
	@PutMapping("/updateEmail")
	public AquariumEntity updateEmailByName(@RequestBody AquariumEntity aquariumEntity) {
		
		System.out.println("Inside updateEmailByName() of AquariumResources");	
		
		System.out.println("End of updateEmailByName() of AquariumResources");
		
		return aquariumService.validateAndUpdateEmailByName(aquariumEntity.getAquariumEmail(), aquariumEntity.getAquariumName());
	}
	
	@PutMapping("/updateName")
	public AquariumEntity updateNameByEmail(@RequestBody AquariumEntity aquariumEntity) {
		
		System.out.println("Inside updateNameByEmail() of AquariumResources");	
		
		System.out.println("End of updateNameByEmail() of AquariumResources");
		
		return aquariumService.validateAndUpdateNameByEmail(aquariumEntity.getAquariumName() , aquariumEntity.getAquariumEmail());
	}
	
//	@PutMapping("/updateContact")
//	public AquariumEntity updateContactByOwner(@RequestBody SaveAquariumEntityDTO saveAquariumEntityDTO){
//		
//		System.out.println("Inside updateContactByOwner() of AquariumResources");	
//		
//		System.out.println("End of updateContactByOwner() of AquariumResources");
//		
//		return aquariumService.validateAndUpdateContactByOwner(saveAquariumEntityDTO.getAquariumContact(), saveAquariumEntityDTO.getOwner());
//
//	}
	
	
}
