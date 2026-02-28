
public class A {
	int i;
	int j;
	A(){
		
	}
	A(int i,int j){
		this.i= i;
		this.j= j;
	}
	A(A a){
		this.i=a.i;
		this.j=a.j;
	}
	public static void main(String[] args) {
		A a = new A(10,20);
		A a1 = new A(a);
		A a2 = new A(a1);
		System.out.println(a.i + "\t" + a.j);
		System.out.println(a1.i + "\t" + a1.j);
		System.out.println(a2.i + "\t" + a2.j);
	}
}
