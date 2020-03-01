package lab2;

import java.util.Random;

public class Matrix {


    public static void displayMatrix(byte[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillArray(byte[][] matrix) {
        Random rand = new Random();
        final byte a = 8;
        Integer b;
        byte bottomBorder = Byte.MIN_VALUE / a;
        byte topBorder = Byte.MAX_VALUE / a;


        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                b = bottomBorder + (int) (Math.random() * topBorder);
                //b = rand.nextInt(topBorder) - bottomBorder;
                matrix[i][j] = b.byteValue();
                matrix[i][j] *= a;
            }
        }
    }

    public static int findSumOfMaxInEvenRow(byte[][] matrix) {
        byte maxOfEvenRow;
        int sumOfMax = 0;

        for(int i = 0; i < matrix.length; i = i + 2) {
            maxOfEvenRow = matrix[i][0];
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] > maxOfEvenRow) {
                    maxOfEvenRow = matrix[i][j];
                }
            }
            sumOfMax += maxOfEvenRow;
        }

        return sumOfMax;
    }

    public static int findSumOfMinInOddRow(byte[][] matrix) {
        byte minOfOddRow;
        int sumOfMin = 0;

        for(int i = 1; i < matrix.length; i = i + 2) {
            minOfOddRow = matrix[i][0];
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] < minOfOddRow) {
                    minOfOddRow = matrix[i][j];
                }
            }
            sumOfMin += minOfOddRow;
        }

        return sumOfMin;
    }




    public static void main(String[] args) {
        int N = 5;
        int M = 5;
        byte[][] matrix = new byte[N][M];
        fillArray(matrix);
        displayMatrix(matrix);
        System.out.println(findSumOfMaxInEvenRow(matrix));
        System.out.println(findSumOfMinInOddRow(matrix));
    }
}
