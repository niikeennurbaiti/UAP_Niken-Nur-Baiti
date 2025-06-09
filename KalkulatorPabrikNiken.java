package UAP.mains;

import java.util.Scanner;
import UAP.models.Torus;
import UAP.models.Sphere;

public class KalkulatorPabrikNiken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NIKEN NUR BAITI");
        System.out.println("245150707111016");
        System.out.println("=============================================");

        Torus torusDefault = new Torus();
        System.out.println(torusDefault.getName());

        System.out.println("=============================================");
        System.out.print("Isikan Radius luar (R): ");
        double R = sc.nextDouble(); 
        System.out.print("Isikan radius dalam (r): ");
        double r = sc.nextDouble(); 

        Torus torusInput = new Torus(R, r);
        System.out.println("=============================================");
        torusInput.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");

        Sphere sphereDefault = new Sphere();
        System.out.println(sphereDefault.getName());

        System.out.println("=============================================");
        System.out.print("Isikan radius bola: ");
        double r2 = sc.nextDouble(); // e.g., 21

        Sphere sphereInput = new Sphere(r2);
        System.out.println("=============================================");
        sphereInput.printInfo();
        System.out.println("=============================================");
    }
}
