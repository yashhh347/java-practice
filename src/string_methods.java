public class string_methods {
    public static void main(String[] args) {
        String a="harry";
        String a1= new String("BARRY");

        System.out.println(a);
        System.out.println(a1);

        //length of string
        int value= a.length();
        System.out.println(value);

        System.out.println(a1.toLowerCase());//strings are immutable, the a1 string won't change but the reference now shifts to another and gets printed but no change to the original a1 string occurs
        //converts all uppercase characters to lowercase
        String lstring = a1.toLowerCase();
        System.out.println(lstring);

        //converts all lowercase characters to uppercase
        String ustring = a.toUpperCase();
        System.out.println(ustring);

        //returns new string after removing all leading & trailing spaces
        String nonTrimmed = "  Yash    ";
        System.out.println(nonTrimmed);
        System.out.println(nonTrimmed.trim());

        //Returns substring from start to end (for start method)
        System.out.println(a1.substring(3));
        //start index included, end index excluded
        System.out.println(a1.substring(1,3));

        //returns new string after replacing
        System.out.println(a.replace('r','p'));
        System.out.println(a1.replace("R","TQ"));

        //returns boolean
        System.out.println(a.startsWith("ha"));
        System.out.println(a.endsWith("ry"));

        //considers first substring if characters are repeated in a word
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf('h'));
        //we can specify from which index to start counting and after that index it will return the first occurence of the substring
        System.out.println(a.indexOf("r",3));
        //if we want to start from behind; like last index of a repeated substring
        System.out.println(a.lastIndexOf("r"));

        //returns true if given string is correctly mentioned
        System.out.println(a.equals("harry"));
        System.out.println(a.equals("Harry"));
        //not case-sensitive
        System.out.println(a.equalsIgnoreCase("Harry"));


        //Escape sequence characters --> \n, \t, \', \", \\
        //System.out.println("I am sequence character " double quote "); --> error because it gets confused which is the double quote text
        //we escape use sequence character \"
        System.out.println("I am sequence character \" double quote ");








    }
}
