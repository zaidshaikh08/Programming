//class PrintNumbers{
//    public static void Numbers(int n){
//        if(n == 0){
//            System.out.println(n);
//            return;
//        }
//        System.out.println(n);
//        //this is called tailed recursion as it is the last function call
//        Numbers(n-1);
//    }
//    public static void main(String[] args) {
//        int n = 10;
//        Numbers(n);
//    }
//}

//class NthfibonacciElement{
//    public static int FindFibo(int n){
//        if(n < 2){
//            return n;

//        }
//        return FindFibo(n-1) + FindFibo(n-2);
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        int result = FindFibo(n);
//        System.out.println(result);
//    }
//}

//class binaryRecursiveSearch{
//    public static int Search(int arr[], int start, int end, int target){
//        if(start > end){
//            return  -1;
//        }
//        int mid = (start+end)/2;
//        if(arr[mid] == target){
//            return mid;
//        }
//        if(arr[mid] < target){
//            return Search(arr, mid+1, end, target);
//        }else{
//            return Search(arr, start, mid-1, target);
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {12,43,56,78,90,100};
//        int result = Search(arr,0,arr.length,100);
//        System.out.println(result);
//    }
//}

