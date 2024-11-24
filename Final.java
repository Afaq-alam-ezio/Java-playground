class AA{

    final public void display(){

        System.out.println("Hello by AA");
    }
}

final class BB extends AA{

    // public void display(){                   here we can't perform method overriding as Above already display() is Declared as Final

    //     System.out.println("Hello by BB");
    // }
}

// class CC extends BB{                     we can't inherit BB as Its final i.e. Its inheritance mode is turned off (simply can say its private)

// } 


class Final{

    public static void main(String args[]){

        final int x = 10;
        // x = 25;          can't change the value as its now constant due to final keyword

        AA obj1 = new AA();
        obj1.display();
    }
}