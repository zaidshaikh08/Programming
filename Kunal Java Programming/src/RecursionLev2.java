//class CheckSorted{
//    public static void main(String[] args) {
//        int arr[] = {1,2,4,9,12};
//        System.out.println(Checking(arr,0));
//    }
//
//    public static boolean Checking(int arr[], int idx){
//        if(idx == arr.length-1){  //idx reaches the end element
//            return true;
//        }
//        return arr[idx] < arr[idx+1] && Checking(arr,idx+1);
//    }
//}

//class LinearSearch{    //Search Single occurrence of an element
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,6};
//        System.out.println(LinearSearch(arr,6,0));
//    }
//    public static int LinearSearch(int arr[],int target, int idx){
//        if(idx == arr.length){    //Base Condition
//            return -1;
//        }
//        if(arr[idx] == target){   //Check if number is equal to target
//            return idx;
//        }
//        else {   //If not equal then idx is increased by 1 and then compares with other elements
//            return LinearSearch(arr,target,idx+1);
//        }
//    }
//}

import java.util.ArrayList;
//class LinearSearch {  //Multiple occurence        //Return type void
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,1,4,6};
//        int target = 1;
//        SearchElement(arr,target,0);
//        System.out.println(list);
//    }
//    public static ArrayList <Integer> list = new ArrayList<>();
//
//    public static void SearchElement(int arr[], int target, int idx){
//        if(idx == arr.length){
//            return;
//        }
//        if(arr[idx] == target){     //If number found then add idx into list
//            list.add(idx);
//        }
//        SearchElement(arr,target,idx+1);  //If not found then increase the idx by 1
//    }
//}

//class SearchElementReturnArrayList{
//    public static void main(String[] args) {
//        int arr[] = {1,23,4,5,6,7,1,1,8,1};
//        System.out.println(Search(arr,1,0, new ArrayList<>()));
//    }
//    public static ArrayList<Integer> Search(int arr[], int target,int idx, ArrayList<Integer> list){
//        if(idx == arr.length){      //Base Condition
//            return list;
//        }
//        if(arr[idx] == target){   //if element found add idx into the list
//            list.add(idx);
//        }
//        return Search(arr, target, idx+1, list);  //Move forward to the check next elements
//    }
//}

class SearchElement{     //Return array without passing as an argument
    public static void main(String[] args) {
        int arr[] = {23,4,5,6,7,1,1,8};
        System.out.println(Search(arr,1,0));
    }
    public static ArrayList<Integer> Search(int arr[], int target, int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length){
            return list;
        }
            //This will contain function call for that function only
        if(arr[idx] == target){
            list.add(idx);
        }
        //Now the Search function working will get implemented recursively
        ArrayList<Integer> recursiveCallForList = Search(arr,target,idx+1);
        //Note that when base condition hits, then the below code gets execute
        list.addAll(recursiveCallForList);
        return list;
    }
}

//class RotatedBinarySearch{
//    public static void main(String[] args) {
//        int arr[] = {9,1,2,3,4,5,7,8};
//        System.out.println(Search(arr,8,0,arr.length-1));
//    }
//    public static int Search(int arr[], int target, int start, int end){
//        int mid = (start+end)/2;
//
//        if(arr[mid] == target){
//            return mid;
//        }
//        if(arr[start] <= arr[mid]){     //Check if you're at the sorted part
//            if(arr[start] <= target && arr[mid] >= target){  //Check if start element is less than target and mid element is greater than target so it means that your target will lie in between
//                return Search(arr, target, start, end-1);//So we are changing our end to mid-1
//            }else {
//                return Search(arr,target,start+1,end);//If above condition is not true then it means the element does not lie in between the start and mid
//                //So we shift the start to mid+1, because it means that it will lie on the opposite side
//            }
//        }
//        //if you are in from sorted to Unsorted part
////            int arr[] = {7,8,9,1,2,3,4,5};
//        if(target > arr[mid] && target > arr[end]){
//            return Search(arr, target, start, end-1);
//        }
//        return Search(arr,target,start+1,end);
//    }
//}