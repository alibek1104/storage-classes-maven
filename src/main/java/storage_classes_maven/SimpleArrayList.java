package storage_classes_maven;


public class SimpleArrayList {
    private int[] elements;
    private int size;

    public SimpleArrayList() {
        elements = new int[10];
        size = 0;
    }


    public void add(int element) {
        if (size == elements.length) {
            resize();
        }
        elements[size] = element;
        size++;
    }


    public int get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона");
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        } else {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона");
        }
    }

    private void resize() {
        int[] newArray = new int[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public int size() {
        return size;
    }
}
