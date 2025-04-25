//class printNumbers5To1{
//    public static void Numbers(int n){
//        if(n == 0){
//            return ;
//        }
//        System.out.println(n);
//        Numbers(n-1);
//    }
//    public static void main(String args[]){
//        Numbers(5);

//    }
//}

//class printNumbers1to5{
//    public static void numbers(int n){
//        if(n == 6){
//            return;
//        }
//        System.out.println(n);
//        numbers(n+1);
//    }
//    public static void main(String args[]){
//        numbers(1);
//    }
//}

//class printNUmbers1To5Meth2{
//    public static void numbers(int n,int m){
//        if(n == 0){
//            return;
//        }
//        System.out.println(m);
//        numbers(n-1,m+1);
//    }
//    public static void main(String args[]){
//        numbers(5,1);
//    }
//}

//class SumOfNNumbers{
//    public static void NNumbers(int i, int n, int sum){
//        if(i == n+1){
//            sum+=i;
//            System.out.println(sum);
//            return;
//        }
//        sum+=i;
//        NNumbers(i+1,n,sum);
//    }
//    public static void main(String args[]){
//        NNumbers(0,5,0);
//    }
//}

//class factorial{      This one is easy but not much precise as it is as same as we do in iteration
//    public static void fact(int n, int sum){
//        if(n == 0){
//            System.out.println(sum);
//            return;
//        }
//        sum = sum * n;
//        fact(n-1,sum);
//    }
//    public static void main(String args[]){
//        fact(5,1);
//    }
//}

//class factorial2{
//    public static int fact2(int n){
//        if(n == 0){
//            return 1;
//        }
//        return n * fact2(n-1);
//    }
//    public static void main(String args[]){
//        int result = fact2(5);
//        System.out.println(result);
//    }
//}

//class factorial2{
//    public static int fact3(int n){
//        if(n == 0){
//            return 1;
//        }
//        int factCondn = fact3(n-1);
//        int calculate_fact = n*factCondn;
//        return calculate_fact;
//    }
//    public static void main(String args[]){
//        int result = fact3(5);
//        System.out.println(result);
//    }
//}

//class fibonacci{
//    public static void fibonacciSeries(int n, int a, int b){
//        if(n == 0){
//            return;
//        }
//        int c = a + b;
//        System.out.println(c);
//        fibonacciSeries(n-1,b,c);
//    }
//    public static void main(String args[]){
//        int n = 5;
//        System.out.println(0);
//        System.out.println(1);
//        fibonacciSeries(n-2,0,1);
//    }
//}

//In the below question the stack height we wanted is n that is 5 but we got 6 as here
//The difference between the n is only of 1 that is negligible thus the stack height is equal
//class PrintXToPower{  //Stack height should be n
//    public static int CalculatePower(int x, int n){
//        if(n == 0){
//            return 1;
//        }
//        if(x == 0){
//            return 0;
//        }
//        int calculatePow = CalculatePower(x,n-1);
//        int result = x*calculatePow;
//        return result;
//    }
//    public static void main(String args[]){
//        int result = CalculatePower(2,3);
//        System.out.println(result);
//    }
//}


//class PrintXTOThePower{  //The stack height should be logn
//    public static int CalculatePower(int x, int n){
//        if(n == 0){
//            return 1;
//        }
//        if(n % 2 == 0){
//            return CalculatePower(x,n/2) * CalculatePower(x,n/2);
//        }else{
//            return CalculatePower(x,n/2) * CalculatePower(x,n/2) * x;
//        }
//    }
//    public static void main(String args[]){
//        int result = CalculatePower(2,3);
//        System.out.println(result);
//    }
//}


//class TowerOfHanoi{
//    public static void Hanoi(int n, String src, String helper, String dest){
//        if(n == 1){
//            System.out.println("tranfer disk "+n+ " From "+src+ " to "+dest);
//            return;
//        }
//        Hanoi(n-1,src,dest,helper);
//        System.out.println("tranfer disk "+n+ " From "+src+ " to "+dest); //it is for the single disk which is at the src
//        Hanoi(n-1,helper,src,dest);
//    }
//    public static void main(String args[]){
//        int n = 3;
//        Hanoi(n,"S","H","D");
//    }
//}

//class PrintStringRev{
//    public static void Reverse(String str,int idx){
//        if(idx == 0){
//            System.out.print(str.charAt(idx));
//            return;
//        }
//
//        System.out.print(str.charAt(idx));
//        Reverse(str,idx-1);
//
//    }
//    public static void main(String args[]){
//        String str = "abcd";
//        Reverse(str,str.length()-1);
//    }
//}

//class PrintFAndLOccurence{
//    public static int focc = -1;
//    public static int locc = -1;
//    public static void occurence(String str, int idx, char element){
//
//        if(idx == str.length()-1){
//            System.out.println(focc);
//            System.out.println(locc);
//            return;
//        }
//        char currChar = str.charAt(idx);
//
//        if(element == currChar){
//            if(focc == -1){
//                focc = idx;
//            }else{
//                locc = idx;
//            }
//        }
//        occurence(str,idx+1,element);
//    }
//    public static void main(String args[]){
//        occurence("abaacdaefaah",0,'a');
//    }
//}

//class CheckSorted{  //Strictly Increasing
//    public static  boolean isSorted(int arr[], int idx) {
//        if(idx == arr.length-1){
//            return true;
//        }
//        if(arr[idx] < arr[idx+1]){
//            return isSorted(arr,idx+1);
//        }else{
//            return false;
//        }
//    }
//    public static void main(String args[]){
//        int arr[] = {23,24,334,25,256};
//        boolean result = isSorted(arr,0);
//        if(result == true){
//            System.out.println("Array is strictly Sorted");
//        }else{
//            System.out.println("Array is Unsorted");
//        }
//    }
//
//}

//class shiftX{
//    public static int count = 0;
//    public static void Shifting(String str, String str2, int idx){
//        if(idx == str.length()){
//            for(int i = 0 ; i < count ; i++){
//                str2 += 'x';
//            }
//            System.out.println(str2);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(currChar == 'x'){
//            count++;
//            Shifting(str,str2,idx+1);
//        }else{
//            str2 += currChar;
//            Shifting(str,str2,idx+1);
//        }
//
//    }
//    public static void main(String args[]){
//        String str = "axbcxxd";
//        String str2 = "";
//        Shifting(str,str2,0);
//    }
//}

//class removeDuplicates{
//    public static boolean map[] = new boolean[26];
//    public static void duplicates(String str, String str2, int idx){
//        if(idx == str.length()){
//            System.out.println(str2);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(map[currChar-'a'] == true){
//            duplicates(str,str2,idx+1);
//        }else{
//            str2 += currChar;
//            map[currChar-'a'] = true;
//            duplicates(str,str2,idx+1);
//        }
//    }
//    public static void main(String args[]){
//        duplicates("abbaadcdds","",0);
//    }
//}

//class subsequence{
//    public static void PrintSubSeq(String str, String str2, int idx){
//        if(idx == str.length()){
//            System.out.println(str2);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        //to be
//        PrintSubSeq(str, str2+currChar , idx+1);
//        // not to be
//        PrintSubSeq(str,str2,idx+1);
//    }
//
//    public static void main(String args[]){
//        String str = "abc";
//        PrintSubSeq(str,"",0);
//    }
//
//}

//HashSet is a type of set which stores all the values and all the values it contains are unique
//class permutations{
//    public static void PrintPermutations(String str, String str2){
//        if(str.length() == 0){
//            System.out.println(str2);
//            return;
//        }
//        for(int i = 0 ; i < str.length() ; i++){
//            char currChar = str.charAt(i);
//            String newStr = str.substring(0,i) + str.substring(i+1); //for 1st i is excluded and elements after i will be added inside the new String
//            PrintPermutations(newStr,str2+currChar);  //str is changed by newStr. because it will consider the string newStr and add in
//            //with different combinations Adding ith element in the str2
//        }
//    }
//    public static void main(String args[]){
//        String str = "abc";
//        PrintPermutations(str,"");
//    }
//}

//class permutations{
//    public static void Permut(String str, String permut){
//        if(str.length() == 0){
//            System.out.println(permut);
//            return;
//        }
//        for(int i = 0 ; i < str.length() ; i++){
//            char currChar = str.charAt(i);
//            String newStr = str.substring(0,i) + str.substring(i+1);
//            Permut(newStr, permut+currChar);
//        }
//    }
//    public static void main(String args[]){
//        String str = "abc";
//        Permut(str,"");
//    }
//}

//class CountPaths{
//    public static int countingPaths(int i, int j, int n, int m){
//        if(i == n || j == m){
//            return 0;
//        }
//        if(i == n-1 && j == m-1){
//            return 1;
//        }
//        //MoveDownwards
//        int downWards = countingPaths(i+1,j,n,m);
//
//        //MoveUpwards
//        int rightPath = countingPaths(i,j+1,n,m);
//
//        return downWards+rightPath;
//
//    }
//    public static void main(String args[]){
//        int m = 3;
//        int n = 3;
//        int result = countingPaths(0,0,n,m);
//        System.out.println(result);
//    }
//}


