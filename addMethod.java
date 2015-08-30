/*

A program that uses the Vehicle class.

*/

class Vehicle{
	int passengers; //number of passengers
	int fuelcap; //capacity in gallons
	int mpg;
	//Display the range
	void range() {
		System.out.println("Range is " + fuelcap * mpg);
	}
}

//This class declares an object of type vehicle/
class addMethod{
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
		
		System.out.println("Minivan can carry " + minivan.passengers);
		minivan.range();
		sportscar.range();
		
	}
	
	
	
}