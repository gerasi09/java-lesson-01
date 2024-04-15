public class Lesson06 {

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("account#1", 100);
        CreditCard card2 = new CreditCard("account#2", 100);
        CreditCard card3 = new CreditCard("account#3", 100);
        card1.creditMoney(10);
        card2.creditMoney(20);
        card3.withdrawMoney(30);
        System.out.println(card1.details());
        System.out.println(card2.details());
        System.out.println(card3.details());
    }

}