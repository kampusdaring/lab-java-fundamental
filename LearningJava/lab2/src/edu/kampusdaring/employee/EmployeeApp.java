package edu.kampusdaring.employee;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		
//		salaryNegotiation();
		
	}

	private static void salaryNegotiation() {
		//input salary 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your salary : ");
		double salary = scanner.nextDouble();
		
		
		//define base salary
		double maxSalary = 500.0;
		
		//check salary 
		boolean exceedBudget = salary > maxSalary;
		
		//output
		if(exceedBudget) {
			System.out.println("Sorry, you don't get the job");
		} else {
			System.out.println("Congratulations, you got the job :)");
		}
	}

}
