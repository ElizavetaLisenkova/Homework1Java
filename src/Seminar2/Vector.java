package Seminar2;

import java.util.Arrays;

public class Vector {
    private double x;
    private double y;
    private double z;

    private Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }



    public double vectorLength() {
        return Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z);
    }

    public double scalar(Vector v) {
        return this.x*v.getX()+this.y*v.getY()+this.z*v.getZ();
    }

    public double[] multiply(Vector v) {
        double [] arr = new double[3];
        arr[0] = this.y*v.getZ() - this.z*v.getY();
        arr[1] = this.z * v.getX() - this.x * v.getZ();
        arr[2] = this.x * v.getY() - this.y * v.getX();
        return arr;
    }

    public double angle(Vector v) {
        return this.scalar(v) / (this.vectorLength()*v.vectorLength());
    }

    public static double[][] someVectors(int n) {
        double [][] arr = new double[n][3];
        for (int i=0; i<n; i++) {
            arr[i][0] = Math.random()*201-100;
            arr[i][1] = Math.random()*201-100;
            arr[i][2] = Math.random()*201-100;
        }
        return arr;

    }

    public double[] summ(Vector v){
        double [] arr = new double[3];
        arr[0] = this.x + v.x;
        arr[1] = this.y + v.y;
        arr[2] = this.z + v.z;
        return arr;
    }

    public double[] sub(Vector v){
        double [] arr = new double[3];
        arr[0] = this.x - v.x;
        arr[1] = this.y - v.y;
        arr[2] = this.z - v.z;
        return arr;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }


    public static void main(String[] args) {
        Vector v1 = new Vector(1,2,3);
        System.out.print("Длина вектора  ");
        System.out.println(v1.vectorLength());
        Vector v2 = new Vector(3,2, 1);
        System.out.print("Скалярное произведение векторов  ");
        System.out.println(v1.scalar(v2));
        System.out.print("Векторное произведение  ");
        System.out.println(Arrays.toString(v1.multiply(v2)));
        System.out.print("Угол между векторами  ");
        System.out.println(v1.angle(v2));
        System.out.print("Сложение векторов");
        System.out.println(Arrays.toString(v1.summ(v2)));
        System.out.print("Вычитание векторов");
        System.out.println(Arrays.toString(v1.sub(v2)));
        System.out.print("Массив размером N случайных векторов  ");
        for (int i=0; i<v1.someVectors(5).length; i++) {
            System.out.print((i+1) + ":  ");
            System.out.println(Arrays.toString(v1.someVectors(5)[i]));
        }

    }
}
