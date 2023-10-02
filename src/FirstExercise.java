// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FirstExercise {
    public static void main(String[] args) {

        System.out.println(moltiplica(5,5));
        System.out.println(concatena("hai concatenato questa stringa a :", 2));
        String arrayOfFiveString [] = {"ciao", "questa", "è", "una", "prova"};

        for (int i = 0; i < 6; i++) {
            System.out.println(inserisciInArray(arrayOfFiveString, "Aggiunto")[i]);
        }



    }
    public static int moltiplica(int n1, int n2) {
        return n1 * n2;
    }
    public static String concatena(String a, int n1) {
        return a + n1;
    }

    public static String[] inserisciInArray(String[] arrayOfString, String a) {
             String result[] = new String[6];
            for (int i = 0; i < result.length; i++) {
                if (i < 2) {
                    result[i] = arrayOfString[i];
                } else if (i > 2) {
                    result[i] = arrayOfString[i - 1];
                }
                else {result[2] = a;}
            }


        return result;
    }
}