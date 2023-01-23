//Fant ut at det var gøy å prøve seg på user input, det var ikke like gøy i Java som i Python :(

import java.util.Scanner;

public class Oblig2_2 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        int yourWeight = scan.nextInt();
        scan.close();

        double weightOnMoon = yourWeight * 0.17;

        System.out.format("Your weight on the moon is: " + "%.2f", weightOnMoon);
    }
}
