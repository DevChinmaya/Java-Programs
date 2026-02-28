

class FF{
	static {
		System.out.println("Static block F");
	}
}
class EE extends FF{
	static int i=10;
	static {
		System.out.println("Static block E");
	}
}

public class Super2 {
	static {
		System.out.println(EE.i);
		System.out.println("Static block Demo");
	}
	public static void main(String[] args) {
		System.out.println("Main starts");
		System.out.println("Main ends");
	}
}
