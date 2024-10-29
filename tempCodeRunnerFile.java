class This_keyword{

    private int x;
    
    // private string y = new string("Afaq");
    private String y;

    public This_keyword(){

        System.out.println("Inside constructor.");
        System.out.println("Roll = " + x + " and Name = " + y);

        x = 1;
        y = "Afaq";
        System.out.println("Roll = " + x + " and Name = " + y);
    }
}


public static void main(String args[]){
    
    This_keyword obj = new This_keyword();
}