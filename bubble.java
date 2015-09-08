/*

	Try this 5-1
	
	Demonstrate the Bubble sort.
*/

class Bubble{
	public static void main(String args[]){
	
	int narray[] = { -12,123,2,3,434,0,432,123,2,41};
	
	int a, b, t;
	int size;
	size = 10;
	
	System.out.print("Original Array:");
	for(int i=0; i< size; i++)
		System.out.print(" " + narray[i]);
	System.out.println();
	
	
	//Bubble Sort
	for(a=1; a< size; a++)
		for(b = size -1; b>=a; b--){
			if(narray[b-1] > narray[b]){
				t = narray[b-1];
				narray[b-1] = narray[b];
				narray[b] = t;
			}
		}
	
	System.out.print("Sorted Array:");
		for(int i=0; i< size; i++)
			System.out.print(" " + narray[i]);
		System.out.println();
		
	
	}
}
