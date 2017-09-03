package com.hibernate.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
	
	
	private int collegeId;
	private String collegeName;
	
	private List<Student> students;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@OneToMany(targetEntity = Student.class, mappedBy="college", cascade = CascadeType.ALL, fetch = FetchType.EAGER)// Default fetch type is lazy for onetomany
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
