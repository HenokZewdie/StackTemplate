package com.java.interview.exercise.string;

public class StringTest {

	public static void main(String[] args) {
		SingletonExample se = SingletonExample.getSingletonExample();
		se.setNum("TEST");
		System.out.println(se.getNum());
		SingletonExample se2 = SingletonExample.getSingletonExample();
		System.out.println(se2.getNum()); //Will Print TEST from the previous object
		int num = 9;
		byte nuber = 0;
		String S1 = new String("Hello"); 
		String S2 = new String("Hello");
		String a = "Menas";
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
