package bitwiseoperators;

public class calculation {

	public static void main(String[] args) {
		
		//  and(&) operator
				int l=0;
	      int m=0;

	      int r=2;
	      int s=1;

	      int p=0;
	      int q=1;

	      int a=1;
	      int b=0;

	      int x = l & m;
	      int y = r & s;
	      int z = p & q;
	      int c = a & b;
//	      System.out.println(x);
//	      System.out.println(y);
//	      System.out.println(z);
	      System.out.println(c);
	}

}   
		 


		//or operator
		/*	int l=0;
	      int m=0;

	      int r=1;
	      int s=1;

	      int p=0;
	      int q=1;

	      int a=1;
	      int b=0;

	      int x = l | m;
	      int y = r | s;
	      int z = p | q;
	      int c = a | b;
	      System.out.println(x);
	      System.out.println(y);
	      System.out.println(z);
	      System.out.println(c);
	}

}                    */

		//  xor ( ^ )  operator
		/*		int l=0;
	      int m=0;

	      int r=1;
	      int s=1;

	      int p=0;
	      int q=1;

	      int a=1;
	      int b=0;

	      int x = l ^ m;
	      int y = r ^ s;
	      int z = p ^ q;
	      int c = a ^ b;
	      System.out.println(x);
	      System.out.println(y);
	      System.out.println(z);
	      System.out.println(c);
	}

}  */
		// NOT OPERATOR
		/*	int a=10;
		  System.out.println(~a);

		}
}
		 */

		// left shft operator
		/*	  int a=10;
		  System.out.println(a<<1);

		}
}
		 */

		//  TRIPLE

		/*	int a=10;
		  System.out.println(a<<3);

		}
}
/*

		// RIGHT SHIFT OPERATOR
	/*	int a=10;
		  System.out.println(a>>1);

		}
}
		 */

		//  RIGHT SHIFT DOUBLE

		/*	int a=10;
		  System.out.println(a>>2);

		}
}
		 */

		//  ASSIGNMENT OPERATOR AS LEFT SHIFT OPERATOR
		/*	int a=10;
		a<<=1;
		System.out.println(a);

	}
}
		 */


	//	Operator Precedence
	/*	Operators	Precedence
		postfix	expr++ expr--
		unary	++expr --expr +expr -expr ~ !
		multiplicative	* / %
		additive	+ -
		shift	<< >> >>>
		relational	< > <= >= instanceof
		equality	== !=
		bitwise AND	&
		bitwise exclusive OR	^
		bitwise inclusive OR	|
		logical AND	&&
		logical OR	||
		ternary	? :
			assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=
*/