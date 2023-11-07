package BinarySearchMain;

import java.util.*;

import BinarySearchAlgorithm.InseartTree;
import BinarySearchAlgorithm.Node;

public class BinarySearchMain {
	
	public static void main(String[] args) {
		
		
		// store an binary search tree into memory
		
		Node root = null;
		
		
		InseartTree value = new InseartTree();
		
		root = value.inseart(root, 40);
		root= value.inseart(root, 20);
		root = value.inseart(root, 60);
		root= value.inseart(root, 10);
		root = value.inseart(root, 30);
		root= value.inseart(root, 50);
		root = value.inseart(root, 70);
		
		// declare sum values whose pair need to be searched inside the tree
		
		int sum = 140;
		
		// function to search for the sum 
		
		value.findPairToMatchGivenSum(root, sum);
		
		
	}
	
}
