package tech.get_arrays.emp_man.model.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.get_arrays.emp_man.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	Optional<Employee> findEmployeeById(
			Long id);

	void deleteEmployeeById(
			Long id);
}
