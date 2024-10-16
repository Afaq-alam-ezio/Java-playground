public class arrays {
    
    public static void main(String args[]){

        // int x[4] = {1, 2, 3, 4}; // here we should never give array size for creating a static array, this was allowed in cpp
        int x[] = {1, 2, 3, 4}; // this is a static array created in heap where size is not defined thus looks like a bit dynamic

        int y[] = new int[4];   // here all 4 values of y is set to 0.

        // System.out.println("At index " + 0 + " value is " + x[0]);  // to print vales individually using indexes

        System.out.print("[ ");
        for(int i = 0; i < 4; i++)
        {
            // System.out.println("At index " + i + " value is " + x[i]);
            if(i <= 2)
                System.out.print(x[i] + ", ");
            else
                System.out.println(x[i] + " ]");
        }
        System.out.println("printing done!");
    }
}
