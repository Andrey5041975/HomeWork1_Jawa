package lesson14.homeWork;

import lesson14.Fruit;

import java.util.*;


public class EmployeeTester {
    //List<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee(1, "Ivan Ivanov", 25, 105.5),
                new Employee(22, "Sergey Sergeev", 27, 155.5),
                new Employee(3, "Petr Petrov", 29, 125.5),
                new Employee(44, "Natalia Svetlova", 33, 135.5),
                new Employee(5, "Svetlana Debrova", 45, 145.7)
        ));

        //Сортировка по Id
        employees.sort(
                Comparator.comparingInt(Employee::getId)
        );

//        employees.sort(
//                (e1, e2) -> Integer.compare(e1.getId(), e2.getId())
//        );

//        employees.sort(
//                new Comparator<Employee>() {
//                    @Override
//                    public int compare(Employee e1, Employee e2) {
//                        return Integer.compare(e1.getId(), e2.getId());
//                    }
//                }
//        );
        //Вывод результата сортировки по Id
        System.out.println("Сортировка по id " );
        for (Employee e: employees
        ) {
            System.out.println(String.format("   %-25.20s", e.getId() + "   " +e.getName()) + "   " + e.getAge() + e.getSalary());
        }



        //Сортировка по возрасту age

        employees.sort(Employee.ageComparator);

//        employees.sort(
//                new Comparator<Employee>() {
//                    @Override
//                    public int compare(Employee e1, Employee e2) {
//                        return Integer.compare(e1.getAge(), e2.getAge());
//                    }
//                }
//        );

        //Вывод результата сортировки по возрасту age
        System.out.println();
        System.out.println("Сортировка по возрасту: ");
        for (Employee e: employees
             ) {
            System.out.println(String.format("   %-25.20s", e.getName()) + "   " + e.getAge());
        }

        //Cортировка по имени по убыванию
        employees.sort(
                 Comparator.comparing(Employee::getName).reversed());
        //{
//                    @Override
//                    public String comparing(Employee e1, Employee e2) {
//                        return String.comparing(e1.getName(), e2.getName());
//                    }
//
//                }
//        );
        //Вывод результата сортировки по имени по убыванию
        System.out.println();
        System.out.println("Сортировка по имени по убыванию " );
        for (Employee e: employees
        ) {
            System.out.println(e);
        }

        employees.sort(Employee.salaryComparator);
        System.out.println(" z/p " + employees);

        //sortEmployees((Collection) employees, (Employee) Employee.nameComparator);
        sortEmployees((Collection) employees, (Employee) Employee.nameComparator);
        //sortEmployees((Collection) employees, (Collection) Employee.nameComparator);
        System.out.println("*  " + employees);
    }



    public static void sortEmployees(Collection emps, Employee comps){};
}
