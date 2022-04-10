package com.algorithm.leetcode.binarytree;

import com.algorithm.leetcode.binarytree.datatype.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));


        return result;
    }

    public static void main(String[] args) {

    }
}
