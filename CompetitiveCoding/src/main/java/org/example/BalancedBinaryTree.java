package org.example;

public class BalancedBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(root.left == null && root.right == null) return true;
        int l = isBalanced2(root.left);
        int r = isBalanced2(root.right);
        if(l==-1 || r==-1) return false;
        else if(Math.abs(l-r)>1) return false;
        return true;
    }
    public int isBalanced2(TreeNode root){
        if(root==null) return 0;
        int l = isBalanced2(root.left);
        int r = isBalanced2(root.right);
        if(l==-1 || r==-1) return -1;
        else if(Math.abs(l-r)>1) return -1;
        else {
            l++;
            r++;
            return Math.max(l,r);
        }

    }
}
