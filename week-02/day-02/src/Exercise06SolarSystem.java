import java.util.*;

public class Exercise06SolarSystem{

    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.



        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"

    }

    public static String putSaturn(ArrayList<String> planetList) {

        String missingPlanet = "Saturn";

        planetList.add(5, missingPlanet);

        return planetList.toString();
    }
}
