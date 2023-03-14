import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int x333 = 333;
        hextodec(x333);

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для перевода в 16 систему счисления");
        int num = in.nextInt();
        int n0sn = 16;
        dectohex(num, n0sn);

        int y = 637;
        //int dtb = 35;



        System.out.println("Введите число для перевода в 2 систему счисления");
        int dtb = in.nextInt();
        dectobin(dtb);

        // Разложить число 200345 на разряды в десятичной системе.
        //тут вроде все верно работает
        System.out.println("Введите число для разложения на десятичные множители");
        int nD = in.nextInt();
        //int nD =2003547;
        String nDstr = Integer.toString(nD);
        nDstr = nDstr.trim();
        String outStr = "";
        //System.out.println(nDstr.charAt(0) + " " + nDstr.charAt(1) + " "  + nDstr.charAt(2) + " " +  nDstr.charAt(3) + " " + nDstr.charAt(4) + " " + nDstr.charAt(5) );
        for (int i = 0; i < nDstr.length(); i++) {
            //System.out.println("Длина строки " + nDstr.length() );
            char ouСр = nDstr.charAt(i);
            if (nDstr.charAt(i) != '0') {
              if (i == (nDstr.length() - 1) ) {
                    outStr = outStr + ouСр;}
               else {
                  outStr = outStr + ouСр + " * 10^" + (nDstr.length() - i - 1) + " + ";
              }
               }

        }
                System.out.println("Число " + nDstr + " = " + outStr);
    }

    //Перевести число 333 из шестнадцатиричной в десятичную.
    public static void hextodec (int x333) {
        double res = 3*Math.pow(16, 2) + 3*Math.pow(16, 1) + 1*3;
        int r = (int) res;
        System.out.println("Перевод из 10 в 2. Число " + x333 + " в 16  " + "равно " + r + " в 10" );
        System.out.println();
    }

    //Перевести 637 из десятичной в шестнадцатиричную
    //а тут работает для чисел больше 16
    // не работает например с 96 96/16=6 ост 0!!! , к сожалению не добил еще это
    public static void dectohex (int num, int n0sn) {
        int a0st= num % n0sn;
        int aCel = num / n0sn;
        String outStr = "";


             while (a0st > 0) {
                 String sa0st = String.valueOf(a0st);
                 switch (a0st) {
                     case 10:
                         sa0st = "A";
                         break;
                     case 11:
                         sa0st = "B";
                         break;
                     case 12:
                         sa0st = "C";
                         break;
                     case 13:
                         sa0st = "D";
                         break;
                     case 14:
                         sa0st = "E";
                         break;
                     case 15:
                         sa0st = "F";
                         break;
                 }
                 outStr = sa0st + outStr;
                 a0st = aCel % n0sn;
                 aCel = aCel / n0sn;

               }



        System.out.println("Перевод из 10 в 16. Число " +  num + " в 10 равно " + outStr + " в 16");
        System.out.println();

     }




    public static void dectobin (int dtb) {
        System.out.println( Integer.toBinaryString(dtb));


    }


}