package home1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number = 999_999_999;
        phone1.model = "iphone";
        phone1.weight = 250;
        phone1.name = "Ivan";


        Phone  phone2 = new Phone();
        phone2.number = 888_888_888;
        phone2.model = "samsung";
        phone2.weight = 350;
        phone2.name = "Serg";

        Phone phone3 = new Phone();
        phone3.number = 777_777_777;
        phone3.model = "huawei";
        phone3.weight = 300;
        phone3.name = "Anna";

        System.out.println("Модель телефона " + phone1.model + " номер " + phone1.number + " вес " +  phone1.weight);
        System.out.println("Модель телефона " + phone2.model + " номер " + phone2.number + " вес " + phone2.weight);
        System.out.println("Модель телефона " + phone3.model + " номер " + phone3.number + " вес " + phone3.weight);


        receiveCall(phone1);
        getNumber(phone1);

        receiveCall(phone2);
        getNumber(phone2);

        receiveCall(phone3);
        getNumber(phone3);


    }
    public static void receiveCall(Phone p){
        System.out.println("Звонит " + p.name);
    }

    public static void getNumber(Phone p){
        System.out.println("номер " + p.number);
    }


}
