package com.koc.hospital.entities.concretes;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="educations")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "school_name")
    @NotNull
    private String schoolName;

    @Column(name = "department_name")
    @NotNull
    private String departmentName;

    @Column(name = "start_year")
    @Min(1950)
    private int startYear;

    @Column(name = "graduation_year",nullable=true)
    @Min(1950)
    private int graduationYear;
    
    @ManyToMany(mappedBy="educations")
    private Set<Doctor> doctors = new HashSet<>();
    
    

	
}
