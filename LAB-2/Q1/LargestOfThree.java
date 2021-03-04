//Finding the largest of 3 numbers

class LargestOfThree{
	public static void main(String args[]){
		int x=10, y=7, z=12;
		if(x>y){
			if(x>z)
				System.out.println(x+" is the largest number.");
			else
				System.out.println(z+" is the largest number.");
			}
		else{
			if(y>z)
				System.out.println(y+" is the largest number.");
			else
				System.out.println(z+" is the largest number.");
		}
	}
}