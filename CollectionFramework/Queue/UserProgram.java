public class UserProgram {
    public static void main(String[] args) {
        QueueUsingArrayList a=new QueueUsingArrayList();
        a.push(10);
        a.push(15);
        a.push(20);
        a.push(25);     
        // while(!a.isEmpty()){
        //     System.out.println(a.poll());
        // }
        a.push(80);
        a.push(90);
        a.poll();
        a.push(222);
        System.out.println(a.peek());
    }
}
