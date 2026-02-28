

public class Test1 {
	final static int a=12;
	final int b;
	//final int c;//CTE due to Blank final fields
	public Test1(int b) {
		this.b=b;
	}
	public static void main(String[] args) {
		final int i=20;
		//i=20; CTE because final var can't be reinitialized
		System.out.println(i);
		Test1 t=new Test1(30);
		System.out.println(t.b);
		//t.b=300;//CTE because final var can't be reinitialized
		Test1 t1=new Test1(40);
		System.out.println(t1.b);
		
	}
}
