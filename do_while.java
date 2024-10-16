public class do_while
{
    public static void main(String args[])
    {
        int d = 1;
        do
        {
            System.out.println("Hello " + d);

            d++;
        }
        while(d > 10); // even at this false condition for d = 1 it runs for one time
    }    
}
