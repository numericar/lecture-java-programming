package Arrays;

public class TwoDimensionPractic {
    public static void main(String[] args) {
        // int[][] a = new int[2][5];
        int[][] b = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10} };
        
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int[] numbers : b) {
            for (int number : numbers) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
