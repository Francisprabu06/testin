package com.Abstract.cls;

public class Puppy extends Dalmation {
	public void fight(int a) {
		System.out.println(a+" Dogs are fighting" );
	}

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.bark(3, "Rocky");
		p.fight(2);
		p.play(1.45f);

	}
}