class Myclass{

    private int x; 
    // private string y = new string("Afaq");
    private String y;

    // Constructor below
    public Myclass(){

        System.out.println("Inside constructor.");
        System.out.println("values not been modified :");
        System.out.println("Roll = " + x + " and Name = " + y);

        System.out.println("\nInside constructor.");
        System.out.println("After values been modified :");

        x = 1;
        y = "Afaq";

        System.out.println("Roll = " + x + " and Name = " + y);
    }
}

public class Keyword{

    public static void main(String args[]){
        
        Myclass obj = new Myclass();
    }
}