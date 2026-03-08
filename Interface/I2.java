public class I2 {
    public static void main(String[] args) {
        
    }
}

interface X{
    void m1();
}

interface Y{
    void m2();
}
class Z{
    public void m2(){
        System.out.println("m2()-A");
    }
}
class K extends Z implements X,Y{
    ////Here,it is not overriding all the abstract methods directly but still it doesnot throw error because Z class also has 
    // a m2() which is inherited to K during class loading time.So,when it finds that m2() is already there then it doesnt 
    // force to override it.
    @Override
    public void m1(){
        System.out.println("K");
    }
}
