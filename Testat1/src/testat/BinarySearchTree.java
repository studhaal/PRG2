/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testat;

/**
 *
 * @author studhaal
 */
public class BinarySearchTree {
    private int key;
    private BinarySearchTree left, right;
    
    public void inorder(BinarySearchTree node)
    {
        if(node!=null)
        {
            inorder(node.left);
            System.out.print(node.key);
            inorder(node.right);
        }
    }
}
