public class ch5methods {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;

    }
    //returns nothing - Void return type
    static void tellJoke(){
        System.out.println("I invented a new world!\n"+"Plagarism!");
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        System.out.println(c);
//method invocation by object creation - when method is not static
//        ch5methods obj = new ch5methods();
//        c=obj.logic(a,b);

        int a1=4;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);
        tellJoke();

    }
}
