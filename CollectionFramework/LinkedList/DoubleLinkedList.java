public class DoubleLinkedList {
    Node head;
    Node tail;
    int count=0;
    public void add(Object e){
        Node n=new Node(e);
        if(head==null){
            head=n;
            count++;
            tail=head;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=n;
        n.prev=curr;
        tail=n;
        count++;
    }
    public int size(){
        return (count);
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void addFirst(Object ele){
        Node n=new Node(ele);
        n.next=head;
        head.prev=n;
        head=n;
        count++;
    }
    public void get(int index){
        if(index<0 || index>=size()){
            throw new IndexOutOfBoundsException();
        }
        Node curr=head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        System.out.println(curr.ele);
    }
    public void addLast(Object ele){
        Node n=new Node(ele);
        tail.next=n;
        n.prev=tail;
        tail=n;
        count++;
    }
    public void add(Object ele,int index){
        if(index<0 || index>size())
            throw new IndexOutOfBoundsException();
        if(index==0){
            addFirst(ele);
            return;
        }
        if(index==size()){
            addLast(ele);
            return;
        }
        Node n=new Node(ele);
        Node curr=head;
        for(int i=0; i<index; i++){
            curr=curr.next;
        }
        curr.next.prev=n;
        n.prev=curr;
        curr.next = n;
        count++;
    }
    public boolean contains(Object ele){
        Node curr=new Node(ele);
        for(int i=0; i<size()-1; i++){
            if(curr.ele.equals(ele)){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
}