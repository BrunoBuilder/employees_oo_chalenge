package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private Integer payDay;
	private Address address;
	
	List<Employee> employees = new ArrayList<>();

	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public Double payroll() {
		double sum = 0;
		for (Employee employee : employees) {
			sum += employee.getSalary();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PAYROLL:\n");
		sb.append("Sales Department = $ " + String.format("%.2f%n", payroll()));
		sb.append("Payment made on the " + payDay + "th\n");
		sb.append("Employees:\n");
		for (Employee employee : employees) {
			sb.append(employee.getName() + "\n");
		}
		sb.append("For questions, please contact: " + address.getEmail() + "\n");
		return sb.toString();
	}

}
