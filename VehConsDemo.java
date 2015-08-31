/*

Add constructor

*/

class Vehicle{
	int passengers; //number of passengers
	int fuelcap; //capacity in gallons
	int mpg;
	
	Vehicle (int p, int f, int m){
	passengers = p;
	fuelcap = f;
	mpg = m;
	}
	//Display the range
	int range() {
		return mpg * fuelcap;
	}
	//Compute fuel needed for a given distance
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
}

//This class declares an object of type vehicle/
class VehConsDemo{
	public static void main(String args[]){
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		double gallons;
		int dist = 252;
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go" + dist + "minivan needs " + gallons);
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go" + dist + "sportscar needs " + gallons);
		
	}
	

}