public class multi_dim_arrays {
    
    public static void main(String args[]){

        int x[][] = new int[3][3];

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                x[i][j] = (int)(Math.random()*10);    // Math library is used here , In Python we used Random library and then Random.randint() if you remember.
            }
        }


        // normal loop to print array elements
        System.out.println("Normal loop used below : ");
        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(x[i][j] + " ");
            }
            System.out.println("");  // for new line
        }

        // Advanced loop to print the array
        System.out.println("\nAdvanced loop used below : ");
        for(int i[] : x){

            for(int j : i){

                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
