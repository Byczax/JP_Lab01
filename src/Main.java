import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Podaj rozmiar szachownicy (wartosc wieksza od 0)");
        int size = cin.nextInt();
        int condition = size*size;
        if (size < 0) {
            System.out.println("Bledna wartosc");

        } else {
            for (int i = 0; i < condition; i++) {
                for (int j = 0; j < condition; j++) {
                    if ((i / size + j / size) % 2 == 0) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
