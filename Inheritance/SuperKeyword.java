
class AA{
	int i=10;
}
class BB extends AA{
	int i=20;
	public void m1() {
		System.out.println(super.i);
		System.out.println(i);
	}
}
class CC extends BB{
	int i=20;
	public void m2() {
		m1();
		System.out.println(i);
		System.out.println(super.i);
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		CC c = new CC();
		c.m2();
	}
}
