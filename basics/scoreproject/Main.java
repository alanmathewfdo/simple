package scoreproject;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Score score = new Score();
        boolean off = true;
        while(off){
            System.out.println("Enter the sutiable Number to perform actions.");

            System.out.println("Enter '1' to Create New Player.");
            System.out.println("Enter '2' to Display players info.");
            System.out.println("Enter '3' to Add Runs to palyer.");
            System.out.println("Enter '0' to Turn Off Score Project.");
            
            int input = scan.nextInt();
            switch(input){
                case 0 : off = false;
                        break;

                case 1 : System.out.println("Enter Player Name : ");
                        scan.nextLine();
                         String name = scan.nextLine();
                         System.out.println("Enter Player Role : ");
                         String role = scan.next();
                         PlayerUtil.createPlayer(name, role);
                         break;

                case 2 :    System.out.println("Player Information : \n | ID |  Name  | Role |Score|4s|6s|");
                            PlayerUtil.displayPlayer();
                            break;

                case 3 : System.out.println("Enter Player ID : ");
                         int id = scan.nextInt();
                         System.out.println("Enter Score : ");
                         int run = scan.nextInt();
                         score.addScore(run, id);
                         break;
                
                default : System.out.println("Invalid Input");
                            break;
            }
        }
             scan.close();
             System.out.println("Project Stoped");
    }
}
