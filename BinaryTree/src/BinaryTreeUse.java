

/*
public class BinaryTreeUse {

	//public static void printTree (BinaryTreeNode<Integer> root) {


	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

		BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);

		root.left = rootleft;
		root.right = rootRight;


		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(3);

		rootleft.right = twoRight;
		rootRight.left = threeLeft;

	}

}

 */








// NullPointerException
/*
public class BinaryTreeUse {

	public static void printTree (BinaryTreeNode<Integer> root) {
		// TODO take care of base case
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

		BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);

		root.left = rootleft;
		root.right = rootRight;

		printTree(root);
	}

}

 */






/*
public class BinaryTreeUse {

	public static void printTree (BinaryTreeNode<Integer> root) {
		// TODO take care of base case
		System.out.println(root.data);
		if (root.left != null) {
			printTree(root.left);
		}
		if (root.right != null) {
			printTree(root.right);
		}
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

		BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);

		root.left = rootleft;
		root.right = rootRight;

		printTree(root);
	}

}
 */


//   Detailed 
/*
public class BinaryTreeUse {

	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

		BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);

		root.left = rootleft;
		root.right = rootRight;

		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);

		rootleft.right = twoRight;
		rootRight.left = threeLeft;


		printTreeDetailed (root);
	}

}
 */


//-----------------------------------------take input-------------------------------------

/*
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> TakeTreeInput() {
		System.out.println("Enter root data"); 
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = TakeTreeInput();
		BinaryTreeNode<Integer> rightChild = TakeTreeInput();

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}




	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = TakeTreeInput();
		printTreeDetailed(root);
	}

}

          //output
//Enter root data
//1
//Enter root data
//2
//Enter root data
//-1
//Enter root data
//4
//Enter root data
//-1
//Enter root data
//-1
//Enter root data
//3
//Enter root data
//-1
//Enter root data
//5
//Enter root data
//-1
//Enter root data
//-1
//1:L2, R3
//2:R4
//4:
//3:R5
//5:


 */


/*
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}




	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
	}

}



//  output

//Enter root data
//1
//Enter left child of 1
//2
//Enter left child of 2
//-1
//Enter right child of 2
//4
//Enter left child of 4
//-1
//Enter right child of 4
//-1
//Enter right child of 1
//3
//Enter left child of 3
//-1
//Enter right child of 3
//5
//Enter left child of 5
//-1
//Enter right child of 5
//-1
//1:L2, R3
//2:R4
//4:
//3:R5
//5:

 */


//--------------------------number of nodes----------------------------
/*
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("num nodes " + numNodes(root));
	}

}


//Enter root data
//1
//Enter left child of 1
//2
//Enter left child of 2
//-1
//Enter right child of 2
//-1
//Enter right child of 1
//3
//Enter left child of 3
//4
//Enter left child of 4
//-1
//Enter right child of 4
//-1
//Enter right child of 3
//5
//Enter left child of 5
//-1
//Enter right child of 5
//-1
//1:L2, R3
//2:
//3:L4, R5
//4:
//5:
//num nodes 5

 */



//------------------------------------------Node With Largest Data--------------------------------

/*
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}


	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("num nodes " + numNodes(root));
		System.out.println("Largest " + largest(root));
	}

}


//output
//Enter root data
//1
//Enter left child of 1
//2
//Enter left child of 2
//-1
//Enter right child of 2
//-1
//Enter right child of 1
//4
//Enter left child of 4
//5
//Enter left child of 5
//-1
//Enter right child of 5
//-1
//Enter right child of 4
//3
//Enter left child of 3
//-1
//Enter right child of 3
//-1
//1:L2, R4
//2:
//4:L5, R3
//5:
//3:
//num nodes 5
//Largest 5

 */


//------------------------number of leaves in binary tree-----------------------------------
/*
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		return numLeaves(root.left) + numLeaves(root.right);
	}
	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("num nodes " + numNodes(root));
		System.out.println("Largest " + largest(root));
		System.out.println("num Leaves " + numLeaves(root));
	}

}
 */

//output
//Enter root data
//1
//Enter left child of 1
//-1
//Enter right child of 1
//2
//Enter left child of 2
//-1
//Enter right child of 2
//-1
//1:R2
//2:
//num nodes 2
//Largest 2
//numLeaves 1



//------------------------depth of a node----------------------------------------------------------
/*
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		return numLeaves(root.left) + numLeaves(root.right);
	}

	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return ;
		}
		if (k == 0) {
			System.out.println(root.data);
			return ;
		}

		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("num nodes " + numNodes(root));
		System.out.println("Largest " + largest(root));
		System.out.println("num Leaves " + numLeaves(root));
		System.out.println("print at depth k");
		printAtDepthK(root, 2);
	}

}


//output
//Enter root data
//10
//Enter left child of 10
//5
//Enter left child of 5
//2
//Enter left child of 2
//9
//Enter left child of 9
//-1
//Enter right child of 9
//-1
//Enter right child of 2
//-1
//Enter right child of 5
//-1
//Enter right child of 10
//7
//Enter left child of 7
//8
//Enter left child of 8
//-1
//Enter right child of 8
//-1
//Enter right child of 7
//3
//Enter left child of 3
//-1
//Enter right child of 3
//-1
//10:L5, R7
//5:L2, 
//2:L9, 
//9:
//7:L8, R3
//8:
//3:
//num nodes 7
//Largest 10
//numLeaves 3
//print at depth k
//2
//8
//3
 */




//----------------------remove leaf nodes-----------------------------
/*
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		return numLeaves(root.left) + numLeaves(root.right);
	}

	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return ;
		}
		if (k == 0) {
			System.out.println(root.data);
			return ;
		}

		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}


		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("num nodes " + numNodes(root));
		System.out.println("Largest " + largest(root));
		System.out.println("num Leaves " + numLeaves(root));
		System.out.println("print at depth k");
		printAtDepthK(root, 2);
		BinaryTreeNode<Integer>newRoot = removeLeaves(root);
		printTreeDetailed(newRoot);
	}

}
 */

//output
//Enter root data
//1
//Enter left child of 1
//2
//Enter left child of 2
//-1
//Enter right child of 2
//-1
//Enter right child of 1
//3
//Enter left child of 3
//-1
//Enter right child of 3
//-1
//1:L2, R3
//2:
//3:
//num nodes 3
//Largest 3
//num Leaves 2
//print at depth k
//1:


//---------------------------------------check if binary tree balanced--------------------
/*
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		return numLeaves(root.left) + numLeaves(root.right);
	}



	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return ;
		}
		if (k == 0) {
			System.out.println(root.data);
			return ;
		}

		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1 + Math.max(leftHeight, rightHeight);

	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		boolean isleftBalanced = isBalanced(root.left);
		boolean isrightBalanced = isBalanced(root.right);

		return isleftBalanced && isrightBalanced;
	}

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}


		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("num nodes " + numNodes(root));
		System.out.println("Largest " + largest(root));
		System.out.println("num Leaves " + numLeaves(root));
		System.out.println("print at depth k");
		printAtDepthK(root, 2);
		System.out.println("is balanced " + isBalanced(root));
	}

}



// output balanced
//Enter root data
//1
//Enter left child of 1
//2
//Enter left child of 2
//-1
//Enter right child of 2
//-1
//Enter right child of 1
//3
//Enter left child of 3
//-1
//Enter right child of 3
//-1
//1:L2, R3
//2:
//3:
//num nodes 3
//Largest 3
//num Leaves 2
//print at depth k
//is balanced true

// output is balanced false
//Enter root data
//3
//Enter left child of 3
//2
//Enter left child of 2
//3
//Enter left child of 3
//4
//Enter left child of 4
//-1
//Enter right child of 4
//-1
//Enter right child of 3
//5
//Enter left child of 5
//-1
//Enter right child of 5
//6
//Enter left child of 6
//-1
//Enter right child of 6
//7
//Enter left child of 7
//-1
//Enter right child of 7
//-1
//Enter right child of 2
//-1
//Enter right child of 3
//-1
//3:L2, 
//2:L3, 
//3:L4, R5
//4:
//5:R6
//6:R7
//7:
//num nodes 7
//Largest 7
//num Leaves 2
//print at depth k
//3
//is balanced false

 */


//-------------------------------------BALANCED BETER------------------------------------
/*
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		return numLeaves(root.left) + numLeaves(root.right);
	}



	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return ;
		}
		if (k == 0) {
			System.out.println(root.data);
			return ;
		}

		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1 + Math.max(leftHeight, rightHeight);

	}
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}

		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);

		if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;
		}
		if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		boolean isleftBalanced = isBalanced(root.left);
		boolean isrightBalanced = isBalanced(root.right);

		return isleftBalanced && isrightBalanced;
	}

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}


		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("num nodes " + numNodes(root));
		System.out.println("Largest " + largest(root));
		System.out.println("num Leaves " + numLeaves(root));
		System.out.println("print at depth k");
		printAtDepthK(root, 2);
		System.out.println("is balanced " + isBalancedBetter(root).isBalanced);
	}

}


// output

//Enter root data
//1
//Enter left child of 1
//2
//Enter left child of 2
//3
//Enter left child of 3
//4
//Enter left child of 4
//-1
//Enter right child of 4
//-1
//Enter right child of 3
//-1
//Enter right child of 2
//-1
//Enter right child of 1
//5
//Enter left child of 5
//-1
//Enter right child of 5
//6
//Enter left child of 6
//-1
//Enter right child of 6
//7
//Enter left child of 7
//-1
//Enter right child of 7
//-1
//1:L2, R5
//2:L3, 
//3:L4, 
//4:
//5:R6
//6:R7
//7:
//num nodes 7
//Largest 7
//num Leaves 2
//print at depth k
//3
//6
//is balanced false

 */




//--------------------------LEVELWISE INPUT BINARY TREE--------------------------------

/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		return numLeaves(root.left) + numLeaves(root.right);
	}



	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return ;
		}
		if (k == 0) {
			System.out.println(root.data);
			return ;
		}

		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1 + Math.max(leftHeight, rightHeight);

	}
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}

		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);

		if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;
		}
		if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		boolean isleftBalanced = isBalanced(root.left);
		boolean isrightBalanced = isBalanced(root.right);

		return isleftBalanced && isrightBalanced;
	}

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}


		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}

	public static BinaryTreeNode<Integer> takeInputLevelWise (){
		Scanner S = new Scanner(System.in);
		System.out.println("enter root data");
		int rootData = S.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> PendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		PendingChildren.add(root);

		while(!PendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = PendingChildren.poll();
			System.out.println("Enter left child of" + front.data);
			int left = S.nextInt();
			if (left != -1) {

				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				PendingChildren.add(leftChild);
			}

			System.out.println("Enter right child of" + front.data);
			int right = S.nextInt();
			if (right != -1) {

				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				PendingChildren.add(rightChild);
			}

		}
		return root;
	}


	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
		printTreeDetailed(root);
		System.out.println("num nodes " + numNodes(root));
		System.out.println("Largest " + largest(root));
		System.out.println("num Leaves " + numLeaves(root));
		System.out.println("print at depth k");
		printAtDepthK(root, 2);
		System.out.println("is balanced " + isBalancedBetter(root).isBalanced);
	}

}


//output
//Enter root data
//1
//Enter left child of 1
//2
//Enter left child of 2
//4
//Enter left child of 4
//-1
//Enter right child of 4
//-1
//Enter right child of 2
//-1
//Enter right child of 1
//3
//Enter left child of 3
//-1
//Enter right child of 3
//5
//Enter left child of 5
//-1
//Enter right child of 5
//-1
//1:L2, R3
//2:L4, 
//4:
//3:R5
//5:
//num nodes 5
//Largest 5
//num Leaves 2
//print at depth k
//4
//5
//is balanced true

 */


//------------------------------Build Tree Using Inorder And Preorder
/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		return numLeaves(root.left) + numLeaves(root.right);
	}



	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return ;
		}
		if (k == 0) {
			System.out.println(root.data);
			return ;
		}

		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1 + Math.max(leftHeight, rightHeight);

	}
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}

		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);

		if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;
		}
		if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		boolean isleftBalanced = isBalanced(root.left);
		boolean isrightBalanced = isBalanced(root.right);

		return isleftBalanced && isrightBalanced;
	}

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}


		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}

	public static BinaryTreeNode<Integer> takeInputLevelWise (){
		Scanner S = new Scanner(System.in);
		System.out.println("enter root data");
		int rootData = S.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> PendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		PendingChildren.add(root);

		while(!PendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = PendingChildren.poll();
			System.out.println("Enter left child of" + front.data);
			int left = S.nextInt();
			if (left != -1) {

				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				PendingChildren.add(leftChild);
			}

			System.out.println("Enter right child of" + front.data);
			int right = S.nextInt();
			if (right != -1) {

				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				PendingChildren.add(rightChild);
			}

		}
		return root;
	}
	public static BinaryTreeNode<Integer> buildTreeFromPreInHelper (int [] pre, int [] in, int siPre, int eiPre, int siIn, int eiIn){
		if (siPre > eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		int rootIndex = -1;
		for (int i = siIn; i <= eiIn; i++) {
			if (in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		int siPreLeft = siPre + 1;
		int siInleft = siIn;

		int eiInleft = rootIndex -1;

		int siInRight = rootIndex +1;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;

		int leftSubTreeLength = eiInleft - siInleft +1;
		int eiPreLeft = siPreLeft + leftSubTreeLength - 1;
		int siPreRight = eiPreLeft + 1;

		BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInleft, eiInleft);
		BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);

		root.left = left;
		root.right = right;
		return root;
	}

	public static BinaryTreeNode<Integer>  buildTreeFromPreIn(int pre[], int in[]){

		BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre, in, 0, pre.length-1, 0, in.length-1);
		return root;
	}

	public static void main(String[] args) {

		int in[] = {4,2,5,1,3};
		int pre[] = {1,2,4,5,3};
		BinaryTreeNode<Integer>root = buildTreeFromPreIn(pre,in);
		printTreeDetailed(root);
	}

}
 */

// output

//1:L2, R3
//2:L4, R5
//4:
//5:
//3:


//--------------------------------------binary search tree------------------------------------


/*

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		return numLeaves(root.left) + numLeaves(root.right);
	}



	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return ;
		}
		if (k == 0) {
			System.out.println(root.data);
			return ;
		}

		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1 + Math.max(leftHeight, rightHeight);

	}
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}

		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);

		if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;
		}
		if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		boolean isleftBalanced = isBalanced(root.left);
		boolean isrightBalanced = isBalanced(root.right);

		return isleftBalanced && isrightBalanced;
	}

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}


		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}

	public static BinaryTreeNode<Integer> takeInputLevelWise (){
		Scanner S = new Scanner(System.in);
		System.out.println("enter root data");
		int rootData = S.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> PendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		PendingChildren.add(root);

		while(!PendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = PendingChildren.poll();
			System.out.println("Enter left child of" + front.data);
			int left = S.nextInt();
			if (left != -1) {

				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				PendingChildren.add(leftChild);
			}

			System.out.println("Enter right child of" + front.data);
			int right = S.nextInt();
			if (right != -1) {

				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				PendingChildren.add(rightChild);
			}

		}
		return root;
	}
	public static BinaryTreeNode<Integer> buildTreeFromPreInHelper (int [] pre, int [] in, int siPre, int eiPre, int siIn, int eiIn){
		if (siPre > eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		int rootIndex = -1;
		for (int i = siIn; i <= eiIn; i++) {
			if (in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		int siPreLeft = siPre + 1;
		int siInleft = siIn;

		int eiInleft = rootIndex -1;

		int siInRight = rootIndex +1;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;

		int leftSubTreeLength = eiInleft - siInleft +1;
		int eiPreLeft = siPreLeft + leftSubTreeLength - 1;
		int siPreRight = eiPreLeft + 1;

		BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInleft, eiInleft);
		BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);

		root.left = left;
		root.right = right;
		return root;
	}

	public static BinaryTreeNode<Integer>  buildTreeFromPreIn(int pre[], int in[]){

		BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre, in, 0, pre.length-1, 0, in.length-1);
		return root;
	}


	public static boolean searchBST(BinaryTreeNode<Integer> root, int data) {
		if (root == null) {
			return false;
	}
	if (root.data == data) {
		return true;
	}
	if (data < root.data) {
		return searchBST(root.left, data);
	}
	return searchBST(root.right, data);
}

public static void main(String[] args) {


	int in[] = {1,2,3,4,5,6,7};
	int pre[] = {4,2,1,3,6,5,7};
	BinaryTreeNode<Integer>root = buildTreeFromPreIn(pre,in);
	printTreeDetailed(root);
}

}


//  OUTPUT

//4:L2, R6
//2:L1, R3
//1:
//3:
//6:L5, R7
//5:
//7:


 */


/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

		if (isRoot) {
			System.out.println("Enter root data"); 
		}else {

			if (isLeft) {
				System.out.println("Enter left child of " + parentData); 

			}else {
				System.out.println("Enter right child of " + parentData); 

			}
		}
		Scanner S = new Scanner(System.in);
		int rootData = S.nextInt();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

		root.left = leftChild;
		root.right = rightChild;
		return root;

	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);

		printTree(root.left);
		printTree(root.right);
	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);

		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		return numLeaves(root.left) + numLeaves(root.right);
	}



	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return ;
		}
		if (k == 0) {
			System.out.println(root.data);
			return ;
		}

		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1 + Math.max(leftHeight, rightHeight);

	}
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}

		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);

		if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
			isBal = false;
		}
		if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		boolean isleftBalanced = isBalanced(root.left);
		boolean isrightBalanced = isBalanced(root.right);

		return isleftBalanced && isrightBalanced;
	}

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}


		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}

	public static BinaryTreeNode<Integer> takeInputLevelWise (){
		Scanner S = new Scanner(System.in);
		System.out.println("enter root data");
		int rootData = S.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> PendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		PendingChildren.add(root);

		while(!PendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = PendingChildren.poll();
			System.out.println("Enter left child of" + front.data);
			int left = S.nextInt();
			if (left != -1) {

				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				PendingChildren.add(leftChild);
			}

			System.out.println("Enter right child of" + front.data);
			int right = S.nextInt();
			if (right != -1) {

				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right = rightChild;
				PendingChildren.add(rightChild);
			}

		}
		return root;
	}
	public static BinaryTreeNode<Integer> buildTreeFromPreInHelper (int [] pre, int [] in, int siPre, int eiPre, int siIn, int eiIn){
		if (siPre > eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		int rootIndex = -1;
		for (int i = siIn; i <= eiIn; i++) {
			if (in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		int siPreLeft = siPre + 1;
		int siInleft = siIn;

		int eiInleft = rootIndex -1;

		int siInRight = rootIndex +1;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;

		int leftSubTreeLength = eiInleft - siInleft +1;
		int eiPreLeft = siPreLeft + leftSubTreeLength - 1;
		int siPreRight = eiPreLeft + 1;

		BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(pre, in, siPreLeft, eiPreLeft, siInleft, eiInleft);
		BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);

		root.left = left;
		root.right = right;
		return root;
	}

	public static BinaryTreeNode<Integer>  buildTreeFromPreIn(int pre[], int in[]){

		BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(pre, in, 0, pre.length-1, 0, in.length-1);
		return root;
	}


	public static boolean searchBST(BinaryTreeNode<Integer> root, int data) {
		if (root == null) {
			return false;
		}
		if (root.data == data) {
			return true;
		}
		if (data < root.data) {
			return searchBST(root.left, data);
		}
		return searchBST(root.right, data);
	}
	public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
		if (root == null) {
			return;
		}
		if (root.data < k1) {
			printBetweenK1K2(root.right,k1 ,k2);

		}else if (root.data < k2) {
			printBetweenK1K2(root.left,k1 ,k2);

		}else {

			System.out.println(root.data);
			printBetweenK1K2(root.left,k1 ,k2);
			printBetweenK1K2(root.right,k1 ,k2);

		}	
	}
	public static int minimum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MAX_VALUE;	
		}
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.left);
		return Math.min(root.data, Math.min(leftMin, rightMin));
	}
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;	
		}
		int leftMax = largest(root.left);
		if (leftMax >=root.data) {

			return false;
		}
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		return isLeftBST && isRightBST;
	}

	public static void main(String[] args) {

//      true output
//		int in[] = {1,2,3,4,5,6,7};
//		int pre[] = {4,2,1,3,6,5,7};
		
		//false output
		int in[] = {1,2,3,4,50,6,7};
		int pre[] = {4,2,1,3,6,50,7};
		
		BinaryTreeNode<Integer>root = buildTreeFromPreIn(pre,in);
		printTreeDetailed(root);
		
		System.out.println(searchBST(root, 30));
		System.out.println(isBST(root));
	}

}


// output true

//4:L2, R6
//2:L1, R3
//1:
//3:
//6:L5, R7
//5:
//7:
//false
//true


//output false

//4:L2, R6
//2:L1, R3
//1:
//3:
//6:L50, R7
//50:
//7:
//false
//false
*/


