package Ch2;
//Demonstrate boolean values
public class BoolDemo {
	public static void main(String[] args) {
		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		b = true;
		System.out.println("b is " + b);
		
		//bool value can control if statement
		if(b) System.out.println("This is executed");
		
		b = false;
		if(b) System.out.println("This is not executed.");
		
		//outcome of relational operator is bool value
		System.out.println("10 > 9 is " + (10 > 9));
	}
}
