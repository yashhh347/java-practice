import java.util.Scanner;

public class ch3dowhile {
    public static void main(String[] args) {
        System.out.println("While Loop - ");
        int i =1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish running While loop.");

        //while loop does not necessarily run atleast once
        int a =10;
        while(a<5){
            System.out.println(a);
            a++;
        }//nothing got printed

        //Do-While loop on the other hand runs atleast once
        int b = 0;
        System.out.println("Do-While Loop-");
        do{
            System.out.println(b);
            b++;
        }while(b<5);
        int c=10;
        System.out.println("Finish Do-While Loop.");
        System.out.println("Do-While Loop exists atleast once.");
        do{
            System.out.println(c);
            c++;

        }while(c<5);

//        System.out.println("Printing first n natural numbers using Do-While.");
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter value of n: ");
//        int n = sc.nextInt();
//        int x=1;
//
//        do{
//            System.out.println(x);
//            x++;
//
//        }while(x<=n);


        //For loop
        System.out.println("For loop- ");
        for(int j = 1;j<=5;j++){
            System.out.println(j);
        }
        System.out.println("For loop(decrementing)- ");
        for(int y = 5;y>=2;y--){
            System.out.println(y);
        }

//        System.out.println("Printing first n odd numbers using a for loop- ");
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter value of n: ");
//        int n = sc.nextInt();
//        //2n= even nos. = 0,2,4,6,8,....
//        //2n+1= odd nos. = 1,3,5,7,9,....
//
//        for (int x=0;x<n;x++){
//            System.out.println(2*x+1);
//        }

        //Break and continue using loops
        for (int x = 0;x<5;x++){
            System.out.println(x);
            System.out.println("Java is great!");

        }
        System.out.println("Using Break statement");
        for (int z = 0;z<5;z++){
            System.out.println(z);
            System.out.println("Java is great!");

            if (z==2){
                System.out.println("Ending the loop");
                break;
            }
        }

        System.out.println("Using Break statement");
        for (int d = 0;d<5;d++){

            if (d==2){
                System.out.println("iteration for 2");
                continue;}
            System.out.println(d);
            System.out.println("Java is great!");

        }
    }
}
