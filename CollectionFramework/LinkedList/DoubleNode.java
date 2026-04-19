public class DoubleNode {
    Object ele;
    Node next;
    Node prev;
    DoubleNode(Object ele){
        this.ele=ele;
    }
    public DoubleNode(Object ele,Node next,Node prev){
        this.ele=ele;
        this.next=next;
        this.prev=prev;
    }
}


