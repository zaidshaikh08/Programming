//class MaxAndMix{
//    public static void main(String args[]){
//        int [] arr = {21,22,33,56,1,5,22,3,12};
//
//        int smallest = arr[0];
//        int largest = arr[0];
//
//        //Smallest & Largest
//        for(int i = 0 ; i < arr.length ; i++){
//            //Smallest
//            if(arr[i] < smallest){
//                smallest = arr[i];
//            }
//            if(arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//        System.out.println("The Smallest Value from the array is : "+smallest);
//        System.out.println("The largest value from the array is : "+largest);
//    }
//}

//class checkArrayIsSort{
//    public static void main(String args[]){
//        int [] arr = {21,0,99,1,100};
//        boolean isAscending = true ;
//        boolean isDescending = true;
//        for(int i = 0 ; i < arr.length-1 ; i++){
//            if(arr[i] < arr[i+1]){
//                isAscending = false;
//            } else if (arr[i] > arr[i+1]) {
//                isDescending = false;
//            }
//        }
//        if(isAscending){
//            System.out.println("The array is Sorted in Ascending Order");
//        } else if (isDescending) {
//            System.out.println("The array is Sorted in Descending Order");
//        }else{
//            System.out.println("The Array is Unsorted");
//        }
//    }
//}

//class shiftElements{
//    public static void main(String args[]){
//        int [] arr = {0, -1, 3, -2, 5, -4, 6, 7, -8};
//        int left = 0;
//        int right = arr.length-1;
//
//        while(left < right){
//
//            //Searching for positive number
//            while(arr[left] <= 0 && left < right){
//                left++;
//
//            }
//            //Searching for -ve Number
//            while(arr[right] > 0 && left < right){
//                    right--;
//            }
//
//            if(left < right){
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            }
//
//        }
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}

//class shiftNegatives{
//    public static void main(String args[]){
//        int [] arr = {12,13,-12,-22,10,-45};
//        int left = 0;
//        int right = arr.length-1;
//        while(left < right){
//            while(arr[left] <= 0 && left < right){
//                left++;
//            }
//            while(arr[right] > 0 && left < right){
//                right--;
//            }
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//        }
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}

//class cyclicallyRotate{
//    public static void main(String args[]){
//        int [] arr = {5,4,3,2,1};
//        int left = 0;
//        int lastElement = arr[arr.length-1];
//
//        for(int i = arr.length-1 ; i > 0 ; i--){
//            arr[i] = arr[i-1];
//        }
//        arr[0] = lastElement;
//
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}

//class FindingDuplicates{
//    public static void main(String args[]){
//        int [] arr = {12,13,14,15,15,12,13};
//        int [] duplicates = new int[arr.length];
//        int count = 0;
//
//        //iterate through whole array
//        for(int i = 0 ; i < arr.length ; i++){
//            boolean isDuplicate = false;
//            //compare the elements of array 1 by 1 with all elements
//            for(int j = i+1 ; j < arr.length ; j++){
//                if(arr[i] == arr[j]){
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if(isDuplicate){
//                boolean alreadyAdded = false;
//                for(int j = 0 ; j < count ; j++){
//                    // Check if already in duplicates array
//                    if(duplicates[j] == arr[i]){
//                        alreadyAdded = true;
//                        break;
//                    }
//                }
//                if(!alreadyAdded){
//                    duplicates[count++] = arr[i];
//                }
//            }
//        }
//        for(int i = 0 ; i < count ; i++){
//            System.out.println(duplicates[i]);
//        }
//    }
//}

