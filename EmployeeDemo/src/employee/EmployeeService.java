package employee;

import java.util.List;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	Employee getEmployeeById(long id);

	void addEmployee(Employee employee);
}
