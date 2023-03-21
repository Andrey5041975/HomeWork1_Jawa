import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        String strVar = "I study Basic Java!";

        System.out.println("Задание 1");
        System.out.println("Исходная строка - " + strVar);
        System.out.println("Последний символ в строке - " + strVar.charAt(strVar.length()-1));
        if (strVar.contains("Java")) {
            System.out.println("Проверка - содержит ли исходная строка запись - Java. " + "Ответ - да, сожержит");
        }
        System.out.println("Заменим все символы а на о. Получим: " + strVar.replace('a' , 'o'));
        System.out.println("Преобразование к верхнему регистру: " + strVar.toUpperCase());
        System.out.println("Преобразование к нижнему регистру: " + strVar.toLowerCase());
        System.out.println("Вырежем Java: " + strVar.substring(14, 18));
        System.out.println();

        System.out.println("Задание 2");
           byte bVar = 7;
           int  iVar = 3250;
           float fVar = 456.6599994f;
           long lVar = 287666789;


           int bpVar = bVar;
           long irVar = iVar; byte isVar = (byte) iVar;
           double lrVar = (double) lVar; int lsVar = (int) lVar;
           double frVar = fVar; int fsVar = (byte) fVar;



        System.out.println("Переменная типа byte = " + bVar+ " расширение  " + bpVar);
        System.out.println("Переменная типа integer = " + iVar + " расширение " + irVar + " сужение " + isVar);
        System.out.println("Переменная типа float = " + fVar + " расширение " + frVar + " сужение " + fsVar);
        System.out.println("Переменная типа long = " + lVar + " расширение " + lrVar + " сужение " + lsVar);

    }
}