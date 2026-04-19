public class DLLUserProgram {
    public static void main(String[] args) {
        DoubleLinkedList d=new DoubleLinkedList();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);
        d.add(60);
        System.out.println(d.contains(25));
    }
}
