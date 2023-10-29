package lesson44.homeWork_44_24_10_23;

import lesson44.dao.Sales;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
 1 уровень сложности: Добавьте DAO класс для покупателей - CustomersDao - операциями
Customer getCustomerById(int id)
List getAll()
int create(Customer customer)
int delete(Customer customer)
int update(Customer customer)
 */
public class HW_CustomersDao {

    private static String url ="jdbc:sqlite:shop.db";
    HW_Customers getCustomerById(int id)
    {
        try (
                Connection connection = DriverManager.getConnection(url);
                PreparedStatement pstmt = connection.prepareStatement(
                        "select cnum, cname, city, rating, snum from customers where cnum = ? "
                );
        )
        {
            pstmt.setInt(1, id);
            try (
                    ResultSet rs = pstmt.executeQuery()
            )
            {
                 /*
   cnum int primary key not null,
   cname text not null,
   city text not null,
   rating integer not null,
   snum int not null
    */

                while (rs.next())
                {
                    int cnum = rs.getInt("cnum");
                    String cname = rs.getString("cname");
                    String city = rs.getString("city");
                    int rating = rs.getInt("rating");
                    int snum = rs.getInt("snum");
                    return new HW_Customers(cnum, cname, city, rating, snum);
                }
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        return null;
    }
    List getAll()
    {
        List<HW_Customers> customers = new ArrayList<>();
        try (
                Connection connection = DriverManager.getConnection(url);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("select * from customers");
        )
        {
            while (rs.next())
            {
                int cnum = rs.getInt("cnum");
                String cname = rs.getString("cname");
                String city = rs.getString("city");
                int rating = rs.getInt("rating");
                int snum = rs.getInt("snum");
                customers.add(new HW_Customers(cnum, cname, city, rating, snum));
            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        return customers;
    }
    int create(HW_Customers customer)
    {
        try (
                Connection connection = DriverManager.getConnection(url);
                PreparedStatement pstmt = connection.prepareStatement(
                        "insert into customers (cnum, cname, city, rating, snum) values (?,?,?,?,?) "
                );
        ) {
            pstmt.setInt(1, customer.getCnum());
            pstmt.setString(2, customer.getCname());
            pstmt.setString(3, customer.getCity());
            pstmt.setInt(4, customer.getRating());
            pstmt.setInt(5, customer.getSnum());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }
    int delete(HW_Customers customer)
    {
        try (
                Connection connection = DriverManager.getConnection(url);
                PreparedStatement pstmt = connection.prepareStatement(
                        "delete from customers where cnum= ? "
                );
        ) {
            pstmt.setInt(1, customer.getCnum());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return 0;

    }
    int update(HW_Customers customer)
    {
        try (
                Connection connection = DriverManager.getConnection(url);
                PreparedStatement pstmt = connection.prepareStatement(
                        "update customers set cname=? , city=? , rating=? , snum=? where cnum = ? "
                );
        ) {
            pstmt.setInt(5, customer.getCnum());
            pstmt.setString(1, customer.getCname());
            pstmt.setString(2, customer.getCity());
            pstmt.setInt(3, customer.getRating());
            pstmt.setInt(4, customer.getSnum());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }

}
