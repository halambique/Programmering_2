import java.util.Scanner;

public class Oblig3_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the planet: ");
        String planetName = scan.nextLine();
        System.out.print("Enter the radius of the planet: ");
        float planetRadius = scan.nextFloat();
        System.out.print("Enter the mass of the planet: ");
        double planetMass = scan.nextDouble();

        Planet planet = new Planet(planetName, planetRadius, planetMass);

        System.out.println("Planeten " + planet.getName() + " har en radius på " + planet.getRadius() + "km og en masse på " + planet.getMass() + "kg");

    }
}
