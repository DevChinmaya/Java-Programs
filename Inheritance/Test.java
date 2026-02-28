

class A{
	int i=10;
}
class B extends A{
	int i =  0;
}
public class Test{
	public static void main(String[] args) {
		A a1 = new B();//Non static variable access depends on Reference type not on Object type
		System.out.println(a1.i);
	}
}
