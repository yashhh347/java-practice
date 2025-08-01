class MyEmployee{
    private int id;
    private String name;

    public String getname(){
        return name;
    }

    public void setName(String n){
        name=n;
    }

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }
}

public class ch9AccessModifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        //Throws an error due to private access modifier
        // harry.id=45;
        // harry.name="Yash";

        harry.setName("Yash");
        harry.setId(45);
        System.out.println("name: "+harry.getname()+" And id: "+harry.getId());


    }
}
