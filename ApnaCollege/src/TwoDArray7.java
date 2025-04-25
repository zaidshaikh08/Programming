import java.util.*;
class TwoDArray{
    public static void main(String args[]){
        int [] [] arr = new int[3][5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ;i < 3 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}

//class numberOfRowsAndCol{
//    public static void main(String args[]){
//        int [][] arr = {{2,2,23,4,56},{43,22,54,66,12}};
//
//        int rows = arr.length;
//        System.out.println(rows);
//
//        int col = arr[0].length;    //checks the no of elements in a row(Here 0)
//        System.out.println(col);
//    }
//}

//import java.util.*;
//class searchElement{
//    public static void main(String args[]){
//        Scanner sc =new Scanner(System.in);
//        int [] [] arr = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12}};
//        int search = sc.nextInt();
//        boolean isPresent = false;
//
//        for(int i = 0 ;i < arr.length ; i++){
//            for(int j = 0 ; j < arr[i].length ; j++){
//                if(arr[i][j] == search){
//                    isPresent = true;
//                    System.out.println("Element found at index "+i+j);
//                }
//            }
//        }
//        if(!isPresent){
//            System.out.println("No Elements are present based on your search");
//        }
//    }
//}

//class spiralOrder{
//    public static void main(String args[]){
//        int row = 4;
//        int col = 5;
//        int [][] arr = {{1,5,7,9,10,11},
//                        {6,10,12,13,20,21},
//                        {9,25,29,30,32,41},
//                        {15,55,59,63,68,70},
//                        {40,70,79,81,95,105}};
//        int rowStrt = 0;
//        int rowEnd = row;
//        int colStrt = 0;
//        int colEnd = col;
//
//        while(rowStrt <= rowEnd && colStrt <= colEnd) {
//            for (int i = rowStrt; i <= colEnd; i++) {
//                System.out.println(arr[rowStrt][i]);
//            }
//            rowStrt++;
//
//            for(int i = rowStrt ; i <= rowEnd ; i++){
//                System.out.println(arr[i][colEnd]);
//            }
//            colEnd--;
//
//            for(int i = colEnd ; i >= colStrt ; i--){
//                System.out.println(arr[rowEnd][i]);
//            }
//            rowEnd--;
//
//            for(int i = rowEnd ; i >= rowStrt ; i--){
//                System.out.println(arr[i][colStrt]);
//            }
//            colStrt++;
//
//            System.out.println();
//        }
//    }
//}

//import java.util.*;
//class Arrays {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//
//        int matrix[][] = new int[n][m];
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//
//        System.out.println("The transpose is : ");
//        //To print transpose
//        for(int j=0; j<m ;j++) {
//            for(int i=0; i<n; i++) {
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class sumOfRow2{
//    public static void main(String args[]){
//        int[][] table = { {1,4,9},{11,4,3},{2,2,3} };
//        int [] arr = new int[table[1].length];
//        int sum = 0;
//        for (int j = 0; j < table[1].length; j++) {
//            arr[j] = table[1][j];
//        }
//        for(int i = 0 ; i < arr.length ; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//    }
//}

//class addTwoMatrix{
//    public static void main(String args[]){
//        int arr1[] [] = {{12,13,12},
//                         {12,13,12}};
//        int arr2 [][] = {{12,13,12},
//                        {34,33,12}};
//        int result[][] = new int[2][3];
//        for(int i = 0 ; i < arr1.length ; i++){
//            for(int j = 0 ; j < arr1[i].length ; j++){
//                result[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//        for(int i = 0 ; i < result.length ; i++){
//            for(int j = 0 ; j < result[i].length ; j++){
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}