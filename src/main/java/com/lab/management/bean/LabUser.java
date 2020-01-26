package com.lab.management.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "LAB_USER_DETAILS")
@EntityListeners(AuditingEntityListener.class)
public class LabUser implements Serializable {

	/**
	 * This is system generated serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "patientname")
	private String patientname;

	@Column(name = "password")
	private String password;

	@Column(name = "mobileNo")
	private String mobileNo;

	@Column(name = "emailId")
	private String emailId;

	@Column(name = "labWorkDone")
	private String labWorkDone ;

	@Column(name = "labWorkDate") 
	private Date labWorkDate;
	 
	@Column(name = "payment")
	private Double payment;

	@Column(name = "doctorName")
	private String doctorName;

	public LabUser() {

	}
	
	public LabUser(Long id, String patientname,String password) {
		this.id = id;
		this.patientname = patientname;
		this.password = password;
		
		
	}

	public LabUser(String mobileNo, String emailId,
			String labWorkDone, Date labWorkDate, Double payment, String doctorName) {		
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.labWorkDone = labWorkDone;
		//this.labWorkDate = labWorkDate;
		this.payment = payment;
		this.doctorName = doctorName;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLabWorkDone() {
		return labWorkDone;
	}

	public void setLabWorkDone(String labWorkDone) {
		this.labWorkDone = labWorkDone;
	}

	
	  public Date getLabWorkDate() { 
		  return labWorkDate; 
		  
	  }
	  
	  public void setLabWorkDate(Date labWorkDate) { 
		  this.labWorkDate = labWorkDate; 
		  
	  }
	 

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	
	
}
