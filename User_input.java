import java.util.Scanner;

public class User_input{

    public static void main(String args[]){

        System.out.print("Enter a number : ");

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        System.out.println("Number entered is : " + x);

        s.close();
    }
}