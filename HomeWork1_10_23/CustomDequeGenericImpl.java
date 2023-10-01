package lesson28.HomeWork1_10_23;


public class CustomDequeGenericImpl<T> implements CustomDequeGeneric<T>{

    private T [] source; // содержимое
    private int size = 0; // начальный размер
    private int firstElementIndex = 0; // индекс первого элемента

    @Override
    public String toString()
    {
        // [1, 2, 3]
        String r = "[";
        for(int i = 0; i < size(); i++)
        {
            T v = source[(firstElementIndex + i) % source.length];
            r += v;
            if(i < size() - 1)
                r += ", ";
        }
        r += "]";
        return r;
    }


    private static final int CAPACITY = 4; // начальный размер массива
    public CustomDequeGenericImpl()
    {
        source =(T[]) new Object[CAPACITY];
    }

    @Override
    public void addFirst(T i) {
        // нужно проверить не равен ли size размеру массива
        if(size == source.length) {
            // если да, то нужно пересоздать массив и скопировать в него элементы
            increaseCapacity();
        }

        // поменять firstElementIndex
        firstElementIndex = (firstElementIndex - 1 + source.length) % source.length;
        // добавить элемент в нужное место
        source[firstElementIndex] = i;
        // увеличить size
        size++;
    }

    private void increaseCapacity() {
        T [] newSource = (T[]) new Object[source.length * 2];
        for(int i = 0; i < size(); i++)
        {
            T v = source[(firstElementIndex + i) % source.length];
            // добавить этот элемент в правильную позицию в newSource
            newSource[i] = v;
        }
        // поправить firstElementIndex
        firstElementIndex = 0;
        // превратить newSource в source
        source = newSource;
    }

    @Override
    public T getFirst() throws IndexOutOfBoundsException {
        // нужно проверить size()
        if(size() == 0)
            throw new IndexOutOfBoundsException();
        // если size подходящий, то вернуть "первый"
        return source[firstElementIndex];
    }

    @Override
    public T removeFirst() throws IndexOutOfBoundsException {
        // нужно проверить размер и при необходимости выбросить исключение
        if(size() == 0)
            throw new IndexOutOfBoundsException();
        // сохранить значение
        T i = source[firstElementIndex];
        // поправить firstElementIndex
        firstElementIndex = (firstElementIndex + 1) % source.length;
        // уменьшить size
        size--;
        // вернуть значение
        return i;
    }

    @Override
    public void addLast(T i) {
        // выполнить increaseCapacity если в этом есть необходимость
        if(size() == source.length)
            increaseCapacity();
        // вычислить индекс элемента в source куда будет происходить вставка
        int lastElementIndex = (firstElementIndex + size()) % source.length;
        // добавить значение по этому индексу
        source[lastElementIndex] = i;
        // увеличить size
        size++;
    }

    @Override
    public T getLast() throws IndexOutOfBoundsException {
        if(size() == 0)
            throw new IndexOutOfBoundsException();
        int lastElementIndex = (firstElementIndex + size() - 1) % source.length;
        return source[lastElementIndex];
    }

    @Override
    public T removeLast() throws IndexOutOfBoundsException {
        /*
        // выбросить исключение если есть необходимость
        if(size() == 0)
            throw new IndexOutOfBoundsException();
        // определить индекс последнего элемента
        int lastElementIndex = (firstElementIndex + size() - 1) % source.length;
        // сохранить значение последнего элемента во временную переменную
        int v = source[lastElementIndex];
        // уменьшить размер
        size--;
        // вернуть сохраненное значение
        return v;
         */
        T v = getLast();
        size--;
        return v;
    }

    @Override
    public int size() {
        return size;
    }
}
