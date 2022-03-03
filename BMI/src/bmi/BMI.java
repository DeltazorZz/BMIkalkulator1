package bmi;

import java.util.Locale;
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        cim("BMI index kiszamitasa:");
        int tomeg = beker("Testömeg (kg) [40; 150]:", 40, 150);
        int magassag = beker("Testmagasság (cm) [100; 200]", 100, 200);
        double bmiIndex = bmi(tomeg, magassag);
        ertekeles();

    }

    static void cim(String szoveg) {
        System.out.println(szoveg);
    }

    private static int beker(String kerdes, int also, int felso) {
        System.out.println(kerdes);

        Scanner sc = new Scanner(System.in);
        int szam = -1;
        boolean jo = false;
        while (!jo) {
            szam = sc.nextInt();
            jo = szam >= also && szam <= felso;
            if (!jo) {
                System.out.println("Nem jó újra!");
                System.out.println(kerdes);
            }
        }
        return szam;

    }

    static double bmi(int tomeg, int magassag) {
        return 0.0;
    }

    static void ertekeles(int tomeg, int magassag, double bmiIndex) {
        System.out.printf("Ön %d cm magas és %d kg tömegű", magassag, tomeg);
        System.out.printf(Locale.ENGLISH,"Igy BMI indexe: %f \n", bmiIndex);
        String alkat = "Túlsulyos";
        System.out.printf("Tehát Ön %s testalkatú\n", alkat);
    }

}
