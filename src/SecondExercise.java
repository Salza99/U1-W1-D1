import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una stringa e premi invio");
        String firstLine = input.nextLine();
        System.out.println("Inserisci una seconda stringa e premi invio");
        String secondLine = input.nextLine();
        System.out.println("Inserisci un'ultima stringa e premi invio");
        String thirdLine = input.nextLine();
        System.out.println("stringhe in ordine: " + firstLine + " " + secondLine + " " + thirdLine);
        System.out.println("stringhe in ordine inverso: " + thirdLine + " " + secondLine + " " + firstLine);
        input.close();
    }


}
