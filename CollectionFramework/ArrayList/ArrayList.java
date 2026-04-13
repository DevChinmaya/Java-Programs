
public class ArrayList {
    private Object arr[];
    private int p;
    public ArrayList(){
        arr=new Object[5];
        p=0;
    }
    public void add(Object e){
        if(p>=arr.length){

        }
        arr[p++]=e;
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
    public Object get(int index){
        if(index==-1 || index>=size()){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }
    public void add(int index,Object e){
        if(index==-1||index>=size()){
            throw new IndexOutOfBoundsException();
        }
        if(p>=size())increase();
        for(int i=size()-1; i>=index; i--){
            arr[i+1]=arr[i];
        }
        arr[index]=e;
    }
    public void remove(int index){
        if(index<=1 || index>=size()){
            throw new IndexOutOfBoundsException();
        }
        for(int i=index+1; i<size(); i++){
            arr[i-1]=arr[i];
        }
        p--;
        arr[p]=null;
    }
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(15);
        a.add(20);
        a.add(25);
        a.add(2,30);
        
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
        // System.out.println(a.get(2));
    }
}
