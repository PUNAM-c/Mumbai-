public class reverseStarPattern {
    public static void main(String[] args) {
     
        int rows = 5;

        System.out.println("Reversed Triangle Star Pattern:");

  
        for (int i = rows; i >= 1; i--) {
       
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
