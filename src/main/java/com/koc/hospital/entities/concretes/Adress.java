package com.koc.hospital.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="addresses")
@Entity
public class Adress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="city_name")
	private String cityName;
	
	@Column(name="district_name")
	private String districtName;
	
	@Column(name="street_name")
	private String streetName;
	
	@Column(name="building_number")
	private short buildingNumber;
	
	@Column(name="door_number")
	private short doorNumber;
	
	@Column(name="post_code")
	private int postCode;
	
	@OneToOne(mappedBy="adress")
	private Doctor doctor;
	
	@OneToOne(mappedBy="adress")
	private Patient patient;
	
}
