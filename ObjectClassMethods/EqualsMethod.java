
public class EqualsMethod{
    int i;
    int j;
    public EqualsMethod(int i,int j){
        this.i = i;
        this.j = j;
    }
    @Override
    public boolean equals(Object o){
        EqualsMethod a = (EqualsMethod)o;
        return this.i == a.i && this.j == a.j;
    }

    public static void main(String[] args) {
        EqualsMethod a1 = new EqualsMethod(10,20);
        EqualsMethod a2 = new EqualsMethod(10m=,20)
    }
}
