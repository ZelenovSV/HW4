public class LinkedList <E> implements Link <E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;



    public LinkedList() {
        firstNode = new Node<E>(null, firstNode, null);
        lastNode = new Node<E>(null, null, lastNode);
    }


    public void addLast(E e) {
        Node <E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node <E> (null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    public void addFirst(E e) {
        Node <E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node <> (null, null, next);
        next.setPrevElement(firstNode);
        size++;


    }

    public int size() {
        return size;
    }

    public E getElementByIndex(int counter) {
        Node <E> target = firstNode;
        if(counter == 1) {
            firstNode.getCurrentElement();
        } else if (counter == size) {
            for (int i = 0; i < counter; i++) {
                target = target.getNextElement();
            }
            target.getCurrentElement();

        } else {
            target.getPrevElement();
        }

        return target.currentElement;
    }


    private class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;
        private Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }
        public E getCurrentElement() {
            return currentElement;
        }
        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }
        public Node<E> getNextElement() {
            return nextElement;
        }
        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }
        public Node<E> getPrevElement() {
            return prevElement;
        }
        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }
    public String toString() {
        String str = "\nLinkedList: ";
        Node <E> n = firstNode;
        while (n != null) {
            str = str + n.getCurrentElement();
        }
        return str;
    }

}










