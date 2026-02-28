
public class C {
	int i;
	int j;
	
	C(int a, int b){
	  i=a;
	  j=b;
	}
	public static void main(String args[]) {
		C c1 = new C(10,20);
		C c2 = new C(30,40);
		System.out.println(c1.i+"\t"+c1.j);
		System.out.println(c2.i+"\t"+c2.j);
	}
	
}
