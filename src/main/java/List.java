/**
 * A class that implements a list element with a pointer to the next element.
 * @param <T> element data type.
 */
class Node <T> {
    /**
     * Data contained in the element.
     */
    T data;
    /**
     * Pointer to next element.
     */
    Node<T> next;

    /**
     * Empty element creation constructor.
     * @see Node#Node(Object)
     * @see Node#Node(Object, Node) 
     */
    public Node() {};
    /**
     * Constructor for creating an element that does not contain a pointer to the next element.
     * @see Node#Node() 
     * @see Node#Node(Object, Node) 
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    /**
     * Constructor for creating an element containing a pointer to the next element.
     * @param data element data: {@link Node#data}
     * @param nextElem pointer to next element: {@link Node#next}
     * @see Node#Node() 
     * @see Node#Node(Object) 
     */
    public Node(T data, Node<T> nextElem) {
        this.data = data;
        this.next = nextElem;
    }
}

/**
 * List class with elements of the Node class.
 * @param <T> element data type.
 */
public class List<T> {
    /**
     * Pointer to the beginning of the list.
     */
    private Node<T> head;
    /**
     * Constructor for creating an empty list.
     * @see List#List(Object) 
     */
    public List() {
        this.head = null;
    }
    /**
     * Constructor for creating a list containing an element.
     * @param data element data: {@link Node#data}
     * @see List#List() 
     */
    public List(T data) {
        head = new Node<>();
        head.data = data;
        head.next = null;
    }

    /**
     * Method for adding an element to a list.
     * @param data element data: {@link Node#data}
     */
    public void add(T data) {
        head = new Node<>(data, head);
    }
    /**
     * Method of obtaining data from an element at a specified position.
     * @param pos the position of the searched element in the list starting from zero.
     * @return returns the data stored in the element at the specified position.
     */
    public T get(int pos) {
        if (head == null) throw new IndexOutOfBoundsException();

        Node<T> pointer = head;
        for (int i = 0; i < pos; i++) {
            pointer = pointer.next;
            if (pointer == null) throw new IndexOutOfBoundsException();
        }

        return pointer.data;
    }
    /**
     * Method for removing an element at a specified position from the list.
     * @param pos position of the element to be removed
     */
    public void delete(int pos) {
        if (head == null) throw new IndexOutOfBoundsException();

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node<T> pointer = head;
        for (int i = 0; i < pos - 1; i++) {
            pointer = pointer.next;
            if (pointer == null) throw new IndexOutOfBoundsException();
        }
        if (pointer.next == null) throw new IndexOutOfBoundsException();
        pointer.next = pointer.next.next;
    }
}
