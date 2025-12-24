public class SpiralPrint {
    public static void main(String[] args) {
        int n = 5;
        int[][] spiral = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // left → right
            for (int i = left; i <= right; i++) 
                spiral[top][i] = num++;
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) 
                spiral[i][right] = num++;
            right--;

            // right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) 
                    spiral[bottom][i] = num++;
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) 
                    spiral[i][left] = num++;
                left++;
            }
        }

        // Print
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(spiral[i][j]+" ");
            }
            System.err.println();
        }
    }
}
