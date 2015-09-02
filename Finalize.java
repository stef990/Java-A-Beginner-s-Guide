/*
Script to demonstrate GC in java
*/

class FDemo {
	double x ;
	
	FDemo (double i){
		x = i;
	}
	
	//called when object is recycled
	protected void finalize() {
		System.out.println("Finalizing" + x);
	}
	
	//generates a new object
	void generator(double i){
	FDemo o = new FDemo(i);
	}
	
	}
	
class Finalize{
	public static void main(String args[]){
		double count;
		FDemo ob = new FDemo(0);
		
		for (count=1;count < 1000000000; count++)
		{
			ob.generator(count);
		}
	}
}

