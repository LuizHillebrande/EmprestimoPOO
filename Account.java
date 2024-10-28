public class Account extends User {
    private final String password;

    public Account(String name, String email, String cpf, String password) {
        super(name, email, cpf);
        this.password = password;
    }

    @Override
    public void displayInfo() {
        System.out.println("Informações da Conta: [ Nome: " + getName() + " || Email: " + getEmail() + " || CPF: " + getCPF() + " ]");
    }

    public String getPassword() { return password; }
}
