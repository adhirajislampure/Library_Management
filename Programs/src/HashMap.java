import java.util.Arrays;
import java.util.List;

public class HashMap {
    //first non-repeating character

    public int firstUniqueChar(String s){
        HashMap charCount=new HashMap();
        for(int i=0;i<s.length();i++){
            if(charCount.containsKey(s.charAt(i))){
                charCount.put(s.charAt(i),charCount.get(s.charAt(i))+1);


            }
        }
        for(int i=0;i<s.length();i++){
            if(charCount.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    //problem---find two numbers in array that add up to target
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{ };

    }

    //problem :group strings that are annagrams of each other
//    Input: ["eat","tea","tan","ate","nat","bat"]
//    Output: [["bat"],["nat","tan"],["ate","eat","tea"]] */

    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=String.valueOf(chars);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }




    //longest subString without repeating characters
/* Problem: Find length of longest substring without repeating characters
   Input: "abcabcbb"
   Output: 3 ("abc") */


    public int lengthOflongestSubstring(String s){
        HashMap map=new HashMap();
        int maxLength=0;
        int start=0;
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            if(map.containsKey(c)){
                start=Math.max(start,map.get(c)+1);
            }
            map.put(c,end);
            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }



}
