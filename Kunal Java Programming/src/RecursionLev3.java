//class Normaltriangle{
//    public static void main(String[] args) {
//        int r = 4;
//        Pattern(r,0);
//    }
//    public static void Pattern(int r, int c){
//        //base Condition
//        if(r == 0){
//            return;
//        }
//        if(r > c){  //For printing stars till my row is greater than c. which will create a line for nth row
//            System.out.print("* ");
//            Pattern(r,c+1);   //row remains the same and column value gets increased by 1 and will stop executing if row > col
//        }else{
//            System.out.println();
//            Pattern(r-1,0); //Printing of 1 line gets completed and value of row decreased by 1 to print for another row
            //note that value of c should be refreshed to 0 as it is used for comparing with the rows
            //We're first printing the star and then increasing the value of c by 1.
//        }
//    }
//}

//class hypoTriangle{
//    public static void main(String[] args) {
//        int n = 4;
//        Printing(n,0);
//    }
//    public static void Printing(int r, int c){
//        if(r == 0){
//            return;
//        }
//        if(r > c){
//            Printing(r,c+1);
//            System.out.print("*");
//        }else{
//
//            Printing(r-1,0);
//            System.out.println();
//            //We're first letting all the recursive calls to get complete and after all the calls get completed then we're printing
//            //stars
//        }
//    }
//}


import java.util.Arrays;

//class BubbleSort{
//    public static void main(String[] args) {
//        int arr[] = {4,3,2,1};
//        Sort(arr,arr.length-1,0);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void Sort(int arr[], int r, int c){
//        if(r==0){
//            return;
//        }
//        if(c < r){
//            if(arr[c] > arr[c+1]){
//                swap(arr, c,c+1);
//                Sort(arr, r, c+1);
//            }
//        }
//        else{
//            Sort(arr, r-1, 0);
//        }
//    }
//    public static void swap(int arr[], int f, int s){
//        int temp = arr[f];
//        arr[f] = arr[s];
//        arr[s] = temp;
//
//    }
//}

//class SelectionSort {
//    public static void main(String[] args) {
//        int arr[] = {4, 3, 2, 1};
//        Sorting(arr,arr.length,0,0);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void Sorting(int arr[], int r, int c, int largest) {
//        if(r==0){
//            return;
//        }
//        if (c < r) {
//            if (arr[largest] < arr[c]) {
//                Sorting(arr, r, c + 1, c);
//            }else{
//                Sorting(arr,r,c+1,largest);
//            }
//        } else {
//            swap(arr,largest,r-1);
//            Sorting(arr,r-1,0,0);
//        }
//
//    }
//    public static void swap(int arr[], int f, int s){
//        int temp = arr[f];
//        arr[f] = arr[s];
//        arr[s] = temp;
//    }
//}

