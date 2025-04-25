//class bubbleSort{    //compare 2 elements and shifts the bigger element to the right by 1 and this loop continues till the biggest element is reached at the last idx.
//    public static void main(String args[]){
//        int arr[] = {12,32,2,11,1,13,34,13};
//        for(int i = 0 ; i < arr.length ; i++){
//            int temp = 0;
//            for(int j = 0 ; j < arr.length-1-i ; j++){
//                if(arr[j] > arr[j+1]){
//                    //Swap the elements
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}

//class SelectionSort{
//    public static void main(String args[]){
//        int arr[] = {12,11,31,72,1,42,0,45};
//
//        for(int i = 0 ; i < arr.length ; i++){
//            int smallest = i;
//            for(int j = i+1 ; j < arr.length ; j++){
//                if(arr[j] < arr[smallest]){
//                    smallest = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[smallest];
//            arr[smallest] = temp;
//        }
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//    }
//}

//class InsertionSort{
//    public static void main(String args[]){
//        int [] arr = {12,11,31,72,1,42,0,45};
//
//        for(int i = 1 ; i < arr.length ; i++){
//            int current = arr[i];
//            int j = i-1;
//            while(j >= 0 && current < arr[j]){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = current;
//        }
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//    }
//
//}
