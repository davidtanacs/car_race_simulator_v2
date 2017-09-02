import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Car {

    /*// Since cars are so fast there is a 30% chance that they can go only with 70km/h speed.
 static setSpeedLimit(int limit) // Call this from the Main class!
 normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
 name // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
 distanceTraveled // holds the current distance traveled.
 moveForAnHour() // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!*/
    Random random = new Random();
    int normalSpeed;
    int distanceTraveled;
    String name;
    static ArrayList<String> possibleNames = new ArrayList<>(Arrays.asList("Millenium",
            "Zeal",
            "Cobra",
            "Encounter",
            "Guardian",
            "Union",
            "Liberty",
            "Prospect",
            "Pulse",
            "Revelation",
            "Raven",
            "Orbit",
            "Apex",
            "Nimbus",
            "Curiosity",
            "Zeal",
            "Celestial",
            "Revelation",
            "Behemoth",
            "Crest"
    ));
    int randomNameIndex1;
    int randomNameIndex2;


    public Car(){
        randomNameIndex1 = random.nextInt(possibleNames.size() - 1);
        randomNameIndex2 = random.nextInt(possibleNames.size() - 1);
        name = possibleNames.get(randomNameIndex1) + " " + possibleNames.get(randomNameIndex2);
        normalSpeed = random.nextInt(30) + 80;
        distanceTraveled = 0;

    }

    public void moveForAnHour(){
        distanceTraveled += this.normalSpeed;
    }

    public static int setSpeedLimit(int limit){
        return limit;
    }

    void printCarResults(){
        System.out.println("Name: " + name + " |  Distance traveled: " + distanceTraveled + "km/h |  Type: car");
    }

}
