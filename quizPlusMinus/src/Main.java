import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String answer;
        String[] players = new String[2];
        int[] points = {0, 0};
        int i = 0;
        System.out.println("Добрый день. Вы решили сыграть в плюс-минус - гениальнейшую игру, проверяющую Ваши математические способности.");
        System.out.println("Рады Вас приветствовать. Коротко о правилах. Играть можно вдвоем. За каждый правильный ответ Вы получаете 5 баллов,");
        System.out.println("за неправильный - 5 баллов снимаются. Победителя ждет СУПЕРИГРА!!!");
        System.out.println("Начинаем");


        //System.out.println("Да нажмите - Y, Нет нажмите - N");
        Scanner scan = new Scanner(System.in);
//        System.out.println();
//
//        answer = scan.next();
        answer = "Y";
        System.out.println(("Сколько игроков примет участие? 1 или 2"));
        int countOfPlayers = scan.nextInt();
        System.out.print("Введите имя первого игрока  ");
        players[0] = scan.next();
        System.out.println();

        System.out.println(players[0]);


        boolean gameOver = false;


        while (!gameOver) {
            for (i = 1; i < 4; i++) {

                int raund = i;

                if (i == 1) {
                    System.out.println();
                    if (countOfPlayers == 2) {System.out.print("Введите имя второго игрока ");
                        players[1] = scan.next();
                    }

                    System.out.println("Первый раунд - разминка");
                }
                if (i == 2) {
                    System.out.println();
                    System.out.println("Второй раунд - посложнее");
                }
                if (i == 3) {
                    System.out.println();
                    System.out.println("Третий раунд - СУПЕРИГРА !");
                }

                if (countOfPlayers == 1) {

                    int nomerPlayers = 0;
                    first(raund, players, points, nomerPlayers);
                    System.out.println("Уважакмый " + players[0] + " Вы заработали " + points[0] + " баллов");

                } else if (countOfPlayers == 2) {
                    System.out.println();

                    System.out.println(players[0] + " " + players[1]);
                    int nomerPlayers = 0;
                    System.out.println("Играет  " + players[nomerPlayers]);
                    first(raund, players, points, nomerPlayers);

                    nomerPlayers = 1;
                    System.out.println("Играет  " + players[nomerPlayers]);
                    first(raund, players, points, nomerPlayers);

                    //вывод победителя
                    if (points[0] > points[1]) {
                        System.out.println("Уважакмый " + players[0] + " Вы заработали " + points[0] + " баллов");
                        System.out.println("Уважакмый " + players[1] + " Вы заработали " + points[1] + " баллов");
                    } else {
                        System.out.println("Уважакмый " + players[1] + " Вы заработали " + points[1] + " баллов");
                        System.out.println("Уважакмый " + players[0] + " Вы заработали " + points[0] + " баллов");
                    }


                }
            }

            System.out.println("Играем еще? Y/N");
            answer = scan.next();
            if (answer.equals("Y") || answer.equals("y")) {
                gameOver = false;
            } else {
                gameOver = true;
                System.out.println();
                System.out.println("До новых встреч!");
            }

        }
    }


    public static void first(int raund, String players[], int points[], int nomerPlayers){

        String[] answerPositive ={"Правильный ответ! ", "Вы молодец! ", "Опять верно ", "Правильно ", "Отлично ", "Так держать! " };
        String[] answerNegative ={"Ответ неверный ", "Стоит подумать ", "Нет ", "Неверно ", "Вы ошиблись ", "Не пойдет " };
        String[] mathOperations ={"Сложите два числа ", "Разность двух чисел ", "Результат умножения", "Результат деления "};
        int i = 0;


        if (raund == 1) {raund=10;};
        if (raund == 2) {raund=100;};
        if (raund == 3) {raund=1000;};
        Random intRand1 = new Random();
        //int intRand2 = 0;
        int num1, num2;

        for (i = 1; i!=6; i++ ) {

            int scanRez = 0;

            // Сложение
            num1 = intRand1.nextInt(raund);
            num2 = intRand1.nextInt(raund);
            Scanner scan = new Scanner(System.in);

            if (i == 1 || i==5) {
                System.out.print(mathOperations[0] + " " + num1 + " + " + num2 + " = ");
                scanRez = scan.nextInt();
                if (scanRez == (num1 + num2)) {
                     System.out.println(answerPositive[intRand1.nextInt(6)] + " Вы заработали 5 баллов");
                    //Присваиваем 5 баллов игроку
                points[nomerPlayers] = points[nomerPlayers] + 5;
                } else {
                    System.out.println(answerNegative[intRand1.nextInt(6)] + "Правильный ответ " + (num1 + num2) + " Вы потеряли 5 баллов");
                    //отнимаем 5 баллов
                    points[0] = points[0] - 5;
                }
                    //разность
            } else if (i == 2) {
                System.out.print(mathOperations[1] + " " + num1 + " - " + num2 + " = ");
                scanRez = scan.nextInt();
                if (scanRez == (num1 - num2)) {
                    System.out.println(answerPositive[intRand1.nextInt(6)] + " Вы заработали 5 баллов");
                    //Присваиваем 5 баллов игроку
                    points[nomerPlayers] = points[nomerPlayers] +5;
                } else {
                    System.out.println(answerNegative[intRand1.nextInt(6)] + "Правильный ответ " + (num1 - num2) + " Вы потеряли 5 баллов");
                    //отнимаем 5 баллов
                    points[nomerPlayers] = points[nomerPlayers] - 5;
                        }
                //умножение
            } else if (i == 3) {
                num2 = intRand1.nextInt(10);
                System.out.print(mathOperations[2] + " " + num1 + " * " + num2 + " = ");
                scanRez = scan.nextInt();
                if (scanRez == (num1 * num2)) {
                    System.out.println("Правильный ответ. Вы заработали 5 баллов");
                    //Присваиваем 5 баллов игроку
                    points[nomerPlayers] = points[nomerPlayers] + 5;
                } else {
                    System.out.println("Ответ неверный. Правильный ответ " + (num1 * num2)+ " Вы потеряли 5 баллов");
                    //отнимаем 5 б
                    points[nomerPlayers] = points[nomerPlayers] - 5;
                      }

                //деление
            } else if (i == 4) {
                num2 = intRand1.nextInt(10) +1;
                num1 = num1 * num2;
                System.out.print(mathOperations[3] + " " + num1 + " / " + num2 + " = ");
                scanRez = scan.nextInt();
                if (scanRez == (num1/num2)) {
                    System.out.println(answerPositive[intRand1.nextInt(6)] +  " Вы заработали 5 баллов");
                    //Присваиваем 5 баллов игроку
                    points[nomerPlayers] = points[nomerPlayers] +5;
                } else {
                    System.out.println(answerNegative[intRand1.nextInt(6)]  + "Правильный ответ " + (num1/num2)+ " Вы потеряли 5 баллов");
                    //отнимаем 5 баллов
                    points[nomerPlayers] = points[nomerPlayers] - 5;
                }

            }

        }



        }



    }
