public class Login extends GetData{
    public Login(String email, String password) {
        super(email, password);
    }

    @Override
    public void execute() {
        if(getDataBase().isUserRegistered(getEmail(), getPassword())==true) {
            Account loggedInUser = getDataBase().getUser(getEmail(), getPassword());
            Welcome welcome = new Welcome(loggedInUser);
            welcome.Message();
            welcome.Message2();
        }else {

            System.out.println("User is not registered");
        }


    }
}