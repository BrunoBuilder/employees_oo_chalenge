package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Department name: ");
		String depName = sc.nextLine();
		System.out.print("Payday: ");
		int depPayDay = sc.nextInt();
		System.out.print("Email: ");
		String addressEmail = sc.next();
		System.out.print("Phone: ");
		String addressPhone = sc.next();
		
		Department department = new Department(depName, depPayDay, new Address(addressEmail, addressPhone));
		
		System.out.print("How many employees does the department have? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee "+(i+1)+" data:");
			System.out.print("Name: ");
			sc.nextLine();
			String empName = sc.nextLine();
			System.out.print("Salary: $ ");
			double empSalary = sc.nextDouble();
			
			department.addEmployee(new Employee(empName, empSalary));
		}
		
		showReport(department);

		sc.close();
	}
	
	private static void showReport(Department dept) {
		System.out.println("\n" + dept);
	}

}
