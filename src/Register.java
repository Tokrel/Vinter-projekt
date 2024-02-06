public class Register extends GetData{
    public Register(String email, String password) {
        super(email, password);
    }
//

    @Override
    public void execute() {
        Account newUser = new Account(getEmail(), getPassword());
        getDataBase().addDatabase(newUser);
        Welcome welcome = new Welcome(newUser);
        welcome.Message();
        welcome.Message2();


    }


}