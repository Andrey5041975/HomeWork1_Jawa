package lesson33.myHW;


import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

/*
 1 уровень сложности: Создайте класс BankAccount c приватным целым полем balance, добавьте геттер и сеттер.
Добавьте метод increaseBalance, принимающий целое число, на которое будет увеличиваться баланс банковского счета.

Создайте производный от Runnable класс BankAccountRunnable, который принимает в конструкторе BankAccount и 10 раз увеличивает его баланс на 10 единиц,
каждый раз перед увеличением ожидая рандомное время от 0 до 100 милисекунд.


В main создайте один экземпляр BankAccount.
В main создайте один экземляр класса BankAccountRunnable, передав туда ссылку на BankAccount и запустите его 5 раз на пуле потоков с 3 тредами.


Распечатайте баланс банковского счета, дождавшись остановки пула потоков.


 */
public class HomeWorkLes33_15_10_23 {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();

       // bA.setBalance(0);
        System.out.println("Начальный баланс: " + bA.getBalance());
        System.out.println("Текущий баланс: " + bA.getBalance());

//        Runnable bAR = new BankAccountRunnable(bA);

        //пул потоков
        ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(new BankAccountRunnable(bA));
        service.submit(new BankAccountRunnable(bA));
        service.submit(new BankAccountRunnable(bA));
        service.submit(new BankAccountRunnable(bA));
        service.submit(new BankAccountRunnable(bA));
//        service.submit(bAR);
//        service.submit(bAR);
//        service.submit(bAR);
//        service.submit(bAR);
//        service.submit(bAR);

        service.shutdown();

        System.out.println("Текущий баланс (after 5 service.submit(bAR)): " + bA.getBalance());
    }

}
/*
1 уровень сложности: Создайте класс BankAccount c приватным целым полем balance, добавьте геттер и сеттер.
Добавьте метод increaseBalance, принимающий целое число, на которое будет увеличиваться баланс банковского счета.
 */

class BankAccount {
    private static int balance;

    public static int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static int increaseBalance (int increase)
    {
        return balance += increase;
    }

}

/*
Создайте производный от Runnable класс BankAccountRunnable, который принимает в конструкторе BankAccount и 10 раз увеличивает его баланс на 10 единиц,
каждый раз перед увеличением ожидая рандомное время от 0 до 100 милисекунд.
 */
class BankAccountRunnable implements Runnable {
    private BankAccount bankAccount;

    public BankAccountRunnable(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        Random rnTime = new Random();
        System.out.println("bankAccount.getBalance() before: " + BankAccount.getBalance());
        for (int i = 0; i < 10; i++ ) {
            try {
                Thread.sleep(rnTime.nextInt(100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            BankAccount.increaseBalance(10);
        }
        System.out.println("Thread with id: " + Thread.currentThread().getId());
        System.out.println("bankAccount.getBalance(): " + BankAccount.getBalance());
    }

}
/*
Почему такой результат??? Не доезжаю!!!

Начальный баланс: 0
Текущий баланс: 0
Текущий баланс (after 5 service.submit(bAR)): 0
bankAccount.getBalance() before: 0
bankAccount.getBalance() before: 0
bankAccount.getBalance() before: 0
Thread with id: 17
bankAccount.getBalance(): 210
bankAccount.getBalance() before: 210
Thread with id: 15
bankAccount.getBalance(): 260
bankAccount.getBalance() before: 260
Thread with id: 16
bankAccount.getBalance(): 360
Thread with id: 17
bankAccount.getBalance(): 480
Thread with id: 15
bankAccount.getBalance(): 490

Process finished with exit code 0

 */