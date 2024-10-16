public class switch_new
{
    public static void main(String args[]) // break is not used here instead we used "->" and "yield"
    {
        int x = 2;

        // switch(x)  // for -> operator
        int s = switch(x)  // for yield where assignment is done
        {
            // case 1 -> System.out.println("monday");
            case 1 : 
                yield 2+2;
                // System.out.println("hello");        yield is used avove , so don't use any other statements  

            // case 2 -> System.out.println("tuesday");
            case 2 : yield 3+3;

            // case 3 -> System.out.println("wednesday");
            case 3 : yield 4*4;

            // default -> System.out.println("sunday");
            default : yield 4*4;
        };

        System.out.println(s);
    }
}
