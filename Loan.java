import java.time.LocalDate;

public class Loan {
    private final Equipment equipment;
    private final User user;
    private final LocalDate loanDate;
    private final LocalDate returnDate;

    public Loan(Equipment equipment, User user, LocalDate returnDate) {
        this.equipment = equipment;
        this.user = user;
        this.loanDate = LocalDate.now();
        this.returnDate = returnDate;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void displayLoanInfo() {
        System.out.println("Empréstimo: [ Equipamento: " + equipment.getName() + 
                           " || Usuário: " + user.getName() + 
                           " || Data do Empréstimo: " + loanDate + 
                           " || Data de Retorno: " + returnDate + " ]");
    }
}
