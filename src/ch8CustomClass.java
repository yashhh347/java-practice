class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is: "+id);
        System.out.println("My name is "+name);
    }
}

public class ch8CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom Class.");
        Employee harry = new Employee(); //Instantiating a new employee object
        //Setting  properties/Attributes
        harry.id=23;
        harry.name="yash";
        //Printing Attributes
        System.out.println(harry.id);
        System.out.println(harry.name);

        //Calling method
        harry.printDetails();
    }
}
