import java.util.Scanner;

public class ch7recursion {
    static int factorial(int n){
        //factorial(n)=n* n-1 * n-2 * n-3 * .....1
        //factorial(n)=n* factorial(n-1)

        if (n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }

    }

    static int iterative_factorial(int n){
        //factorial(n)=n* n-1 * n-2 * n-3 * .....1
        //factorial(n)=n* factorial(n-1)

        if (n==0 || n==1){
            return 1;
        }else{
            int product = 1;
            for(int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number who's factorial you want to calculate- ");
        int a= sc.nextInt();

        System.out.println("Factorial of " + a + " by recursive approach is- "+ factorial(a));
        System.out.println("Factorial of " + a + " by iterative approach is- "+ iterative_factorial(a));

    }
}
