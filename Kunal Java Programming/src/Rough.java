//IF Else
//Find maximum and minimum between 3 numbers
//class maxMin{
//    public static void main(String args[]){
//        int num = 12;
//        int num2 = 14;
//        int num3 = 45;
//
//        if(num > num2 && num > num3){
//            System.out.println("The number is greater than 2 and 3");
//        } else if (num < num2 && num2 > num3) {
//            System.out.println("The number2 is greater than 1 and 3");
//        } else if (num < num3 && num2 < num3) {
//            System.out.println("The number 3 is greater than 1 and 2");
//        }
//    }
//}

//Check if the number is divisible by two other numbers
//import java.util.*;
//class CheckDivisibility{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int elem1 = sc.nextInt();
//        int elem2 = sc.nextInt();
//        int num = 70;
//
//        if(num % elem1 == 0 && num % elem2 == 0){
//            System.out.println("The element is divisible by the numbers "+elem1+", "+elem2);
//        }else if (num % elem1 == 0 && num % elem2 != 0){
//            System.out.println("The element is divisible by the number "+elem1+" But not "+elem2);
//        }else if (num % elem1 != 0 && num % elem2 == 0){
//            System.out.println("The element is divisible by the number "+elem2+" But not "+elem1);
//        }
//    }
//}

//Check the total number of different value notes in the amout
//class CountNotes {
//    public static void main(String args[]) {
//        int amt = 23235;
//        int n500 = 0;
//        int n200 = 0;
//        int n100 = 0;
//        int n50 = 0;
//        int n20 = 0;
//        int n10 = 0;
//        int n5 = 0;
//
//        if(amt >= 500) {
//            n500 = amt / 500;
//            amt = amt % 500;
//        }
//        if(amt >= 200) {
//            n200 = amt / 200;
//            amt = amt % 200;
//        }
//        if(amt >= 100) {
//            n100 = amt / 100;
//            amt = amt % 100;
//        }
//        if(amt >= 50) {
//            n50 = amt / 50;
//            amt = amt % 50;
//        }
//        if(amt >= 20) {
//            n20 = amt / 20;
//            amt = amt % 20;
//        }
//        if(amt >= 10) {
//            n10 = amt / 10;
//            amt = amt % 10;
//        }
//        if(amt >= 5) {
//            n5 = amt / 5;
//            amt = amt % 5;
//        }
//
//        System.out.println("The notes of 500: " + n500);
//        System.out.println("The notes of 200: " + n200);
//        System.out.println("The notes of 100: " + n100);
//        System.out.println("The notes of 50: " + n50);
//        System.out.println("The notes of 20: " + n20);
//        System.out.println("The notes of 10: " + n10);
//        System.out.println("The notes of 5: " + n5);
//    }
//}

//LOOPS
//public class Rough {
//    public static void main(String args[]) {
//PrintingAlphabets
//        for(char i = 'a' ; i <= 'z' ; i++){
//            System.out.println(i);
//        }
//Printing reversenumbers
//        int n = 50;
//        for(int i = n ; i >= 0 ; i--){
//            System.out.println(i);
//        }
//Sum of natural numbers
//        int n = 10;
//        int sum = 0;
//        for(int i = 0 ; i <= n ; i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//Sum of even numbers
//        int n = 10;
//        int sum = 0;
//        for(int i = 0 ; i <= n ; i++){
//            if(i % 2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//Multiplication Table
//        int n = 10;
//        int multiple = 1;
//        for(int i = 1 ; i <= n ; i++){
//            multiple = n * i;
//            System.out.println(multiple);
//        }
//Factorial
//        int n = 5;
//        int sum = 1;
//        for(int i = n ; i >= 1 ; i--){
//            sum = sum * i;
//        }
//        System.out.println(sum);
//        int n = 3;
//        int x = 3;
//        int sum = 1;
//        for(int i = 1 ; i <= x ; i++){
//            sum = sum * n;
//        }
//        System.out.println(sum);
//sum of even and odds from the array
//        int arr[] = {12,13,14,15,16};
//        int Esum = 0;
//        int Osum = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] % 2 == 0){
//                Esum = Esum + arr[i];
//            }else {
//                Osum += arr[i];
//            }
//        }
//        System.out.println(Esum);
//        System.out.println(Osum);
//Sum of Prime numbers
//        int n = 10;
//        int sum = 0;
//
//        for(int i = 2 ; i <= n ; i++){
//            int count = 0;
//            for(int j = 1 ; j <= i ; j++){
//                if(i % j == 0){
//                    count++;
//                }
//            }
//            if(count <= 2){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//Calculate HCF
//        int n1 = 30;
//        int n2 = 15;
//        int hcf = 0;
//        if (n1 > n2) {
//            for (int i = 1; i <= n2; i++) {
//                if (n1 % i == 0 && n2 % i == 0) {
//                    hcf = i;
//                }
//            }
//            System.out.println(hcf);
//        } else if (n1 < n2) {
//            for (int i = 1; i <= n1; i++) {
//                if (n1 % i == 0 && n2 % i == 0) {
//                    hcf = i;
//                }
//            }
//            System.out.println(hcf);
//        }
//Find Smallest And Largest
//        int [] arr = {12,234,2,786,221,1000,785};  //Take smallest and the largest as variable
//        int smallest = arr[0];
//        int largest = arr[0];
//        for(int i = 0 ; i < arr.length ; i++){
//            if(smallest > arr[i]){
//                smallest = arr[i];
//            }
//        }
//        for(int i = 0 ; i < arr.length ; i++){
//            if(largest < arr[i]){
//                largest = arr[i];
//            }
//        }
//
//        System.out.println(smallest);
//        System.out.println(largest);

//sum of each element of int variable
//        int n = 34567;
//        int sum = 0;
//        while(n > 0){
//            int rem = n % 10;
//            sum = sum + rem;
//            n = n / 10;
//        }
//        System.out.println(sum);
//    }
//}


//import java.util.Arrays;
//class concatenateArray{
//    public static int[] Concatenate(int[] arr1, int arr2[]){
//        int [] concatenatedArray = new int[arr1.length+arr2.length];
//        for(int i = 0 ; i < arr1.length ; i++){
//            concatenatedArray[i] = arr1[i];
//        }
//        for(int j = 0 ; j < arr2.length ; j++){
//            concatenatedArray[arr1.length+j] = arr2[j];
//        }
//        return concatenatedArray;
//    }
//    public static void main(String[] args) {
//        int arr1[] = {12,13,14,15};
//        int arr2[] = {13,14,22,32};
//        int[] resultArray = Concatenate(arr1,arr2);
//        System.out.println(Arrays.toString(resultArray));
//    }
//}

//class binarySearch{
//    public static int BinarySearch(int arr[], int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start < end){
//            int mid = (start+end)/2;
//            if(arr[mid] == target){
//                return mid;
//            } else if (arr[mid] < target) {
//                start = mid + 1;
//            }else {
//                end = mid;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {0,1,2,3,4,5,6};
//        int result = BinarySearch(arr,2);
//        System.out.println(result);
//    }
//}

//class OrderAgnosticBinarySearch{
//    public static int AgnosticSearch(int arr[],int target){
//        int start = 0;
//        int end = arr.length-1;
//
//        boolean isAsc = arr[0] < arr[end];
//        while(start < end){
//            int mid = (start + end) / 2;
//
//            if(isAsc){
//                if(target == arr[mid]){
//                    return mid;
//                }
//                else if(target > arr[mid]){
//                    start = mid + 1;
//                } else {
//                    end = mid;
//                }
//            }else {
//                if(target == arr[mid]){
//                    return mid;
//                }
//                else if(target > arr[mid]){
//                    end = mid;
//                }else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//
//    }
//    public static void main(String[] args) {
//        int arr[] = {12,13,14,16,18};
//        int result = AgnosticSearch(arr,16);
//        System.out.println(result);
//    }
//}

//class ceilingNumber{  //isAsc
//    public static int SearchNumber(int arr[], int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start < end){
//            int mid = (start + end) / 2;
//
//            if(arr[mid] == target){
//                return mid;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            }else{
//                end = mid;
//            }
//        }
//        return arr[end];
//    }
//    public static void main(String[] args) {
//        int arr[] = {12,34,56,78,88};
//        int result = SearchNumber(arr,36);
//        System.out.println(result);
//    }
//}

//class ceilingNumber{  //isDec
//    public static int SearchNumber(int arr[], int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start <= end){               //diff
//            int mid = (start + end) / 2;
//
//            if(arr[mid] == target){
//                return mid;
//            } else if (target > arr[mid]) { //diff
//                end = mid-1;
//            }else{
//                start = mid+1;
//            }
//        }
//        return arr[end];
//    }
//    public static void main(String[] args) {
//        int arr[] = {88,78,56,34,12};
//        int result = SearchNumber(arr,13);
//        System.out.println(result);
//    }
//}

//class floorNumber{  //isAsc
//    public static int SearchNumber(int arr[], int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start <= end){
//            int mid = (start + end) / 2;
//
//            if(arr[mid] == target){
//                return mid;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            }else{
//                end = mid-1;
//            }
//        }
//        return arr[end];
//    }
//    public static void main(String[] args) {
//        int arr[] = {12,34,56,78,88};
//        int result = SearchNumber(arr,79);
//        System.out.println(result);
//    }
//}

//class floorNumber{    //isDec
//    public static int SearchNumber(int arr[], int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start < end){           //diff
//            int mid = (start + end) / 2;
//
//            if(arr[mid] == target){
//                return arr[mid];
//            } else if (target > arr[mid]) {   //diff
//                end = mid;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return arr[end];
//    }
//    public static void main(String[] args) {
//        int arr[] = {88,78,56,34,12};
//        int result = SearchNumber(arr,56);
//        System.out.println(result);
//    }
//}

//class findCeilingCharacter{
//    public static int SearchChar(char arr[], int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start < end){
//            int mid = (start + end) / 2;
//            if(target == arr[mid]){
//                return mid;
//            }
//            else if(target > arr[mid]){
//                start = mid + 1;
//            }else{
//                end = mid;
//            }
//        }
//        return end;
//    }
//    public static void main(String[] args) {
//        char charac[] = {'a','d','s','v'};
//        int result = SearchChar(charac,'e');
//        System.out.println(result);
//    }
//}

//class SearchOccurence{
//    public static int fSearch(int arr[], int target, boolean first){
//        int start = 0;
//        int end = arr.length-1;
//        int ans = -1;
//        while(start <= end){
//            int mid = (start+end) / 2;
//            if(arr[mid] < target){
//                start = mid + 1;
//            } else if (arr[mid] > target) {
//                end = mid - 1;
//            }else{
//                ans = mid;
//                if(first){
//                    end = mid -1;
//                }else{
//                    start = mid + 1;
//                }
//            }
//        }
//        return ans;
//
//    }
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,5,6,9,11,11,12,12,12,77,88};
//        int foccurence = fSearch(arr,12,true);
//        System.out.println(foccurence);
//        int Loccurence = fSearch(arr,12,false);
//        System.out.println(Loccurence);
//
//    }
//}

//class mountainArray {
//    public static int findPeak(int arr[]) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            int mid = (start + end) / 2;
//            if (arr[mid] < arr[mid + 1]) {
//                start = mid + 1; // Move right since peak is on the right
//            } else {
//                end = mid; // Peak is on the left, including mid
//            }
//        }
//        return start; // start and end will eventually converge to the peak index
//    }
//
//    public static int AgBinSearching(int arr[], int target, int start, int end) {
//        boolean isAsc = arr[start] < arr[end];
//        while (start <= end) {
//            int mid = (start + end) / 2;
//
//            if (target == arr[mid]) {
//                return mid;
//            }
//
//            if (isAsc) {
//                if (target > arr[mid]) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            } else {
//                if (target > arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public static int Searching(int arr[], int target) {
//        int peak = findPeak(arr);
//        int SearchTarget = AgBinSearching(arr, target, 0, peak);
//        if (SearchTarget != -1) {
//            return SearchTarget;
//        } else {
//            return AgBinSearching(arr, target, peak + 1, arr.length - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {12, 13, 14, 15, 9, 10, 13, 14};
//        int target = 13;
//        int result = Searching(arr, target);
//        System.out.println(result);
//    }
//}


//class orderAgnostic{
//    public static int Search(int arr[], int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        boolean isAsc = arr[0] < arr[arr.length-1];
//        while (start <= end) {
//            int mid = (start + end) / 2;
//
//            if (arr[mid] == target) {
//                return mid;
//            }
//            if (isAsc) {
//                if (arr[mid] > target) {
//                    end = mid - 1;
//                } else if (arr[mid] < target) {
//                    start = mid + 1;
//                }
//            }else {
//                if(arr[mid] > target){
//                    start = mid + 1;
//                }else if (arr[mid] < target){
//                    end = mid;
//                }
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int arr[] = {10,9,8,7,6,5,4,3};
//        int result = Search(arr, 8);
//        System.out.println(result);
//    }
//}

//class ceiling{
//    public static int Search(int arr[], int target){
//        int start = 0;
//        int end = arr.length - 1;
//        boolean isAsc = arr[0] < arr[arr.length - 1];
//
//        while(start < end){
//            int mid = (start + end)/2;
//
//            if(arr[mid] == target){
//                return mid;
//            }
//            if(isAsc){
//                if(arr[mid] > target){
//                    end = mid;
//                } else {
//                    start = mid + 1;
//                }
//            }else {
//                if(arr[mid] < target){
//                    start = mid + 1;
//                }else{
//                    end = mid;
//                }
//            }
//        }
//        return end;
//    }
//    public static void main(String[] args) {
//        int arr[] = {12,14,15,18,22,33};
//        int target = 20;
//        int result = Search(arr,target);
//        System.out.println(result);
//
//    }
//}

//class floorNumber{
//    public static int Search(int arr[], int target){
//        int start = 0;
//        int end = arr.length - 1;
//        boolean isAsc = arr[0] < arr[arr.length-1];
//        while(start <= end){
//            int mid = (start + end)/2;
//
//            if(arr[mid] == target){
//                return mid;
//            }
//            if(isAsc){
//                if(arr[mid] > target){
//                    end = mid - 1;
//                }else {
//                    start = mid + 1;
//                }
//            }else{
//                if(arr[mid] > target){
//                    start = mid + 1;
//                }else{
//                    end = mid - 1;
//                }
//            }
//        }
//        if(isAsc){
//            return end;
//        }else{
//            return start;
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {12,13,14,16,18,22,33};
//        int target = 21;
//        int result = Search(arr,target);
//        System.out.println(result);
//    }
//}

//class FindOccurence{
//    public static int Search(int arr[], int target, boolean focc){
//        int start = 0;
//        int end = arr.length - 1;
//        boolean isAsc = arr[0] < arr[arr.length-1];
//        int ans = -1;
//        while(start < end){
//            int mid = (start+end) / 2;
//
//            if(isAsc){
//                if(arr[mid] == target){
//                    ans = mid;
//                    if(focc){
//                        end = mid;
//                    }else {
//                        start = mid + 1;
//                    }
//                }
//                else if(arr[mid] > target){
//                    end = mid;
//                }else {
//                    start = mid + 1;
//                }
//            }else{
//                if(arr[mid] == target){
//                    ans = mid;
//                    if(focc){
//                        end = mid;
//                    }else {
//                        start = mid + 1;
//                    }
//                }
//                else if(arr[mid] > target){
//                    start = mid + 1;
//                }else {
//                    end = mid;
//                }
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int arr[] = {12,13,14,14,14,14,16,18,21,22,33,44,55,64};
//        int target = 14;
//        int result = Search(arr,target,true);
//        int locc = Search(arr,target,false);
//        System.out.println(result);
//        System.out.println(locc);
//
//    }
//}

//Find the peak Element in the mountain array
//class SearchMountain{
//    public static int SearchPeak(int arr[]){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start < end){  //When start equals to end then you've found the peak element
//            int mid = (start+end) / 2;
//            if(arr[mid] > arr[mid+1]){
//                end = mid;
//            } else if (arr[mid] < arr[mid+1]) {
//                start = mid + 1;
//            }
//        }
//        return end;
//    }
//    public static void main(String[] args) {
//        int arr[] = {12,13,14,15,16,17,18,9,8,7,6,5,4,3,2,1};
//        int target = 7;
//        int result = SearchPeak(arr);
//        System.out.println(result);
//    }
//}

//Search the smallest element in the mountain array
//class SearchMinInMountain{
//
//    public static int SearchSmallest(int arr[], int start, int end){
//        int smallest = -1;
//        if(arr[start] < arr[end]){
//            smallest = arr[start];
//        }else{
//            smallest = arr[end];
//        }
//        return smallest;
//    }
//    public static int SearchPeak(int arr[]){
//        //finding Peak Element
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start < end){
//            int mid = (start+end) / 2;
//
//            if(arr[mid] > arr[mid + 1]){
//                end = mid;
//            }else if(arr[mid] < arr[mid+1]){
//                start = mid + 1;
//            }
//        }
//        return end ;
//    }
//    public static void main(String[] args) {
//        int arr[] = {3,7,12,14,25,27,38,44,56,55,43,22,12,1};
//        int Peak = SearchPeak(arr);
//        int FirstHalf = SearchSmallest(arr,0,Peak);
//        int SecHalf = SearchSmallest(arr,Peak,arr.length-1);
//        if(FirstHalf < SecHalf){
//            System.out.println(FirstHalf);
//        }else{
//            System.out.println(SecHalf);
//        }
//    }
//}

//class FindInRotated{
//    public static int Search(int arr[],int target){
//        int pivot = SearchPivot(arr);
//        int fSearch = BinarySearch(arr,target,0,pivot);
//
//        if(pivot == -1){                //If array is singly sorted
//            return BinarySearch(arr,target,0,arr.length-1);
//        }
//
//        if(arr[pivot] == target){  //if pivot itself is a target
//            return pivot;
//        }
//
//        //Search in 2 sorted arrays
//        if(fSearch != -1){    //If element not found in first half Search in 2nd half
//            return fSearch;
//        }else{
//            return BinarySearch(arr,target,pivot + 1,arr.length-1);
//        }
//    }
//    public static int BinarySearch(int arr[], int target, int start, int end){
//        //No agnostic BS because after and before the pivot, elements are asc
//            while(start <= end){
//                int mid = (start+end) / 2;
//                if(arr[mid] == target){
//                    return mid;
//                }
//                else if(arr[mid] > target){
//                    end = mid - 1;
//                } else if (arr[mid] < target) {
//                    start = mid + 1;
//                }
//            }
//        return -1;
//    }
//    public static int SearchPivot(int arr[]){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start <= end){
//            int mid = (start+end)/2;
//
//            if(mid < end && arr[mid] > arr[mid + 1]){
//                return mid;
//            }
//            if(mid > start && arr[mid] < arr[mid-1]){
//                return mid-1;
//            }
//            if(arr[start] >= arr[mid]){
//                end = mid-1;
//            } else if (arr[start] < arr[mid]) {
//                start = mid + 1;
//            }
//        }
//        return -1;        //This will happen when your array is singly sorted
//    }
//    public static void main(String[] args) {
//        int arr[] = {15,16,17,18,19,12,13,14};
//        int target = 15;
//        int result = Search(arr,target);
//        System.out.println(result);
//    }
//}

//class searchInRotatedWithDuplicates{
//    public static int SearchPivot(int arr[]){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start <= end){
//            int mid = (start+end)/2;
//
//            if(mid < end && arr[mid] > arr[mid + 1]){  //mid<end is done for avoiding the condition of array out of bounds
//                return mid;
//            }
//            if(mid > start && arr[mid] < arr[mid-1]){ //mid>start for avoiding the condition of ArrayOutOfBounds
//                return mid-1;
//            }
//
//            //What if all the three s,m,e are equal. Skip the start and end element and move by 1
//            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
//
//                //check whether end is pivot
//                if(arr[start] > arr[start+1]){
//                    return start;
//                }
//                start ++;
//
//                //check whether start is pivot
//                if(arr[end] < arr[end-1]){
//                    return end - 1;
//                }
//                end --;
//            } //if start < mid this means that your mid is at the sorted part so move your start towards right OR
//            // if start == mid and your end > mid, this means that your element will lie on the right hand side
//            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[end] > arr[mid]){
//                start = mid + 1;
//            }
//            else {
//                end = mid - 1;
//            }
//        }
//        return -1;        //This will happen when your array is singly sorted
//    }
//}

//class FindCountsOfRotated{
//    public static int FindCounts(int arr[]){
//        int pivot = FindPivot(arr);
//        if(pivot == -1){
//            return 0;
//        }
//        else{
//            return pivot + 1;
//        }
//    }
//    public static int FindPivot(int arr[]){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start <= end){
//            int mid = (start + end) / 2;
//
//            //check for the pivot first
//            if(mid < end && arr[mid] > arr[mid + 1]){
//                return mid;
//            }
//            if(mid > start && arr[mid] < arr[mid - 1]){
//                return mid - 1 ;
//            }
//            if(arr[start] > arr[mid]){   //this means you are present in 1st to second part of asc
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {6,12,15,18,2,3};
//        int Counts = FindCounts(arr);
//        System.out.println(Counts);
//    }
//}

//import java.util.Arrays;
//class SelectionSort{
//    public static  void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static void selection(int arr[]){
//        for(int i = 0 ; i < arr.length ; i++){
//            int last = arr.length-i-1;
//            int max = getGreatestIndex(arr,0,last);
//            swap(arr,max,last);
//        }
//    }
//    public static int getGreatestIndex(int arr[], int start, int end){
//        int largest = 0;
//        for(int i = start ; i <= end ; i++){
//            if(arr[largest] < arr[i]){
//                largest = i;
//            }
//        }
//        return largest;
//    }
//    public static void main(String[] args) {
//        int arr[] = {23,11,10,88,1,0,12,13,3};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
//
//    }
//}

//import java.util.Arrays;
//
//class InsertionSort{
//    public static void InSort(int arr[]){
//        for(int i = 0 ; i < arr.length-1 ; i++){
//            for(int j = i+1 ; j > 0 ; j--){
//                if(arr[j] < arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {5,3,4,1,2};
//        InSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

//import java.util.Arrays;
//class CyclicSort{
//    public static void CyclicSort(int arr[]){
//        int i = 0;
//        while(i < arr.length){
//            int correct = arr[i] - 1;
//            if(arr[i] == arr[correct]){
//                i++;
//            }else {
//                //swap
//                int temp = arr[i];
//                arr[i] = arr[correct];
//                arr[correct] = temp;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {5,3,4,1,2};
//        CyclicSort(arr);
//        System.out.println(Arrays.toString(arr));
//
//    }
//}

//import java.util.Arrays;
//class cyclicSort{
//    public static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static void Sorting(int arr[]){
//        int i = 0;
//        while(i < arr.length){
//            int correct = arr[i] - 1;  //position of index
//            if(arr[i] == arr[correct]){
//                i++;
//            }else{
//                swap(arr,i,correct);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {5,3,4,1,2};
//        Sorting(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

//import java.util.Arrays;
//class SearchMissingNumber{
//    public static int GetMissing(int arr[]){
//        int i = 0;
//        int element = 0;
//        while(i < arr.length){
//            if(arr[i] == i){
//                i++;
//            }else {
//                element = i;
//                break;
//            }
//        }
//        return element;
//    }
//    public static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static void Sort(int arr[]){
//        int i = 0;
//        int n = arr.length;
//        while(i < arr.length){
//            int correct = arr[i];
//            if(arr[i] < n && arr[i] != arr[correct]){  //if ith element is less than n and the ith element is not equal to the index
//                swap(arr,i,correct);
//            }else {
//                i++;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {2,3,0,4};
//        Sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int result = GetMissing(arr);
//        System.out.println(result);
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//
//class FindDisappeared{
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
//        List<Integer> ans = new ArrayList<>();
//        for(int index = 0 ; index < arr.length ; index++){
//            if(arr[index] != index+1){
//                ans.add(index+1);
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
//        List<Integer> findDisappeared = Sorting(arr);
//        System.out.println(findDisappeared);
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//
//class FindDuplicates{
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
//        List<Integer> ans = new ArrayList<>();
//        for(int index = 0 ; index < arr.length ; index++){
//            if(arr[index] != index+1){
//                ans.add(arr[index]);
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
//        List<Integer> findDisappeared = Sorting(arr);
//        System.out.println(findDisappeared);
//    }
//}

//import java.util.Arrays;
//
//class SetMisMatch{
//    public static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static int[] Sorting(int arr[]) {
//        int i = 0;
//        while (i < arr.length) {
//            int correct = arr[i] - 1;
//            if (arr[i] != arr[correct]) {
//                swap(arr, i, correct);
//            } else {
//                i++;
//            }
//        }
//        for(int index = 0; index < arr.length ; index++){
//            if(arr[index] != index+1){
//                return new int[] {arr[index], index+1};
//            }
//        }
//        return new int[] {-1,-1};
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1,2,2,4};
//        int result [] = Sorting(arr);
//        System.out.println(Arrays.toString(result));
//    }
//}

//import java.util.Arrays;
//class SmallestMissingNumber{
//    public static int Sorting(int arr[]) {
//        int i = 0;
//        int n = arr.length;
//
//        while (i < arr.length) {
//            int correct = arr[i] - 1;
//
//            // Check if the element is out of valid range or is already in the correct position
//            if (arr[i] > n || arr[i] <= 0 || arr[i] == arr[correct]) {
//                i++;
//            } else {
//                swap(arr, i, correct); // Swap the current element to its correct position
//            }
//        }
//        for(int j = 0 ; j < arr.length ; j++){
//            if(arr[j] != j+1){ //the smallest missing number found
//                return j+1;
//            }
//        }
//        return -1;
//    }
//
//    // Helper function to swap two elements in the array
//    public static void swap(int arr[], int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {7,8,9,11,12,2};
//        int result = Sorting(arr);
//        System.out.println(result);
//
//    }
//
//}

//class checkStringIsPallindrome{
//    public static void main(String[] args) {
//        String str = "abcdcba";
//        int start = 0;
//        int end = str.length()-1;
//
//        while(start < end){
//            if(str.charAt(start) == str.charAt(end)){
//                start++;
//                end--;
//            }
//            else{
//                System.out.println("The string is not pallindrome");
//                return;
//            }
//        }
//        System.out.println("Pallindrome");
//    }
//}


//SearchingAlgorithm
//class LinearSearch{
//    public static int Search(int arr[], int element){
//        for(int i = 0 ; i < arr.length-1 ; i++){
//            if(arr[i] == element){
//                return element;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int arr[] = {13,17,15,10,9,11};
//        int element = 17;
//        int result = Search(arr,element);
//        System.out.println(result);
//    }
//}

//import java.util.Arrays;
//class b1narySearch{
//    public static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    public static void Sort(int arr[]){
//        for(int i = 0 ; i < arr.length ; i++){
//            boolean swap = false;
//            for(int j = 0 ; j < arr.length-1-i ; j++){
//                if(arr[j] > arr[j+1]){
//                    swap(arr,j,j+1);
//                    swap = true;
//                }
//            }
//            if(!swap){
//                break;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] = {13,17,15,10,9,11};
//        Sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

//2DArray
//import java.util.*;
//class TwodArray{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Number of rows : ");
//        int row = sc.nextInt();
//        System.out.print("Enter Number of cols : ");
//        int col = sc.nextInt();
//
//        int arr[][] = new int[row][col];      //intializing empty array of row,col size
//
//        for(int i = 0 ; i < arr.length ; i++){ //inserting Elements
//            for(int j = 0 ; j < arr[0].length ; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        //Print Elements of 2dArray
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0 ; j < arr[i].length; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class SpiralOrder{
//    public static void main(String[] args) {
//        int arr[][] = {{1,5,7,9,10,11},
//                        {6,10,12,13,20,21},
//                        {9,25,29,30,32,41},
//                        {15,55,59,63,68,70},
//                        {40,70,79,81,95,105}};
//        PrintOrder(arr);
//    }
//    public static void PrintOrder(int arr[][]){
//
//        int rowS = 0;
//        int rowE = arr.length-1;
//        int colS = 0;
//        int colE = arr[0].length-1;
//        while(rowS <= rowE && colS <= colE){
//            for(int i = colS ; i <= colE ; i++){
//                System.out.println(arr[rowS][i]);
//            }
//            rowS++;
//
//            for(int i = rowS ; i <= rowE ; i++){
//                System.out.println(arr[i][colE]);
//            }
//            colE--;
//
//            for(int i =colE ; i >= colS ; i--){
//                System.out.println(arr[rowE][i]);
//            }
//            rowE--;
//
//            for(int i = rowE ; i >= rowS ; i--){
//                System.out.println(arr[i][colS]);
//            }
//            colS++;
//        }
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//class RoughPrograms{
//    public static void main(String[] args) {
//        //ArrayList<Integer> list = InputTillX();
//        //System.out.println(list);
//
//        ArrayList<Integer> list = fibonacci(5);
//        System.out.println(list);
//
//        System.out.println(ArmstrongNumber(1153));
//
//        System.out.println(Pallindrome(1211));
//
//    }
//    public static ArrayList<Integer> InputTillX(){
//        ArrayList<Integer> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        String input ;
//        while(true){
//            input = sc.next();
//            if(input.equalsIgnoreCase("X")){
//                break;
//            }
//            if(!input.equalsIgnoreCase("x")){
//                list.add(Integer.parseInt(input));
//            }
//        }
//        return list;
//    }
//
//    public static ArrayList<Integer> fibonacci(int n){
//        ArrayList<Integer> list = new ArrayList<>();
//        int f = 0;
//        int s = 1;
//
//        list.add(f);
//        list.add(s);
//        for(int i = 2 ; i < n ; i++){
//            int t = f+s;
//            list.add(t);
//            f = s;
//            s=t;
//        }
//        return list;
//    }
//
//    public static boolean ArmstrongNumber(int n){
//        int result = 0;
//        int temp = n;
//        int count = 0;
//        while(temp > 0){
//            temp = temp / 10;
//            count++;  //to count number of digits
//        }
//
//        int temp2 = n;
//        while(temp2 > 0){
//            int rem2 = temp2 % 10;
//            result = result + (int)Math.pow(rem2,count);
//            temp2 = temp2/10;
//        }
//        return result == n;   //if true then true else false
//    }
//
//    public static boolean Pallindrome(int n){
//        int temp = n;
//        int result = 0;
//        while(temp > 0){
//            int rem = temp % 10;
//            result = (result*10) + rem;
//            temp/= 10;
//        }
//
//        return result == n;
//    }
//}

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
//    public static void AddDiagonalElements(int arr[][]){
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

