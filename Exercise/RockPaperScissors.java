package Exercise;

import java.util.*;

public class RockPaperScissors {

    public static void main(String[] args) {

        boolean toGo = true;

        Scanner scan = new Scanner(System.in);

        while(toGo == true){
            System.out.println("How many rounds of Rock-Paper-Scissors would you like to play? (1-10 rounds)");
            int rounds = Integer.parseInt(scan.nextLine());

            if(rounds < 1 || rounds > 10 ) {
                System.out.println("Error: you have not enter a number between 1 and 10");
                System.exit(0);
            }

            for (int i = 0; i < rounds; i++) {
                playRockPaperScissors(scan);
            }

            System.out.println("Do you want to play again? (true or false)");
            String playOrNot = scan.nextLine();
            toGo = Boolean.parseBoolean(playOrNot);
            if (toGo == false) {
                System.out.println("Thank you for playing");
                break;
            }


        }






    }


    public static void playRockPaperScissors(Scanner scanner) {
        Scanner scan = new Scanner(System.in);

        // players's choice
        System.out.println("Make your choice! (Rock/Paper/Scissors)");
        String playerChoice = scan.nextLine();

        // Computer's choice
        Random random = new Random();
        int randomNum = random.nextInt(3) ;

        String computerChoice;
        if (randomNum == 0) {
            computerChoice = "Rock";
        } else if (randomNum == 1) {
            computerChoice = "Paper";
        } else {
            computerChoice = "Scissors";
        }

        System.out.println("Computer chose " + computerChoice + "!");

        // Print results
        if (playerChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if (playerChoice == "Rock" && computerChoice == "Scissors")  {
            System.out.println("User wins!");
        } else if (playerChoice == "Paper" && computerChoice == "Rock") {
            System.out.println("User wins!");
        } else if (playerChoice == "Scissors" && computerChoice == "Paper") {
            System.out.println("User wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }





}
