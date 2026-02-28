package com.Upcasting;


class A{
	int i=10;
}
class B extends A{
	int j=20;
}

public class test1 {
	public static void main(String[] args) {
		A a = new B();//B class object created with A reference
		System.out.println(a.i);
		//System.out.println(a.j);//CTE because parent class can't access child class data members
	}
}
