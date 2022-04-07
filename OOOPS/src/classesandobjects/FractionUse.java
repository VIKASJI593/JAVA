/*
package classesandobjects;

public class FractionUse {

	public static void main(String[] args) {


		Fraction f1 = new Fraction(4,6);
		f1.print();

	}
}
 */

// increment   2/3+1
/*
package classesandobjects;

public class FractionUse {

	public static void main(String[] args) {

		Fraction f1 = new Fraction(4,6);
		f1.print();

//		f1.setnumerator(12);
//		f1.getnumerator();

		f1.increment();
		f1.print();
	}
}

 */





/*
package classesandobjects;

public class FractionUse {

	public static void main(String[] args) {

		Fraction f1 = new Fraction(4,6);
		//f1.print();

		//		f1.setnumerator(12);
		//		f1.getnumerator();

		//f1.increment();
		f1.print();

		Fraction f2 = new Fraction(4,8);
		f1.add(f2);
		f1.print();


	}
}
*/








package classesandobjects;

public class FractionUse {

	public static void main(String[] args) {

		Fraction f1 = new Fraction(4,6);
		//f1.print();

//		f1.setnumerator(12);
//		f1.getnumerator();

		//f1.increment();
		f1.print();

		Fraction f2 = new Fraction(4,8);
//		f1.add(f2);
//		f1.print();

		Fraction f3 = Fraction.add(f1, f2);
		f3.print();
	}
}
 







