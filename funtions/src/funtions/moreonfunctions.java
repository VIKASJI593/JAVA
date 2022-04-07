package funtions;

public class moreonfunctions {

	public static void main(String[] args) {

		int p = 100;
		if(p > 20) {
		    if(p < 20) {
		        System.out.print("coding");
		    }
		} else {
		    System.out.print("ninjas");
		}

	// WRITING MORE ON FUNCTION
	/*	public static int sum(int a,int b){
		int ans=a+b;
		return ans;
	}

	public static void main(String args[]) {
		int num1=10;
		int num2=16;
		int ans=sum(num1,num2);


		System.out.println(ans);
	}
}
	 */




	//  three value double
	/*	
		public static double sum(int a,int b,double c){
		    double ans=a+b+c;
		    return ans;
		}

		 public static void main(String args[]) {
			 int num1=10;
		      int num2=16;
		      //int ans=sum(num1,num2);

		      double ans=sum(num1,num2,10.5);
		      System.out.println(ans);
		 }
}

	 */


	//  CALL FUNCTIONS BUT NOT COLLECT THE RESULT (IT DOESN'T GIVES ERROR)
	/*	public static double sum(int a,int b,double c){
		double ans=a+b+c;
		return ans;
	}

	public static void main(String args[]) {
		int num1=10;
		int num2=16;

		sum(num1,num2,10.5);
		//	      double ans=sum(num1,num2,10.5);
		//	      System.out.println(ans);
	}
}
	 */



	// PRINT ALL EVEN NUMBERS 1 TO 100
	/*	public static void printEvenNumbers(){
		for(int i=2; i <= 100; i+=2){
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
		printEvenNumbers();
	}
}
	 */



	// EVEN NUMBERS START TO END

	public static void printEvenNumbers(int start,int end){
		if(start%2!=0){
			start++;
		}
		for(int i=start;i<=end;i+=2){
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
		printEvenNumbers(3,17);
	}
}





