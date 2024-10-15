package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {
	private List<Employee> employees = new ArrayList<>();

	@Override
	public List<Employee> getAllEmployees() {
		return new ArrayList<>(employees);
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> employee = employees.stream().filter(emp -> emp.getId() == id).findFirst();
		return employee.orElse(null); // Returns null if not found
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
}