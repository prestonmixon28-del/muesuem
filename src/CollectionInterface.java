public interface CollectionInterface<T> {
    void add(T item);
    T find(T target);
    boolean remove(T target);
    boolean contains(T target);
    boolean isEmpty();
    int size();
}
