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

    private static String pathFileMatrix3 = genericMatrixPath + "B/matrix10rows50columns.txt";
    private static int numberofRows3 = 10;
    private static int numberOfColumns3 = 50;

    private static String pathFileMatrix4 = genericMatrixPath + "B/matrix50row10column.txt";
    private static int numberofRows4 = 50;
    private static int numberOfColumns4 = 10;

    public static void main(String[] args) throws
            IOException, InvalidMatrixSizeForMultiplicationException {

        //Convert into array
        double[][] firstMatrix = convertInputFileToMatrix(pathFileMatrix1, numberOfLine1,
                numberOfLine1);
        double[][] secondMatrix = convertInputFileToMatrix(pathFileMatrix2, numberOfLine2,
                numberOfLine2);

        //Example usage of basic multiplication algorithm.
        long totalMilisBasicMultiplication = System.currentTimeMillis();
        double[][] multiplicationResult =
                MatrixOperation.basicMultiplicationAlgorithm(firstMatrix, secondMatrix);
        totalMilisBasicMultiplication = System.currentTimeMillis() - totalMilisBasicMultiplication;
        System.out.println("Basic Multiplication Complete in "
                + totalMilisBasicMultiplication + " milisecond");

        //Example usage of strassen multiplication algorithm.
        long totalMilisStrassenMultiplication = System.currentTimeMillis();
        double[][] strassenMultiplicationResult =
                MatrixOperation.strassenMatrixMultiForNonSquareMatrix(firstMatrix, secondMatrix);
        totalMilisStrassenMultiplication = System.currentTimeMillis()
                - totalMilisStrassenMultiplication;
        System.out.println("Strassen Multiplication Complete in "
                + totalMilisStrassenMultiplication + " milisecond");

        double[][] thirdMatrix = convertInputFileToMatrix(pathFileMatrix3, numberofRows3,
                numberOfColumns3);
        double[][] fourthMatrix = convertInputFileToMatrix(pathFileMatrix4, numberofRows4,
                numberOfColumns4);

        long totalMilisProblemBStrassenMultiplication = System.currentTimeMillis();
        double[][] strassenUnsquaredMultiplicationResult =
                MatrixOperation.strassenMatrixMultiForNonSquareMatrix(thirdMatrix, fourthMatrix);
        totalMilisProblemBStrassenMultiplication = System.currentTimeMillis()
                - totalMilisProblemBStrassenMultiplication;
        System.out.println("Strassen Multiplication Matrix Problem B Complete in "
                + totalMilisProblemBStrassenMultiplication + " milisecond");

    }

    /**
     * Converting a file input into an 2 dimensional array of double that represent a matrix.
     * @param pathFile is a path to file input.
     * @param numberOfRow the number of row inside the matrix.
     * @param numberOfColumn the number of column inside the matrix.
     * @return 2 dimensional array of double representing matrix.
     * @throws IOException in the case of the file is not found because of the wrong path of file.
     */
    private static double[][] convertInputFileToMatrix(String pathFile, int numberOfRow,
                                                       int numberOfColumn)
            throws IOException {
        File matrixFile = new File(pathFile);
        FileReader fileReader = new FileReader(matrixFile);
        double[][] matrix = new double[numberOfRow][numberOfColumn];

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
