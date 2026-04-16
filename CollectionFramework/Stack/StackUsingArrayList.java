public class StackUsingArrayList {
    private Object arr[];
    private int p;
    public StackUsingArrayList(){
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
        return arr[size()-1];
    }
    public void push(Object e){
        if(p>=arr.length)increase();
        arr[p++]=e;
    }
    public Object pop(){
        Object ele=arr[p-1];
        arr[p]=null;
        p--;
        return ele;
    }
}
