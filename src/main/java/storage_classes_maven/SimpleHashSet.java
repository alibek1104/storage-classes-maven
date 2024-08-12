package storage_classes_maven;

public class SimpleHashSet {
    private int[] elements;
    private int size;

    public SimpleHashSet() {
        elements = new int[10];
        size = 0;
    }


    public void add(int element) {
        if (!contains(element)) {
            if (size == elements.length) {
                resize();
            }
            elements[size] = element;
            size++;
        }
    }


    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void remove(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                size--;
                return;
            }
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
