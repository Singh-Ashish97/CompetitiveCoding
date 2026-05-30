package org.example;

public class LowestCommonAncestor {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return abc(root,p,q);
    }
    public TreeNode abc(TreeNode root,TreeNode p, TreeNode q){
        if((p.val<=root.val && root.val<=q.val)||(q.val<=root.val && root.val<=p.val)) return root;
        if(p.val==root.val || q.val==root.val) return root;
        if(p.val<=root.val) return abc(root.left,p,q);
        else return abc(root.right,p,q);

    }
}
