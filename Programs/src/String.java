public class String {


    //reverse a String
//    public static void ReverseString(String str){
//        char[] chars=str.toCharArray();
//        int left=0,right=str.length()-1;
//        while(left<right){
//
//        }
//    }


    //Reverse a String
    public static java.lang.String reverString(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }


    //check if String is Palindrome
    public static boolean isPalindrome(String str){
        str=str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //Check first non repeating character in a String

//    public static int firstNonRepeatingChar(String str){
//        Map<Character,Integer> map=new HashMap<>();
////        for(int i=0;i<str.length();i++){
////
////        }
//        for(char c:str.toCharArray()){
//            map.put(c,map.getOrDefault(c,0)+1);
//        }
//
//        f
//    }

    // Count Vowels and Consonents in String
    public staic void countVowelsConsonents(String str){
        str=str.toLowerCase();
        int vowels=0,consonents=0;

        for(char ch:str.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                consonents++;
            }
        }
        System.out.println("Vowels:"+ vowels);
        System.out.println("Consonents :"+consonents);
    }

    // count words in a String
    public static int countWords(String str){
        if(str==null ||str.trim().isEmpty()){
            return 0;
        }
        return str.trim().split("\\s+").length;
    }
    //Remove Duplicates From String
    public static java.lang.String removeDuplicates(String str){
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new HashSet<>();
        for(char ch:str.toCharArray()){
            if(set.add(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static boolean isPangram(String str){
        boolean[] mark=new boolean[26];
        str=str.toLowerCase();
        for(char ch:str.toCharArray()){
            if(ch>='a' && ch<='z'){
                mark[ch-'a']=true;
            }
        }
        for(boolean b:mark){
            if(!b){
                return false;
            }
            return true;
        }
    }


}
