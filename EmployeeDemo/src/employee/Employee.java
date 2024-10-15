package employee;
import java.util.Objects;

public class Employee {
	private long id;
	private String name;

	public Employee(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Employee))
			return false;
		Employee employee = (Employee) o;
		return id == employee.id && Objects.equals(name, employee.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "Employee{id=" + id + ", name='" + name + "'}";
	}
}
