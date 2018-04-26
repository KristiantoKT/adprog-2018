package matrix;

class InvalidMatrixSizeForMultiplicationException extends Exception {

    InvalidMatrixSizeForMultiplicationException() {
        super("First Matrix Total Column is not equal with Second Matrix Total Row");
    }
}
