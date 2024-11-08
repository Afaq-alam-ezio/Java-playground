class Anony{

    public void display(){

        System.out.println("Hello");
    } 
}


class Anony_class{

    public static void main(String args[]){

        Anony obj = new Anony()                         /*Here new anonymous inner class is created, Also here, this function body written after Anony() is the anonymous class */
        {
            public void display(){

                System.out.println("Hello world");
            } 
        };

        obj.display();
    }
}