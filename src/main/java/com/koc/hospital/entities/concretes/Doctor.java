package com.koc.hospital.entities.concretes;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="doctors")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="email",nullable=false)
	
	private String email;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="surname",nullable=false)
	private String surname;
	
	@Column(name="age",nullable=false)
	private int age;
	
	@Column(name="telephone_number",nullable=false)
	private String telephoneNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id",referencedColumnName = "id")
	private Adress adress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="gender_id",referencedColumnName = "id")
	private Gender gender;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="department_id")
	private Department department;
	
	@ManyToMany
	@JoinTable(
			name="doctor_educations"
			,joinColumns=@JoinColumn
			(name="doctor_id",referencedColumnName="id")
			,inverseJoinColumns=@JoinColumn
			(name="education_id",referencedColumnName="id"))
	private Set<Education> educations = new HashSet<>();
	
}
