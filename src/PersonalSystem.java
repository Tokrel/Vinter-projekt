import java.util.Scanner;
public class PersonalSystem {
    //Instance variables
    Scanner scan = new Scanner(System.in);
    String email, password;

    //Methods


    public void run(){
        boolean go = true;
        while (go==true){
            System.out.println("Inlog(1),Registera(2),Visa alla konton(3),Avsluta(4)");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    scan.nextLine();
                    System.out.println("Skriv din email:");
                    email = scan.nextLine();
                    System.out.println("Skriv ditt lösenord:");
                    password = scan.nextLine();
                    Login login = new Login(email,password);
                    login.execute();
                    
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("Skriv din email :");
                    email = scan.nextLine();
                    System.out.println("Skriv ditt lösenord:");
                    password = scan.nextLine();
                    Register register = new Register(email,password);
                    register.execute();
                    
                    break;

                case 3:
                    System.out.println("Dessa emails är registerarde");
                    ShowUsers showusers = new ShowUsers(email,password);
                    showusers.execute();
                    break;

                case 4:
                    go = false;
                    break;


                default:
                    break;
            }
        }
    }


}