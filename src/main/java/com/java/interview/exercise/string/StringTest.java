package com.java.interview.exercise.string;

public class StringTest {

	public static void main(String[] args) {
		int num = 9;
		byte nuber = 0;
		String S1 = new String("Hello"); 
		String S2 = new String("Hello");
		String a = "Mena";
		String b = "Mena";
		nuber+=1;
		//nuber = nuber + 1;
		num+=3;
		System.out.println(nuber);
		System.out.println(num);
		a = "Eliana";
			System.out.println(S1==S2);
			System.out.println(S1.equals(S2));
		System.out.println(a + b);
		}


}
