package examples;

public class learnArray {

    public static void main(String[] args) {

        //array

        String[] cars = new String[3];
        
        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        
        //System.out.println(cars[2]);
        
        for(int i = 0; i < cars.length; i++) {
        	
        	System.out.println(cars[i]);
        }
        
    }
}
