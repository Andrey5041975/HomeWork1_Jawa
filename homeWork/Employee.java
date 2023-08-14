package lesson14.homeWork;


import java.util.Collections;
import java.util.Comparator;

/*
 1 уровень сложности: 1. Создайте класс Employee с полями int id, String name, int age, double salary
Реализуйте в этом классе Comparable по полю id
В виде статических полей добавьте компараторы для сортировки по возрасту, имени и по зарплате


2. Создайте коллекцию с сотрудниками и отсторируйте ее вначале по возрасту и потом по имени по убыванию


3**. Напишите статическую функцию, которая принимает на вход:
    коллекцию для сортировки
    список компараторов
и сортирует переданную коллекцию составным компаратором из переданного списка
public static void sortEmployees(Collection emps, Collection> comps)
 */
public class Employee {

    private int id;
    private  String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static Comparator<Employee> ageComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Integer.compare(e1.getAge(), e2.getAge());
        }
    };

    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };


    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
    };


}
