public class HashSet {
    Node[] a=new Node[10];
    int count=0;
    public boolean add(Object ele){
        Node n=new Node(ele);
        int index=Math.abs(ele.hashCode()%a.length);//Hashing
        if(a[index]==null){
            a[index]=n;
            count++;
            return true;
        }
        Node temp=null;
        Node curr=a[index];
        while(curr!=null){
            if(curr.ele.equals(ele)){
                return false;
            }
            temp=curr;
            curr=curr.next;
        }
        temp.next=n;
        count++;
        return true;
    }
    public void remove(Object ele){
        Node n=new Node(ele);
        int index=Math.abs(ele.hashCode()%a.length);
        Node curr=a[index];
        if(curr.ele.equals(ele)){
            a[index]=curr.next;
            count--;
        }
        while(curr.next!=null){
            if(curr.next.next == null){
                Node temp=curr.next;
                curr.next=null;
                temp=null;
                count--;
            }
            else if(curr.next.ele.equals(ele)){
                Node temp=curr.next;
                curr.next=curr.next.next;
                temp.next=null;
                count--;
            }else{
                curr=curr.next;
            }
        }
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public boolean contains(Object ele){
        Node n=new Node(ele);
        int index=Math.abs(ele.hashCode()%a.length);//Hashing
        if(a[index]==null){
            return false;
        }
        Node curr=a[index];
        while(curr!=null){
            if(curr.ele.equals(ele)){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
    
    public void display(){
        for(int i=0; i<a.length; i++){
            Node curr=a[i];
            while(curr!=null){
                System.out.println(curr.ele);
                curr=curr.next;
            }
        }
    }
}
