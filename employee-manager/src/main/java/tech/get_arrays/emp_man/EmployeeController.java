package tech.get_arrays.emp_man;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.get_arrays.emp_man.model.Employee;
import tech.get_arrays.emp_man.model.service.EmployeeService;

@RestController
@Transactional
@RequestMapping("/employee")
@SuppressWarnings("unused")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(
			final EmployeeService employeeService) {

		this.employeeService = employeeService;
	}

	@GetMapping("all")
	public ResponseEntity<List<Employee>> getAllEmployees() {

		final List<Employee> employees = employeeService.findAllEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

	@GetMapping("find/{id}")
	public ResponseEntity<Employee> getEmployeeById(
			@PathVariable("id") final Long id) {

		final Employee employee = employeeService.findEmployeeById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(
			@RequestBody final Employee employee) {

		final Employee newEmployee = employeeService.addEmployee(employee);
		return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(
			@RequestBody final Employee employee) {

		final Employee updatedEmployee = employeeService.updateEmployee(employee);
		return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmployee(
			@PathVariable("id") final Long id) {

		employeeService.deleteEmployeeById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
