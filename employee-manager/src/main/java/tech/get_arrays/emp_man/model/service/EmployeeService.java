package tech.get_arrays.emp_man.model.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.get_arrays.emp_man.exceptions.UserNotFoundException;
import tech.get_arrays.emp_man.model.Employee;
import tech.get_arrays.emp_man.model.repo.EmployeeRepo;

@Service
public class EmployeeService {

	private final EmployeeRepo employeeRepo;

	@Autowired
	public EmployeeService(
			final EmployeeRepo employeeRepo) {

		this.employeeRepo = employeeRepo;
	}

	public Employee addEmployee(
			final Employee employee) {

		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepo.save(employee);
	}

	public List<Employee> findAllEmployees() {

		return employeeRepo.findAll();
	}

	public Employee updateEmployee(
			final Employee employee) {

		return employeeRepo.save(employee);
	}

	public Employee findEmployeeById(
			final Long id) {

		return employeeRepo.findEmployeeById(id)
				.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}

	public void deleteEmployeeById(
			final Long id) {

		employeeRepo.deleteEmployeeById(id);
	}
}
