
public class G {
	static {
		new G();
		System.out.println("Static Block-1");
	}
	{
		System.out.println("Non-Static Block-1");
	}
	public static void main(String args[]) {
		System.out.println("Main Starts");
		new G();
		System.out.println("Main Ends");
	}
	static {
		System.out.println("Static Block-2");
	}
	{
		System.out.println("Non-Static Block-2");
	}
}
