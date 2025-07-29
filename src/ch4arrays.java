public class ch4arrays {
    public static void main(String[] args) {
        //Types to declare array

        int[] marks; //Declaration
        marks = new int[5]; //Memory Allocation

        String[] names = new String[3]; //declaration+memory allocation
        names[0] = "Yash";
        names[1] = "Prathmesh";
        names[2] = "Aditya";
        System.out.println("Length of Array-names = " + names.length);

        int[] ages = {34, 33, 32, 31, 30}; //declaration+initialization

        //Displaying an array
        System.out.println("Displaying an array");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        //reverse order
        System.out.println("Displaying the array in reverse order");
        for (int i = ages.length - 1; i >= 0; i--) {
            System.out.println(ages[i]);
        }
        //for-each loop
        System.out.println("Using for-each loop");
        for (int element : ages) {
            System.out.println(element);
        }


        //Multidimensional Arrays
        int[][] flats;//2d Array
        flats = new int[2][3];

        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 200;
        flats[1][1] = 201;
        flats[1][2] = 202;

        System.out.println("Flat number of 1st floor 2nd flat- " + flats[1][1]);

        //Displaying a 2d array
        System.out.println("Displaying a 2d array- ");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
