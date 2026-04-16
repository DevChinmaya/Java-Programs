
public class QueueUsingArrayList {
    private Object arr[];
    private int p;
    private int first=0;
    public QueueUsingArrayList(){
        arr=new Object[5];
        p=0;
    }
    public void increase(){
        Object[] temp=new Object[arr.length+3];
        for(int i=0; i<arr.length; i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }
    public int size(){
        return p;
    }
    public boolean isEmpty(){
        return p==0;
    }
    public Object peek(){
        return arr[0];
    }
    public void push(Object e){
        if(p>=arr.length)increase();
        arr[p++]=e;
    }
    public Object poll(){
        Object ele=arr[first];
        arr[first++]=null;
        p--;
        return ele;
    }
}
