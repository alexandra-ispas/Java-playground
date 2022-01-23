package TheCompleteCodingInterviewGuide.TreesAndGraphs.challenge3;

import TheCompleteCodingInterviewGuide.TreesAndGraphs.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Consider you've been given a binary tree. Write a snippet of code that creates
 * a list of elements for each level of the tree (for example, if the tree has a depth of d, then
 * you'll have d lists).
 */
public class ListPerLevel<T> {
    public List<List<T>> listPerLevel(TreeNode<T> root) {
        List<List<T>> result = new ArrayList<> ();

        Queue<TreeNode<T>> thisLevel = new ArrayDeque<> ();
        List<T> aux = new ArrayList<> ();
        aux.add ( root.getData () );

        thisLevel.add ( root );
        while(!thisLevel.isEmpty ()) {
            Queue<TreeNode<T>> prevLevel = thisLevel;
            result.add ( aux );

            aux = new ArrayList<T> ();
            thisLevel = new ArrayDeque<> ();

            for(TreeNode<T> parent : prevLevel) {
                if(parent.left != null) {
                    thisLevel.add ( parent.left );
                    aux.add ( parent.left.getData () );
                }
                if(parent.right != null) {
                    thisLevel.add ( parent.right );
                    aux.add ( parent.right.getData () );
                }
            }
        }
        return result;
    }
}
