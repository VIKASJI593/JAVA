package arrays2d;

public class MoreWith2darrays {

	public static void main(String args[]) {



		/*
		int [][] arr = new int[3][5];
		System.out.println(arr[0][0]);
	}
}
		 */

		// row given but column absent
		/*
		int[][] arr=new int[4][];
		System.out.println(arr);
	}
}
		 */
		// null 
		/*	
	int[][] arr=new int[4][];
		System.out.println(arr);


		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
		 */


		// NullPointerException
		/*
		int[][] arr=new int[4][];    // int[][5] not work
		System.out.println(arr);


		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println(arr[0][0]);
	}
}

		 */

		//  int[][5] not work because dont have array of refence so it is not 2d array
		/*
		int[][] arr=new int[][5];    // int[][] not work both are vacant
		System.out.println(arr);


		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println(arr[0][0]);
	}
}	

		 */





		// 0
		/*
		int[][] arr=new int[4][];
		for(int i=0;i<arr.length;i++){
			arr[i] = new int[5];
		}
		System.out.println(arr[0][1]);
	}
}
		 */



		// jagged array


		int[][] arr=new int[4][];
		for(int i=0;i<arr.length;i++){
			arr[i] = new int[i+2];
		}

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}











