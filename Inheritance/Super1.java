

class D{
	static int i= 10;
	public static void m1() {
		System.out.println("m1()-A");
	}
}

class E extends D{
	static int i= 20;
	public static void m2() {
		System.out.println(i);
		System.out.println(D.i);
		//System.out.println(super.i);//CTE
	}
}

public class Super1 {
	public static void main(String[] args) {
		E.m2();
	}
}
