/*

A program that uses the Vehicle class.

*/

class Vehicle{
	int passengers; //number of passengers
	int fuelcap; //capacity in gallons
	int mpg;
	int range(){
		return fuelcap * mpg;
	}
}

//This class declares an object of type vehicle/
class RetMethod{
	public static void main(String args[]){
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		int range1, range2;
		
		//assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//assign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		

		range1 = minivan.range();
		range2 = sportscar.range();
		System.out.println("Minivan can carry " + minivan.passengers + "with range of " + 
		range1 + "Miles");
		System.out.println("Sportscar can carry " + sportscar.passengers + "with range of " + 
		range2 + "Miles");
	}
	
	
	
}