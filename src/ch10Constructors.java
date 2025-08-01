import com.sun.tools.javac.Main;

class MainEmployee{
    private int id;
    private String name;

//    public MainEmployee(){
//        id=39;
//        name="Your-name-here";
//    }

    public MainEmployee(String myName){
        id=45;
        name=myName;

    }

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

public class ch10Constructors {
    public static void main(String[] args) {
        MainEmployee harry = new MainEmployee("Prathmesh");
        System.out.println(harry.getId());
        System.out.println(harry.getname());

    }
}
