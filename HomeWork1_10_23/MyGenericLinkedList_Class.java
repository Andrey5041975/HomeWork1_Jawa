package lesson28.HomeWork1_10_23;

// ArrayList - на основе массива
// LinkedList - каждый элемент хранит ссылки на следующий и предыдущий

// доступ по индексу
// ArrayList O(1)
// LinkedList O(N)

// работа с первым и последним элементом - добавление, изменение, удаление
// ArrayList O(N)
// LinkedList O(1)

public class MyGenericLinkedList_Class <T> implements MyGenericLinkedList<T>{


    private Node head; // голова списка - первый узел
    private int size = 0; // количество элементов в списке

    @Override
    public String toString() {
        // [1,2,3]
        String r = "[";
        Node n = head;
        while (n != null)
        {
            r += n.getValue();
            n = n.getNext();
            if(n != null)
            {
                r += ", ";
            }
        }
        r += "]";
        return r;
    }

    private class Node {
        private T value; // значение элемента
        private Node next; // ссылка на следующий узел

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return  value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T value) {
        Node n = head;
        while (n != null)
        {
            //System.out.println("From contains ...class " + "n  " + n.value + " value "+ value + " " + n.equals(value));
            if(n.value.equals(value))

                return true;
            n = n.getNext();
        }

        return false;
    }

    @Override
    public void set(int index, T value) {
      //value[index] = value;
    }


    @Override
    public void add(T value) {
        size++;
        // head == null
        if(head == null) {
            head = new Node(value);
            return;
        }
        Node n = head;
        while (n.getNext() != null)
            n = n.getNext();

        n.setNext(new Node(value));
    }





    @Override
    public void add(int index, T value) {
        if(index == 0) {
            Node prevHead = head;
            head = new Node(value, prevHead);
            // head = new Node(value, head);
        }
        else {
            Node prev = getNodeByIndex(index - 1);
            Node next = prev.getNext();
            Node newNode = new Node(value, next);
            prev.setNext(newNode);
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if(index == 0)
        {
            if(head == null)
                return;
            head = head.getNext();
            size--;
            return;
        }
        Node prev = getNodeByIndex(index - 1);
        if(prev != null)
        {
            Node current = prev.getNext();
            if(current != null)
            {
                prev.setNext(current.getNext());
            }
            size--;
        }
    }

    // получение узла по его индексу
    private Node getNodeByIndex(int index)
    {
        Node n = head;
        for(int i = 0; i < index; i++)
        {
            if(n != null)
                n = n.getNext();
            else
                throw new IndexOutOfBoundsException();
        }
        if(n == null)
            throw new IndexOutOfBoundsException();
        return n;
    }

    // получение значения элемента по его индексу
    @Override
    public T get(int index) {
        Node n = getNodeByIndex(index);
        return n.getValue();
    }

//    @Override
//    public Iterator<Integer> iterator() {
//        return null;
//    }
//
//    @Override
//    public Iterator<Integer> backward() {
//        return null;
//    }


    // добавление элемента в начало списка
    void addFirst(T e)
    {
        add(0, e);
    }

    // получение значения первого элемента
    T getFirst()
    {
        return get(0);
    }

    // удаление первого элемента с возвращением его "старого" значения
    T removeFirst(){
        // если элементов нет, то IndexOutOfBoundsException
        if(head == null)
            throw new IndexOutOfBoundsException();
        // сохраняем значение первого элемента во временную переменную
        T temp = getFirst();
        // удаляем первый элемент
        remove(0);
        // возвращаем сохраненное значение
        return  temp;
    }

}
























