public class CreditCard {
    private final long number;
    private final int cvv;
    private final String ValidThrough;

    public CreditCard(long number, int cvv, String validThString) {
        this.number = number;
        this.cvv = cvv;
        this.ValidThrough = validThString;
    }
}
