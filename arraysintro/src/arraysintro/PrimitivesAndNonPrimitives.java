package arraysintro;
//import java.util.Scanner;

public class PrimitivesAndNonPrimitives {

	/* public static void increment(int i){
	        i++;
	    }
	    public static void printArray(int[]arr){
	        int n=arr.length;
	        for(int i=0;i<n;i++){
	            System.out.println(arr[i]);
	        }
	    }

	   public static void incrementArray(int[] arr){
	       for(int i=0;i<arr.length;i++){
	           arr[i]=arr[i]+1;
	       }
	   }
	    
	public static void main(String args[]) {
	     //int i=10;
	     //increment(i);
	     //System.out.println(i);
	     int[] arr={1,2,3,4,5};
	     incrementArray(arr);
	     printArray(arr);
	    }
	}
	
	*/
	
	
	
	// increement
/*	
	public static void increment(int i){
        i++;
	}
	public static void main(String args[]) {
	     int i=10;
	     increment(i);
	     System.out.println(i);
	    
	    }
	}
	
	*/
	
	
	// result 23456
	/*
	 public static void increment(int i){
	        i++;
	    }
	    public static void printArray(int[]arr){
	        int n=arr.length;
	        for(int i=0;i<n;i++){
	            System.out.println(arr[i]);
	        }
	    }

	   public static void incrementArray(int[] arr){
	      
	       for(int i=0;i<arr.length;i++){
	           arr[i]=arr[i]+1;
	       }
	   }
	    
	public static void main(String args[]) {
	     
	     int[] arr={1,2,3,4,5};
	     incrementArray(arr);
	     printArray(arr);
	    }
	}
	
	*/
	
	
	
	
	
	
	
	// result     [I@515f550a   [I@515f550a   23456
	
	
	public static void increment(int i){
        i++;
    }
    public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

 /*  public static void incrementArray(int[] input){
       System.out.println(input);                     // remove result 23456
   
       for(int i=0;i<input.length;i++){
           input[i]=input[i]+1;
       }
   }
    
public static void main(String args[]) {
     
     int[] arr={1,2,3,4,5};
     System.out.println(arr);                       //remove result 23456
     incrementArray(arr);
     printArray(arr);
    }
}

*/
    
    
    
  /*  
    public static void increment(int i){
        i++;
    }
    public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

   public static void incrementArray(int[] input){
      // System.out.println(input);
       input=new int[7];
       for(int i=0;i<input.length;i++){
           input[i]=input[i]+1;
       }
   }
    
public static void main(String args[]) {
     //int i=10;
     //increment(i);
     //System.out.println(i);
     int[] arr={1,2,3,4,5};
     incrementArray(arr);
     printArray(arr);
    }
}
    
    */
    
    

/*
    public static void increment(int i){
        i++;
    }
    public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

   public static int[] incrementArray(int[] input){
      // System.out.println(input);
       input=new int[7];
       for(int i=0;i<input.length;i++){
           input[i]=input[i]+1;
       }
       return input;
   }
    
public static void main(String args[]) {
     //int i=10;
     //increment(i);
     //System.out.println(i);
     int[] arr={1,2,3,4,5};
     arr=incrementArray(arr);
     printArray(arr);
    }
}

*/

    public static void change(int input[]){
        input = new int[5];
        input[0] = 15;
        }

        public static void main(String args[]){
            int arr[] = new int[5];
            change(arr);
            System.out.println(arr[0]);
        }
    }







