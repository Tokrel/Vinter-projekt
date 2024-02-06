import java.util.ArrayList;

public class AccountDatabase {
    private static ArrayList<Account> dataBase = new ArrayList<Account>();

    static {
        dataBase.add(new Account( "Thor.nylen@elev.ga.ntig.se", "pass"));
        dataBase.add(new Account( "Herman.davidson@elev.ga.ntig.se", "1234"));
    }



    public boolean isUserRegistered(String email, String password) {
        boolean isRegisterd = false;
        for(Account registerdUser : dataBase) {
            if(registerdUser.getEmail().equals(email)&&registerdUser.getPassword().equals(password)) {
                isRegisterd = true;
            }
        }
        return isRegisterd;
    }

    public void showUsers(){

        for(int i = 0; i < dataBase.size(); i++){
            System.out.println(dataBase.get(i).getEmail());
        }
    }

    public Account getUser(String email, String password) {
        Account returnUser = new Account();
        for(Account registerdUser : dataBase) {
            if(registerdUser.getEmail().equals(email)&&registerdUser.getPassword().equals(password)) {
                returnUser = registerdUser;
            }
        }
        return returnUser;
    }

    public void addDatabase(Account newUser) {
        dataBase.add(newUser);
    }
}