import java.util.Scanner;

public class practice_set3 {
    public static void main(String[] args) {
        //Problem1- Print a pattern using loops

        for (int i=4;i>0;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Problem2- sum of first n even numbers using while loop

//        int sum=0;
//        int i=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value of n: ");
//        int n =sc.nextInt(); //this value will remain constant
//        while(i<=n){
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.println("Sum= "+ sum);

        //Problem3- multiplication table of n
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value of n: ");
//        int n =sc.nextInt();
//
//        for (int i=1;i<=10;i++){
//            System.out.println(i*n);
//        }

        //Problem4- Reverse multiplication table of 10

//        int n=10;
//        for (int i=10;i!=0;i--){
//            System.out.println(n*i);
//        }

        //Problem5- Find factorial of a give number using for loops
        //Factorial of  n--> n*(n-1)*(n-2)*....*1--> i.e. keep multiplying till we get 1
//        int n=3;//we want factorial of 3
//        int fact= 1; //multiply krna hai toh initialize with 1, for sum initialize with 0
//        for(int i =1; i<=n;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial= "+fact);


        //Problem6- sum of numbers in 8's table
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value of n: ");
//        int n =sc.nextInt();
//        int sum=0;
//
//        for (int i=1;i<=10;i++){
//            int table = i*n;
//            sum = sum+table;
//        }
//        System.out.println(sum);

    }

}
