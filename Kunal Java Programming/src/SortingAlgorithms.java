//compare adjacent elements and swap them at that time only (push large element to rightmost index).
//import java.util.Arrays;
//class bubbleSorting{  //Best case O(n) ; Worst Case : O(n^2)
//    public static void Sorting(int arr[]){
//        boolean swapped;
//        for(int i = 0 ; i < arr.length ; i++){
//            swapped = false;
//            for(int j = 1 ; j < arr.length - i ; j++){
//                if(arr[j] < arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                    swapped = true;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {5,3,4,2,1};
//        Sorting(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

//import java.util.Arrays;
//class SelectionSorting{  //Best Case : O(n^2). Worst Case : O(n^2).
//    public static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static int getMaxIndex(int arr[], int start, int end){
//        int max = start;
//        for(int i  = start ; i <= end ; i++){
//            if(arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }
//    public static void selection(int arr[]){
//        for(int i = 0 ; i < arr.length-1 ; i++){
//            int last = arr.length-i-1;
//            int maxIndex = getMaxIndex(arr,0,last);
//            swap(arr,maxIndex,last);
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {12,1,0,44,53,11,2,9,7};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//}

//import java.util.Arrays;
//class InsertionSort{ //Best Case : O(n). Worst Case : O(n^2)
//    public static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static void Sorting(int arr[]){
//        for(int i = 0 ; i < arr.length-1 ; i++){    //Your numbers till i will be your sorted part
//
//            int j = i + 1;                          //Numbers from i+1 will be the unsorted part
//
//            while(j > 0 && arr[j] < arr[j-1]){      //Checking for the condition as we're decreasing the j by 1 after every comparison and the condition is placed for checking not exceeding the value of j as we decrement
//
//                if(arr[j] < arr[j-1]){              // Comparison of j and j-1 elements
//                    swap(arr,j,j-1);        //Swapping of element if j < j-1
//                    j--;
//                }
//
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {5,3,4,1,2};
//        Sorting(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

