class Prime2to100 {
public static void main(String args[]){
	int x,y;
	boolean isprime;
	for (x=2;x<100;x++){
	isprime=true;
		for (y=2;y<x/y;y++){
			if((x%y)==0){
			isprime=false;
			//System.out.println(x+","+y+","+prime);
			};
		};
		if(isprime==true){
		System.out.println(x + "is prime");
		};
	};
};
}
	