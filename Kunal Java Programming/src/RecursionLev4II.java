//class Subsequences{
//    public static void main(String[] args) {
//        PrintSubSeq("abc","");
//
//        System.out.println(PrintSubSeqMeth2("abc","",new ArrayList<>()));
//        System.out.println(PrintSubSeqMeth3("abc",""));
//    }
//    public static void PrintSubSeq(String str, String ans){
//        if(str.isEmpty()){
//            System.out.println(ans);
//            return;
//        }
//        char ch = str.charAt(0);
//
//        PrintSubSeq(str.substring(1), ans);//Not adding currChar
//        PrintSubSeq(str.substring(1), ans+ch);//Adding the currChar into ans
//    }
//    public static ArrayList<String> PrintSubSeqMeth2(String str, String ans, ArrayList<String> list){
//        //Note that for each recursive call when reaches the base condition, it adds the ans in the list and moves to next recrusive call
//        if(str.isEmpty()){
//            list.add(ans);
//            return list;
//        }
//        char ch = str.charAt(0);
//
//        PrintSubSeqMeth2(str.substring(1), ans, list);//Not adding currChar
//        PrintSubSeqMeth2(str.substring(1), ans+ch,list);//Adding the currChar into ans
//
//        return list;
//    }

//Working of the below code
//The base case creates a new list and stores ans in it.
//This list is returned to the previous function call, where it is assigned to Include.
//As recursion unwinds, Include keeps getting lists returned from deeper calls, which already contain subsequences.
//Finally, Include.addAll(NotInclude); merges results from both recursive branches and returns them to the previous level.
//    public static ArrayList<String> PrintSubSeqMeth3(String str, String ans){
//        ArrayList<String> list = new ArrayList<>();
//        if(str.isEmpty()){
//            list.add(ans);
//            return list;
//        }
//        char ch = str.charAt(0);
//
//        //Include currChar
//        ArrayList<String> Include = PrintSubSeqMeth3(str.substring(1), ans);//Not adding currChar
//        //Dont include currChar
//        ArrayList<String> NotInclude = PrintSubSeqMeth3(str.substring(1), ans+ch);//Adding the currChar into ans
//        //After all calls include and notInclude has all the subsequences.
//
//        //Adding the elements of NotInclude into the include Elements
//        Include.addAll(NotInclude);
//        //Here it returns
//        return Include;
//    }
//}

//class PrintSubSequenceWithAscii{
//    public static void main(String[] args) {
//        System.out.println(PrintSubseqAsciiMeth2("abc",""));
//    }
//    public static void PrintSubseq(String str, String ans){
//        if(str.isEmpty()){
//            System.out.println(ans);
//            return;
//        }
//        char ch = str.charAt(0);
//        PrintSubseq(str.substring(1), ans);//Not adding currChar
//        PrintSubseq(str.substring(1), ans+ch);//Not adding currChar
//        PrintSubseq(str.substring(1), ans+(ch+0));//Adding the currChar into ans
//    }
//
//    public static ArrayList<String> PrintSubseqAsciiMeth2(String str, String ans){//ArrayList
//        //As after all the calls are made, when str gets empty then we add all the ans recursively in arraylist then return it
//        ArrayList<String> list = new ArrayList<>();
//        //When base condition is reached then new list named list is made and the permutation is added into the list and then it returns the list
//        if(str.isEmpty()){
//            list.add(ans);
//            return list;
//        }
//        char ch = str.charAt(0);
//        //Include currChar
//        ArrayList<String> Include = PrintSubseqAsciiMeth2(str.substring(1), ans);//Not adding currChar
//        //Dont include currChar
//        ArrayList<String> NotInclude = PrintSubseqAsciiMeth2(str.substring(1), ans+ch);//Adding the currChar into ans
//        ArrayList<String> Ascii = PrintSubseqAsciiMeth2(str.substring(1),ans+(ch+0));
//
//        //Adding the elements of NotInclude into the include Elements
//        Include.addAll(NotInclude);
//        Include.addAll(Ascii);
//        return Include;
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//class IterativeApproachSubSeq{
//    public static void main(String[] args) {
//        int arr[] = {1,2,3};
//        List<List<Integer>> OrgList = new ArrayList<>();//New List made
//        OrgList.add(new ArrayList<>());//Adding an empty list to begin with
//        for(int i : arr){//Iterate through every element
//            int size = OrgList.size();//To check how many elements are there in OrgList
//
//            for(int j = 0 ; j < size ; j++){//For size number of times we'll iterate the loop
//                ArrayList<Integer> TempList = new ArrayList<>(OrgList.get(j));//Making a copy of the element that is present already in the array using the j pointer
//                TempList.add(i);//Add the element that is at i within the array we coppied
//                OrgList.add(TempList);//Add this list which has the new subsequence
//            }
//        }
//        System.out.println(OrgList);
//    }
//}

//class SubsequenceWithDuplicates{
//    public static void main(String[] args) {
//        int arr[] = {1,2,2};
//        List<List<Integer>> OrgList = new ArrayList<>();
//        OrgList.add(new ArrayList<>());
//        int s = 0;
//        int e = 0;
//
//        for(int i = 0 ; i< arr.length ; i++){
//            s = 0;//IF condition is false then at everytime we'll keep our start at 0
//            if(i > 0 && arr[i] == arr[i-1]){
//                s = e+1;//If true then we'll ignore and consider the newest arrays and add into them
//            }
//            e = OrgList.size()-1;//This will point towards the last element of the previous array and e is mainly used as pointer to put start at correct position when duplicate is found
//            int size = OrgList.size();
//            for(int j = s ; j < size ; j++) {//As our copying will depend on start
//                ArrayList<Integer> tempList = new ArrayList<>(OrgList.get(j));
//                tempList.add(i);
//                OrgList.add(tempList);
//            }
//        }
//        System.out.println(OrgList);
//    }
//}


//class printPermutations{
//    public static void main(String[] args) {
//        printPermutations("","abc");
//    }
//    public static void printPermutations(String p, String up){//Processed;Unprocessed
//        if(up.isEmpty()){
//            System.out.println(p);//Note that these permutations will be printed when each of the respective recursive call reaches the base condition and for that each call answer will be given
//            return;
//        }
//        char ch = up.charAt(0);
//        //based on the elements actually present inside p we will add that many characters on left right and middle based on length of p
//        for(int i = 0 ; i <= p.length() ; i++){
//            //These variables helps in placing to the left and to the right of the p.
//            String f = p.substring(0,i);//I is exclusive
//            String s = p.substring(i);//From i till the end
//            //let's say if p.length is 1 then based on this example our p is containing a in it. Now i will iterate from 0 to 1.
//            //when i=0, f will have no element as 0,0 doesnt contain any element in our p and the element is present at the idx1, so
//            //as your s will run from 0(ith) till the end it will have a.
//
//            //Making a call which adds our elements ch wil f and s and removing the ch from up.
//            printPermutations(f+ch+s,up.substring(1));
//        }
//    }
//}