package com.koc.hospital.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="patients")
@Entity

public class Patient{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="email",nullable=false)
	@Email
	@NotNull
	private String email;
	
	@Column(name="name",nullable=false)
	@Size(min=3)
	private String name;
	
	@Column(name="surname",nullable=false)
	@Size(min=3)
	private String surname;
	
	@Column(name="age",nullable=false)
	@Min(1)
	private int age;
	
	@Column(name="telephone_number",nullable=false)
	@Min(10)
	private String telephoneNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id",referencedColumnName = "id")
	private Adress adress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="gender_id",referencedColumnName = "id")
	private Gender gender;
	
}
