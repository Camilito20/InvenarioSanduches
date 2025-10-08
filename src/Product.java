public class Product {
    private String nameProduct;
    private double price;
    private int code;

    public Product(){}

    public Product(String nameProduct, double price, int code){

    }

    public void setNameProduct(String nameProduct){
        if(nameProduct == null || nameProduct.isBlank()){
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        this.nameProduct = nameProduct;
    }

    public String getNameProduct(){
        return nameProduct;
    }

    public void setPrice(double price){
        if(price <= 0) throw new IllegalArgumentException("the product cannot be free");

        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setCode(int code) {
        if(code <= 0) throw new IllegalArgumentException("the code can't be less than 0");
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
