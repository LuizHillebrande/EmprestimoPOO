public abstract class User {
    private final String name;
    private final String email;
    private final String cpf;

    public User(String name, String email, String cpf) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCPF() { return cpf; }

    public abstract void displayInfo();
}
