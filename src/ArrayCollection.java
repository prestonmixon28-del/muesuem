public class ArrayCollection<T> implements CollectionInterface<T> {

    private T[] elements;
    private int nunElements;

    public ArrayCollection() {
        elements = (T[]) new Object[100];
        nunElements = 0;
    }

    @Override 
    public void add(T item) {
        elements[nunElements] = item;
    }

    @Override 
    public T find(T target) {
        for (int i = 0; i < nunElements; i++) {
            if (elements[i].equals(target)) {
                return elements[i];
            }
        }
        return null;
    }

    @Override 
    public boolean contains(T target) {
        return find(target) != null;
    }

    @Override 
    public boolean remove(T target) {
        for (int i = 0; i < nunElements; i++) {
            if (elements[i].equals(target)) {
                elements[i] = elements[nunElements - 1];
                elements[nunElements - 1] = null;
                nunElements--;
                return true;
            }
            }
        
        return false;
    }

    @Override 
    public boolean isEmpty() {
        return nunElements == 0;
    }

    @Override 
    public int size() {
        return nunElements;
    }
    
}
