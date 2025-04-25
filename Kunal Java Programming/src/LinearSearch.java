//import java.util.*;
//class linearSearch{     //Returning the index of the element
//    public static int SearchArray(int arr[], int target){
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int arr[] = {12,131,41,54,64,90};
//        System.out.println("enter the element to Search : ");
//        int element = sc.nextInt();
//        int result = SearchArray(arr,element);
//        System.out.println("The element found at the index : "+result);
//    }
//}

//import java.util.*;
//class linearSearch2{  //Returning if the element is present inside the array
//    public static boolean linearSearch(int arr[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the element you want to search : ");
//        int target = sc.nextInt();
//        for(int i = 0 ; i <arr.length ; i++){
//            if(arr[i] == target){
//
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String args[]){
//        int arr[] = {12,34,125,65,43,11,56};
//        boolean linearSearch = linearSearch(arr);
//        System.out.println(linearSearch);
//    }
//}


//class linearSearchString{    //Returning true if the String is present inside the array
//    public static boolean Searching(String arr[], String target){
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i].equals(target)){
//                System.out.println("Element Found at index : "+i);
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String args[]){
//        String arr[] = {"Peaky","Blinders","Peaky Blinders"};
//        boolean SearchTarget = Searching(arr,"Blinders");
//        System.out.println(SearchTarget);
//    }
//}

//class SearchInRange{        //Searching for a particular range
//    public static boolean Search(int arr[],int target, int StartRange, int lastRange) {
//        for(int i = StartRange ; i < lastRange ; i++){
//            if(arr[i] == target){
//                System.out.println("Found at index : "+i);
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int arr[] = {12,14,67,32,45,90,33};
//        boolean Searching = Search(arr,33,2,arr.length);
//        System.out.println(Searching);
//    }
//}

//class SearchMinimum{   //Searching for Smallest number
//    public static void Searching(int arr[]){
//        int smallest = arr[0];
//        int index = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] < smallest){
//                smallest = arr[i];
//                index = i;
//            }
//        }
//        System.out.println("The Smallest element found at the index : "+index+" which is "+smallest);
//    }
//    public static void main(String args[]){
//        int arr[] = {12,34,55,3,21,14,16,78};
//        Searching(arr);
//    }
//}

import java.util.Arrays;

//class Search2DArray{   //Searching in 2D array
//    public static int[] Searching(int arr[][], int target){
//        for(int row = 0 ; row < arr.length ; row++){
//            for(int col = 0 ; col < arr[row].length ; col++){
//                if(arr[row][col] ==target){
//                    return new int[] {row,col};
//                }
//            }
//        }
//        return new int []{-1,-1};
//    }
//    public static void main(String[] args) {
//        int arr[][] = {
//                {12,14,15},
//                {34,21,55},
//                {35,65,77},
//        };
//        int[] result = Searching(arr,15);
//        System.out.println(result);
//    }
//}

//class MaxIn2dArray{      Searching Maximum element in  the 2D array
//    public static int Search(int arr[][]){
//        int max = Integer.MIN_VALUE;
//        for(int row = 0 ; row < arr.length ; row++){
//            for(int col = 0 ; col < arr[row].length ; col++){
//                if(max < arr[row][col]){
//                    max = arr[row][col];
//                }
//            }
//        }
//        return max;
//    }
//
//    public static void main(String args[]){
//        int [][] arr = {
//                {12,14,15},
//                {34,91,55},
//                {35,65,77},
//        };
//        int Searching = Search(arr);
//        System.out.println(Searching);
//    }
//}

//class EvenDigits{        //Searching for even digits numbers
//Solution1
//    public static void Count(int arr[], int arr2[]){
//        for(int i = 0 ; i < arr.length ; i++){
//            int count = 0;
//            int n = arr[i];
//            while(n > 0){
//                count++;
//                n = n / 10;
//            }
//            if(count % 2 == 0){
//                arr2[i] += arr[i];
//            }
//        }
//        //PrintArray
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr2[i]);
//        }
//    public static void main(String[] args) {
//        int arr[] = {12,34,54,22,7613,1,245,654};
//    }
//}
//
//Solution2
//class EvenDigits{
//    public static int CountDigits(int arr[]){
//
//        int count = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(even(arr[i])){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static boolean even(int num){    // calls the digit function and checks if the count inserted is % 2 == 0
//        if(digits(num) % 2 == 0){
//            return true;
//        }
//        return false;
//    }
//    public static int digits(int num){   //Calculating the number of digits of a number
//        if(num < 0){       //for negative numbers converting them into positive
//            num = num * -1;
//        }
//        if(num == 0){     //for 0 consider as odd
//            return 1;
//        }
//        int count = 0;
//        while(num > 0){
//            count++;
//            num = num / 10;
//        }
//        return count;
//    }
//    public static void main(String args[]){
//        int arr[] = {12,34,54,22,-7613,1};
//        int CountingDigits = CountDigits(arr);
//        System.out.println(CountingDigits);
//    }
//    }

//class MaxWealth{         Finding for maximum wealth from the string
//    public static int[] calculateWealth(int arr[][]){
//        int [] PersonWealth = new int[arr.length];
//
//        for(int i = 0 ; i < arr.length ; i++){
//            int rowSum = 0;
//            for(int j = 0 ; j < arr[i].length ; j++){
//                rowSum += arr[i][j];
//            }
//            PersonWealth[i] = rowSum;
//        }
//        return PersonWealth;
//    }
//    public static void compareWealth(int arr[]){
//        int largest = arr[0];
//        int person = 0;
//        for (int i = 0 ; i < arr.length ; i++){
//            if(largest< arr[i]){
//                largest = arr[i];
//                person = i;
//            }
//        }
//        System.out.println("The maximum wealth is of person "+person);
//        System.out.println("The wealth is "+largest);
//    }
//    public static void main(String[] args){
//        int wealth[][] = {
//                {1,2,3},
//                {4,3,1},
//                {2,7,9}
//        };
//        int[] result = calculateWealth(wealth);
//        compareWealth(result);
//    }
//}

//class MaxWealth2{
//    public static int  calculateWealth(int arr[][]){
//        int maxValue = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            int rowSum = 0;
//            for(int j = 0 ; j < arr[i].length ; j++){
//                rowSum += arr[i][j];
//            }
//            if(maxValue < rowSum){
//                maxValue = rowSum;
//            }
//        }
//        return maxValue;
//    }
//    public static void main(String[] args) {
//        int wealth[][] = {
//                {1,2,3},
//                {4,3,1},
//                {2,7,9}
//        };
//        int result = calculateWealth(wealth);
//        System.out.println(result);
//    }
//}