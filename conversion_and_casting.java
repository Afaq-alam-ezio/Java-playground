public class conversion_and_casting
{
    public static void main(String args[])
    {
        int i = 15;
        byte b = (byte)i;

        i = b;

        double d = 40.45;
        float f = 56.32f;
        
        // d = f;        // implicit conversion
        f = (float)d;   // explicit conversion


        System.out.println(b);
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
    }
    
}
