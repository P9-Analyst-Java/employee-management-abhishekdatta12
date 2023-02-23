package com.deloitte.expense.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employement_history")
@Getter
@Setter
public class EmploymentHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer hisId;
	
	@Column(name = "emp_id")
	private Integer id;
	
	@Column(name = "organization_name")
	private String organizationName;
	
	@Column(name = "from_date")
	private Date fromDate;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "post")
	private String post;
	
	@Column(name = "skill_used")
	private String skillUsed;

	public Integer getHisId() {
		return hisId;
	}

	public void setHisId(Integer hisId) {
		this.hisId = hisId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getSkillUsed() {
		return skillUsed;
	}

	public void setSkillUsed(String skillUsed) {
		this.skillUsed = skillUsed;
	}
	
	
	
}
