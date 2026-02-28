

public class Student {
	String name;
	int age;
	int id;
	
	public Student() {
		
	}
	
	Student(String name){
		this.name=name;
	}
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	Student(String name,int age,int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public void display() {
		System.out.println(name + "\n" + age + "\n" + id);
	}
	public static void main(String args[]) {
		Student s1 = new Student("Prem");
		s1.display();
		Student s2 = new Student("Prem",21);
		s2.display();
		Student s3 = new Student("Prem",21,1);
		s3.display();
		
	}
}
