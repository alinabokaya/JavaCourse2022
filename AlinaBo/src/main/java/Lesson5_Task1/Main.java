package Lesson5_Task1;

public class Main {

    public static void main(String[] args) {

        // Создаём 3 объекта класса CreditCard
        CreditCard creditCard1 = new CreditCard("A123B45609786", 100);
        CreditCard creditCard2 = new CreditCard("B123B45609786", 57);
        CreditCard creditCard3 = new CreditCard("C123B45609786", 89);

        creditCard1.addMoneyToAccount(-10);
        creditCard2.addMoneyToAccount(13);
        creditCard3.moneyWithdrawal(90);

        creditCard1.printAccountInfo();
        creditCard2.printAccountInfo();
        creditCard3.printAccountInfo();
    }
}
