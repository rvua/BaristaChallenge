import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {

        // Menu Items 
        Item item1 = new Item("mocha", 4.0);
        
        Item item2 = new Item("latte", 5.0);
    
        Item item3 = new Item("drip coffee", 6.0);

        Item item4 = new Item("capuccino", 7.0);

        // ----------------------------------------- //

     // Create 2 orders for unspecified guests (without specifying a name);

        Order order1 = new Order();
        Order order2 = new Order();

        // ----------------------------------------- //

     // Create 3 orders using the overloaded constructor to give each a name for the order.

        Order order3 = new Order("Rich ");
        Order order4 = new Order("Luke ");
        Order order5 = new Order("Dee ");

        // ----------------------------------------- //

     // Add at least 2 items to each of the orders using the addItem method you wrote, for example, 
     // to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);

        order1.addItem(item1);
        order1.addItem(item2);
        
        order2.addItem(item3);
        order2.addItem(item4);
        
        order3.addItem(item4);
        order3.addItem(item2);
        
        order4.addItem(item3);
        order4.addItem(item1);
        
        order5.addItem(item2);
        order5.addItem(item4);

        // ----------------------------------------- //

     // Implement the getStatusMessage method within the Order class

        System.out.println(order5.getStatusMessage());

        // ----------------------------------------- //

     // Test your getStatusMessage functionality by setting some orders to ready and printing the 
     // messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());

        order3.setReady(true);
        System.out.println(order3.getStatusMessage());

        //order4.setReady(true);
        //System.out.println(order4.getStatusMessage());

        // ----------------------------------------- //

     // Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());

        System.out.println(order1.getOrderTotal());
        order3.addItem(item2);
        order3.addItem(item1);
        order3.addItem(item3);
        order3.display();

        order4.addItem(item2);
        order4.addItem(item3);
        order4.addItem(item4);
        order4.display();
    }
}