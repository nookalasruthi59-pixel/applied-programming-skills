class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // If both trees reach null at the same time, they are the same
        if(p == null && q == null) return true;

        // If only one of them is null, the trees are not the same
        if(p == null || q == null) return false;

        // If values mismatch, the trees are not the same
        if(p.val != q.val) return false;

        // Recursively check left and right subtrees
        return isSameTree(p.left,q.left) && 
               isSameTree(p.right,q.right);
    }
}