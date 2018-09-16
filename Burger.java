
/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger
{
    // instance variables - replace the example below with your own
    private String name;
    private int price;
    private String topping;
    
    public Burger(String theName)
    {
        name = theName;
    }
    
    public Burger(String theName, int thePrice)
    {
        name = theName;
        price = thePrice;
    }    
    
    public String getName()
    {
        return name;
    }
    
    public void setPrice(int thePrice)
    {
        this.price = thePrice;
    }
}









