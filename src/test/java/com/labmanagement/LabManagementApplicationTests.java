package com.labmanagement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lab.management.bean.LabUser;
import com.lab.management.repository.LabUserRepository;


public class LabManagementApplicationTests {
	
	private static final Logger logger = LogManager.getLogger(LabManagementApplicationTests.class);
		
	@Autowired
	LabUserRepository labUserRepository;
	
	@Test
	public void testLabuser() {
		LabUser labUser = new LabUser();	
		labUser.setId((long) 1);
		labUser.setDoctorName("jitendra");
		//labUser.setLabWorkDate();
		labUser.setLabWorkDone("complete");
		labUser.setMobileNo("9028018399");
		labUser.setPatientname("gupta brother");
		labUser.setPassword("abc");
		labUser.setPayment(30.09);
		labUser.setEmailId("jitendragupta1899@gmail.com");
		System.out.println(labUser + "calling to lab user");
	try {
		labUserRepository.save(labUser);
		System.out.println("labmanagement " + labUserRepository);
		logger.info("information sucessfully updated");
		
				
	}catch (Exception e) {
		logger.error("User data not saved sucessfully", e);
		
	}
}
	
	@Test
	public void contextLoads() {
	}


}
