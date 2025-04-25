import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Scanner;
//
//class TwoDArray{
//    public static void main(String[] args) {
//        CreateArray(4,4);
//
//        int arr[][] = {{1,2,3,4},{5,6,7,7},{8,9,10,11}};
//        TransposeArray(arr);
//
//        int arr[][] = {{1,2,3,4},{5,6,7,7},{8,9,10,11}};
//        System.out.println(SumOf2DArray(arr));
//        int arr1[] [] = {{12,13,12},
//                {12,13,12}};
//        int arr2 [][] = {{12,13,12},
//                {34,33,12}};
//        //addTwoMatrix(arr1,arr2);
//
//        int result = AddDiagonalElements(arr1);
//        System.out.println(result);
//    }
//    public static void CreateArray(int rows, int cols){
//        Scanner sc = new Scanner(System.in);
//        int arr[][] = new int[rows][cols];
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0 ; j < arr[i].length ; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0 ; j < arr[i].length ; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void TransposeArray(int arr[][]){
//        for(int i = 0 ; i < arr[0].length ; i++){
//            for(int j = 0 ; j < arr.length ; j++){
//                System.out.println(arr[j][i]);
//            }
//        }
//    }
//    public static int SumOf2DArray(int arr[][]){
//        int sum = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0 ; j < arr[0].length ; j++){
//                sum = sum + arr[i][j];
//            }
//        }
//        return sum;
//    }
//
//    public static void addTwoMatrix(int arr1[][],int arr2[][]){
//        for(int i = 0 ; i < arr1.length ; i++){
//            for(int j = 0 ; j < arr1[i].length ; j++){
//                arr1[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//        for(int i = 0 ; i < arr1.length ; i++){
//            for (int j = 0 ; j < arr1[i].length ; j++){
//                System.out.println(arr1[i][j]);
//            }
//        }
//    }
//    public static int AddDiagonalElements(int arr[][]){
//        int sum = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0 ; j < arr[i].length ; j++){
//                if(i==j){
//                    sum += arr[i][j];
//                }
//            }
//        }
//        return sum;
//    }
//}

//class SpiralOrderMatrix{ //Program of Matrix for order m=n
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int rowStrt = 0;
//        int rowEnd = arr.length-1;
//        int colStrt = 0;
//        int colEnd = arr.length-1;
//
//        while(rowStrt <= rowEnd && colStrt <= colEnd) {
//            for (int i = rowStrt; i <= colEnd; i++) {
//                list.add(arr[rowStrt][i]);
//            }
//            rowStrt++;
//
//            for (int i = rowStrt; i <= colEnd; i++) {
//                list.add(arr[i][colEnd]);
//            }
//            colEnd--;
//
//            for (int i = colEnd; i >= colStrt; i--) {
//                list.add(arr[rowEnd][i]);
//            }
//            rowEnd--;
//
//            for (int i = rowEnd; i >= rowStrt; i--) {
//                list.add(arr[i][colStrt]);
//            }
//            colStrt++;
//        }
//    }
//}
//
//class spiralOrder{ //Program Of Matrix for order m!=n
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

//class SearchingMatrix{
//    public static void main(String[] args) {
//        int arr[][] = {{1,5,7,9,10,11},{6,10,12,13,20,21}};
//        int result[] = SearchInMatrix(arr,21);
//        System.out.println(Arrays.toString(result));
//    }
//    public static int[] SearchInMatrix(int arr[][], int target){
//        for(int i = 0 ; i < arr.length ; i++){  //arr.length returns number of rows
//            for(int j = 0 ; j < arr[i].length ; j++){ //arr[i].length returns number of columns at ith row
//                if(arr[i][j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[] {-1,-1};
//    }
//}

class SearchingMatrixIn{
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
//        int result[] = SearchEfficient(arr,40);
//        System.out.println(Arrays.toString(result));
        int result[] = ReducingRows(arr,20);
        System.out.println(Arrays.toString(arr));
    }
//    public static int[] SearchEfficient(int arr[][], int target){
//        int rs = 0;
//        int ce = arr.length-1;
//
//        while(rs < arr.length && ce >= 0){
//            if(arr[rs][ce] == target){
//                return new int[]{rs,ce};
//            }
//            else if (arr[rs][ce] > target) {
//                ce--;
//            }
//            else {
//                rs++;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//
    public static int[] BinarySearch(int arr[][], int rows, int colS, int colE, int target){
        while(colS <= colE){
            int mid = (colS+colE)/2;
            if(arr[rows][mid] == target){
                return new int[] {rows,mid};
            }
            else if (arr[rows][mid] < target) {
                colS = mid+1;
            }
            else{
                colE = mid;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] ReducingRows(int arr[][], int target){
        int rows = arr.length-1;
        int cols = arr[0].length-1;

        int rs = 0;
        int re = arr.length-1;
        int cMid = cols/2;

        while(rs < (re-1)){
            int mid = (rs+re)/2;

            if(arr[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(arr[mid][cMid] > target){
                re = mid;
            }
            else {
                rs = mid;
            }
        }
        //check if the target is at the current columns
        if(arr[rs][cMid] == target){
            return new int[]{rs,cMid};
        }
        if(arr[rs+1][cMid] == target){
            return new int[]{rs+1,cMid};
        }

        //Search in 1st half
        if(target <= arr[rs][cMid-1]){
            return BinarySearch(arr,rs,0,cMid-1,target);
        }
        //Search in 2nd half
        if(target <= arr[rs+1][cMid-1]){
            return BinarySearch(arr,rs+1,0,cMid-1,target);
        }
        //Search in 3rd half
        if(target >= arr[rs][cMid+1]){
            return BinarySearch(arr,rs,cMid+1,cols-1,target);
        }
        //Search in 4th half
        if(target >= arr[rs+1][cMid+1]){
            return BinarySearch(arr,rs+1,cMid+1,cols-1,target);
        }
        return new int[]{-1,-1};
    }
}
//
//class BinarySearchOn2D{
//    public static void main(String[] args) {
//
//    }
//    public static int[] binarySearch(int arr[][], int target, int rows, int cs, int ce){
//        while(cs <= ce){
//            int mid = (cs+ce)/2;
//            if(arr[rows][mid] == target){
//                return new int[]{rows,mid};
//            }
//            if(arr[rows][mid] > target){
//                ce = mid;
//            }
//            else{
//                cs = mid + 1;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//    public static int[] MinimizingTheArray(int arr[][], int target){
//        int rows = arr.length;
//        int cols = arr[0].length-1;
//
//        int rs = 0;
//        int re = arr.length;
//        int cmid = cols/2;
//        while(rs < re-1){
//            int mid = (rs+re)/2;
//            if(arr[mid][cmid] == target){
//                return new int[]{mid,cmid};
//            }
//            if(arr[mid][cmid] > target){
//                re = mid;
//            }
//            else {
//                rs = mid;
//            }
//        }
//        //Check if the elements are at the current index you're at
//        if(arr[rs][cmid] == target){
//            return new int[]{rs,cmid};
//        }
//        if(arr[rs+1][cmid] == target){
//            return new int[]{rs+1,cmid};
//        }
//        //Search First Half
//        if(target >= arr[rs][cmid-1]){
//            return binarySearch(arr,target,rs,0,cmid-1);
//        }
//        //Search below row
//        if(target <= arr[rs+1][cmid-1]){
//            return binarySearch(arr,target,rs+1,0,cmid-1);
//        }
//        //Search second half to end
//        if(target >= arr[rs][cmid+1]){
//            return binarySearch(arr,target,rs,cmid+1,cols);
//        }
//        //Search below row
//        if(target >= arr[rs+1][cmid+1]){
//            return binarySearch(arr,target,rs+1,cmid+1,cols);
//        }
//        return new int[]{-1,-1};
//    }
//}
