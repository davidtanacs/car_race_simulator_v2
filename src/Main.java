import java.util.Random;

public class Main {
    /*static isRaining //30% chance of rain every hour
 createVehicles() // creates 10 cars, 10 trucks and 10 Trucks
 simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
 printRaceResults() // prints each vehicle's name, distance traveled ant type.*/
    static boolean isRaining;


    public static void main(String[] args) {
        Vehicles racers = createVehicles();
        simulateRace(racers);
        printRaceResults(racers);
    }



    static Vehicles createVehicles(){
        Vehicles racers = new Vehicles();
        return racers;
    }

    static void simulateRace(Vehicles racers){
        Random random = new Random();
        for (int j = 0; j < 50; j++) {
            int chanceForRain = random.nextInt(10) + 1;
            if (chanceForRain <= 3){
                isRaining = true;
            } else {
                isRaining = false;
            }
            for (int i = 0; i < 10; i++) {
                racers.motorcycles[i].moveForAnHour();
                racers.trucks[i].manageBreakdowns();
                if (isRaining) {
                    racers.cars[i].distanceTraveled += racers.cars[i].setSpeedLimit(70);
                    racers.motorcycles[i].distanceTraveled -= racers.motorcycles[i].decreaseSpeed();
                } else {
                    racers.cars[i].moveForAnHour();
                }
                if (racers.trucks[i].breakdownTurnsLeft != 0) {
                    racers.trucks[i].breakdownTurnsLeft -= 1;
                } else {
                    racers.trucks[i].moveForAnHour();

                }
            }
        }
    }

    static void printRaceResults(Vehicles racers){
        for (int i = 0; i < 10; i++) {
            racers.cars[i].printCarResults();
            racers.motorcycles[i].printMotorcycleResults();
            racers.trucks[i].printTruckResults();
        }
    }

}
