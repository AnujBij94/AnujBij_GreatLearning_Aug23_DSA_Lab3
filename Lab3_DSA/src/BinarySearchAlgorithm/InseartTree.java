package BinarySearchAlgorithm;

import java.util.HashSet;

public class InseartTree {


	public Node inseart(Node root, int i) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return new Node(i);
		if(i< root.data)
			root.left= inseart(root.left, i);
		else
			root.right= inseart(root.right,i);
		return root;
		
	}
	
	
	public boolean findpair(Node root, int sum,
			HashSet<Integer> set)
	{
		if (root == null)
			return false;

		if (findpair(root.left, sum, set))
			return true;

		if (set.contains(sum - root.data)) {
			System.out.println("Pair is found ("
					+ (sum - root.data) + ", "
					+ root.data + ")");
			return true;
		}
		else
			set.add(root.data);

		return findpair(root.right, sum, set);
	}

	public void findPairToMatchGivenSum(Node root, int sum)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findpair(root, sum, set))
			System.out.print("Pairs does not exist"
					+ "\n");
	}
	
	

}
