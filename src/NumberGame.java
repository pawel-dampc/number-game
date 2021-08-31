import java.util.Scanner;

public class NumberGame {

    public static void main(String [] args){
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("Wybierz numer od 1 do 100");
        System.out.println("Spróbuj zgadnąć która to liczba");
        Scanner scanner = new Scanner(System.in);
        for (int i=10; i>0; i--) {
            System.out.println("Pozostało " + i + " zgadnięć, próbuj dalej: ");
            int quess = scanner.nextInt();

            if (randomNumber < quess){
                System.out.println("Jest mniejsza od " + quess);
            }
            else if (randomNumber > quess){
                System.out.println("Jest większa od " + quess);
            }
            else (randomNumber == quess){
                hasWon = true;
                break;
            }
        }
        if (hasWon){
            System.out.println("Wygrałeś!");
        }
        else {
            System.out.println("Przegrałeś! To była liczba " + randomNumber);
        }
    }
}
