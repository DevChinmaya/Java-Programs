

public class A {
	int i;
	int j;
	A(){
		System.out.println("A()-cons");
	}
	A(int i){
		this.i=i;
	}
	A(int i,int j){
		this.i=i;
		this.j=j;
	}
	public static void main(String args[]) {
		A a = new A();
		System.out.println(a.i + "\t" + a.j);
		A a1 = new A(10);
		System.out.println(a1.i + "\t" + a1.j);
		A a2 = new A(10,20);
		System.out.println(a2.i + "\t" + a2.j);
	}
}
