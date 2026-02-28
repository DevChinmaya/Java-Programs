

class A1{
	int i=10;
	int j=20;
}
class B1 extends A1{
	int k = 15;
}
public class Test1{
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.i);
		System.out.println(a.j);
	}
}
