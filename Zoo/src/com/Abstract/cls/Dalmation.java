package com.Abstract.cls;

public class Dalmation extends Dog {

	@Override
	public void bark(int a, String name) {
		System.out.println(name+" is barking"+ a );
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void play(float f) {
		System.out.println(f+" Hours dogs are playing");

	}

}
