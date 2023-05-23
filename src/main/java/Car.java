class Car extends Veichle {
    int doors;

    // Definierar konstruktorn för Car
    Car(String brand, String model, int year, int speed, float fuelConsumption, int maxSpeed, int doors) {
        super(brand, model, year, speed, fuelConsumption, maxSpeed);

        this.doors = doors;
    }

    @Override
    public float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    void carType() {
        System.out.println(this.brand + " " + this.model + ", " + this.year);
    }

    // Definerar metoderna för klassen Car
    void carDoors() {
        System.out.println("Doors: " + this.doors);
    }

    void carTravel() {
        System.out.println("Fuel needed for travel: " + fuelConsumption / 100 * 200 + " l"); // 8 l/ 100 * 200
    }

    void carFuel() {
        System.out.println("Fuel price: " + 19.20 * 16.0 + " kr"); // Fuel price (19.20/l) * distance travel km (16.0 km)
    }
}