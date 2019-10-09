package testingwithhsqldb;

/**
 *
 * 
 */
public class Product {
    private int ID;
    private String Name;
    private float Price;
    
    public Product(int id, String name, float price){
        this.ID = id;
        this.Name = name;
        this.Price = price;
    }
    
    public int getId(){
        return this.ID;
    }
    
    public String getName(){
        return this.Name;
    }
    
    public float getPrice(){
        return this.Price;
    }
    
    
}
