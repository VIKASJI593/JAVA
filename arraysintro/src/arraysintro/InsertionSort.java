package arraysintro;
import java.util.Scanner;

public class InsertionSort {

	 public static void main(String... args){
         try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            int arr[] = new int[N];
            int i=0;
            System.out.println("Enter Array: ");
            for(i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            sort012( arr , N);
            System.out.println("Sorted without sorting :");
            for(i= 0; i < N; i++){
                System.out.println(arr[i]);
            }
         }

    }
    private static void sort012(int a[], int n)
    {
        int c [] = {0,0,0};
        // code here 
        for(int i =0; i< n ; i++){
            if(a[i]==0)
                c[0]++;
            else if(a[i]==1)
                c[1]++;
            else if(a[i]==2)
                c[2]++;
        }
        for(int i=0,j=0 ; j<3;j++){
        while(c[j]-->0)    
            a[i++]=j;
        }
    }
}
	  
	
/*	public static void printArray(int[]arr){
	    int n=arr.length;
	    for(int i=0;i<n;i++){
	        System.out.println(arr[i]);
	    }
	}
	public static void insertionSort(int[] arr){
	    int n=arr.length;
	    for(int i=1;i<n;i++){
	        //Insert ith element in sorted position
	        int j=i-1;
	        int temp=arr[i];
	        while(j>=0 && arr[j]>temp){
	            arr[j+1]=arr[j];
	            j--;
	        }
	        //Position will be j+1;
	        arr[j+1]=temp;
	        
	       
	    }
	}
	    
	public static void main(String args[]) {
	    int[] arr={9,6,3,7,2,8,1,5};
	    insertionSort(arr);
	    printArray(arr);
	    }
	}

*/


