public class practice_set1 {
    public static void main(String[] args) {


        //Problem1 - Convert a string to lowercase
        String name= new String();
        name= "YASH";

        System.out.println("The original string is: "+ name);
        String lcase = name.toLowerCase();
        System.out.println("The original string converted to lower case stored in variable lcase is: "+lcase);



        //Problem2 - replace spaces with underscores
        String fullname = "Yash Nitin Katolkar";
        System.out.println("Full name string (with spaces): "+fullname);

        String usname = fullname.replace(' ','_');
        System.out.println("Full name string(Spaces replaced with underscores): "+usname);



        //Problem3 - to fill in a letter template - Replace <|name|> with any string
        String letter = "Dear <|name|>, Thanks a lot.";
        letter = letter.replace("<|name|>","Harry"); //the string is not changed, string is immutable, just the variable "letter" is now referencing to other string
        System.out.println(letter);


        //Problem4 - detect double and triple spaces in a string
        String spaces= "This string contains  double and   triple spaces";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));
        System.out.println(spaces.indexOf("    "));//4 spaces - index -1 because there is not 4 spaces in the string


        //format using escape sequence characters
        String letter1= "Dear Harry,\n\tThis \"Java Course\" is nice.\nThanks!";
        System.out.println(letter1);




    }
}
