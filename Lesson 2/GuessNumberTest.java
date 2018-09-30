import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
    	String solution;
        Scanner scan = new Scanner(System.in);

        System.out.print("Первый игрок, введите ваше имя: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Второй игрок, введите ваше имя: ");
        Player playerTwo = new Player(scan.nextLine()); 

        do {
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);       

            guessNumber.start();
            
            do {
                System.out.print("Хотите продолжить? ");
                solution = scan.nextLine();
            } while (!solution.equals("да") && !solution.equals("нет"));
        
        } while (solution.equals("да"));
    }
}