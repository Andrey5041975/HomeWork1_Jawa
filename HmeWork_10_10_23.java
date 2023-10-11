package lesson32;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


/*
        Переделайте предыдущее задание про потоки выполнения (класс lesson31.hw.HWThreads) на Callable

        Создайте Callable, из метода call которой возвращайте результат выполнения функции waitSomeTime.

        В main создайте и запустите два потока, выполняющие этот Callable и распечатайте сумму результатов.

        В классе CallableTester можно посмотреть пример запуска Callable на потоке выполнения и получения из Callable результата. (изменено)
        10 октября 2023 г.
*/
public class HmeWork_10_10_23 {



    public static void main(String[] args) {

        Callable<Integer> callable1 = new WaitCallable();
        Callable<Integer> callable2 = new WaitCallable();

        FutureTask<Integer> task1 = new FutureTask<>(callable1);
        FutureTask<Integer> task2 = new FutureTask<>(callable2);

        new Thread(task1).start();
        new Thread(task2).start();

        Callable<Integer> waitCallable = new WaitCallable();
        FutureTask<Integer> taskWait = new FutureTask<>(waitCallable);
        new Thread(taskWait).start();



        try {
            System.out.println("task1.get(): " + task1.get());
            System.out.println("task2.get(): " + task2.get());
            int res = task1.get() + task2.get();
            System.out.println("result = task1.get(): + task.get()  " + task1.get() + " + " + task2.get() + " = " + res);

            System.out.println("taskWait.get(): " + taskWait.get());
        } catch (Exception e) { /* */ }

    }

    // Создайте функцию, ожидающую рандомное время от 0 до 1000 мс и возвращающую
    // это время в качестве результата
    public static int waitSomeTime() {
        Random r = new Random();
        int pause = r.nextInt(1000);
        try {
            Thread.sleep(pause);
        } catch (InterruptedException e) {
            //
        }
        return pause;
    }
    static class WaitCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return waitSomeTime();
        }

    }

}

