class Method{

    public int add(int x, int y){                   // method 1 
        return x+y;
    }

    public int add(int x, int y, int z){            // method 2 
        return x+y+z;
    }

    public void add(double x, int y){               // method 3
        System.out.println(x+y);
    }

        // below method will give errors
    // public double add(double x, int y){         // here in this case, if method name is same as any other method's name then  
    //     return x+y;                             // return_type of the two methods never matters, let it be same or different,  
    // }                                           // but the parameters they have must be different
}

public class Method_overloading {

    public static void main(String args[])
    {
        Method obj = new Method();

        System.out.println(obj.add(4, 5));

        System.out.println(obj.add(4, 5, 7));

        obj.add(14.212, 34);

    }
    
}
