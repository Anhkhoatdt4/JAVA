package bean;

import java.util.Objects;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
	}
	
	
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(id);
		
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) {
	        return true; // Corrected from false to true
	    }
	    if (!(o instanceof Employee)) {
	        return false;
	    }

	    Employee that = (Employee) o;
	    return getId().equals(that.getId());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}