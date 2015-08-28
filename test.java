/*
Use nested loops to find factors of numbers between 2 and 100
*/

class test {
	public static void main(String args[]){
		for (int i=0; i<10; i++){
			System.out.print(" Pre i%2:"+ i%2 + " Pre i:" + i + " ");
			if((i%2)==0) continue;
			System.out.print(" Post i%2:"+ i%2 + " Post i:" + i);
			System.out.println();
		}
	}
}
