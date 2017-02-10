package com.zoo.animal.food;

public class Elephant {
	int id;
	String name;
	int age;
	double size;
	int weight;

	Elephant() {
		System.out.println("This is a Elephant");
	}

	void show() {

	}

	Elephant(int i, String str) {
		id = i;
		name = str;
	}

	Elephant(int i, String str, int i1) {
		id = i;
		name = str;
		age = i1;
	}

	Elephant(int i, String str, int i1, double f1, int i2) {
		id = i;
		name = str;
		age = i1;
		size = f1;
		weight = i2;
	}

	public void display() {
		System.out.println("id no:"+id +" " +"name:"+name+" "+"age:"+age+" "+ "size:"+size+" " +"weight:"+weight);
	}

	public static void main(String args[]) {
		Elephant e0 = new Elephant();
		Elephant e1 = new Elephant(1, "ramu");
		Elephant e2 = new Elephant(1, "ramu", 15);
		Elephant e3 = new Elephant(1, "ramu", 15, 12.23, 3000);
		e0.show();
		e1.display();
		e2.display();
		e3.display();

	}
}