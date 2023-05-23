class Truck extends Veichle {
    int truckdoors;
    int capacity;

    Truck (String brand, String model, int year, int speed, float fuelConsumption, int maxSpeed, int truckdoors, int capacity){
        super(brand, model, year, speed, fuelConsumption, maxSpeed);

        this.truckdoors = truckdoors;
        this.capacity = capacity;
    }
    @Override
    public float getFuelConsumption() {
        return fuelConsumption;
    }
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
    void truckType(){
        System.out.println(this.brand + " " + this.model + ", " + this.year);
    }
    void truckdoors(){
        System.out.println("Doors: " + this.truckdoors);
    }
    void capacity(){
        System.out.println("Capacity: " + this.capacity + " ton");
    }
    void truckTravel(){
        System.out.println("Fuel needed for travel: " + fuelConsumption / 100 * 200 + " l");
    }
    void truckFuel(){
        System.out.println("Fuel price: " + 19.20 * 40 + " kr");
    }
}

