package com.lab.management.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.management.bean.LabUser;
import com.lab.management.repository.LabUserRepository;
import com.lab.managmement.exception.LabResourceNotFound;



@RestController
@RequestMapping("/lab")
public class LabManagementController {
	
	private static final Logger logger = LogManager.getLogger(LabManagementController.class);
	
	@Autowired
	LabUserRepository labUserRepository;
	

	@GetMapping("/getlabData")
	public List<LabUser> getAllRegisterLabUserList(){
		logger.info("Entering into labUser::getAllRegisterLabUserList()");
		return labUserRepository.findAll();	
	}
	
	
	  @PostMapping("/createlabUser") public LabUser
	  createlabUserDetails(@RequestBody LabUser labUser) {
	  logger.info("Entering into labUser::createlabUserDetails()"); return
	  labUserRepository.save(labUser); }
	 
	@GetMapping("/findlabDataById/{id}")
	public LabUser getlabDataById(@PathVariable(value = "id") Long id)  {
		logger.info("Entering into labUser::getlabDataById()");
	    return labUserRepository.findById(id)
	            .orElseThrow(() -> new LabResourceNotFound("lab", "id", id));

	}
	
	  // Update a Note
	  
	  @PutMapping("/labDataUpdate/{id}") public LabUser
	  updateNote(@PathVariable(value = "id") Long id,
	  
	  @Valid @RequestBody LabUser labupdate) {
	  logger.info("Entering into labUser::updateNote()"); LabUser labuserupdate =
	  labUserRepository.findById(id) .orElseThrow(() -> new
	  LabResourceNotFound("lab", "id", id));
	  
	  
	  labuserupdate.setEmailId(labupdate.getEmailId());
	  
	  
	  
	  return labUserRepository.save(labuserupdate);
	  
	  }
	 
}
