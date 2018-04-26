package matrix;

public class StrassensAlgorithm {


    /**
     * Strassen Algorithm is 2 square matrix multiplication
     * algotithm with matrix orde is a power of 2.
     * @param a first matrix with n x n orde
     * @param b second matrix with m x m orde, and n = m
     * @return the result of matrix multiplication
     */

    protected static double[][] strassenMultiplicationAlgorithm(double[][] a, double[][] b) {
        int n = a.length;

        double[][] c = new double[n][n];
        if (n == 1) {
            c[0][0] = a[0][0] * b[0][0];
        } else {


            double[][] a11 = new double[n / 2][n / 2];
            double[][] a12 = new double[n / 2][n / 2];
            double[][] a21 = new double[n / 2][n / 2];
            double[][] a22 = new double[n / 2][n / 2];

            double[][] b11 = new double[n / 2][n / 2];
            double[][] b12 = new double[n / 2][n / 2];
            double[][] b21 = new double[n / 2][n / 2];
            double[][] b22 = new double[n / 2][n / 2];


            for (int start = 0; start < n / 2; start++) {
                System.arraycopy(a[start], 0, a11[start], 0, n / 2);
                System.arraycopy(a[start], (n / 2), a12[start], 0, n / 2);
                System.arraycopy(a[n / 2 + start], 0, a21[start], 0, n / 2);
                System.arraycopy(a[n / 2 + start], n / 2, a22[start], 0, n / 2);
                System.arraycopy(b[start], 0, b11[start], 0, n / 2);
                System.arraycopy(b[start], (n / 2), b12[start], 0, n / 2);
                System.arraycopy(b[n / 2 + start], 0, b21[start], 0, n / 2);
                System.arraycopy(b[n / 2 + start], n / 2, b22[start], 0, n / 2);
            }

            double[][] p1 = strassenMultiplicationAlgorithm(
                    sumMatrix(a11, a22), sumMatrix(b11, b22));
            double[][] p2 = strassenMultiplicationAlgorithm(
                    sumMatrix(a21, a22), b11);
            double[][] p3 = strassenMultiplicationAlgorithm(
                    a11, subMatrix(b12, b22));
            double[][] p4 = strassenMultiplicationAlgorithm(
                    a22, subMatrix(b21, b11));
            double[][] p5 = strassenMultiplicationAlgorithm(
                    sumMatrix(a11, a12), b22);
            double[][] p6 = strassenMultiplicationAlgorithm(
                    subMatrix(a21, a11), sumMatrix(b11, b12));
            double[][] p7 = strassenMultiplicationAlgorithm(
                    subMatrix(a12, a22), sumMatrix(b21, b22));

            double[][] c11 = subMatrix(sumMatrix(p1, p4), subMatrix(p5, p7));
            double[][] c12 = sumMatrix(p3, p5);
            double[][] c21 = sumMatrix(p2, p4);
            double[][] c22  = subMatrix(sumMatrix(p1, p3), subMatrix(p2, p6));

            for (int start = 0; start < c11.length; start++) {
                System.arraycopy(c11[start], 0, c[start], 0, c11.length);
                System.arraycopy(c12[start], 0, c[start], c12.length, c12.length);
                System.arraycopy(c21[start], 0, c[start + c21.length], 0, c21.length);
                System.arraycopy(c22[start], 0, c[start + c22.length], c22.length, c22.length);
            }
        }
        return c;
    }

    /**
     * Algorithm for 2 matrix addition.
     * @param a first matrix with n x n orde.
     * @param b second matrix with m x m orde, and n = m.
     * @return matrix a result of addition operation.
     */
    protected static double[][] sumMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a.length];
        for (int startX = 0; startX < a.length; startX++) {
            for (int startY = 0; startY < a.length; startY++) {
                c[startX][startY] = a[startX][startY] + b[startX][startY];
            }
        }
        return c;
    }

    /**
     * Algorithm for 2 matrix substraction.
     * @param a first matrix with n x n orde.
     * @param b second matrix with m x m orde, and n = m.
     * @return matrix a result of substraction operation.
     */
    protected static double[][] subMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a.length];
        for (int startX = 0; startX < a.length; startX++) {
            for (int startY = 0; startY < a.length; startY++) {
                c[startX][startY] = a[startX][startY] - b[startX][startY];
            }
        }
        return c;
    }

    /**
     * Finding the new positive integer that is near with value of n.
     * @param n is a positive integer that represent matrix length.
     * @return a positive integer as a result of power of 2 that is near with value of n.
     */
    protected static int powerMatrix(int n) {
        int lg2 = (int) Math.ceil(Math.log(n) / Math.log(2));
        return (int) Math.pow(2, lg2);

    }
}
