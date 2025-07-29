public class practice_set4 {
    public static void main(String[] args) {

        //Problem1- create an array of 5 floats and calculate their sum
//
//        float[] floats={2.0f,3.0f,4.0f,5.0f,6.0f};
//        float sum=0;
//        for (int i = 0; i < floats.length; i++) {
//            sum = sum + floats[i];
//
//        }
//        System.out.println("Sum: "+sum);

        //Problem2-
//        int[] present = {33,92,10,56,83,74};
//        int num=11;
//        boolean isInArray=false;
//        for(int a:present){
//            if(num==a){
//                isInArray=true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("Value is in array.");
//        }else{
//            System.out.println("Not in Array");
//        }
        //Problem3- sum of 2 matrices of 2x3

//        int[][] mat1={{1,2,3},
//                      {4,5,6}};
//
//        int[][] mat2={{4,2,1},
//                     {1,0,3}};
//        int[][] sum={{0,0,0},
//                {0,0,0}};
//
//        for(int i=0;i<mat1.length;i++){
//            for (int j = 0; j <mat1[i].length ; j++) {
//                System.out.printf("setting value for i=%d and j%d\n",i,j);
//                sum[i][j]=mat1[i][j]+mat2[i][j];
//            }
//        }
//
//        for(int i=0;i<mat1.length;i++){
//            for (int j = 0; j <mat1[i].length ; j++) {
//                System.out.print(sum[i][j]+" ");
//                sum[i][j]=mat1[i][j]+mat2[i][j];
//            }
//
//            System.out.println("");
//        }
        //Problem4- Reverse array
//        int[] arr={1,2,3,4,5,6};
//        int l= arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//
//        for(int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int j : arr) {
//            System.out.print(" "+j);
//        }
//        //Find maximum number in an array
//        int max=arr[0];
//        for (int i=0;i< arr.length;i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//            System.out.println("\nMaximum number= "+max );



        //Problem5- array is sorted or not?
        int[] arr={1,2,3,4,5};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Sorted");
        }else {
            System.out.println("Not Sorted");
        }




    }
}
