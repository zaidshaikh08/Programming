//Array in Ascending Order
//class firstBinarySearch {
//    static int Search(int arr[], int target){
//        int start = 0;
//        int end = arr.length;
//
//        while(start <= end){
//            int mid = (start + end)/2;
//            if(arr[mid] < target){
//                start = mid+1;
//            } else if (arr[mid] > target) {
//                end = mid -1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int arr[] = {2,4,6,9,11,12,14,20,36,48};
//        int result = Search(arr,36);
//        System.out.println(result);
//    }
//}

//class OrderAgnosticBinarySearch{
//    public static int Searching(int arr[], int target){
//
//        int start = 0;
//        int end = arr.length-1;
//
//        //Ascending Order
//        if(arr[start] < arr[end]){
//            while(start<=end){
//                int mid = (start+end)/2;
//                //Ascending Order
//                if(target > arr[mid]){
//                    start = mid+1;
//                } else if (target < arr[mid]) {
//                    end = mid -1;
//                }else {
//                    return mid;
//                }
//            }
//            //Descending Order
//        } else if (arr[start] > arr[end]) {
//            while(start <= end){
//                int mid = (start+end)/2;
//                if(target > arr[mid]){
//                    end = mid -1;
//                }else if (target < arr[mid]){
//                    start = mid + 1;
//                }else {
//                    return mid;
//                }
//            }
//        }
//        return -1;
//        }
//
//
//    public static void main(String[] args) {
//        int arr[] = {12,13,16,89,92,97};
//        int result = Searching(arr,89);
//        System.out.println(result);
//    }
//}


//Note : Letter should not wrap around
//class CeilingOfCharacter{
//    public static char SearchChar(char arr[] , char target){
//        int start = 0;
//        int end = arr.length-1;
//        int arrLen = arr.length;
//
//        if(arr[0] < arr[arr.length-1]){
//            while(start <= end){
//
//                int mid = (start+end)/2;
//                if(arr[mid] == target){
//                    return arr[mid];
//                }
//                else if(target > arr[mid]){
//                    start = mid + 1;
//                } else if (target < arr[mid]) {
//                    end = mid - 1;
//                }
//            }
//        }
//        return arr[start % arr.length];   //When no character is available greater than the target in that case we want to return the first charac
//        //return 0 ;             // This is the most basic thing we can do
//    }
//
//    public static void main(String[] args) {
//        char arr[] = {'c','f','j'};
//        char target = 'm';
//        char result = SearchChar(arr,target);
//        System.out.println(result);
//    }
//}


//class FirstAndLastOccurence {
//
//    public static int SearchFNL(int arr[], int target, boolean firstElement) {
//        int start = 0;
//        int end = arr.length - 1;
//        int ans = -1;
//        if (arr[0] < arr[arr.length - 1]) {
//            while (start <= end) {
//
//                int mid = (start + end) / 2;
//
//                if (target > arr[mid]) {
//                    start = mid + 1;
//                } else if (target < arr[mid]) {
//                    end = mid - 1;
//                }else{
//                    ans = mid;
//                    if(firstElement){
//                        end = mid - 1;
//                    }
//                    else{
//                        start = mid + 1;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//
//
//    public static void main(String[] args) {
//        int arr[] = {5,7,7,7,7,8,8,10};
//        int ans [] = {-1,-1};
//        int target = 7;
//        int foccurence = SearchFNL(arr,target,true);
//        int lastOccurence = SearchFNL(arr,target,false);
////        OR
//        if(ans[0] != -1){
//            ans[0] = SearchFNL(arr,target,true);
//        }else {
//            ans[1] = SearchFNL(arr,target,false);
//        }
////        ans[0] = foccurence;
////        ans[1] = lastOccurence;
//        System.out.println(ans[0]);
//        System.out.println(ans[1]);
//    }
//}


//Search for an element in the sorted array which is infinite
//class SearchInInfinite{
//    public static void main(String[] args) {
//        int arr[] = {3, 5, 7, 9, 10, 90,
//                100, 130, 140, 160, 170};
//        int target = 10;
//        int result = ans(arr,target);
//        System.out.println(result);
//    }
//
//    public static int ans(int arr[], int target){
//        int start = 0;
//        int end = 1;
//        while(target > arr[end]){
//            start = end + 1;
//            end = 2 * start + 1;
//        }
//        return binarySearch(arr,target,start,end);
//    }
//    public static int binarySearch(int arr[], int target, int start, int end){
//        while(start <= end){
//            int mid = (start+end)/2;
//
//            if(target == arr[mid]){
//                return mid;
//            }
//            else if(target > arr[mid]){
//                start = mid + 1;
//            } else if (target < arr[mid]) {
//                end = mid - 1;
//            }
//
//        }
//        return -1;
//    }
//
//    }

class MountainArray{
    public static int SearchMount(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = (start+end)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,8,9,2};
        int result = SearchMount(arr);
        System.out.println(result);
    }
}


//class findInMountainArray{
//    public static void main(String[] args) {
//        int arr[] = {1,2,4,5,6,3,2,1};
//        int target = 3;
//        int result = Search(arr,target);
//        System.out.println(result);
//    }
//    public static int FindPeak(int arr[]){
//        int start = 0;
//        int end = arr.length-1;
//        while(start < end){
//            int mid = (start+end)/2;
//            if(arr[mid] < arr[mid+1]){
//                start = mid + 1;
//            }else {
//                end = mid;
//            }
//        }
//        return end;
//    }
//    public static int OrderAgnostic(int arr[],int target,int start,int end) {
//        boolean isAsc = arr[start] < arr[end];
//        while (start <= end) {
//            int mid = (start + end) / 2;
//
//            if (target == arr[mid]) {
//                return mid;
//            }
//            if (isAsc) {
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else if (target > arr[mid]) {
//                    start = mid + 1;
//                }
//            } else {
//                if (target < arr[mid]) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }
//    public static int Search(int arr[],int target) {
//
//       int peakElement = FindPeak(arr);
//       int findTarget = OrderAgnostic(arr,target,0,peakElement);
//        if (findTarget != -1) {
//            return findTarget;
//        }else {
//            return OrderAgnostic(arr, target, peakElement, arr.length-1);
//        }
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
//class SearchingPeak{
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,3,2,1};
//        System.out.println(Searching(arr));
//    }
//    public static int Searching(int arr[]){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start < end){
//            int mid = (start+end)/2;
//            if(arr[mid] < arr[mid+1]){
//                start = mid+1;
//            } else if (arr[mid] > arr[mid+1]) {
//                end = mid;
//            }
//        }
//        return start;
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

class searchInRotatedWithDuplicates{
    public static int SearchPivot(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){  //mid<end is done for avoiding the condition of array out of bounds
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){ //mid>start for avoiding the condition of ArrayOutOfBounds
                return mid-1;
            }

            //What if all the three s,m,e are equal. Skip the start and end element and move by 1
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){

                //check whether end is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start ++;

                //check whether start is pivot
                if(arr[end] < arr[end-1]){
                    return end - 1;
                }
                end --;
            } //if start < mid this means that your mid is at the sorted part so move your start towards right OR
            // if start == mid and your end > mid, this means that your element will lie on the right hand side
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[end] > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;        //This will happen when your array is singly sorted
    }
}

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
//
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

//class SearchingPeak{
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,3,2,1,0};
//        int target = 0;
////        System.out.println(SearchingPeak(arr));
//        System.out.println(ApplyAlgorithm(arr,target));
//    }
//    public static int SearchingPeak(int arr[]){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start < end){
//            int mid = (start+end)/2;
//            if(arr[mid] < arr[mid+1]){
//                start = mid+1;
//            } else if (arr[mid] > arr[mid+1]) {
//                end = mid;
//            }
//        }
//        return start;
//    }
//    public static int binarySearch(int arr[],int target,int s, int e){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start <= end){
//            int mid = (start+end)/2;
//
//            if(arr[mid] == target){
//                return mid;
//            }
//            else if (arr[mid] < target) {
//                start = mid + 1;
//            }
//            else{
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//    public static int ApplyAlgorithm(int arr[], int target){
//        int last = SearchingPeak(arr);
//        int result = binarySearch(arr,target,0,last);
//
//        if(result == -1){
//            result = binarySearch(arr,target,result+1,arr.length-1);
//        }
//        return result;
//    }
//}