package sandwiches;

/**@author sak5680*/

public class Sandwich {
    private String type = "";
    private String meat = "";
    private String cheese = "";
    private int extras;
    private double price;
    
    public void setType(String response){
        type = response.toLowerCase();
    }
    
    public String getType(){
        return type;
    }
    
    public void setMeat(String response){
        meat = response.toLowerCase();
    }
    
    public String getMeat(){
        return meat;
    }
    
    public void setCheese(String response){
        cheese = response.toLowerCase();
    }
    
    public String getCheese(){
        return cheese;
    }
    
    public void setExtras(int response){
        extras = response;
    }
    
    public int getExtras(){
        return extras;
    }
    
    public double calcPrice(){
        if(type.equals("panini"))
            price = price + 6;
        else if (type.equals("hoagie"))
            price = price + 5;
        
        if(extras > 2)
            price = price + ((extras - 2) * 0.75);
        
        return price;
    }
    
}
