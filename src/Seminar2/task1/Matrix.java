package Seminar2.task1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Matrix {

    private int[][] m;

    public Matrix(int[][] m) {
        this.m = m;
    }

    public int[][] getM() {
        return m;
    }

    public void print() {
        for (int i = 0; i< m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }

    public Matrix transposition() {
        int[][] outArray = new int[this.getM()[0].length][this.getM().length];
        Matrix outMatrix = new Matrix(outArray);
        for (int i=0; i<this.getM().length; i++) {
            for (int j=0; j<this.getM()[i].length; j++) {
                outMatrix.getM()[j][i] = this.getM()[i][j];
            }
        }
        return outMatrix;
    }

    public Matrix multiply(Matrix other) {
        if (this.getM()[0].length == other.getM().length) {
                int[][] outArray = new int[this.getM().length][this.getM()[0].length];
                Matrix outMatrix = new Matrix(outArray);
            for (int i = 0; i < this.getM().length; i++) {
                for (int j = 0; j < other.getM()[i].length; j++) {
                    for (int k = 0; k < other.getM().length; k++)
                    outMatrix.getM()[i][j] += this.getM()[i][k] * other.getM()[k][j];
                }
            }
            return outMatrix;
        }
        else {
            System.out.println("Умножение не удалось. Число столбцов первой матрицы должно быть равно числу строк второй. Исходная матрица: ");
            return this;
        }
    }

//    public Matrix exponentiation(int n) {
//        if (this.getM()[0].length == this.getM().length) {
//            for (int i = 0; i < this.getM().length; i++) {
//                for (int j = 0; j < this.getM()[i].length; j++) {
//                    for (int k = 0; k < this.getM().length; k++)
//                        this.getM()[i][j] += this.getM()[i][k] * this.getM()[k][j];
//                }
//            }
//            return this;
//
//        } else {
//            System.out.println("Возведение в степень не удалось. Матрица должна быть квадратной. Исходная матрица: ");
//            return this;
//        }
//    }

    public Matrix sub(Matrix other) {
        if (this.getM().length == other.getM().length && this.getM()[0].length == other.getM()[0].length) {
            int[][] outArray = new int[this.getM().length][this.getM()[0].length];
            Matrix outMatrix = new Matrix(outArray);
            for (int i = 0; i < this.getM().length; i++) {
                for (int j = 0; j < this.getM()[i].length; j++) {
                    outMatrix.getM()[i][j] = this.getM()[i][j] - other.getM()[i][j];
                }
            }
            return outMatrix;
        }
        else {
            System.out.println("Вычитание не удалось. Матрицы должны быть одинаковой размерности. Исходная матрица: ");
            return this;
        }
    }

    public Matrix sum(Matrix other) {
        if (this.getM().length == other.getM().length && this.getM()[0].length == other.getM()[0].length) {
            int[][] outArray = new int[this.getM().length][this.getM()[0].length];
            Matrix outMatrix = new Matrix(outArray);
            for (int i = 0; i < this.getM().length; i++) {
                for (int j = 0; j < this.getM()[i].length; j++) {
                    outMatrix.getM()[i][j] = this.getM()[i][j] + other.getM()[i][j];
                }
            }
            return outMatrix;
        }
        else {
           System.out.println("Сложение не удалось. Матрицы должны быть одинаковой размерности. Исходная матрица: ");
           return this;
        }
    }
    public static void main(String[] args) {
        int[][] m1 = {{1,2,3}, {4,5,6}};
        int[][] m2 = {{3,2,1}, {6,5,4}, {1,2,3}};
        Matrix matrix1 = new Matrix(m1);
        int[][] m3 = {{3,2,1}, {6,5,4}};
        Matrix matrix3 = new Matrix(m3);
        matrix1.print();
        Matrix matrix2 = new Matrix(m2);
        matrix1.sum(matrix3).print();
        matrix2.sub(matrix3).print();
        matrix1.multiply(matrix2).print();
        matrix1.transposition().print();
//        matrix2.exponentiation().print();
    }

}
