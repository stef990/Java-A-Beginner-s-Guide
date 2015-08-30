/*

A program that uses the Vehicle class.

*/

class Vehicle{
	int passengers; //number of passengers
	int fuelcap; //capacity in gallons
	int mpg;
}

//This class declares an object of type vehicle/
class VehicleDemo{
	public static void main(String args[]){
		Vehicle minivan = new Vehicle();
		int range;
		
		//assign valujes to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//compute the range assuming a full tank
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers +
							" with a range of " + range);
	}
	
	
	
}