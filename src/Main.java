import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String nextLine = "";
        boolean done = false;

        do {
            System.out.println("PLayer A Enter your move [R P S]: ");
            playerA = in.nextLine();
            System.out.println("player B Enter your move [R P S]: ");
            playerB = in.nextLine();

            if(playerA.equals("R") || playerA.equals("r"))
            {
                if(playerB.equals("R"))
                {
                    System.out.println("Rock vs Rock, it is a Tie!");
                } else if (playerB.equals("P") || playerB.equals("p")) {
                    System.out.println("Paper beats rock so Player B wins!");

                }
                else
                {
                    System.out.println("Rock breaks scissors, so player A wins!");
                }

            } else if (playerA.equals("P") || playerA.equals("p"))
                {
                    if(playerB.equals("R") || playerB.equals("r"))
                    {
                        System.out.println("Paper beats Rock, so player A wins!");
                    } else if (playerB.equals("P") || playerB.equals("p")) {
                        System.out.println("Paper vs Paper, it is a Tie!");
                    }
                    else
                    {
                        System.out.println("Scissors cuts paper, so Player B wins!");
                    }
                }
            else if (playerA.equals("S") || playerA.equals("s"))
            {
                if(playerB.equals("R") || playerB.equals("r"))
                {
                    System.out.println("Rock breaks scissors, so player A wins!");
                } else if (playerB.equals("P") || playerB.equals("p")) {
                    System.out.println("Scissors cuts paper, so player A wins!");
                }
                else
                {
                    System.out.println("Scissors vs scissors, it is a Tie!");
                }
            }
            else
            {
                System.out.println("Please enter a valid input and try again!");
                nextLine = in.nextLine();
                done = true;
            }

            System.out.println("Would you like to play again? [Y/N]: ");
            nextLine = in.nextLine();
            done = true;

        } while (done);
        in.close();
    }
}