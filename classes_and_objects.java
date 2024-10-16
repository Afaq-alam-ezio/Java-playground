class Harry
{
    int x = -5;

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int x_val()
    {
        return x > 2 ? x : -1;
    }
}


public class classes_and_objects
{
    public static void main(String args[])
    {
        int x = 10, y = 15;
        Harry obj = new Harry();

        System.out.println("The addition is = " + obj.add(x, y));
        System.out.println("The value at x inside class is = " + obj.x_val());

    }        
}
