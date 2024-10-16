public class ternary_operator
{
    public static void main(String args[])
    {
        int x = 10;
        int y = 62;

        // if(x > y)  this is okay but see below in line 18
        // {
        //     System.out.println("Yes");
        // }
        // else
        // {
        //     System.out.println("No");
        // }


        System.out.println(x > y? "yes" : "no"); // YAAY! just did in one single line
    
    }
       
}
