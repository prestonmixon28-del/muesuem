public class LinkedCollection<T> implements CollectionInterface<T> {
    private Node<T> head;
    private int nunElemetns;

    public LinkedCollection() {
        head = null;
        nunElemetns = 0;
    }

    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.link = head;
        head = newNode;
        nunElemetns++;
    
    }

    @Override
    public T find(T target) {
        Node<T> current = head;
        while (current != null) {
            if (current.info.equals(target)) {
                return current.info;
            }
            current = current.link;
        }
        return null;
    }

    @Override
    public boolean remove(T target) {
        Node<T> current = head;
        Node<T> previous = null;
        while (current != null) {
            if (current.info.equals(target)) {
                if (previous == null) {
                    head = current.link;
                } else {
                    previous.link = current.link;
                }
                nunElemetns--;
                return true;
            }
            previous = current;
            current = current.link;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return nunElemetns == 0;
    }
    @Override
    public int size() {
        return nunElemetns;
    }
    
}