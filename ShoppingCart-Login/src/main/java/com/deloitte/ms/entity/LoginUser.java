package com.deloitte.ms.entity;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;
	
	private String password;
	
	private String name;
	
	private String email;
	
	public List<GrantedAuthority> getAuthorities(){
		return List.of(()->"read");
	}
	
}
