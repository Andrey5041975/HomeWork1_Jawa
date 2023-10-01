package lesson28.HomeWork1_10_23;

public interface MyGenericLinkedList <T> {
    int size(); // размер
    boolean contains(T value); // содержится ли в листе такое значение
    void set(int index, T value); // изменение значения элемента по индексу
    void add(T value); // добавление элемента в конец
    void add(int index, T value); // вставка элемента
    void remove(int index); // удаление элемента по индексу
    T get(int index); // получение значения по индексу

}
