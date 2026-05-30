package org.example;

public class FirstBadVersion {

    public static void main(String args[]){
        int n = 3;

        System.out.println("Bad output:" + firstBadVersion(n));
    }

    public static boolean isBadVersion(int n){
        if(n>=1){
            return true;
        }
        return false;
    }

    public static int firstBadVersion(int n) {
        //if(isBadVersion(1))return 1;
        int j = n;
        int i=1;

        while(i<=j){
            int mid = (i+j)/2;
            if(isBadVersion(mid)){
                if(isBadVersion(mid-1)){
                    j=mid;
                }
                else{
                    return mid;
                }
            }
            else{
                i = mid;
            }
        }
        return -1;

    }
}
