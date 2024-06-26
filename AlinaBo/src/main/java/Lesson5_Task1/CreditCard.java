package Lesson5_Task1;

public class CreditCard {

    private String account;
    private long accountBalance;

    // Создаём конструктор
    public CreditCard(String account, long accountBalance) {
        this.account = account;
        this.accountBalance = accountBalance;
    }

    // Создаём метод, который позволяет начислять сумму на кредитную карточку
    public void addMoneyToAccount(long amount) {
        if (amount<0) {
            System.out.println("Неверный ввод!");
        } else accountBalance = accountBalance + amount;
    }

    // Создаём метод, который позволяет снимать с карточки некоторую сумму
    public void moneyWithdrawal(long amount) {
        if (accountBalance >= amount) {
            accountBalance = accountBalance - amount;
        } else System.out.println("Недостаточно средств!\n");
    }

    // Добавляем метод, который выводит текущую информацию о карточке
    public void printAccountInfo() {
        System.out.println("Account number: " + account + "\nCurrent balance: " + accountBalance + "\n");
    }
}
