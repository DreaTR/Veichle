import java.util.ArrayList;

public class Main {
    public static void main (String []args){
        // Skapar arraylist för att lägga till element
        ArrayList<Veichle> Vehicle = new ArrayList<>();

        // Arraylist med element
        Vehicle.add(new Car("Volvo", "S90", 2018, 200,8.0f, 220,4));

        Vehicle.add(new Motorcycle("Yamaha", "MT07", 2015, 200,5, 250, true));

        Vehicle.add(new Truck("Volvo", "FH-16",2017, 100,20, 120, 2, 36));

        // For-loop
        for(Veichle vehicle : Vehicle){
            if (vehicle instanceof Car){
                Car car = (Car) vehicle;
                car.carType();             // <---- anropar metoder
                car.carDoors();
                System.out.println("Fuel consumption: " + car.getFuelConsumption() + " l/100 km");
                System.out.println("Max speed: " + car.getMaxSpeed() + " km/h");
                car.carTravel();
                car.carFuel();
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle =(Motorcycle) vehicle;
                motorcycle.motorcycleType();
                motorcycle.windshield();
                System.out.println("Fuel consumption: " + motorcycle.getFuelConsumption() + " l/100 km");
                System.out.println("Max speed: " + motorcycle.getMaxSpeed()+ " km/h");
                motorcycle.motorcycleTravel();
                motorcycle.motorcycleFuel();
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                truck.truckType();
                truck.truckdoors();
                truck.capacity();
                System.out.println("Fuel consumption: " + truck.getFuelConsumption() + " l/100 km");
                System.out.println("Max speed: " + truck.getMaxSpeed() + " km/h");
                truck.truckTravel();
                truck.truckFuel();
            }
            System.out.println();
        }
        System.out.println("Yamaha MT07 (2015) är billigast, den kostar bara 192 kr per sträcka");
    }


}
