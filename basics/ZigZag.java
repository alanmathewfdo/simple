public class ZigZag {

    public static void printW(int n) {

        for (int row = n - 1; row >= 0; row--) {   

            for (int col = 0; col < 6 * n - 3; col++) {

                if (col == row ||
                    col == (2 * n - 2) - row ||
                    col == (2 * n - 2) + row ||
                    col == (4 * n - 4) - row ||
                    col == (4 * n - 4) + row ||
                    col == (6 * n - 6) - row)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printW(7);  
    }
}

