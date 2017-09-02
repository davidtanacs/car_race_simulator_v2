public class Vehicles {
    Car[] cars = new Car[10];
    Motorcycle[] motorcycles = new Motorcycle[10];
    Truck[] trucks = new Truck[10];


    Vehicles(){
        for (int i = 0; i < 10; i++) {
            Car car = new Car();
            cars[i] = car;
            Motorcycle motorcycle = new Motorcycle();
            motorcycles[i] = motorcycle;
            Truck truck = new Truck();
            trucks[i] = truck;
        }
    }

}
