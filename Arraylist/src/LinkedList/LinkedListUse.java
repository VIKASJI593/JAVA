package LinkedList;

import LinkedList.MyLinkedList.Node;

public class LinkedListUse {

	/*
	 public void printList(Node<Integer> headNode)
	    {
	        if(headNode == null)
	        {
	            return;
	        }

	        Node<Integer> temp = headNode;

	        while(temp != null)
	        {
	            System.out.print(temp.data +" ");
	            temp = temp.next;
	        }
	    }

	    public void increment(Node<Integer> headNode)
	    {
	        headNode.data++;
	    }

	    public static void main(String[] args){
	    	{
	        Node<Integer> n1 = new Node<>(10);
	        Node<Integer> n2 = new Node<>(20);
	        Node<Integer> n3 = new Node<>(30);

	        n1.next = n2;
	        n2.next = n3;

	        MyLinkedList LL = new MyLinkedList();
	        LL.increment(n1);
	        LL.printList(n1);
	    }
	}

	 */








	/*
	public static void main(String[] args) {

		Node<Integer>n1 = new Node<>(10);

		System.out.println(n1);
		System.out.println(n1.data);
		System.out.println(n1.next);
	}
	}

	 */




	/*
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);
		Node<Integer>n4 = new	Node<>(40);

		n1.next = n2;
		System.out.println("n1 "+n1+ "data"+n1.data+"next"+n1.next);

		n2.next = n3;
		System.out.println("n2"+n2+"data"+n2.data+"next"+n2.next);

		n3.next = n4;
		System.out.println("n3"+n3+"data"+n3.data+"next"+n3.next);

		System.out.println("n4"+n4+"data"+n4.data+"next"+n4.next);

		return n1;

	}
	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
	}

}
	 */


	// main

	/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);
		Node<Integer>n4 = new	Node<>(40);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;

	}
	public static void print(Node<Integer> head) {
		//Node<Integer> head =CreateLinkedList();
		System.out.println("print " + head);
		//		System.out.println(head.data);
		//		System.out.println(head.next);
		//		System.out.println(head.next.data);
		//		System.out.println(head.next.next.data);
	}
	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		System.out.println("main " + head);
		print(head);
	}
}


//output
//main LinkedList.Node@626b2d4a
//print LinkedList.Node@626b2d4a

	 */



	/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);
		Node<Integer>n4 = new	Node<>(40);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;

	}
	public static void print(Node<Integer>head) {
		//Node<Integer> head =CreateLinkedList();
		System.out.println("print" +head);
		System.out.println(head.data);
		System.out.println(head.next);
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
	}
	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		print (head);
	}
}

	 */

	//output
	//printLinkedList.Node@626b2d4a
	//10
	//LinkedList.Node@5e265ba4
	//20
	//30


	/*

	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);
		Node<Integer>n4 = new	Node<>(40);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;

	}
	public static void print(Node<Integer>head) {
		while (head !=null) {

			System.out.println(head.data);
			head = head.next;
		}
	}
	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		print (head);
	}
}

	 */


	// print in single line
	//   10 20 30 40
	/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);
		Node<Integer>n4 = new	Node<>(40);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;

	}
	public static void print(Node<Integer>head) {
		while (head != null) {

			System.out.print(head.data+" ");
			head = head.next;
		}
			System.out.println();
		}

	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		print (head);
	}
}
	 */



	// when while loop head.next != null  this remove last word

	// output  10 20 30 
	/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);
		Node<Integer>n4 = new	Node<>(40);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;

	}
	public static void print(Node<Integer>head) {
		while (head.next != null) {

			System.out.print(head.data+" ");
			head = head.next;
		}
			System.out.println();
		}

	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		print (head);
	}
}
	 */





	//head != null         no ipmact
	//  10 20 30
	/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);


		n1.next = n2;
		n2.next = n3;

		return n1;

	}
	public static void print(Node<Integer>head) {
		while (head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		print (head);
	}
}

	 */




	// head.next   when while (head != null)   it remove first word
	// output  20 30
	/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);


		n1.next = n2;
		n2.next = n3;

		return n1;

	}
	public static void print(Node<Integer>head) {
		while (head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		print (head.next);
	}
}
	 */




	// head.next.next   when while (head != null)   it remove first  and 2nd word
	// output  30
	/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);


		n1.next = n2;
		n2.next = n3;

		return n1;

	}
	public static void print(Node<Integer>head) {
		while (head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		print (head.next.next);
	}
}
	 */










	//  20 30  remove head (10)
	/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);


		n1.next = n2;
		n2.next = n3;

		return n1;

	}
	public static void print(Node<Integer>head) {
		while (head != null) {

			System.out.print(head.data+" ");
			head = head.next;
		}
			System.out.println();
		}

	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		print (head.next);
	}
}

	 */



	// no change twice the while loop
	/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);


		n1.next = n2;
		n2.next = n3;

		return n1;

	}
	public static void print(Node<Integer>head) {
		while (head != null) {

			System.out.print(head.data+" ");
			head = head.next;
		}

			System.out.println();
			while (head != null) {

				System.out.print(head.data+" ");
				head = head.next;
			}
		}

	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		print (head);
	}
}

	 */	



	//print twice
	// output
	//	10 20 30 
	//	10 20 30

	/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);


		n1.next = n2;
		n2.next = n3;

		return n1;

	}
	public static void print(Node<Integer>head) {
		while (head != null) {

			System.out.print(head.data+" ");
			head = head.next;
		}

			System.out.println();
			while (head != null) {

				System.out.print(head.data+" ");
				head = head.next;
			}
		}

	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		print (head);
		print (head);  //print twice

	}
}

	 */




   //increment try

	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);


		n1.next = n2;
		n2.next = n3;

		return n1;

	}
	public static void increment(Node<Integer>head) {
//		Node<Integer> temp = head;
//		while (temp != null) {
//			System.out.print(head.data+" ");
//			head = head.next;
		head.data++;
		}

		
	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		increment (head);
		print (head);  

	}
}








//--------------------error------------------

/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);


		n1.next = n2;
		n2.next = n3;

		return n1;

	}
	public static void incement(Node<Integer>head) {
		head.data++;
	}
//		while (head != null) {
//
//			System.out.print(head.data+" ");
//			head = head.next;
//		}
//		
//			System.out.println();
//			while (head != null) {
//
//				System.out.print(head.data+" ");
//				head = head.next;
//			}
//		}
//	
	public static void main(String[] args) {
		Node<Integer> head = CreateLinkedList();
		incement (head);
		print(head);

	}
}
 */






/*
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);
		Node<Integer>n4 = new	Node<>(40);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;

	}
	public static void incement(Node<Integer>head) {
		head.data++;
	}
	//public static void print(Node<Integer>head) {
	//Node<Integer> head =CreateLinkedList();
	//		System.out.println("print" +head);
	//		System.out.println(head.data);
	//		System.out.println(head.next);
	//		System.out.println(head.next.data);
	//		System.out.println(head.next.next.data);


	public static void main(String[] args) {
		Node<Integer> head = CreateLinkedList();
		incement (head);
		print(head);

	}
}

 */












//----------------------ta ashish ---------increment-------------------------------
/*
    public void printList(Node<Integer> headNode)
    {
        if(headNode == null)
        {
            return;
        }

        Node<Integer> temp = headNode;

        while(temp != null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public void increment(Node<Integer> headNode)
    {
        Node<Integer> temp = headNode;
        while(temp != null)
        {
            temp.data++;
            temp = temp.next;
        }

    }

    public static void main(String[] args)
    {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);

        n1.next = n2;
        n2.next = n3;

        LinkedListUse LL = new LinkedListUse();
        LL.increment(n1);
        LL.printList(n1);
    }
}

 */
	
	
	
	
	/*
	
	public static Node<Integer>CreateLinkedList(){
		Node<Integer>n1;
		n1=new	Node<>(10);
		Node<Integer>n2 = new	Node<>(20);
		Node<Integer>n3 = new	Node<>(30);
		Node<Integer>n4 = new	Node<>(40);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;

	}
	public static void print(Node<Integer> head) {
		//Node<Integer> head =CreateLinkedList();
		System.out.println("print " + head);
		//		System.out.println(head.data);
		//		System.out.println(head.next);
		//		System.out.println(head.next.data);
		//		System.out.println(head.next.next.data);
	}
	public static void main(String[] args) {
		Node<Integer> head =CreateLinkedList();
		System.out.println("main " + head);
		print(head);
	}
}

	*/
	
	
	
	
	
	
	
	
	