public class ch6MethodOverloading {
    static void change(int a){
        a=77;

    }
    static void change2(int[] arr){
        arr[0]=99;
    }


    static void foo(){
        System.out.println("Good Morning, Bro!");
    }
    static void foo(int a){
        System.out.println("Good morning "+a+" Bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning "+a+" Bro! and Good morning "+b+" Bro!");

    }


    static int sum(int ...arr){
        //available as int[] arr
        int result=0;
        for(int a: arr){
            result+=a;
        }
        return result;
    }


    public static void main(String[] args) {

        //int x=45;
        //change(x);//cannot change x (for primitive data types)
        //System.out.println("value of x after running method change()- "+x);

        int[] marks={20,33,44,5,23};
        change2(marks);
        System.out.println("Value of 0th element after passing to change2()- "+marks[0]);


        //Method overloading-
        foo();
        foo(3000);
        foo(3000,4000);

        //varargs-
        System.out.println("The sum is "+sum(3,4));
        System.out.println("The sum is "+sum(3,4,5));
        System.out.println("The sum is "+sum(3,4,6,2,1,8));



    }
}
