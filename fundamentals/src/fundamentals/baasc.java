import java.util.Scanner;
package fundamentals;

public class baasc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
			
	        int i = 2;
			
			while(i <= n / 2) { 
	            if (n % i == 0) {
			
					System.out.format(i+ " ");
				}
	        i += 1;
			}
		}
	}
 