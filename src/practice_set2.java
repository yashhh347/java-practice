import java.util.Scanner;

public class practice_set2 {
    public static void main(String[] args) {
        //Problem1- See if student is pass or fail

        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter you maths marks: ");
//        int maths = sc.nextInt();
//        System.out.println("Enter you science marks: ");
//        int sci = sc.nextInt();
//        System.out.println("Enter you english marks: ");
//        int eng = sc.nextInt();
//
//        float aggr = (maths+sci+eng)/3.0f;
//        System.out.println("Overall percentage is: "+aggr);
//        if(aggr>=40 && maths>33 && sci>=33 && eng>=33){
//            System.out.println("Congratulations, You are passed!");
//
//        }
//        else {
//            System.out.println("Unfortunately, you are failed");
//        }


        //Problem2 - Calculate income tax

//        float tax = 0;
//        System.out.println("Your income is(in Lakhs per annum): ");
//        float income = sc.nextFloat();
//
//        if(income<=2.5){
//            tax = tax+0;
//        } else if (income>2.5f && income<=5.0f) {
//            tax = tax + 0.05f*(income-2.5f);
//        }
//        else if (income>5f && income<=10.0f) {
//            tax = tax + 0.05f*(5.0f-2.5f);
//            tax = tax + 0.2f*(income-2.5f);
//        }else if (income>10.0f) {
//            tax = tax + 0.05f*(10.0f-5f);
//            tax = tax + 0.2f*(5.0f-2.5f);
//            tax = tax + 0.3f*(income-2.5f);
//
//        }
//
//        System.out.println("The total tax paid by the employee: "+ tax);

        //Problem3- find out day of week

//        System.out.println("Enter a number from 1-7: ");
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Today is Monday.");
//                break;
//            case 2:
//                System.out.println("Today is Tuesday.");
//                break;
//            case 3:
//                System.out.println("Today is Wednesday.");
//                break;
//            case 4:
//                System.out.println("Today is Thursday.");
//                break;
//            case 5:
//                System.out.println("Today is Friday.");
//                break;
//            case 6:
//                System.out.println("Today is Saturday.");
//                break;
//            case 7:
//                System.out.println("Today is Sunday.");
//                break;
//            default:
//                System.out.println("Entered a wrong number");
//        }

        //Problem4- Find whether a year is a leap year

//        System.out.println("Enter a year: ");
//        int year = sc.nextInt();
//        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//            System.out.printf("%d is a leap year.", year);
//        }else{
//            System.out.printf("%d is not a leap year.",year);
//        }

        //Problem5- Find out the type of website from the url
        System.out.println("Enter a website to check: ");
        String site = sc.nextLine();

        if(site.endsWith(".com")){
            System.out.println("Given website is a commercial website.");
        } else if (site.endsWith(".org")) {
            System.out.println("Given website is an organization website.");
        } else if (site.endsWith(".in")) {
            System.out.println("Given website is an Indian website.");
        }else {
            System.out.println("Not a valid Website. Run the program again and enter a valid one.");
        }


    }
}
