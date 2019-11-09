package ru.otus.homework.arrayListClass;

import java.util.*;
import java.util.function.UnaryOperator;

public class DIYarrayList<T> implements List<T> {
    private final int INIT_SIZE = 8;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public boolean isEmpty() {

        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) return true;
            break;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size());
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException();
    }


    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator<T> operator) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sort(Comparator<? super T> c) {

    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return array[index] = element;
    }

    @Override
    public void add(int index, Object element) {

        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Object item) {
        if (pointer == array.length - 1)
            doubleArraySize(array.length);
        array[pointer++] = item;
        return true;
    }

    private void doubleArraySize(int actualLength) {
        Object[] newArray = new Object[actualLength * 2];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

}


