

import java.util.Arrays;

class AB {
	
	public static void m1(int i) {
		System.out.println("m1(int i):"+i);
	}
	
	public static void m2(int b,int... a) {
		System.out.println("m2(int... a) is executed"+Arrays.toString(a));
	}
	
    public static void main(String[] args) {
    	//m1(10,20);
    	m1(10);
    	m2(1);
    	m2(10);
    	m2(20,30,40);
    	m2(50,60);
    	m2(70,80,90,100);
    	
    }
}
