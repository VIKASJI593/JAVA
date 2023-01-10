package funtions;
import java.util.Scanner;

public class checkprime {

// check prime (return)
	/*	
	public static boolean checkPrime(int n){
	    int div=2;

	    while(div<=n/2){
	        if(n%div==0){
	            //Not Prime
	            return false;
	        }
	        div=div+1;
	    }
	    return true;
	}
	    public static void main(String args[]) {
	        int n;
	     Scanner s=new Scanner(System.in);
	      n=s.nextInt();
	     boolean isPrime=checkPrime(n);
	     System.out.println(isPrime);


	}
}
	 */


	
	
	// check prime2 break
	public static boolean checkPrime2(int n){

		int div=2;
		boolean isPrime=true;
		while(div <= n/2){
			if(n % div ==0){
				//Not prime
				isPrime = false;
				break;
			}
			div = div + 1;
		}

		if(isPrime){
			//System.out.println("prime");
			return true;
		}else{
			//System.out.println("composite");
			return false;
		}
	}                          

	public static void main(String args[]) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		boolean isPrime = checkPrime2(n);
		System.out.println(isPrime);
	}
}


