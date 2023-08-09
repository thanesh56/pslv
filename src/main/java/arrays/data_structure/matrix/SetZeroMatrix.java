package arrays.data_structure.matrix;

class SetZeroMatrix {
    public static void main(String[] args) {
        System.out.println("Hello World");

        SetZeroMatrix setZeroMatrix = new SetZeroMatrix();
        //int[][] matrix = {{1, 1, 1}, {1, 0, 0}, {1, 0, 1}};
        //int[][] matrix = {{1,1,1},{1,0,0},{1,1,1}};
        //int[][] matrix = {{1,1,1},{1,0,1},{1,0,1}};
        //int[][] matrix = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 1, 1}};
        //int[][] matrix = {{1, 1, 1, 1}, {1, 0, 1, 0}, {1, 1, 1, 1}};
        //int[][] matrix = {{0, 1, 1, 1}, {1, 0, 1, 0}, {1, 1, 1, 1}};
        //int[][] matrix = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 1, 0}};
        //int[][] matrix = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 1, 0}, {1, 0, 1, 1}, {1, 1, 1, 1}};
        int[][] matrix = {{1, 1, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 0}, {1, 0, 1, 1}, {1, 1, 0, 1}};

        setZeroMatrix.bruteForce(matrix);
        //setZeroMatrix.better(matrix);
        //setZeroMatrix.optimal(matrix);

        setZeroMatrix.displayMatrix(matrix);
    }

    //First approach
    public void bruteForce(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(i, m, matrix);
                    markCol(j, n, matrix);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void markRow(int i, int m, int[][] matrix) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    private void markCol(int j, int n, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }


    // Second approach
    public void better(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] arrN = new int[n];
        int[] arrM = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    arrN[i] = 1;
                    arrM[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arrN[i] == 1 || arrM[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Third Approach
    public void optimal(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // int col[m] = {0}; -> matrix[0][...]
        // int col[n] = {0}; -> matrix[...][0]
        int col0 = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // mark the i-th row
                    matrix[i][0] = 0;

                    // mark the j-th row
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // skip first row and column, and fill zero for remaining rows & columns based on  condition
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                // check for col & row
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // fill first row based on condition
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // fill first column based on condition
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    private void displayMatrix(int[][] matrix) {
        //print the matrix
        for (int[] rows : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(rows[j] + " ");
            }
            System.out.println();
        }
    }
}



