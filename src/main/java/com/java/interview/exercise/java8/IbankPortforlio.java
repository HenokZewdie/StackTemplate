package com.java.interview.exercise.java8;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IbankPortforlio {

	public static void main(String[] args) {
		List<String> accountStatusICMS = Arrays.asList("Open", "Active", "Active9", "Pending", "DRE");
		System.out.println("Enter AccoutnStatus");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		List<String> test = accountStatusICMS.stream().sorted().collect(Collectors.toList());
		System.out.println(test);
		Collections.sort(accountStatusICMS);
		System.out.println(accountStatusICMS);
		if(accountStatusICMS.stream().anyMatch(a->a.equalsIgnoreCase(value))){
			System.out.println("Available");
		}else{
			System.out.println("No Available");
		}
		
		scanner.close();
	}
	
	
}
