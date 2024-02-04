public class ShowUsers extends GetData{
    public ShowUsers(String email, String password) {
        super(email, password);
    }

    @Override
    public void execute() {
        AccountDatabase data = getDataBase();
        data.showUsers();
    }
}