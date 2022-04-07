	import java.util.Scanner;

public class calculatingncr {
	
	public static void func(int n)
	{
	    int sum=0;
	    for(int i=1;i<n;i++)
	        {
	            for(;i<n*n;i++)
	            {
	                sum+=i;
	            }
	        }
	    System.out.println(sum);
	}
}
	
	/*
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int r=s.nextInt();
	     int factN=1;
	     for(int i=1;i<=n;i++){
	         factN=factN*i;
	     }
	     int factR=1;
	     for(int i=1;i<=r;i++){
	         factR=factR*i;
	     }
	     int factNR=1;
	     for(int i=1;i<=n-r;i++){
	         factNR=factNR*i;
	     }
	     int result=factN/(factR*factNR);
	     System.out.println(result);
	    }
	}
	

*/
