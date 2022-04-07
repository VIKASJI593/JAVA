package vikas;

import java.util.Scanner;

/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/
public class Solution {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
	return sumofArray(input,0) ;
		
	}
    
    public static int sumofArray(int[] arr,int startIndex) {
		
        if(startIndex == arr.length){
            return 0;
        }
        int smallSum = sumofArray(arr,startIndex+1);
        int mySum = smallSum+arr[startIndex];
        return mySum;
    }
}
class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(Solution.sum(input));
	}
}