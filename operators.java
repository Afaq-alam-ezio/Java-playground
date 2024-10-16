public class operators
{
    public static void main(String args[])
    {
        int x = 10;
        int y = 25;



        System.out.println(x);
        System.out.println(y);

        System.out.println(x = x + 2);            
        System.out.println(x += 2);            
        System.out.println(x++);
        System.out.println(++x);

        System.out.println(y = y + 1);
        System.out.println(y += 2);
        System.out.println(y++);
        System.out.println((++y) + "\n");

        int num = 10;

        // num = ++num;
        num = num++;

        System.out.println(num);
        System.out.println(num);
    } 
}
