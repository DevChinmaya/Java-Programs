

public class B {
	B(int i){
		System.out.println("A(int i) const: "+i);
	}
	public static void main(String args[]) {
		//A a  = new A();//Compile time error because const has 1 parameter
		new B(10);
		new B(20);
		//new B(3.5);//Compile time error due to double datatype and const has int 
	}
}
