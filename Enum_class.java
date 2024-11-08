enum Laptop1{

    mac(500), inspiron(200), zephrus;       // objects created, but we need a price variable to store price,
                                                //  also mac and inspiron needs a seperate parameterised const. and zephrus a seperate default const.
    private int price;

    private Laptop1(){                     // default const.
        price = 1500;
    }

    private Laptop1(int x){             // Parameterised const.
        price = x;
    }

    public void get_price(){

        System.out.println("Laptop model : " + this.name() + " and price = " + price);      // this.name() returns the current object name
    }

    public int return_price_only(){

        return price;
    }
}


public class Enum_class{

    public static void main(String args[]){

        // Laptop1 obj = Laptop1.mac;

        // obj.get_price();

        // for(Laptop1 x : Laptop1 y[] = Laptop1.values())      can't assign or delete array declaration in loop's condition line

        for(Laptop1 x : Laptop1.values()){

            System.out.println("Laptop model : " + x.name() + " and price is : " + x.return_price_only());
        }

    }
}