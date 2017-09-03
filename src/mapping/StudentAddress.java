package mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentAddress {

	
	private int studentAddressId;
	private int pin;
	private String city;
	private String country;
	
	private Student student;
	
	@OneToOne(mappedBy="studentAddress", cascade=CascadeType.ALL)// Bi directional one to one mapping
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Id
	@GeneratedValue
	@Column(name="studentAddressId_PK")
	public int getStudentAddressId() {
		return studentAddressId;
	}
	public void setStudentAddressId(int studentAddressId) {
		this.studentAddressId = studentAddressId;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
