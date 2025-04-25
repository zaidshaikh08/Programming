//Strings
//class RemoveA{
//    public static void main(String[] args) {
//        String str = "aaaaaaanmnhhahahaha";
//        System.out.println(Remove(str,"",0));
//
//    }
//    public static String Remove(String str, String ans, int idx){
//        if(idx == str.length()){  //this means that we have iterated through all the characters
//            return ans;
//        }
//        if(str.charAt(idx) != 'a'){
//            return Remove(str, ans + str.charAt(idx), idx+1);
//        }
//        return Remove(str, ans, idx+1);
//    }
//}


//class RemoveA{
//    public static void main(String[] args) {
//        String str = "anamiana";
//        Remove(str,"");
//    }
//    public static void Remove(String str, String ans){
//        if(str.isEmpty()){       //when string gets empty so print ans
//            System.out.println(ans);
//            return;
//        }
//
//        char ch = str.charAt(0);
//        //when element is equal to the character in that case remove that by using substring which is eliminating that element
//        if(ch == 'a'){
//            Remove(str.substring(1),ans);
//        }else{
//            //When element must be counted then add the element in the ans then remove it from org str
//            Remove(str.substring(1),ans+ch);
//        }
//    }
//}

//class RemoveString{
//    public static void main(String[] args) {
//        String str = "bcapplefyu";
//        System.out.println(RemoveString(str,""));
//    }
//    public static String RemoveString(String str, String ans){
//        if(str.isEmpty()){
//            return ans;
//        }
//        if(str.startsWith("apple")){
//            //When encountered beginning with apple, we know that apple has 5 words, so we skipped the 5 words using substring
//            return RemoveString(str.substring(5), ans);
//        }
//            //When beginning is not with apple then we adding the element of str in ans then updating the str by removing the added element
//            return RemoveString(str.substring(1), ans+str.charAt(0));
//    }
//}

//class RemoveStringIfItsNotRequiredString{
//    public static void main(String[] args) {
//        String str = "bcappleappfyu";
//        System.out.println(SkipAppNotApplle(str,""));
//    }
//    public static String SkipAppNotApplle(String str, String ans){
//        if(str.isEmpty()){
//            return ans;
//        }
//        //starting with app and not starting with apple so in that case we'll skip the element by 3 as app has 3 characters
//        if(str.startsWith("app") && !str.startsWith("apple")){
//            return SkipAppNotApplle(str.substring(3), ans);
//        }
//        //When beginning is not with apple then we are adding the element of str in ans then updating the str by removing the added element
//        return SkipAppNotApplle(str.substring(1), ans+str.charAt(0));
//    }
//}

//Without passing ans as argument
//all the previous problems can be solved by this way(i.e without passing an argument)
//class RemoveString{
//    public static void main(String[] args) {
//        String str = "bcappleappfyu";
//        System.out.println(SkipAppNotApplle(str));
//    }
//    public static String SkipAppNotApplle(String str){
//        if(str.isEmpty()){/
//            return "";
//        }
//
//        if(str.startsWith("app") && !str.startsWith("apple")){
//            return  SkipAppNotApplle(str.substring(3));
//        }else{
//            return str.charAt(0) + SkipAppNotApplle(str.substring(1));
//        }
//    }
//}