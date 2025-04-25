//Check if Number is prime or not
//class PrimeNumbers{
//    public static void main(String[] args) {
//        int n = 20;
//        boolean check = CheckPrime(n);
//        System.out.println(check);
//    }
//    public static boolean CheckPrime(int n){
//        if(n <= 1){
//            return false;
//        }
//        int c = 2;
//        while(c <= Math.sqrt(n)){
//            if(n % c == 0){
//                return false;
//            }
//            c++;
//        }
//        return true;
//    }
//}

//Check numbers from 1 to n are prime or not
//class CheckNPrimeNumbers{
//    public static void main(String[] args) {
//        int n = 20;
//        for(int i = 1 ; i < n ; i++){
//            System.out.println(i+" "+CheckPrime(i));
//        }
//
//    }
//    public static boolean CheckPrime(int n){
//        if(n <= 1){
//            return false;
//        }
//        int c = 2;
//        while(c <= Math.sqrt(n)){
//            if(n % c == 0){
//                return false;
//            }
//            c++;
//        }
//        return true;
//    }
//}

//class PrimeNumbers{
//    public static void main(String[] args) {
//        int n = 37;
//        boolean arr[] = new boolean[n+1];
//        Check(n,arr);
//    }
//    public static void Check(int n, boolean arr[]){
//        for(int i = 2 ; i*i <= n ; i++){
//            if(!arr[i]){ //false
//                for(int j = i*2 ; j <= n ; j+=i){        //Everytime i*2 happens only for 1 time and for rest j is increased by i
//                    arr[j]= true;
//                }
//            }
//        }
//        for(int i = 2 ; i < arr.length ; i++){
//            if(!arr[i]){
//                System.out.println(i);
//            }
//        }
//    }
//}

//Normal Approach for finding if a number is a perfect square
//class squareRoot{
//    public static void main(String args[]){
//        int n = 36;
//        int result = PerfectSquare(n);
//        System.out.println(result);
//
//    }
//    public static int PerfectSquare(int n){
//        int i = 2;
//        while(i < n){
//            if((i*i) == n){
//                return i;
//            }
//            i++;
//        }
//        return 0;
//    }
//}

//Find the square root of a number
class FindRoot{
    public static void main(String[] args) {
        int n = 40;
        int p = 3;   //NO of Decimals
        double result = findingSquare(n,p);
        System.out.println(result);
    }
    public static double findingSquare(int n,int p){
        int start = 0;
        int end = n;

        double root = 0;

        while (start < end){
            int mid = (start+end) / 2;
            if(mid * mid == n){
                return mid;
            } else if (mid*mid > n) {
                end = mid-1;
            }else{
                start = mid + 1;
            }
            root = mid-1;
        }

        double incr = 0.1;
        for(int i = 0 ; i < p ; i++){

            while(root*root <= n){
                root = root + incr;

            }
            root = root - incr;
            incr = incr / 10;     //converting 0.1 into 0.01 to 0.001
        }
        return root;
    }
}

//class NewtonRaphson{
//    public static void main(String[] args) {
//        double n = 40;
//        System.out.println(GetRoot(n));
//    }
//    public static double GetRoot(double n){
//        double x = n;
//        double root ;
//
//        while(true){ //infinite Loop
//            root = 0.5 * (x + (n/x));
//
//            if(Math.abs(root - x) < 1){// As we want absolute value
//                break;
//            }
//            x = root;
//        }
//        return root;
//    }
//}

//class FindingFactorsOfNumber{
//    public static void main(String[] args) {
//        int n = 20;
////        FindFactors(n);
//        FindFactorsBySqrtTimes(n);
//    }
    //Normal Approach
//    public static void FindFactors(int n){
//        int i = 1;
//        while(i <= n){
//            if(n % i == 0){
//                System.out.print(i+" ");
//            }
//            i++;
//        }
//    }
    //Efficient Approach
//    public static void FindFactorsBySqrtTimes(int n){
//        int i = 1;
//        while(i <= Math.sqrt(n)){
//            if(n % i == 0){
//                if(n/i == i){
//                    System.out.println(i+" ");  //if n%i and n/i is same
//                }else{
//                    System.out.println(i+" "+ (n/i));
//                }
//            }
//            i++;
//        }
//    }
//}

//Euclids Algorithm
//class FindGcd{
//    public static void main(String[] args) {
//        int a = 4;
//        int b = 9;
//        System.out.println(gcd(a,b));
//    }
//    public static int gcd(int a, int b){
//        if(a == 0){
//            return b;
//        }
//        return gcd(b%a ,a);
//    }
//}
