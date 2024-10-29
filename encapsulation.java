class Encap {       // basically to access the instance variables that are private here, we require class methods

    private int x;
    private int y;

    public void set() {

        x = 10;
        y = 25;
    }

    public void get() {

        System.out.println("Value at x = " + x);
        System.out.println("Value at y = " + y);
    }
}


public class encapsulation {
    
    public static void main(String args[]) {

        Encap obj1 = new Encap();

        obj1.set();  // used to set the instance variables
        obj1.get();  // use to fetch the instance variables
    }
}
