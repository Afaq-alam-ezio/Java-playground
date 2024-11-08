import Calculator.*;

public class Calculator{

    public static void main(String args[]){

        Calcu obj1 = new Calcu();
        int x = obj1.add(20, 3);
        int y = obj1.sub(20, 3);

        System.out.println("For Basic calc :\nAddition is = " + x + "\nSubtarction is = " + y);

        AdvCalc obj2 = new AdvCalc();
        int a = obj2.add(15, 5);     
        int b = obj2.sub(15, 5);
        int c = obj2.mul(15, 5);
        int d = obj2.div(15, 5);
        
        System.out.println("\nFor Adavnced calc :\nAddition is = " + a + "\nSubtarction is = " + b);
        System.out.println("Multiplication is = " + c + "\nDivision is = " + d);

        VeryAdvCalc obj3 = new VeryAdvCalc();
        int e = obj3.power(3, 2);
        System.out.println("\nFor Very Adavnced calc :\nPower is = " + e); 
    }
}