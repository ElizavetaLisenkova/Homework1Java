package Seminar2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrays {

    private int[] values;
    private int[] weight;

    public MyArrays(int[] values, int[] weight) {
        this.values = values;
        this.weight = weight;
    }

    public int[] getValues() {
        return values;
    }

    public int[] getWeight() {
        return weight;
    }

    public Integer outValue() {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (int i = 0; i < this.values.length; i++) {
            for (int k = 0; k <= this.weight[i]; k++) {
                x.add(values[i]);
            }
        }
        return x.get((int) (Math.random() * x.size()));
    }


    public static void main(String[] args) {
        MyArrays obj = new MyArrays(new int[]{1, 2, 3}, new int[]{1,2,10});
        System.out.println(obj.outValue());
    }
}
