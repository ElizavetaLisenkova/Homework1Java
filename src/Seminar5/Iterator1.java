package Seminar5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterator1<T> implements Iterator<T> {

    int index = 0;
    T[] array;

   public Iterator1 getIterator() {
       return new Iterator1();
   }

    @Override
    public boolean hasNext() {
        if (index < array.length) return true;
        return false;
    }

    @Override
    public T next() {
        if (this.hasNext()) return array[index++];
        else {throw new NoSuchElementException();}
    }





    public static void main(String[] args) {
        Integer[] ar = {1, 2, 3};
        Iterator1 iterator = new Iterator1();

    }
}
