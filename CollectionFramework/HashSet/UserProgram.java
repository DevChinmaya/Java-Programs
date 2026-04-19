
public class UserProgram {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("Rama");
        h.add("Sita");
        h.add("Radha");
        h.add("Krishna");
        h.add("Shiva");
        h.add("Parvati");
        h.add("Ramesh");
        h.display();
    
        System.out.println(h.size());
        System.out.println("===================");
        System.out.println(h.contains("Shiva"));
        System.out.println(h.contains("Arjun"));
        System.out.println("===================");
        h.remove("Ramesh");
        h.remove("Radha");
        h.remove("Parvati");
        h.display();
        System.out.println(h.size());
        System.out.println("===================");
        h.remove("Shiva");
        h.remove("Sita");
        h.remove("Rama");
        h.display();
        System.out.println(h.size());
        System.out.println("===================");
        h.remove("Krishna");
        System.out.println(h.size());
        h.display();
    }
}
