//Print 5 to 1
//class PrintNUm {
//    public static void main(String[] args) {
//        int n = 5;
//        PrintNum(n);
//    }
//    public static void PrintNum(int n){
//        if(n == 0){
//            return;
//        }
//        System.out.println(n);
//        PrintNum(n-1);
//    }
//}

//Print from 1 to 5
//class PrintNum {
//    public static void main(String[] args) {
//        int n = 5;
//        PrintNum(n);
//    }
//    public static void PrintNum(int n){
//        if(n == 0){
//            return;
//        }
//        PrintNum(n-1);
//        System.out.println(n);
//    }
//}

//Print numbers from n to 0 and 0 to n
//class PrintNum {
//    public static void main(String[] args) {
//        int n = 5;
//        PrintNum(n);
//    }
//    public static void PrintNum(int n){
//        if(n == 0){
//            return;
//        }
//        System.out.println(n);
//        PrintNum(n-1);
//        System.out.println(n);
//    }
//}

//class RecursionFactorial{
//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(CalculateFact(n));
//    }
//    public static int CalculateFact(int n){
//        if(n == 1){
//            return 1;
//        }
//        return n * CalculateFact(n-1);
//    }
//}

//class SumOfNNumbers{
//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(SumNumbers(n));
//    }
//    public static int SumNumbers(int n){
//        if(n == 1){
//            return 1;
//        }
//        return n + SumNumbers(n-1);
//    }
//}

//class SumDigits{
//    public static void main(String[] args) {
//        int n = 12345;
//        System.out.println(SumDigits(n));
//    }
//
//    public static int SumDigits(int n){
//        if(n == 1){
//            return 1;
//        }
//
//        return (n % 10) + SumDigits(n/10);
//    }
//}
//class SumNDigits{
//    public static void main(String[] args) {
//        int n = 12345;
//        System.out.println(Sum(n));
//    }
//    public static int sum = 0;
//
//    public static int Sum(int n){
//        while(n != 0) {
//            int rem = n % 10;
//            sum = sum + rem;
//            n = n / 10;
//        }
//        return sum;
//    }
//}  //iterative approach

//class ProductOfDigits{
//    public static void main(String[] args) {
//        int n = 55;
//        System.out.println(Product(n));
//
//    }
//    public static int Product(int n){
//        if(n == 0){
//            return 1;
//        }
//        return (n % 10) * Product(n/10);
//    }
//}

//Iterative Approach
//class ReverseNumber{
//    public static void main(String[] args) {
//        int n = 12345;
//        String sum = "";
//        int num = 0;
//
//        while(n > 0){
//            num = n % 10;
//            sum = sum + Integer.toString(num);
//            n/=10;
//        }
//        System.out.println(sum);
//    }
//}

//Recursive Approach but converting into String
//class ReverseNumber{
//    public static void main(String[] args) {
//        int n = 12345;
//        System.out.println(Reverse(n));
//    }
//    public static String Reverse(int n){
//        if(n == 0){
//            return "";
//        }
//        return Integer.toString(n%10) + Reverse(n/10);
//    }
//}

//Reverse Number without converting into string
//class ReverseNumber{
//    public static void main(String[] args) {
//        int n = 1342;
//        System.out.println(Reverse(n));
//    }
//    public static int sum = 0;
//
//    public static int Reverse(int n){
//        if(n == 0){
//            return sum;
//        }
//        int rem = n % 10;
//        sum = sum * 10 + rem;
//        return Reverse(n/10);
//    }
//}

//class ReverseNumber{
//    public static void main(String[] args) {
//        int n = 1234;
//        System.out.println(Reverse(n));
//    }
//    public static int Reverse(int n){
//        int digits = (int)Math.log10(n) + 1;
//        return helper(n,digits); //value of helper function gets printed here
//    }
//    public static int helper(int n, int digits){
//        if(n % 10 == n){
//            return n;
//        }
//
//        int rem = n % 10;
//        return rem * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);  //helper is for taking the number and digit for operation
//        //as this calls gets completed then all the values that has been returned gets add
//    }
//}

//Check if number is pallindrome or not by converting the number into string
//class PallindromeNumber{
//    public static void main(String[] args) {
//        int n = 123321;
//        System.out.println(Check(n));
//    }
//    public static boolean Check(int n){
//        String str = Integer.toString(n);
//        int start = 0;
//        int end = str.length()-1;
//
//        while(start < end){
//            if(str.charAt(start) == str.charAt(end)){
//                start++;
//                end--;
//            }
//            else{
//                return false;
//            }
//        }
//        return true;
//    }
//}

//Check if a number is Pallindrome or not
//class CheckPallindrome{
//    public static void main(String[] args) {
//        int n = 123321;
//        System.out.println(checkPallindromeOrNot(n));
//    }
//    public static int sum = 0;
//
//    public static int Reverse(int n){
//        if(n == 0){
//            return sum;
//        }
//        int rem = n%10;
//        sum = sum * 10 + rem;
//        return Reverse(n/10);
//    }
//    public static boolean checkPallindromeOrNot(int n){  //Instead of checking in main function i've made an extra function
//        if(Reverse(n) != n){
//            return false;
//        }
//        return true;
//    }
//}

//class countNumbers{
//    public static void main(String[] args) {
//        int n = 1030100;
//        System.out.println(Counting(n,0));
//    }
//    public static int Counting(int n, int count){
//        if(n == 0){
//            return count;
//        }
//        int rem = n % 10;
//        if(rem == 0){
//            return Counting(n/10,count+1);
//        }
//        return Counting(n/10,count);
//    }
//}

//Number of Steps to reduce a number to zero
//class ReduceToZero{
//    public static void main(String[] args) {
//        int n = 14;
//        System.out.println(Reducing(n,0));
//    }
//    public static int Reducing(int n, int count){
//        if(n == 0){
//            return count;
//        }
//        if(n % 2 == 0){
//            return Reducing(n/2,count+1);
//        }
//        return Reducing(n-1,count+1);
//    }
//}