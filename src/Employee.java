abstract class Employee {
    private String name;
    private int id;

    public Employee(){

    }

    abstract void sellProduct(String nameProduct, int quantity);
    abstract int checkProductStock(String nameProduct);

    public Employee(String name, int id){
        setName(name);
        setId(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        String stringId = String.valueOf(id);
        if(stringId.length() != 6) throw new IllegalArgumentException("The ID need 6 numbers");

        this.id = id;
    }

    public int getId() {
        return id;
    }
}
