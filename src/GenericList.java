import java.lang.reflect.Array;

public class GenericList<T> {
    private Node<T> head;
    private int size;

    public GenericList(){
        this.head = null;
        this.size = 0;
    }

    public int size() { return size;}
    public Node<T> getHead() { return head;}
    public boolean isEmpty() { return size==0;}

    public void add(T elem){
        Node<T> node = new Node<>(elem);
        if (!isEmpty()) {
            node.setNext(head);
        }
        head=node;
        size++;
    }

    public int search(T elem){
        int result = -1;
        if(isEmpty())
            return result;
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if(node.getElem().equals(elem))
                return i;
            node = node.getNext();
        }
        return result;
    }

    public T[] toArray(Class c){
        T[] vector = (T[]) Array.newInstance(c,size);
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            vector[i] = (T) node.getElem();
            node = node.getNext();
        }
        return vector;
    }

    public T remove(int index){
        T result = null;
        if(isEmpty() || index < 0 || index>=size)
            return null;
        Node<T> node;
        if(index==0){
            result = head.getElem();
            head = head.getNext();
        } else {
            Node<T> aux1 = head;
            Node<T> aux2 = head.getNext();
            while(index>1){
                aux1 = aux2;
                aux2 = aux2.getNext();
                index--;
            }
            result = aux2.getElem();
            aux1.setNext(aux2.getNext());
        }
        size--;
        return result;
    }

    public T get(int index){
        if (isEmpty() || index <0 || index>=size)
            return null;
        Node<T> node = head;
        while(index>0){
            node = node.getNext();
            index--;
        }
        return node.getElem();
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public GenericList addAll(GenericList<T> list){
        Node<T> node = list.getHead();
        for (int i = 0; i < list.size(); i++) {
            add(node.getElem());
            node = node.getNext();
        }
        return this;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof GenericList))
            return false;
        GenericList<T> list = (GenericList<T>) obj;

        if(list.size() != this.size)
            return false;

        Node<T> aux1 = this.head;
        Node<T> aux2 = list.getHead();

        while(aux1 != null){
            if(!aux1.equals(aux2))
                return false;
            aux1 = aux1.getNext();
            aux2 = aux2.getNext();
        }
        return true;
    }

    @Override
    public String toString(){
        return "{ size: " + size + ", Element: " + ((head==null) ? "}" : head.toString());
    }

    public boolean contains(Ejemplar elem){
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if(elem.equals(node.getElem()))
                return true;
            node = node.getNext();
        }
        return false;
    }




    private class Node<T> {
        private T elem;
        private Node<T> next;

        public Node(T elem){
            this.elem = elem;
            this.next= null;
        }

        public Node getNext() {
            return next;
        }

        public T getElem() {
            return elem;
        }

        public void setElem(T elem) {
            this.elem = elem;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public String toString(){
            return elem + ((next!=null)?", " + next : " }");
        }

        @Override
        public boolean equals(Object obj){
            if(!(obj instanceof Node))
                return false;
            Node<T> node = ((GenericList<T>.Node<T>) obj).getNext();
            return (node.getElem().equals(elem));
        }

    }

}
