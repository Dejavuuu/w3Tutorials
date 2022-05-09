package w3Tutorials;
/*
A constructor in Java is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created. It can be used
to set initial values for object attributes:
*/

//Create a Main class
	public class learnConstructor {
		int x;  // Create a class attribute
		
		// Create a class constructor for the Main class
		public learnConstructor() {
		 x = 5;  // Set the initial value for the class attribute x
		}
		
		public static void main(String[] args) {
		 learnConstructor myObj = new learnConstructor(); // Create an object of class Main (This will call the constructor)
		 System.out.println(myObj.x); // Print the value of x
		}
	}
		
		//Outputs 5
	
/*
Note that the constructor name must match the class name, and it cannot have a return type (like void).
Also note that the constructor is called when the object is created.
All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. 
However, then you are not able to set initial values for object attributes.
*/