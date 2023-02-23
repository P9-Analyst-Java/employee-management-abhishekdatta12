package com.deloitte.expense.model;

import java.util.Date;

//import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employees")
@Getter
@Setter
public class Employee {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	
//	private String employeeName;
//	
//	private String designation;
//	
//	private Double salary;
//
//	public Integer getid() {
//		return id;
//	}
//
//	public void setid(Integer id) {
//		this.id = id;
//	}
//
//	public String getEmployeeName() {
//		return employeeName;
//	}
//
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//
//	public String getDesignation() {
//		return designation;
//	}
//
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
//
//	public Double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(Double salary) {
//		this.salary = salary;
//	}
	
	
	
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="gender")
	private String gender;
	@Column(name="dob")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	@Column(name="pan_num")
	private String panNum;
	@Column(name="aadhaar_num")
	@Pattern(regexp = "^[0-9]{12}$", message = "Length must be 12.")
	private String aadhaarNum;
	@Column(name="mobile_num")
//	@Pattern(regexp = "^(?=.*[0-9]).{10}", message = "Length must be 10.")
	@Pattern(regexp = "^[0-9]{10}$", message = "Length must be 10.")
	private String mobileNum;
	@Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", message = "Enter valid email")
	@Column(name="email_id")
	private String emailId;
	@Column(name="office_mail")
	private String officeMail;
	@Column(name="permanent_address")
	private String permanentAddress;
	@Column(name="present_address")
	private String presentAddress;
	@Column(name="blood_group")
	private String bloodGroup;
	@Column(name="profile_pict")
	private String profilePict;
	@Column(name="doj")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date doj;
	@Column(name="emp_level")
	private Integer empLevel;
	@Column(name="post_name")
	private String postName;
	@Column(name="basic_pay")
	private Integer basicPay;
	@Column(name="house_allowance")
	private Integer houseAllowance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPanNum() {
		return panNum;
	}
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}
	public String getAadhaarNum() {
		return aadhaarNum;
	}
	public void setAadhaarNum(String aadhaarNum) {
		this.aadhaarNum = aadhaarNum;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getOfficeMail() {
		return officeMail;
	}
	public void setOfficeMail(String officeMail) {
		this.officeMail = officeMail;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getProfilePict() {
		return profilePict;
	}
	public void setProfilePict(String profilePict) {
		this.profilePict = profilePict;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Integer getEmpLevel() {
		return empLevel;
	}
	public void setEmpLevel(Integer empLevel) {
		this.empLevel = empLevel;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public Integer getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(Integer basicPay) {
		this.basicPay = basicPay;
	}
	public Integer getHouseAllowance() {
		return houseAllowance;
	}
	public void setHouseAllowance(Integer houseAllowance) {
		this.houseAllowance = houseAllowance;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", dob=" + dob + ", panNum=" + panNum + ", aadhaarNum=" + aadhaarNum + ", mobileNum=" + mobileNum
				+ ", emailId=" + emailId + ", officeMail=" + officeMail + ", permanentAddress=" + permanentAddress
				+ ", presentAddress=" + presentAddress + ", bloodGroup=" + bloodGroup + ", profilePict=" + profilePict
				+ ", doj=" + doj + ", empLevel=" + empLevel + ", postName=" + postName + ", basicPay=" + basicPay
				+ ", houseAllowance=" + houseAllowance + "]";
	}
	
	
	
}
