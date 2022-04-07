//------------classes and objects-------------------


// 1
/*

package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		//Scanner s = new Scanner(source)
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1);
	}
	}
 */	



//2    null 0
/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		//Scanner s = new Scanner(source)
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1);
		System.out.println(s1.name+" "+s1.rollNumber);
	}
}

 */






//3		
/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		//Scanner s = new Scanner(source)
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1);

		s1.name = "Manisha";
		s1.rollNumber = "10";

		System.out.println(s1.name+" "+s1.rollNumber);

		s2.name = "Ankush";
		s2.rollNumber = "50";
		System.out.println(s2.name+" "+s2.rollNumber);
		//System.out.println(s1.rollNumber);
	}

}
 */




//----------------getters and setters--------------


/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {



		//Scanner s = new Scanner(source)
		Student s1 = new Student();
		//Student s2 = new Student();
		System.out.println(s1);
		s1.name = "Manisha";
		//s1.rollNumber = "10";
		s1.setRollNumber(-100);
		System.out.println(s1.name+" "+s1.getRollNumber());

//		s2.name = "Ankush";
//		s2.rollNumber = "50";
//		System.out.println(s2.name+" "+s2.rollNumber);
		//System.out.println(s1.rollNumber);
	}

}
 */




// setter
/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		Student s1 = new Student();

		System.out.println(s1);
		s1.name = "Manisha";

		s1.setRollNumber(100);
		System.out.println(s1.name+" "+s1.getRollNumber());
	}
}
 */

//getters
/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		Student s1 = new Student();

		System.out.println(s1);
		s1.name = "Manisha";

		System.out.println(s1.name+" "+s1.getRollNumber());
	}
}
 */



//-------------------This Keyword-----------------------------
//same as geters setters control in hand
/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Manisha";
		s1.setRollNumber(100);
		System.out.println(s1.name+" "+s1.getRollNumber());
	}
}

 */



//this keyword
/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Manisha";
		s1.setRollNumber(100);
		System.out.println(s1.name+" "+s1.getRollNumber());
	}
}
 */





/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Manisha";
		System.out.println("s1 " + s1);
		s1.setRollNumber(100);
		System.out.println(s1.name+" "+s1.getRollNumber());
	}
}

 */





// s1 s2
/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Manisha";
		System.out.println("s1 " + s1);
		s1.setRollNumber(100);
		System.out.println(s1.name+" "+s1.getRollNumber());

		Student s2 = new Student();	
		System.out.println("s2 " +s2);
		s2.setRollNumber(100);
	}
}

 */


//-----------------constructor same for both case-----------
/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		Student s1 = new Student("Manisha",50);
		s1.print();

		Student s2 = new Student("Ankush");
		s2.print();

	}
}
*/


//-----------------------final keyword-------------------------

/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {

		Student s1 = new Student("Manisha",50);
		s1.print();

		Student s2 = new Student("Ankush");
		s2.print();

	}
}
*/


//-----------------static keyword---------------------------

/*
package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		System.out.println(Student.numStudents);
		Student s1 = new Student("Manisha",50);
		
		Student s2 = new Student("Ankush",125);
		
		Student s3 = new Student("Ankush",125);
		
		System.out.println(s1.numStudents);
		System.out.println(s2.numStudents);
		
		

	}
}
*/


package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		System.out.println(Student.getNumStudent());
		//System.out.println(Student.name);
		
		Student s1 = new Student("Manisha");
		
		Student s2 = new Student("Ankush");
		
//		Student s3 = new Student("Ankush",125);
//		
//		System.out.println(s1.getNumStudent);
//		System.out.println(s2.getNumStudent);
		
		

	}
}









