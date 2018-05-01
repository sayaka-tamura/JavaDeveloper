package Week7_HW1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {
    /**
     * @param   item_id being searched for
     * @return  The item (type Item) that is found
     * @throws  ClassNotFoundException
     * @throws  SQLException
     */
    public Item getItemById(int item_id)throws ClassNotFoundException, SQLException{
        System.out.println();
        System.out.println("This is from getItemById() method");

        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "sayaka_JDBC";
        String pass = "password";
        Connection conn = DriverManager.getConnection(url, username, pass);

        String ById = "SELECT * FROM ITEM WHERE ITEM_ID = " + "'" + item_id + "'";
        PreparedStatement stmt = conn.prepareStatement(ById);
        ResultSet result = stmt.executeQuery();

        Item i = new Item();
        if(result != null&&result.next()){
            i.setItem_id(result.getInt(1));
            i.setItem_name(result.getString(2));
            i.setItem_quantity(result.getInt(3));
            i.setItem_price(result.getDouble(4));
        }
        return i;
    }

    /**
     * @param   item_price (type double) you’re testing against
     * @return  List<Item> which have a price value greater than the given price
     * @throws  ClassNotFoundException
     * @throws  SQLException
     */
    public List<Item> getItemsCostingGreaterThan(double item_price)throws ClassNotFoundException, SQLException{
        System.out.println();
        System.out.println("This is from getItemsCostingGreaterThan() method");

        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "sayaka_JDBC";
        String pass = "password";
        Connection conn = DriverManager.getConnection(url, username, pass);

        String ByPrice = "SELECT * FROM ITEM WHERE ITEM_PRICE > " + "'" + item_price + "'";
        PreparedStatement stmt = conn.prepareStatement(ByPrice);
        ResultSet result = stmt.executeQuery();
        List<Item> items = new ArrayList<Item>();

        while (result.next()) {
            Item item = new Item();
            item.setItem_id(result.getInt(1));
            item.setItem_name(result.getString(2));
            item.setItem_quantity(result.getInt(3));
            item.setItem_price(result.getDouble(4));
            items.add(item);
        }
        return items;
    }

    /**
     * @return  List<Item> which have a quantity_in_stock greater than 0
     * @throws  ClassNotFoundException
     * @throws  SQLException
     */
    public List<Item> getItemsInStock() throws ClassNotFoundException, SQLException{
        System.out.println();
        System.out.println("This is from getItemsInStock() method");

        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "sayaka_JDBC";
        String pass = "password";
        Connection conn = DriverManager.getConnection(url, username, pass);

        String ByQuanity = "SELECT * FROM ITEM WHERE ITEM_QUANTITY > 0 ";
        PreparedStatement stmt = conn.prepareStatement(ByQuanity);
        ResultSet result = stmt.executeQuery();
        List<Item> items = new ArrayList<Item>();

        while (result.next()) {
            Item item = new Item();
            item.setItem_id(result.getInt(1));
            item.setItem_name(result.getString(2));
            item.setItem_quantity(result.getInt(3));
            item.setItem_price(result.getDouble(4));
            items.add(item);
        }

        return items;
    }
}
