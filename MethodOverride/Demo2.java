
class AA{
	public void m1() {
		System.out.println("m1() AA");
	}
}

class BB extends AA{
	public void m2() {
		System.out.println("m2() BB");
	}
}

class CC extends BB{
	@Override
	public void m1() {
		System.out.println("m1() CC");
	}
	@Override
	public void m2() {
		System.out.println("m2() CC");
	}
}

public class Demo2 {
	public static void main(String[] args) {
		CC c = new CC();
		c.m1();
		c.m2();
	}
}
