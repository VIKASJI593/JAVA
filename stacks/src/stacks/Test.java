package stacks;
import java.util.Stack;

public class Test {

	 public static void main (String[] args) {
	        Stack<Integer> stack=new Stack<Integer>();
	        while(stack.isEmpty())
	        {
	            stack.push(10);
	        }
	        System.out.print(stack.pop()+" "+stack.size());
	    }
	}