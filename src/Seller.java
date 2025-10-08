public class Seller extends Employee{

    public Seller(){}

    public Seller(String name, int id){
        super(name, id);
    }

    @Override
    public void sellProduct(String nameProduct, int quantity){

    }

    @Override
    public int checkProductStock(String nameProduct){
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
