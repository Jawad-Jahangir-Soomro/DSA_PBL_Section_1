import java.util.EmptyStackException;

public class MyStack<T> {
    private Node<T> top;
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public MyStack<T> duplicate() {
        MyStack<T> copy = new MyStack<>();
        Node<T> current = top;
        while (current != null) {
            copy.push(current.data);
            current = current.next;
        }
        return copy;
    }

    public int size() {
        return size;
    }
}
