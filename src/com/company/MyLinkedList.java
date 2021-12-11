package com.company;

public class MyLinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public MyLinkedList() {
    }

    /* + size();
     * + isEmpty();
     * + contains(Object o);
     * + n add(E e);
     * + boolean remove(Object o);
     * + void clear();
     * boolean equals(Object o);
     * + E get(int index);
     * + E set(int index, E element);
     * + void add(int index, E element);
     * + E remove(int index);
     * + int indexOf(Object o); */

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public E get(int n) {
        Node<E> current = first;
        for (int i = 0; i < n; i++) {
            current = current.next;
        }
        return current.item;
    }

    public E set(int n, E item) {
        Node<E> current = first;
        for (int i = 0; i < n; i++) {
            current = current.next;
        }
        current.item = item;
        return current.item;
    }

    public void add(E item) {
        Node<E> node = new Node<>(null, null, item);

        if (last == null) {
            first = node;
            last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }

        size++;
    }

    public void add(E item, int n) {
        Node<E> node = new Node<>(null, null, item);

        if (size <= n) {
            node.prev = last;
            last.next = node;
            last = node;
        } else {
            Node<E> current = first;

            for (int i = 0; i < n; i++) {
                current = current.next;
            }

            node.next = current;
            node.prev = current.prev;
            node.prev.next = node;
            current.prev = node;
        }

        size++;
    }

    public boolean remove(E item) {
        Node<E> current = first;
        while (current.item != item && !current.item.equals(item)) {
            current = current.next;
        }
        if (current == null) {
            return false;
        } else if (current == first) {
            first = current.next;
            first.prev = null;
        } else if (current == last) {
            last = current.prev;
            last.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        return true;
    }

    public E remove(int n) {
        if (size <= n) {
            return null;
        } else {
            Node<E> current = first;

            for (int i = 0; i < n; i++) {
                current = current.next;
            }
            if (current == first) {
                first = current.next;
                first.prev = null;
            } else if (current == last) {
                last = current.prev;
                last.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }

            return current.item;
        }
    }
    public boolean contains (E item){
        Node<E> current = first;
        while (current != null && !current.item.equals(item)) {
            current = current.next;
        }
        if (current != null) {
            return true;
        } else return false;
    }

    public int indexOf (E item){
        Node<E> current = first;
        int n = 0;
        while (current != null && !current.item.equals(item)) {
            current = current.next;
            n++;
        }
        if (current != null) {
            return n;
        } else return -1;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    private class Node<E> {
        Node<E> prev;
        Node<E> next;
        E item;

        public Node(Node<E> prev, Node<E> next, E item) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }

}
