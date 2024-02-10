public class Customer {
    private String name;
    private CreditCard creditCard;

    public Customer(String name, long number, int cvv, String validThString) {
        this.name = name;
        this.creditCard = new CreditCard(number, cvv, validThString);
    }

    public Customer(String name, CreditCard creditCard) {
        this.name = name;
        this.creditCard = creditCard;
    }
}
