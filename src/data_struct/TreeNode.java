package data_struct;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	
	int value;
	int branches;
	List<TreeNode> branchesList = new ArrayList<TreeNode>();
	
	
	public void addBranch(){
		
	}
	
	public void deleteBranch(){
		
	}
	
	
	
}
/*
package hackerrank;
//WC.java
import java.io.*;

public class SimilarPairs {
	public static void main (String [] args) throws IOException
	{
	   int ch;
	   TreeNode root = null;
	   // Read each character from standard input until a letter
	   // is read. This letter indicates the start of a word.
	   while ((ch = System.in.read ()) != -1)
	   {
	      // If character is a letter then start of word detected.
	      if (Character.isLetter ((char) ch))
	      {
	          // Create StringBuffer object to hold word letters.
	          StringBuffer sb = new StringBuffer ();
	          // Place first letter character into StringBuffer object.
	          sb.append ((char) ch);
	          // Place all subsequent letter characters into StringBuffer
	          // object.
	          do
	          {
	             ch = System.in.read ();
	             if (Character.isLetter ((char) ch))
	                 sb.append ((char) ch);
	             else
	                 break;
	          }
	          while (true);
	          // Insert word into tree.
	          if (root == null)
	              root = new TreeNode (sb.toString ());
	          else
	              root.insert (sb.toString ());
	      }
	   }
	   display (root);
	}

static void display (TreeNode root)
{
 // If either the root node or the current node is null,
 // signifying that a leaf node has been reached, return.
 if (root == null)
     return;
 // Display all left-most nodes (i.e., nodes whose words
 // precede words in the current node).
 display (root.left);
 // Display current node's word and count.
 System.out.println ("Word = " + root.word + ", Count = " +
                     root.count);
 // Display all right-most nodes (i.e., nodes whose words
 // follow words in the current node).
 display (root.right);
}
}

class TreeNode
{
String word;         // Word being stored.
int count = 1;       // Count of words seen in text.
TreeNode left;       // Left subtree reference.
TreeNode right;      // Right subtree reference.
public TreeNode (String word)
{
 this.word = word;
 left = right = null;
}
public void insert (String word)
{
 int status = this.word.compareTo (word);
 if (status > 0) // word argument precedes current word
 {   
     // If left-most leaf node reached, then insert new node as 
     // its left-most leaf node. Otherwise, keep searching left.
     if (left == null)
         left = new TreeNode (word);
     else
         left.insert (word);
 }
 else
 if (status < 0) // word argument follows current word   
 {
     // If right-most leaf node reached, then insert new node as
     // its right-most leaf node. Otherwise, keep searching right.
     if (right == null)
         right = new TreeNode (word);
     else
         right.insert (word);
 }
 else
     this.count++;
}
}

*/