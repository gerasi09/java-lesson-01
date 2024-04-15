public class CreditCard {

    private String bankAccount;
    private int balance;

    public CreditCard(String bankAccount, int balance) {
        this.bankAccount = bankAccount;
        this.balance = balance;
    }

    public void creditMoney(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdrawMoney(int amount) {
        this.balance = this.balance - amount;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public int getBalance() {
        return this.balance;
    }

    public String details() {
        return "CreditCard for bankAccount: '" + this.getBankAccount() + "' with balance: " + this.getBalance();
    }

}
