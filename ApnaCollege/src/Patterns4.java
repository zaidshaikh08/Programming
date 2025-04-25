//class square{
//    public static void main(String args[]){
//        int num = 5;
//
//        for(int i = 0 ; i < num ; i++){
//            for(int j = 0 ; j < num ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

class hollowSq{
    public static void main(String args[]){
        int num = 5;
        for(int i = 0 ; i < num ; i++){
            for(int j = 0 ; j < num ; j++){
                if(i == 0 || i == num-1 || j == 0 || j == num-1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//class rightTriangle{
//    public static void main(String args[]){
//        int num = 5;
//
//        for(int i = 0 ; i < num ; i++){
//            for(int j = 0 ; j < i ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//class invertRight{
//    public static void main(String args[]){
//        int num = 5;
//
//        for(int i = num ; i > 0 ; i--){
//            for(int j = i ; j > 0 ; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//class rightTri{
//    public static void main(String args[]){
//        int num = 5;
//
//        for(int i = 0 ; i < num ; i++){
//            for(int j = num-i ; j > 0 ; j--){
//                System.out.print("  ");
//            }
//
//            for(int k = 0 ; k < i ; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//class NumberRightTriangle{
//    public static void main(String args[]){
//        int num = 5;
//
//        for(int i = 0 ; i < num ; i++){
//            for(int j = 1 ; j <= i ; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class NumberInvertRight{
//    public static void main(String args[]){
//        int num = 5;
//
//        for(int i = num ; i > 0 ; i--){
//            for(int j = i ; j > 0 ; j--){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class NumberRightTriangle{
//    public static void main(String args[]){
//        int num = 5;
//        int count = 0;
//        for(int i = 0 ; i < num ; i++){
//            for(int j = 1 ; j <= i ; j++){
//                count++;
//                System.out.print(count+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class rhomus{
//    public static void main(String args[]){
//        int num = 5;
//
//        for(int i = 0 ; i < num ; i++){
//            for(int j = 0 ; j < num-i ; j++){
//                System.out.print(" ");
//            }
//            for(int j = 0 ; j < num ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//class pyramid{
//    public static void main(String args[]){
//        int num = 5;
//        int count = 0;
//        for(int i = 0 ; i < num ; i++){
//            for(int j = 0 ; j < num - i ; j++){
//                System.out.print(" ");
//            }
//            for(int k = 0 ; k < i ; k++){
//                System.out.print(count+" ");
//            }
//            count++;
//            System.out.println();
//        }
//    }
//}

//class butterflyPattern {
//    public static void main(String args[]) {
//        int n = 4;
//
//
//        //upper part
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//
//
//            int spaces = 2 * (n-i);
//            for(int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }
//
//
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
////lower part
//        for(int i=n; i>=1; i--) {
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//
//
//            int spaces = 2 * (n-i);
//            for(int j=1; j<=spaces; j++) {
//                System.out.print(" ");
//            }
//
//
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//class PallindromePyramid {
//    public static void main(String args[]) {
//        int n = 5;
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//
//
//            //first part
//            for(int j=i; j>=1; j--) {
//                System.out.print(j);
//            }
//
//
//            //second part
//            for(int j=2; j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//class DiamondPattern {
//    public static void main(String args[]) {
//        int n = 5;
//
//
//        //upper part
//        for(int i=1; i<=n; i++) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//        //lower part
//        for(int i=n; i>=1; i--) {
//            //spaces
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

