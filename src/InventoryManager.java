import java.util.ArrayList;

public class InventoryManager implements Inventary{
    ArrayList<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product){
        products.add(product);

    }
    @Override
    public void saleProduct(String name, int quantity){

    }
    public void removeProduct(String name){
        for(Product p : products){
            if(p.getName().equalsIgnoreCase(name)){
                products.remove(p);
            }
            System.out.println("hola");
        }

    }
    public void productQuantity(String name){

    }
}
