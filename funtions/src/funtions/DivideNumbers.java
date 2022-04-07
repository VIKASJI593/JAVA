package funtions;

public class DivideNumbers {

	public static double add(int a,int b)
	{
	    float c=a+b;
	    return c;
	}
	public static void main (String[] args) {
	    System.out.print(add(10,3));
	}
}

	// Division by Zero is not allowed  NO EFFECT ON IF ELSE

/*	public static int divideNumbers(int num,int deno){
		if(deno==0){
			return Integer.MIN_VALUE;
		}
		System.out.println("Inside division function");
		return num/deno;
	}

	public static void printDivisionResult(int num,int deno){
		if(deno==0){
			//Exit the function
			System.out.println("Division by Zero is not allowed");
			return;
		}
		System.out.println(num/deno);
	}
		public static void main(String args[]) {
			int num=8;
			int deno=0;

			printDivisionResult(num,deno);
			int result=divideNumbers(num,deno);
			if(result > 0){

			}else{
				
			}
			//	System.out.println(result);
		}
	}
	
	*/
	
	
	
	
	
	
	//Division by Zero is not allowed
/*
	public static int divideNumbers(int num,int deno){
		if(deno==0){
			return Integer.MIN_VALUE;
		}
		System.out.println("Inside division function");
		return num/deno;
	}

	public static void printDivisionResult(int num,int deno){
		if(deno==0){
			//Exit the function
			System.out.println("Division by Zero is not allowed");
			return;
		}
		System.out.println(num/deno);
	}
		public static void main(String args[]) {
			int num=8;
			int deno=0;

			printDivisionResult(num,deno);
			//		int result=divideNumbers(num,deno);
			//
			//		System.out.println(result);
		}
	}
	
*/

	//  NO OUTPUT
	/*
	public static int divideNumbers(int num,int deno){
		if(deno==0){
			return Integer.MIN_VALUE;
		}
		System.out.println("Inside division function");
		return num/deno;
	}

	public static void printDivisionResult(int num,int deno){
		if(deno==0){
			//Exit the function
			
			return;
		}
		System.out.println(num/deno);
	}
		public static void main(String args[]) {
			int num=8;
			int deno=0;

			printDivisionResult(num,deno);
			//		int result=divideNumbers(num,deno);
			//
			//		System.out.println(result);
		}
	}
	
	*/

	
	
	
  	
	// INSIDE DIVISION FUNCTION  (Inside division function  2)
	/*
	public static int divideNumbers(int num,int deno){
		if(deno==0){
			return Integer.MIN_VALUE;
		}
		System.out.println("Inside division function");
		return num/deno;
	}
	public static void main(String args[]) {
		int num=8;
		int deno=4;

		int result=divideNumbers(num,deno);

		System.out.println(result);
	}
}

	 */





	// INSIDE DIVISION FUNCTION GIVES SAME VALUE  -2147483648
	/*
	 public static int divideNumbers(int num,int deno){
	if(deno==0){
		return Integer.MIN_VALUE;
	}
	System.out.println("Inside division function");
	return num/deno;
}
public static void main(String args[]) {
	int num=8;
	int deno=0;

	int result=divideNumbers(num,deno);

	System.out.println(result);
}
}

	 */




	// DIVIDE BY ZERO MIN VALUE    -2147483648
	/*
		public static int divideNumbers(int num,int deno){
		if(deno==0){
			return Integer.MIN_VALUE;
		}
		return num/deno;
	}
	public static void main(String args[]) {
		int num=8;
		int deno=0;

		int result=divideNumbers(num,deno);

		System.out.println(result);
	}
}
	 */



	//  DIVIDE BY ZERO  
	/*	
	  public static int divideNumbers(int num,int deno){
		return num/deno;
	}
	public static void main(String args[]) {
		int num=8;
		int deno=0;

		int result=divideNumbers(num,deno);

		System.out.println(result);
	}
}

	 */




	// DIVIDE NUMBERS   2
	/*
	  	public static int divideNumbers(int num,int deno){
		return num/deno;
	}
	public static void main(String args[]) {
		int num=8;
		int deno=4;

		int result=divideNumbers(num,deno);

		System.out.println(result);
	}
}
	 */



