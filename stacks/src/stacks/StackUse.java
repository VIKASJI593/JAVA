package stacks;

public class StackUse {

	public static void main(String[] args) throws StackEmptyException, StackEmptyException, StackFullException {
		
		StackUsingArray stack = new StackUsingArray();
		//stack.data[1] = 100;
		stack.push(10);
		//stack.top();
		System.out.println(stack.top());
		stack.pop();
		stack.size();
		//stack.isEmpty();
		System.out.println(stack.isEmpty());
	}

}
