public class LinkedList {
    Node head;
    int count=0;
    public void add(Object ele){
        Node n=new Node(ele);
        if(head==null){
            head=n;
            count++;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=n;
        count++;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.ele);
            curr=curr.next;
        }
    }
    public Object get(int index){
        Node curr=head;
        int count=0;
        if(index==0)return head;
        while(curr!=null){
            if(count==index){
                return curr.ele;
            }
            count++;
            curr=curr.next;
        }
        return 0;
    }
}
