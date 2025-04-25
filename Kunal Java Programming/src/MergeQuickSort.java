//import java.util.Arrays;
//class MergeSort{
//    public static void main(String[] args) {
//        int arr[] = {8,3,4,12,5,6};
//        int result [] = MergeSort(arr);
//        System.out.println(Arrays.toString(result));
//    }
//    public static int[] MergeSort(int arr[]){
//        if(arr.length == 1){
//            return arr; //return the single array itself
//        }
//
//        int mid = arr.length/2;
//
//        int [] left = MergeSort(Arrays.copyOfRange(arr,0,mid));  //mid element wont be counted  //copy of array
//        int [] right = MergeSort(Arrays.copyOfRange(arr,mid,arr.length));  //Copy of right part of the array
//
//        return MergingArray(left,right);
//    }
//
//    public static int[] MergingArray(int left[], int right[]){
//        int newArr[] = new int[left.length + right.length];
//
//        //Comparing the elements of left and right array and storing them into our mergedArray
//        int i = 0;  //Pointer for left half
//        int j = 0;  // Pointer for right half
//        int k = 0;  //Pointer for storing element in new array
//
//        while(i < left.length && j < right.length){
//            //compare element of left with right
//            if(left[i] < right[j]){
//                newArr[k] = left[i];   //Putting small element inside the new array
//                i++; //shifting the pointer to the right by 1
//            }else{
//                newArr[k] = right[j];
//                j++;
//            }
//            //Increase the pointer k after adding an element into it
//            k++;
//        }
//
//        //Now for the array if there is elements in one array and second element does not have elements to compare
//        //if left array has elements
//        while(i < left.length){  //condition means that there are still elements present in the array
//            newArr[k] = left[i];
//            i++;
//            k++;
//        }
//
//        //if left array has elements
//        while(j < right.length){ //still elements present in the right array
//            newArr[k] = right[j];
//            j++;
//            k++;
//        }
//
//        return newArr;
//    }
//}

//import java.util.Arrays;
//class InplaceMergeSort{
//    public static void main(String[] args) {
//        int arr[] = {5,4,3,2,1};
//        MergeSort(arr,0, arr.length);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void MergeSort(int arr[], int s, int e){
//        //This base condition will hit separately for each calls
//        if(e-s == 1){
//            return;
//        }
//
//        int m = (s+e)/2;
//
//        MergeSort(arr, s, m); //Dividing the array until single elem remains
//        MergeSort(arr,m,e); ////Dividing the array until single elem remains
//
//        //As we get single elements now the inplace function does it's work
//        InplaceMerging(arr,s,m,e);
//
//    }
//    //In below code we've not called it recursively
//    public static void InplaceMerging(int arr[], int s, int m, int e){
//        //creating arrays for elements of sub array
//        //The logic behind e-s is that in beginning the s=0 and e=arr.length that will be equal to the org array
//        //In case if we write arr.length then it will lead to incorrect behaviour as we're not actually dividing the array but just manipulating pointers for solving the problem
//        int newArr [] = new int[e-s];
//        //based on the size of the sub array a new array is created
//
//        int i = s;
//        int j = m;
//        int k = 0;
//
//        //Placing the array elements in sorted manner inside the newArr
//        while(i < m && j < e){
//            if(arr[i] < arr[j]){
//                newArr[k] = arr[i];
//                i++;
//            }else{
//                newArr[k] = arr[j];
//                j++;
//            }
//            k++;
//        }
//
//        while(i < m){     // If element remaining in left half
//            newArr[k] = arr[i];
//            i++;
//            k++;
//        }
//
//        while (j < e){    //If elements remaining in right half
//            newArr[k] = arr[j];
//            j++;
//            k++;
//        }
//
//        //Sorting the actual array we have from the new array created
//        for(int l = 0 ; l < newArr.length ; l++){
//            arr[s+l] = newArr[l];
//        }
//    }
//}

//import java.util.Arrays;

import java.util.Arrays;
////At first my small elements then pivot gets to the left and pivot gets at correct position and all large elements at right of pivot
////After this it calls recursive function now the array we have is the left part of array. So we sort this array as we did previously
////As this array gets sorted it then calls another recursive function and that sorts right part
//
class QuickSort{
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        Sorting(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sorting(int arr[], int low, int high){
        if(low >= high){   //when low gets greater than high
            return;
        }
        int s = low;
        int e = high;
        int m = (s+e) / 2;
        int pivot = arr[m];

        //Shifting all the smallest elements less than pivot to the left and large element to the right of the pivot
        while(s <= e){   //when this loop breaks that means it has sorted based on the condition of quick sort

            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            //If element violates the condition then swap and increase the value of s by 1
            if(s <= e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        //Now my array has been sorted based on the condition of quick sort
        //We'll now take left part and right part via recursion and sort them
        Sorting(arr,low,e);
        Sorting(arr,s,high);
    }
    public static void swap(int arr[], int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}

//In languages there are many inbuilt classes that are present for operations like sorting.
//In java to call it we can use Arrays.sort to call the class.
//Different languages has different built in algo. In java, quick sort is used.



//class mergeSort{
//    public static void main(String[] args) {
//        int arr[] = {5,4,3,2,1};
//        Divide(arr,0,arr.length);
//        System.out.println(Arrays.toString(arr));
//
//    }
//    public static void Divide(int arr[], int s, int e){
//        if(e -s == 1){
//            return ;
//        }
//        int mid = (s+e)/2;
//
//        Divide(arr, s, mid);//Here mid is exclusive
//        Divide(arr,mid,e);
//
//        Conquer(arr,s,mid,e);
//    }
//    public static void Conquer(int arr[], int s, int m, int e){
//        int mix[] = new int [e-s];
//
//        int i = s; //Start pointer of arr1
//        int j = m; //Start pointer of arr2
//        int k = 0; //Start pointer of mix
//
//        while(i < m && j < e){
//            if(arr[i] < arr[j]){
//                mix[k] = arr[i];
//                i++;
//            }
//            else {
//                mix[k] = arr[j];
//                j++;
//            }
//            k++;
//        }
//
//        //For remaining elements
//        while(i < m){
//            mix[k] = arr[i];
//            i++;
//            k++;
//        }
//        while(j < e){
//            mix[k] = arr[j];
//            j++;
//            k++;
//        }
//
//        for(int l = 0 ; l < mix.length ; l++){
//            arr[s+l] = mix[l];
//        }
//    }
//}
