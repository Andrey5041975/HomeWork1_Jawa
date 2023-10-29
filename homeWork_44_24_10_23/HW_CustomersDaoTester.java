package lesson44.homeWork_44_24_10_23;

import java.util.List;

public class HW_CustomersDaoTester {
    public static void main(String[] args) {

        HW_CustomersDao customers = new HW_CustomersDao();

        System.out.println("---   getCustomerById   ---" );
        System.out.println("---   Id = 2002   ---" );
        HW_Customers customers2002 = customers.getCustomerById(2002);
        System.out.println("customers2002 " + customers2002);
        System.out.println();

        HW_Customers Ivan = new HW_Customers(4002, "Ivan", "Warsaw", 250, 1002);
        customers.create(Ivan);
        //System.err.println(customers.delete(Ivan));

        System.out.println("---   Update   ---" );
        System.out.println("---   change citi from Warsaw to Poznan   ---" );
        HW_Customers customersIvan = customers.getCustomerById(4002);
        System.out.println("customersIvan " + customersIvan);
        Ivan.setCity("Poznan");
//        Ivan.setRating(350);
        customers.update(Ivan);
        System.out.println("customers Ivan " + customers.getCustomerById(4002));
        System.out.println();

        System.out.println("---   getAll   ---" );
        List<HW_Customers> l = customers.getAll();
        l.forEach(System.out::println);



    }
}
