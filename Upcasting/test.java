package com.Upcasting;

class Animal{
	public void eat() {
		System.out.println("Animal eats");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Dog barks");
	}
}
class BabyDog extends Dog{
	public void weeping() {
		System.out.println("BabyDog weeps");
	}
}
public class test {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eat();
	}
}
