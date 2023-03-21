import sun.awt.geom.AreaOp;

public class Main {
    public static void main(String[] args) {

        boolean yes = true;
        boolean no = false;

        int number1 = 10;
        int number2 = 5;

        String s1 = "Hello my friend ";
        String s2 = "Goodbye";

        double dnum1 = 1.5;
        double dnum2 = 4.5;


        System.out.println(s1);
        System.out.println("Начинаем " + yes);
        System.out.println("Результат сложения " + number1 + "+" + number2 + "=" + (number1 + number2));
        System.out.println("Результат вычитания " + number1 + "-" + number2 + "=" + (number1 - number2));
        System.out.println("Результат умножени " + number1 + "*" + number2 + "=" + (number1 * number2));
        System.out.println("Результат деления " + number1 + "/" + number2 + "=" + (number1 / number2));
        System.out.println();

        System.out.println("Результат сложения " + dnum1 + "+" + dnum2 + "=" + (dnum1 + dnum2));
        System.out.println("Результат вычитания " + dnum1 + "-" + dnum2 + "=" + (dnum1 - dnum2));
        System.out.println("Результат умножени " + dnum1 + "*" + dnum2 + "=" + (dnum1 * dnum2));
        System.out.println("Результат деления " + dnum1 + "/" + dnum2 + "=" + (dnum1 / dnum2));
        System.out.println();

        sum(number1, number2);
        substract(number1, number2);
        multiply(dnum1, dnum2);
        divide(dnum1, dnum2);
        System.out.println("Ура у нас все вышло и, как не удивительно, считает все верно! " );
          System.out.println("Мы молодцы и можем сьесть пирожок!!!  ...ну или что-нибуди покрепче");
        System.out.println(s2);
    }

    public static void sum(int x, int y) {
        int res = x + y;
        System.out.println("Сложение с помощью метода " + x + "+" + y +"="+ res);
    }

    public static void substract(int x, int y) {
        int res = x - y;
        System.out.println("Вычитание с помощью метода " + x + "-" + y +"="+ res);
    }

    public static void multiply(double x, double y) {
        double res = x * y;
        System.out.println("Умножение с помощью метода " + x + "*" + y +"=" + res);
    }


    public static void divide (double x, double y) {
        double res = x / y;
        System.out.println("Деление с помощью метода " + x + "/" + y +"="+ res);
    }


}






