package ru.mycompany.mylinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList<E> implements ILinkedList<E>, Iterable<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    public void add(E element) {
        if (size == 0) {
            first = new Node(null, element, null);
            last = first;
        } else {
            if (size == 1) {
                last = new Node(first, element, null);
                first.next = last;
            } else {
                Node<E> tmp = new Node(last, element, null);
                last.next = tmp;
                last = tmp;
            }
        }
        size++;
    }

    public void add(int index, E element) {
        assert (index >= 0 && index <= size): "Index out of range";
        if (size == 0 || (size == index)) {
            add(element);
        } else {
            if (index == 0) {
                first = new Node(null, element, first);
            } else {
                Node<E> prev = first;
                for (int i = 1; i < index; i++) {
                    prev = prev.next;
                }
                Node<E> tmp = new Node(prev, element, prev.next);
                prev.next = tmp;
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
        assert (index >= 0 && index < size): "Index out of range";
        if (index == 0) {
            return first.element;
        } else {
            if (index == size - 1) {
                return last.element;
            }
            else {
                Node<E> tmp = first;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
                return tmp.element;
            }
        }
    }



    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }

    public int size() {
        return size;
    }

    public class Node<E> {
        private Node<E> previous;
        private E element;
        private Node<E> next;

        public Node (Node<E> previous, E element, Node<E> next) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }

//    private class MyLinkedListIterator implements ListIterator<E> {
//        private Node<E> next;
//        private int nextIndex;
//
//        @Override
//        public boolean hasNext() {
//            return false;
//        }
//    }
}
