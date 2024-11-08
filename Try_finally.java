import java.util.Scanner;

public class Try_finally{

    public static void main(String args[]){

        System.out.print("Enter number to divide 10 with : ");
        Scanner sv = new Scanner(System.in);
        int x =  sv.nextInt();

        try{

            System.out.println("Quotient is : " + 10/x);
        }
        catch(ArithmeticException e){

            System.out.println("Can't divide by zero : " + e);
        }
        finally{

            System.out.println("This is finally block being executed whether there's any exception or not");
            sv.close();
        }
    }
}