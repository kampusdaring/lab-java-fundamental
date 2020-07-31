package edu.kampusdaring.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleApp {
	public static void main(String[] args) {
		List<Integer> postCodes = Arrays.asList(10001, 10002, 10003, 10001);
		System.out.println(postCodes.size());
		for (Integer postCode : postCodes) {
			System.out.println(postCode);
		}

		System.out.println("--------");
		Set<Integer> uniquePostCodes = new HashSet<>();
		uniquePostCodes.addAll(postCodes);
		for (Integer postCode : uniquePostCodes) {
			System.out.println(postCode);
		}


		System.out.println("--------");
		System.out.println(postCodes.get(2));
		
	}
}
