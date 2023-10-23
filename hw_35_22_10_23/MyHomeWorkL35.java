package lesson35.hw_35_22_10_23;

import lesson14.retro.FrankfurterService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import java.util.function.Function;


/*
 1 уровень сложности: Воспользуйтесь функцией convert
 И вызовите последовательно перевод 10 евро ("EUR") в фунты ("GBP") и потом для полученной
 суммы вызовите перевод из фунтов в доллары ("USD") воспользовавшись CompletableFuture
 */
public class MyHomeWorkL35 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Double> cfConvert = CompletableFuture.supplyAsync(
                () -> Converter.convert(10.0, "EUR", "GBP")
        )
                .thenApply(
                        aDouble -> Converter.convert(aDouble, "GBP", "USD")
                        // new Function<Double, Double>() {
                        //    @Override
                        //    public Double apply(Double aDouble) {
                        //        return Converter.convert(aDouble, "GBP", "USD");
                        //    }

                );


        System.out.println(cfConvert.get());
        System.exit(0);
    }


    public static class Converter {
        public static double convert(double amount, String from, String to) {
            FrankfurterService service = new Retrofit.Builder()
                    .baseUrl("https://api.frankfurter.app")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(FrankfurterService.class);
            try {
                return service.convert(amount, from, to).execute().body().rates.get(to);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
