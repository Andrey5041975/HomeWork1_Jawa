package lesson34.myHW;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/*
 1 уровень сложности: 1. Переделайте B_DontDoLikeThis на CompletableFuture
(последовательное выполнение функций в разных потоках, обработка ошибок)

 */
public class hw_34_17_10_23 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Создайте "первый" поток, который вызывает getName
        // и запускает "второй" поток, в котором выполняется getLength,
        //      передавая туда результат getName в качестве параметра
        // во "втором" потоке вызовите "третий" поток, передав туда результат
        //      getLength и вызовите с ним finish()



        CompletableFuture<Void> cf = CompletableFuture.supplyAsync(
                        () ->  getUserName()
                )
                // thenApplyAsync принимает на вход Function<T,R>
                // и может возвращать значение
                .thenApplyAsync(
                        s -> getLength(s)
                )
                // thenAccept если результат не нужен, а важны сами действия
                .thenAccept(
                        s -> finish(s)
                );

        cf.get();


        CompletableFuture<String> cf_e = CompletableFuture.supplyAsync(() -> getUserName());
        CompletableFuture<String> result = cf_e
                .thenApply(s -> getLength(s))
                .thenApply(i -> "Result is: cf_e " + i)
                .exceptionally(
                        // t -> "Problem: " + t.getMessage();
                        new Function<Throwable, String>() {
                            @Override
                            public String apply(Throwable throwable) {
                                return "Problem " + throwable.getMessage();
                            }
                        }
                )
                ;
        System.out.println(result.get());

        /*
         CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> "234");
       // CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> "hello");
        CompletableFuture<String> result = cf
                .thenApply(s -> Integer.parseInt(s))
                .thenApply(i -> i*i)
                .thenApply(i -> "Result is: " + i)
                .exceptionally(
                        // t -> "Problem: " + t.getMessage();
                        new Function<Throwable, String>() {
                            @Override
                            public String apply(Throwable throwable) {
                                return "Problem " + throwable.getMessage();
                            }
                        }
                )
                ;
         */

    }

    public static String getUserName()
    {
        long time = System.currentTimeMillis();
        if(time % 2 == 0)
            throw new RuntimeException("Something happens");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {}
        return "Alexander";
    }

    public static Integer getLength(String s)
    {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {}
        return s.length();
    }
    public static void finish(Integer i)
    {
        System.out.println("Result is: " + i);
    }

}
