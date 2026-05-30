package org.example;

public class ValidAnagram {
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Ans: "+isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if(s.length() != t.length())return false;

        for(int i = 0; i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int a : arr){
            if(a != 0) return false;
        }
        return true;

    }
}
