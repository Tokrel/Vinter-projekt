

import java.util.Scanner;

public class Welcome {
    private Account loggedInUser;
    private Scanner input = new Scanner(System.in);

    public Welcome(Account loggingInUser) {
        this.loggedInUser = loggingInUser;
    }

    public void Message() {
        System.out.println("Hej "+loggedInUser.getEmail());
    }

    public void Message2() {
        boolean goo = true;
        while(goo==true) {
            System.out.println("Vill du logga ut:(y)/(n)");
            String inputText = input.nextLine();
            if(inputText.equals("y")) {
                goo=false;
            }
            else if (inputText.equals("n")){
                System.out.println("finns inget att göra än");
            }
        }

    }
}