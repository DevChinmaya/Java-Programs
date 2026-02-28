
public class B {
	B(){
		System.out.println("A()-cons :");
	}
	B(int i){
		this();
		System.out.println("A(int i)-cons :"+i);
	}
	B(int i,int j){
		this(30);
		System.out.println("A(int i,int j)-cons :"+i+","+j);
	}
	public static void main(String args[]) {
		B a = new B(12,34);
	}
}
