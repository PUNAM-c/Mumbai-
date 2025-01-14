public class trainglestarPattern {
    public static void main(String[] args) {
        // Define the number of rows
        int rows = 5;

        System.out.println("Triangle Star Pattern:");

        // Generate the triangle star pattern
        for (int i = 1; i <= rows; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
