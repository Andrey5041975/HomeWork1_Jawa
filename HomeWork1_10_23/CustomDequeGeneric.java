package lesson28.HomeWork1_10_23;

public interface CustomDequeGeneric <T>{
    void addFirst(T i); // добавление в начало
    T getFirst() throws IndexOutOfBoundsException; // запрос первого элемента без удаления
    T removeFirst() throws IndexOutOfBoundsException; // получение 1 элемента и удаление

    void addLast(T i); // добавление в конец
    T getLast() throws IndexOutOfBoundsException; // получение последнего элемента без удаления
    T removeLast() throws IndexOutOfBoundsException; // получение последнего с удалением

    int size();
}
