package com.koc.hospital.entities.concretes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="genders")
@Entity
public class Gender {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	@Size(min=3)
	private String name;
	
	@OneToOne(mappedBy="gender")
	private Doctor doctor;
	
	@OneToOne(mappedBy="gender")
	private Patient patient;
	
}
