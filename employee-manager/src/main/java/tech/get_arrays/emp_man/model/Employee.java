package tech.get_arrays.emp_man.model;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@SuppressWarnings("unused")
public class Employee implements Serializable {

	@Serial
	private static final long serialVersionUID = -3840603850087324098L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;

	private String name;
	private String email;
	private String jobTitle;
	private String phone;
	private String imageUrl;

	@Column(nullable = false, updatable = false)
	private String employeeCode;

	Employee() {
	}

	public Employee(
			final Long id,
			final String name,
			final String email,
			final String jobTitle,
			final String phone,
			final String imageUrl,
			final String employeeCode) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.jobTitle = jobTitle;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(
			final Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(
			final String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(
			final String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(
			final String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(
			final String phone) {
		this.phone = phone;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(
			final String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(
			final String employeeCode) {
		this.employeeCode = employeeCode;
	}

	@Override
	public String toString() {

		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", jobTitle='" + jobTitle + '\'' +
				", phone='" + phone + '\'' +
				", imageUrl='" + imageUrl + '\'' +
				", employeeCode='" + employeeCode + '\'' +
				'}';
	}
}
