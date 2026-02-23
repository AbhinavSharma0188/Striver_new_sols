public class q82_SetMatrixZeroes {
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};

        int m = arr.length;
        int n = arr[0].length;
        
        boolean zeroRow = false;
        boolean zeroCol = false;
        
        // Check if first row needs to be zeroed
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                zeroRow = true;
                break;
            }
        }
        
        // Check if first column needs to be zeroed
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                zeroCol = true;
                break;
            }
        }
        
        // Mark rows and columns using first row and column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        
        // Zero out marked rows
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        
        // Zero out marked columns
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                  arr[i][j] = 0;
                }
            }
        }
        
        // Zero first row if needed
        if (zeroRow) {
            for (int j = 0; j < n; j++) {
              arr[0][j] = 0;
            }
        }
        
        // Zero first column if needed
        if (zeroCol) {
            for (int i = 0; i < m; i++) {
               arr[i][0] = 0;
            }
        }
     
        
        }}