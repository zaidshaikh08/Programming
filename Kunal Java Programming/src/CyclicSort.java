//import java.util.Arrays;
//class cyclicSort{
//    public static void main(String[] args) {
//        int arr[] = {1,2,5,3,4};
//        CyclicSorting(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void CyclicSorting(int arr[]){
//        int i = 0;
//        while(i < arr.length-1){
//            if(i+1 != arr[i]){
//                swap(arr,i,arr[i]-1);
//            }
//            else{
//                i++;
//            }
//        }
//    }
//    public static void swap(int arr[], int f, int s){
//        int temp = arr[f];
//        arr[f] = arr[s];
//        arr[s] = temp;
//    }
//}

//import java.util.Arrays;
//class MissingNumber{
//    public static int Number(int arr[]){
//        int i = 0;
//        int element = 0;
//        while(i < arr.length){
//            if(arr[i] == i){
//                i++;
//            }else{
//                return i;   //return the element missing
//            }
//        }
//        return arr.length;  //if no missing Number then resturn the length of array
//    }
//    public static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static void CyclicSort(int arr[]){
//        int i = 0;
//        int n = arr.length;
//        while(i < n){
//            int correct = arr[i];
//            if (arr[i] < n && arr[i] != arr[correct]) {  // Ensure it's within bounds and not already correct
//                swap(arr, i, correct);
//            } else {
//                i++;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {4,2,3,0};
//        CyclicSort(arr);
//        System.out.println(Arrays.toString(arr));
//        int SearchingNumber = Number(arr);
//        System.out.println(SearchingNumber);
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//class Disappeared{
//    public static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static List<Integer> Sorting(int arr[]){
//        int i = 0;
//        while(i < arr.length){
//            int correct = arr[i] - 1;
//            if(arr[i] != arr[correct]){
//                swap(arr,i,correct);
//            }else{
//                i++;
//            }
//        }
//        //checking for duplicates after sorting
//        List<Integer> ans = new ArrayList<>();
//        for(int index = 0 ; index < arr.length ; index++){
//            if(arr[index] != index+1){
//                ans.add(index+1);  //adding into arraylist all the duplicates
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
//        List<Integer> missingNumbers = Sorting(arr);
//        System.out.println(missingNumbers);
//
//    }
//}

//import java.util.Arrays;
//
//class FindDuplicates{
//    public static int [] FindDuplicates(int arr[]){
//        int nArr [] = new int[arr.length];
//        int count = 0;
//        for(int i = 0 ;i < arr.length ; i++){
//            if(arr[i] != i){
//                nArr[count] = arr[i];
//                count++;
//            }
//        }
//        return Arrays.copyOf(nArr,count);
//    }
//    public static void Swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static void Sorting(int arr[]){
//        int i = 0;
//        while (i < arr.length){
//            int correct = arr[i];
//            if(arr[i] != arr[correct]){
//                Swap(arr,i,correct);
//            }else{
//                i++;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {4,3,2,7,8,2,3,1,0};
//        Sorting(arr);
//        System.out.println(Arrays.toString(arr));
//        int getDuplicates[] = FindDuplicates(arr);
//        System.out.println(Arrays.toString(getDuplicates));
//    }
//}

//import java.util.Arrays;

//find duplicate and  missing number at the place of duplicate
//class FindDupAndMissing{
//    public static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static int[] Sorting(int arr[]){
//        int i = 0;
//        while(i < arr.length){
//            int correct = arr[i]-1;
//            if(arr[i] != arr[correct]){
//                swap(arr,i,correct);
//            }else{
//                i++;
//            }
//        }
//
//        for(int index = 0 ; index < arr.length ; index++){ //check if elements are at correct index
//            if(arr[index] != index+1){//duplicate found
//                return new int[] {arr[index],index+1};
//            }
//        }
//        return new int[] {-1,-1};  //No duplicates
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1,3,2,2};
//        int result[] = Sorting(arr);
//        System.out.println(Arrays.toString(result));
//    }
//}

