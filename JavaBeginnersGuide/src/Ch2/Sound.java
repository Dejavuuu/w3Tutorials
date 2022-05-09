package Ch2;

public class Sound {
	
		public static void main(String[] args) {
			
			double soundFeetSecond = 1100; //1100 feet per second sound travels
			double locationSecond = 7.2; //location is 7.2 seconds from initial sound
			double howFarFeet = locationSecond * soundFeetSecond;
			double howFarMiles = howFarFeet / 5280; //turn feet into mi.
			
		System.out.println("If it took " + locationSecond + " seconds for thunder to reach you, "
				+ " then lighting struck " + howFarFeet + " feet or " + howFarMiles + " miles from you."); 	
	}
		
}
