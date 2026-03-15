class AA {
    void show() {
        System.out.println("A show");
    }
}

class BB extends AA {
    void display() {
        System.out.println("B display");
    }
}

public class Test {
    public static void main(String[] args) {

        AA obj = new BB();
        obj.display();

    }
}