
public class F {
	static int i;
	int j;
	{
		i=10;
		j=20;
	}
	public static void main(String args[]) {
		System.out.println("Main Executed");
		System.out.println(i);
		F f = new F();
		System.out.println(f.i);
		System.out.println(f.j);
		System.out.println("Main Ends");
	}
	{
		i=30;
		j=40;
	}
	
}
