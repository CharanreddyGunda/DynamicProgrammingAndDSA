package com.tekworks.day5;


//701. Insert into a Binary Search Tree
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class InsertIntoBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) {
            return new TreeNode(val);
        }
        TreeNode temp = root;
        while(temp != null) {
            if( val > temp.val) {
                if(temp.right ==null) {
                    TreeNode node = new TreeNode(val);
                    temp.right = node;
                    return root;
                    
                }
                temp = temp.right;
            }
            else{
                if(temp.left ==null) {
                    TreeNode node = new TreeNode(val);
                    temp.left = node;
                    return root;
                }
                temp = temp.left;
            }
        }
        return root;
    }
}

