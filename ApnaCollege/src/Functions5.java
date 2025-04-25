//class function1{
//    public static void sayHello(){
//        System.out.println("Hello World");
//    }
//    public static void main(String args[]){
//        sayHello();
//    }
//}

//class printArray{
//    public static void printingArray(int arr[]){
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//    }
//    public static void main(String args[]){
//        int [] arr = {12,23,45,55};
//        printingArray(arr);
//    }
//}

//class printAstericksLine{
//    public static void printLine(int num){
//        for(int i = 0 ; i < num ; i++){
//            System.out.print("*");
//        }
//    }
//    public static void main(String args[]){
//        int num = 10;
//        printLine(num);
//    }
//}

//import java.time.LocalDateTime;
//class dateTime{
//    public static void date(){
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//    }
//    public static void main(String args[]){
//        date();
//    }
//}

//WithParameters
//class addition{
//    public static void addingNum(int n1 , int n2){
//        int add = n1+n2;
//        System.out.println(add);
//    }
//    public static void main(String args[]){
//        addingNum(2,3);
//    }
//}

//class multiplicationTable{
//    public static void multiplying(int num){
//        int sum = 1;
//        int i = 0;
//        while(i <= 10){
//            sum = num * i;
//            System.out.println(sum);
//            i++;
//        }
//    }
//
//    public static void main(String args[]){
//        int num = 10;
//        multiplying(num);
//    }
//}

//class fibonacci{
//    public static void fibon(int num){
//        int n1 = 0;
//        int n2 = 1;
//        int n3;
//        System.out.println(n1);
//        System.out.println(n2);
//        for(int i = 2 ; i < num ; i++){
//            n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//            System.out.println(n3);
//        }
//    }
//
//    public static void main(String args[]){
//        int num = 5;
//        fibon(num);
//    }
//}

//import java.util.*;
//class numAvg{
//    public static void calculateAvg(){
//        Scanner sc = new Scanner(System.in);
//        int num;
//        int sum = 0;
//        int count = 0;
//        do{
//            System.out.print("Enter the number or enter 0 to exit : ");
//            num = sc.nextInt();
//            if(num != 0){
//                count++;
//            }
//            sum = sum + num;
//        }while(num != 0);
//        int total = sum / count;
//        System.out.println(total);
//    }
//    public static void main(String args[]){
//        calculateAvg();
//    }
//}

//returnStatement
//import java.util.Scanner;
//class FunctionExample {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Enter another number: ");
//        int num2 = scanner.nextInt();
//        int sum = add(num1, num2);
//        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
//        }
//        public static int add ( int a, int b){
//            return a + b;
//        }
//    }

//class uniqueElements{
//    public static void main(String args[]){
//        int num [] = {12,13,14,15,12,13,14,16};
//        int num2 [] = new int[num.length];
//        int uniqueCount = 0;
//
//        for(int i = 0 ; i < num.length ; i++){
//            int j;
//            for(j = 0 ; j < uniqueCount ; j++){
//                if(num[i] == num2[j]){
//                    break;
//                }
//            }
//            if(j == uniqueCount){
//                num2[uniqueCount] = num[i];
//                uniqueCount++;
//            }
//        }
//        for(int i = 0 ; i < uniqueCount ; i++){
//            System.out.println(num2[i]);
//        }
//    }
//}
//

//functions can be of same name but its arguments should'nt be the same
//Eg : if we make a function named foo which doesnt return anything, then
//if i want to create another foo variable then i'll have to make foo but now with an parameter in it
//Even if we change the return type of the function then also it'll not be able to make the new function
//as it has been made previously
//In Short, can result into making a valid function except that it wont be valid

//VARARGS
//Suppose we want n number of arguments. we dont know the figures of how much args we want
//So in this case, we can use varargs where you can take n numbers of arguments

//class varargs{
//    public static int varargs(int ...arr){  //initializing args as varargs
//        // available as int arr[]
//        int result = 0;
//        for(int i : arr){
//            result+=i;
//        }
//        return result;
//    }
//    public static void main(String args[]){
//        int sum = varargs(2,4,5);
//        System.out.println(sum);
//    }
//}