package matrix;

public class MatrixOperation {

    public static double[][] basicMultiplicationAlgorithm(
            double[][] firstMatrix, double[][] secondMatrix)
            throws InvalidMatrixSizeForMultiplicationException {
        int numberOfRowInFirstMatrix = firstMatrix.length;
        int numberOfColumnInFirstMatrix = firstMatrix[0].length;


        int numberOfRowInSecondMatrix = secondMatrix.length;
        int numberOfColumnInSecondMatrix = secondMatrix[0].length;

        if (numberOfColumnInFirstMatrix != numberOfRowInSecondMatrix) {
            throw new InvalidMatrixSizeForMultiplicationException();
        }
        double[][] matrixResult =
                new double[numberOfRowInFirstMatrix][numberOfColumnInSecondMatrix];

        for (int row = 0; row < numberOfRowInFirstMatrix; row++) {
            double[] rowWantToMultiplied = firstMatrix[row];
            for (int column = 0; column < numberOfColumnInSecondMatrix; column++) {
                double[] columnWantToMultiplied =
                        new double[numberOfColumnInSecondMatrix];
                for (int rowInSecondMatrix = 0; rowInSecondMatrix
                        < numberOfRowInSecondMatrix; rowInSecondMatrix++) {
                    columnWantToMultiplied[rowInSecondMatrix] =
                            secondMatrix[rowInSecondMatrix][column];
                }
                for (int sameIndex = 0; sameIndex < numberOfColumnInFirstMatrix; sameIndex++) {
                    matrixResult[row][column] =
                            matrixResult[row][column] + rowWantToMultiplied[sameIndex]
                                    * columnWantToMultiplied[sameIndex];
                }
            }
        }
        return matrixResult;
    }

    /**
     * Redesign version of Strassen Algoritmh that enable it to do matrix multiplication
     * for any positive integer orde.
     * @param a first matrix with n x n orde
     * @param b second matrix with m x m orde, and n = m
     * @return the result of matrix multiplication
     */
    public static double[][] strassenMatrixMultiForNonSquareMatrix(double[][] a, double[][] b) {
        int newLengtha = StrassensAlgorithm.powerMatrix(a.length);
        int newLengthb = StrassensAlgorithm.powerMatrix(b.length);

        double[][] newa = new double[newLengtha][newLengtha];
        double[][] newb = new double[newLengthb][newLengthb];
        double[][] cret = new double[a.length][a.length];
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a.length; y++) {
                newa[x][y] = a[x][y];
            }
        }

        for (int x = 0; x < b.length; x++) {
            for (int y = 0; y < b.length; y++) {
                newb[x][y] = b[x][y];
            }
        }
        double[][] c = StrassensAlgorithm.strassenMultiplicationAlgorithm(newa, newb);
        for (int x = 0; x < cret.length; x++) {
            for (int y = 0; y < cret.length; y++) {
                cret[x][y] = c[x][y];
            }
        }
        return cret;
    }
}