package lesson44.homeWork_44_24_10_23;

import java.sql.*;

public class MyHomeWork {

    public static void main(String[] args) {

        /*
         1 уровень сложности: Распечатайте все заказы определенного покупателя выше определенной суммы.
            И покупатель и сумма должны передваться в виде параметров в параметризованный запрос.
         */

        String url = "jdbc:sqlite:shop.db";

        try (
                Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement();
                // ResultSet - "курсор"
                //ResultSet rs = stmt.executeQuery("select * from customers order by cname");
                // PreparedStatement компилируется и за счет этого выполняется быстрее
                // может содержать параметры, значения которых нужно будет подставить в запрос
                PreparedStatement pstmtHW = conn.prepareStatement(
                        "select * from orders where cnum = ?  and amt > ? "
                );
        ) {

            System.out.println("==========");
            pstmtHW.setInt(1, 2002);        //1-,2+,3-,4+,6+,7-,8-
            pstmtHW.setInt(2, 20_000);
            try (
                    ResultSet rsOrders = pstmtHW.executeQuery();
            )
            {
                while (rsOrders.next()) {
                    int onum = rsOrders.getInt("onum");
                    int amt = rsOrders.getInt("amt");
                    int cnum = rsOrders.getInt("cnum");
//                    String odate = rsOrders.getString("odate");
                    int snum = rsOrders.getInt("snum");
//
                    System.out.printf("|%5d|%10d|%5d|%5d|\n",
                            onum, amt, cnum, snum
                    );
//
//
//                    System.out.printf("|%5d|%10d|%5d|%10s|%5d|\n",
//                            onum, amt, cnum, odate, snum
//                    );
                }

            }
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
