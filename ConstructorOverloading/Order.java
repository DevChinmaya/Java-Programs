
public class Order {
	{
		System.out.println("Non-static-Block");
	}
	static{
		System.out.println("Static-Block");
	}
	Order(){
		System.out.println("Const");
	}
	public static void main(String args[]) {
		System.out.println("Main starts");
		Order o = new Order();
		
		System.out.println("Main ends");
	}
}
