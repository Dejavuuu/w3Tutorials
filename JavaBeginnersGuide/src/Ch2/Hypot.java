package Ch2;
/*
 * Use Pythagorean Theorem to find length of hypotenuse given lengths of two opposing sides
 */
public class Hypot {
	public static void main(String[] args) {
		double x,y,z;
		
		x = 3;
		y = 4;
		
		z = Math.sqrt(x*x + y*y);
		
		System.out.println("Hypotenuse is " + z); //Console: "Hypotenuse is 5.0"
	}
}
