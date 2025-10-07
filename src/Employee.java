abstract class Employee {
    private String name;
    private int id;

    public Employee(){}

    public Employee(String name, int id){
        setName(name);
        setId(id);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        String stringId = String.valueOf(id);
        if(stringId.length() != 6) throw new IllegalArgumentException("The ID needs 6 numbers");

        this.id = id;
    }
}
