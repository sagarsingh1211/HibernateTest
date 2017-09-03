package com.hibernate.inharitance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)// create one table for all tables or entity classes
//@Inheritance(strategy = InheritanceType.JOINED)// Create table for each class or each entity class
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)// each table data will be stored
public class Project {

	private String projectName;
	private int projectId;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	@Id
	@GeneratedValue
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
}
