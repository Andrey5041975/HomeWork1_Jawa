import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x = ");
        int x = scanner.nextInt();
        System.out.println("Введите число y = ");
        int y = scanner.nextInt();

            change_place(x,y);
        if ( SumEvenOrOdd(x,y)  == 0) {
                System.out.println(true);
            }
        else {
            System.out.println(false);
        }


        IsPlanetSave planetSave = new IsPlanetSave();
        boolean planetSave1;
        System.out.println("Температура в норме? Введите да - 1 или нет - 0 ");
        if (scanner.nextInt() == 1) {planetSave.isTemperatureNorm = true;}
        else {planetSave.isTemperatureNorm = false;
            System.out.println("Что-то тут у нас температура не в порядке!");}

        System.out.println("Углукислый газ в норме? Введите да - 1 или нет - 0 ");
        if (scanner.nextInt() == 1) {planetSave.isCountCO2Norm = true;}
        else {planetSave.isCountCO2Norm = false;
            System.out.println("Надо уменьшать выбросы СО2");}

        System.out.println("Народонаселение в норме? Введите да - 1 или нет - 0 ");
        if (scanner.nextInt() == 1) {planetSave.isCountOfPeopleNorm = true;}
        else {planetSave.isCountOfPeopleNorm = false;
            System.out.println("Пора расширяться на другие планеты!"); }

        System.out.println("Как там животные? Хорошо - введите да - 1, не очень - введите - 0 ");
        if (scanner.nextInt() == 1) {planetSave.isAnimalsNorm = true;}
        else {planetSave.isAnimalsNorm = false;
            System.out.println("Спасите животных");}

        /*boolean isTemperatureNorm = true;
        boolean isCountCO2Norm = true ;
        boolean isCountOfPeopleNorm = true;
        boolean isNuclearBombNorm = true;
        boolean isWaterPure =true ;
        static boolean isAirFresh =true;
        boolean isForestNorm = true;
        boolean IsAnimalsNorm =true;
        boolean isMeteorite = true;
        boolean isIdiot = true; */



        if (planetSave1 = planetSave.isCountCO2Norm && planetSave.isTemperatureNorm && planetSave.isAnimalsNorm && planetSave.isCountOfPeopleNorm && planetSave.isForestNorm && !planetSave.isIdiot && !planetSave.isMeteorite){

        System.out.println("Есть ли угроза для планеты? " + "Нет угрозы нет все в порядке");
        }
        else {
            System.out.println("Есть ли угроза для планеты? " + "Довели планету до ручки! Придется наводить порядок!!!");

        }
   }

    public static void change_place (int x, int y){
        x = x + y ; //x= 30 y= 20
        y = x - y; //x= 30 y = 10
        x = x - y;
        System.out.println( "А теперь x = " + x + " y =  " + y );
    }

    public static int SumEvenOrOdd (int x, int y){
        int Sum = x + y;
        if (Sum % 2 == 0) {

            System.out.println("Сумма чисел " +x + "+" +y + "= " + Sum + " - четная");
            return Sum = 0;
           }
        else {
            System.out.println("Сумма чисел " +x + "+" +y + "= " + Sum + " - нечетная");}
        return Sum = 1;
        }

}