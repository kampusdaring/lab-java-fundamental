package edu.kampusdaring.simple;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		// inputkan nama pegawai
		System.out.println("Please enter employee name : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		// inputkan umur
		System.out.println("Please enter employee age : ");
		scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		// inputkan gaji
		System.out.println("Please enter employe salary : ");
		scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		// inputkan title pegawai
		System.out.println("Please enter employe role : ");
		scanner = new Scanner(System.in);
		String role = scanner.nextLine();
		
		// print nama pegawai, umur, gaji, title pegawai

		// output : Employee Mr X, 29 years old, Senior Supervisor, 1950000
		System.out.println(String.format("%s, %d years old, %s, IDR %s", name, age, role, String.valueOf(salary)));
		
	}

}
