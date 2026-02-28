

class P{
	P(){
		System.out.println("P() cons");
	}
}

class C extends P{
	C(){
		super();
		System.out.println("C() cons");
	}
}
class G extends C{
	G(){
		super();
		System.out.println("G() cons");
	}
}

public class Super3 {
	public static void main(String[] args) {
		new G();
	}
}

