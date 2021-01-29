import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*int number = 1;
        do{
            System.out.println(number);
            number++;
        }while(number < 10);

        System.out.println("You entered " + number);*/

        /*int num1 = 10;
        do{
            System.out.println(num1);
            num1 --;
        }while(num1 > 0);*/

        /*int number = 1;
        do{
            System.out.println(number);
            number+=3;
        }while(number < 30);*/

       /* Random rand = new Random();
        int number;
        do{
            number = rand.nextInt(19) + 1;
        }while(number%2 == 0);
        System.out.println(number);*/

        Scanner scan = new Scanner(System.in);
        String password = "chicken nugget";
        String userInput;
        do{
            System.out.println("Please enter your password");
            userInput = scan.nextLine();
        }while(!userInput.equals(password));
    }
}
