
/*
  package inheritance;

public class car extends Vehicle {

//	String color;
//	int maxSpeed;
	int numDoors;
}
 */


//--------------------Inheritance and private members---------------------------------------------

/*
package inheritance;

public class car extends Vehicle {

//	String color;
//	int maxSpeed;
	int numDoors;
	public void printcar() {


	System.out.println("car " + " color " + color +" maxSpeed " + maxSpeed + " numDoors " + numDoors);
}
}

 */






// getters setters
/*
package inheritance;

public class car extends Vehicle {

//	String color;
//	int maxSpeed;
	int numDoors;
	public void printcar() {


	System.out.println("car " + " color " + getcolor() +" maxSpeed " + maxSpeed + " numDoors " + numDoors);
}
}

 */



// --------------------------------protected------------------------------------


/*
package inheritance;

public class car extends Vehicle {

//	String color;
//	int maxSpeed;
	int numDoors;
	public void printcar() {


	System.out.println("car " + " color " + getcolor() +" maxSpeed " + maxSpeed + " numDoors " + numDoors);
}
}

 */




//-----------------------------super-------------------------------------------------
/*
package inheritance;

public class car extends Vehicle {

//	String color;
//	int maxSpeed;
	int numDoors;
	public void print() {
	super.print();	

	System.out.println("car " +  " numDoors " + numDoors);
}
}
 */







//----------------------------Inheritance and Constructors------------------------

/*
package inheritance;

public class car extends Vehicle {

//	String color;

	int numDoors;
	int maxSpeed;

	//public String color;

	public car() {
		System.out.println("car`s Constructor");
	}

	public void print() {
	super.print();	

	System.out.println("car " +  " numDoors " + numDoors);
}
	public void printmaxSpeed() {
		super.maxSpeed = 150;
		System.out.println(maxSpeed + " " + super.maxSpeed);

	}
}
 */



/*
package inheritance;

public class car extends Vehicle {


	int numDoors;
	//int maxSpeed;


	public car(int numDoors) {
		//super(100);
		System.out.println("car`s Constructor");
		this.numDoors = numDoors;
	}

	public void print() {
		super.print();	
		System.out.println("car " +  " numDoors " + numDoors);
	}
	public void printmaxSpeed() {
		super.maxSpeed = 150;
		System.out.println(maxSpeed + " " + super.maxSpeed);

	}
}

*/




package inheritance;

public class car extends Vehicle {


	int numDoors;
	//int maxSpeed;


	public car(int numDoors) {
		super(100);
		System.out.println("car`s Constructor");
		this.numDoors = numDoors;
	}

	public void print() {
		super.print();	
		System.out.println("car " +  " numDoors " + numDoors);
	}
	public void printmaxSpeed() {
		super.maxSpeed = 150;
		System.out.println(maxSpeed + " " + super.maxSpeed);

	}
}











