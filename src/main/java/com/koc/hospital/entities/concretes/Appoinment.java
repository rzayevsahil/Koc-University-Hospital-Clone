package com.koc.hospital.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//bla bla  
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="appoinments")
@Entity
public class Appoinment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable=false)
	@NotNull
	@Size(min=3)
	private String name;
	
	@Column(name="surname",nullable=false)
	@NotNull
	@Size(min=3)
	private String surname;
	
	@Column(name="email")
	@Email
	@NotNull
	private String email;
	
	@Column(name="content")
	private String content;
	
	@Column(name="appoinment_date")
	@FutureOrPresent
	private LocalDate appoinmentDate;
	
	@Column(name="telephone_Number")
	@NotNull
	@Size(min=10)
	private String telephoneNumber;
	
	
	
}
