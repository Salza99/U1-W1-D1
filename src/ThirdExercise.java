import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {

        System.out.println(perimetroRettangolo(5.7, 6.2));
        System.out.println(pariDispari(6));
        System.out.println(areaTriangolo(37, 13, 40));
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci la lunghezza della base di un rettangolo in cm e premi invio");
        double baseRettangolo = input.nextDouble();
        System.out.println("Inserisci la lunghezza della sua altezza");
        double altezzaRettangolo = input.nextDouble();
        System.out.println("il perimetro del tuo rettangolo è di " + perimetroRettangolo(baseRettangolo, altezzaRettangolo ) + " cm" );
        System.out.println("ora inserisci un numero per verificare se è pari(0) o dispari(1)");
        int pariODispari = input.nextInt();
        System.out.println(pariDispari(pariODispari));
        System.out.println("inserisci la lunghezza di un lato di un triangolo espressa in cm");
        double primoLato = input.nextDouble();
        System.out.println("ora il secondo lato");
        double secondoLato = input.nextDouble();
        System.out.println("e infine il terzo");
        double terzoLato = input.nextDouble();
        System.out.println("questo triangolo ha un'area di " + areaTriangolo(primoLato, secondoLato, terzoLato) + " cm");


        input.close();


    }
    public static double perimetroRettangolo(double n1, double n2) {
        return n1 * 2 + n2 * 2;
    }
    public static int pariDispari(int n1) {
       return n1 % 2;
    }
    public static double areaTriangolo(double n1, double n2, double n3) {
        double perimetro = n1 + n2 + n3;
        double semiPerimetro = perimetro / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - n1) * (semiPerimetro - n2) * (semiPerimetro - n3));
    }
}
