package com.Abstract.cls;

public class Kitten extends Cat {
	public void play(int a){
		System.out.println(a+" Cats are playing");
	}
	public void meow(int b,String name){
		System.out.println(b + " Cat name is "+ name);
	}
public static void main (String [] args){
	Kitten k =new Kitten();
	k.play(6);
	k.play(5);
	k.meow(3, "tommy");
}
}
