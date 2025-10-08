public class Admin extends Employee{

    public Admin(){

    }

    public Admin(String name, int id){
        super(name, id);
    }


    public void addProduct(Product p){

    }

    public void removeProduct(Product p){

    }

    @Override
    public void sellProduct(String nameProduct, int quantity){

    }

    @Override
    public int checkProductStock(String nameProduct){
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
