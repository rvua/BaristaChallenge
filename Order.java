import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // ----------------------------------------- //
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest ";
        // ArrayList<Item> item = new ArrayList<Item>();
    }
    
    // ----------------------------------------- //

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order( String name) {
        this.name = name;
        // ArrayList<Item> item = new ArrayList<Item>();
    }

    // ----------------------------------------- //
    
    // ORDER METHODS
    
    // Most of your code will go here, 
    // so implement the getters and setters first!
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready == true) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double sum = 0;
        for(Item value : this.items) {
            sum += value.getPrice();
        }
        return sum;
    }

    public void display(){
        System.out.printf("Customer Name: %s", this.name);
        for(Item i : this.items) {
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: " + "$" + this.getOrderTotal());
    }

    // ----------------------------------------- //

    // GETTERS & SETTERS
    // getter 
    public String getName() {
        return this.name;
    }

    // setter 
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public boolean getReady() {
        return this.ready;
    }

    // setter 
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    // getter
    public ArrayList<Item> getItems() {
        return items; 
    }

    // setter 
    public void setItems(ArrayList<Item> items) {
        this.items = items; 
    }
}