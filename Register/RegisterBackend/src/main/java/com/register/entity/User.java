package com.register.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@NotBlank
	@Size(min = 6, message = "username should atleast of 6 characters")
	private String userName;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	@Size(min = 8, message = "password should contains atleast 8 characters")
	private String password;
	@NotBlank
	@Size(min=10, max = 10, message = "This field should exactly 10 digits")
	private String phoneNo;
	
	
	
}
