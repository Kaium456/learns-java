public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product keyboard = new Product("Mechanical Gameing keyboard", 48);
        Product mouse = new Product("Eco Dot (4th Generation)", 40);
        Product ecoDot = new Product("Eco Dot (4th Generation)", 40);

        shoppingCart.addProduct(keyboard);
        shoppingCart.addProduct(mouse);
        shoppingCart.addProduct(ecoDot);

        System.out.println("shoppingCart = " + shoppingCart);
        int totalPrice = shoppingCart.getTotalPrice();
        System.out.println("totalPrice = " + totalPrice);

    }

}
