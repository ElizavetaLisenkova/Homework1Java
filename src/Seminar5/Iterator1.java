package Seminar5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterator1<T> implements Iterator<T> {

    private int index = 0;
    private T[] array;

    

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
