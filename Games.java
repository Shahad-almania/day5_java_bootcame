/* Q2:
  - a program that allows the user to play rock, paper, scissors.
  - The program should randomly generate a number (0, 1 or 2), which represents scissors,
    rock and paper, respectively. (Hint: look up Math.random)

  - The program should then prompt the user to enter a number (0, 1 or 2).
  - Once the user has entered their number, the program should inform them whether they win, lose or draw.
  - The rules of the game are as follows:
           Scissors beats paper
           Rock beats scissors
           Paper beats rock */
package day5;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {

        System.out.println("The numbers must be 0 or 1 or 2. ");
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        String players = scan.next();

        int choice = Integer.parseInt(scan.next());
        if(choice < 0 || choice > 2) {
            System.out.println("Please try again"); //If the user enter a number other than 0 or 1 or 2
            System.exit(0);
        }

        int compchoice = (int)(Math.random()*3);

        if(compchoice == choice) { //decides if user wins or loses
            // if compchoice is same as user choice = tie
            if(choice == 2) {
                System.out.println("both chose scissors");
            }
            else if(choice ==0) {
                System.out.println("both chose rock");
            }
            else {   System.out.println("both chose paper");



            }
            System.exit(0);

        }



    }

}



