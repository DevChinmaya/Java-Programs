public class Main{
    public static void main(String[] args) {
        Address a = new Address("London");
        Student s1 = new Student("John", new Address("New York"));
        Student s2 = (Student)s1.clone();
        s2.address.city = "Los Angeles";
        System.out.println(s1.name+" "+s1.address.city);
    }
}
class Student implements Cloneable {
    Address address;
    String name;
    Student(String name,Address address){
        this.name = name;
        this.address = address;
    }
    @Override
    public Student clone() throws CloneNotSupportedException{
        Student s = (Student)super.clone();
        s.address = new Address(this.address.city);
        return s;
    }
}
class Address{
    String city;
    Address(String city){
        this.city = city;
    }
}