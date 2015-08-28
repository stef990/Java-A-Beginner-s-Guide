/*

Write program to change case of input and count number of changes
*/
class casechange{
	public static void main(String args[])
		throws java.io.IOException{
		int changes = 0;
		System.out.print("Enter '.' to terminate \n");
		char input;
		
		do{
			input = (char) System.in.read();
			if(input >='a' & input <= 'z'){
				input -= 32;
				changes ++;
				System.out.println(input);
				}
			else if (input >='A' & input <= 'Z'){
				input += 32;
				changes ++;
				System.out.println(input);
				}
			
		}
		while(input != '.');
		System.out.print("Number of changes " + changes + "\n");	
		}
	}
