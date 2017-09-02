import java.util.Random;

public class Truck {
    /*// speed: 100km/h. 5% chance of breaking down for 2 hours.
 // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
 breakdownTurnsLeft // holds how long its still broken down.
 distanceTraveled
 moveForAnHour()*/
    int normalSpeed;
    int name;
    int breakdownTurnsLeft;
    int distanceTraveled;
    Random random = new Random();
    int chanceForBreakdown;

    Truck(){
        name = random.nextInt(1000);
        distanceTraveled = 0;
        normalSpeed = 100;
    }

    void moveForAnHour(){
        distanceTraveled += normalSpeed;
    }

    void manageBreakdowns(){
        chanceForBreakdown = random.nextInt(20);
        if (chanceForBreakdown == 1){
            breakdownTurnsLeft = 2;

        }
    }
    void printTruckResults(){
        System.out.println("Name: " + name + " |  Distance traveled: " + distanceTraveled + "km/h | Type: truck");
    }
}
