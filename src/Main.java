import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till min kalkylator!");
        System.out.println("Ange tal 1");
        double tal1 = scanner.nextDouble();
        System.out.println("Ange tal 2");
        double tal2 = scanner.nextDouble();
        System.out.println("Ange räknesätt (+, -, *, /, %)");
        String raknesatt = scanner.next();

        double resultat = 0;
        switch (raknesatt) {
            case "+":
                resultat = tal1 + tal2;
                System.out.println(tal1 + " + " + tal2 + " = " + resultat);
                break;
            case "-":
                resultat = tal1 - tal2;
                System.out.println(tal1 + " - " + tal2 + " = " + resultat);
                break;
            case "*":
                resultat = tal1 * tal2;
                System.out.println(tal1 + " * " + tal2 + " = " + resultat);
                break;
            case "/":
                resultat = tal1 / tal2;
                System.out.println(tal1 + " / " + tal2 + " = " + resultat);
                break;
            case "%":
                resultat = tal1 % tal2;
                System.out.println(tal1 + " % " + tal2 + " = " + resultat); //Denna funkar inte helt 100
                break; //Kolla modifiera lite extra, kolla antingen med Marcus eller med Micael hur det funkar
            default:
                System.out.println("Du måste ange ett av 5 tidigare, angivna räknesätt.");

                // Skriv din kod här och anropa rätt metod //(Switch-case-break-default)
        }

        System.out.println("Resultatet är " + resultat);
    }
}
