
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("chose function: 1.login  2.register");
            int userinput = scan.nextInt();
            switch(userinput){
                case 1:
                    break;

                case 2:
                    System.out.println("test");
                    break;

                default:
                    System.out.println("invalid choice");

            }
        }
    }
}