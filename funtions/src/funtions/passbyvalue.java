package funtions;
 import com.sun.org.apache.xml.intrnal.dtm.ref.IncrementalSAXsource;
public class passbyvalue {

/*	public static int sum (int a , int b){
		int result =a+b;
		return result;
	}
	public static void increement(int n){
		n++;
	}
	public static void main(String args[]) {
		int n=10;
		increement (n);
		System.out.println(n);
	}

	}

*/
		
	
	// increement main
	
		public static int sum (int a , int b){
			int result =a+b;
			return result;
		}
		public static void increement(int n){
			n++;
			System.out.println("increement" +n);
		}
		public static void main(String args[]) {
			int n=10;
			increement (n);
			System.out.println( "main " + n);


	}

}


