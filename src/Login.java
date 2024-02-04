public class Login extends GetData{
    public Login(String email, String password) {
        super(email, password);
    }

    @Override
    public void execute() {
        if(getDataBase().isUserRegistered(getEmail(), getPassword())==true) {
            Account newUser = getDataBase().getUser(getEmail(), getPassword());
            //welcome snart
        }else {

            System.out.println("User is not registered");
        }


    }
}