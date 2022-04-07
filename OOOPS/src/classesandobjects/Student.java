//------------classes and objects-------------------
//   1
/*
package classesandobjects;

public class Student {

	String name;
	int rollNumber;
}
 */


//2
/*
package classesandobjects;

public class Student {

	String name;
	int rollNumber;
}
 */


//3
/*
package classesandobjects;

public class Student {

	String name;
	String rollNumber;
}
 */




//----------------getters and setters--------------
// contol in hand
/*
package classesandobjects;

public class Student {



	public String name;
	private int rollNumber;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int num) {
		if(num <= 0) {   //control in hand
			return;       //control
		}
		rollNumber = num;
	}
}
 */




// setter
/*
package classesandobjects;

public class Student {

	public String name;
	private int rollNumber;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int num) {

		rollNumber = num;
	}
}
 */



//getter
/*
package classesandobjects;

public class Student {

	public String name;
	private int rollNumber;

	public int getRollNumber() {
		return rollNumber;
	}
}
 */



//-------------------This Keyword-----------------------------

/*
package classesandobjects;

public class Student {

	public String name;
	private int rollNumber;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {            
			return;                     
		}
		rollNumber = rollNumber;
	}
}
 */



//this keyword


/*
package classesandobjects;

public class Student {

	public String name;
	private int rollNumber;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {            
			return;                     
		}
		this.rollNumber = rollNumber;
	}
}
 */



// s1 s2
/*
package classesandobjects;

public class Student {

	public String name;
	private int rollNumber;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {            
			return;                     
		}
		System.out.println("this " + this);
		this.rollNumber = rollNumber;
	}
}

 */

//------------------constructor----------------------------




/*
package classesandobjects;

public class Student {

	public String name;
	private int rollNumber;

	public Student(String n, int num) {
		name = n;
		rollNumber = num;
	}
	public Student(String n) {
		name = n;
	}
	public Student() {
		name = "abc";
		roll Number = 10;
	}
	public void print() {
		System.out.println(name +" "+ rollNumber);
	}
	public int getRollNumber() {
		return this.rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {
			return;
		}
		System.out.println("this " + this);
		this.rollNumber = rollNumber;
	}
}

 */




/*

package classesandobjects;

public class Student {

	public String name;
	private int rollNumber;

	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public Student(String n) {
		name = n;
	}
	public Student() {
		name = "abc";
		roll Number = 10;
	}
	public void print() {
		System.out.println(name +" "+ rollNumber);
	}
	public int getRollNumber() {
		return this.rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {
			return;
		}

		System.out.println("this " + this);
		this.rollNumber = rollNumber;
	}
}
 */



//-----------------------final keyword-------------------------

/*
package classesandobjects;

public class Student {

	public String name;
	final private int rollNumber;
	double cgpa;
	final double conversioFactor = 0.95;

	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
//	public Student(String n) {
//		name = n;
//		rollNumber = 10;
//	}
//	public Student() {
//		name = "abc";
//		roll Number = 10;
//	}
	public void print() {
		System.out.println(name +" "+ rollNumber);
	}
	public int getRollNumber() {
		return this.rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {
			return;
		}

		System.out.println("this " + this);
		this.rollNumber = rollNumber;
	}
}
 */


//-----------------static keyword---------------------------

/*
package classesandobjects;

public class Student {

	public String name;
	final private int rollNumber;
	double cgpa;
	final double conversioFactor = 0.95;
	static int numStudents;
	
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		numStudents++;
	}
	//	public Student(String n) {
	//		name = n;
	//		rollNumber = 10;
	//	}
	//	public Student() {
	//		name = "abc";
	//		roll Number = 10;
	//	}
	public void print() {
		System.out.println(name +" "+ rollNumber);
	}
	public int getRollNumber() {
		return this.rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {
			return;
		}

		System.out.println("this " + this);

	}
}
*/


package classesandobjects;

public class Student {

	public String name;
	final private int rollNumber;
	double cgpa;
	public final static double CONVERSIONFACTOR = 0.95;
	static int numStudents;
	
	public Student(String name) {
		this.name = name;
		this.rollNumber = numStudents;
		numStudents++;
	}
	//	public Student(String n) {
	//		name = n;
	//		rollNumber = 10;
	//	}
		public Student() {
			name = "abc";
			numStudents++;
			this.rollNumber = numStudents;
		}
		public static int getNumStudent() {
	//		System.out.println(rollNumber);
			return numStudents;
		}
		
	public void print() {
		System.out.println(name +" "+ rollNumber);
	}
	public int getRollNumber() {
		return this.rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {
			return;
		}

		System.out.println("this " + this);

	}
}























