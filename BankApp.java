import java.util.Scanner;

public class BankApp {
    private static double saldo = 0.0;  // Håller reda på saldot
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            visaMeny();  // Visa menyvalen

            int val = scanner.nextInt();  // Ta emot användarens val

            if (val == 1) {
                visaSaldo();  // Visa saldo
            } else if (val == 2) {
                sättInPengar();  // Lägg till pengar
            } else if (val == 3) {
                taUtPengar();  // Ta ut pengar
            } else if (val == 4) {
                System.out.println("Avslutar programmet...");
                break;  // Avsluta loopen och programmet
            } else {
                System.out.println("Ogiltigt val, försök igen.");  // Ogiltigt val
            }
        }
    }

    public static void visaMeny() {
        System.out.println("\n1. Se saldo");
        System.out.println("2. Sätt in pengar");
        System.out.println("3. Ta ut pengar");
        System.out.println("4. Avsluta");
        System.out.print("Välj ett alternativ: ");
    }

    public static void visaSaldo() {
        System.out.println("Ditt saldo är: " + saldo + " kr");
    }

    public static void sättInPengar() {
        System.out.print("Ange belopp att sätta in: ");
        double belopp = scanner.nextDouble();
        saldo += belopp;
        System.out.println(belopp + " kr har satts in.");
    }

    public static void taUtPengar() {
        System.out.print("Ange belopp att ta ut: ");
        double belopp = scanner.nextDouble();
        if (belopp > saldo) {
            System.out.println("Otillräckligt saldo.");
        } else {
            saldo -= belopp;
            System.out.println(belopp + " kr har tagits ut.");
        }
    }
}

     