//class printNumbers{
//    public static void main(String args[]) {
//        int num = 10;
//        for (int i = 1; i <= num ; i++){
//            System.out.println(i);
//        }
//    }
//}

//class printRevNum{
//    public static void main(String args[]){
//        int num = 50;
//        for(int i = num ; i >= 0 ; i--){
//            System.out.println(i);
//        }
//    }
//}

//class printAlphabets{
//    public static void main(String args[]){
//        char last = 'z';
//        for(char first = 'a' ; first <= last ; first++){
//            System.out.println(first);
//        }
//    }
//}

//class sumOfNNatural{
//    public static void main(String args[]){
//        int num1 = 10;
//        int sum = 0;
//        for(int i = 0 ; i <= num1 ; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
//    }
//}

//class sumEvenNo{
//    public static void main(String args[]){
//        int n = 10;
//        int sum = 0;
//
//        for(int i = 1 ; i <= n ; i++){
//            if(i % 2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//    }
//}

//class sumOdd{
//    public static void main(String args[]){
//        int num = 10;
//        int sum = 0;
//
//        for(int i = 1 ; i <= num ; i++){
//            if(i % 2 != 0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//    }
//}

//class multiplicationTable{
//    public static void main(String args[]){
//        int num = 10;
//        int sum = 1;
//        for(int i = 1 ; i <= num ; i++){
//            sum = num * i;
//            System.out.println(sum);
//        }
//    }
//}

//class factorial{
//    public static void main(String args[]){
//        int num = 5;
//        int sum = 1;
//        for(int i = num ; i >= 1 ; i--){
//            sum = sum * i;
//        }
//        System.out.println(sum);
//    }
//}

//class power{
//    public static void main(String args[]){
//        int num = 4;
//        int power = 2;
//        int sum = 1;
//        for(int i = 1 ; i <= power ; i++){
//            sum = sum * num;
//        }
//        System.out.println(sum);
//    }
//}

//class sum{
//    public static void main(String args[]){
//        int[] num = {21,22,23,24,25};
//        int sum = 0;
//        int sum2 = 0;
//        for(int i = 0 ; i < num.length ; i++){
//            if(num[i] % 2 == 0){
//                sum = sum + num[i];
//            } else if (num[i] % 2 != 0) {
//                sum2 = sum2 + num[i];
//            }
//        }
//        System.out.println("The sum of even numbers from the array is : "+sum);
//        System.out.println("The sum of odd numbers from the array is : "+sum2);
//    }
//}

//class prime{
//    public static void main(String args[]){
//        int num = 26;
//        int count = 0;
//        for(int i = 2 ; i < num ; i++){
//            if(num % i == 0){
//                count++;
//            }
//        }
//        if(count >= 1){
//            System.out.println("The number is Composite");
//        }else{
//            System.out.println("The number is prime");
//        }
//    }
//}

//class nPrimeNumbers{
//    public static void main(String args[]){
//        int from = 10;
//        int to = 20;
//
//        for(int i = from ; i <= to ; i++){
//            int count = 0;
//            for(int j = 2 ; j < i ; j++){
//                if(i % j == 0){
//                    count++;
//                }
//            }
//            if(count < 1){
//                System.out.println(i);
//            }
//        }
//    }
//}

//class HCF{
//    public static void main(String args[]){
//        int num1 = 45;
//        int num2 = 30;
//        int sum = 0;
//
//        if(num1 < num2){
//            for(int i = 1 ; i <= num1 ; i++){
//                if(num1 % i == 0 && num2 % i == 0){
//                    sum = i;
//                }
//            }
//            System.out.println("HCF : "+sum);
//        }
//        if(num1 > num2){
//            for(int i = 1 ; i <= num1 ; i++){
//                if(num1 % i == 0 && num2 % i == 0){
//                    sum = i;
//                }
//            }
//            System.out.println("HCF : "+sum);
//        }
//
//    }
//}

//import java.util.*;
//class largestSmallest{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the counts of numbers you want to add : ");
//        int size = sc.nextInt();
//        int [] arr = new int[size];
//
//        int sum = 0;
//
//        for(int i = 0 ; i < size ; i++){
//            arr[i] = sc.nextInt();
//        }
//        //Smallest&Largest
//        int smallest = arr[0];
//        int largest = arr[0];
//
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] < smallest){
//                smallest = arr[i];
//            }
//            if(arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//        System.out.println("Smallest : "+smallest);
//        System.out.println("Largest : "+ largest);
//    }
//}

//class revDigits{
//    public static void main(String args[]){
//        String str = "Zaid";
//        String str2 = "";
//        for(int i = str.length()-1 ; i >= 0  ; i--){
//            str2 += str.charAt(i);
//        }
//        System.out.println(str2);
//    }
//}

//class sumOfDigits{
//    public static void main(String args[]) {
//        int num = 23634;
//        int sum = 0;
//
//        while (num > 0) {
//            int rem = num % 10;
//            sum = sum + rem;
//            num = num / 10;
//        }
//        System.out.println(sum);
//    }
//}

//class fibonacci{
//    public static void main(String args[]){
//        int num = 8;
//        int a1 = 0;
//        int a2 = 1;
//        int sum = 0;
//        System.out.println(a1);
//        System.out.println(a2);
//
//        for(int i = 0 ; i < num-2 ; i++){
//            sum = a1 + a2;
//            System.out.println(sum);
//            a1 = a2;
//            a2 = sum;
//        }
//    }
//}

//DoWhile Loop
//import java.util.*;
//class calculateWithDo{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        do{
//            int sum = 0;
//            sum = num1 + num2;
//            System.out.println(sum);
//
//            System.out.print("Enter the num1 as 0 to terminate or any other number to continue : ");
//            num1 = sc.nextInt();
//            num2 = sc.nextInt();
//        }while(num1 != 0);
//    }
//}

//class Printnumbers{
//    public static void main(String args[]){
//        int num = 10;
//        int i = 1;
//        do{
//           System.out.println(i);
//           i++;
//        }while(i <= num);
//    }
//}

//import java.util.*;
//class defineNumbers{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
////        int num = sc.nextInt();
//        int countPositive = 0;
//        int countNegative = 0;
//        int countZero = 0;
//
//        char choice;
//        do{
//            System.out.print("Enter the number : ");
//            int num = sc.nextInt();
//            if(num == 0){
//                countZero++;
//            } else if (num > 0) {
//                countPositive++;
//            } else if (num < 0) {
//                countNegative ++;
//            }
//            System.out.println("To enter more numbers press y and to exit press any : ");
//            choice = sc.next().charAt(0);
//        }while(choice == 'y' || choice == 'Y');
//
//        System.out.println("ZEROS : "+countZero);
//        System.out.println("Positive : "+countPositive);
//        System.out.println("Negative : "+countNegative);
//    }
//}

//import java.util.Scanner;
////menu driven program
//class menuDrivenProgram{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//
//        int choice;
//        int marks ;
//        do{
//            System.out.print("Enter your marks : ");
//            marks = sc.nextInt();
//            if(marks >= 90){
//                System.out.println("Marks is good");
//            } else if (marks <= 89 && marks >= 60) {
//                System.out.println("This is also good");
//            } else if (marks <= 59 && marks >=0) {
//                System.out.println("This is good as well");
//            }
//            System.out.println("Enter 0 to exit and 1 to enter : ");
//            choice = sc.nextInt();
//        }while(choice != 0);
//    }
//}

//While Loop
//class printHello{
//    public static void main(String args[]){
//        int i = 5;
//        while(i > 0){
//            System.out.println("Hello World");
//            i--;
//        }
//    }
//}

//class SummationOfNo{
//    public static void main(String args[]){
//        int num = 10;
//        int sum = 0;
//        while(num > 0){
//            sum+=num;
//            num--;
//        }
//        System.out.println(sum);
//    }
//}

//import java.util.*;
//class multiplicationTable{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int multiplicand = sc.nextInt();
//
//        int i = 1;
//        while(i <= multiplicand){
//            int sum = n * i;
//            i++;
//            System.out.println(sum);
//        }
//    }
//}

//class whileFactorial{
//    public static void main(String args[]){
//        int num = 10;
//        int sum = 1;
//
//        while(num > 0){
//            sum = sum * num;
//            num--;
//        }
//        System.out.println(sum);
//    }
//}

//class revNum{
//    public static void main(String args[]){
//        int num = 12345;
//        int sum = 0;
//        int rem = 0;
//        while(num > 0){
//            rem = num % 10;
//            sum = sum * 10 + rem;
//            num = num / 10;
//
//        }
//        System.out.println(sum);
//    }
//}

//find occurence of a number
//import java.util.*;
//class CountOccurence{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int num = 138393;
//        int elem = sc.nextInt();
//        int count = 0;
//        while(num > 0){
//            int calculation = num % 10;
//            if(calculation == elem){
//                count++;
//            }
//            num = num / 10;
//        }
//        System.out.println(count);
//
//    }
//}