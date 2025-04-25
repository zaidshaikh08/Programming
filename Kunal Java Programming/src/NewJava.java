import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.*;

//1. Flow of program
//class NewJava{
//    public static void main(String[] args) {
//        //FindLeapYear();
//        //MultiplicationTables();
//        int result = InputTillX();
//        System.out.println(result);
//    }
//    //1.Year should be divisible by 4 and not by 100 OR year is divisible by 400
//    public static void FindLeapYear(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the year : ");
//        int year = sc.nextInt();
//        if(year % 4 == 0 && year % 100 != 0){
//            System.out.println("It is a leap year");
//        } else if (year % 400 == 0) {
//            System.out.println("Its a leap year");
//        } else{
//            System.out.println("It's not a leap year");
//        }
//    }
//    //3.
//    public static void MultiplicationTables(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the table number : ");
//        int tableNo = sc.nextInt();
//        System.out.println("Enter the Number of last number value of table : ");
//        int lastNo = sc.nextInt();
//        //Calculation of table
//        for(int i = 1 ; i <= lastNo ; i++){
//            System.out.println("5 * "+i+ "== " + tableNo*i);
//        }
//    }
//    //5.
//    public static int InputTillX (){
//        Scanner sc = new Scanner(System.in);
//        String input;
//        int add = 0;
//        do{
//            System.out.println("Enter the number or x to exit : ");
//            input = sc.next();
//            if(!input.equals("x")){
//                int num = Integer.parseInt(input);
//                add = num + add;
//            }
//        }while(!input.equals("x"));
//
//        return add;
//    }
//}

//class FirstJava{
//    public static void main(String[] args) {
//        FindEvenOrOdd(10);
//        GrettingName("Zaid");
//        int result = FindSimpleInterest();
//        System.out.println(result);
//        int result = printLargest(7,11);
//        System.out.println(result);
//        int result = Calculatedollars(40000);
//        System.out.println(result);
//        FibonacciSeries(5);
//        boolean result = pallindromeOrNot("lmnmml");
//        System.out.println(result);
//
//    }
//    1.
//    public static void FindEvenOrOdd(int num){
//        if(num % 2 == 0){ //even number
//            System.out.println("Number is even");
//        }else {
//            System.out.println("Number is odd");
//        }
//    }
//    //2.
//    public static void GrettingName(String name){
//        System.out.println("Hello "+ name);
//    }
//    //3.
//    public static int FindSimpleInterest(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the amount borrowed : ");
//        int Amt = sc.nextInt();
//        System.out.println("Enter the period of loan : ");
//        int time = sc.nextByte();
//        System.out.println("Enter the rate of interest : ");
//        int rate = sc.nextByte();
//
//        return (Amt*rate*time)/100;
//    }
//    //5.
//    public static int printLargest(int num1, int num2){
//        if(num1 > num2){
//            return num1;
//        }
//        return num2;
//    }
//    //6.
//    public static int Calculatedollars(int amt){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Indian rs : ");
//        int rupee = sc.nextInt();
//        System.out.println("Enter the current rate of Dollar : ");
//        int dollarRate = sc.nextInt();
//
//        return (rupee/dollarRate);
//    }
//    //7.
//    public static void FibonacciSeries(int n){
//        int f = 0;
//        int s = 1;
//        System.out.println(f+"\n"+s);
//        for(int i = 0 ; i < n ; i++){
//            int t = f+s;
//            System.out.println(t);
//            f = s;
//            s = t;
//        }
//    }

//    //8.
//    public static boolean pallindromeOrNot(String str){
//        int start = 0;
//        int end = str.length()-1;
//        while(start < end){
//            if(str.charAt(start) == str.charAt(end)){
//                start++;
//                end--;
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }

    //9.
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
//}

//class conditionalLoops{
//    public static void main(String[] args) {
        //float result = CircleArea();
        //System.out.println(result);

        //double result = TriangleArea();
        //System.out.println(result);

        //int result = DifferenceOfProductAndSum(4421);
        //System.out.println(result);

        //FindFactors(20);

        //TillUserExitsAndFindLargest();

        //Factorial(10);

        //float result = Avg();
        //System.out.println(result);

        //float result = calculateDiscount();
        //System.out.println(result);

        //int result = DistanceBtwn2Points();
        //System.out.println(result);

        //int result = Power(5);
        //System.out.println(result);

        //int result = BattingAvergae();
        //System.out.println(result);

        //int result = CGPA();
        //System.out.println(result);

        //ArmstrongNumber();

        //PallindromeOrNot(1231);

        //int result = sumOfDigits(234);
        //System.out.println(result);

//    }
    //Basic Java Programs
    //1.
//    public static float CircleArea(){
//        Scanner sc = new Scanner(System.in);
//        float pi = 3.14f;
//        float radius = sc.nextFloat();
//
//        return pi * (radius*radius);
//    }
//    //2.
//    public static double TriangleArea(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the base of triangle : ");
//        float base = sc.nextFloat();
//        System.out.println("Enter the height of triangle : ");
//        float height = sc.nextFloat();
//
//        return 0.5 * base*height;
//    }
//    //22.
//    public static int DifferenceOfProductAndSum(int n){
//        int temp = n;
//        int product = 1;
//        while(temp > 0){
//            int rem = temp % 10;
//            product = product * rem;
//            temp = temp / 10;
//        }
//        System.out.println("Product of digits : "+product);
//
//        int temp2 = n;
//        int sum = 0;
//        while(temp2 > 0){
//            int rem = temp2 % 10;
//            sum = sum + rem;
//            temp2 = temp2/10;
//        }
//        System.out.println("Sum of digits : "+sum);
//
//        //
//        return product-sum;
//    }
//    //23.
//    public static void FindFactors(int n){
//        for(int i = 2 ; i <= n ; i++){
//            if(n % i == 0){
//                System.out.print(i+" ");
//            }
//        }
//    }
//
//    //25.
//    public static void TillUserExitsAndFindLargest(){
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
//        int input;
//        //inputs till user does'nt enters 0
//        do{
//            input = sc.nextInt();
//            if(input != 0){
//                arr.add(input);
//            }
//        }while(input != 0);
//
//        //bubble sort
//        for(int i = 0 ; i < arr.size() ; i++){
//            for(int j = 0 ; j < arr.size()-i-1; j++){
//                if(arr.get(j) > arr.get(j+1)){
//                    //swapping
//                    int temp = arr.get(j);
//                    arr.set(j,arr.get(j+1));
//                    arr.set(j+1,temp);
//                }
//            }
//        }
//        //Print Last element
//        System.out.println(arr.get(arr.size()-1));
//    }
    //Intermediate java program
//    //1.
//    public static void Factorial(int n){
//        int fact = 1;
//        for(int i = n ; i > 0 ; i--){
//            fact = fact * i;
//        }
//        System.out.println(fact);
//    }
//
//    //3.
//    public static float Avg(){
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
//        int input;
//        do{
//            input = sc.nextInt();
//            if(input!=0){
//                arr.add(input);
//            }
//        }while(input != 0);
//
//        int sum = 0;
//        for(int i = 0 ; i < arr.size(); i++){
//            sum = arr.get(i)+sum;
//        }
//        return sum/ arr.size();
//    }
//
//    //4.
//    public static float calculateDiscount(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Price(Same as MRP) : ");
//        int OP = sc.nextInt();
//        System.out.println("Enter the DiscountRate : ");
//        float discountRate = sc.nextInt();
//
//        float discountPrice = (OP * discountRate) / 100;
//
//        float finalPrice = OP - discountPrice;
//
//        return finalPrice;
//    }
//    //5.
//    public static int DistanceBtwn2Points(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter point 1 in cm : ");
//        int p1 = sc.nextInt();
//        System.out.println("Enter point 2 in cm : ");
//        int p2 = sc.nextInt();
//        if(p1 > p2){
//            return p1-p2;
//        }
//        return p2-p1;
//    }
//    //7.
//    public static int Power(int n){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the power : ");
//        int pow = sc.nextInt();
//        int ans = 1;
//        for(int i = 0 ; i < pow ; i++){
//            ans = ans * n;
//        }
//        return ans;
//    }
//
//    //9.
//    public static int BattingAvergae(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter total runs scored By Batsman : "); //In whole carrier
//        int TotalRuns = sc.nextInt();
//        System.out.println("Enter the total number of batsman got out : ");
//        int totalOuts = sc.nextInt();
//
//        int battingAvg = TotalRuns/totalOuts;
//
//        return battingAvg;
//    }
//    //10.
//    public static int CGPA(){
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[6];
//        for(int i = 0 ; i < arr.length ; i++){
//            int input;
//            do{
//                input = sc.nextInt();
//                if(input > 100){
//                    System.out.println("Enter the valid marks under 100 ");
//                }
//            }while(input > 100);
//            arr[i] = input;
//        }
//        //Calculate Sum of marks
//        int sum = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            sum = sum + arr[i];
//        }
//
//        int CGPA = sum/ arr.length;
//
//        return CGPA;
//    }
//    //14.
//    public static void ArmstrongNumber(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number : ");
//        int num = sc.nextInt();
//        int temp = num;
//        int sum = 0;
//        int len = String.valueOf(num).length();
//        while(temp > 0){
//            int rem = temp % 10;
//            sum = sum + (int)Math.pow(rem,len);
//            temp = temp/10;
//        }
//
//        if(num == sum){
//            System.out.println("Armstrong Number");
//        }else{
//            System.out.println("Not a Armstrong Number");
//        }
//    }
//    //17.
//    public static void PallindromeOrNot(int n){
//        int temp = n;
//        int sum = 0;
//        while(temp > 0){
//            int rem = temp % 10;
//            sum = (sum * 10) + rem;
//            temp = temp/10;
//        }
//        if(sum == n){
//            System.out.println("Number is Pallindrome");
//        }else{
//            System.out.println("Not Pallindrome");
//        }
//    }
//    //24.
//    public static int sumOfDigits(int n){
//        int sum = 0;
//        while(n > 0){
//            int rem = n % 10;
//            sum = sum + rem;
//            n = n / 10;
//        }
//        return sum;
//    }
//}


//class Functions{
//    public static void main(String[] args) {
//        //FindEven1toN();
//        //FindOdd1toN();
//
//        //String result = PrimeOrNot();
//        //System.out.println(result);
//
//        //boolean result = FindPythagorasTriplet();
//        //System.out.println(result);
//
//        //PrimeBtwnNo();
//
//        //int result = sumOfNNaturalNo(20);
//        //System.out.println(result);
//
//
//    }
//    //2.
//    public static void FindEven1toN(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number : ");
//        int from = sc.nextInt();
//        System.out.println("Enter the last number : ");
//        int to = sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i = from ; i <= to ; i++){
//            if(i % 2 == 0){
//                arr.add(i);
//            }
//        }
//        PrintList(arr);
//    }
//    //2.
//    public static void FindOdd1toN(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number : ");
//        int from = sc.nextInt();
//        System.out.println("Enter the second number : ");
//        int to = sc.nextInt();
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i = from ; i <= to ; i++){
//            if(i % 2 != 0){
//                arr.add(i);
//            }
//        }
//        PrintList(arr);
//    }
//    public static void PrintList(ArrayList<Integer> arr){
//        for(int i = 0 ; i < arr.size() ; i++){
//            System.out.print(arr.get(i)+" ");
//        }
//    }
//
//    public static String PrimeOrNot(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n = sc.nextInt();
//
//        for(int i = 2 ; i < n ; i++){
//            if(n == 2){
//                return "Prime";
//            }
//            if(n % i == 0){
//                return "NotPrime";
//            }
//        }
//        return "Prime";
//    }
//
//    public static boolean FindPythagorasTriplet(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number : ");
//        int n = sc.nextInt();
//        int temp = n;
//        int count = 3;
//        int sum = 0;
//        while(temp > 0){
//            int rem = temp % 10;
//            //Condition to skip the last digit
//            if(count == 3){
//                count--;
//                temp = temp/10;
//                continue;
//            }
//            sum = sum + (int)Math.pow(rem,2);
//            temp = temp/10;
//            count--;
//        }
//        n = n % 10;
//        if(sum == (int)Math.pow(n,2)){
//            return true;
//        }
//        return false;
//    }
//
//    //13.
//    public static void PrimeBtwnNo(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number : ");
//        int from = sc.nextInt();
//        System.out.println("Enter the second number : ");
//        int to = sc.nextInt();
//
//        for(int i = from ; i < to ; i++){
//            int count = 0;
//            for(int j = 2 ; j < i ; j++){
//                if(i == 2){
//                    System.out.println(j);
//                }
//                if(i % j == 0){
//                    count++;
//                }
//            }
//            if(count == 0){
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static int sumOfNNaturalNo(int n){
//        //10
//        int sum = 0;
//        for(int i = 1 ; i <= n ; i++){
//            sum = sum + i;
//        }
//        return sum;
//    }
//}

//class arrays{
//    public static void main(String[] args) {
        //BuildArrayFromPermutation();

        //int nums[] = {1,2,3,4};
        //RunningSumOfArray(nums);

        //int nums[] = {2,5,1,3,4,7};
        //ShuffleArray(nums,3);

        //int arr[] = {2,3,5,1,3};
        //ArrayList<Boolean> List  = KidsWithGreatestNumber(arr,3);

        //int arr[] = {1,2,3,1,1,3};
        //int result = FindGoodPairs(arr);
        //System.out.println(result);

        //int arr[] = {0,1,2,3,4};
        //int index[] = {0,1,2,2,1};
        //CreateTargetArray(arr,index);

        //int arr[] = {-5, 1, 5, 0, -7};
        //int result = FindHighestAltitude(arr);
        //System.out.println(result);

        //int arr[] = {2,1,5};
        //List<Integer> result = AddToArrayForm(arr,806);
        //System.out.println(result);
//    }
    //1.
//    public static void BuildArrayFromPermutation(){
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[6];
//        for(int i = 0 ; i < arr.length ; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
//        int arr2[] = new int[arr.length];
//        for(int i = 0 ; i < arr.length ; i++){
//            arr2[i] = arr[arr[i]];
//        }
//        System.out.println(Arrays.toString(arr2));
//    }
//    //2.
//    public static int[] ConcatenateArray(int nums[]){
//        int newSize = nums.length;
//        int ans[] = new int[2*newSize];
//
//        for(int i = 0 ; i < newSize ; i++){
//            ans[i] = nums[i];
//            ans[i+newSize] = nums[i];
//        }
//        return ans;
//    }
//    public static int [] RunningSumOfArray(int nums[]){
//        int ans[] = new int[nums.length];
//        for(int i = 0 ; i < ans.length ; i++){
//            if(i == 0){
//                ans[i] = nums[i];
//            }else{
//                ans[i] = nums[i]+ans[i-1];
//            }
//        }
//        return ans;
//    }
//    public static void ShuffleArray(int arr[],int n){
//        int nums[] = new int[n*2];
//        int x = 0;
//        int y = n;
//
//        for(int i = 0 ; i < arr.length-1; i+=2){
//            nums[i] = arr[x];
//            nums[i+1] = arr[y];
//            x++;
//            y++;
//        }
//    }
//    //6.
//    public static ArrayList<Boolean> KidsWithGreatestNumber(int candies[], int extraCandies) {
//        ArrayList<Boolean> arr = new ArrayList<Boolean>();
//
//        for(int i = 0 ; i < candies.length ; i++){
//            int sum = 0;
//            int count = 0;
//            sum = candies[i]+extraCandies;
//            for(int j = 0 ; j < candies.length ; j++){
//                if(sum >= candies[j]){
//                    count++;
//                }
//            }
//            if(count == candies.length){
//                arr.add(true);
//            }else{
//                arr.add(false);
//            }
//        }
//        return arr;
//    }
//    //7.
//    //[1,2,3,1,1,3]
//    public static int FindGoodPairs(int arr[]){
//        int count = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = i+1 ; j < arr.length ; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//    //8.
//    public static int[] SmallerThanCurrent(int arr[]){
//        int result [] = new int[arr.length];
//        for(int i = 0 ; i < arr.length ; i++){
//            int count = 0;
//            for(int j = 0 ; j < arr.length ; j++){
//                if(arr[i] > arr[j]){
//                    count++;
//                }
//
//            }
//            result[i] = count;
//        }
//        return result;
//    }
//    //9.
//    public static void CreateTargetArray(int nums[], int index[]) {
//        int target[] = new int[nums.length];
//        Arrays.fill(target, -1);
//        for (int i = 0; i < nums.length; i++) {
//            //prevent overwriting
//            if (target[index[i]] != -1) {
//                rightShift(target,index[i]);
//            }
//            target[index[i]] = nums[i];
//        }
//    }
//    public static void rightShift(int target[], int lastIndex){
//        for(int i = target.length ; i > lastIndex ; i++){
//            target[i] = target[i-1]; //Shift all the elements to right
//        }
//    }
//
//    //[-5,1,5,0,-7]
//    public static int FindHighestAltitude(int arr[]){
//        int alt = 0;
//        int maxAlt = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            alt = alt + arr[i];
//            if(maxAlt < alt){
//                maxAlt = alt;
//            }
//        }
//        return maxAlt;
//    }
//
//    public static int findEvenDigits(int nums[]){
//        int output = 0;
//        for(int i = 0 ; i < nums.length ; i++){
//            int count = 0;
//            int temp = nums[i];
//            while(temp > 0){
//                temp = temp/10;
//                count++;
//            }
//            if(count != 0 && count%2 == 0){
//                output++;
//            }
//        }
//        return output;
//    }
//
//}

//class SortingAlgorithms{
//    public static void main(String[] args) {
//        int arr[] = {4,0,2,1};
        //BubbleSorting(arr);
        //System.out.println(Arrays.toString(arr));

        //SelectionSort(arr);
        //System.out.println(Arrays.toString(arr));

        //InsertionSort(arr);
        //System.out.println(Arrays.toString(arr));

        //CyclicSort(arr);
        //System.out.println(Arrays.toString(arr));

//        FindMissingNumber(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void BubbleSorting(int arr[]){//Best Case : O(n) ; Worst Case : O(n^2)
//        for(int i = 0 ; i < arr.length-1 ; i++){
//            boolean swapped = false;
//            for(int j = 0 ; j < arr.length-i-1 ; j++){
//                if(arr[j] > arr[j+1]){
//                    swap(arr,j,j+1);
//                    swapped = true;
//                }
//            }
//            //if arr is sorted then in first loop it will complete and exit the loop
//            if(!swapped){
//                break;
//            }
//        }
//    }
//    public static void swap(int arr[], int f, int s){
//        int temp = arr[f];
//        arr[f] = arr[s];
//        arr[s] = temp;
//    }
//
//    //Selecting greatest element and placing it at the rightmost
//    public static void SelectionSort(int arr[]){ //Best Case : O(n^2) ; Worst Case : O(n^2)
//        for(int i = 0 ; i < arr.length ; i++){
//            int greatest = 0;
//            for(int j = 0 ; j < arr.length-i ; j++){
//                if(greatest < arr[j]){
//                    greatest = j;
//                }
//            }
//            swap(arr,greatest, arr.length-i-1);
//        }
//    }
//
//
//    public static void InsertionSort(int arr[]){ //Best Case O(N). Worst Case O(N^2)
//        for(int i = 0 ; i < arr.length-1 ; i++){
//            int j = i+1;
//
//            while(j > 0 && arr[j] < arr[j-1]){
//                if(arr[j] < arr[j-1]){
//                    swap(arr,j,j-1);
//                }
//                j--;
//            }
//        }
//    }
//
//    public static void CyclicSort(int arr[]){ //Best Case O(N). Worst Case O(n)
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] != i+1){
//                swap(arr,i,arr[i]-1);
//            }
//        }
//    }
//}

//class MergeSortedArray{//Worst Case : O((m + n)^2) Dominated by bubble sort
//    public static void main(String[] args) {
//        int nums1[] = {1,2,3,0,0,0,0,0};
//        int nums2[] = {7,8,9,10,11};
//        int m = 3;
//        int n = 5;
//        merge(nums1,m,nums2,n);
//    }
//    public static void merge(int nums1[], int m, int nums2[], int n){
//        //pointer for m
//        int i = m-1; //3-->2
//        //pointer for n
//        int j = m;//3
//        //pointer for total length of arr1
//        int k = m+n;//3+3=6-->5
//        //pointer for elements of arr2
//        int count = 0;
//        //while n is less than len of arr1(m+n)
//        while(j < k){
//            //take the element from 2nd Array and place at nth idx of 1st.
//            nums1[j] = nums2[count];
//            count++;
//            j++;
//        }
//        BubbleSorting(nums1);
//
//    }
//    //Bubble Sort
//    public static void BubbleSorting(int arr[]){//Best Case : O(n) ; Worst Case : O(n^2)
//        for(int i = 0 ; i < arr.length-1 ; i++){
//            boolean swapped = false;
//            for(int j = 0 ; j < arr.length-i-1 ; j++){
//                if(arr[j] > arr[j+1]){
//                    swap(arr,j,j+1);
//                    swapped = true;
//                }
//            }
//            //if arr is sorted then in first loop it will complete and exit the loop
//            if(!swapped){
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    //swap
//    public static void swap(int arr[], int f, int s){
//        int temp = arr[f];
//        arr[f] = arr[s];
//        arr[s] = temp;
//    }
//}

//class ArrayQuestions{
//    public static void main(String[] args) {
//        int arr[] = {3,2,2};
//        System.out.println(majorityElements(arr));
//    }
//    public static int majorityElements(int nums []){
//        int n = nums.length;
//
//        // Iterate through the array to check for the majority element
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//
//            // Count occurrences of nums[i]
//            for (int j = 0; j < n; j++) {
//                if (nums[j] == nums[i]) {
//                    count++;
//                }
//            }
//
//            // If count is greater than n/2, return the element
//            if (count > n / 2) {
//                return nums[i];
//            }
//        }
//
//        // In case there's no majority element (though problem states there always is)
//        return -1;
//    }
//    public static boolean ContainsDuplicate(int nums[]){
//        BubbleSorting(nums);
//        for(int i = 1 ; i < nums.length ; i++){
//            if(nums[i] == nums[i-1]){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void BubbleSorting(int arr[]) {//Best Case : O(n) ; Worst Case : O(n^2)
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean swapped = false;
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    swap(arr, j, j + 1);
//                    swapped = true;
//                }
//            }
//            //if arr is sorted then in first loop it will complete and exit the loop
//            if (!swapped) {
//                break;
//            }
//        }
//    }
//    public static void swap(int arr[], int f, int s){
//        int temp = arr[f];
//        arr[f] = arr[s];
//        arr[s] = temp;
//    }
//}
//class FindMissingNumber{
//    public static void main(String[] args) {
//        int arr[] = {9,6,4,2,3,5,7,0,1};
//        System.out.println(FindMissing(arr));
//    }
//    public static int FindMissing(int nums[]){ //Taking ith element and placing at its correct position
//        for(int i = 0 ; i < nums.length ; i++){
//            while(nums[i] < nums.length && nums[i] != i){
//                swap(nums,i,nums[i]);
//            }
//        }
//        int n = 0;
//        while(n < nums.length){
//            if(nums[n] == n){
//                n++;
//            }else{
//                return n;
//            }
//        }
//        return n;
//    }
//    public static void swap(int arr[], int f, int s){
//        int temp = arr[f];
//        arr[f] = arr[s];
//        arr[s] = temp;
//    }
//}

//class RecursionString{
//    public static void main(String[] args) {
//        String str = "baccaaaaaadaapple";
//        //System.out.println(RemoveElement(str,0,'a',""));
//        //System.out.println(RemovingElement(str,"",'a'));
//        //System.out.println(RemovingString(str,"","apple"));
//        String str2 = "appappappaapppppppp";
//        System.out.println(RemovingAppFromStr(str2));
//    }
//    public static String RemoveElement(String str,int idx, char element, String Nstr){
//        if(idx == str.length()){
//            return Nstr;
//        }
//        char currChar = str.charAt(idx);
//
//        if(currChar == 'a'){
//            return RemoveElement(str,idx+1,element,Nstr);
//        }
//        else{
//            return RemoveElement(str,idx+1,element,Nstr+currChar);
//        }
//    }
//    public static String RemovingElement(String str, String Nstr, char element){
//        if(str.isEmpty()){
//            return Nstr;
//        }
//        char ch = str.charAt(0); //Taking the idx of 1st element
//
//        if(ch == element){
//            // Removing the element that we're having currently from the string.
//            //We're not actually removing but updating the str into new str by using substring
//            return RemovingElement(str.substring(1),Nstr,element);
//        }else{
//            return RemovingElement(str.substring(1),Nstr+ch,element);
//        }
//    }
//
//    public static String RemovingString(String str, String eliminate){
//        if(str.isEmpty()){
//            return " ";
//        }
//        if(str.startsWith(eliminate)){
//            return RemovingString(str.substring(eliminate.length()),eliminate);
//        }
//        else{
//            return str.charAt(0) + RemovingString(str.substring(1),eliminate); //Here you're keeping the 0th idx element of every
//            //idx element of every new string and then removing it by using substring
//        }
//    }
//
//    public static String RemovingAppFromStr(String str){
//        if(str.isEmpty()){
//            return "";
//        }
//        if(!str.startsWith("apple")){ //we're checking if it is not starting with the apple so that it can be removed
//            if(str.startsWith("app")){
//                return RemovingAppFromStr(str.substring(3));
//            }
//        }
//        return str.charAt(0) + RemovingAppFromStr(str.substring(1)); //Here you're keeping the 0th idx element of every
//        //idx element of every new string and then removing it by using substring
//    }
//}

class Subsets{
    public static void main(String[] args) {

        //Permuatations("abc","");
        ArrayList<String> list = new ArrayList<>();
        System.out.println(PermuatationsList("abc","",list));//Pass list as argument
    }
//    public static void Permuatations(String str, String nStr){
//        if(str.isEmpty()){
//            System.out.println(nStr);
//            return;
//        }
//
//
//        char ch = str.charAt(0);
//        Permuatations(str.substring(1),nStr+ch);
//        Permuatations(str.substring(1),nStr);
//    }
    //Storing in list
    public static ArrayList<String> Permuatations(String str, String nStr){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(nStr); // when base condition reaches it stores all the values of nstr
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> left = Permuatations(str.substring(1),nStr+ch);
        ArrayList<String> right = Permuatations(str.substring(1),nStr);
        left.addAll(right);

        return left;
    }

    //Passing list as argument
    public static ArrayList<String> PermuatationsList(String str, String nStr, ArrayList<String> list){
        if(str.isEmpty()){
            list.add(nStr);
            return list;
        }
        char ch = str.charAt(0);

        PermuatationsList(str.substring(1), nStr+ch,list);
        PermuatationsList(str.substring(1), nStr,list);

        return list;
    }


}


