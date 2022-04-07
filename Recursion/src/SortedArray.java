import java.util.Scanner;

public class SortedArray {

	
	/*
	 public static int fact(int n){
	        if(n==0){
	            return 1;
	        }
	        int smallOutput=fact(n-1);
	        int output=n*smallOutput;
	        return output;
	        
	    }
	    public static int sumn(int n){
	        if(n==0){
	            return 0;
	        }
	        int smallOutput=sumn(n-1);
	        int output=n+smallOutput;
	        return output;
	        
	        
	    }
	    public static void print1ton(int n){
	        if(n==0){
	            return;
	        }
	        System.out.println(n);
	        print1ton(n-1);
	        
	    }
	    public static int fib(int n){
	        if(n==1||n==2){
	            return 1;
	        }
	        int fib_n_1=fib(n-1);
	        int fib_n_2=fib(n-2);
	        int output=fib_n_1+fib_n_2;
	        return output;
	    }
	    */
	    
	    
	
	
	
	 public static boolean isSorted(int a[]){
	        if (a.length == 1){
	            return true;
	        }
	        if (a[0] > a[1]){
	            return false;
	        }
	        int smallArray[] = new int[a.length - 1];
	        for(int i = 1; i < a.length; i++){
	            smallArray[i - 1] = a[i];
	        }
	        boolean isSmallArraySorted = isSorted(smallArray);
	        return isSmallArraySorted;
	    }
	
	 
	 public static boolean isSortedBetter(int a[], int si){
	        if (si == a.length - 1){
	            return true;
	        }
	        if(a[si] > a[si + 1]){
	            return false;
	        }
	        boolean isSmallArraySorted = isSortedBetter(a, si + 1);
	        return isSmallArraySorted;
	    }
	 
	
		 public static void main(String[] args) {
//			    Scanner s = new Scanner(System.in);
//			    int n = s.nextInt();
//			    int ans[] = new int[n];
//			    
//			    for(int i  = 0; i < n; i++)
//			    ans[i] = s.nextInt();
//			 System.out.println(isSorted(ans));
				
			    
			    
			    int arr[] = {1,2,3,4,5};
			    int a2[] = {1, 45, 32, 11};
		 		System.out.println(isSortedBetter(arr,0));
				
	    }
}
	
	
	
	
	
	    /*
	    public static boolean isSorted(int a[]){
	        if (a.length == 1){
	            return true;
	        }
	        if (a[0] > a[1]){
	            return false;
	        }
	        int smallArray[] = new int[a.length - 1];
	        for(int i = 1; i < a.length; i++){
	            smallArray[i - 1] = a[i];
	        }
	        boolean isSmallArraySorted = isSorted(smallArray);
	        return isSmallArraySorted;
	    }
	    
	    public static boolean isSortedBetter(int a[],int si){
	        if(si==a.length-1){
	            return true;
	        }
	        if(a[si]>a[si+1]){
	            return false;
	        }
	        boolean isSmallArraySorted=isSortedBetter(a,si+1);
	        return isSmallArraySorted;
	    }
 public static void main(String[] args){
	        //System.out.println(fact(5));
	        //System.out.println(sumn(4));
	        //print1ton(5);
	       // System.out.println(fib(5));
	        
	    }
}
*/