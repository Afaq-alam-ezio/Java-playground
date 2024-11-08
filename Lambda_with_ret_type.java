@FunctionalInterface
interface A4{

    int show(int i, int j);
}


public class Lambda_with_ret_type{

    public static void main(String args[]){

        // with visible return keyword
        A4 obj1 = (i, j) ->{

            return i +j;                     // when not returning in same line should mention return keyword

        };

        int result = obj1.show(5, 6);
        System.out.println(result);

        // with invisible return keyword
        A4 obj2 = (i, j) -> i+j;            // when returning in same line no need to mention return keyword

        result = obj2.show(2, 7);
        System.out.println(result);
    } 
}