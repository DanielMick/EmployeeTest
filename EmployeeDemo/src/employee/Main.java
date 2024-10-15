package employee;

public class Main {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();

		Employee emp1 = new Employee(1, "John Doe");
		Employee emp2 = new Employee(2, "Jane Smith");

		employeeService.addEmployee(emp1);
		employeeService.addEmployee(emp2);

		System.out.println("All Employees: " + employeeService.getAllEmployees());
		System.out.println("Employee with ID 1: " + employeeService.getEmployeeById(1));
	}
}