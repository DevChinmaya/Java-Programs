

public class Mobile {
	String name;
	int ram;
	int rom;
	String color;
	
	Mobile(){
		
	}
	Mobile(String name,int ram,int rom,String color){
		this.name=name;
		this.ram=ram;
		this.rom=rom;
		this.color=color;
	}
	Mobile(Mobile m){
		this.name = m.name;
		this.ram = m.ram;
		this.rom = m.rom;
		this.color=m.color;
	}
	public static void main(String[] args) {
		Mobile m = new Mobile("Macbook",32,512,"Pink");
		Mobile m1 = new Mobile(m);
		System.out.println(m1.name + "\t" + m1.ram + "\t" + m1.rom + "\t"+m1.color);
	}
}
