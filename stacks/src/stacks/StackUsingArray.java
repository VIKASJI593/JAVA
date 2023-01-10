package stacks;

public class StackUsingArray {


	private int data[];
	private int topIndex;
	
	public StackUsingArray() {
		data= new int[10];
		topIndex = 0;
	}
	public int size() {
		return topIndex;
	}
	public boolean isEmpty()
	{
//	if(topIndex == -1)
//		return true;
//	{else}
//	return false;
//	{
		return topIndex == 0;
	}
	public void push(int elem) throws StackFullException {
		// if stack is full
		if(topIndex == data.length -1) {
			// StackFullException e = new StackFullException();
			//throe e;
			throw new StackFullException();
			// Throw Exception
		}
		data[++topIndex] = elem;
	}
	public int top() throws StackEmptyException{
		if (topIndex == 0) {
			//throw StackEmptyException
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
	public int pop() throws StackEmptyException{
		if (topIndex == 0) {
			//throw StackEmptyException
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}
}







