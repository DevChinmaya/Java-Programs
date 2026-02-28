
public class Student1 {
	String name;
	int age;
	int id;
	
	public Student1() {
		
	}
	
	Student1(String name){
		this.name=name;
	}
	Student1(String name,int age){
		this(name);
		this.age=age;
	}
	Student1(String name,int age,int id){
		this(name,age);
		this.id=id;
	}
	public void display() {
		System.out.println(name + "\n" + age + "\n" + id);
	}
	public static void main(String args[]) {
		Student s = new Student("Prem",21,1);
		s.display();
		
	}
}
