package org.example;

public class FloodFill {
    public static void main(String args[]){
        int[][] a = {{0,0,0},{0,1,0}};
        System.out.println(java.util.Arrays.deepToString(a));
        System.out.println(java.util.Arrays.deepToString(floodFill(a,0,0,2)));
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int srl = image.length-1;
        int scl = image[0].length-1;
        System.out.println("srl "+srl+" scl "+scl);
        int inc = image[sr][sc];
        return floodFill2(image,sr,sc,color,inc,scl,srl);
    }
    public static int[][] floodFill2(int[][] image, int sr, int sc, int color,int inc,int scl,int srl) {
        if(sr<0 || sc<0 || sr>srl || sc> scl) return image;
        if(inc == color) return image;
        if(image[sr][sc]==inc){
            image[sr][sc] = color;
            floodFill2(image,sr-1,sc,color,inc,scl,srl);
            floodFill2(image,sr+1,sc,color,inc,scl,srl);
            floodFill2(image,sr,sc-1,color,inc,scl,srl);
            floodFill2(image,sr,sc+1,color,inc,scl,srl);
        }
        return image;
    }
}
