import java.util.Random;

public class Motorcycle {
    /*// speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
 static nameNumber // The number of the instance created. Used for its name.
 name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
 distanceTraveled
 moveForAnHour()*/
    int normalSpeed;
    static int nameNumber = 1;
    String name;
    int distanceTraveled;
    Random random = new Random();

    Motorcycle(){
        normalSpeed = 100;
        name = "Motorcycle " + nameNumber;
        nameNumber++;
        distanceTraveled = 0;
    }

    int decreaseSpeed(){
        int speedDecreasement = random.nextInt(45) + 5;
        return speedDecreasement;
    }


    void moveForAnHour(){
        distanceTraveled += normalSpeed;
    }

    void printMotorcycleResults(){
        System.out.println("Name: " + name + " |  Distance traveled: " + distanceTraveled + "km/h | Type: motorcycle");
    }
}
