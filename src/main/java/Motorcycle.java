public class Motorcycle extends Veichle {
    boolean windshield;

    Motorcycle (String brand, String model, int year, int speed, float fuelConsumption, int maxSpeed, boolean windshield) {
        super(brand, model, year, speed, fuelConsumption, maxSpeed);

        this.windshield = windshield;
    }
    @Override
    public float getFuelConsumption() {
        return fuelConsumption;
    }
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
    void motorcycleType () {
        System.out.println(this.brand + " " + this.model + ", " + this.year);
    }
    void windshield(){
        System.out.println("Windshields; " + this.windshield);
    }
    void motorcycleTravel(){
        System.out.println("Fuel needed for travel: " + fuelConsumption/ 100 * 200 + " l");
    }
    void motorcycleFuel(){
        System.out.println("Fuel price: " + 19.20 * 10 + " kr");
    }
}
