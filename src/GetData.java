public abstract class GetData {
    private String emailEntry;
    private String passwordEntry;
    private AccountDatabase dataBase;

    protected GetData(String emailEntry, String passwordEntry) {
        this.dataBase = new AccountDatabase();
        this.emailEntry = emailEntry;
        this.passwordEntry = passwordEntry;
    }

    public String getEmail() {
        return this.emailEntry;
    }

    public String getPassword() {
        return this.passwordEntry;
    }

    public AccountDatabase getDataBase() {
        return this.dataBase;
    }

    public abstract void execute();
}