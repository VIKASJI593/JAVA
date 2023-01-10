/*
package inheritance;

public class Vehicle {

	String color;
	int maxSpeed;

	public void print() {
		System.out.println("Vehicle " + " color " + color +" maxSpeed " + maxSpeed);
	}

}
 */



//--------------------Inheritance and private members---------------------------------------------



/*
package inheritance;

public class Vehicle {

	String color;
	int maxSpeed;

	public void print() {
		System.out.println("Vehicle " + " color " + color +" maxSpeed " + maxSpeed);
	}

}
 */


//getter setter

/*
package inheritance;

public class Vehicle {

	private String color;
	int maxSpeed;

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
	this.color = color;
	}

	public void print() {
		System.out.println("Vehicle " + " color " + color +" maxSpeed " + maxSpeed);
	}

}
 */



// --------------------------------protected------------------------------------

/*
package inheritance;

public class Vehicle {

	private String color;
	//public int maxSpeed;
	protected int maxSpeed;

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
	this.color = color;
	}

	public void print() {
		System.out.println("Vehicle " + " color " + color +" maxSpeed " + maxSpeed);
	}

}

 */


//-----------------------------super-------------------------------------------------


/*
package inheritance;

public class Vehicle {

	private String color;
	//public int maxSpeed;
	protected int maxSpeed;

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
	this.color = color;
	}

	public void print() {
		System.out.println("Vehicle " + " color " + color +" maxSpeed " + maxSpeed);
	}

}

 */


/*
package inheritance;

public class Vehicle {

	private String color;

	protected int maxSpeed;

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
	this.color = color;
	}

	public void print() {
		System.out.println("Vehicle " + " color " + color +" maxSpeed " + maxSpeed);
	}

}

 */










//----------------------------Inheritance and Constructors------------------------


/*
package inheritance;

public class Vehicle {

	private String color;
	protected int maxSpeed;

	public Vehicle() {
		System.out.println("Vehicle`s Constructor");
	}
	
	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.println("Vehicle " + " color " + color +" maxSpeed " + maxSpeed);
	}

}

*/


/*
package inheritance;

public class Vehicle {

	private String color;
	protected int maxSpeed;

	public Vehicle() {
		System.out.println("Vehicle`s Constructor");
	}
	
	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.println("Vehicle " + " color " + color +" maxSpeed " + maxSpeed);
	}

}
*/




package inheritance;

public class Vehicle {

	private String color;
	protected int maxSpeed;

	public Vehicle(int maxSpeed) {
		System.out.println("Vehicle`s Constructor");
		this.maxSpeed = maxSpeed;
	}
	
	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.println("Vehicle " + " color " + color +" maxSpeed " + maxSpeed);
	}

}