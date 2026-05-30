package org.example;

public class ValidPalindrome {
    public static void main(String args[]){
      String s = "A man, a plan, a canal: Panama";
      boolean a = isPalindrome(s);
    }
    public static boolean isPalindrome(String s) {

        String r = s.replaceAll("[^a-zA-Z0-9]","");
        r= r.toLowerCase();
        if(r.isEmpty()||r.length()==1)return true;

        System.out.println("Values: r:"+r);

        int n = r.length()/2;
        int j = r.length()-1;
        System.out.println("Values: n:"+n);

        for(int i = 0;i<n;i++){
            if(r.charAt(i) != r.charAt(j))
            {return false;}
            System.out.println("Values: i:"+r.charAt(i)+"    "+"Values: j:"+r.charAt(j) );
            j--;
        }
        return true;


    }
    public boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
