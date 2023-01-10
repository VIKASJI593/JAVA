package loops;
import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		
		//  LargestOfTwo (Basics of Conditionals)
		/*
		Scanner s=new Scanner(System.in);
	      int a,b;
	      a=s.nextInt();
	      b=s.nextInt();
	      if(a>b){
	          System.out.println("First num is greater");
	      }else{
	          System.out.println("Second num is greater");
	      }
	}
}
		
	*/	
		
		
		
		// outside
		/*
		Scanner s=new Scanner(System.in);
	      int a,b;
	      a=s.nextInt();
	      b=s.nextInt();
	      if(a>b){
	          System.out.println("First num is greater");
	      }else{
	          System.out.println("Second num is greater");
	      }
	      System.out.println("Outside if else");
	    }
	}

*/
		// even or odd
	/*	
		Scanner s=new Scanner(System.in);
	      int a;
	      a=s.nextInt();
	      int rem = a%2;
	      boolean result = rem == 0;
	      if (result == true) {
	      
	      
	          System.out.println(a + " is even");
	      }else{
	          System.out.println(a + " is odd");
	      }
	}
}
	      
	      */
	      
	      
	      
	      //even or odd 2nd method
		/*
		Scanner s=new Scanner(System.in);
	      int a;
	      a=s.nextInt();
	      int rem = a%2;
	      boolean result = rem == 0;
	      if (a % 2 == 0) {
	      
	      
	          System.out.println(a + " is even");
	      }else{
	          System.out.println(a + " is odd");
	      }
	}
}
	      
	*/
		
		
		
		
		// skip if else
		
		Scanner s=new Scanner(System.in);
	      int a;
	      a=s.nextInt();
	     
	      if (a % 2 == 0) {
	      
	          System.out.println(a + " is even");
	      }
	      if (a % 2 != 0) {
	          System.out.println(a + " is odd");
	      }
	}
}
	  

