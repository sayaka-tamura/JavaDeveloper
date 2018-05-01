package Week7_HW1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main_Entry {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ItemDAO iDAO = new ItemDAO();
        // #1
        Item i1 = iDAO.getItemById(2);

        System.out.println("Item_ID: " + i1.getItem_id());
        System.out.println("Item_Name: " + i1.getItem_name());
        System.out.println("Item_Quantity: " + i1.getItem_quantity());
        System.out.println("Item_Price: " + i1.getItem_price());

        // #2
        List<Item> items1 = new ArrayList<Item>();
        items1 = iDAO.getItemsCostingGreaterThan(50.50);

        for(Item item:items1){
            System.out.println("Item_ID: " + item.getItem_id());
            System.out.println("Item_Name: " + item.getItem_name());
            System.out.println("Item_Quantity: " + item.getItem_quantity());
            System.out.println("Item_Price: " + item.getItem_price());
        }
    }
}
