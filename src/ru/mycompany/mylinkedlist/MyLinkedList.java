package ru.mycompany.mylinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class MyLinkedList<E> implements ILinkedList<E>, Iterable<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>() {
            Node<E> nextNode = first;
            Node<E> result;

            @Override
            public boolean hasNext() {
                return !(nextNode == null);
            }

            @Override
            public E next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                result = nextNode;
                nextNode = nextNode.next;
                return result.element;
            }
        };
        return it;
    }

    public void add(E element) {
        if (size == 0) {
            first = new Node<>(null, element, null);
            last = first;
        } else {
            if (size == 1) {
                last = new Node<>(first, element, null);
                first.next = last;
            } else {
                Node<E> tmp = new Node<>(last, element, null);
                last.next = tmp;
                last = tmp;
            }
        }
        size++;
    }

    public void add(int index, E element) {
        assert (index >= 0 && index <= size) : "Index out of range";
        if (size == 0 || (size == index)) {
            add(element);
        } else {
            if (index == 0) {
                Node<E> tmp = new Node<>(null, element, first);
                first.previous = tmp;
                first = tmp;
            } else {
                Node<E> prev = first;
                for (int i = 1; i < index; i++) {
                    prev = prev.next;
                }
                Node<E> tmp = new Node<>(prev, element, prev.next);
                prev.next = tmp;
                tmp.next.previous = tmp;
            }
        }
        size++;
    }

    public void clear() {
        Node<E> tmp = first;
        Node<E> tmpNext;
        for (int i = 0; i < size; i++) {
            tmpNext = tmp.next;
            tmp.previous = null;
            tmp.element = null;
            tmp.next = null;
            tmp = tmpNext;
        }
        first = last = null;
        size = 0;
    }

    public E get(int index) {
        assert (index >= 0 && index < size) : "Index out of range";
        if (index == 0) {
            return first.element;
        } else {
            if (index == size - 1) {
                return last.element;
            } else {
                Node<E> tmp = first;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
                return tmp.element;
            }
        }
    }

    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.element == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (element.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public E remove(int index) {
        assert (index >= 0 && index < size) : "Index out of range";
        Node<E> removable;
        if (index == 0) {
            removable = first;
            first = first.next;
            first.previous = null;
            removable.next = null;
        } else {
            if (index == size - 1) {
                removable = last;
                last = last.previous;
                last.next = null;
                removable.previous = null;
            } else {
                removable = first;
                for (int i = 0; i < index; i++) {
                    removable = removable.next;
                }
                removable.previous.next = removable.next;
                removable.next.previous = removable.previous;
                removable.next = null;
            }
        }
        size--;
        return removable.element;
    }

    public E set(int index, E element) {
        assert (index >= 0 && index < size) : "Index out of range";
        Node<E> setable = first;
        for (int i = 0; i < index; i++) {
            setable = setable.next;
        }
        E oldElement = setable.element;
        setable.element = element;
        return oldElement;
    }

    public int size() {
        return size;
    }

    public Object[] toArray() {
        Node<E> current = first;
        Object[] result = new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = current.element;
            current = current.next;
        }
        return result;
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        Node<E> current = first;
        Object[] result = a;
        for (int i = 0; i < size; i++) {
            result[i] = current.element;
            current = current.next;
        }
        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "{MyLinkedList}[]";
        } else {
            String result = "{MyLinkedList}" + "[";
            for (E element : this) {
                result += element.toString();
                result += ", ";
            }
            result = result.substring(0, result.length() - 2) + "]";
            return result;
        }
    }


    public class Node<E> {
        private Node<E> previous;
        private E element;
        private Node<E> next;

        public Node(Node<E> previous, E element, Node<E> next) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
}
