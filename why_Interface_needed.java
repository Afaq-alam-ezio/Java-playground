// abstract class Computer{
    
//     public abstract void code();
// } 


// Instead of using an abstract class above, below better use an interface, mostly useful for Method overriding and also for abstract methods
interface Computer{
    
    public abstract void code();
} 


class Desktop implements Computer{

    public void code(){

        System.out.println("Coded on Desktop");
    }       
}

class Laptop implements Computer{

    public void code(){

        System.out.println("Coded on laptop");
    }
}


class Developer{

    public void devapp(Computer machine){

        machine.code();
    }
}




class why_Interface_needed{

    public static void main(String args[]){

        Developer afaq = new Developer();

        Computer machine1 = new Laptop();          // New object for Laptop      
        Computer machine2 = new Desktop();         // New object for Desktop

        afaq.devapp(machine1);
        afaq.devapp(machine2);
    }
}