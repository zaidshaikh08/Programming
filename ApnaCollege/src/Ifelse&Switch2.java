//class firstifelse{
//    public static void main(String args[]){
//        int num1 = 23;
//        double num2 = 23.5;
//
//        if(num1 < num2){
//            System.out.println("Number 2 is greater");
//        }
//        else{
//            System.out.println("Number 1 is smaller");
//        }
//    }
//}

//import java.util.*;
//class firstNestedIfElse{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        int age = sc.nextInt();
//        float height = sc.nextFloat();
//
//        if(age > 18){
//            if(height < 5.5){
//                System.out.println("Sorry, You cannot get this ride");
//            }
//            else{
//                System.out.println("You can ride");
//            }
//        }
//        else{
//            System.out.println("Sorry, You're not an adult");
//        }
//    }
//}


// Write a program to find maximum between two numbers
//class maximumMin{
//    public static void main(String args[]){
//        int num1 = 23;
//        int num2 = 44;
//
//        if(num1 > num2){
//            System.out.println("Num1 is maximum");
//        }
//        else{
//            System.out.println("Num2 is maximum");
//        }
//    }
//}

//Write a program to find maximum between three numbers
//class maximumBtwn3Nos{
//    public static void main(String args[]){
//        int num1 = 23;
//        int num2 = 34;
//        int num3 = 45;
//
//        if (num1 > num2 && num1 > num3){
//            System.out.println("Num1 is greater");
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("Num2 is greater");
//        } else if (num3 > num1 && num3 > num2) {
//            System.out.println("Num3 is greater");
//        }
//    }
//}

//Write a program to check whether a number is negative, positive or zero
//class checkSignOfNum{
//    public static void main(String args[]) {
//        int num1 = -12;
//
//        if (num1 > 0) {
//            System.out.println("Number is positive");
//        } else if (num1 < 0){
//            System.out.println("Number is negative");
//        } else if (num1 == 0) {
//            System.out.println("Number is zero");
//        }
//    }
//}-

//Write a program to check whether a number is divisible by 5 and 11 or not
//class checkDivisibility{
//    public static void main(String args[]){
//        int num1 = 10;
//
//        if(num1 % 5 == 0 || num1 % 11 == 0){
//            System.out.println("The number is divisible by 5 or 11");
//        }
//        else{
//            System.out.println("The number is not divisible by 5 or 11");
//        }
//    }
//}

//Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
//class checkTriangleType{
//    public static void main(String args[]){
//        int side1 = 12;
//        int side2 = 13;
//        int side3 = 12;
//
//
//        if (side1 == side2 && side2 == side3){
//            System.out.println("Equilateral Triangle");
//        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
//            System.out.println("Isoceles Triangle");
//        } else if (side1 != side2 && side2 != side3) {
//            System.out.println("Scalene Triangle");
//        }
//    }
//}

//Write a program to count total number of notes in given amount
//class countNotes{
//    public static void main(String args[]){
//        int amt = 158388;
//        int n500, n100, n50, n20, n10;
//        n500 = n100 = n50 = n20 = n10 = 0;
//
//        if(amt >= 500){
//            n500 = amt/500;
//            amt = amt -(n500 * 500);
//        }
//        if(amt >= 100){
//            n100 = amt / 100;
//            amt = amt - (n100 * 100);
//        }
//        if(amt >= 50){
//            n50 = amt / 50;
//            amt = amt - (n50 * 50);
//        }
//        if(amt >= 20){
//            n20 = amt / 20;
//            amt = amt - (n20 * 20);
//        }
//        if(amt >= 10){
//            n10 = amt / 10;
//            amt = amt - (n10 * 10);
//        }
//        System.out.println("Total Amount : "+ amt);
//        System.out.println("500 : "+n500);
//        System.out.println("100 : "+n100);
//        System.out.println("50 : "+n50);
//        System.out.println("n20 : "+n20);
//        System.out.println("n10 : "+n10);
//    }
//}

//Write a java program that accepts three numbers from the user and check if numbers are in "increasing" or "decreasing" order
//import java.util.*;
//class checkInDecrease{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//
//        if(num1 < num2 && num2 < num3){
//            System.out.println("Increasing order");
//        }else if(num1 > num2 && num2 > num3){
//            System.out.println("Decreasing order");
//        }
//        else {
//            System.out.println("Random Order");
//        }
//    }
//}

//Write a Java program that accepts three numbers and check All numbers are equal or not
//class checkAllEqual{
//    public static void main(String args[]){
//        int num1 = 22;
//        int num2 = 22;
//        int num3 = 2;
//
//        if(num1 == num2 && num2 == num3){
//            System.out.println("Numbers are equal");
//        }else{
//            System.out.println("Numbers are not equal");
//        }
//    }
//}

//A library charges a fine for every book returned late. For first 5 days the fine is 50 paise, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees.
//If you return the book after 30 days your membership will be cancelled. Write a program to accept the number of days the member is late to return the book and
//display the fine or the appropriate message
//import java.util.*;
//class bookReturnFine{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int lateDays = sc.nextInt();
//
//        if(lateDays <= 5){
//            System.out.println("You'll need to pay a fine of 50 paise");
//        }else if(lateDays >5 && lateDays <= 10){
//            System.out.println("You'll need to pay a fine of 1 rupee ");
//        }else if(lateDays > 10 && lateDays < 30){
//            System.out.println("You'll need to pay a fine of 5 rupee ");
//        }else if(lateDays >= 30) {
//            System.out.println("Your membership has been cancelled");
//        }
//    }
//}

//Write a program to calculate the salary as per the following table
//import java.util.Scanner;
//class Calculate_Salary
//{
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the Years of Service :");
//        int yos = input.nextInt();
//        System.out.print("Enter the Gender f/m :");
//        char gen = input.next().charAt(0);
//        System.out.print("Enter the Qualification (Graduate(0) , Post-Graduate(1)) :");
//        int qual = input.nextInt();
//        int salary = 0;
//        if(gen=='m' && yos>=10 && qual==1)
//        {
//            salary = 15000;
//        }
//        else if( (gen=='m' && yos>=10 && qual==0) || ( gen=='m' && yos<10 && qual==1 ) || ( gen=='f' && yos<10 && qual==1))
//        {
//            salary = 10000;
//        }
//        else if(gen=='m' && yos<10 && qual==0)
//        {
//            salary = 7000;
//        }
//        else if(gen=='f' && yos>=10 && qual==1)
//        {
//            salary = 12000;
//        }
//        else if(gen=='f' && yos>=10 && qual==0)
//        {
//            salary = 9000;
//        }
//        else if(gen=='f' && yos<10 && qual==0)
//        {
//            salary = 6000;
//        }
//        System.out.println("Salary : " + salary);
//    }
//}


//Switch case
//import java.util.*;
//class firstSwitch{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 : System.out.println("Monday");
//            break;
//
//            case 2 : System.out.println("Tuesday");
//            break;
//
//            case 3 : System.out.println("Wednesday");
//            break;
//
//            case 4 : System.out.println("Thursday");
//            break;
//
//            case 5 : System.out.println("Friday");
//            break;
//
//            case 6 : System.out.println("Saturday");
//            break;
//
//            case 7 : System.out.println("Sunday");
//            break;
//
//            default: System.out.println("Enter the valid number");
//            break;
//        }
//    }
//}

//import java.util.*;
//class numbers{
//
//    // Main driver method
//    public static void main(String[] args) {
//        Scanner sc =  new Scanner(System.in);
//        // Custom input string
//        String Branch = sc.next();
//        int year = 1;
//
//        // Switch case
//        switch (year) {
//
//            // Case
//            case 1:
//                System.out.println(
//                        "elective courses : Advance english, Algebra");
//
//                // Break statement to hault execution here
//                // itself if case is matched
//                break;
//
//            // Case
//            case 2:
//
//                // Switch inside a switch
//                // Nested Switch
//                switch (Branch) {
//
//                    // Nested case
//                    case "CSE":
//                    case "CCE":
//                        System.out.println(
//                                "elective courses : Machine Learning, Big Data");
//                        break;
//
//                    // Case
//                    case "ECE":
//                        System.out.println(
//                                "elective courses : Antenna Engineering");
//                        break;
//
//                    // default case
//                    // It will execute if above cases does not
//                    // execute
//                    default:
//
//                        // Print statement
//                        System.out.println(
//                                "Elective courses : Optimization");
//                }
//        }
//    }
//}
 
