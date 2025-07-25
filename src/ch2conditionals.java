import java.util.Scanner;

public class ch2conditionals {
    public static void main(String[] args) {
        int age1 = 6;
        //if-else
        if(age1>18){
            System.out.println("Yes boy you can drive");
        }
        else{
            System.out.println("No, boy you cannot drive yet");
        }

        //logical operators
        System.out.println("for logical AND...");
        boolean a = true;
        boolean b = false;
        if(a && b){//true only if both a & b are true
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("for logical OR...");
        boolean a1 = true;
        boolean b1 = false;
        if(a || b){//true even if one of them is true
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("for logical NOT...");
        System.out.print("NOT(a) is: ");
        System.out.println(!a);

        //else- else-if -else ladder
        System.out.println("Enter Your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
//        if(age>=56){
//            System.out.println("You are experienced.");
//        } else if (age>=46) {
//            System.out.println("You are semi-Experienced.");
//        } else if (age>=36) {
//            System.out.println("You are semi-semi-Experienced");
//        } else{
//            System.out.println("You are not Experienced");
//        }

        //Switch-case
        switch(age){
            case 18:
                System.out.println("You are going to become an adult.");
                break;
            case 21:
                System.out.println("You are going to join a job.");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoyyyy");
        }
        System.out.println("Thanks for using my Java code");

    }
}
