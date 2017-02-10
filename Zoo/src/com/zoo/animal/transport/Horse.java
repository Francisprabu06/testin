package com.zoo.animal.transport;

public class Horse {
	int num = 1;
	String name = "Horse";
	int age = 10;

	public Horse() {
		
		System.out.println("Default Constructor");
	}

	public Horse(int n, String s1) {
		
		System.out.println("Parameterized Constructor");
		num = n;
		name = s1;
	}

	public Horse(int n, String s1, int a) {
		age = a;
	}

	public int show() {
		System.out.println(num + " " + name + " " + age);
		return num;
	}

	public String show1() {

		return name;
	}

	public static void main(String args[]) {
		Horse obj = new Horse();
		Horse obj1 = new Horse(4,"aefdeaf");
		obj.show();
		int x = obj.show();
		String y = obj.show1();
		System.out.println(x);
		System.out.println(y);
	}
}