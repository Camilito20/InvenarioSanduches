public interface Inventary {

    void addProduct(Product product);
    void saleProduct(String name, int quantity);
    void removeProduct(String name);
    void productQuantity(String name);
}
