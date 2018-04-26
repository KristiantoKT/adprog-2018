package matrix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static String genericMatrixPath = "plainTextDirectory/input/matrixProblem";
    private static String pathFileMatrix1 = genericMatrixPath + "A/matrixProblemSet1.txt";
    private static int numberOfLine1 = 50;

    private static String pathFileMatrix2 = genericMatrixPath + "A/matrixProblemSet2.txt";
    private static int numberOfLine2 = 50;

    public static void main(String[] args) throws
            IOException, InvalidMatrixSizeForMultiplicationException {

        //Convert into array
        double[][] firstMatrix = convertInputFileToMatrix(pathFileMatrix1, numberOfLine1);
        double[][] secondMatrix = convertInputFileToMatrix(pathFileMatrix2, numberOfLine2);

        //TODO Implement, do your benchmark test for these algorithm start from here

        //Example usage of basic multiplication algorithm.
        double[][] multiplicationResult =
                MatrixOperation.basicMultiplicationAlgorithm(firstMatrix, secondMatrix);

        //Example usage of strassen multiplication algorithm.
        double[][] strassenMultiplicationResult =
                MatrixOperation.strassenMatrixMultiForNonSquareMatrix(firstMatrix, secondMatrix);

    }

    /**
     * Converting a file input into an 2 dimensional array of double that represent a matrix.
     * @param pathFile is a path to file input.
     * @param numberOfLine the number of row (and possibly column) inside the square matrix.
     * @return 2 dimensional array of double representing matrix.
     * @throws IOException in the case of the file is not found because of the wrong path of file.
     */
    private static double[][] convertInputFileToMatrix(String pathFile, int numberOfLine)
            throws IOException {
        File matrixFile = new File(pathFile);
        FileReader fileReader = new FileReader(matrixFile);
        double[][] matrix = new double[numberOfLine][numberOfLine];

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String currentLine;
        int indexOfLine = 0;
        while ((currentLine = bufferedReader.readLine()) != null) {
            matrix[indexOfLine] = sequenceIntoArray(currentLine);
            indexOfLine++;
        }
        return matrix;
    }

    /**
     * Converting a row of sequence of double into an array.
     * @param currentLine sequence of double from input representing a row from matrix.
     * @return array of double representing a row from matrix.
     */
    private static double[] sequenceIntoArray(String currentLine) {
        String[] arrInput = currentLine.split(" ");
        double[] arrInteger = new double[arrInput.length];
        for (int index = 0; index < arrInput.length; index++) {
            arrInteger[index] = Double.parseDouble(arrInput[index]);
        }
        return arrInteger;
    }
}
