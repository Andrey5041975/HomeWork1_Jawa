import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account account = new Account();

        Car volvo = new Car();
        volvo.price =  5000;
        volvo.category = "stylish";
        Car mercedes = new Car();
        mercedes.price = 10000;
        mercedes.category = "stylish";

        Phone iPhone = new Phone();
        iPhone.price = 2500;
        iPhone.category = "scientist";
        Phone huawei = new Phone();
        huawei.price = 1000;
        huawei.category = "scientist";

        Plane airBus = new Plane();
        airBus.price = 100000;
        airBus.category = "captain";
        Plane rainAir = new Plane();
        rainAir.price = 50000;
        rainAir.category = "captain";

        DownshifterKit downshifterKit = new DownshifterKit();
        downshifterKit.price = 100;
        downshifterKit.category = "programmer";

        Scanner amountScan = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        account.currentAmount = amountScan.nextDouble();
        System.out.println("Выберите категорию:  " +
                " 1 - stylish; " +
                " 2 - scientist;" +
                " 3 - captain" +
                " 4 - programmer");

        Scanner catScan = new Scanner(System.in);
        int  iScan = catScan.nextInt();
//        switch (catScan.nextInt()) {
//            case 1: account.category = "stylish";
//            break;
//            case 2: account.category ="scientist";
//            break;
//            case 3: account.category = "captain";
//            break;
//            case 4: account.category = "programmer";
//            break;
//        }
        if (iScan == 1) {account.category = "stylish";}
        if (iScan == 2) {account.category = "scientist";}
        if (iScan == 3) {account.category = "captain";}
        if (iScan == 4) {account.category = "programmer";}
        System.out.println("Имеем на счету: " + account.currentAmount + "$" + " категория: " + account.category);
        vybor(account, volvo, mercedes, iPhone, huawei, airBus, rainAir, downshifterKit);
}

    public static void vybor(Account account, Car volvo, Car mercedes, Phone iPhone, Phone huawei, Plane airBus, Plane rainAir, DownshifterKit downshifterKit) {

        if ((account.category == downshifterKit.category) && (account.currentAmount >= downshifterKit.price)) {
            System.out.println("Можем предложить downshifterKit за " + downshifterKit.price);}

        if (account.currentAmount < 50) {System.out.println("С данной суммой Ваш выбор ограничен");}

        if ((account.category == iPhone.category) && (account.currentAmount >= iPhone.price)) {System.out.println("Покупаем  iPhone за "+ iPhone.price);}
        if ((account.currentAmount >= huawei.price) && (account.category == huawei.category)) {System.out.println("Покупаем  huawei " + huawei.price);}

        if ((account.currentAmount >= volvo.price) && (account.category == volvo.category)) {System.out.println("Покупаем  volvo " + volvo.price);}
        if ((account.currentAmount >= mercedes.price) && (account.category == mercedes.category)) {System.out.println("Покупаем  mercedes" + mercedes.price);}

        if ((account.currentAmount >= airBus.price) && (account.category == airBus.category)) {System.out.println("Покупаем  airBus " + airBus.price);}
        if ((account.currentAmount >= rainAir.price) && (account.category == rainAir.category)) {System.out.println("Покупаем  rainAir " + rainAir.price);}

        }
    }
