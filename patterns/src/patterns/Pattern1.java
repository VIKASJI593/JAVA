package patterns;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {


		/*	
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sum = 0, rev, tn = n;

        while(tn>0){
            rev = tn%10;
            sum = sum*10 + rev;
            tn/=10;
        }
        if(n==sum){
            System.out.print(true);
        }else{System.out.print(false);}

	}
}
		 */



		/*
//test 1 armstrong
		 Scanner s=new Scanner(System.in);
	        int N = s.nextInt();
	        int count=0;
	 int rem=0;
	        int i;
	          double power=0;
	       int temp=N;
	        while(temp!=0)
	        {

	            temp=temp/10;
	            count++;
	        }

	       int k=N;
	        for(i=1;i<=count ;i++)
	        {
	            rem=k%10;
	            power=power+Math.pow(rem,count);
	            k=k/10;
	        }
	        if((int)power==N)
	        {
	            System.out.println("true");
	        }
	        else
	            System.out.println("false");

	}


		 */ 




		// 2  zeros


		/*	Scanner s=new Scanner(System.in);
        int n=s.nextInt();

    int k,l;  
    for(k=1;k<=n;k++){ 
      for(l=1;l<=n;l++){
          if(k==l)  
             System.out.print("*");  
            else  
           System.out.print("0");  
      }  
      l--;  
       System.out.print("*");  
      while(l>=1){ 
          if(k==l)  
           System.out.print("*");  
          else  
           System.out.print("0");  
          l--;  
      }  
    System.out.println("");  
  }  
         }  
}  

		 */



		// 3  sta pattern


		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a,b;  
		for(a=1;a<=n;a++){  
			for(b=n;b>=1;b--){  
				if(b!=a)  
					System.out.print(b);  
				else  
					System.out.print("*");  
			}   
			System.out.println("");  
		}  
	}  


}



/*		Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++)
        {
                     for(int j=0;j<N;j++)
                    {
                        System.out.print(N);
                    }   
        System.out.println("");
        }


	}

}
 */
//  star pattern
/*	int n=s.nextInt();
	     int i=1;
	     while(i<=n){
	         int j=1;
	         while(j<=n){
	             System.out.print('*');
	             j=j+1;
	         }
	         System.out.println();
	         i=i+1;
	     }
	    }
	}

 */
//    1st pattern
/*	int n=s.nextInt();
	     int i=1;
	     while(i<=n){
	         int j=1;
	         while(j<=n){
	             System.out.print(i);
	             j=j+1;
	         }
	         System.out.println();
	         i=i+1;
	     }
	    }
	}         */

//    2nd pattern
/*	int n=s.nextInt();
	     int i=1;
	     while(i<=n){
	         int j=1;
	         while(j<=n){
	             System.out.print(j);
	             j=j+1;
	         }
	         System.out.println();
	         i=i+1;
	     }
	    }
	}               */

// 3rd pattern
/*	int n=s.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n){
				System.out.print(n-j+1);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}
}
 */

