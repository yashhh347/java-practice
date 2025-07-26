import java.util.*;
public class challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1: Choose - Rock, Paper or Scissor?");
        String player1 = sc.nextLine().toLowerCase();

        System.out.println("Player 2: Choose - Rock, Paper or Scissor?");
        String player2 = sc.nextLine().toLowerCase();

        if(!(player1.equals("rock") ||player1.equals("paper")||player1.equals("scissor"))||!(player2.equals("paper")||player2.equals("rock")||player2.equals("scissor"))){
            System.out.println("Enter a valid input.");
        } else if (player1.equals(player2)) {
            System.out.println("It's a Draw.");

        } else if (player1.equals("rock") && player2.equals("paper")||player1.equals("paper") && player2.equals("scissor")||player1.equals("scissor") && player2.equals("rock")) {
            System.out.println("Hurray! Player 2 wins.");
        }else {
            System.out.println("Hurray! Player 1 wins");
        }


    }
}
