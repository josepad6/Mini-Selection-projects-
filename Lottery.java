import java.util.Scanner;
public class Lottery {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in a two digit number ");
        int player = scan.nextInt();
        int computer = (int) (Math.random()*90 + 10
        int lottonumber = computer
        int ones = lottonumber % 10;
        int tens = lottonumber / 10;
        System.out.println("The lotto number is " + lottonumber  );

        if (player == computer) {
            System.out.println("YOU GOT IT !!!");
            System.out.println("You win the Jackpot of 10,000 ");


        } else if (computer == ones && computer == tens){
            System.out.println("You got the one digit correct ");
            System.out.println("You win $500");
        } else if (computer == ones && computer == tens) {
            System.out.println("You got the one digit correct.");
            System.out.println("You win $500");

        } else if (computer == ones && computer == tens) {
                System.out.println("You got both digits correct.");
                System.out.println("You win $2,000");
            }
            else System.out.println("You did not win anything :(");}
}
