//I have added through git
//Implementing a command line calculator

class CmdLine{
	public static void main(String args[]){
		float x = Integer.parseInt(args[0]), y = Integer.parseInt(args[2]);
		float z;
		char c = args[1].charAt(0);
		if(c=='+'){
			z = x+y;
			System.out.println("Sum = "+z);			
		}
		else if(c=='-'){
			z = x - y;
			System.out.println("Difference = "+z);
		}
		else if(c=='/'){
			z = x/y;
			System.out.println("Quotient = "+z);
			}
		else if(c=='X'){
			z = x*y;
			System.out.println("Product = "+z);
		}
	}
}