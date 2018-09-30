import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int compNumber = (int)(Math.random() * 101);
    private boolean win;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        do {
            //System.out.println("Загаданное компьютером число: " + compNumber);
            inputNumber(playerOne);
            inputNumber(playerTwo);
            guessedNumber(playerOne);
            guessedNumber(playerTwo);
        } while (!win);
    }

    public void inputNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число от 0 до 100: ");
        player.setNumber(scan.nextInt());
    }

    public void guessedNumber(Player player) {
        if (player.getNumber() == compNumber) {
            System.out.println(player.getName() + ", Вы угадали, это число: " + player.getNumber());
            win = true;
        } else if (player.getNumber() < compNumber && player.getNumber() <= 100 && player.getNumber() >= 0) {
            System.out.println(player.getName() + ", введенное Вами число меньше загаданного компьютером");
        } else if (player.getNumber() > compNumber && player.getNumber() <= 100 && player.getNumber() >= 0) {
            System.out.println(player.getName() + ", введенное Вами число больше загаданного компьютером");
        } else {
            System.out.println(player.getName() + ", сосиска, не пытайся меня обмануть!");
        } 
    }
}