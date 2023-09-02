package HW3;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws NotExistException, NotEnoughException {
        Product product = ProductDatabase.getProduct(productId);
        if (product == null){
            throw new NotExistException("Product doesn't exist");
        }
        if (quantity>product.getAvailableQuantity()){
            throw new NotEnoughException("Sorry, you should want less");
        }
        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}
