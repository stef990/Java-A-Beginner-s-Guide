
/* Try This 4-1
*/

class Help{
	void helpOn (int choice){
		switch(choice){
			case '1':
			System.out.println("The if:\n");
			System.out.println("if(condition) statement;");
			System.out.println("else statement;");
			break;
			case '2':
			System.out.println("The switch:\n");
			System.out.println("switch(expression);");
			System.out.println("case constant;");
			System.out.println("statement sequence;");
			System.out.println("break;");
			System.out.println(" // ...");
			System.out.println("}");
			break;
			case '3':
			System.out.println("The for:\n");
			System.out.println("for(init;condition;iteration)");
			System.out.println("statement;");
			break;
			case '4':
			System.out.println("The while:\n");
			System.out.println("while (condition) statement;");
			case '5':
			System.out.println("The do-while:\n");
			System.out.println("do {");
			System.out.println(" statement;");
			System.out.println("} while (condition);");
			break;
			case '6':
			System.out.println("The break:\n");
			System.out.println("break; or break label;");
			break;
			case '7':
			System.out.println("The continue:\n");
			System.out.println("contine; or continue label;");
			break;
					}
		System.out.println();	
		}
		
	void showMenu(){
		System.out.println("Help on:");
		System.out.println(" 	1. if");
		System.out.println("	2. switch");
		System.out.println("	3. for");
		System.out.println("	4. while");
		System.out.println("	5. do-while");
		System.out.println("	6. break");
		System.out.println("	7. continue");
		System.out.println("Choose one:");	
	}

	boolean isValid (int choice){
		if(choice < '1' | choice > '7' & choice != 'q')return false;
		else return true;
	}
}

class HelpClassDemo{
public static void main(String args[])
	throws java.io.IOException{
	char choice, ignore;
	Help helpobject = new Help();
	
	for(;;){
		do {
		helpobject.showMenu();
		choice = (char) System.in.read();

		do {
			ignore = (char) System.in.read();
			} while(ignore != '\n');
			
		} while( !helpobject.isValid(choice) );
		
		if(choice == 'q') break;
		System.out.println("\n");
		
		helpobject.helpOn(choice);

				}

			}
		}