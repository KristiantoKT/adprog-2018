package matrix;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Test;

public class MatrixMultiplicationTest {
    double[][] first = {{1,2}, {3,4}};
    double[][] second = {{5,6}, {7,8}};
    double[][] third = {{1,2,3}};
    double[][] expectedSquaredResult = {{19, 22}, {43, 50}};
    double[][] result;

    @Test
    public void testSquareBasicMultiplication() throws InvalidMatrixSizeForMultiplicationException {
        result = MatrixOperation.basicMultiplicationAlgorithm(first, second);
        assertTrue(Arrays.deepEquals(result, expectedSquaredResult));
    }

    @Test
    public void testSquareStrassensMultiplication() {
        result = MatrixOperation.strassenMatrixMultiForNonSquareMatrix(first, second);
        assertTrue(Arrays.deepEquals(result, expectedSquaredResult));
    }

    @Test(expected = InvalidMatrixSizeForMultiplicationException.class)
    public void testNonSquareBasicMultipicationError()
            throws InvalidMatrixSizeForMultiplicationException {
        result = MatrixOperation.basicMultiplicationAlgorithm(first, third);
    }
}
