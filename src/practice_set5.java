import java.util.Scanner;

public class practice_set5 {
    //Problem1- use java method to print multiplication number
//    static void table(int n){
//        for(int i=1; i<=10; i++){
//            System.out.printf("%d * %d = %d\n",n,i,n*i);
//        }
//    }


    //Problem2 - Use functions to print pattern
//    static void pattern(int rows){
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }


    //Problem3- Recursive function to calculate sum of first n natural nos.
//    static int sum(int n) {
//        if (n == 1) {
//            return 1;
//        } else {
//            int add = n + sum(n - 1);
//            return add;
//        }
//    }

    //Problem4- function to print the nth term of fibonacci series using loop
    //first let's try printing the series till nth term

    static void series(int m){
        int[] arr= new int[m];
        arr[0]=0;
        if(m>1){
            arr[1]=1;
            for (int i = 2; i < m; i++) {
                arr[i]=arr[i-1]+ arr[i-2];

            }
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    //now printing the nth term using loops

    static int fibanocci(int n){
        int[] arr=new int[n+1];

        arr[0] = 0;

        if(n>1){
            arr[1] = 1;
            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr[n];
    }




    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);



        int m=15;
        series(m);
        System.out.println("Enter value of n- ");
        int n = sc.nextInt();
        System.out.println(fibanocci(n-1));


        //Problem3- Recursive function to calculate sum of first n natural nos.
//        int n = 5;
//        System.out.println(sum(n));

        //Problem2 - Use functions to print pattern
//        int rows=4;
//        pattern(rows);

        //Problem1- use java method to print multiplication number
//        System.out.println("Enter value of n- ");
//        int n = sc.nextInt();
//        table(n);


    }
}
