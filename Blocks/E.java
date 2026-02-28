
public class E {
	int i;
	{
		System.out.println("Non-StaticBlock-1");
	}
	public static void main(String args[]) {
		System.out.println("Main Executed");
		new E();
		new E();
		System.out.println("Main Ends");
	}
	{
		System.out.println("Non-StaticBlock-2");
	}
	{
		System.out.println("Non-StaticBlock-3");
	}
	
}
