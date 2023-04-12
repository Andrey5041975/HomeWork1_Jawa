import java.util.Scanner;

public class Main {
    //    public static void main(String[] args) {
//
//    }
    public static void main(String[] args) {


        Fruit[] fruits = new Fruit[]{
                new Fruit("apple", true, "green"),
                new Fruit("cherry", true, "red/white/black"),
                new Fruit("banana", true, "yellow/green")
        };

            char[] array = {'1', 'b', 'c'};
            for (char x : array) {
            System.out.println();
            }


            int iterationNum = 0;
            //(Переменная для хран. фруктов) : (название массива с фруктами)
                System.out.println("Цикл for each");
            for (Fruit currentFruit : fruits) {
                System.out.println("Iteration: " + iterationNum);
                System.out.println("Fruit name: " + currentFruit.name);
                System.out.println("Fruit color: " + currentFruit.color);
                System.out.println("Fruit is tasty?: " + currentFruit.isTasty);
                System.out.println();
                iterationNum++;
            }
                System.out.println("Цикл for со счетчиком");
            iterationNum = 0;
            for (iterationNum = 0; iterationNum < fruits.length; iterationNum++) {
                Fruit fruit = fruits[iterationNum];
                System.out.println("Iteration: " +iterationNum);
                System.out.println("Fruit name: "+fruit.name);
                System.out.println("Fruit color: " +fruit.color);
                System.out.println("Is fruit tasty: " + fruit.isTasty);
                System.out.println();
            }

        System.out.println("Выберите название блюда из списка:");
        System.out.println("1 - салат Цезарь");
        System.out.println("2 - салат Оливье классический");
        System.out.println("3 - салат Ёжик");
        System.out.println("4 - салат ВнегретЪ 1914 года");

        System.out.println("5 - яичница Глазунья");
        System.out.println("6 - яйцо под майонезом");
        System.out.println("7 - яйцо вкрутую");
        System.out.println("8 - яйцо всмятку");

        Scanner scan = new Scanner(System.in);
        int dishNumber = scan.nextInt();
        switch (dishNumber) {
            case 1:
                System.out.println("1. Промыть, просушить и нарвать на небольшие кусочки листья салата, отложить в холодильник.");
                System.out.println("2. В горячую сковородку положить 1 столовую ложку сливочного масла. После того, как оно полностью расплавится и начнет шипеть, кинуть нарезанный на пластины зубчик чеснока.");
                System.out.println("3. Куриную грудку нарезать на кусочки приблизительно 1×3 см. Положить в сковороду к чесноку и маслу. Обжаривать на сильном огне приблизительно 10 минут до румяной корочки. Снять с огня." );
                System.out.println("В ту же сковородку добавить еще одну столовую ложку сливочного масла и второй зубчик чеснока.");
                System.out.println("4. В это время нарезать на небольшие кубики хлеб. Положить в сковороду и обжаривать до румяной корочки. Желательно непрерывно помешивать, чтобы не подгорело. ");
                System.out.println("Достать листья салата, туда же положить обжаренную куриную грудку, помидоры, нарезанные тонкой соломкой.");
                System.out.println("5. Заправить соусом «Цезарь». Перемешать. Сверху положить получившиеся сухарики и натереть сыр.");
                break;
            case 2:
                System.out.println("1. Картофель и морковь вымойте щеткой и отварите в подсоленной воде до готовности. ");
                System.out.println("Яйца отварите отдельно, не допуская переваривания желтка. Очистите и нарежьте кубиками со стороной 5 мм. Такими же кубиками нарежьте ветчину.");
                System.out.println("2. Смешайте все ингредиенты в салатнике, добавьте мелко нарезанный зеленый лук и укроп. ");
                System.out.println("Приправьте черным перцем, заправьте майонезом и поставьте в холодильник.");
                System.out.println("3. Если соленые огурцы с крупными семенами - удалите их. Затем нарежьте кубиками такого же размера.");
                System.out.println("Сложите в отдельный контейнер. Слейте жидкость с горошка, горошек переложите в отдельный контейнер.");
                System.out.println("4. Перед подачей на стол добавьте в салат соленые огурцы и зеленый горошек");
                System.out.println("Еще раз перемешайте салат, попробуйте и при необходимости добавьте соль и черный перец.");
                break;
            case 3:
                System.out.println("1. Яйца заранее сварить вкрутую (10 минут) и остудить в холодной воде.");
                System.out.println("2. Колбасу и яйца нарезать кубиками. Сыр натереть на тёрке.");
                System.out.println("3. Соединить колбасу, сыр, яйца и кукурузу (без жидкости)");
                System.out.println("4. Чеснок очистить и выдавить через чеснокодавилку.");
                System.out.println("5. Заправить салат майонезом и перемешать все ингредиенты.");
                break;
            case 4:
                System.out.println("1. Сварить картофель и свеклу, охладить их. Свежую капусту мелко нарезать и залить кипятком. " );
                System.out.println("Оставить минут на 10.");
                System.out.println("2. Приготовить заправку для винегрета. Смешать слабый уксус с сахаром, горчицей и");
                System.out.println("нерафинированным растительным маслом. Можно поперчить по вкусу.");
                System.out.println("3. Соленые огурцы очистить от шкурки и нарезать на кубики.");
                System.out.println("Маринованные грибы нарезать небольшими кусочками.");
                System.out.println("4. Вареный картофель нарезать кубиками. Капусту откинуть на дуршлаг, затем отжать её от влаги.");
                System.out.println("Соединить все в миске, добавить отжатую от влаги капусту.");
                System.out.println("5. Добавить консервированную фасоль и каперсы.");
                System.out.println("6. Вареную свеклу нарезать кубиками и добавить в салатник к другим овощам. Полить салат заправкой и перемешать.");
                break;
            case 5:
                System.out.println("1. Поставьте сковородку (лучше всего маленькую с толстым дном) на большой огонь. Налейте масла.");
                System.out.println("Когда масло нагреется (но еще не закипит), осторожно разбейте яйца.");
                System.out.println("2. Через 30 секунд уменьшите огонь до среднего и жарьте еще примерно минуту, периодически наклоняя сковородку в разные стороны ");
                System.out.println("и поливая яичницу горячим жиром. Переложите на теплую тарелку и немедленно подавайте.");
                break;
            case 6:
                System.out.println("1. Сварить яйца вкрутую (см. рецепт №7");
                System.out.println("2. Очитстить яйца и разрезать пополам.");
                System.out.println("3. Сверху смазать каждое яйцо майонезом.");
                System.out.println("4. Поставить в холодильник на 5 минут, чтобы охладить закуску.");
                break;
            case 7:
                System.out.println("Чтобы правильно сварить яйца вкрутую, кладем их в холодную воду и через");
                System.out.println("1 минуту после закипания, убавив огонь, варим 7-8 минут.");
                System.out.println("Важно не переварить яйца, иначе белок станет резиновым на вкус,");
                System.out.println("а желток покроется неприятным сероватым налетом");
                break;
            case 8:
                System.out.println("Если положить яйца в холодную воду, то нужно дождаться закипания, убавить огонь и");
                System.out.println("варить в течение 2 минут (и желток, и белок останутся жидкими) или 3 минуты (желток");
                System.out.println("будет жидким, а белок – почти твердым – это мой любимый вариант).");
                System.out.println("Есть еще один вариант. Аккуратно кладем яйца в кипящую воду (они не должны быть");
                System.out.println("холодными!), оставляем на 1 минуту. Потом снимаем с огня, закрываем крышкой и");
                System.out.println("выдерживаем 5 минут. В результате вы получите сваренные всмятку яйца, где желток будет");
                System.out.println("жидким, а белок – твердым.");
                break;
            default:
                System.out.println("К сожалению в наличии пока только 8 рецептов");
        }
        }
    }


