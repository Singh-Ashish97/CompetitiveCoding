package org.example;

import java.util.Stack;

public class ValidParenthese {
    public static void main(String args[]){
        String s = ")(";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        Stack<Character> valid = new Stack<>();
        try {
            for(int i = 0; i< s.length(); i++){
                if(s.length()==1) return  false;
                //if(valid.empty())continue;

                switch(s.charAt(i)){
                    case '(':
                    case '{':
                    case '[': valid.push(s.charAt(i));
                        break;
                    case ')': {
                        if (valid.pop() == '(') continue;
                        else return false;
                        //break;
                    }
                    case '}': {
                        if (valid.pop() == '{') continue;
                        else return false;
                        //break;
                    }
                    case ']': {
                        if (valid.pop() == '[') continue;
                        else return false;
                        //break;
                    }

                }

            }
            if(!valid.empty())return false;
            return true;

        }
        catch (Exception ex){
            return false;
        }
    }

}
