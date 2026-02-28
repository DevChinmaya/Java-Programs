
class D{
	{
		System.out.println("NonStatic Block 1-D");
	}
	D(){
		System.out.println("D() cons");
	}
	{
		System.out.println("NonStatic Block 2-D");
	}
}
class E extends D{
	{
		System.out.println("NonStatic Block 1-E");
	}
	E(){
		System.out.println("E() cons");
	}
	{
		System.out.println("NonStatic Block 2-E");
	}
}
public class Demo3 {
	public static void main(String[] args) {
		new E();
	}
}
