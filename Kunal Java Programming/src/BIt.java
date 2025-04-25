//class FindOddEven{
//    public static void main(String[] args) {
//        int n = 68;
//        System.out.println(isOdd(n));  //if true then odd
//    }
//    public static boolean isOdd(int n){
//        return (n & 1) == 1;           // if 1 at the last digit then odd
//    }
//}

//import java.util.Arrays;
//
// class findNoDuplicate{
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,6,1,2,3,4};
//        BubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        int result = getNoDuplicate(arr);
//        System.out.println(result);
//    }
//    public static void SelectionSort(int arr[]){
//        for(int i = 0 ; i < arr.length ; i++){
//            int last = arr.length-i;
//            int getMaximum = getMax(arr,0,last);
//            swap(arr,getMaximum,last);
//        }
//    }
//    public static int getMax(int arr[], int start, int end){
//        int max = start;
//        for(int i = start ; i < end ; i++){
//            if(arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }
//
//    public static int getNoDuplicate(int arr[]){
//        int i = 0;
//        while(i < arr.length){
//            if(i < arr.length-1 && arr[i] == arr[i+1]){
//                i+=2;
//            }else{
//                return arr[i];
//            }
//        }
//        return -1;
//    }
//    public static void BubbleSort(int arr[]){
//        for(int i = 0 ; i < arr.length-1; i++){
//            for(int j = 0 ; j < arr.length-i-1 ; j++){
//                if(arr[j] > arr[j+1]){
//                    swap(arr, j,j+1);
//                }
//            }
//        }
//    }
//    public static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//}

//class findUnique{
//    public static void main(String[] args) {
//        int arr[] = {2,3,3,4,2,6,4};
//        int res = uniqueElem(arr);
//        System.out.println(res);
//    }
//    public static int uniqueElem(int arr[]){
//        int unique = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            unique = unique ^ arr[i];             // doing XOR every element one by one with each other
//        }
//        return unique;
//    }
//}

//class BinaryNumbers{
//    public static void main(String[] args) {
//        int num = 0b1010;
//        System.out.println(num);
//        System.out.println(Integer.toBinaryString(num));  //get in binary
//    }
//}

//class FindEvenOrOdd{
//    public static void main(String[] args) {
//        int num = 0b10010;
//        //You can see that all the bits are at the position of 2^n power and only LSB is 2^0 (i.e.. 1)
//        //Thus if LSB = 0, NO is even, else number is odd
//        int result = num & 1;
//        System.out.println(Integer.toBinaryString(result));
//    }
//}

//class NoDuplicate{
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,6,1,2,3,4};
//        int num = 0;
//
//        //Performing XOR with one another of the element in array
//        for(int i = 0 ; i < arr.length ; i++){
//            num = num ^ arr[i];
//        }
//        System.out.println(num);
//    }
//}

//class FindIBit{
//    public static void main(String[] args) {
//        int num = 0b100110;
//        int n = 3;
//
//        int mask = (num >> n-1) & 1;     //000100
//                                      //&000001
//
//        System.out.println(Integer.toBinaryString(mask));
//
//    }
//}

//class SetIBit{
//    public static void main(String[] args) {
//        int num = 0b01110001;
//        int n = 4;
//        int mask = num >> (n-1) | 1;  //01110
//                                     //OR   1
//        System.out.println(Integer.toBinaryString(mask));
//    }
//}

//class ResetBit{
//    public static void main(String[] args) {
//        int num = 0b01101001;
//        int n = 4;
//
//        int mask = ~(1 << n-1); //this mask makes a new binary number(run the below print line to see)
//        System.out.println(Integer.toBinaryString(mask));
//        int result = num & mask;
//        System.out.println(Integer.toBinaryString(result));
//
//    }
//}

//class FindRightMost{
//    public static void main(String[] args) {
//        int num = 0b10110110;
//
//    }
//}

//class SingleElementFinder {
//    public static void main(String[] args) {
//        int[] array = {2,2,3,2,7,7,8,7,8,8};
//        int result = findingUnique(array);
//        System.out.println(result);
//    }
//
//    public static int findingUnique(int arr[]){
//        int ans = 0;
//        for(int i = 0 ; i < 32 ; i++){
//            int sum = 0;
//            for(int j = 0 ; j < arr.length ; j++){
//                if(((arr[j] >> i) & 1) == 1){      //1 found
//                    sum++;
//                }
//            }
//            sum = sum % 3;
//
//            if(sum != 0){
//                ans |= sum << i;  //performing or operation between the ans and the
//            }
//        }
//        return ans;
//    }
//
//}

//class findUni{
//    public static void main(String[] args) {
//        int arr[] = {2,2,3,2,7,7,8,7,8,8};
//        int ans = 0;
//
//        for(int i = 0 ; i < 32 ; i++){
//            int sum = 0;
//            for(int j = 0 ; j < arr.length ; j++){
//                if((arr[j] & 1) == 1){
//                    sum++;
//                }
//                arr[j] = arr[j] >> 1;
//            }
//            sum %= 3;
//
//            if(sum != 0){
//                ans |= sum << i;
//            }
//        }
//        System.out.println(ans);
//    }
//}

//class MagicNumber{
//    public static void main(String[] args) {
//        int n = 4;
//        int ans = 0;
//        for(int i = 0 ; i < 32 ; i++){
//            if(((n >> i) & 1) == 1){
//                int sum = (int)Math.pow(5,i+1);
//                ans = ans + sum;
//            }
//        }
//        System.out.println(ans);
//    }
//}

//class noOfDigits{
//    public static void main(String[] args) {
//        int n = 10;
//        int base = 2;
//        int ans = (int) (Math.log(n) / Math.log(base)+1);
//        System.out.println(ans);
//    }
//}

//class PascalNthSum{
//    public static void main(String[] args) {
//        int n = 4;
//        System.out.println(NthPascalSum(n));
//    }
//    public static int NthPascalSum(int n){
//        int sum = (int)Math.pow(2,n-1);
//        return sum;
//    }
//}

//class FindPower2OrNot{  //Approach 1
//    public static void main(String[] args) {
//        int n = 8;
//        System.out.println(FindNum(n));
//    }
//    public static int FindNum(int n){
//        int sum = 0;
//        for(int i = 0 ; i < 32 ; i++){
//            if(((n >> i) & 1) == 1){
//                sum++;
//            }
//        }
//        if(sum == 0 || sum > 1){
//            return 0;
//        }
//        return 1;
//    }
//}

//class FindPower2Ornot{  //Approach 2
//    public static void main(String args[]){
//        int n = 17;
//        boolean ans = (n & (n-1)) == 0;
//        System.out.println(ans);
//    }
//}

//class calculatePower{
//    public static void main(String[] args) {
//        int base = 3;
//        int pow = 6;
//
//        int ans = 1;
//
//        while(pow > 0){
//            if((pow & 1) == 1){
//                ans = ans * base;
//            }
//            //square the base you have
//            base *= base;
//
//            pow = pow >> 1;
//        }
//        System.out.println(ans);
//    }
//
//}

//class FindSetBits{
//    public static void main(String[] args) {
//        int n = 0b1010;
//        System.out.println(FindingSetBits(n));
//    }
//    public static int FindingSetBits(int n){
//        int sum = 0;
//        for(int i = 0 ; i < 32 ; i++){
//            if((n & 1) == 1){
//                sum++;
//            }
//            n = n >> 1;  //we can shift bits like this or we did previously
//        }
//        return sum;
//    }
//}

//class findSetBits2{   //Approach2
//    public static void main(String[] args) {
//        int n = 0b10011;
//        int count = 0;
//        while(n > 0){
//            count++;
//            n = n & (n-1);
//        }
//
//        System.out.println(count);
//    }
//}

//class XorFrom0toa{
//    public static void main(String[] args) {
//        int a = 6;
//        int ans = 0;
//        for(int i = 0 ; i < a+1 ; i++){
//            ans = ans ^ i;
//            System.out.println(ans);
//        }

        //Approach2 : I want to find XOR of a directly

//        if(a % 4 == 0){
//            System.out.println(a);
//        } else if (a % 4 == 1) {
//            System.out.println(1);
//        } else if (a % 4 == 2) {
//            System.out.println(a+1);
//        } else if (a % 4 == 3) {
//            System.out.println(0);
//        }
//    }
//}

//class XORBtwnAandB{
//    public static void main(String[] args) {
//        int a = 4;
//        int b = 10;
//
//        int ans = xor(a-1)^xor(b);
//    }
//    public static int xor(int a){
//        if(a % 4 == 0){
//            return a;
//        }
//        if(a % 4 == 1){
//            return 1;
//        }
//        if(a % 4 == 2){
//            return a+1;
//        }
//        return 0;
//    }
//}

//class flipImage{
//    public static void main(String[] args) {
//        int arr[][] = {
//                {0,1,1},
//                {1,0,1},
//                {0,0,0}
//        };
//        System.out.println("Original Array:");
//        Print(arr);
//
//        Flipping(arr);
//        System.out.println("Flipped Array:");
//        Print(arr);
//
//        reverse(arr);
//        System.out.println("Reversed Array:");
//        Print(arr);
//    }
//    public static void Print(int arr[][]){
//        for(int i = 0 ; i < arr.length ; i++){        //rows
//            for(int j = 0 ; j < arr[i].length ; j++){ //accessing elements of rows
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//    }
//    public static void Flipping(int arr[][]){
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0 ; j < arr[0].length/2 ; j++){
//                int temp = arr[i][j];   //accessing 1st element
//                arr[i][j] = arr[i][arr[i].length-1-j];
//                arr[i][arr[i].length-1-j] = temp;
//            }
//        }
//    }
//    public static void reverse(int arr[][]){
//        int ans = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0 ; j < arr[i].length ; j++){
//                ans = arr[i][j]^1;
//                arr[i][j] = ans;
//            }
//        }
//
//    }
//}

