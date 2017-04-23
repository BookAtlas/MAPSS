package MapssUtils;

/**
 *
 * @author Steven
 */
public class Car {
    
    public enum CarColor {
        Black,
        White,
        Red,
        Blue,
        Silver;
    }
    
    private double id;
    private String year;
    private String make;
    private String model;
    private String fuel_economy;
    private CarColor color;
    private String price;
    
    public Car(double parId, String parYear, String parMake, String parModel,
            String parFuel, CarColor parColor, String parPrice) {
        this.id = parId;
        this.year = parYear;
        this.make = parMake;
        this.model = parModel;
        this.fuel_economy = parFuel;
        this.color = parColor;
        this.price = parPrice;
    }
    
    public double getId(){
        return id;
    }
    
    public String getYear(){
        return year;
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getFuel(){
        return fuel_economy;
    }
    
    public CarColor getColor(){
        return color;
    }
    
    public String getPrice(){
        return price;
    }
    
    public String ins_or_update_stmt(){
        return "INSERT OR REPLACE INTO vehicles(year,make,model,gas,color,price)"
                + " VALUES (" + this.id + ", '" + this.year + "', '" +
                this.make + "', '" + this.model + "', '" + this.fuel_economy +
                "', " + this.color + ", " + this.price + ")";
    }
    
    public String del_stmt(){
        return "DELETE FROM vehicles WHERE id = " + this.id + ";";
    }
}
