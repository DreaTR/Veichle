abstract class Veichle {
    //Definierar egenskaperna för klassen Vehicle
    String brand;
    String model;
    int year;
    int speed;
    float fuelConsumption;
    int maxSpeed;

    // Definierar konstruktorn för Vehicle
    public Veichle (String brand, String model,int year, int speed,float fuelConsumption,int maxSpeed){

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }
    // Abstrakta metoder
    public abstract float getFuelConsumption();
    public abstract int getMaxSpeed();
}
