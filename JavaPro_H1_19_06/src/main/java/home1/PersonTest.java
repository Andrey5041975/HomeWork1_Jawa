package home1;

public class PersonTest {


    public static void main(String[] args) {

        Person firstPerson = new Person();
        firstPerson.fullName = "Ivan";
        firstPerson.age = 33;



        Person secondPerson = new Person("Sergey", 35);

        Person thirdPerson = new Person();
        thirdPerson.setFullName("Nikolay");
        thirdPerson.setAge(41);

        move(firstPerson);
        talk(firstPerson);
    }
    public static void move(Person p){
        System.out.println("Первый человек " + p.fullName  + " идет ");
    }

    public static void talk(Person p){
        System.out.println("Первый человек " + p.fullName  + " говорит ");
    }

}
